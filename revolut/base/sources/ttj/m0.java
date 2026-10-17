package ttj;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class m0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f274368h = {null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new ts1.h(10))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f274371c;
    public final String d;
    public final String e;
    public final j0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f274372g;

    public /* synthetic */ m0(int i, String str, String str2, String str3, String str4, String str5, j0 j0Var, List list) {
        if (127 != (i & CertificateBody.profileType)) {
            qlm.j1.f(k0.f274362a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f274369a = str;
        this.f274370b = str2;
        this.f274371c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j0Var;
        this.f274372g = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f274369a, m0Var.f274369a) && Intrinsics.f(this.f274370b, m0Var.f274370b) && Intrinsics.f(this.f274371c, m0Var.f274371c) && Intrinsics.f(this.d, m0Var.d) && Intrinsics.f(this.e, m0Var.e) && Intrinsics.f(this.f, m0Var.f) && Intrinsics.f(this.f274372g, m0Var.f274372g);
    }

    public final int hashCode() {
        return this.f274372g.hashCode() + ((this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(this.f274369a.hashCode() * 31, 31, this.f274370b), 31, this.f274371c), 31, this.d), 31, this.e)) * 31);
    }
}
