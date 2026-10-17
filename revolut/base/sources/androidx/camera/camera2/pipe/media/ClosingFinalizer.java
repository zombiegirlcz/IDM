package androidx.camera.camera2.pipe.media;

import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H\u0016¨\u0006\t"}, d2 = {"Landroidx/camera/camera2/pipe/media/ClosingFinalizer;", "Landroidx/camera/camera2/pipe/media/Finalizer;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "<init>", "()V", "finalize", "", "value", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClosingFinalizer implements Finalizer<AutoCloseable> {

    @NotNull
    public static final ClosingFinalizer INSTANCE = new ClosingFinalizer();

    private ClosingFinalizer() {
    }

    @Override // androidx.camera.camera2.pipe.media.Finalizer
    public void finalize(AutoCloseable value) throws Exception {
        boolean zIsTerminated;
        if (value != null) {
            if (value instanceof AutoCloseable) {
                value.close();
                return;
            }
            if (!(value instanceof ExecutorService)) {
                if (value instanceof TypedArray) {
                    ((TypedArray) value).recycle();
                    return;
                } else {
                    if (!(value instanceof MediaMetadataRetriever)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaMetadataRetriever) value).release();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) value;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
