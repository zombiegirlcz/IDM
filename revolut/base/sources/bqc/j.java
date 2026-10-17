package bqc;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f17807h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f17809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17810c;
    public final String d;
    public final long e;
    public final k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f17811g;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f17807h = new Lazy[]{null, yhm.j.c(kVar, new bkd.a(24)), null, null, null, yhm.j.c(kVar, new bkd.a(25)), null};
    }

    public /* synthetic */ j(int i, String str, h hVar, String str2, String str3, long j2, k kVar, long j3) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(g.f17806a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f17808a = str;
        this.f17809b = hVar;
        this.f17810c = str2;
        this.d = str3;
        this.e = j2;
        this.f = kVar;
        this.f17811g = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f17808a, jVar.f17808a) && this.f17809b == jVar.f17809b && Intrinsics.f(this.f17810c, jVar.f17810c) && Intrinsics.f(this.d, jVar.d) && this.e == jVar.e && this.f == jVar.f && this.f17811g == jVar.f17811g;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17811g) + ((this.f.hashCode() + a0.d.c(p.a.c(p.a.c((this.f17809b.hashCode() + (this.f17808a.hashCode() * 31)) * 31, 31, this.f17810c), 31, this.d), 31, this.e)) * 31);
    }
}
