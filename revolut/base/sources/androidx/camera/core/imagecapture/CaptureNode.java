package androidx.camera.core.imagecapture;

import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ForwardingImageProxy;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.ImageReaderProxys;
import androidx.camera.core.Logger;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureCallbacks;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.processing.Edge;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
class CaptureNode {
    private In mInputEdge;
    private ProcessingNode.In mOutputEdge;
    SafeCloseImageReaderProxy mSafeCloseImageReaderForPostview;
    SafeCloseImageReaderProxy mSafeCloseImageReaderProxy;
    SafeCloseImageReaderProxy mSecondarySafeCloseImageReaderProxy;
    ProcessingRequest mCurrentRequest = null;
    private NoMetadataImageReader mNoMetadataImageReader = null;

    /* JADX INFO: renamed from: androidx.camera.core.imagecapture.CaptureNode$1, reason: invalid class name */
    public class AnonymousClass1 extends CameraCaptureCallback {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureProcessProgressed$1(int i) {
            ProcessingRequest processingRequest = CaptureNode.this.mCurrentRequest;
            if (processingRequest != null) {
                processingRequest.onCaptureProcessProgressed(i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCaptureStarted$0() {
            ProcessingRequest processingRequest = CaptureNode.this.mCurrentRequest;
            if (processingRequest != null) {
                processingRequest.onCaptureStarted();
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureProcessProgressed(int i, final int i2) {
            CameraXExecutors.mainThreadExecutor().execute(new Runnable() { // from class: androidx.camera.core.imagecapture.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6854a.lambda$onCaptureProcessProgressed$1(i2);
                }
            });
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public void onCaptureStarted(int i) {
            CameraXExecutors.mainThreadExecutor().execute(new c(this, 3));
        }
    }

    public static abstract class In {
        private CameraCaptureCallback mCameraCaptureCallback = new CameraCaptureCallback() { // from class: androidx.camera.core.imagecapture.CaptureNode.In.1
        };
        private DeferrableSurface mPostviewSurface = null;
        private CameraCaptureCallback mSecondaryCameraCaptureCallback;
        private DeferrableSurface mSecondarySurface;
        private DeferrableSurface mSurface;

        public static In of(Size size, int i, List<Integer> list, boolean z, ImageReaderProxyProvider imageReaderProxyProvider, PostviewSettings postviewSettings) {
            return new AutoValue_CaptureNode_In(size, i, list, z, imageReaderProxyProvider, postviewSettings, new Edge(), new Edge());
        }

        public CameraCaptureCallback getCameraCaptureCallback() {
            return this.mCameraCaptureCallback;
        }

        public abstract Edge<TakePictureManager.CaptureError> getErrorEdge();

        public abstract ImageReaderProxyProvider getImageReaderProxyProvider();

        public abstract int getInputFormat();

        public abstract List<Integer> getOutputFormats();

        public abstract PostviewSettings getPostviewSettings();

        public DeferrableSurface getPostviewSurface() {
            return this.mPostviewSurface;
        }

        public abstract Edge<ProcessingRequest> getRequestEdge();

        public CameraCaptureCallback getSecondaryCameraCaptureCallback() {
            return this.mSecondaryCameraCaptureCallback;
        }

        public DeferrableSurface getSecondarySurface() {
            return this.mSecondarySurface;
        }

        public abstract Size getSize();

        public DeferrableSurface getSurface() {
            DeferrableSurface deferrableSurface = this.mSurface;
            Objects.requireNonNull(deferrableSurface);
            return deferrableSurface;
        }

        public abstract boolean isVirtualCamera();

        public void setCameraCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
            this.mCameraCaptureCallback = cameraCaptureCallback;
        }

        public void setPostviewSurface(Surface surface, Size size, int i) {
            this.mPostviewSurface = new ImmediateSurface(surface, size, i);
        }

        public void setSecondaryCameraCaptureCallback(CameraCaptureCallback cameraCaptureCallback) {
            this.mSecondaryCameraCaptureCallback = cameraCaptureCallback;
        }

        public void setSecondarySurface(Surface surface) {
            Preconditions.checkState(this.mSecondarySurface == null, "The secondary surface is already set.");
            this.mSecondarySurface = new ImmediateSurface(surface, getSize(), getInputFormat());
        }

        public void setSurface(Surface surface) {
            Preconditions.checkState(this.mSurface == null, "The surface is already set.");
            this.mSurface = new ImmediateSurface(surface, getSize(), getInputFormat());
        }
    }

    private static ImageReaderProxy createImageReaderProxy(ImageReaderProxyProvider imageReaderProxyProvider, int i, int i2, int i3) {
        return imageReaderProxyProvider != null ? imageReaderProxyProvider.newInstance(i, i2, i3, 4, 0L) : ImageReaderProxys.createIsolatedReader(i, i2, i3, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$releaseInputResources$4(SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        if (safeCloseImageReaderProxy != null) {
            safeCloseImageReaderProxy.safeClose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$releaseInputResources$5(SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        if (safeCloseImageReaderProxy != null) {
            safeCloseImageReaderProxy.safeClose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setOnImageAvailableListener$2(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy imageProxyAcquireLatestImage = imageReaderProxy.acquireLatestImage();
            StringBuilder sb6 = new StringBuilder("OnImageAvailableListener: mCurrentRequest ID = ");
            ProcessingRequest processingRequest = this.mCurrentRequest;
            sb6.append(processingRequest == null ? null : Integer.valueOf(processingRequest.getRequestId()));
            sb6.append(", image.isNull = ");
            sb6.append(imageProxyAcquireLatestImage == null);
            Logger.d("CaptureNode", sb6.toString());
            if (imageProxyAcquireLatestImage != null) {
                onImageProxyAvailable(imageProxyAcquireLatestImage);
                return;
            }
            ProcessingRequest processingRequest2 = this.mCurrentRequest;
            if (processingRequest2 != null) {
                sendCaptureError(TakePictureManager.CaptureError.of(processingRequest2.getRequestId(), new ImageCaptureException(2, "Failed to acquire latest image", null)));
            }
        } catch (IllegalStateException e) {
            ProcessingRequest processingRequest3 = this.mCurrentRequest;
            if (processingRequest3 != null) {
                sendCaptureError(TakePictureManager.CaptureError.of(processingRequest3.getRequestId(), new ImageCaptureException(2, "Failed to acquire latest image", e)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$0(ProcessingRequest processingRequest) {
        onRequestAvailable(processingRequest);
        this.mNoMetadataImageReader.acceptProcessingRequest(processingRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$transform$1(ImageReaderProxy imageReaderProxy) {
        try {
            ImageProxy imageProxyAcquireLatestImage = imageReaderProxy.acquireLatestImage();
            if (imageProxyAcquireLatestImage != null) {
                propagatePostviewImage(imageProxyAcquireLatestImage);
            }
        } catch (IllegalStateException e) {
            Logger.e("CaptureNode", "Failed to acquire latest image of postview", e);
        }
    }

    private void matchAndPropagateImage(ImageProxy imageProxy) {
        ProcessingRequest processingRequest;
        ProcessingRequest processingRequest2;
        Threads.checkMainThread();
        ProcessingNode.In in10 = this.mOutputEdge;
        Objects.requireNonNull(in10);
        in10.getEdge().accept(ProcessingNode.InputPacket.of(this.mCurrentRequest, imageProxy));
        ProcessingRequest processingRequest3 = this.mCurrentRequest;
        In in11 = this.mInputEdge;
        boolean z = in11 != null && in11.getOutputFormats().size() > 1;
        if (z && (processingRequest2 = this.mCurrentRequest) != null) {
            processingRequest2.getTakePictureRequest().markFormatProcessStatusInSimultaneousCapture(imageProxy.getFormat(), true);
        }
        if (!z || ((processingRequest = this.mCurrentRequest) != null && processingRequest.getTakePictureRequest().isFormatProcessedInSimultaneousCapture())) {
            this.mCurrentRequest = null;
        }
        processingRequest3.onImageCaptured();
    }

    private void propagatePostviewImage(ImageProxy imageProxy) {
        if (this.mCurrentRequest == null) {
            Logger.w("CaptureNode", "Postview image is closed due to request completed or aborted");
            imageProxy.close();
        } else {
            ProcessingNode.In in10 = this.mOutputEdge;
            Objects.requireNonNull(in10);
            in10.getPostviewEdge().accept(ProcessingNode.InputPacket.of(this.mCurrentRequest, imageProxy));
        }
    }

    private void releaseInputResources(In in10, SafeCloseImageReaderProxy safeCloseImageReaderProxy, SafeCloseImageReaderProxy safeCloseImageReaderProxy2, SafeCloseImageReaderProxy safeCloseImageReaderProxy3) {
        in10.getSurface().close();
        in10.getSurface().getTerminationFuture().addListener(new c(safeCloseImageReaderProxy, 0), CameraXExecutors.mainThreadExecutor());
        if (in10.getPostviewSurface() != null) {
            in10.getPostviewSurface().close();
            in10.getPostviewSurface().getTerminationFuture().addListener(new c(safeCloseImageReaderProxy3, 1), CameraXExecutors.mainThreadExecutor());
        }
        if (in10.getOutputFormats().size() <= 1 || in10.getSecondarySurface() == null) {
            return;
        }
        in10.getSecondarySurface().close();
        in10.getSecondarySurface().getTerminationFuture().addListener(new c(safeCloseImageReaderProxy2, 2), CameraXExecutors.mainThreadExecutor());
    }

    private void setOnImageAvailableListener(ImageReaderProxy imageReaderProxy) {
        final int i = 0;
        imageReaderProxy.setOnImageAvailableListener(new ImageReaderProxy.OnImageAvailableListener(this) { // from class: androidx.camera.core.imagecapture.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CaptureNode f6849b;

            {
                this.f6849b = this;
            }

            @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
            public final void onImageAvailable(ImageReaderProxy imageReaderProxy2) {
                switch (i) {
                    case 0:
                        this.f6849b.lambda$setOnImageAvailableListener$2(imageReaderProxy2);
                        break;
                    default:
                        this.f6849b.lambda$transform$1(imageReaderProxy2);
                        break;
                }
            }
        }, CameraXExecutors.mainThreadExecutor());
    }

    public int getCapacity() {
        Threads.checkMainThread();
        Preconditions.checkState(this.mSafeCloseImageReaderProxy != null, "The ImageReader is not initialized.");
        return this.mSafeCloseImageReaderProxy.getCapacity();
    }

    public void onImageProxyAvailable(ImageProxy imageProxy) {
        Threads.checkMainThread();
        if (this.mCurrentRequest == null) {
            Logger.w("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + imageProxy);
            imageProxy.close();
            return;
        }
        TagBundle tagBundle = imageProxy.getImageInfo().getTagBundle();
        if (((Integer) tagBundle.getTag(this.mCurrentRequest.getTagBundleKey())) != null) {
            matchAndPropagateImage(imageProxy);
            return;
        }
        Logger.w("CaptureNode", "Discarding ImageProxy which was acquired for another request, mCurrentRequest id = " + this.mCurrentRequest.getRequestId() + ", ImageProxy tagBundle keys = " + tagBundle.listKeys());
        imageProxy.close();
    }

    public void onRequestAvailable(final ProcessingRequest processingRequest) {
        Threads.checkMainThread();
        Preconditions.checkState(processingRequest.getStageIds().size() == 1, "only one capture stage is supported.");
        Preconditions.checkState(getCapacity() > 0, "Too many acquire images. Close image to be able to process next.");
        this.mCurrentRequest = processingRequest;
        Futures.addCallback(processingRequest.getCaptureFuture(), new FutureCallback<Void>() { // from class: androidx.camera.core.imagecapture.CaptureNode.2
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(Throwable th10) {
                Threads.checkMainThread();
                if (processingRequest == CaptureNode.this.mCurrentRequest) {
                    Logger.w("CaptureNode", "request aborted, id=" + CaptureNode.this.mCurrentRequest.getRequestId());
                    if (CaptureNode.this.mNoMetadataImageReader != null) {
                        CaptureNode.this.mNoMetadataImageReader.clearProcessingRequest();
                    }
                    CaptureNode.this.mCurrentRequest = null;
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(Void r110) {
            }
        }, CameraXExecutors.directExecutor());
    }

    public void release() {
        Threads.checkMainThread();
        In in10 = this.mInputEdge;
        Objects.requireNonNull(in10);
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.mSafeCloseImageReaderProxy;
        Objects.requireNonNull(safeCloseImageReaderProxy);
        releaseInputResources(in10, safeCloseImageReaderProxy, this.mSecondarySafeCloseImageReaderProxy, this.mSafeCloseImageReaderForPostview);
    }

    public void sendCaptureError(TakePictureManager.CaptureError captureError) {
        Threads.checkMainThread();
        ProcessingRequest processingRequest = this.mCurrentRequest;
        if (processingRequest == null || processingRequest.getRequestId() != captureError.getRequestId()) {
            return;
        }
        this.mCurrentRequest.onCaptureFailure(captureError.getImageCaptureException());
    }

    public void setOnImageCloseListener(ForwardingImageProxy.OnImageCloseListener onImageCloseListener) {
        Threads.checkMainThread();
        Preconditions.checkState(this.mSafeCloseImageReaderProxy != null, "The ImageReader is not initialized.");
        this.mSafeCloseImageReaderProxy.setOnImageCloseListener(onImageCloseListener);
    }

    public ProcessingNode.In transform(In in10) {
        Consumer<ProcessingRequest> consumer;
        ImageReaderProxy imageReaderProxy;
        MetadataImageReader metadataImageReader;
        ImageReaderProxy imageReaderProxy2;
        final int i = 0;
        final int i2 = 1;
        Preconditions.checkState(this.mInputEdge == null && this.mSafeCloseImageReaderProxy == null, "CaptureNode does not support recreation yet.");
        this.mInputEdge = in10;
        Size size = in10.getSize();
        int inputFormat = in10.getInputFormat();
        boolean zIsVirtualCamera = in10.isVirtualCamera();
        CameraCaptureCallback anonymousClass1 = new AnonymousClass1();
        boolean z = in10.getOutputFormats().size() > 1;
        final int i3 = 2;
        CameraCaptureCallback cameraCaptureCallbackCreateComboCallback = null;
        if (zIsVirtualCamera) {
            in10.getImageReaderProxyProvider();
            NoMetadataImageReader noMetadataImageReader = new NoMetadataImageReader(createImageReaderProxy(null, size.getWidth(), size.getHeight(), inputFormat));
            this.mNoMetadataImageReader = noMetadataImageReader;
            consumer = new Consumer(this) { // from class: androidx.camera.core.imagecapture.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CaptureNode f6851b;

                {
                    this.f6851b = this;
                }

                @Override // androidx.core.util.Consumer
                public final void accept(Object obj2) {
                    switch (i2) {
                        case 0:
                            this.f6851b.onRequestAvailable((ProcessingRequest) obj2);
                            break;
                        case 1:
                            this.f6851b.lambda$transform$0((ProcessingRequest) obj2);
                            break;
                        default:
                            this.f6851b.sendCaptureError((TakePictureManager.CaptureError) obj2);
                            break;
                    }
                }
            };
            imageReaderProxy = noMetadataImageReader;
            metadataImageReader = null;
        } else {
            in10.getImageReaderProxyProvider();
            if (z) {
                MetadataImageReader metadataImageReader2 = new MetadataImageReader(size.getWidth(), size.getHeight(), 256, 4);
                CameraCaptureCallback cameraCaptureCallbackCreateComboCallback2 = CameraCaptureCallbacks.createComboCallback(anonymousClass1, metadataImageReader2.getCameraCaptureCallback());
                metadataImageReader = new MetadataImageReader(size.getWidth(), size.getHeight(), 32, 4);
                CameraCaptureCallback[] cameraCaptureCallbackArr = {anonymousClass1, metadataImageReader.getCameraCaptureCallback()};
                anonymousClass1 = cameraCaptureCallbackCreateComboCallback2;
                cameraCaptureCallbackCreateComboCallback = CameraCaptureCallbacks.createComboCallback(cameraCaptureCallbackArr);
                imageReaderProxy2 = metadataImageReader2;
            } else {
                MetadataImageReader metadataImageReader3 = new MetadataImageReader(size.getWidth(), size.getHeight(), inputFormat, 4);
                anonymousClass1 = CameraCaptureCallbacks.createComboCallback(anonymousClass1, metadataImageReader3.getCameraCaptureCallback());
                imageReaderProxy2 = metadataImageReader3;
                metadataImageReader = null;
            }
            consumer = new Consumer(this) { // from class: androidx.camera.core.imagecapture.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CaptureNode f6851b;

                {
                    this.f6851b = this;
                }

                @Override // androidx.core.util.Consumer
                public final void accept(Object obj2) {
                    switch (i) {
                        case 0:
                            this.f6851b.onRequestAvailable((ProcessingRequest) obj2);
                            break;
                        case 1:
                            this.f6851b.lambda$transform$0((ProcessingRequest) obj2);
                            break;
                        default:
                            this.f6851b.sendCaptureError((TakePictureManager.CaptureError) obj2);
                            break;
                    }
                }
            };
            imageReaderProxy = imageReaderProxy2;
        }
        in10.setCameraCaptureCallback(anonymousClass1);
        if (z && cameraCaptureCallbackCreateComboCallback != null) {
            in10.setSecondaryCameraCaptureCallback(cameraCaptureCallbackCreateComboCallback);
        }
        Surface surface = imageReaderProxy.getSurface();
        Objects.requireNonNull(surface);
        in10.setSurface(surface);
        this.mSafeCloseImageReaderProxy = new SafeCloseImageReaderProxy(imageReaderProxy);
        setOnImageAvailableListener(imageReaderProxy);
        in10.getPostviewSettings();
        if (z && metadataImageReader != null) {
            in10.setSecondarySurface(metadataImageReader.getSurface());
            this.mSecondarySafeCloseImageReaderProxy = new SafeCloseImageReaderProxy(metadataImageReader);
            setOnImageAvailableListener(metadataImageReader);
        }
        in10.getRequestEdge().setListener(consumer);
        in10.getErrorEdge().setListener(new Consumer(this) { // from class: androidx.camera.core.imagecapture.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CaptureNode f6851b;

            {
                this.f6851b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj2) {
                switch (i3) {
                    case 0:
                        this.f6851b.onRequestAvailable((ProcessingRequest) obj2);
                        break;
                    case 1:
                        this.f6851b.lambda$transform$0((ProcessingRequest) obj2);
                        break;
                    default:
                        this.f6851b.sendCaptureError((TakePictureManager.CaptureError) obj2);
                        break;
                }
            }
        });
        ProcessingNode.In inOf = ProcessingNode.In.of(in10.getInputFormat(), in10.getOutputFormats());
        this.mOutputEdge = inOf;
        return inOf;
    }
}
