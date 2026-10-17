package zc0;

import com.revolut.feature.backend_flow.domain.models.Action;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i3 extends k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Action f321065b;

    public i3(String itemId, Action action) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f321064a = itemId;
        this.f321065b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj2;
        return Intrinsics.f(this.f321064a, i3Var.f321064a) && Intrinsics.f(this.f321065b, i3Var.f321065b);
    }

    @Override // zc0.d
    public final String getItemId() {
        return this.f321064a;
    }

    public final int hashCode() {
        return this.f321065b.hashCode() + (this.f321064a.hashCode() * 31);
    }
}
