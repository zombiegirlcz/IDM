package aqb;

import kotlin.jvm.internal.Intrinsics;
import rp0.y;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements jki.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f8297a;

    public r(y model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f8297a = model;
    }

    @Override // jki.m
    public final jki.o b(jki.m oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        return new q(!((r) oldState).f8297a.equals(this.f8297a));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f8297a, ((r) obj2).f8297a);
    }

    public final int hashCode() {
        return this.f8297a.hashCode();
    }
}
