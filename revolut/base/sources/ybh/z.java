package ybh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f312368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f312369b;

    public z(TextLocalisedClause text, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f312368a = text;
        this.f312369b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f312368a.equals(zVar.f312368a) && Intrinsics.f(this.f312369b, zVar.f312369b);
    }

    public final int hashCode() {
        int iHashCode = this.f312368a.hashCode() * 31;
        Clause clause = this.f312369b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
