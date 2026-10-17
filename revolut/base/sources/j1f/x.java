package j1f;

import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170443c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f170444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g0 f170445h;
    public final u i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f170446j;

    public /* synthetic */ x(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, g0 g0Var, u uVar, String str8) {
        if (127 != (i & CertificateBody.profileType)) {
            j1.f(v.f170439a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f170441a = str;
        this.f170442b = str2;
        this.f170443c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f170444g = str7;
        if ((i & 128) == 0) {
            this.f170445h = null;
        } else {
            this.f170445h = g0Var;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = uVar;
        }
        if ((i & 512) == 0) {
            this.f170446j = null;
        } else {
            this.f170446j = str8;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f170441a, xVar.f170441a) && Intrinsics.f(this.f170442b, xVar.f170442b) && Intrinsics.f(this.f170443c, xVar.f170443c) && Intrinsics.f(this.d, xVar.d) && Intrinsics.f(this.e, xVar.e) && Intrinsics.f(this.f, xVar.f) && Intrinsics.f(this.f170444g, xVar.f170444g) && Intrinsics.f(this.f170445h, xVar.f170445h) && Intrinsics.f(this.i, xVar.i) && Intrinsics.f(this.f170446j, xVar.f170446j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f170441a.hashCode() * 31, 31, this.f170442b), 31, this.f170443c), 31, this.d), 31, this.e), 31, this.f), 31, this.f170444g);
        g0 g0Var = this.f170445h;
        int iHashCode = (iC + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        u uVar = this.i;
        int iHashCode2 = (iHashCode + (uVar == null ? 0 : uVar.hashCode())) * 31;
        String str = this.f170446j;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public x(String id10, String product, String name, String description, String logoUrl, String signupUrl, String accountLinkType, g0 g0Var, u uVar, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(signupUrl, "signupUrl");
        Intrinsics.checkNotNullParameter(accountLinkType, "accountLinkType");
        this.f170441a = id10;
        this.f170442b = product;
        this.f170443c = name;
        this.d = description;
        this.e = logoUrl;
        this.f = signupUrl;
        this.f170444g = accountLinkType;
        this.f170445h = g0Var;
        this.i = uVar;
        this.f170446j = str;
    }
}
