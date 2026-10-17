package androidx.camera.core.imagecapture;

import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import androidx.camera.core.CameraXTracer;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.imagecapture.Bitmap2JpegBytes;
import androidx.camera.core.imagecapture.DngImage2Disk;
import androidx.camera.core.imagecapture.Image2JpegBytes;
import androidx.camera.core.imagecapture.JpegBytes2Disk;
import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.internal.compat.quirk.DeviceQuirks;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.processing.Edge;
import androidx.camera.core.processing.InternalImageProcessor;
import androidx.camera.core.processing.Operation;
import androidx.camera.core.processing.Packet;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes15.dex */
public class ProcessingNode {
    private Operation<Bitmap2JpegBytes.In, Packet<byte[]>> mBitmap2JpegBytes;
    private Operation<Packet<Bitmap>, Packet<Bitmap>> mBitmapEffect;
    final Executor mBlockingExecutor;
    private final CameraCharacteristics mCameraCharacteristics;
    DngImage2Disk mDngImage2Disk;
    private final boolean mHasIncorrectJpegMetadataQuirk;
    private Operation<Packet<ImageProxy>, Bitmap> mImage2Bitmap;
    private Operation<Image2JpegBytes.In, Packet<byte[]>> mImage2JpegBytes;
    final InternalImageProcessor mImageProcessor;
    private Operation<InputPacket, Packet<ImageProxy>> mInput2Packet;
    private In mInputEdge;
    private Operation<Packet<byte[]>, Packet<Bitmap>> mJpegBytes2CroppedBitmap;
    private Operation<JpegBytes2Disk.In, ImageCapture.OutputFileResults> mJpegBytes2Disk;
    private Operation<Packet<byte[]>, Packet<ImageProxy>> mJpegBytes2Image;
    private Operation<Packet<ImageProxy>, ImageProxy> mJpegImage2Result;
    private final Quirks mQuirks;

    public static abstract class In {
        public static In of(int i, List<Integer> list) {
            return new AutoValue_ProcessingNode_In(new Edge(), new Edge(), i, list);
        }

        public abstract Edge<InputPacket> getEdge();

        public abstract int getInputFormat();

        public abstract List<Integer> getOutputFormats();

        public abstract Edge<InputPacket> getPostviewEdge();
    }

    public static abstract class InputPacket {
        public static InputPacket of(ProcessingRequest processingRequest, ImageProxy imageProxy) {
            return new AutoValue_ProcessingNode_InputPacket(processingRequest, imageProxy);
        }

        public abstract ImageProxy getImageProxy();

        public abstract ProcessingRequest getProcessingRequest();
    }

    public ProcessingNode(Executor executor, CameraCharacteristics cameraCharacteristics, InternalImageProcessor internalImageProcessor) {
        this(executor, cameraCharacteristics, internalImageProcessor, DeviceQuirks.getAll());
    }

