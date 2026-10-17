package mii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f205878a;

    public p(o model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f205878a = model;
    }

    @Override // mii.q
    public final o a() {
        return this.f205878a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f205878a, ((p) obj2).f205878a);
    }

    public final int hashCode() {
        return this.f205878a.hashCode();
    }
}
