package k5k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l5k.c f181541a;

    public i(l5k.c percentageFee) {
        Intrinsics.checkNotNullParameter(percentageFee, "percentageFee");
        this.f181541a = percentageFee;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f181541a, ((i) obj2).f181541a);
    }

    public final int hashCode() {
        return this.f181541a.hashCode();
    }
}
