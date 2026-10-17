package q6i;

import com.revolut.feature_move_money.api.model.AccountSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountSource f242635a;

    public s(AccountSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f242635a = source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f242635a, ((s) obj2).f242635a);
    }

    public final int hashCode() {
        return this.f242635a.hashCode();
    }
}
