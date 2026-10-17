package yw0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yw0.f;

/* JADX INFO: loaded from: classes19.dex */
public final class y implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f317309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f317310b;

    public y(int i, i style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f317309a = i;
        this.f317310b = style;
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
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return this.f317309a == yVar.f317309a && this.f317310b == yVar.f317310b;
    }

    public final int hashCode() {
        return this.f317310b.hashCode() + (Integer.hashCode(this.f317309a) * 31);
    }
}
