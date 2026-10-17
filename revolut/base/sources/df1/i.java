package df1;

import com.revolut.feature.acquiring.lite_pos.api.model.CartItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CartItem f113752a;

    public i(CartItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f113752a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f113752a, ((i) obj2).f113752a);
    }

    public final int hashCode() {
        return this.f113752a.hashCode();
    }
}
