package ntj;

import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f219131c;
    public final String d;
    public final q1 e;
    public final n1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f219132g;

    public /* synthetic */ u(int i, String str, String str2, String str3, String str4, q1 q1Var, n1 n1Var, String str5) {
        if (127 != (i & CertificateBody.profileType)) {
            qlm.j1.f(s.f219122a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f219129a = str;
        this.f219130b = str2;
        this.f219131c = str3;
        this.d = str4;
        this.e = q1Var;
        this.f = n1Var;
        this.f219132g = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f219129a, uVar.f219129a) && Intrinsics.f(this.f219130b, uVar.f219130b) && Intrinsics.f(this.f219131c, uVar.f219131c) && Intrinsics.f(this.d, uVar.d) && Intrinsics.f(this.e, uVar.e) && Intrinsics.f(this.f, uVar.f) && Intrinsics.f(this.f219132g, uVar.f219132g);
    }

    public final int hashCode() {
        int iHashCode = this.f219129a.hashCode() * 31;
        String str = this.f219130b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f219131c);
        String str2 = this.d;
        int iHashCode2 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        q1 q1Var = this.e;
        int iHashCode3 = (iHashCode2 + (q1Var == null ? 0 : q1Var.f219114a.hashCode())) * 31;
        n1 n1Var = this.f;
        int iHashCode4 = (iHashCode3 + (n1Var == null ? 0 : n1Var.hashCode())) * 31;
        String str3 = this.f219132g;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public u(String title, String str, String status, String str2, q1 q1Var, n1 n1Var, String str3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f219129a = title;
        this.f219130b = str;
        this.f219131c = status;
        this.d = str2;
        this.e = q1Var;
        this.f = n1Var;
        this.f219132g = str3;
    }
}
