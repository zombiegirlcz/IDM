package gs4;

import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f146305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CircleIconBadge f146306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProgressStyle f146307c;

    public a(Image image, InactiveCircleBadge inactiveCircleBadge, ProgressStyle progressStyle) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f146305a = image;
        this.f146306b = inactiveCircleBadge;
        this.f146307c = progressStyle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f146305a, aVar.f146305a) && Intrinsics.f(this.f146306b, aVar.f146306b) && Intrinsics.f(this.f146307c, aVar.f146307c);
    }

    public final int hashCode() {
        int iHashCode = this.f146305a.hashCode() * 31;
        CircleIconBadge circleIconBadge = this.f146306b;
        int iHashCode2 = (iHashCode + (circleIconBadge == null ? 0 : circleIconBadge.hashCode())) * 31;
        ProgressStyle progressStyle = this.f146307c;
        return iHashCode2 + (progressStyle != null ? progressStyle.hashCode() : 0);
    }
}
