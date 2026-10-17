package au0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z0 extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f9448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9449b;

    public z0(Clause clause, boolean z) {
        this.f9448a = clause;
        this.f9449b = z;
    }

    @Override // au0.a1
    public final boolean a() {
        return this.f9449b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.f9448a, z0Var.f9448a) && this.f9449b == z0Var.f9449b;
    }

    public final int hashCode() {
        Clause clause = this.f9448a;
        return Boolean.hashCode(this.f9449b) + ((clause == null ? 0 : clause.hashCode()) * 31);
    }
}
