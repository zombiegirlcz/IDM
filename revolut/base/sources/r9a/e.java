package r9a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f252547a;

    public e(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f252547a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f252547a, ((e) obj2).f252547a);
    }

    public final int hashCode() {
        return this.f252547a.hashCode();
    }
}
