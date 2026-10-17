package ch8;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Style f24146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f24147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CircleBadgeModel f24148c;
    public final List d;

    public d(Custom custom, Clause clause, CircleIconBadge circleIconBadge, List actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f24146a = custom;
        this.f24147b = clause;
        this.f24148c = circleIconBadge;
        this.d = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f24146a, dVar.f24146a) && Intrinsics.f(this.f24147b, dVar.f24147b) && Intrinsics.f(this.f24148c, dVar.f24148c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        Style style = this.f24146a;
        int iHashCode = (style == null ? 0 : style.hashCode()) * 31;
        Clause clause = this.f24147b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        CircleBadgeModel circleBadgeModel = this.f24148c;
        return this.d.hashCode() + ((iHashCode2 + (circleBadgeModel != null ? circleBadgeModel.hashCode() : 0)) * 31);
    }
}
