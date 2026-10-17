package ww2;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f300587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f300588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f300589c;

    public m(TextLocalisedClause navBarTitle, TextLocalisedClause textLocalisedClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        this.f300587a = items;
        this.f300588b = navBarTitle;
        this.f300589c = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f300587a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f300587a, mVar.f300587a) && this.f300588b.equals(mVar.f300588b) && Intrinsics.f(this.f300589c, mVar.f300589c);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f300587a.hashCode() * 31, 31, this.f300588b);
        Clause clause = this.f300589c;
        return iA + (clause == null ? 0 : clause.hashCode());
    }
}
