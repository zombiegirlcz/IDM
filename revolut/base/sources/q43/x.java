package q43;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class x extends com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t60.a f242053a;

    public x(t60.a listVisibilityState) {
        Intrinsics.checkNotNullParameter(listVisibilityState, "listVisibilityState");
        this.f242053a = listVisibilityState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f242053a, ((x) obj2).f242053a);
    }

    public final int hashCode() {
        return this.f242053a.hashCode();
    }
}
