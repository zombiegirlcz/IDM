package b6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.api.model.OrderMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f12839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountWrapper f12840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountWrapper f12841c;
    public final OrderMode d;

    public z(l mode, AccountWrapper targetPocket, AccountWrapper sourcePocket, OrderMode orderMode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(targetPocket, "targetPocket");
        Intrinsics.checkNotNullParameter(sourcePocket, "sourcePocket");
        Intrinsics.checkNotNullParameter(orderMode, "orderMode");
        this.f12839a = mode;
        this.f12840b = targetPocket;
        this.f12841c = sourcePocket;
        this.d = orderMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f12839a == zVar.f12839a && Intrinsics.f(this.f12840b, zVar.f12840b) && Intrinsics.f(this.f12841c, zVar.f12841c) && Intrinsics.f(this.d, zVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f12841c.hashCode() + ((this.f12840b.hashCode() + (this.f12839a.hashCode() * 31)) * 31)) * 31);
    }
}
