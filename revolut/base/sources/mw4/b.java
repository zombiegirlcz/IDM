package mw4;

import kotlin.jvm.internal.Intrinsics;
import mw4.a;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f209328a;

    public b(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f209328a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f209328a, ((b) obj2).f209328a);
    }

    public final int hashCode() {
        return this.f209328a.hashCode();
    }
}
