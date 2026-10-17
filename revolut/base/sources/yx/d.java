package yx;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xv.a f317502a;

    public d(xv.a torchState) {
        Intrinsics.checkNotNullParameter(torchState, "torchState");
        this.f317502a = torchState;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f317502a == ((d) obj2).f317502a;
    }

    public final int hashCode() {
        return this.f317502a.hashCode();
    }
}
