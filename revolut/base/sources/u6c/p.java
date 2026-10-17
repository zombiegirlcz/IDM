package u6c;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f277573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f277574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f277575c;
    public final t d;
    public final Long e;
    public final xi0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f277576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f277577h;

    public /* synthetic */ p(String str, String str2, u uVar, t tVar, Long l2, xi0.b bVar, boolean z, int i) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : uVar, tVar, l2, bVar, (i & 64) != 0 ? false : z, false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f277573a, pVar.f277573a) && Intrinsics.f(this.f277574b, pVar.f277574b) && this.f277575c == pVar.f277575c && this.d == pVar.d && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f) && this.f277576g == pVar.f277576g && this.f277577h == pVar.f277577h;
    }

    public final int hashCode() {
        int iHashCode = this.f277573a.hashCode() * 31;
        String str = this.f277574b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        u uVar = this.f277575c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (uVar == null ? 0 : uVar.hashCode())) * 31)) * 31;
        Long l2 = this.e;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        xi0.b bVar = this.f;
        return Boolean.hashCode(this.f277577h) + j6.a.c((iHashCode4 + (bVar != null ? bVar.hashCode() : 0)) * 31, 31, this.f277576g);
    }

    public p(String paymentMethodId, String str, u uVar, t product, Long l2, xi0.b bVar, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f277573a = paymentMethodId;
        this.f277574b = str;
        this.f277575c = uVar;
        this.d = product;
        this.e = l2;
        this.f = bVar;
        this.f277576g = z;
        this.f277577h = z3;
    }
}
