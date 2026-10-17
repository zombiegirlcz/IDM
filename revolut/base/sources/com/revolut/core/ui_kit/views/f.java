package com.revolut.core.ui_kit.views;

import com.revolut.core.ui_kit.views.DialogHeaderView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends DialogHeaderView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f59058a;

    public f(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f59058a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f59058a, ((f) obj2).f59058a);
    }

    public final int hashCode() {
        return this.f59058a.hashCode();
    }
}
