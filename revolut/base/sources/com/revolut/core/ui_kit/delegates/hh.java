package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class hh extends SplitColumnCellDelegate.Model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f54260a;

    public hh(ResourceImage iconValue) {
        Intrinsics.checkNotNullParameter(iconValue, "iconValue");
        this.f54260a = iconValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof hh) && this.f54260a.equals(((hh) obj2).f54260a);
    }

    public final int hashCode() {
        return this.f54260a.hashCode();
    }
}
