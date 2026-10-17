package ma;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa.c f203845a;

    public i(fa.c action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f203845a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f203845a, ((i) obj2).f203845a);
    }

    public final int hashCode() {
        return this.f203845a.hashCode();
    }

    public final String toString() {
        return "StartInnerFlow(action=" + this.f203845a + ")";
    }
}
