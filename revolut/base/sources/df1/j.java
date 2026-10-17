package df1;

import com.revolut.feature.acquiring.lite_pos.api.model.CartItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CartItem f113753a;

    public j(CartItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f113753a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f113753a, ((j) obj2).f113753a);
    }

    public final int hashCode() {
        return this.f113753a.hashCode();
    }
}
