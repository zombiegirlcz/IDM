package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.go0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class zi extends VoucherSmallTileDelegate.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f55714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final go0 f55715b;

    public zi(Image image, go0 blurOption) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(blurOption, "blurOption");
        this.f55714a = image;
        this.f55715b = blurOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zi)) {
            return false;
        }
        zi ziVar = (zi) obj2;
        return Intrinsics.f(this.f55714a, ziVar.f55714a) && this.f55715b == ziVar.f55715b;
    }

    public final int hashCode() {
        return this.f55715b.hashCode() + (this.f55714a.hashCode() * 31);
    }

    public /* synthetic */ zi(Image image) {
        this(image, go0.NO_BLUR);
    }
}
