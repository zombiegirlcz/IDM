package dp5;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class h1 {

    @NotNull
    public static final g1 Companion = new g1();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f116760h = {null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new dmj.b(9))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f116762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f116763c;
    public final Long d;
    public final Long e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f116764g;

    public /* synthetic */ h1(int i, String str, long j2, Long l2, Long l3, Long l4, long j3, List list) {
        if (127 != (i & CertificateBody.profileType)) {
            qlm.j1.f(f1.f116755a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f116761a = str;
        this.f116762b = j2;
        this.f116763c = l2;
        this.d = l3;
        this.e = l4;
        this.f = j3;
        this.f116764g = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj2;
        return Intrinsics.f(this.f116761a, h1Var.f116761a) && this.f116762b == h1Var.f116762b && Intrinsics.f(this.f116763c, h1Var.f116763c) && Intrinsics.f(this.d, h1Var.d) && Intrinsics.f(this.e, h1Var.e) && this.f == h1Var.f && Intrinsics.f(this.f116764g, h1Var.f116764g);
    }

    public final int hashCode() {
        int iC = a0.d.c(this.f116761a.hashCode() * 31, 31, this.f116762b);
        Long l2 = this.f116763c;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.d;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.e;
        int iC2 = a0.d.c((iHashCode2 + (l4 == null ? 0 : l4.hashCode())) * 31, 31, this.f);
        List list = this.f116764g;
        return iC2 + (list != null ? list.hashCode() : 0);
    }
}
