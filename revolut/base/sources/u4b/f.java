package u4b;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f277293a;

    public f(dj0.d amountToWithdraw) {
        Intrinsics.checkNotNullParameter(amountToWithdraw, "amountToWithdraw");
        this.f277293a = amountToWithdraw;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f277293a, ((f) obj2).f277293a);
    }

    public final int hashCode() {
        return this.f277293a.hashCode();
    }
}
