package re3;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f253505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f253506c;
    public final String d;
    public final double e;
    public final Instant f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Instant f253507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Double f253508h;
    public final Double i;

    public /* synthetic */ c(int i, String str, String str2, String str3, String str4, double d, Instant instant, Instant instant2, Double d5, Double d6) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(a.f253503a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f253504a = str;
        this.f253505b = str2;
        this.f253506c = str3;
        this.d = str4;
        this.e = d;
        this.f = instant;
        this.f253507g = instant2;
        if ((i & 128) == 0) {
            this.f253508h = null;
        } else {
            this.f253508h = d5;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = d6;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f253504a, cVar.f253504a) && Intrinsics.f(this.f253505b, cVar.f253505b) && Intrinsics.f(this.f253506c, cVar.f253506c) && Intrinsics.f(this.d, cVar.d) && Double.compare(this.e, cVar.e) == 0 && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f253507g, cVar.f253507g) && Intrinsics.f(this.f253508h, cVar.f253508h) && Intrinsics.f(this.i, cVar.i);
    }

    public final int hashCode() {
        int iC = r6.b.c(r6.b.c(m72.b.c(p.a.c(p.a.c(p.a.c(this.f253504a.hashCode() * 31, 31, this.f253505b), 31, this.f253506c), 31, this.d), this.e, 31), 31, this.f), 31, this.f253507g);
        Double d = this.f253508h;
        int iHashCode = (iC + (d == null ? 0 : d.hashCode())) * 31;
        Double d5 = this.i;
        return iHashCode + (d5 != null ? d5.hashCode() : 0);
    }
}
