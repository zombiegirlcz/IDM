package gk9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f144357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f144358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f144359c;

    public j(CompositeClause compositeClause, TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f144357a = items;
        this.f144358b = title;
        this.f144359c = compositeClause;
    }

    @Override // jki.n
    public final List c() {
        return this.f144357a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f144357a, jVar.f144357a) && this.f144358b.equals(jVar.f144358b) && Intrinsics.f(this.f144359c, jVar.f144359c);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f144357a.hashCode() * 31, 31, this.f144358b);
        Clause clause = this.f144359c;
        return iA + (clause == null ? 0 : clause.hashCode());
    }
}
