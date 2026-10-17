package com.revolut.core.ui_kit_core.displayers.image.drawables;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.revolut.core.ui_kit_core.displayers.image.delegates.ScalableLayerDrawable;
import ix0.r0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yy0.n;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/drawables/MaskedLayerDrawable;", "Lcom/revolut/core/ui_kit_core/displayers/image/delegates/ScalableLayerDrawable;", "Lyy0/n;", "a", "ui_kit_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MaskedLayerDrawable extends ScalableLayerDrawable implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f59825c;
    public final a d;
    public Paint e;
    public final RectF f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f59826g;

    public static abstract class a {

        /* JADX INFO: renamed from: com.revolut.core.ui_kit_core.displayers.image.drawables.MaskedLayerDrawable$a$a, reason: collision with other inner class name */
        public static final class C0447a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0447a f59827a = new C0447a();

            private C0447a() {
            }

            @Override // com.revolut.core.ui_kit_core.displayers.image.drawables.MaskedLayerDrawable.a
            public final void a(Canvas canvas, Rect bounds, Paint paint, RectF scratchRect, Path scratchPath) {
                Intrinsics.checkNotNullParameter(canvas, "canvas");
                Intrinsics.checkNotNullParameter(bounds, "bounds");
                Intrinsics.checkNotNullParameter(paint, "paint");
                Intrinsics.checkNotNullParameter(scratchRect, "scratchRect");
                Intrinsics.checkNotNullParameter(scratchPath, "scratchPath");
                canvas.drawOval(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
            }

            @Override // com.revolut.core.ui_kit_core.displayers.image.drawables.MaskedLayerDrawable.a
            public final Drawable b(Drawable drawable) {
                Intrinsics.checkNotNullParameter(drawable, "drawable");
                return new CircularDrawable(drawable);
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f59828a = new b();

            private b() {
            }

            @Override // com.revolut.core.ui_kit_core.displayers.image.drawables.MaskedLayerDrawable.a
            public final void a(Canvas canvas, Rect bounds, Paint paint, RectF scratchRect, Path scratchPath) {
                Intrinsics.checkNotNullParameter(canvas, "canvas");
                Intrinsics.checkNotNullParameter(bounds, "bounds");
                Intrinsics.checkNotNullParameter(paint, "paint");
                Intrinsics.checkNotNullParameter(scratchRect, "scratchRect");
                Intrinsics.checkNotNullParameter(scratchPath, "scratchPath");
                scratchRect.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
                r0.a(scratchRect, scratchPath);
                canvas.drawPath(scratchPath, paint);
            }

            @Override // com.revolut.core.ui_kit_core.displayers.image.drawables.MaskedLayerDrawable.a
            public final Drawable b(Drawable drawable) {
                Intrinsics.checkNotNullParameter(drawable, "drawable");
                return new HexagonalDrawable(drawable);
            }
        }

        private a() {
        }

        public abstract void a(Canvas canvas, Rect rect, Paint paint, RectF rectF, Path path);

        public abstract Drawable b(Drawable drawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskedLayerDrawable(Drawable[] layers, a maskType, Integer num, Integer num2) {
        super(layers, num, num2);
        Intrinsics.checkNotNullParameter(layers, "layers");
        Intrinsics.checkNotNullParameter(maskType, "maskType");
        this.f59825c = 1;
        this.d = maskType;
        this.f = new RectF();
        this.f59826g = new Path();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Object callback = getCallback();
        while (true) {
            if (callback == null) {
                break;
            }
            if (!(callback instanceof View)) {
                Canvas canvas3 = canvas;
                if (!(callback instanceof Drawable)) {
                    callback = null;
                }
                Drawable drawable = (Drawable) callback;
                callback = drawable != null ? drawable.getCallback() : null;
                canvas = canvas3;
            } else if (((View) callback).getLayerType() == 2 && canvas.isHardwareAccelerated()) {
                int numberOfLayers = getNumberOfLayers();
                int i = 0;
                while (i < numberOfLayers) {
                    Drawable drawable2 = getDrawable(i);
                    if (i != this.f59825c) {
                        drawable2.draw(canvas);
                        canvas2 = canvas;
                    } else {
                        Rect bounds = drawable2.getBounds();
                        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
                        Paint paintC = this.e;
                        if (paintC == null) {
                            paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
                            paintC.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                            this.e = paintC;
                        }
                        canvas2 = canvas;
                        this.d.a(canvas2, bounds, paintC, this.f, this.f59826g);
                    }
                    i++;
                    canvas = canvas2;
                }
                return;
            }
        }
        super.draw(canvas);
    }
}
