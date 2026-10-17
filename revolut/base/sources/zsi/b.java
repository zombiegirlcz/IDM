package zsi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f324929a;

    public b(dj0.d amountLacking) {
        Intrinsics.checkNotNullParameter(amountLacking, "amountLacking");
        this.f324929a = amountLacking;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f324929a, ((b) obj2).f324929a);
    }

    public final int hashCode() {
        return this.f324929a.hashCode();
    }
}
