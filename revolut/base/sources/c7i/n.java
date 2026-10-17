package c7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f22017a;

    public n(xi0.b baseCurrency) {
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        this.f22017a = baseCurrency;
    }

    @Override // c7i.o
    public final AccountWrapper a() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f22017a, ((n) obj2).f22017a);
    }

    @Override // c7i.o
    public final xi0.b getCurrency() {
        return this.f22017a;
    }

    public final int hashCode() {
        return this.f22017a.hashCode();
    }
}
