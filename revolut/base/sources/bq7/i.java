package bq7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f17782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f17783c;

    public i(List items, TextLocalisedClause textLocalisedClause, e buttonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f17781a = items;
        this.f17782b = textLocalisedClause;
        this.f17783c = buttonState;
    }

    @Override // jki.n
    public final List c() {
        return this.f17781a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f17781a, iVar.f17781a) && Intrinsics.f(this.f17782b, iVar.f17782b) && Intrinsics.f(this.f17783c, iVar.f17783c);
    }

    public final int hashCode() {
        int iHashCode = this.f17781a.hashCode() * 31;
        Clause clause = this.f17782b;
        return this.f17783c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
