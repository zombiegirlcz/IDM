package ulk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f281041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f281042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f281043c;
    public final Clause d;

    public n(TextLocalisedClause title, Clause clause, List items, Clause clause2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f281041a = title;
        this.f281042b = clause;
        this.f281043c = items;
        this.d = clause2;
    }

    @Override // cli.p
    public final List c() {
        return this.f281043c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f281041a.equals(nVar.f281041a) && Intrinsics.f(this.f281042b, nVar.f281042b) && Intrinsics.f(this.f281043c, nVar.f281043c) && Intrinsics.f(this.d, nVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f281041a.hashCode() * 31;
        Clause clause = this.f281042b;
        int iD = p.a.d((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f281043c);
        Clause clause2 = this.d;
        return iD + (clause2 != null ? clause2.hashCode() : 0);
    }
}
