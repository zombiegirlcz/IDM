package q43;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class z extends com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f242055a;

    public z(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f242055a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f242055a, ((z) obj2).f242055a);
    }

    public final int hashCode() {
        return this.f242055a.hashCode();
    }
}
