package cie;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g0 implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f24477a;

    public g0(h0 oldUIState) {
        Intrinsics.checkNotNullParameter(oldUIState, "oldUIState");
        this.f24477a = oldUIState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g0) && Intrinsics.f(this.f24477a, ((g0) obj2).f24477a);
    }

    public final int hashCode() {
        return this.f24477a.hashCode();
    }
}
