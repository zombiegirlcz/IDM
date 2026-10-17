package w7g;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import w5b.b6;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f295533h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f295536c;
    public final List d;
    public final List e;
    public final z7g.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f295537g;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f295533h = new Lazy[]{null, null, yhm.j.c(kVar, new b6(16)), yhm.j.c(kVar, new b6(17)), yhm.j.c(kVar, new b6(18)), null, null};
    }

    public /* synthetic */ l(int i, String str, String str2, List list, List list2, List list3, z7g.c cVar, boolean z) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(j.f295532a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f295534a = str;
        this.f295535b = str2;
        this.f295536c = list;
        this.d = list2;
        this.e = list3;
        this.f = cVar;
        this.f295537g = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f295534a, lVar.f295534a) && Intrinsics.f(this.f295535b, lVar.f295535b) && Intrinsics.f(this.f295536c, lVar.f295536c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && this.f295537g == lVar.f295537g;
    }

    public final int hashCode() {
        int iHashCode = this.f295534a.hashCode() * 31;
        String str = this.f295535b;
        return Boolean.hashCode(this.f295537g) + ((this.f.hashCode() + p.a.d(p.a.d(p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f295536c), 31, this.d), 31, this.e)) * 31);
    }
}
