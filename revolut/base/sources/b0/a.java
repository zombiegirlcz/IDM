package b0;

import androidx.camera.core.Logger;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        Logger.w("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
    }
}
