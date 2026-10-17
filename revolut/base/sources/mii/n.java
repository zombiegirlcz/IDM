package mii;

import kotlin.jvm.internal.Intrinsics;
import rp0.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f205874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0 f205875b;

    public n(o model, y0 reason) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f205874a = model;
        this.f205875b = reason;
    }

    @Override // mii.q
    public final o a() {
        return this.f205874a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f205874a, nVar.f205874a) && this.f205875b == nVar.f205875b;
    }

    public final int hashCode() {
        return this.f205875b.hashCode() + (this.f205874a.hashCode() * 31);
    }
}
