package me4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f204608a;

    public m(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f204608a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f204608a, ((m) obj2).f204608a);
    }

    public final int hashCode() {
        return this.f204608a.hashCode();
    }
}
