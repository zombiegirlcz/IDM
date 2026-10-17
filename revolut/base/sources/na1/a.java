package na1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice;
import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ma1.t;
import n8i.q0;
import te0.w;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f213670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PairingInfo f213671c;

    public /* synthetic */ a(g gVar, PairingInfo pairingInfo, int i) {
        this.f213669a = i;
        this.f213670b = gVar;
        this.f213671c = pairingInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f213669a) {
            case 0:
                ra1.a loadKeyInfo = (ra1.a) obj2;
                Intrinsics.checkNotNullParameter(loadKeyInfo, "loadKeyInfo");
                g gVar = this.f213670b;
                ha1.n nVar = gVar.f213680b;
                PairingInfo pairingInfo = this.f213671c;
                String terminalId = pairingInfo.f60566a;
                String prodCert = loadKeyInfo.f252775a;
                String kekCert = loadKeyInfo.f252776b;
                ha1.f fVar = (ha1.f) gVar.f213681c;
                String svppFirmwareVersion = fVar.d();
                String bluetoothFirmwareVersion = fVar.a();
                nVar.getClass();
                Intrinsics.checkNotNullParameter(terminalId, "terminalId");
                Intrinsics.checkNotNullParameter(prodCert, "prodCert");
                Intrinsics.checkNotNullParameter(kekCert, "kekCert");
                Intrinsics.checkNotNullParameter(svppFirmwareVersion, "svppFirmwareVersion");
                Intrinsics.checkNotNullParameter(bluetoothFirmwareVersion, "bluetoothFirmwareVersion");
                ufm.i iVar = new ufm.i(new ufm.c(new ha1.l(prodCert, kekCert, svppFirmwareVersion, bluetoothFirmwareVersion, 1), 2), new ha1.j(13, new ha1.h(nVar, terminalId, 4)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return new pfm.a(w.i0(iVar), new e(2, new a(gVar, pairingInfo, 1)), 4);
            default:
                qa1.g it8 = (qa1.g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ArrayList arrayList = it8.f243937b;
                efm.r rVarFromIterable = efm.r.fromIterable(arrayList);
                g gVar2 = this.f213670b;
                pfm.a aVarE = rVarFromIterable.concatMapCompletable(new e(3, new b(gVar2, 1))).e(efm.r.interval(1L, TimeUnit.SECONDS).take(20L).doOnSubscribe(new e(4, new q0(2))).doOnComplete(new bji.a(7)).ignoreElements());
                da1.d dVar = gVar2.e;
                CardReaderDevice cardReaderDeviceB = ((ha1.f) gVar2.f213681c).b();
                if (cardReaderDeviceB == null) {
                    throw new IllegalArgumentException("Card reader is not saved yet");
                }
                pfm.a aVarE2 = aVarE.e(((t) dVar).a(cardReaderDeviceB));
                Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                pfm.a aVar = new pfm.a(aVarE2, new e(0, new n45.b((qa1.h) d0.b0(arrayList), gVar2, 23)), 2);
                Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
                return aVar.e(ha1.n.a(gVar2.f213680b, this.f213671c.f60566a, null, null, null, it8.f243936a, null, null, null, Constants.TAG_EE_SUPPORTED_RPC_ID_LIST));
        }
    }
}
