package q2e;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f241621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f241622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f241623c;
    public final Clause d;

    public s0() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f241621a, s0Var.f241621a) && Intrinsics.f(this.f241622b, s0Var.f241622b) && Intrinsics.f(this.f241623c, s0Var.f241623c) && Intrinsics.f(this.d, s0Var.d);
    }

    public final int hashCode() {
        Clause clause = this.f241621a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f241622b;
        int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.f241623c;
        int iHashCode3 = (iHashCode2 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Clause clause4 = this.d;
        return iHashCode3 + (clause4 != null ? clause4.hashCode() : 0);
    }

    public s0(Clause clause, Clause clause2, Clause clause3, Clause clause4) {
        this.f241621a = clause;
        this.f241622b = clause2;
        this.f241623c = clause3;
        this.d = clause4;
    }
}
