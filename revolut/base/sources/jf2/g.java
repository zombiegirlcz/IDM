package jf2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f173644a;

    public g(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f173644a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f173644a, ((g) obj2).f173644a);
    }

    public final int hashCode() {
        return this.f173644a.hashCode();
    }
}
