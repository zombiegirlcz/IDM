package q43;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class t extends com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f242049a;

    public t(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f242049a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f242049a, ((t) obj2).f242049a);
    }

    public final int hashCode() {
        return this.f242049a.hashCode();
    }
}
