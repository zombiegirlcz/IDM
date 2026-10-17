package avk;

import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.eac.CertificateBody;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n2h.f f10124b;

    public /* synthetic */ u(n2h.f fVar, int i) {
        this.f10123a = i;
        this.f10124b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f10123a) {
            case 0:
                return m.c((m) obj2, this.f10124b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65534);
            case 1:
                return bfh.c.a((bfh.c) obj2, null, null, null, this.f10124b, 31);
            case 2:
                return feh.g.e((feh.g) obj2, null, null, null, null, null, null, this.f10124b, CertificateBody.profileType);
            case 3:
                return o4h.e.a((o4h.e) obj2, null, null, this.f10124b, 3);
            case 4:
                return otk.f.a((otk.f) obj2, null, null, null, null, this.f10124b, 31);
            case 5:
                return puk.f.a((puk.f) obj2, null, null, null, null, null, this.f10124b, false, false, null, 479);
            case 6:
                return wfh.l.e((wfh.l) obj2, null, null, null, null, null, null, false, null, null, null, null, null, null, this.f10124b, null, null, null, null, null, null, 2080767);
            default:
                return wuk.j.f((wuk.j) obj2, null, null, this.f10124b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388603);
        }
    }
}
