package mx0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f210052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f210053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u7 f210054c;

    public v7(Clause clause, Clause clause2, u7 destinationIconGravity) {
        Intrinsics.checkNotNullParameter(destinationIconGravity, "destinationIconGravity");
        this.f210052a = clause;
        this.f210053b = clause2;
        this.f210054c = destinationIconGravity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v7)) {
            return false;
        }
        v7 v7Var = (v7) obj2;
        return Intrinsics.f(this.f210052a, v7Var.f210052a) && Intrinsics.f(this.f210053b, v7Var.f210053b) && this.f210054c == v7Var.f210054c;
    }

    public final int hashCode() {
        Clause clause = this.f210052a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f210053b;
        return this.f210054c.hashCode() + ((iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
