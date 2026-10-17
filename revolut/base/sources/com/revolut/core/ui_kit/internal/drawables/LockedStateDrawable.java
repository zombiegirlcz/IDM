package com.revolut.core.ui_kit.internal.drawables;

import android.graphics.drawable.StateListDrawable;
import com.revolut.core.ui_kit.drawables.RevolutDrawableWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/internal/drawables/LockedStateDrawable;", "Lcom/revolut/core/ui_kit/drawables/RevolutDrawableWrapper;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LockedStateDrawable extends RevolutDrawableWrapper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockedStateDrawable(StateListDrawable original, int[] stateSet) {
        super(original);
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(stateSet, "stateSet");
        original.setState(stateSet);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] stateSet) {
        Intrinsics.checkNotNullParameter(stateSet, "stateSet");
        return false;
    }
}
