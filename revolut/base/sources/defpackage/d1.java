package defpackage;

import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.DeviceInfos;
import com.youTransactor.uCube.rpc.command.GetInfosCommand;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d1 implements ITaskMonitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f110452b;

    public /* synthetic */ d1(f1 f1Var, int i) {
        this.f110451a = i;
        this.f110452b = f1Var;
    }

    @Override // com.youTransactor.uCube.ITaskMonitor
    public final void handleEvent(TaskEvent taskEvent, Object[] objArr) {
        switch (this.f110451a) {
            case 0:
                int i = y0.f310095a[taskEvent.ordinal()];
                f1 f1Var = this.f110452b;
                if (i == 2) {
                    f1Var.notifyMonitor(TaskEvent.FAILED, new Object[0]);
                    return;
                }
                if (i != 3) {
                    return;
                }
                DeviceInfos deviceInfos = new DeviceInfos(((GetInfosCommand) objArr[0]).getResponseData());
                f1Var.H = deviceInfos;
                if (deviceInfos.getSvppFirmware() == null) {
                    f1Var.notifyMonitor(TaskEvent.FAILED, new Object[0]);
                    return;
                }
                if (f1Var.H.getSvppFirmware().charAt(0) != '6') {
                    f1Var.J = 1;
                } else {
                    f1Var.J = 2;
                }
                int i2 = f1Var.J;
                v1.a("UCubeDevice model : ".concat(i2 != 1 ? i2 != 2 ? "null" : "uCube_touch" : "uCube"));
                int i3 = f1Var.J;
                if (i3 == 0) {
                    throw null;
                }
                if (i3 - 1 != 1) {
                    v1.a("Retrieve device infos");
                    new GetInfosCommand(f1.K).execute(new d1(f1Var, 1));
                    return;
                } else {
                    v1.a("Retrieve device infos");
                    new GetInfosCommand(f1.L).execute(new d1(f1Var, 1));
                    return;
                }
            default:
                int i5 = y0.f310095a[taskEvent.ordinal()];
                f1 f1Var2 = this.f110452b;
                if (i5 == 2) {
                    f1Var2.notifyMonitor(TaskEvent.FAILED, new Object[0]);
                    return;
                }
                if (i5 != 3) {
                    return;
                }
                DeviceInfos deviceInfos2 = new DeviceInfos(((GetInfosCommand) objArr[0]).getResponseData());
                f1Var2.H = deviceInfos2;
                if (f1Var2.J == 1 && deviceInfos2.getNfcModuleState() != 0) {
                    byte[] tlv = f1Var2.H.getTlv();
                    v1.a("Retrieve NFC device infos");
                    new GetInfosCommand(Constants.TAG_EMV_NFC_CONFIG_VERSION, 232).execute(new e1(f1Var2, tlv, 0));
                    return;
                } else {
                    v1.a("UCubeDevice Info retrieved : " + f1Var2.H.getSerial() + " - " + f1Var2.H.getPartNumber());
                    f1Var2.notifyMonitor(TaskEvent.SUCCESS, f1Var2.H);
                    return;
                }
        }
    }
}
