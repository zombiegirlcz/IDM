package h7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class y implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149830a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof y) {
            return Intrinsics.f(this.f149830a, ((y) obj2).f149830a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f149830a.hashCode();
    }

    public final String toString() {
        return "File(fileName=" + this.f149830a + ")";
    }
}
