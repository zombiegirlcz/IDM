package xod;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f307820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MoneyClause f307821b;

    public q(Clause label, MoneyClause value) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f307820a = label;
        this.f307821b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f307820a, qVar.f307820a) && this.f307821b.equals(qVar.f307821b);
    }

    public final int hashCode() {
        return this.f307821b.hashCode() + (this.f307820a.hashCode() * 31);
    }
}
