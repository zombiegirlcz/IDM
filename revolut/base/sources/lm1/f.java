package lm1;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f196856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f196857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f196858c;

    public f(TextLocalisedClause textLocalisedClause, TextLocalisedClause hintClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(hintClause, "hintClause");
        this.f196856a = items;
        this.f196857b = textLocalisedClause;
        this.f196858c = hintClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f196856a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f196856a, fVar.f196856a) && Intrinsics.f(this.f196857b, fVar.f196857b) && this.f196858c.equals(fVar.f196858c);
    }

    public final int hashCode() {
        int iHashCode = this.f196856a.hashCode() * 31;
        Clause clause = this.f196857b;
        return this.f196858c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
