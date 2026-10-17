package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o1 extends BigTileDelegate.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f54526a;

    public o1(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f54526a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o1) && Intrinsics.f(this.f54526a, ((o1) obj2).f54526a);
    }

    public final int hashCode() {
        return this.f54526a.hashCode();
    }
}
