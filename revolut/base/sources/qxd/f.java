package qxd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f250076a;

    public f(dj0.d amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f250076a = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f250076a, ((f) obj2).f250076a);
    }

    public final int hashCode() {
        return this.f250076a.hashCode();
    }
}
