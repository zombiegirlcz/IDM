package s6b;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f260201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x6b.h f260202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x6b.d f260203c;
    public final Clause d;
    public final List e;

    public j(TextLocalisedClause headerTitle, x6b.h headerState, x6b.d actionButtonState, Clause clause, List items) {
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(actionButtonState, "actionButtonState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f260201a = headerTitle;
        this.f260202b = headerState;
        this.f260203c = actionButtonState;
        this.d = clause;
        this.e = items;
    }

    @Override // cli.p
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f260201a.equals(jVar.f260201a) && Intrinsics.f(this.f260202b, jVar.f260202b) && Intrinsics.f(this.f260203c, jVar.f260203c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f260203c.hashCode() + ((this.f260202b.hashCode() + (this.f260201a.hashCode() * 31)) * 31)) * 31;
        Clause clause = this.d;
        return this.e.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
