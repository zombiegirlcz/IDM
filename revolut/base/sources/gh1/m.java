package gh1;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f143828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f143829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f143830c;

    public m(TextLocalisedClause navBarTitle, TextLocalisedClause textLocalisedClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        this.f143828a = items;
        this.f143829b = navBarTitle;
        this.f143830c = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f143828a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f143828a, mVar.f143828a) && this.f143829b.equals(mVar.f143829b) && Intrinsics.f(this.f143830c, mVar.f143830c);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f143828a.hashCode() * 31, 31, this.f143829b);
        Clause clause = this.f143830c;
        return iA + (clause == null ? 0 : clause.hashCode());
    }
}
