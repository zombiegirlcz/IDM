package com.revolut.core.ui_kit.internal.drawables;

import android.graphics.Rect;
import com.revolut.core.ui_kit.drawables.RevolutDrawableWrapper;
import dr0.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/internal/drawables/LockableBoundsDrawableWrapper;", "Lcom/revolut/core/ui_kit/drawables/RevolutDrawableWrapper;", "Ldr0/s;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LockableBoundsDrawableWrapper extends RevolutDrawableWrapper implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f55994a;

    public final void c(int i, int i2, int i3, int i5, boolean z) {
        if (!this.f55994a || z) {
            super.setBounds(i, i2, i3, i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        c(bounds.left, bounds.top, bounds.right, bounds.bottom, false);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i5) {
        c(i, i2, i3, i5, false);
    }
}
