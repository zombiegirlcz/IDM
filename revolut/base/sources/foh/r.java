package foh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f136976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f136977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f136978c;
    public final List d;

    public r(aim.e items, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, List actions) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f136976a = items;
        this.f136977b = title;
        this.f136978c = textLocalisedClause;
        this.d = actions;
    }

    @Override // cli.p
    public final List c() {
        return this.f136976a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f136976a, rVar.f136976a) && this.f136977b.equals(rVar.f136977b) && Intrinsics.f(this.f136978c, rVar.f136978c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f136976a.hashCode() * 31, 31, this.f136977b);
        Clause clause = this.f136978c;
        return this.d.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
