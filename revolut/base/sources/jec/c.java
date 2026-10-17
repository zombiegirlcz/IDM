package jec;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f173258a;

    public c() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f173258a, ((c) obj2).f173258a);
    }

    public final int hashCode() {
        return this.f173258a.hashCode();
    }

    public c(j state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f173258a = state;
    }

    public /* synthetic */ c(int i) {
        this(h.f173263a);
    }
}
