package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.WhiteCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s1 implements v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayeredImage f55502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CircleBadgeModel f55503b;

    public s1(LayeredImage image, WhiteCircleBadge whiteCircleBadge) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f55502a = image;
        this.f55503b = whiteCircleBadge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj2;
        return this.f55502a.equals(s1Var.f55502a) && Intrinsics.f(this.f55503b, s1Var.f55503b);
    }

    public final int hashCode() {
        int iHashCode = this.f55502a.hashCode() * 31;
        CircleBadgeModel circleBadgeModel = this.f55503b;
        return iHashCode + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode());
    }
}
