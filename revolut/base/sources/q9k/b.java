package q9k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f243916a;

    public b(a juniorWithPockets) {
        Intrinsics.checkNotNullParameter(juniorWithPockets, "juniorWithPockets");
        this.f243916a = juniorWithPockets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f243916a, ((b) obj2).f243916a);
    }

    public final int hashCode() {
        return this.f243916a.hashCode();
    }
}
