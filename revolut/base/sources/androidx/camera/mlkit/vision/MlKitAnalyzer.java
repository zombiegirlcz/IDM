package androidx.camera.mlkit.vision;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.media.Image;
import android.util.Size;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.TransformUtils;
import androidx.camera.view.transform.ImageProxyTransformFactory;
import androidx.core.util.Consumer;
import b0.e;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import ph.a;

/* JADX INFO: loaded from: classes15.dex */
public class MlKitAnalyzer implements ImageAnalysis.Analyzer {
    private static final Size DEFAULT_SIZE = new Size(DefaultFrameSampler.DESIRED_FRAME_WIDTH, 360);
    final Consumer<Result> mConsumer;
    private final List<a> mDetectors;
    private final Executor mExecutor;
    final ImageProxyTransformFactory mImageAnalysisTransformFactory;
    private Matrix mSensorToTarget;
    private final int mTargetCoordinateSystem;

    public static final class Result {
        private final Map<a, Throwable> mThrowables;
        private final long mTimestamp;
        private final Map<a, Object> mValues;

        public Result(Map<a, Object> map, long j2, Map<a, Throwable> map2) {
            this.mValues = map;
            this.mThrowables = map2;
            this.mTimestamp = j2;
        }

        private void checkDetectorExists(a aVar) {
            Preconditions.checkArgument(this.mValues.containsKey(aVar) || this.mThrowables.containsKey(aVar), "The detector does not exist");
        }

        public Throwable getThrowable(a aVar) {
            checkDetectorExists(aVar);
            return this.mThrowables.get(aVar);
        }

        public <T> T getValue(a aVar) {
            checkDetectorExists(aVar);
            return (T) this.mValues.get(aVar);
        }
    }

    public MlKitAnalyzer(List<a> list, int i, Executor executor, Consumer<Result> consumer) {
        if (i != 0) {
            Iterator<a> it8 = list.iterator();
            while (it8.hasNext()) {
                Preconditions.checkArgument(it8.next().getDetectorType() != 7, "Segmentation only works with COORDINATE_SYSTEM_ORIGINAL");
            }
        }
        this.mDetectors = new ArrayList(list);
        this.mTargetCoordinateSystem = i;
        this.mConsumer = consumer;
        this.mExecutor = executor;
        ImageProxyTransformFactory imageProxyTransformFactory = new ImageProxyTransformFactory();
        this.mImageAnalysisTransformFactory = imageProxyTransformFactory;
        imageProxyTransformFactory.setUsingRotationDegrees(true);
    }

    private void detectRecursively(final ImageProxy imageProxy, final int i, final Matrix matrix, final Map<a, Object> map, final Map<a, Throwable> map2) {
        Image image = imageProxy.getImage();
        if (image == null) {
            Logger.e("MlKitAnalyzer", "Image is null.");
            imageProxy.close();
            return;
        }
        if (i > this.mDetectors.size() - 1) {
            imageProxy.close();
            this.mExecutor.execute(new e(this, map, imageProxy, map2, 6));
            return;
        }
        final a aVar = this.mDetectors.get(i);
        try {
            aVar.process(image, imageProxy.getImageInfo().getRotationDegrees(), matrix).addOnCompleteListener(this.mExecutor, new OnCompleteListener() { // from class: r0.a
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    this.f250668a.lambda$detectRecursively$1(map2, aVar, map, imageProxy, i, matrix, task);
                }
            });
        } catch (Exception e) {
            map2.put(aVar, new RuntimeException("Failed to process the image.", e));
            detectRecursively(imageProxy, i + 1, matrix, map, map2);
        }
    }

    private Size getTargetResolution(int i) {
        return (i == 1 || i == 4) ? new Size(1280, 720) : DEFAULT_SIZE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$detectRecursively$0(Map map, ImageProxy imageProxy, Map map2) {
        this.mConsumer.accept(new Result(map, imageProxy.getImageInfo().getTimestamp(), map2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$detectRecursively$1(Map map, a aVar, Map map2, ImageProxy imageProxy, int i, Matrix matrix, Task task) {
        if (task.isCanceled()) {
            map.put(aVar, new CancellationException("The task is canceled."));
        } else if (task.isSuccessful()) {
            map2.put(aVar, task.getResult());
        } else {
            map.put(aVar, task.getException());
        }
        detectRecursively(imageProxy, i + 1, matrix, map2, map);
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public final void analyze(ImageProxy imageProxy) {
        Matrix matrix = new Matrix();
        int i = this.mTargetCoordinateSystem;
        if (i != 0) {
            Matrix matrix2 = this.mSensorToTarget;
            if (i != 2 && matrix2 == null) {
                Logger.d("MlKitAnalyzer", "Sensor-to-target transformation is null.");
                imageProxy.close();
                return;
            }
            Matrix matrix3 = new Matrix(imageProxy.getImageInfo().getSensorToBufferTransformMatrix());
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, imageProxy.getWidth(), imageProxy.getHeight());
            matrix3.postConcat(TransformUtils.getRectToRect(rectF, TransformUtils.rotateRect(rectF, imageProxy.getImageInfo().getRotationDegrees()), imageProxy.getImageInfo().getRotationDegrees()));
            matrix3.invert(matrix);
            if (this.mTargetCoordinateSystem != 2) {
                matrix.postConcat(matrix2);
            }
        }
        detectRecursively(imageProxy, 0, matrix, new HashMap(), new HashMap());
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public final Size getDefaultTargetResolution() {
        Size size = DEFAULT_SIZE;
        Iterator<a> it8 = this.mDetectors.iterator();
        while (it8.hasNext()) {
            Size targetResolution = getTargetResolution(it8.next().getDetectorType());
            if (targetResolution.getWidth() * targetResolution.getHeight() > size.getHeight() * size.getWidth()) {
                size = targetResolution;
            }
        }
        return size;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public final int getTargetCoordinateSystem() {
        return this.mTargetCoordinateSystem;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public final void updateTransform(Matrix matrix) {
        if (matrix == null) {
            this.mSensorToTarget = null;
        } else {
            this.mSensorToTarget = new Matrix(matrix);
        }
    }
}
