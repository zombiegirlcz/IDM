package defpackage;

import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.DeviceInfos;
import com.youTransactor.uCube.rpc.command.ExitSecureSessionCommand;
import com.youTransactor.uCube.rpc.command.GetInfosCommand;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class k1 implements ITaskMonitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f180066b;

    public /* synthetic */ k1(l1 l1Var, int i) {
        this.f180065a = i;
        this.f180066b = l1Var;
    }

    @Override // com.youTransactor.uCube.ITaskMonitor
    public final void handleEvent(TaskEvent taskEvent, Object[] objArr) {
        switch (this.f180065a) {
            case 0:
                int i = i1.f157502a[taskEvent.ordinal()];
                l1 l1Var = this.f180066b;
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        new ExitSecureSessionCommand().execute(new k1(l1Var, 1));
                        break;
                    }
                } else {
                    l1Var.notifyMonitor(TaskEvent.FAILED, l1Var);
                    break;
                }
                break;
            case 1:
                int i2 = i1.f157502a[taskEvent.ordinal()];
                l1 l1Var2 = this.f180066b;
                if (i2 != 2 && i2 != 3) {
                    if (i2 == 4) {
                        new GetInfosCommand(Constants.TAG_CONFIGURATION_MERCHANT_INTERFACE_LOCALE).execute(new k1(l1Var2, 2));
                        break;
                    }
                } else {
                    l1Var2.notifyMonitor(TaskEvent.FAILED, l1Var2);
                    break;
                }
                break;
            default:
                l1 l1Var3 = this.f180066b;
                l1Var3.getClass();
                int i3 = i1.f157502a[taskEvent.ordinal()];
                if (i3 != 2 && i3 != 3) {
                    if (i3 == 4) {
                        l1Var3.notifyMonitor(TaskEvent.SUCCESS, new DeviceInfos(((GetInfosCommand) objArr[0]).getResponseData()).getMerchantLocale());
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
