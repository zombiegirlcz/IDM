package sfe;

import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x implements qv0.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SmallStockCardDelegate.Model f262435a;

    public x(SmallStockCardDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f262435a = model;
    }

    @Override // qv0.p
    /* JADX INFO: renamed from: a */
    public final Object getF52083j() {
        return this;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f262435a, ((x) obj2).f262435a);
    }

    public final int hashCode() {
        return this.f262435a.hashCode();
    }
}
