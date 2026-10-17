package ug0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f279915a;

    public b(Exception throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f279915a = throwable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f279915a.equals(((b) obj2).f279915a);
    }

    public final int hashCode() {
        return this.f279915a.hashCode();
    }
}
