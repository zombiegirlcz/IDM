package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.badge.RawCutoutImageBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayeredImage f55510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RawCutoutImageBadge f55511b;

    public t0(LayeredImage image, RawCutoutImageBadge rawCutoutImageBadge) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f55510a = image;
        this.f55511b = rawCutoutImageBadge;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return this.f55510a.equals(t0Var.f55510a) && this.f55511b.equals(t0Var.f55511b);
    }

    public final int hashCode() {
        return this.f55511b.f58064a.hashCode() + (this.f55510a.hashCode() * 31);
    }
}
