package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153280c;
    public final String d;
    public final o e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f153281g;

    public /* synthetic */ r(int i, String str, String str2, String str3, String str4, o oVar, String str5, String str6) {
        if (127 != (i & CertificateBody.profileType)) {
            qlm.j1.f(p.f153247a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f153278a = str;
        this.f153279b = str2;
        this.f153280c = str3;
        this.d = str4;
        this.e = oVar;
        this.f = str5;
        this.f153281g = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f153278a, rVar.f153278a) && Intrinsics.f(this.f153279b, rVar.f153279b) && Intrinsics.f(this.f153280c, rVar.f153280c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f) && Intrinsics.f(this.f153281g, rVar.f153281g);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f153278a.hashCode() * 31, 31, this.f153279b), 31, this.f153280c), 31, this.d);
        o oVar = this.e;
        int iHashCode = (iC + (oVar == null ? 0 : oVar.hashCode())) * 31;
        String str = this.f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f153281g;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
