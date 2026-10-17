package b0;

import android.content.Context;
import androidx.camera.core.CameraX;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11499a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraX f11500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Executor f11501c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Context f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ CallbackToFutureAdapter.Completer f11502g;

    public /* synthetic */ c(CameraX cameraX, Context context, Executor executor, int i, CallbackToFutureAdapter.Completer completer, long j2) {
        this.f11500b = cameraX;
        this.f = context;
        this.f11501c = executor;
        this.e = i;
        this.f11502g = completer;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11499a) {
            case 0:
                this.f11500b.lambda$initAndRetryRecursively$3(this.f, this.f11501c, this.e, this.f11502g, this.d);
                break;
            default:
                Context context = this.f;
                CallbackToFutureAdapter.Completer completer = this.f11502g;
                this.f11500b.lambda$initAndRetryRecursively$2(this.f11501c, this.d, this.e, context, completer);
                break;
        }
    }

    public /* synthetic */ c(CameraX cameraX, Executor executor, long j2, int i, Context context, CallbackToFutureAdapter.Completer completer) {
        this.f11500b = cameraX;
        this.f11501c = executor;
        this.d = j2;
        this.e = i;
        this.f = context;
        this.f11502g = completer;
    }
}
