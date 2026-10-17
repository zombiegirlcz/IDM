package tq4;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f273523a;

    public e(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f273523a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f273523a, ((e) obj2).f273523a);
    }

    public final int hashCode() {
        return this.f273523a.hashCode();
    }
}
