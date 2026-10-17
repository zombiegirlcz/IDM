package fci;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class x0 implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f133823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f133824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f133825c;
    public final Clause d;

    public x0(List items, boolean z, TextClause textClause, TextClause textClause2) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f133823a = items;
        this.f133824b = z;
        this.f133825c = textClause;
        this.d = textClause2;
    }

    @Override // cli.p
    public final List c() {
        return this.f133823a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.f133823a, x0Var.f133823a) && this.f133824b == x0Var.f133824b && Intrinsics.f(this.f133825c, x0Var.f133825c) && Intrinsics.f(this.d, x0Var.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f133823a.hashCode() * 31, 31, this.f133824b);
        Clause clause = this.f133825c;
        int iHashCode = (iC + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.d;
        return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
    }
}
