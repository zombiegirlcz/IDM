package m4j;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f202740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f202741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f202742c;

    public j(Clause title, TextLocalisedClause searchHint, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(searchHint, "searchHint");
        this.f202740a = items;
        this.f202741b = title;
        this.f202742c = searchHint;
    }

    @Override // cli.p
    public final List c() {
        return this.f202740a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f202740a.equals(jVar.f202740a) && Intrinsics.f(this.f202741b, jVar.f202741b) && this.f202742c.equals(jVar.f202742c);
    }

    public final int hashCode() {
        return this.f202742c.hashCode() + p.a.a(this.f202740a.hashCode() * 31, 31, this.f202741b);
    }
}
