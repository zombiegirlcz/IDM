package b6k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f12855a;

    public i(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f12855a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f12855a, ((i) obj2).f12855a);
    }

    public final int hashCode() {
        return this.f12855a.hashCode();
    }
}
