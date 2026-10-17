package com.revolut.core.ui_kit.internal.drawables;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.revolut.core.ui_kit.drawables.RevolutDrawableWrapper;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/internal/drawables/RevolutAnimatableDrawable;", "Lcom/revolut/core/ui_kit/drawables/RevolutDrawableWrapper;", "Landroid/graphics/drawable/Animatable;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutAnimatableDrawable extends RevolutDrawableWrapper implements Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f55999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f56000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f56001c;

    public RevolutAnimatableDrawable(Drawable drawable) {
        super(drawable);
        this.f55999a = true;
    }

    public final void c(boolean z) {
        if (z == this.f56000b) {
            return;
        }
        this.f56000b = z;
        if (z) {
            return;
        }
        Object drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        boolean zIsRunning = animatable.isRunning();
        boolean z3 = this.f56001c;
        if (zIsRunning != z3) {
            if (z3) {
                animatable.start();
            } else {
                animatable.stop();
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Object drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            return animatable.isRunning();
        }
        return false;
    }

    @Override // android.graphics.drawable.DrawableWrapper
    public final void setDrawable(Drawable drawable) {
        if (this.f55999a) {
            throw new IllegalStateException("Drawable can be set only once");
        }
        super.setDrawable(drawable);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (!this.f56000b) {
            Object drawable = getDrawable();
            Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
            if (animatable != null) {
                animatable.start();
            }
        }
        this.f56001c = true;
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (!this.f56000b) {
            Object drawable = getDrawable();
            Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
            if (animatable != null) {
                animatable.stop();
            }
        }
        this.f56001c = false;
    }
}
