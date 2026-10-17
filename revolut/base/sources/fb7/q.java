package fb7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1j.d f133493a;

    public q(j1j.d selectedBalance) {
        Intrinsics.checkNotNullParameter(selectedBalance, "selectedBalance");
        this.f133493a = selectedBalance;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f133493a, ((q) obj2).f133493a);
    }

    public final int hashCode() {
        return this.f133493a.hashCode();
    }
}
