package b8e;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f13214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f13215c;

    public j(Clause clause, TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f13213a = items;
        this.f13214b = title;
        this.f13215c = clause;
    }

    @Override // cli.p
    public final List c() {
        return this.f13213a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f13213a, jVar.f13213a) && this.f13214b.equals(jVar.f13214b) && Intrinsics.f(this.f13215c, jVar.f13215c);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f13213a.hashCode() * 31, 31, this.f13214b);
        Clause clause = this.f13215c;
        return (iA + (clause == null ? 0 : clause.hashCode())) * 31;
    }
}
