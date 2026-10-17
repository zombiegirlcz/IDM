package dp5;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f116820h = {null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new dmj.b(7))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f116822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f116823c;
    public final Long d;
    public final Long e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f116824g;

    public /* synthetic */ x(int i, String str, long j2, long j3, Long l2, Long l3, long j5, List list) {
        if (127 != (i & CertificateBody.profileType)) {
            qlm.j1.f(v.f116815a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f116821a = str;
        this.f116822b = j2;
        this.f116823c = j3;
        this.d = l2;
        this.e = l3;
        this.f = j5;
        this.f116824g = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f116821a, xVar.f116821a) && this.f116822b == xVar.f116822b && this.f116823c == xVar.f116823c && Intrinsics.f(this.d, xVar.d) && Intrinsics.f(this.e, xVar.e) && this.f == xVar.f && Intrinsics.f(this.f116824g, xVar.f116824g);
    }

    public final int hashCode() {
        int iC = a0.d.c(a0.d.c(this.f116821a.hashCode() * 31, 31, this.f116822b), 31, this.f116823c);
        Long l2 = this.d;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.e;
        int iC2 = a0.d.c((iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.f);
        List list = this.f116824g;
        return iC2 + (list != null ? list.hashCode() : 0);
    }
}
