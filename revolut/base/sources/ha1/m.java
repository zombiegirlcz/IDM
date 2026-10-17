package ha1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import efm.d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f150370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qa1.b f150371c;

    public /* synthetic */ m(n nVar, qa1.b bVar, int i) {
        this.f150369a = i;
        this.f150370b = nVar;
        this.f150371c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f150369a) {
            case 0:
                ga1.k requestDto = (ga1.k) obj2;
                Intrinsics.checkNotNullParameter(requestDto, "requestDto");
                n nVar = this.f150370b;
                d0<ga1.l> d0VarPairTerminal = nVar.f150372a.pairTerminal(requestDto);
                j jVar = new j(11, new i(nVar, 3));
                d0VarPairTerminal.getClass();
                ufm.i iVar = new ufm.i(d0VarPairTerminal, jVar, 2);
                Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
                ufm.f fVar = new ufm.f(new ufm.i(iVar, new j(9, new i(nVar, 2)), 1), new j(10, new m(nVar, this.f150371c, 1)), 3);
                Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                return ea1.b.d(fVar, "POST: Getting pairing info");
            default:
                PairingInfo pairingInfo = (PairingInfo) obj2;
                ca1.a aVar = this.f150370b.f150373b;
                Intrinsics.h(pairingInfo);
                f fVar2 = (f) aVar;
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(pairingInfo, "pairingInfo");
                ne0.j jVar2 = fVar2.f150354b;
                jVar2.f("KEY_PAIRING_INFO", pairingInfo);
                z9h.n.l(String.class, fVar2.f150353a, "KEY_TERMINAL_ID", pairingInfo.f60566a);
                qa1.b bVar = this.f150371c;
                String value = bVar.f243931b;
                Intrinsics.checkNotNullParameter(value, "value");
                jVar2.f("KEY_SVPP_FIRMWARE_VERSION", value);
                String value2 = bVar.f243932c;
                Intrinsics.checkNotNullParameter(value2, "value");
                jVar2.f("KEY_BLUETOOTH_FIRMWARE_VERSION", value2);
                boolean z = pairingInfo.d;
                boolean z3 = pairingInfo.e;
                boolean z4 = pairingInfo.f;
                boolean z6 = pairingInfo.f60569g;
                boolean z11 = pairingInfo.f60570h;
                boolean z12 = pairingInfo.i;
                boolean z29 = pairingInfo.f60571j;
                String str = pairingInfo.k;
                StringBuilder sb6 = new StringBuilder("\n            PairingInfo(dekUpdate=");
                sb6.append(z);
                sb6.append(", pekUpdate=");
                sb6.append(z3);
                sb6.append(", contactParamsUpdate=");
                t61.a.y(sb6, z4, ", \n            contactlessParamsUpdate=", z6, ", firmwareUpdate=");
                t61.a.y(sb6, z11, ", \n            terminalParamsUpdate=", z12, ", bluetoothFirmwareUpdate=");
                sb6.append(z29);
                sb6.append(", \n            locale='");
                sb6.append(str);
                sb6.append("')\n        ");
                ea1.b.a("Pair Terminal Response: " + kotlin.text.t.e(sb6.toString()), fa1.k.INFO);
                return Unit.f186387a;
        }
    }
}
