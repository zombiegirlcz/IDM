package b6i;

import com.revolut.feature_move_money.api.model.OrderMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x5i.a f12831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x5i.a f12832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OrderMode f12833c;

    public v(x5i.a sourceAmount, x5i.a targetAmount, OrderMode orderMode) {
        Intrinsics.checkNotNullParameter(sourceAmount, "sourceAmount");
        Intrinsics.checkNotNullParameter(targetAmount, "targetAmount");
        Intrinsics.checkNotNullParameter(orderMode, "orderMode");
        this.f12831a = sourceAmount;
        this.f12832b = targetAmount;
        this.f12833c = orderMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f12831a, vVar.f12831a) && Intrinsics.f(this.f12832b, vVar.f12832b) && Intrinsics.f(this.f12833c, vVar.f12833c);
    }

    public final int hashCode() {
        return this.f12833c.hashCode() + ((this.f12832b.hashCode() + (this.f12831a.hashCode() * 31)) * 31);
    }
}
