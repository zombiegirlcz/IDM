package l1g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f191534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f191535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f191536c;

    public d(TextLocalisedClause titleClause, TextLocalisedClause textLocalisedClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        this.f191534a = items;
        this.f191535b = titleClause;
        this.f191536c = textLocalisedClause;
    }

    @Override // jki.n
    public final List c() {
        return this.f191534a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f191534a, dVar.f191534a) && this.f191535b.equals(dVar.f191535b) && Intrinsics.f(this.f191536c, dVar.f191536c);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f191534a.hashCode() * 31, 31, this.f191535b);
        Clause clause = this.f191536c;
        return iA + (clause == null ? 0 : clause.hashCode());
    }
}
