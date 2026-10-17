package kye;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qte.c f190816a;

    public q(qte.c fee2) {
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f190816a = fee2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f190816a, ((q) obj2).f190816a);
    }

    public final int hashCode() {
        return this.f190816a.hashCode();
    }
}
