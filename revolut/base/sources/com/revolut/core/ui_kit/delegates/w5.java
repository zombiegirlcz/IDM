package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class w5 implements y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f54893a;

    public w5(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f54893a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w5) && Intrinsics.f(this.f54893a, ((w5) obj2).f54893a);
    }

    public final int hashCode() {
        return this.f54893a.hashCode();
    }
}
