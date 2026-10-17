package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class wd extends QRCodeDelegate.Model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f54921a;

    public wd(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f54921a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof wd) && this.f54921a.equals(((wd) obj2).f54921a);
    }

    public final int hashCode() {
        return this.f54921a.hashCode();
    }
}
