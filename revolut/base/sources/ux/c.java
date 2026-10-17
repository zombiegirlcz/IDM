package ux;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv.a f283706a;

    public c(xv.a torchState) {
        Intrinsics.checkNotNullParameter(torchState, "torchState");
        this.f283706a = torchState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f283706a == ((c) obj2).f283706a;
    }

    public final int hashCode() {
        return this.f283706a.hashCode();
    }
}
