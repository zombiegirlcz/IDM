package sa1;

import com.youTransactor.uCube.rpc.DeviceInfos;
import com.youTransactor.uCube.rpc.command.EnterSecureSessionCommand;
import com.youTransactor.uCube.rpc.command.GetInfosCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f261229b;

    public /* synthetic */ j(q qVar, int i) {
        this.f261228a = i;
        this.f261229b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f261228a) {
            case 0:
                qa1.b cardReaderInfo = (qa1.b) obj2;
                Intrinsics.checkNotNullParameter(cardReaderInfo, "cardReaderInfo");
                this.f261229b.getClass();
                String str = cardReaderInfo.f243930a;
                String str2 = cardReaderInfo.f243931b;
                String str3 = cardReaderInfo.f243932c;
                int i = cardReaderInfo.d;
                qa1.d dVar = cardReaderInfo.e;
                StringBuilder sbM = v0.a.m("Serial Number: ", str, "\nSVPP Firmware Version: ", str2, "\nBluetooth Firmware Version: ");
                sbM.append(str3);
                sbM.append("\nPower Off Timeout: ");
                sbM.append(i);
                sbM.append("\nState: ");
                sbM.append(dVar);
                ea1.b.a("Connected device\n" + sbM.toString(), fa1.k.INFO);
                return Unit.f186387a;
            case 1:
                GetInfosCommand execute = (GetInfosCommand) obj2;
                Intrinsics.checkNotNullParameter(execute, "$this$execute");
                DeviceInfos deviceInfos = new DeviceInfos(execute.getResponseData());
                byte chargingStatus = deviceInfos.getChargingStatus();
                qa1.f fVar = chargingStatus != 0 ? chargingStatus != 1 ? chargingStatus != 3 ? qa1.f.UNKNOWN : qa1.f.BATTERY_FULL : qa1.f.PLUGGED : qa1.f.UNPLUGGED;
                int batteryState = deviceInfos.getBatteryState();
                String firmwareVersion = deviceInfos.getSvppFirmware();
                Intrinsics.checkNotNullExpressionValue(firmwareVersion, "getSvppFirmware(...)");
                Intrinsics.checkNotNullParameter(firmwareVersion, "firmwareVersion");
                qa1.a aVar = a0.H(firmwareVersion, "6.0.0.", false) ? qa1.a.PILOT : qa1.a.BRANDED;
                int i2 = n.f261232a[aVar.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    batteryState -= 30;
                }
                qa1.e eVar = new qa1.e(batteryState, fVar, aVar);
                this.f261229b.d.f("KEY_CHARGE_STATE", eVar);
                return eVar;
            case 2:
                ta1.b execute2 = (ta1.b) obj2;
                Intrinsics.checkNotNullParameter(execute2, "$this$execute");
                q qVar = this.f261229b;
                tl0.a aVar2 = qVar.f261237b;
                byte[] caProd = execute2.getCaProd();
                Intrinsics.checkNotNullExpressionValue(caProd, "getCaProd(...)");
                String strD = aVar2.d(caProd);
                tl0.a aVar3 = qVar.f261237b;
                byte[] bArr = execute2.getkKek();
                Intrinsics.checkNotNullExpressionValue(bArr, "getkKek(...)");
                String strD2 = aVar3.d(bArr);
                byte[] bArr2 = execute2.H;
                if (bArr2 == null) {
                    Intrinsics.r("sredIksn");
                    throw null;
                }
                String strD3 = aVar3.d(bArr2);
                byte[] bArr3 = execute2.I;
                if (bArr3 != null) {
                    return new ra1.a(strD, strD2, strD3, aVar3.d(bArr3));
                }
                Intrinsics.r("pinIksn");
                throw null;
            default:
                EnterSecureSessionCommand execute3 = (EnterSecureSessionCommand) obj2;
                Intrinsics.checkNotNullParameter(execute3, "$this$execute");
                tl0.a aVar4 = this.f261229b.f261237b;
                byte[] ksn = execute3.getKsn();
                Intrinsics.checkNotNullExpressionValue(ksn, "getKsn(...)");
                return aVar4.d(ksn);
        }
    }
}
