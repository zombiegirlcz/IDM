package nr6;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f218560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f218561b;

    public g0(dj0.d balance, ArrayList orders) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.f218560a = balance;
        this.f218561b = orders;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return this.f218560a.equals(g0Var.f218560a) && this.f218561b.equals(g0Var.f218561b);
    }

    public final int hashCode() {
        return this.f218561b.hashCode() + (this.f218560a.hashCode() * 31);
    }
}
