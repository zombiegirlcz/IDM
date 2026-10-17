package v1d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f285301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f285302b;

    public l(TextLocalisedClause titleClause, TextLocalisedClause actionClause) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(actionClause, "actionClause");
        this.f285301a = titleClause;
        this.f285302b = actionClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f285301a.equals(lVar.f285301a) && this.f285302b.equals(lVar.f285302b);
    }

    public final int hashCode() {
        return this.f285302b.hashCode() + (this.f285301a.hashCode() * 31);
    }
}
