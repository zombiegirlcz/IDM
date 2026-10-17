package xq7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f308121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f308122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f308123c;

    public f(CompositeClause compositeClause, TextLocalisedClause title, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f308121a = items;
        this.f308122b = title;
        this.f308123c = compositeClause;
    }

    @Override // jki.n
    public final List c() {
        return this.f308121a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f308121a, fVar.f308121a) && Intrinsics.f(this.f308122b, fVar.f308122b) && Intrinsics.f(this.f308123c, fVar.f308123c);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f308121a.hashCode() * 31, 31, this.f308122b);
        Clause clause = this.f308123c;
        return iA + (clause == null ? 0 : clause.hashCode());
    }
}
