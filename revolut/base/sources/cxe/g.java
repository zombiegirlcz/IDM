package cxe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f109943a;

    public g(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f109943a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f109943a, ((g) obj2).f109943a);
    }

    public final int hashCode() {
        return this.f109943a.hashCode();
    }
}
