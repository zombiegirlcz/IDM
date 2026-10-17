package ovk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f230243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f230244b;

    public e(TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f230243a = title;
        this.f230244b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f230243a.equals(eVar.f230243a) && Intrinsics.f(this.f230244b, eVar.f230244b);
    }

    public final int hashCode() {
        int iHashCode = this.f230243a.hashCode() * 31;
        Clause clause = this.f230244b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
