package e02;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f121377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f121378c;
    public final String d;
    public final String e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f121379g;

    public b(String keyAliasPrefix, c encodingStrategy, int i) {
        String str = (i & 8) != 0 ? null : "JWT";
        int i2 = (i & 32) != 0 ? 4096 : 2048;
        encodingStrategy = (i & 64) != 0 ? c.DOUBLE_BASE64 : encodingStrategy;
        Intrinsics.checkNotNullParameter(keyAliasPrefix, "keyAliasPrefix");
        Intrinsics.checkNotNullParameter("SHA256withRSA", "signatureAlgorithm");
        Intrinsics.checkNotNullParameter("RS256", "jwtAlgorithm");
        Intrinsics.checkNotNullParameter("SHA-256", "kidDigestAlgorithm");
        Intrinsics.checkNotNullParameter(encodingStrategy, "encodingStrategy");
        this.f121376a = keyAliasPrefix;
        this.f121377b = "SHA256withRSA";
        this.f121378c = "RS256";
        this.d = str;
        this.e = "SHA-256";
        this.f = i2;
        this.f121379g = encodingStrategy;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f121376a, bVar.f121376a) && Intrinsics.f(this.f121377b, bVar.f121377b) && Intrinsics.f(this.f121378c, bVar.f121378c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && this.f == bVar.f && this.f121379g == bVar.f121379g;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f121376a.hashCode() * 31, 31, this.f121377b), 31, this.f121378c);
        String str = this.d;
        return this.f121379g.hashCode() + j6.a.b(this.f, p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31);
    }
}
