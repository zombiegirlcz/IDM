package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ExtraSmallCardDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d6 extends ExtraSmallCardDelegate.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f54012a;

    public d6(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f54012a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d6) && Intrinsics.f(this.f54012a, ((d6) obj2).f54012a);
    }

    public final int hashCode() {
        return this.f54012a.hashCode();
    }
}
