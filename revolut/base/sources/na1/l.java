package na1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.PairingInfo;
import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f213692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PairingInfo f213693c;

    public /* synthetic */ l(m mVar, PairingInfo pairingInfo, int i) {
        this.f213691a = i;
        this.f213692b = mVar;
        this.f213693c = pairingInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f213691a) {
            case 0:
                ra1.a loadKeyInfo = (ra1.a) obj2;
                Intrinsics.checkNotNullParameter(loadKeyInfo, "loadKeyInfo");
                m mVar = this.f213692b;
                ha1.n nVar = mVar.f213695c;
                PairingInfo pairingInfo = this.f213693c;
                String terminalId = pairingInfo.f60566a;
                String prodCert = loadKeyInfo.f252775a;
                String kekCert = loadKeyInfo.f252776b;
                String sredIksn = loadKeyInfo.f252777c;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(terminalId, "terminalId");
                Intrinsics.checkNotNullParameter(prodCert, "prodCert");
                Intrinsics.checkNotNullParameter(kekCert, "kekCert");
                Intrinsics.checkNotNullParameter(sredIksn, "sredIksn");
                d0<ga1.h> dekUpdate = nVar.f150372a.getDekUpdate(terminalId, new ga1.g(prodCert, kekCert, sredIksn));
                ha1.j jVar = new ha1.j(14, new ha1.k(3));
                dekUpdate.getClass();
                ufm.i iVar = new ufm.i(dekUpdate, jVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return new pfm.a(w.i0(ea1.b.d(iVar, "POST: Getting DEK update")), new e(12, new l(mVar, pairingInfo, 1)), 4);
            default:
                qa1.i keyBinaryUpdate = (qa1.i) obj2;
                Intrinsics.checkNotNullParameter(keyBinaryUpdate, "keyBinaryUpdate");
                m mVar2 = this.f213692b;
                return mVar2.d.g(keyBinaryUpdate.f243943b).l(new i1i.a(mVar2, 18)).e(ha1.n.a(mVar2.f213695c, this.f213693c.f60566a, null, null, null, null, null, keyBinaryUpdate.f243942a, null, 190));
        }
    }
}
