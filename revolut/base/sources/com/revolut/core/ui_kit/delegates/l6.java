package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l6 extends FullScreenStateDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f54423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ms0.h4 f54424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f54425c;

    public l6(int i, Clause text, ResourceImage resourceImage, ms0.h4 style) {
        resourceImage = (i & 4) != 0 ? null : resourceImage;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f54423a = text;
        this.f54424b = style;
        this.f54425c = resourceImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l6)) {
            return false;
        }
        l6 l6Var = (l6) obj2;
        return Intrinsics.f(this.f54423a, l6Var.f54423a) && this.f54424b == l6Var.f54424b && Intrinsics.f(this.f54425c, l6Var.f54425c);
    }

    public final int hashCode() {
        int iHashCode = (this.f54424b.hashCode() + (this.f54423a.hashCode() * 31)) * 31;
        Image image = this.f54425c;
        return (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
    }
}
