package mii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f205873a;

    public m(o model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f205873a = model;
    }

    @Override // mii.q
    public final o a() {
        return this.f205873a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f205873a, ((m) obj2).f205873a);
    }

    public final int hashCode() {
        return this.f205873a.hashCode();
    }
}
