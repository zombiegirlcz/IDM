package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class v4 extends CounterTextDelegate.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f54848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y4 f54849b;

    public v4(Image image) {
        y4 size = y4.Small;
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f54848a = image;
        this.f54849b = size;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v4)) {
            return false;
        }
        v4 v4Var = (v4) obj2;
        return Intrinsics.f(this.f54848a, v4Var.f54848a) && this.f54849b == v4Var.f54849b;
    }

    public final int hashCode() {
        return this.f54849b.hashCode() + (this.f54848a.hashCode() * 31);
    }
}
