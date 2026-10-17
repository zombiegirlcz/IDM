package v30;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y0 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f285838a;

    public y0(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f285838a = throwable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y0) && Intrinsics.f(this.f285838a, ((y0) obj2).f285838a);
    }

    public final int hashCode() {
        return this.f285838a.hashCode();
    }
}
