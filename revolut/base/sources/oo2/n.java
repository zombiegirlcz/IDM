package oo2;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f227001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f227002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f227003c;

    public n(List items, TextClause textClause, Clause clause) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f227001a = items;
        this.f227002b = textClause;
        this.f227003c = clause;
    }

    @Override // cli.p
    public final List c() {
        return this.f227001a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f227001a, nVar.f227001a) && Intrinsics.f(this.f227002b, nVar.f227002b) && Intrinsics.f(this.f227003c, nVar.f227003c);
    }

    public final int hashCode() {
        int iHashCode = this.f227001a.hashCode() * 31;
        Clause clause = this.f227002b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f227003c;
        return iHashCode2 + (clause2 != null ? clause2.hashCode() : 0);
    }
}
