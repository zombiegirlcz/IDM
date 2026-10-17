package h28;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f148737a;

    public f(c selectedMethod) {
        Intrinsics.checkNotNullParameter(selectedMethod, "selectedMethod");
        this.f148737a = selectedMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f148737a == ((f) obj2).f148737a;
    }

    public final int hashCode() {
        return this.f148737a.hashCode();
    }
}
