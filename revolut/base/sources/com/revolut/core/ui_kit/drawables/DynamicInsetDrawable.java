package com.revolut.core.ui_kit.drawables;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit/drawables/DynamicInsetDrawable;", "Lcom/revolut/core/ui_kit/drawables/RevolutDrawableWrapper;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DynamicInsetDrawable extends RevolutDrawableWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55768c;
    public int d;
    public boolean e;

    public final void c() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setBounds(getBounds().left + this.f55766a, getBounds().top + this.f55767b, getBounds().right - this.f55768c, getBounds().bottom - this.d);
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.e = true;
        c();
    }
}
