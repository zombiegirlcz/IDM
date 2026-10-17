package u6c;

import ip0.v7;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class h0 {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f277557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f277558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f277559c;
    public final t d;
    public final String e;
    public final u f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f277560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f277561h;

    public h0(String paymentMethodId, String str, dj0.d amount, t product, String str2, u uVar, boolean z) {
        zhm.h0 checks = zhm.h0.f322473a;
        Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(checks, "checks");
        this.f277557a = paymentMethodId;
        this.f277558b = str;
        this.f277559c = amount;
        this.d = product;
        this.e = str2;
        this.f = uVar;
        this.f277560g = checks;
        this.f277561h = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f277557a, h0Var.f277557a) && Intrinsics.f(this.f277558b, h0Var.f277558b) && Intrinsics.f(this.f277559c, h0Var.f277559c) && this.d == h0Var.d && Intrinsics.f(this.e, h0Var.e) && this.f == h0Var.f && Intrinsics.f(this.f277560g, h0Var.f277560g) && this.f277561h == h0Var.f277561h;
    }

    public final int hashCode() {
        int iHashCode = this.f277557a.hashCode() * 31;
        String str = this.f277558b;
        int iHashCode2 = (this.d.hashCode() + v7.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f277559c)) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        u uVar = this.f;
        return Boolean.hashCode(this.f277561h) + p.a.f((iHashCode3 + (uVar != null ? uVar.hashCode() : 0)) * 31, 31, this.f277560g);
    }
}
