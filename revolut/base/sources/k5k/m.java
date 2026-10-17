package k5k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l5k.c f181545a;

    public m(l5k.c percentageFee) {
        Intrinsics.checkNotNullParameter(percentageFee, "percentageFee");
        this.f181545a = percentageFee;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f181545a, ((m) obj2).f181545a);
    }

    public final int hashCode() {
        return this.f181545a.hashCode();
    }
}
