package com.revolut.core.ui_kit.internal.drawables;

import com.revolut.core.ui_kit.drawables.RevolutDrawableWrapper;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/internal/drawables/LockableAlphaDrawable;", "Lcom/revolut/core/ui_kit/drawables/RevolutDrawableWrapper;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LockableAlphaDrawable extends RevolutDrawableWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f55992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55993b;

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f55993b = i;
        if (this.f55992a) {
            return;
        }
        super.setAlpha(i);
    }
}
