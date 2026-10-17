package defpackage;

import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.connexion.ConnectionService;
import java.util.Calendar;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes19.dex */
public final class l0 extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Calendar f191132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f191133b;

    public l0(u0 u0Var, Calendar calendar) {
        this.f191132a = calendar;
        this.f191133b = u0Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        v1.b("try to reconnect", new Exception[0]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long timeInMillis = this.f191132a.getTimeInMillis();
        u0 u0Var = this.f191133b;
        if (jCurrentTimeMillis > timeInMillis) {
            v1.b("uCube reboot not detected after 60 sec", new Exception[0]);
            u0Var.L.cancel();
            u0Var.notifyMonitor(TaskEvent.FAILED, new Object[0]);
        } else {
            if (u0Var.M) {
                return;
            }
            u0Var.M = true;
            ConnectionService.getInstance().connect(new h(this, 2));
            v1.a("wait for uCube reboot");
        }
    }
}
