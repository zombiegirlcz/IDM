package ej6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f126748a;

    public n() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f126748a, ((n) obj2).f126748a);
    }

    public final int hashCode() {
        Throwable th10 = this.f126748a;
        if (th10 == null) {
            return 0;
        }
        return th10.hashCode();
    }

    public n(Throwable th10) {
        this.f126748a = th10;
    }
}
