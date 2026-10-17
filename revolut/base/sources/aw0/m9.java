package aw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e5 f10429a;

    public m9(e5 e5Var) {
        this.f10429a = e5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m9) && Intrinsics.f(this.f10429a, ((m9) obj2).f10429a);
    }

    public final int hashCode() {
        e5 e5Var = this.f10429a;
        if (e5Var == null) {
            return 0;
        }
        return e5Var.hashCode();
    }
}
