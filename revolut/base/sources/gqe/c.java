package gqe;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CircleBadgeModel f145709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f145710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f145711c;
    public final List d;

    public c(CircleIconBadge circleIconBadge, TextLocalisedClause textLocalisedClause, boolean z, List enabledActions) {
        Intrinsics.checkNotNullParameter(enabledActions, "enabledActions");
        this.f145709a = circleIconBadge;
        this.f145710b = textLocalisedClause;
        this.f145711c = z;
        this.d = enabledActions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f145709a, cVar.f145709a) && Intrinsics.f(this.f145710b, cVar.f145710b) && this.f145711c == cVar.f145711c && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        CircleBadgeModel circleBadgeModel = this.f145709a;
        int iHashCode = (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode()) * 31;
        Clause clause = this.f145710b;
        return this.d.hashCode() + j6.a.c((iHashCode + (clause != null ? clause.hashCode() : 0)) * 31, 31, this.f145711c);
    }
}
