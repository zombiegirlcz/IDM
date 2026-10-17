package ip0;

import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.core.ui_kit.delegates.sa f167081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionsView.Item f167082b;

    public x10(com.revolut.core.ui_kit.delegates.sa model, ActionsView.Item item) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f167081a = model;
        this.f167082b = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x10)) {
            return false;
        }
        x10 x10Var = (x10) obj2;
        return Intrinsics.f(this.f167081a, x10Var.f167081a) && Intrinsics.f(this.f167082b, x10Var.f167082b);
    }

    public final int hashCode() {
        return this.f167082b.hashCode() + (this.f167081a.hashCode() * 31);
    }
}
