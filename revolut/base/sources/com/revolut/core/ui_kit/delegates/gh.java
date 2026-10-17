package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class gh extends SplitColumnCellDelegate.Model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UrlImage f54224a;

    public gh(UrlImage imageValue) {
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        this.f54224a = imageValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof gh) && this.f54224a.equals(((gh) obj2).f54224a);
    }

    public final int hashCode() {
        return this.f54224a.hashCode();
    }
}
