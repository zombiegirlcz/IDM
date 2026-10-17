package e4b;

import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f122522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f122523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CircleBadgeModel f122524c;

    public g(Image icon, Image image, CircleBadgeModel circleBadgeModel) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f122522a = icon;
        this.f122523b = image;
        this.f122524c = circleBadgeModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f122522a, gVar.f122522a) && Intrinsics.f(this.f122523b, gVar.f122523b) && Intrinsics.f(this.f122524c, gVar.f122524c);
    }

    public final int hashCode() {
        int iHashCode = this.f122522a.hashCode() * 31;
        Image image = this.f122523b;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        CircleBadgeModel circleBadgeModel = this.f122524c;
        return iHashCode2 + (circleBadgeModel != null ? circleBadgeModel.hashCode() : 0);
    }
}
