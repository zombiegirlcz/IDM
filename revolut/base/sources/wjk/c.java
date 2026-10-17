package wjk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f298147a;

    public c(TextLocalisedClause newPlanNameClause) {
        Intrinsics.checkNotNullParameter(newPlanNameClause, "newPlanNameClause");
        this.f298147a = newPlanNameClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f298147a.equals(((c) obj2).f298147a);
    }

    public final int hashCode() {
        return this.f298147a.hashCode() * 31;
    }
}
