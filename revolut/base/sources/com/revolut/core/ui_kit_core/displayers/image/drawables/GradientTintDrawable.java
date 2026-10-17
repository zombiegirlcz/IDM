package com.revolut.core.ui_kit_core.displayers.image.drawables;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.revolut.core.ui_kit.drawables.RevolutDrawableWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/drawables/GradientTintDrawable;", "Lcom/revolut/core/ui_kit/drawables/RevolutDrawableWrapper;", "Companion", "a", "ui_kit_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GradientTintDrawable extends RevolutDrawableWrapper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f59820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f59821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RectF f59822c;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit_core.displayers.image.drawables.GradientTintDrawable$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static GradientTintDrawable a(Drawable originalDrawable, int[] colors) {
            Intrinsics.checkNotNullParameter(originalDrawable, "originalDrawable");
            Intrinsics.checkNotNullParameter(colors, "colors");
            return new GradientTintDrawable(originalDrawable, new Rect(originalDrawable.getBounds()), colors);
        }
    }

    public GradientTintDrawable(Drawable drawable, Rect rect, int[] iArr) {
        super(drawable);
        this.f59820a = iArr;
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f59821b = paint;
        this.f59822c = new RectF();
        setBounds(rect);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int iSaveLayer = canvas.saveLayer(this.f59822c, null);
        super.draw(canvas);
        canvas.drawRect(getBounds(), this.f59821b);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.f59822c = new RectF(bounds);
        this.f59821b.setShader(new LinearGradient(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f59820a, (float[]) null, Shader.TileMode.CLAMP));
    }
}
