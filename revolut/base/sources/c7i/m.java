package c7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountWrapper f22014a;

    public m(AccountWrapper accountWrapper) {
        Intrinsics.checkNotNullParameter(accountWrapper, "accountWrapper");
        this.f22014a = accountWrapper;
    }

    @Override // c7i.o
    public final AccountWrapper a() {
        return this.f22014a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f22014a, ((m) obj2).f22014a);
    }

    @Override // c7i.o
    public final xi0.b getCurrency() {
        return this.f22014a.getCurrency();
    }

    public final int hashCode() {
        return this.f22014a.hashCode();
    }
}
