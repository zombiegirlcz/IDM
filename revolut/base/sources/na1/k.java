package na1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f213689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PairingInfo f213690c;

    public /* synthetic */ k(j jVar, PairingInfo pairingInfo, int i) {
        this.f213688a = i;
        this.f213689b = jVar;
        this.f213690c = pairingInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f213688a) {
            case 0:
                String sredKsn = (String) obj2;
                Intrinsics.checkNotNullParameter(sredKsn, "sredKsn");
                j jVar = this.f213689b;
                ha1.n nVar = jVar.f213687c;
                PairingInfo pairingInfo = this.f213690c;
                String terminalId = pairingInfo.f60566a;
                ha1.f fVar = (ha1.f) jVar.e;
                String svppFirmwareVersion = fVar.d();
                String bluetoothFirmwareVersion = fVar.a();
                nVar.getClass();
                Intrinsics.checkNotNullParameter(terminalId, "terminalId");
                Intrinsics.checkNotNullParameter(sredKsn, "sredKsn");
                Intrinsics.checkNotNullParameter(svppFirmwareVersion, "svppFirmwareVersion");
                Intrinsics.checkNotNullParameter(bluetoothFirmwareVersion, "bluetoothFirmwareVersion");
                ufm.i iVar = new ufm.i(new ufm.c(new ha1.g(sredKsn, svppFirmwareVersion, bluetoothFirmwareVersion, 1), 2), new h8b.m(new ha1.h(nVar, terminalId, 1), 28), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return new pfm.a(iVar, new e(9, new k(jVar, pairingInfo, 1)), 4);
            default:
                qa1.j it8 = (qa1.j) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                j jVar2 = this.f213689b;
                return jVar2.d.h(it8.f243945b).doOnNext(new e(10, new n7h.c(jVar2, 8))).ignoreElements().e(ha1.n.a(jVar2.f213687c, this.f213690c.f60566a, null, it8.f243944a, null, null, null, null, null, Constants.TAG_SUPPORTED_LOCALE_LIST));
        }
    }
}
