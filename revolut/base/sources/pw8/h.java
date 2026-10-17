package pw8;

import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductSelectionDelegate.Model f240349a;

    public h(ProductSelectionDelegate.Model productSelectionModel) {
        Intrinsics.checkNotNullParameter(productSelectionModel, "productSelectionModel");
        this.f240349a = productSelectionModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f240349a, ((h) obj2).f240349a);
    }

    public final int hashCode() {
        return this.f240349a.hashCode();
    }
}
