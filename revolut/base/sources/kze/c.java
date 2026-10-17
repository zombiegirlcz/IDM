package kze;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f191102a;

    public c(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f191102a = error;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f191102a, ((c) obj2).f191102a);
    }

    public final int hashCode() {
        return this.f191102a.hashCode();
    }
}
