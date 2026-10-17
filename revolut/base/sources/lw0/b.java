package lw0;

import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f200389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CircleBadgeModel f200390b;

    public b(Image image, CircleBadgeModel circleBadgeModel) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f200389a = image;
        this.f200390b = circleBadgeModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f200389a, bVar.f200389a) && Intrinsics.f(this.f200390b, bVar.f200390b);
    }

    public final int hashCode() {
        int iHashCode = this.f200389a.hashCode() * 31;
        CircleBadgeModel circleBadgeModel = this.f200390b;
        return iHashCode + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode());
    }
}
