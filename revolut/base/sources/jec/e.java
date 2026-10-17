package jec;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l6c.b f173260a;

    public e(l6c.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f173260a = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f173260a, ((e) obj2).f173260a);
    }

    public final int hashCode() {
        return this.f173260a.hashCode();
    }
}
