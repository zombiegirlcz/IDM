package defpackage;

import com.youTransactor.uCube.AbstractService;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.mdm.ServiceState;
import com.youTransactor.uCube.rpc.DeviceInfos;
import r10.d;

/* JADX INFO: loaded from: classes13.dex */
public abstract class l extends AbstractService {
    public DeviceInfos H;

    public abstract void a();

    public final void b(ServiceState serviceState, Object... objArr) {
        Object[] objArr2 = new Object[objArr.length + 1];
        objArr2[0] = serviceState;
        System.arraycopy(objArr, 0, objArr2, 1, objArr.length);
        notifyMonitor(TaskEvent.PROGRESS, objArr2);
    }

    @Override // com.youTransactor.uCube.AbstractTask
    public final void start() {
        if (this.H != null) {
            a();
            return;
        }
        f1 f1Var = new f1();
        d dVar = new d();
        dVar.f250818a = f1Var;
        dVar.f250819b = this;
        f1Var.execute(dVar);
    }
}
