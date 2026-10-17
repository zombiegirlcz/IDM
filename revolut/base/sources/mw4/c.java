package mw4;

import kotlin.jvm.internal.Intrinsics;
import mw4.a;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f209329a;

    public c(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f209329a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f209329a, ((c) obj2).f209329a);
    }

    public final int hashCode() {
        return this.f209329a.hashCode();
    }
}
