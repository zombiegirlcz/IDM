package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a8 extends b8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayeredImage f53669a;

    public a8(LayeredImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f53669a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a8) && this.f53669a.equals(((a8) obj2).f53669a);
    }

    public final int hashCode() {
        return this.f53669a.hashCode();
    }
}
