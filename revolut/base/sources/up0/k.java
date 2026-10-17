package up0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f281727a;

    public k(a0 a0Var) {
        this.f281727a = a0Var;
    }

    @Override // up0.n
    public final a0 a() {
        return this.f281727a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f281727a, ((k) obj2).f281727a);
    }

    public final int hashCode() {
        a0 a0Var = this.f281727a;
        if (a0Var == null) {
            return 0;
        }
        return a0Var.hashCode();
    }
}
