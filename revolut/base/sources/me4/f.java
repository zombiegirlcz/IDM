package me4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f204602a;

    public f(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f204602a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f204602a, ((f) obj2).f204602a);
    }

    public final int hashCode() {
        return this.f204602a.hashCode();
    }
}
