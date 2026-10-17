package h7i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f149886a;

    public c(dj0.d amountLowerThan) {
        Intrinsics.checkNotNullParameter(amountLowerThan, "amountLowerThan");
        this.f149886a = amountLowerThan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f149886a, ((c) obj2).f149886a);
    }

    public final int hashCode() {
        return this.f149886a.hashCode();
    }
}
