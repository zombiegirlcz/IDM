package uu6;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f283148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f283149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeClause f283150c;
    public final ResourceImage d;
    public final CircleBadgeModel e;

    public l(MoneyClause title, CompositeClause subtitle, TimeClause description, ResourceImage icon, CircleIconBadge circleIconBadge) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f283148a = title;
        this.f283149b = subtitle;
        this.f283150c = description;
        this.d = icon;
        this.e = circleIconBadge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f283148a.equals(lVar.f283148a) && this.f283149b.equals(lVar.f283149b) && this.f283150c.equals(lVar.f283150c) && this.d.equals(lVar.d) && Intrinsics.f(this.e, lVar.e);
    }

    public final int hashCode() {
        int iB = org.bouncycastle.jcajce.provider.digest.a.b(this.d, h30.l.d(this.f283150c, h30.l.c(this.f283149b, this.f283148a.hashCode() * 31, 31), 31), 31);
        CircleBadgeModel circleBadgeModel = this.e;
        return iB + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode());
    }
}
