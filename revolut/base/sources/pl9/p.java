package pl9;

import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f237303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f237304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f237305c;
    public final long d;
    public final String e;
    public final s f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f237306g;

    public /* synthetic */ p(int i, long j2, long j3, String str, long j5, String str2, s sVar, m mVar) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(n.f237302a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f237303a = j2;
        this.f237304b = j3;
        this.f237305c = str;
        this.d = j5;
        this.e = str2;
        this.f = sVar;
        this.f237306g = mVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f237303a == pVar.f237303a && this.f237304b == pVar.f237304b && Intrinsics.f(this.f237305c, pVar.f237305c) && this.d == pVar.d && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f) && Intrinsics.f(this.f237306g, pVar.f237306g);
    }

    public final int hashCode() {
        return this.f237306g.hashCode() + ((this.f.hashCode() + p.a.c(a0.d.c(p.a.c(a0.d.c(Long.hashCode(this.f237303a) * 31, 31, this.f237304b), 31, this.f237305c), 31, this.d), 31, this.e)) * 31);
    }
}
