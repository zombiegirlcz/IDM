package yz5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f318039a;

    public b(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f318039a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f318039a, ((b) obj2).f318039a);
    }

    public final int hashCode() {
        return this.f318039a.hashCode();
    }
}
