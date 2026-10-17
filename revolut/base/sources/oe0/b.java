package oe0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f224501a;

    public b(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f224501a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f224501a, ((b) obj2).f224501a);
    }

    public final int hashCode() {
        return this.f224501a.hashCode();
    }
}
