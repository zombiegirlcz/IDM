package bh8;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f15245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f15246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f15247c;
    public final LayeredImage d;
    public final CircleBadgeModel e;
    public final List f;

    public h(TextLocalisedClause title, TextLocalisedClause subtitle, Clause clause, LayeredImage endImage, CircleBadgeModel circleBadgeModel, List actions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(endImage, "endImage");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f15245a = title;
        this.f15246b = subtitle;
        this.f15247c = clause;
        this.d = endImage;
        this.e = circleBadgeModel;
        this.f = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f15245a.equals(hVar.f15245a) && this.f15246b.equals(hVar.f15246b) && Intrinsics.f(this.f15247c, hVar.f15247c) && this.d.equals(hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f15245a.hashCode() * 31, 31, this.f15246b);
        Clause clause = this.f15247c;
        int iE = h30.l.e(this.d, (iA + (clause == null ? 0 : clause.hashCode())) * 31, 31);
        CircleBadgeModel circleBadgeModel = this.e;
        return this.f.hashCode() + ((iE + (circleBadgeModel != null ? circleBadgeModel.hashCode() : 0)) * 31);
    }
}
