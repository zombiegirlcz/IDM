package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f54449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NewBadgeContent f54450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CircleBadgeModel f54451c;
    public final ProgressStyle d;

    /* JADX WARN: Illegal instructions before constructor call */
    public m(Image image, LayeredImage layeredImage, ProgressStyle progressStyle, int i) {
        layeredImage = (i & 2) != 0 ? null : layeredImage;
        progressStyle = (i & 4) != 0 ? null : progressStyle;
        Intrinsics.checkNotNullParameter(image, "image");
        this(image, (NewBadgeContent) null, layeredImage != null ? new RawImageBadge(layeredImage) : null, progressStyle);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f54449a, mVar.f54449a) && Intrinsics.f(this.f54450b, mVar.f54450b) && Intrinsics.f(this.f54451c, mVar.f54451c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f54449a.hashCode() * 31;
        NewBadgeContent newBadgeContent = this.f54450b;
        int iHashCode2 = (iHashCode + (newBadgeContent == null ? 0 : newBadgeContent.hashCode())) * 31;
        CircleBadgeModel circleBadgeModel = this.f54451c;
        int iHashCode3 = (iHashCode2 + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode())) * 31;
        ProgressStyle progressStyle = this.d;
        return iHashCode3 + (progressStyle != null ? progressStyle.hashCode() : 0);
    }

    public m(Image image, NewBadgeContent newBadgeContent, CircleBadgeModel circleBadgeModel, ProgressStyle progressStyle) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f54449a = image;
        this.f54450b = newBadgeContent;
        this.f54451c = circleBadgeModel;
        this.d = progressStyle;
    }

    public /* synthetic */ m(Image image, NewBadgeContent.WithNumber withNumber, CircleBadgeModel circleBadgeModel, int i) {
        this(image, (i & 2) != 0 ? null : withNumber, circleBadgeModel, (ProgressStyle) null);
    }
}
