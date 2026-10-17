package pol;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f238055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f238056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f238057c;
    public final boolean d;
    public final Clause e;
    public final List f;

    public l(aim.e items, TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause primaryAction, TextLocalisedClause textLocalisedClause, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryAction, "primaryAction");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f238055a = title;
        this.f238056b = description;
        this.f238057c = primaryAction;
        this.d = z;
        this.e = textLocalisedClause;
        this.f = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f238055a.equals(lVar.f238055a) && this.f238056b.equals(lVar.f238056b) && this.f238057c.equals(lVar.f238057c) && this.d == lVar.d && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(t61.a.a(t61.a.a(this.f238055a.hashCode() * 31, 31, this.f238056b), 31, this.f238057c), 31, this.d);
        Clause clause = this.e;
        return this.f.hashCode() + ((iC + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
