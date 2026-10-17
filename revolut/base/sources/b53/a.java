package b53;

import e93.g0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f12422a;

    public a(g0 g0Var) {
        this.f12422a = g0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f12422a, ((a) obj2).f12422a);
    }

    public final int hashCode() {
        g0 g0Var = this.f12422a;
        if (g0Var == null) {
            return 0;
        }
        return g0Var.hashCode();
    }
}
