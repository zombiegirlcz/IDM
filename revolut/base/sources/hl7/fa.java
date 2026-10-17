package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class fa {

    @NotNull
    public static final ea Companion = new ea();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153107c;
    public final int d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f153108g;

    public /* synthetic */ fa(int i, String str, String str2, String str3, int i2, String str4, String str5, boolean z) {
        if (127 != (i & CertificateBody.profileType)) {
            qlm.j1.f(da.f153071a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f153105a = str;
        this.f153106b = str2;
        this.f153107c = str3;
        this.d = i2;
        this.e = str4;
        this.f = str5;
        this.f153108g = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof fa)) {
            return false;
        }
        fa faVar = (fa) obj2;
        return Intrinsics.f(this.f153105a, faVar.f153105a) && Intrinsics.f(this.f153106b, faVar.f153106b) && Intrinsics.f(this.f153107c, faVar.f153107c) && this.d == faVar.d && Intrinsics.f(this.e, faVar.e) && Intrinsics.f(this.f, faVar.f) && this.f153108g == faVar.f153108g;
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.b(this.d, p.a.c(p.a.c(this.f153105a.hashCode() * 31, 31, this.f153106b), 31, this.f153107c), 31), 31, this.e);
        String str = this.f;
        return Boolean.hashCode(this.f153108g) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
