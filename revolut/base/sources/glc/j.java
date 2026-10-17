package glc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f144611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f144612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f144613c;
    public final Image d;
    public final Image e;
    public final CircleBadgeModel f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f144614g;

    public j(MoneyClause title, Clause subtitle, Clause description, Image icon, LayeredImage layeredImage, CircleIconBadge circleIconBadge, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f144611a = title;
        this.f144612b = subtitle;
        this.f144613c = description;
        this.d = icon;
        this.e = layeredImage;
        this.f = circleIconBadge;
        this.f144614g = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f144611a.equals(jVar.f144611a) && this.f144612b.equals(jVar.f144612b) && this.f144613c.equals(jVar.f144613c) && this.d.equals(jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f144614g, jVar.f144614g);
    }

    public final int hashCode() {
        int iC = a10.b.c(this.d, p.a.a(p.a.b(this.f144611a.hashCode() * 31, 31, this.f144612b), 31, this.f144613c), 31);
        Image image = this.e;
        int iHashCode = (iC + (image == null ? 0 : image.hashCode())) * 31;
        CircleBadgeModel circleBadgeModel = this.f;
        return this.f144614g.hashCode() + ((iHashCode + (circleBadgeModel != null ? circleBadgeModel.hashCode() : 0)) * 31);
    }
}
