package g88;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CircleBadgeModel f141289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f141290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f141291c;

    public a(CircleIconBadge circleIconBadge, TextLocalisedClause textLocalisedClause, boolean z) {
        this.f141289a = circleIconBadge;
        this.f141290b = textLocalisedClause;
        this.f141291c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f141289a, aVar.f141289a) && Intrinsics.f(this.f141290b, aVar.f141290b) && this.f141291c == aVar.f141291c;
    }

    public final int hashCode() {
        CircleBadgeModel circleBadgeModel = this.f141289a;
        int iHashCode = (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode()) * 31;
        Clause clause = this.f141290b;
        return Boolean.hashCode(this.f141291c) + ((iHashCode + (clause != null ? clause.hashCode() : 0)) * 31);
    }
}
