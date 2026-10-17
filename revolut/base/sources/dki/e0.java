package dki;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class e0 extends f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f115529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f115530b;

    public e0(s parentFlowModel, boolean z) {
        Intrinsics.checkNotNullParameter(parentFlowModel, "parentFlowModel");
        this.f115529a = parentFlowModel;
        this.f115530b = z;
    }

    @Override // dki.f0
    public final boolean a() {
        return this.f115530b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f115529a, e0Var.f115529a) && this.f115530b == e0Var.f115530b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f115530b) + (this.f115529a.hashCode() * 31);
    }
}
