package aw0;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1 f10482b;

    public q1(List icons, p1 clauses) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        Intrinsics.checkNotNullParameter(clauses, "clauses");
        this.f10481a = icons;
        this.f10482b = clauses;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj2;
        return Intrinsics.f(this.f10481a, q1Var.f10481a) && Intrinsics.f(this.f10482b, q1Var.f10482b);
    }

    public final int hashCode() {
        return this.f10482b.hashCode() + (this.f10481a.hashCode() * 31);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q1(int i, Integer num, Clause title, Clause clause) {
        this(zhm.u.c(new p6(i, num)), new p1(title, clause));
        Intrinsics.checkNotNullParameter(title, "title");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q1(Clause title, Clause clause, List icons) {
        this(icons, new p1(title, clause));
        Intrinsics.checkNotNullParameter(icons, "icons");
        Intrinsics.checkNotNullParameter(title, "title");
    }
}
