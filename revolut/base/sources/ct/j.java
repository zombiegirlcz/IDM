package ct;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f108556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f108557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f108558c;

    public j(Clause description, TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f108556a = title;
        this.f108557b = description;
        this.f108558c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f108558c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f108556a.equals(jVar.f108556a) && Intrinsics.f(this.f108557b, jVar.f108557b) && Intrinsics.f(this.f108558c, jVar.f108558c);
    }

    public final int hashCode() {
        return this.f108558c.hashCode() + p.a.a(this.f108556a.hashCode() * 31, 31, this.f108557b);
    }
}
