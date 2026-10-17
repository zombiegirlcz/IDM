package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.MapPlainDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c9 extends MapPlainDelegate.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f53747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f53748b;

    public c9(ResourceImage resourceImage, List locations) {
        Intrinsics.checkNotNullParameter(locations, "locations");
        this.f53747a = resourceImage;
        this.f53748b = locations;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c9)) {
            return false;
        }
        c9 c9Var = (c9) obj2;
        return Intrinsics.f(this.f53747a, c9Var.f53747a) && Intrinsics.f(this.f53748b, c9Var.f53748b);
    }

    public final int hashCode() {
        Image image = this.f53747a;
        return this.f53748b.hashCode() + ((image == null ? 0 : image.hashCode()) * 31);
    }
}
