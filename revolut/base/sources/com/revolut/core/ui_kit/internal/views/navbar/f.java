package com.revolut.core.ui_kit.internal.views.navbar;

import com.revolut.core.ui_kit.internal.views.navbar.VersatileTitleView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends VersatileTitleView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f57410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f57411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f57412c;

    public f(Image image, float f, float f4) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f57410a = image;
        this.f57411b = f;
        this.f57412c = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f57410a, fVar.f57410a) && Float.compare(this.f57411b, fVar.f57411b) == 0 && Float.compare(this.f57412c, fVar.f57412c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f57412c) + m72.b.b(this.f57411b, this.f57410a.hashCode() * 31, 31);
    }
}
