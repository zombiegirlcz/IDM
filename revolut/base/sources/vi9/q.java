package vi9;

import com.revolut.core.ui_kit.models.MoneyClause;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f289550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyClause f289551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f289552c;

    public q(int i, int i2, MoneyClause amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f289550a = i;
        this.f289551b = amount;
        this.f289552c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f289550a == qVar.f289550a && Intrinsics.f(this.f289551b, qVar.f289551b) && this.f289552c == qVar.f289552c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f289552c) + v7.a(Integer.hashCode(this.f289550a) * 31, 31, this.f289551b);
    }
}
