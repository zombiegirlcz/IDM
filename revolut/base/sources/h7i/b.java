package h7i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f149885a;

    public b(dj0.d amountHigherThan) {
        Intrinsics.checkNotNullParameter(amountHigherThan, "amountHigherThan");
        this.f149885a = amountHigherThan;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f149885a, ((b) obj2).f149885a);
    }

    public final int hashCode() {
        return this.f149885a.hashCode();
    }
}
