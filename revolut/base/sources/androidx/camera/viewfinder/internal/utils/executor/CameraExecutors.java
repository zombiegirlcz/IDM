package androidx.camera.viewfinder.internal.utils.executor;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes15.dex */
public abstract class CameraExecutors {
    @NonNull
    public static Executor directExecutor() {
        return DirectExecutor.getInstance();
    }
}
