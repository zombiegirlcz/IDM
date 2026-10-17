package fu6;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f138094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f138095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeClause f138096c;
    public final LayeredImage d;
    public final CircleBadgeModel e;

    public m(MoneyClause title, TextClause subtitle, TimeClause description, LayeredImage layeredImage, CircleIconBadge circleIconBadge) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f138094a = title;
        this.f138095b = subtitle;
        this.f138096c = description;
        this.d = layeredImage;
        this.e = circleIconBadge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f138094a.equals(mVar.f138094a) && this.f138095b.equals(mVar.f138095b) && this.f138096c.equals(mVar.f138096c) && this.d.equals(mVar.d) && Intrinsics.f(this.e, mVar.e);
    }

    public final int hashCode() {
        int iE = h30.l.e(this.d, h30.l.d(this.f138096c, v7.b(this.f138094a.hashCode() * 31, 31, this.f138095b), 31), 31);
        CircleBadgeModel circleBadgeModel = this.e;
        return iE + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode());
    }
}
