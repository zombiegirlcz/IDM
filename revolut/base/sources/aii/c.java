package aii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f5279b;

    public c(com.revolut.kompot.navigable.a controllerToCancel) {
        Intrinsics.checkNotNullParameter(controllerToCancel, "controllerToCancel");
        this.f5279b = controllerToCancel;
    }

    public final com.revolut.kompot.navigable.a b() {
        return this.f5279b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f5279b, ((c) obj2).f5279b);
    }

    public final int hashCode() {
        return this.f5279b.hashCode();
    }
}
