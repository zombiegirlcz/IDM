package k4l;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class t extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pair f181004a;

    public t(Pair ccyPair) {
        Intrinsics.checkNotNullParameter(ccyPair, "ccyPair");
        this.f181004a = ccyPair;
    }

    @Override // k4l.v
    public final Pair a() {
        return this.f181004a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f181004a, ((t) obj2).f181004a);
    }

    public final int hashCode() {
        return this.f181004a.hashCode();
    }
}
