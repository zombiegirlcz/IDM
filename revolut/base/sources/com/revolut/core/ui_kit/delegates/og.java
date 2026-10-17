package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class og extends SmallCardDelegate.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f54561a;

    public og(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f54561a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof og) && Intrinsics.f(this.f54561a, ((og) obj2).f54561a);
    }

    public final int hashCode() {
        return this.f54561a.hashCode();
    }
}
