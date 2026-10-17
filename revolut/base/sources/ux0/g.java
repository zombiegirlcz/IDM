package ux0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f283745a;

    public g(int i) {
        this.f283745a = i;
    }

    @Override // ux0.i
    public final i a(d model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model instanceof b) {
            b bVar = (b) model;
            o oVar = (o) zhm.d0.d0(bVar.f283737c);
            return oVar == null ? new e(bVar, new IllegalStateException("At least one story is expected for the product intro")) : new h(bVar, oVar);
        }
        if (model instanceof c) {
            return this;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f283745a == ((g) obj2).f283745a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f283745a);
    }
}
