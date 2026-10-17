package ew4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yr4.c f130083a;

    public o(yr4.c model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f130083a = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f130083a, ((o) obj2).f130083a);
    }

    public final int hashCode() {
        return this.f130083a.hashCode();
    }
}
