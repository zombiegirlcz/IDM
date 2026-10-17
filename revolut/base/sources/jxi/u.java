package jxi;

import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.WalletPassTarget;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class u extends com.revolut.retail.feature.airportlounges.impl.ui.screens.home.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletPassTarget f179229a;

    public u(WalletPassTarget target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f179229a = target;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && this.f179229a == ((u) obj2).f179229a;
    }

    public final int hashCode() {
        return this.f179229a.hashCode();
    }
}
