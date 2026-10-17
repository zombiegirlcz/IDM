package x23;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f302483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f302484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f302485c;

    public l(g primaryButtonConfig, g secondaryButtonConfig, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(primaryButtonConfig, "primaryButtonConfig");
        Intrinsics.checkNotNullParameter(secondaryButtonConfig, "secondaryButtonConfig");
        this.f302483a = primaryButtonConfig;
        this.f302484b = secondaryButtonConfig;
        this.f302485c = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f302483a, lVar.f302483a) && Intrinsics.f(this.f302484b, lVar.f302484b) && Intrinsics.f(this.f302485c, lVar.f302485c);
    }

    public final int hashCode() {
        int iHashCode = (this.f302484b.hashCode() + (this.f302483a.hashCode() * 31)) * 31;
        Clause clause = this.f302485c;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }
}
