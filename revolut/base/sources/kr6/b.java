package kr6;

import kotlin.jvm.internal.Intrinsics;
import pi3.h;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f188663a;

    public b(h checkoutPlanParams) {
        Intrinsics.checkNotNullParameter(checkoutPlanParams, "checkoutPlanParams");
        this.f188663a = checkoutPlanParams;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f188663a, ((b) obj2).f188663a);
    }

    public final int hashCode() {
        return this.f188663a.hashCode();
    }
}
