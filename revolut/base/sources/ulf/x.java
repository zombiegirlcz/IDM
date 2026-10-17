package ulf;

import com.revolut.shared.feature.move_money.api.navigation.Action;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Action.MoveWithFixedAccount f281001a;

    public x(Action.MoveWithFixedAccount action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f281001a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && this.f281001a.equals(((x) obj2).f281001a);
    }

    public final int hashCode() {
        return this.f281001a.hashCode();
    }
}
