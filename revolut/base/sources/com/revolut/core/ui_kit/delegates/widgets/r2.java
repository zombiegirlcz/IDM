package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f55490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f55491b;

    public r2(Clause text, ResourceImage resourceImage) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f55490a = text;
        this.f55491b = resourceImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj2;
        return Intrinsics.f(this.f55490a, r2Var.f55490a) && Intrinsics.f(this.f55491b, r2Var.f55491b);
    }

    public final int hashCode() {
        int iHashCode = this.f55490a.hashCode() * 31;
        Image image = this.f55491b;
        return iHashCode + (image == null ? 0 : image.hashCode());
    }
}
