package yw0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yw0.f;

/* JADX INFO: loaded from: classes19.dex */
public final class z implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f317311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f317312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f317313c;

    public z(s model, int i, boolean z) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f317311a = model;
        this.f317312b = i;
        this.f317313c = z;
    }

    public static z c(z zVar, int i, boolean z, int i2) {
        s model = zVar.f317311a;
        if ((i2 & 2) != 0) {
            i = zVar.f317312b;
        }
        Intrinsics.checkNotNullParameter(model, "model");
        return new z(model, i, z);
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

    public final z d(int i) {
        return (i < 0 || i >= this.f317311a.f317297a.size() || i == this.f317312b) ? this : c(this, i, false, 1);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f317311a, zVar.f317311a) && this.f317312b == zVar.f317312b && this.f317313c == zVar.f317313c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f317313c) + j6.a.b(this.f317312b, this.f317311a.hashCode() * 31, 31);
    }
}
