package fmg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h93.f0 f136415b;

    public c0(h93.f0 f0Var, String entityId) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f136414a = entityId;
        this.f136415b = f0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f136414a, c0Var.f136414a) && Intrinsics.f(this.f136415b, c0Var.f136415b);
    }

    public final int hashCode() {
        int iHashCode = this.f136414a.hashCode() * 31;
        h93.f0 f0Var = this.f136415b;
        return iHashCode + (f0Var == null ? 0 : f0Var.hashCode());
    }
}
