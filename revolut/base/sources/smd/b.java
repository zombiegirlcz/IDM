package smd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f264409a;

    public b(dj0.d previousAmount) {
        Intrinsics.checkNotNullParameter(previousAmount, "previousAmount");
        this.f264409a = previousAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f264409a, ((b) obj2).f264409a);
    }

    public final int hashCode() {
        return this.f264409a.hashCode();
    }
}
