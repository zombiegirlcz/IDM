package e06;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f121428a;

    public e(dj0.d tipAmount) {
        Intrinsics.checkNotNullParameter(tipAmount, "tipAmount");
        this.f121428a = tipAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f121428a, ((e) obj2).f121428a);
    }

    public final int hashCode() {
        return this.f121428a.hashCode();
    }
}
