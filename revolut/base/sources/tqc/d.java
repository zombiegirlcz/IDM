package tqc;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f273549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f273550b;

    public d(TextLocalisedClause textLocalisedClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f273549a = items;
        this.f273550b = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f273549a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f273549a, dVar.f273549a) && Intrinsics.f(this.f273550b, dVar.f273550b);
    }

    public final int hashCode() {
        int iHashCode = this.f273549a.hashCode() * 31;
        Clause clause = this.f273550b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
