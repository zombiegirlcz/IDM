package q2e;

import au0.z0;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f241596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UrlImage f241597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UrlImage f241598c;
    public final CircleIconBadge d;

    public l(z0 pageTitle, UrlImage brandAvatar, UrlImage background, CircleIconBadge circleIconBadge) {
        Intrinsics.checkNotNullParameter(pageTitle, "pageTitle");
        Intrinsics.checkNotNullParameter(brandAvatar, "brandAvatar");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f241596a = pageTitle;
        this.f241597b = brandAvatar;
        this.f241598c = background;
        this.d = circleIconBadge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f241596a.equals(lVar.f241596a) && this.f241597b.equals(lVar.f241597b) && this.f241598c.equals(lVar.f241598c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        int iG = v7.g(this.f241598c, v7.g(this.f241597b, this.f241596a.hashCode() * 31, 31), 31);
        CircleIconBadge circleIconBadge = this.d;
        return iG + (circleIconBadge == null ? 0 : circleIconBadge.hashCode());
    }
}
