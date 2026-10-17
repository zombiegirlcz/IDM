package aii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class z implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w64.d f5297a;

    public z(w64.d requestResolver) {
        Intrinsics.checkNotNullParameter(requestResolver, "requestResolver");
        this.f5297a = requestResolver;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && this.f5297a.equals(((z) obj2).f5297a);
    }

    public final int hashCode() {
        return this.f5297a.hashCode();
    }
}
