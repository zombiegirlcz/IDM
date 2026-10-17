package cd1;

import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();
    public static final e f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f23151c;
    public final dj0.d d;
    public final dj0.d e;

    static {
        f0 f0Var = f0.f322471a;
        dj0.c cVar = dj0.d.Companion;
        cVar.getClass();
        dj0.d dVar = dj0.d.e;
        cVar.getClass();
        cVar.getClass();
        f = new e(f0Var, 0, dVar, dVar, dVar);
    }

    public e(List cartItems, int i, dj0.d subtotalAmount, dj0.d totalTaxAmount, dj0.d totalAmount) {
        Intrinsics.checkNotNullParameter(cartItems, "cartItems");
        Intrinsics.checkNotNullParameter(subtotalAmount, "subtotalAmount");
        Intrinsics.checkNotNullParameter(totalTaxAmount, "totalTaxAmount");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        this.f23149a = cartItems;
        this.f23150b = i;
        this.f23151c = subtotalAmount;
        this.d = totalTaxAmount;
        this.e = totalAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f23149a, eVar.f23149a) && this.f23150b == eVar.f23150b && Intrinsics.f(this.f23151c, eVar.f23151c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(v7.c(j6.a.b(this.f23150b, this.f23149a.hashCode() * 31, 31), 31, this.f23151c), 31, this.d);
    }
}
