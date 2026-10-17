package na1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f213704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PairingInfo f213705c;

    public /* synthetic */ r(m mVar, PairingInfo pairingInfo, int i) {
        this.f213703a = i;
        this.f213704b = mVar;
        this.f213705c = pairingInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f213703a) {
            case 0:
                ra1.a loadKeyInfo = (ra1.a) obj2;
                Intrinsics.checkNotNullParameter(loadKeyInfo, "loadKeyInfo");
                m mVar = this.f213704b;
                ha1.n nVar = mVar.f213695c;
                PairingInfo pairingInfo = this.f213705c;
                String terminalId = pairingInfo.f60566a;
                String prodCert = loadKeyInfo.f252775a;
                String kekCert = loadKeyInfo.f252776b;
                String pinIksn = loadKeyInfo.d;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(terminalId, "terminalId");
                Intrinsics.checkNotNullParameter(prodCert, "prodCert");
                Intrinsics.checkNotNullParameter(kekCert, "kekCert");
                Intrinsics.checkNotNullParameter(pinIksn, "pinIksn");
                d0<ga1.h> pekUpdate = nVar.f150372a.getPekUpdate(terminalId, new ga1.g(prodCert, kekCert, pinIksn));
                ha1.j jVar = new ha1.j(0, new h8b.l(27));
                pekUpdate.getClass();
                ufm.i iVar = new ufm.i(pekUpdate, jVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return new pfm.a(w.i0(ea1.b.d(iVar, "POST: Getting PEK update")), new e(22, new r(mVar, pairingInfo, 1)), 4);
            default:
                qa1.i keyBinaryUpdate = (qa1.i) obj2;
                Intrinsics.checkNotNullParameter(keyBinaryUpdate, "keyBinaryUpdate");
                m mVar2 = this.f213704b;
                return mVar2.d.g(keyBinaryUpdate.f243943b).l(new i1i.a(mVar2, 19)).e(ha1.n.a(mVar2.f213695c, this.f213705c.f60566a, null, null, null, null, keyBinaryUpdate.f243942a, null, null, 222));
        }
    }
}
