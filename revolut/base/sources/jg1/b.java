package jg1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f173897a;

    public b(dj0.d amountToTopup) {
        Intrinsics.checkNotNullParameter(amountToTopup, "amountToTopup");
        this.f173897a = amountToTopup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f173897a, ((b) obj2).f173897a);
    }

    public final int hashCode() {
        return this.f173897a.hashCode();
    }
}
