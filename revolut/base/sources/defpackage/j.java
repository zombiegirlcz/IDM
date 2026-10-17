package defpackage;

import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.rpc.command.ExitSecureSessionCommand;
import com.youTransactor.uCube.rpc.command.SetInfoFieldCommand;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class j implements ITaskMonitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f169896b;

    public /* synthetic */ j(k kVar, int i) {
        this.f169895a = i;
        this.f169896b = kVar;
    }

    @Override // com.youTransactor.uCube.ITaskMonitor
    public final void handleEvent(TaskEvent taskEvent, Object[] objArr) {
        switch (this.f169895a) {
            case 0:
                int i = f.f130984a[taskEvent.ordinal()];
                k kVar = this.f169896b;
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        new ExitSecureSessionCommand().execute(new j(kVar, 1));
                        break;
                    }
                } else {
                    kVar.notifyMonitor(TaskEvent.FAILED, kVar);
                    break;
                }
                break;
            case 1:
                int i2 = f.f130984a[taskEvent.ordinal()];
                k kVar2 = this.f169896b;
                if (i2 != 2 && i2 != 3) {
                    if (i2 == 4) {
                        String str = kVar2.H;
                        SetInfoFieldCommand setInfoFieldCommand = new SetInfoFieldCommand();
                        setInfoFieldCommand.setMerchantLocale(str);
                        setInfoFieldCommand.execute(new j(kVar2, 2));
                        break;
                    }
                } else {
                    kVar2.notifyMonitor(TaskEvent.FAILED, kVar2);
                    break;
                }
                break;
            default:
                k kVar3 = this.f169896b;
                kVar3.getClass();
                int i3 = f.f130984a[taskEvent.ordinal()];
                if (i3 != 2 && i3 != 3) {
                    if (i3 == 4) {
                        kVar3.notifyMonitor(TaskEvent.SUCCESS, new Object[0]);
                        break;
                    }
                } else {
                    kVar3.notifyMonitor(TaskEvent.FAILED, kVar3);
                    break;
                }
                break;
        }
    }
}
