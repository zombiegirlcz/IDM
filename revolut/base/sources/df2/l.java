package df2;

import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class l {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f113772h = {null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new dce.b(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo3.a f113773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113775c;
    public final k d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f113776g;

    public /* synthetic */ l(int i, jo3.a aVar, String str, String str2, k kVar, String str3, String str4, Map map) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(g.f113767a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f113773a = aVar;
        this.f113774b = str;
        this.f113775c = str2;
        this.d = kVar;
        this.e = str3;
        this.f = str4;
        this.f113776g = map;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f113773a, lVar.f113773a) && Intrinsics.f(this.f113774b, lVar.f113774b) && Intrinsics.f(this.f113775c, lVar.f113775c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && Intrinsics.f(this.f113776g, lVar.f113776g);
    }

    public final int hashCode() {
        jo3.a aVar = this.f113773a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        String str = this.f113774b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f113775c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        k kVar = this.d;
        int iHashCode4 = (iHashCode3 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map map = this.f113776g;
        return iHashCode6 + (map != null ? map.hashCode() : 0);
    }
}
