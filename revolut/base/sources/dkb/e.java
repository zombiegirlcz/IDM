package dkb;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f115497a;

    public e(dj0.d selectedAmount) {
        Intrinsics.checkNotNullParameter(selectedAmount, "selectedAmount");
        this.f115497a = selectedAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f115497a, ((e) obj2).f115497a);
    }

    public final int hashCode() {
        return this.f115497a.hashCode();
    }
}
