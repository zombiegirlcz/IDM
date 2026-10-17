package b02;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f11545a;

    public e(h onlinePurchasesState) {
        Intrinsics.checkNotNullParameter(onlinePurchasesState, "onlinePurchasesState");
        this.f11545a = onlinePurchasesState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f11545a == ((e) obj2).f11545a;
    }

    public final int hashCode() {
        return this.f11545a.hashCode();
    }
}
