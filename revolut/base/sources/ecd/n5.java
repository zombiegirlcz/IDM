package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class n5 {

    @NotNull
    public static final g5 Companion = new g5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f124627c;
    public final String d;
    public final String e;
    public final b4 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j5 f124628g;

    public /* synthetic */ n5(int i, String str, String str2, String str3, String str4, String str5, b4 b4Var, j5 j5Var) {
        if (127 != (i & CertificateBody.profileType)) {
            qlm.j1.f(f5.f124547a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f124625a = str;
        this.f124626b = str2;
        this.f124627c = str3;
        this.d = str4;
        this.e = str5;
        this.f = b4Var;
        this.f124628g = j5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n5)) {
            return false;
        }
        n5 n5Var = (n5) obj2;
        return Intrinsics.f(this.f124625a, n5Var.f124625a) && Intrinsics.f(this.f124626b, n5Var.f124626b) && Intrinsics.f(this.f124627c, n5Var.f124627c) && Intrinsics.f(this.d, n5Var.d) && Intrinsics.f(this.e, n5Var.e) && Intrinsics.f(this.f, n5Var.f) && Intrinsics.f(this.f124628g, n5Var.f124628g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f124625a.hashCode() * 31, 31, this.f124626b);
        String str = this.f124627c;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        b4 b4Var = this.f;
        int iHashCode2 = (iHashCode + (b4Var == null ? 0 : b4Var.hashCode())) * 31;
        j5 j5Var = this.f124628g;
        return iHashCode2 + (j5Var != null ? j5Var.hashCode() : 0);
    }

    public n5(String id10, String type, String str, String name, String str2, b4 b4Var, j5 j5Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f124625a = id10;
        this.f124626b = type;
        this.f124627c = str;
        this.d = name;
        this.e = str2;
        this.f = b4Var;
        this.f124628g = j5Var;
    }
}
