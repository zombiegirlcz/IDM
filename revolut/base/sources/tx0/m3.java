package tx0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f275201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f275202b;

    public m3(Clause value, Clause clause) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f275201a = value;
        this.f275202b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) obj2;
        return Intrinsics.f(this.f275201a, m3Var.f275201a) && Intrinsics.f(this.f275202b, m3Var.f275202b);
    }

    public final int hashCode() {
        int iHashCode = this.f275201a.hashCode() * 31;
        Clause clause = this.f275202b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
