package mr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f208063a;

    public d(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f208063a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f208063a, ((d) obj2).f208063a);
    }

    public final int hashCode() {
        return this.f208063a.hashCode();
    }
}
