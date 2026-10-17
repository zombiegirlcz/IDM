package com.revolut.core.ui_kit.drawables;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.drawables.AirTipBackgroundDrawable;
import com.revolut.core.ui_kit_resources.R$attr;
import kli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import sp0.b;
import te0.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/drawables/AirTipBackgroundDrawable;", "Lcom/revolut/core/ui_kit/drawables/RevolutDrawableWrapper;", "Companion", "sp0/b", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirTipBackgroundDrawable extends RevolutDrawableWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f55727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f55728c;
    public final Paint d;
    public final Path e;
    public final Path f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f55729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f55730h;
    public final Object i;

    public AirTipBackgroundDrawable(Context context) {
        b style = new b(0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(style, "style");
        super(new ColorDrawable(a.s(style.f264855a, context)));
        this.f55726a = context;
        this.f55727b = style;
        Paint paint = new Paint(1);
        Paint.Style style2 = Paint.Style.STROKE;
        paint.setStyle(style2);
        paint.setStrokeWidth(a.l(context, 1.5f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint.setMaskFilter(new BlurMaskFilter(2.0f, blur));
        this.f55728c = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style2);
        paint2.setStrokeWidth(a.l(context, 16.0f));
        paint2.setStrokeCap(cap);
        paint2.setMaskFilter(new BlurMaskFilter(a.l(context, 50.0f), blur));
        this.d = paint2;
        this.e = new Path();
        this.f = new Path();
        this.f55729g = a.l(context, 24.0f);
        final int i = 0;
        this.f55730h = w.y0(new Function0(this) { // from class: sp0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirTipBackgroundDrawable f264854b;

            {
                this.f264854b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        AirTipBackgroundDrawable airTipBackgroundDrawable = this.f264854b;
                        b bVar = airTipBackgroundDrawable.f55727b;
                        Context context2 = airTipBackgroundDrawable.f55726a;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(context2, "context");
                        return new int[]{kli.a.s(R$attr.uikit_colorAirPrimary, context2), kli.a.s(R$attr.uikit_colorAirSecondary, context2)};
                    default:
                        AirTipBackgroundDrawable airTipBackgroundDrawable2 = this.f264854b;
                        b bVar2 = airTipBackgroundDrawable2.f55727b;
                        Context context3 = airTipBackgroundDrawable2.f55726a;
                        bVar2.getClass();
                        Intrinsics.checkNotNullParameter(context3, "context");
                        return new int[]{io0.a.d(0.6f, kli.a.s(R$attr.uikit_colorAirPrimary, context3)), kli.a.s(R$attr.uikit_colorAirPrimary, context3), io0.a.d(0.6f, kli.a.s(R$attr.uikit_colorAirSecondary, context3)), kli.a.s(R$attr.uikit_colorAirSecondary, context3)};
                }
            }
        });
        final int i2 = 1;
        this.i = w.y0(new Function0(this) { // from class: sp0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirTipBackgroundDrawable f264854b;

            {
                this.f264854b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        AirTipBackgroundDrawable airTipBackgroundDrawable = this.f264854b;
                        b bVar = airTipBackgroundDrawable.f55727b;
                        Context context2 = airTipBackgroundDrawable.f55726a;
                        bVar.getClass();
                        Intrinsics.checkNotNullParameter(context2, "context");
                        return new int[]{kli.a.s(R$attr.uikit_colorAirPrimary, context2), kli.a.s(R$attr.uikit_colorAirSecondary, context2)};
                    default:
                        AirTipBackgroundDrawable airTipBackgroundDrawable2 = this.f264854b;
                        b bVar2 = airTipBackgroundDrawable2.f55727b;
                        Context context3 = airTipBackgroundDrawable2.f55726a;
                        bVar2.getClass();
                        Intrinsics.checkNotNullParameter(context3, "context");
                        return new int[]{io0.a.d(0.6f, kli.a.s(R$attr.uikit_colorAirPrimary, context3)), kli.a.s(R$attr.uikit_colorAirPrimary, context3), io0.a.d(0.6f, kli.a.s(R$attr.uikit_colorAirSecondary, context3)), kli.a.s(R$attr.uikit_colorAirSecondary, context3)};
                }
            }
        });
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.draw(canvas);
        Path path = this.f;
        if (path.isEmpty()) {
            return;
        }
        Path path2 = this.e;
        if (path2.isEmpty()) {
            return;
        }
        canvas.drawPath(path, this.d);
        canvas.drawPath(path2, this.f55728c);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        if (getBounds().isEmpty()) {
            return;
        }
        Paint paint = this.f55728c;
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        float f = getBounds().left + strokeWidth;
        float f4 = getBounds().top + strokeWidth;
        float f5 = getBounds().right - strokeWidth;
        float f6 = getBounds().bottom - strokeWidth;
        Path path = this.e;
        path.reset();
        path.moveTo(f, f6);
        float f32 = this.f55729g;
        path.lineTo(f, f4 + f32);
        float f35 = 2 * f32;
        float f36 = f4 + f35;
        path.arcTo(new RectF(f, f4, f + f35, f36), 180.0f, 90.0f, false);
        path.lineTo(f5 - f32, f4);
        path.arcTo(new RectF(f5 - f35, f4, f5, f36), 270.0f, 90.0f, false);
        path.lineTo(f5, f6);
        int[] iArr = (int[]) this.f55730h.getValue();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        LinearGradient linearGradient = new LinearGradient(f, f4, f5, f4, iArr, (float[]) null, tileMode);
        Context context = this.f55726a;
        LinearGradient linearGradient2 = new LinearGradient(BitmapDescriptorFactory.HUE_RED, f4, BitmapDescriptorFactory.HUE_RED, f4 + a.l(context, 56.0f), new int[]{0, -1}, new float[]{0.15f, 1.0f}, tileMode);
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint.setShader(new ComposeShader(linearGradient, linearGradient2, mode));
        Path path2 = this.f;
        path2.reset();
        path2.addRoundRect(new RectF(f, f4, f5, f6), f32, f32, Path.Direction.CW);
        this.d.setShader(new ComposeShader(new LinearGradient(f, f4, f5, f4, (int[]) this.i.getValue(), (float[]) null, tileMode), new LinearGradient(BitmapDescriptorFactory.HUE_RED, f4, BitmapDescriptorFactory.HUE_RED, a.l(context, 84.0f) + f4, new int[]{0, -1}, new float[]{0.15f, 1.0f}, tileMode), mode));
    }
}
