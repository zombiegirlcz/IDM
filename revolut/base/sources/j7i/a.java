package j7i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountWrapper f171918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountWrapper f171919b;

    public a(AccountWrapper source, AccountWrapper target) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        this.f171918a = source;
        this.f171919b = target;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f171918a, aVar.f171918a) && Intrinsics.f(this.f171919b, aVar.f171919b);
    }

    public final int hashCode() {
        return this.f171919b.hashCode() + (this.f171918a.hashCode() * 31);
    }
}
