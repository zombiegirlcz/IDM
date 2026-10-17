package xmd;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f307169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f307170b;

    public g(TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f307169a = title;
        this.f307170b = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f307169a.equals(gVar.f307169a) && Intrinsics.f(this.f307170b, gVar.f307170b);
    }

    public final int hashCode() {
        int iHashCode = this.f307169a.hashCode() * 31;
        Clause clause = this.f307170b;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
