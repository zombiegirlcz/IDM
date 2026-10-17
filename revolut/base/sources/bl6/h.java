package bl6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f16481a;

    public h(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f16481a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f16481a, ((h) obj2).f16481a);
    }

    public final int hashCode() {
        return this.f16481a.hashCode();
    }
}
