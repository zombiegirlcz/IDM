package i13;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends com.revolut.feature.card_order_new.common.setpin.kompot.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157537a;

    public j(String pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f157537a = pin;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f157537a, ((j) obj2).f157537a);
    }

    public final int hashCode() {
        return this.f157537a.hashCode();
    }
}
