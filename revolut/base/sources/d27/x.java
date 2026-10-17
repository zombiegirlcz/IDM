package d27;

import com.revolut.feature.shared.order_initiation.api.domain.OrderInitiationPage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OrderInitiationPage f110779a;

    public x(OrderInitiationPage page) {
        Intrinsics.checkNotNullParameter(page, "page");
        this.f110779a = page;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f110779a, ((x) obj2).f110779a);
    }

    public final int hashCode() {
        return this.f110779a.hashCode();
    }
}
