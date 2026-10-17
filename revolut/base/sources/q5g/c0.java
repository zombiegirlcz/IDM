package q5g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f242358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.travel.flights.impl.ui.screen.checkout.a f242359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f242360c;

    public c0(List items, com.revolut.feature.travel.flights.impl.ui.screen.checkout.a paymentButtonState, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(paymentButtonState, "paymentButtonState");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f242358a = items;
        this.f242359b = paymentButtonState;
        this.f242360c = menuItems;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof c0)) {
            return null;
        }
        c0 c0Var = (c0) oldState;
        return new y(!Intrinsics.f(c0Var.f242360c, this.f242360c), !c0Var.f242359b.equals(this.f242359b));
    }

    @Override // cli.p
    public final List c() {
        return this.f242358a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f242358a, c0Var.f242358a) && Intrinsics.f(this.f242359b, c0Var.f242359b) && Intrinsics.f(this.f242360c, c0Var.f242360c);
    }

    public final int hashCode() {
        return this.f242360c.hashCode() + ((this.f242359b.hashCode() + (this.f242358a.hashCode() * 31)) * 31);
    }
}
