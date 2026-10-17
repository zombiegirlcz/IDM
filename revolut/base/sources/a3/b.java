package a3;

import android.os.Handler;
import android.view.Choreographer;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.compose.ui.text.input.TextInputServiceAndroid_androidKt;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.HandlerWrapper;
import com.onfido.android.sdk.capture.internal.navigation.OnfidoNavigation;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class b implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f950b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f949a = i;
        this.f950b = obj2;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f949a) {
            case 0:
                TextInputServiceAndroid_androidKt.asExecutor$lambda$0((Choreographer) this.f950b, runnable);
                break;
            case 1:
                ((BackgroundThreadStateHandler) this.f950b).runInBackground(runnable);
                break;
            case 2:
                ((HandlerWrapper) this.f950b).post(runnable);
                break;
            case 3:
                ((Handler) this.f950b).post(runnable);
                break;
            case 4:
                UseCaseThreads.sequentialExecutor$lambda$0((UseCaseThreads) this.f950b, runnable);
                break;
            default:
                OnfidoNavigation.commandQueue$lambda$0((SchedulersProvider) this.f950b, runnable);
                break;
        }
    }
}
