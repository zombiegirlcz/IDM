package x0l;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ehe.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f301653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f301654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.e f301655c;
    public final List d;

    public b(aw0.e nextButton, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(nextButton, "nextButton");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f301653a = title;
        this.f301654b = textLocalisedClause;
        this.f301655c = nextButton;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f301653a.equals(bVar.f301653a) && Intrinsics.f(this.f301654b, bVar.f301654b) && this.f301655c.equals(bVar.f301655c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f301653a.hashCode() * 31;
        Clause clause = this.f301654b;
        return this.d.hashCode() + n.c(this.f301655c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31);
    }
}
