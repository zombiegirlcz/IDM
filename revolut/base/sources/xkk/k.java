package xkk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f306851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f306852b;

    public k(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        this.f306851a = textLocalisedClause;
        this.f306852b = textLocalisedClause2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f306851a, kVar.f306851a) && Intrinsics.f(this.f306852b, kVar.f306852b);
    }

    public final int hashCode() {
        Clause clause = this.f306851a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Clause clause2 = this.f306852b;
        return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
    }
}
