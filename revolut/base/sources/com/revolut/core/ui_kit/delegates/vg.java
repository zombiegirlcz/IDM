package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class vg extends SmallStockCardDelegate.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f54882a;

    public vg(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f54882a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof vg) && Intrinsics.f(this.f54882a, ((vg) obj2).f54882a);
    }

    public final int hashCode() {
        return this.f54882a.hashCode();
    }
}
