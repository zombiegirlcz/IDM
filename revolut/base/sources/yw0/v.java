package yw0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yw0.f;

/* JADX INFO: loaded from: classes19.dex */
public final class v implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f317304a;

    public v(int i) {
        this.f317304a = i;
    }

    @Override // yw0.a0
    public final a0 b(k model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model instanceof s) {
            return new z((s) model, 0, false);
        }
        if (model instanceof f.b) {
            return new v(((f.b) model).f317273a);
        }
        if (model instanceof g) {
            return a0.a((g) model);
        }
        if (!(model instanceof j)) {
            throw new NoWhenBranchMatchedException();
        }
        j jVar = (j) model;
        return new y(jVar.f317278b, jVar.f317277a);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && this.f317304a == ((v) obj2).f317304a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f317304a);
    }
}
