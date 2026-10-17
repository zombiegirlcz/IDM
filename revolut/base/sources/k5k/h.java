package k5k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l5k.c f181540a;

    public h(l5k.c percentageFee) {
        Intrinsics.checkNotNullParameter(percentageFee, "percentageFee");
        this.f181540a = percentageFee;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f181540a, ((h) obj2).f181540a);
    }

    public final int hashCode() {
        return this.f181540a.hashCode();
    }
}
