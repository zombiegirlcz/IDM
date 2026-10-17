package xec;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f304595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f304596b;

    public l(TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f304595a = title;
        this.f304596b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f304595a.equals(lVar.f304595a) && Intrinsics.f(this.f304596b, lVar.f304596b);
    }

    public final int hashCode() {
        int iHashCode = this.f304595a.hashCode() * 31;
        Clause clause = this.f304596b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
