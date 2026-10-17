package il7;

import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f162107c;
    public final int d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f162108g;

    public /* synthetic */ g0(int i, String str, String str2, String str3, int i2, String str4, String str5, boolean z) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(e0.f162100a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f162105a = str;
        this.f162106b = str2;
        this.f162107c = str3;
        this.d = i2;
        this.e = str4;
        this.f = str5;
        this.f162108g = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f162105a, g0Var.f162105a) && Intrinsics.f(this.f162106b, g0Var.f162106b) && Intrinsics.f(this.f162107c, g0Var.f162107c) && this.d == g0Var.d && Intrinsics.f(this.e, g0Var.e) && Intrinsics.f(this.f, g0Var.f) && this.f162108g == g0Var.f162108g;
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.b(this.d, p.a.c(p.a.c(this.f162105a.hashCode() * 31, 31, this.f162106b), 31, this.f162107c), 31), 31, this.e);
        String str = this.f;
        return Boolean.hashCode(this.f162108g) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    public g0(int i, String type, String title, String subtitle, String level, String str, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(level, "level");
        this.f162105a = type;
        this.f162106b = title;
        this.f162107c = subtitle;
        this.d = i;
        this.e = level;
        this.f = str;
        this.f162108g = z;
    }
}
