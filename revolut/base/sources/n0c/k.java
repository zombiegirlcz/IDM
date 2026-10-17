package n0c;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedQuantityClause f210985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f210986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeClause f210987c;
    public final Image d;
    public final CircleBadgeModel e;

    public k(TextLocalisedQuantityClause title, Clause description, TimeClause secondDescription, Image icon, CircleIconBadge circleIconBadge) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(secondDescription, "secondDescription");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f210985a = title;
        this.f210986b = description;
        this.f210987c = secondDescription;
        this.d = icon;
        this.e = circleIconBadge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f210985a.equals(kVar.f210985a) && this.f210986b.equals(kVar.f210986b) && this.f210987c.equals(kVar.f210987c) && this.d.equals(kVar.d) && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        int iC = a10.b.c(this.d, h30.l.d(this.f210987c, p.a.a(this.f210985a.hashCode() * 31, 31, this.f210986b), 31), 31);
        CircleBadgeModel circleBadgeModel = this.e;
        return iC + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode());
    }
}
