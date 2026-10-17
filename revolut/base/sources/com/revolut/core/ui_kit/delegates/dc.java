package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class dc extends ProductSelectionDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f54032a;

    public dc(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f54032a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof dc) && Intrinsics.f(this.f54032a, ((dc) obj2).f54032a);
    }

    public final int hashCode() {
        return this.f54032a.hashCode();
    }
}
