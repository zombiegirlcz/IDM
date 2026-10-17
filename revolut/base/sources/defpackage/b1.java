package defpackage;

import com.youTransactor.uCube.ITask;
import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.mdm.ServiceState;
import ogm.i;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b1 implements ITaskMonitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f11693b;

    public /* synthetic */ b1(c1 c1Var, int i) {
        this.f11692a = i;
        this.f11693b = c1Var;
    }

    @Override // com.youTransactor.uCube.ITaskMonitor
    public final void handleEvent(TaskEvent taskEvent, Object[] objArr) {
        switch (this.f11692a) {
            case 0:
                c1 c1Var = this.f11693b;
                c1Var.getClass();
                c1Var.notifyMonitor(TaskEvent.SUCCESS, new Object[0]);
                break;
            default:
                int i = z0.f318153a[taskEvent.ordinal()];
                c1 c1Var2 = this.f11693b;
                if (i == 1) {
                    c1Var2.d = (ITask) objArr[0];
                    c1Var2.notifyMonitor(TaskEvent.FAILED, c1Var2);
                    break;
                } else if (i == 2) {
                    c1Var2.I = (byte[]) objArr[0];
                    c1Var2.b(ServiceState.REGISTER_DEVICE, new Object[0]);
                    new c(c1Var2.H, c1Var2.I, 2).execute(new i(c1Var2, 4));
                    break;
                }
                break;
        }
    }
}
