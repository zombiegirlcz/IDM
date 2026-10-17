package l4h;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f192129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f192130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f192131c;
    public final Clause d;

    public f(Clause clause, Clause clause2, boolean z, Clause valueChange) {
        Intrinsics.checkNotNullParameter(valueChange, "valueChange");
        this.f192129a = clause;
        this.f192130b = clause2;
        this.f192131c = z;
        this.d = valueChange;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f192129a, fVar.f192129a) && Intrinsics.f(this.f192130b, fVar.f192130b) && this.f192131c == fVar.f192131c && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        Clause clause = this.f192129a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f192130b;
        return this.d.hashCode() + j6.a.c((iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31, 31, this.f192131c);
    }
}
