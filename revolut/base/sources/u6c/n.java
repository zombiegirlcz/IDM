package u6c;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f277568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f277569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f277570c;
    public final Long d;
    public final xi0.b e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f277571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f277572h;
    public final String i;

    public n(String str, u uVar, t product, Long l2, xi0.b bVar, boolean z, String str2, String str3, int i) {
        str = (i & 1) != 0 ? null : str;
        uVar = (i & 2) != 0 ? null : uVar;
        z = (i & 64) != 0 ? false : z;
        str2 = (i & 256) != 0 ? null : str2;
        str3 = (i & 512) != 0 ? null : str3;
        Intrinsics.checkNotNullParameter(product, "product");
        this.f277568a = str;
        this.f277569b = uVar;
        this.f277570c = product;
        this.d = l2;
        this.e = bVar;
        this.f = false;
        this.f277571g = z;
        this.f277572h = str2;
        this.i = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f277568a, nVar.f277568a) && this.f277569b == nVar.f277569b && this.f277570c == nVar.f277570c && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e) && this.f == nVar.f && this.f277571g == nVar.f277571g && Intrinsics.f(this.f277572h, nVar.f277572h) && Intrinsics.f(this.i, nVar.i);
    }

    public final int hashCode() {
        String str = this.f277568a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        u uVar = this.f277569b;
        int iHashCode2 = (this.f277570c.hashCode() + ((iHashCode + (uVar == null ? 0 : uVar.hashCode())) * 31)) * 31;
        Long l2 = this.d;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        xi0.b bVar = this.e;
        int iC = j6.a.c(j6.a.c(j6.a.c((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f), 31, this.f277571g), 31, false);
        String str2 = this.f277572h;
        int iHashCode4 = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
