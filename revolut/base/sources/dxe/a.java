package dxe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.b f120942a;

    public a(com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.b action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f120942a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f120942a, ((a) obj2).f120942a);
    }

    public final int hashCode() {
        return this.f120942a.hashCode();
    }
}
