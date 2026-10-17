package z7i;

import com.revolut.shared.feature.move_money.api.model.MoveMoneyReasonConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyReasonConfig f320017a;

    public h(MoveMoneyReasonConfig moveMoneyReasonConfig) {
        Intrinsics.checkNotNullParameter(moveMoneyReasonConfig, "moveMoneyReasonConfig");
        this.f320017a = moveMoneyReasonConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f320017a, ((h) obj2).f320017a);
    }

    public final int hashCode() {
        return this.f320017a.hashCode();
    }
}
