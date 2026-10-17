package k1h;

import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f180268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f180269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CircleBadgeModel f180270c;

    public /* synthetic */ m(Image image, CircleBadgeModel circleBadgeModel, int i) {
        this(image, (LayeredImage) null, (i & 4) != 0 ? null : circleBadgeModel);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f180268a, mVar.f180268a) && Intrinsics.f(this.f180269b, mVar.f180269b) && Intrinsics.f(this.f180270c, mVar.f180270c);
    }

    public final int hashCode() {
        int iHashCode = this.f180268a.hashCode() * 31;
        Image image = this.f180269b;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        CircleBadgeModel circleBadgeModel = this.f180270c;
        return iHashCode2 + (circleBadgeModel != null ? circleBadgeModel.hashCode() : 0);
    }

    public m(Image icon, LayeredImage layeredImage, CircleBadgeModel circleBadgeModel) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f180268a = icon;
        this.f180269b = layeredImage;
        this.f180270c = circleBadgeModel;
    }
}