    private Packet<byte[]> cropAndMaybeApplyEffect(Packet<byte[]> packet, int i) throws ImageCaptureException {
        Preconditions.checkState(ImageUtil.isJpegFormats(packet.getFormat()));
        Packet<Bitmap> packetApply = this.mJpegBytes2CroppedBitmap.apply(packet);
        Operation<Packet<Bitmap>, Packet<Bitmap>> operation = this.mBitmapEffect;
        if (operation != null) {
            packetApply = operation.apply(packetApply);
        }
        return this.mBitmap2JpegBytes.apply(Bitmap2JpegBytes.In.of(packetApply, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$processInputPacket$6(InputPacket inputPacket) {
        ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        try {
            boolean z = true;
            if (this.mInputEdge.getOutputFormats().size() <= 1) {
                z = false;
            }
            if (inputPacket.getProcessingRequest().isInMemoryCapture()) {
                CameraXExecutors.mainThreadExecutor().execute(new a4.a(processingRequest, processInMemoryCapture(inputPacket), 23));
                return;
            }
            ImageCapture.OutputFileResults outputFileResultsProcessOnDiskCapture = processOnDiskCapture(inputPacket);
            if (!z || processingRequest.getTakePictureRequest().isFormatProcessedInSimultaneousCapture()) {
                CameraXExecutors.mainThreadExecutor().execute(new a4.a(processingRequest, outputFileResultsProcessOnDiskCapture, 24));
            }
        } catch (ImageCaptureException e) {
            sendError(processingRequest, e);
        } catch (OutOfMemoryError e2) {
            sendError(processingRequest, new ImageCaptureException(0, "Processing failed due to low memory.", e2));
        } catch (RuntimeException e4) {
            sendError(processingRequest, new ImageCaptureException(0, "Processing failed.", e4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$1(InputPacket inputPacket) {
        if (inputPacket.getProcessingRequest().isAborted()) {
            inputPacket.getImageProxy().close();
        } else {
            this.mBlockingExecutor.execute(new e(this, inputPacket, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$3(InputPacket inputPacket) {
        if (!inputPacket.getProcessingRequest().isAborted()) {
            this.mBlockingExecutor.execute(new e(this, inputPacket, 0));
        } else {
            Logger.w("ProcessingNode", "The postview image is closed due to request aborted");
            inputPacket.getImageProxy().close();
        }
    }

    private ImageCapture.OutputFileResults saveJpegToDisk(Packet<ImageProxy> packet, ImageCapture.OutputFileOptions outputFileOptions, int i) throws ImageCaptureException {
        Packet<byte[]> packetApply = this.mImage2JpegBytes.apply(Image2JpegBytes.In.of(packet, i));
        if (packetApply.hasCropping() || this.mBitmapEffect != null) {
            packetApply = cropAndMaybeApplyEffect(packetApply, i);
        }
        Operation<JpegBytes2Disk.In, ImageCapture.OutputFileResults> operation = this.mJpegBytes2Disk;
        Objects.requireNonNull(outputFileOptions);
        return operation.apply(JpegBytes2Disk.In.of(packetApply, outputFileOptions));
    }

    private ImageCapture.OutputFileResults saveRawToDisk(Packet<ImageProxy> packet, ImageCapture.OutputFileOptions outputFileOptions) throws ImageCaptureException {
        if (this.mDngImage2Disk == null) {
            if (this.mCameraCharacteristics == null) {
                throw new ImageCaptureException(0, "CameraCharacteristics is null, DngCreator cannot be created", null);
            }
            if (packet.getCameraCaptureResult().getCaptureResult() == null) {
                throw new ImageCaptureException(0, "CameraCaptureResult is null, DngCreator cannot be created", null);
            }
            CameraCharacteristics cameraCharacteristics = this.mCameraCharacteristics;
            Objects.requireNonNull(cameraCharacteristics);
            CaptureResult captureResult = packet.getCameraCaptureResult().getCaptureResult();
            Objects.requireNonNull(captureResult);
            this.mDngImage2Disk = new DngImage2Disk(cameraCharacteristics, captureResult);
        }
        DngImage2Disk dngImage2Disk = this.mDngImage2Disk;
        ImageProxy data = packet.getData();
        int rotationDegrees = packet.getRotationDegrees();
        Objects.requireNonNull(outputFileOptions);
        return dngImage2Disk.apply(DngImage2Disk.In.of(data, rotationDegrees, outputFileOptions));
    }

    private void sendError(ProcessingRequest processingRequest, ImageCaptureException imageCaptureException) {
        CameraXExecutors.mainThreadExecutor().execute(new a4.a(processingRequest, imageCaptureException, 25));
    }

    public ImageProxy processInMemoryCapture(InputPacket inputPacket) throws ImageCaptureException {
        Logger.d("ProcessingNode", "processInMemoryCapture: request ID = " + inputPacket.getProcessingRequest().getRequestId());
        ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        Packet<ImageProxy> packetApply = this.mInput2Packet.apply(inputPacket);
        List<Integer> outputFormats = this.mInputEdge.getOutputFormats();
        Preconditions.checkArgument(!outputFormats.isEmpty());
        int iIntValue = outputFormats.get(0).intValue();
        if ((packetApply.getFormat() == 35 || this.mBitmapEffect != null || this.mHasIncorrectJpegMetadataQuirk) && iIntValue == 256) {
            Packet<byte[]> packetApply2 = this.mImage2JpegBytes.apply(Image2JpegBytes.In.of(packetApply, processingRequest.getJpegQuality()));
            if (this.mBitmapEffect != null) {
                packetApply2 = cropAndMaybeApplyEffect(packetApply2, processingRequest.getJpegQuality());
            }
            packetApply = this.mJpegBytes2Image.apply(packetApply2);
        }
        ImageProxy imageProxyApply = this.mJpegImage2Result.apply(packetApply);
        if (outputFormats.size() > 1) {
            processingRequest.getTakePictureRequest().markFormatProcessStatusInSimultaneousCapture(imageProxyApply.getFormat(), true);
        }
        return imageProxyApply;
    }

    /* JADX INFO: renamed from: processInputPacket, reason: merged with bridge method [inline-methods] */
    public void lambda$transform$0(InputPacket inputPacket) {
        CameraXTracer.trace("processInputPacket", new e(this, inputPacket, 2));
    }

    public ImageCapture.OutputFileResults processOnDiskCapture(InputPacket inputPacket) throws ImageCaptureException {
        Logger.d("ProcessingNode", "processOnDiskCapture: request ID = " + inputPacket.getProcessingRequest().getRequestId());
        List<Integer> outputFormats = this.mInputEdge.getOutputFormats();
        Preconditions.checkArgument(outputFormats.isEmpty() ^ true);
        boolean z = false;
        Integer num = outputFormats.get(0);
        int iIntValue = num.intValue();
        Preconditions.checkArgument(ImageUtil.isJpegFormats(iIntValue) || ImageUtil.isRawFormats(iIntValue), "On-disk capture only support JPEG and JPEG/R and RAW output formats. Output format: " + num);
        ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        Preconditions.checkArgument(processingRequest.getOutputFileOptions() != null, "OutputFileOptions cannot be empty");
        Packet<ImageProxy> packetApply = this.mInput2Packet.apply(inputPacket);
        if (outputFormats.size() <= 1) {
            if (iIntValue != 32) {
                ImageCapture.OutputFileOptions outputFileOptions = processingRequest.getOutputFileOptions();
                Objects.requireNonNull(outputFileOptions);
                return saveJpegToDisk(packetApply, outputFileOptions, processingRequest.getJpegQuality());
            }
            ImageCapture.OutputFileOptions outputFileOptions2 = processingRequest.getOutputFileOptions();
            Objects.requireNonNull(outputFileOptions2);
            return saveRawToDisk(packetApply, outputFileOptions2);
        }
        if (processingRequest.getOutputFileOptions() != null && processingRequest.getSecondaryOutputFileOptions() != null) {
            z = true;
        }
        Preconditions.checkArgument(z, "The number of OutputFileOptions for simultaneous capture should be at least two");
        if (packetApply.getFormat() != 32) {
            ImageCapture.OutputFileOptions secondaryOutputFileOptions = processingRequest.getSecondaryOutputFileOptions();
            Objects.requireNonNull(secondaryOutputFileOptions);
            ImageCapture.OutputFileResults outputFileResultsSaveJpegToDisk = saveJpegToDisk(packetApply, secondaryOutputFileOptions, processingRequest.getJpegQuality());
            processingRequest.getTakePictureRequest().markFormatProcessStatusInSimultaneousCapture(256, true);
            return outputFileResultsSaveJpegToDisk;
        }
        ImageCapture.OutputFileOptions outputFileOptions3 = processingRequest.getOutputFileOptions();
        Objects.requireNonNull(outputFileOptions3);
        ImageCapture.OutputFileResults outputFileResultsSaveRawToDisk = saveRawToDisk(packetApply, outputFileOptions3);
        processingRequest.getTakePictureRequest().markFormatProcessStatusInSimultaneousCapture(32, true);
        return outputFileResultsSaveRawToDisk;
    }

    /* JADX INFO: renamed from: processPostviewInputPacket, reason: merged with bridge method [inline-methods] */
    public void lambda$transform$2(InputPacket inputPacket) {
        ProcessingRequest processingRequest = inputPacket.getProcessingRequest();
        try {
            Packet<ImageProxy> packetApply = this.mInput2Packet.apply(inputPacket);
            int format = packetApply.getFormat();
            Preconditions.checkArgument(format == 35 || format == 256 || format == 4101, "Postview only supports to convert YUV, JPEG and JPEG_R format image to the postview output bitmap. Image format: " + format);
            CameraXExecutors.mainThreadExecutor().execute(new a4.a(processingRequest, this.mImage2Bitmap.apply(packetApply), 22));
        } catch (Exception e) {
            inputPacket.getImageProxy().close();
            Logger.e("ProcessingNode", "process postview input packet failed.", e);
        }
    }

    public void release() {
    }

    public Void transform(In in10) {
        this.mInputEdge = in10;
        final int i = 0;
        in10.getEdge().setListener(new Consumer(this) { // from class: androidx.camera.core.imagecapture.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProcessingNode f6860b;

            {
                this.f6860b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj2) {
                switch (i) {
                    case 0:
                        this.f6860b.lambda$transform$1((ProcessingNode.InputPacket) obj2);
                        break;
                    default:
                        this.f6860b.lambda$transform$3((ProcessingNode.InputPacket) obj2);
                        break;
                }
            }
        });
        final int i2 = 1;
        in10.getPostviewEdge().setListener(new Consumer(this) { // from class: androidx.camera.core.imagecapture.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProcessingNode f6860b;

            {
                this.f6860b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj2) {
                switch (i2) {
                    case 0:
                        this.f6860b.lambda$transform$1((ProcessingNode.InputPacket) obj2);
                        break;
                    default:
                        this.f6860b.lambda$transform$3((ProcessingNode.InputPacket) obj2);
                        break;
                }
            }
        });
        this.mInput2Packet = new ProcessingInput2Packet();
        this.mImage2JpegBytes = new Image2JpegBytes(this.mQuirks);
        this.mJpegBytes2CroppedBitmap = new JpegBytes2CroppedBitmap();
        this.mBitmap2JpegBytes = new Bitmap2JpegBytes();
        this.mJpegBytes2Disk = new JpegBytes2Disk();
        this.mJpegImage2Result = new JpegImage2Result();
        this.mImage2Bitmap = new Image2Bitmap();
        if (in10.getInputFormat() == 35 || this.mImageProcessor != null || this.mHasIncorrectJpegMetadataQuirk) {
            this.mJpegBytes2Image = new JpegBytes2Image();
        }
        InternalImageProcessor internalImageProcessor = this.mImageProcessor;
        if (internalImageProcessor == null) {
            return null;
        }
        this.mBitmapEffect = new BitmapEffect(internalImageProcessor);
        return null;
    }

    public ProcessingNode(Executor executor, CameraCharacteristics cameraCharacteristics, InternalImageProcessor internalImageProcessor, Quirks quirks) {
        if (DeviceQuirks.get(LowMemoryQuirk.class) != null) {
            this.mBlockingExecutor = CameraXExecutors.newSequentialExecutor(executor);
        } else {
            this.mBlockingExecutor = executor;
        }
        this.mImageProcessor = internalImageProcessor;
        this.mCameraCharacteristics = cameraCharacteristics;
        this.mQuirks = quirks;
        this.mHasIncorrectJpegMetadataQuirk = quirks.contains(IncorrectJpegMetadataQuirk.class);
    }
}
