package h93;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class z0 extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f150174a;

    public z0(Exception throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f150174a = throwable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z0) && this.f150174a.equals(((z0) obj2).f150174a);
    }

    public final int hashCode() {
        return this.f150174a.hashCode();
    }
}
