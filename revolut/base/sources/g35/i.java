package g35;

import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductSelectionDelegate.Model f140196a;

    public i(ProductSelectionDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f140196a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f140196a, ((i) obj2).f140196a);
    }

    public final int hashCode() {
        return this.f140196a.hashCode();
    }
}
