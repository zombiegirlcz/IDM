package lk6;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f196262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f196263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f196264c;
    public final boolean d;

    public r(List items, TextClause textClause, Clause clause, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f196262a = items;
        this.f196263b = textClause;
        this.f196264c = clause;
        this.d = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f196262a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f196262a, rVar.f196262a) && Intrinsics.f(this.f196263b, rVar.f196263b) && Intrinsics.f(this.f196264c, rVar.f196264c) && this.d == rVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f196262a.hashCode() * 31;
        Clause clause = this.f196263b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f196264c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
