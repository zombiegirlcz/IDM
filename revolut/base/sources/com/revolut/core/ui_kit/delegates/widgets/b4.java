package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b4 implements f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f55304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f55305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ms0.h4 f55306c;

    public b4(int i, Clause text, ResourceImage resourceImage, ms0.h4 style) {
        resourceImage = (i & 2) != 0 ? null : resourceImage;
        style = (i & 4) != 0 ? ms0.h4.SEMIACCENT : style;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f55304a = text;
        this.f55305b = resourceImage;
        this.f55306c = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj2;
        return Intrinsics.f(this.f55304a, b4Var.f55304a) && Intrinsics.f(this.f55305b, b4Var.f55305b) && this.f55306c == b4Var.f55306c;
    }

    public final int hashCode() {
        int iHashCode = this.f55304a.hashCode() * 31;
        Image image = this.f55305b;
        return this.f55306c.hashCode() + ((iHashCode + (image == null ? 0 : image.hashCode())) * 31);
    }
}
