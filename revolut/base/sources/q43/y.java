package q43;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class y extends com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f242054a;

    public y(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f242054a = query;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f242054a, ((y) obj2).f242054a);
    }

    public final int hashCode() {
        return this.f242054a.hashCode();
    }
}
