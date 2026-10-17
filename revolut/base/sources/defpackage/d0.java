package defpackage;

import a61.a;
import com.youTransactor.uCube.ITask;
import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.mdm.BinaryUpdate;
import com.youTransactor.uCube.rpc.command.InstallForLoadCommand;
import com.youTransactor.uCube.rpc.command.LoadCommand;

/* JADX INFO: loaded from: classes17.dex */
public final class d0 implements ITaskMonitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InstallForLoadCommand f110267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BinaryUpdate f110268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f110269c;

    public d0(u0 u0Var, InstallForLoadCommand installForLoadCommand, BinaryUpdate binaryUpdate) {
        this.f110267a = installForLoadCommand;
        this.f110268b = binaryUpdate;
        this.f110269c = u0Var;
    }

    @Override // com.youTransactor.uCube.ITaskMonitor
    public final void handleEvent(TaskEvent taskEvent, Object... objArr) {
        int i = o0.f221096a[taskEvent.ordinal()];
        BinaryUpdate binaryUpdate = this.f110268b;
        u0 u0Var = this.f110269c;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            v1.a("upload " + binaryUpdate.getCfg().getLabel() + " Type : " + binaryUpdate.getCfg().getType());
            new LoadCommand(binaryUpdate.getBinaryBlock()).execute(new a(u0Var, binaryUpdate));
            return;
        }
        if (this.f110267a.getResponseStatus().cmdStatus != -4106) {
            u0Var.d = (ITask) objArr[0];
            u0Var.notifyMonitor(TaskEvent.FAILED, this);
            return;
        }
        v1.a("upload " + binaryUpdate.getCfg().getLabel() + " failed with error same version");
        u0Var.I.remove(binaryUpdate);
        u0Var.d();
    }
}
