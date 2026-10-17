package defpackage;

import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.DeviceInfos;
import com.youTransactor.uCube.rpc.command.ExitSecureSessionCommand;
import com.youTransactor.uCube.rpc.command.GetInfosCommand;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class p1 implements ITaskMonitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f231576b;

    public /* synthetic */ p1(l1 l1Var, int i) {
        this.f231575a = i;
        this.f231576b = l1Var;
    }

    @Override // com.youTransactor.uCube.ITaskMonitor
    public final void handleEvent(TaskEvent taskEvent, Object[] objArr) {
        switch (this.f231575a) {
            case 0:
                int i = n1.f211064a[taskEvent.ordinal()];
                l1 l1Var = this.f231576b;
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        new ExitSecureSessionCommand().execute(new p1(l1Var, 1));
                        break;
                    }
                } else {
                    l1Var.notifyMonitor(TaskEvent.FAILED, l1Var);
                    break;
                }
                break;
            case 1:
                int i2 = n1.f211064a[taskEvent.ordinal()];
                l1 l1Var2 = this.f231576b;
                if (i2 != 2 && i2 != 3) {
                    if (i2 == 4) {
                        new GetInfosCommand(Constants.TAG_SUPPORTED_LOCALE_LIST).execute(new p1(l1Var2, 2));
                        break;
                    }
                } else {
                    l1Var2.notifyMonitor(TaskEvent.FAILED, l1Var2);
                    break;
                }
                break;
            default:
                l1 l1Var3 = this.f231576b;
                l1Var3.getClass();
                int i3 = n1.f211064a[taskEvent.ordinal()];
                if (i3 != 2 && i3 != 3) {
                    if (i3 == 4) {
                        l1Var3.notifyMonitor(TaskEvent.SUCCESS, new DeviceInfos(((GetInfosCommand) objArr[0]).getResponseData()).getSupportedLocaleList());
                        break;
                    }
                } else {
                    l1Var3.notifyMonitor(TaskEvent.FAILED, l1Var3);
                    break;
                }
                break;
        }
    }
}
