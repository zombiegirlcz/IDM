package com.revolut.core.ui_kit.internal.drawables;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import androidx.core.graphics.ColorUtils;
import aw0.v1;
import c8g.c;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.drawables.RevolutDrawableWrapper;
import com.revolut.core.ui_kit_resources.R$attr;
import dr0.a0;
import dr0.u;
import dr0.v;
import dr0.w;
import dr0.x;
import dr0.y;
import dr0.z;
import fp0.d;
import fr0.f;
import jo0.g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rr0.h;
import zhm.p;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00052\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/internal/drawables/RoundedBackgroundDrawable;", "Lcom/revolut/core/ui_kit/drawables/RevolutDrawableWrapper;", "Lhp0/a;", "Lfr0/f;", "Ldr0/v;", "Companion", "dr0/a0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RoundedBackgroundDrawable extends RevolutDrawableWrapper implements hp0.a, f, v {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ColorStateList f56002r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f56003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f56004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f56005c;
    public int d;
    public final ShapeDrawable e;
    public final RippleDrawable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f56006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f56007h;
    public a0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f56008j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f56009l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f56010m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f56011n;
    public final Paint o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u f56012p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f56013q;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static RoundedBackgroundDrawable a(Context context, int i, int i2) {
            Intrinsics.checkNotNullParameter(context, "context");
            RoundedBackgroundDrawable roundedBackgroundDrawable = new RoundedBackgroundDrawable(context, i2, true);
            roundedBackgroundDrawable.d(i, i2);
            return roundedBackgroundDrawable;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
        public static RoundedBackgroundDrawable b(Companion companion, Context context, int i, int i2) {
            if ((i2 & 2) != 0) {
                i = kli.a.s(R$attr.uikit_colorForeground, context);
            }
            companion.getClass();
            int iD = ((Boolean) g.D.getValue()).booleanValue() ? io0.a.d(0.6f, kli.a.s(R$attr.uikit_colorElevatedPopoverBackground, context)) : kli.a.q(context) ? io0.a.d(0.8f, kli.a.s(R$attr.uikit_colorPopoverBackground, context)) : io0.a.d(0.8f, kli.a.s(R$attr.uikit_colorGrey8, context));
            companion.getClass();
            return a(context, i, iD);
        }

        public static RoundedBackgroundDrawable c(int i, Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new RoundedBackgroundDrawable(context, io0.a.d(1.0f, i), 4);
        }
    }

    static {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(colorStateListValueOf, "valueOf(...)");
        f56002r = colorStateListValueOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedBackgroundDrawable(Context context, int i, boolean z) {
        super(null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56003a = context;
        this.f56004b = z;
        float[] fArr = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        this.f56005c = fArr;
        this.d = i;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        this.e = shapeDrawable;
        RippleDrawable rippleDrawable = new RippleDrawable(f56002r, null, shapeDrawable);
        this.f = rippleDrawable;
        this.i = x.f117069a;
        this.f56010m = true;
        this.f56011n = 1.0f;
        Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        paintC.setColor(this.d);
        this.o = paintC;
        this.f56012p = z ? new u(context, new w(0)) : null;
        setDrawable(rippleDrawable);
        if (z) {
            Rect bounds = getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
            g(bounds);
        }
    }

    @Override // fr0.f
    public final void a(v1 colorScheme) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        u uVar = this.f56012p;
        if (uVar != null) {
            Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
            uVar.f117065b = colorScheme;
        }
        invalidateSelf();
    }

    @Override // hp0.a
    public final Drawable b() {
        return this.f;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getD() {
        return this.d;
    }

    public final void d(int i, int i2) {
        boolean z;
        if (i2 == this.d) {
            z = false;
        } else {
            this.d = i2;
            this.f56013q = true;
            h();
            if (this.f56004b) {
                Rect bounds = getBounds();
                Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
                g(bounds);
            }
            z = true;
        }
        a0 a0Var = this.i;
        if (!(a0Var instanceof y)) {
            y yVar = new y();
            yVar.f117070a = i;
            this.i = yVar;
            this.f56010m = true;
            return;
        }
        y yVar2 = (y) a0Var;
        if (yVar2.f117070a != i) {
            yVar2.f117070a = i;
            this.f56010m = true;
        } else if (z) {
            this.f56010m = true;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        u uVar;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean z = this.f56013q;
        boolean z3 = this.f56004b;
        if (!z) {
            this.f56013q = true;
            h();
            if (z3) {
                Rect bounds = getBounds();
                Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
                g(bounds);
            }
        }
        float f = getBounds().left;
        float f4 = getBounds().top;
        float f5 = getBounds().right;
        float f6 = getBounds().bottom;
        float f32 = this.f56006g;
        canvas.drawRoundRect(f, f4, f5, f6, f32, f32, this.o);
        if (((Boolean) g.D.getValue()).booleanValue() && z3 && (uVar = this.f56012p) != null) {
            Rect bounds2 = getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds2, "getBounds(...)");
            float f35 = this.f56006g;
            w wVar = uVar.f117064a;
            float f36 = uVar.f117066c;
            Paint paint = uVar.f;
            RectF rectF = uVar.d;
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(bounds2, "bounds");
            if (!bounds2.isEmpty()) {
                Shader shader = paint.getShader();
                float f37 = BitmapDescriptorFactory.HUE_RED;
                if (shader == null) {
                    Intrinsics.checkNotNullParameter(bounds2, "bounds");
                    c.q(paint, bounds2, new int[]{io0.a.d(0.48f, -1), io0.a.d(0.08f, -1), io0.a.d(BitmapDescriptorFactory.HUE_RED, -1), io0.a.d(0.08f, -1), io0.a.d(0.48f, -1)}, u.f117063h);
                }
                float f41 = f36 / 2.0f;
                boolean z4 = uVar.f117065b == v1.DARK;
                rectF.set(bounds2);
                rectF.inset(f41, f41);
                float f42 = f35 - f41;
                if (f42 < BitmapDescriptorFactory.HUE_RED) {
                    f42 = 0.0f;
                }
                if (z4 || !uVar.e) {
                    wVar.invoke(canvas, rectF, Float.valueOf(f42), paint);
                } else {
                    wVar.invoke(canvas, rectF, Float.valueOf(f42), uVar.f117067g);
                    rectF.inset(f36, f36);
                    float f57 = f42 - f36;
                    if (f57 >= BitmapDescriptorFactory.HUE_RED) {
                        f37 = f57;
                    }
                    wVar.invoke(canvas, rectF, Float.valueOf(f37), paint);
                }
            }
        }
        super.draw(canvas);
    }

    public final void e(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        this.f56013q = true;
        h();
        if (this.f56004b) {
            Rect bounds = getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
            g(bounds);
        }
        this.f56010m = true;
    }

    public final void f(int i) {
        this.f56007h = true;
        float f = i;
        if (f == this.f56006g) {
            return;
        }
        this.f56006g = f;
        float[] fArr = this.f56005c;
        p.o(fArr, f, 0, fArr.length);
        this.e.setShape(new RoundRectShape(fArr, null, null));
        invalidateSelf();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void g(Rect bounds) {
        u uVar;
        if (((Boolean) g.D.getValue()).booleanValue() && (uVar = this.f56012p) != null) {
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            c.q(uVar.f, bounds, new int[]{io0.a.d(0.48f, -1), io0.a.d(0.08f, -1), io0.a.d(BitmapDescriptorFactory.HUE_RED, -1), io0.a.d(0.08f, -1), io0.a.d(0.48f, -1)}, u.f117063h);
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Intrinsics.checkNotNullParameter(outline, "outline");
        outline.setRoundRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, this.f56006g);
    }

    public final void h() {
        int iD = io0.a.d((Color.alpha(this.d) / 255.0f) * this.f56011n, this.d);
        Paint paint = this.o;
        if (paint.getColor() != iD) {
            paint.setColor(iD);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        if (this.f56004b) {
            g(bounds);
        }
        if (this.f56007h) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(getBounds(), "getBounds(...)");
        float fMin = Math.min(r3.width(), r3.height()) / 2;
        if (fMin == this.f56006g) {
            return;
        }
        this.f56006g = fMin;
        float[] fArr = this.f56005c;
        p.o(fArr, fMin, 0, fArr.length);
        this.e.setShape(new RoundRectShape(fArr, null, null));
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] state) {
        int defaultColor;
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.f56010m) {
            a0 a0Var = this.i;
            boolean z = a0Var instanceof z;
            Context context = this.f56003a;
            if (z) {
                defaultColor = ((z) a0Var).f117071a.c(context).getDefaultColor();
            } else if (a0Var instanceof y) {
                defaultColor = new d(new Color.SolidInt(((y) a0Var).f117070a), new Color.SolidInt(this.d), false).c(context).getDefaultColor();
            } else {
                if (!Intrinsics.f(a0Var, x.f117069a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (h.b(ColorUtils.setAlphaComponent(this.o.getColor(), 255)) < 0.5d) {
                    if (this.k == 0) {
                        this.k = kli.a.s(R$attr.uikit_colorGrey10_40, context);
                    }
                    defaultColor = this.k;
                } else {
                    if (this.f56009l == 0) {
                        this.f56009l = kli.a.s(R$attr.uikit_colorGreyTone20, context);
                    }
                    defaultColor = this.f56009l;
                }
            }
            if (this.f56008j != defaultColor) {
                this.f56008j = defaultColor;
                this.f.setColor(ColorStateList.valueOf(defaultColor));
            }
            this.f56010m = false;
        }
        return super.onStateChange(state);
    }

    @Override // dr0.v
    public final void q(boolean z) {
        u uVar = this.f56012p;
        if (uVar != null) {
            uVar.e = z;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        float f = i;
        this.f56011n = f / 255.0f;
        u uVar = this.f56012p;
        if (uVar != null) {
            uVar.f.setAlpha(i);
            uVar.f117067g.setAlpha((int) (f * 0.04f));
        }
        h();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public /* synthetic */ RoundedBackgroundDrawable(Context context, int i, int i2) {
        this(context, (i2 & 2) != 0 ? kli.a.s(R$attr.uikit_colorGreyTone8, context) : i, false);
    }
}
