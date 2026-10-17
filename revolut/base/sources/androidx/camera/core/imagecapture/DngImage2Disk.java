package androidx.camera.core.imagecapture;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.DngCreator;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.processing.Operation;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public class DngImage2Disk implements Operation<In, ImageCapture.OutputFileResults> {
    private DngCreator mDngCreator;

    public static abstract class In {
        public static In of(ImageProxy imageProxy, int i, ImageCapture.OutputFileOptions outputFileOptions) {
            return new AutoValue_DngImage2Disk_In(imageProxy, i, outputFileOptions);
        }

        public abstract ImageProxy getImageProxy();

        public abstract ImageCapture.OutputFileOptions getOutputFileOptions();

        public abstract int getRotationDegrees();
    }

    public DngImage2Disk(CameraCharacteristics cameraCharacteristics, CaptureResult captureResult) {
        this(new DngCreator(cameraCharacteristics, captureResult));
    }

    public static int computeExifOrientation(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 90) {
            return 6;
        }
        if (i != 180) {
            return i != 270 ? 0 : 8;
        }
        return 3;
    }

    private void writeImageToFile(File file, ImageProxy imageProxy, int i) throws ImageCaptureException {
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    this.mDngCreator.setOrientation(computeExifOrientation(i));
                    this.mDngCreator.writeImage(fileOutputStream, imageProxy.getImage());
                    fileOutputStream.close();
                } catch (Throwable th10) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th11) {
                        th10.addSuppressed(th11);
                    }
                    throw th10;
                }
            } catch (IOException e) {
                throw new ImageCaptureException(1, "Failed to write to temp file", e);
            } catch (IllegalArgumentException e2) {
                throw new ImageCaptureException(1, "Image with an unsupported format was used", e2);
            } catch (IllegalStateException e4) {
                throw new ImageCaptureException(1, "Not enough metadata information has been set to write a well-formatted DNG file", e4);
            }
        } finally {
            imageProxy.close();
        }
    }

    public DngImage2Disk(DngCreator dngCreator) {
        this.mDngCreator = dngCreator;
    }

    @Override // androidx.camera.core.processing.Operation
    public ImageCapture.OutputFileResults apply(In in10) throws ImageCaptureException {
        ImageCapture.OutputFileOptions outputFileOptions = in10.getOutputFileOptions();
        File fileCreateTempFile = FileUtil.createTempFile(outputFileOptions);
        writeImageToFile(fileCreateTempFile, in10.getImageProxy(), in10.getRotationDegrees());
        return new ImageCapture.OutputFileResults(FileUtil.moveFileToTarget(fileCreateTempFile, outputFileOptions), 32);
    }
}
