package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$color;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.s;
import ms0.t;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/CameraMaskView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Rect;", "getMaskBounds", "()Landroid/graphics/Rect;", "", "background", "", "setMaskBackground", "(I)V", "Lcom/revolut/core/ui_kit/internal/views/CameraMaskView$b;", "mask", "setMask", "(Lcom/revolut/core/ui_kit/internal/views/CameraMaskView$b;)V", "", "activated", "setBorderActivated", "(Z)V", "enabled", "setDecorationEnabled", "b", "a", "ms0/s", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CameraMaskView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f56109c;
    public Bitmap d;
    public Canvas e;
    public final Rect f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RectF f56110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Bitmap f56111h;
    public final Paint i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f56112j;
    public Drawable k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f56113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f56114m;

    public static final class a {
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(BitmapDescriptorFactory.HUE_RED);
        }
    }

    public static abstract class b {
        private b() {
        }

        public abstract a a();

        public abstract int b();

        public abstract s c();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraMaskView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final float a(int i) {
        b bVar = this.f56109c;
        if (bVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i2 = t.f208426a[bVar.c().ordinal()];
        int i3 = this.f56107a;
        if (i2 == 1) {
            int measuredWidth = (getMeasuredWidth() - i) / 2;
            if (measuredWidth >= i3) {
                i3 = measuredWidth;
            }
        } else if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return i3;
    }

    public final void b() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Canvas canvas = this.e;
        if (canvas != null && (bitmap = this.d) != null && (bitmap2 = this.f56111h) != null) {
            bitmap2.eraseColor(0);
            canvas.drawColor(this.f56108b);
            canvas.drawBitmap(bitmap, this.f, this.f56110g, this.i);
            invalidate();
        }
        invalidate();
    }

    @NotNull
    public final Rect getMaskBounds() {
        Rect rect = new Rect();
        this.f56110g.roundOut(rect);
        return rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Bitmap bitmap = this.f56111h;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        }
        if (this.f56114m) {
            if (this.f56113l) {
                Drawable drawable = this.k;
                if (drawable != null) {
                    drawable.draw(canvas);
                    return;
                }
                return;
            }
            Drawable drawable2 = this.f56112j;
            if (drawable2 != null) {
                drawable2.draw(canvas);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Bitmap bitmap;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        RectF rectF = this.f56110g;
        if (measuredWidth != 0 && getMeasuredHeight() != 0 && (bitmap = this.d) != null) {
            this.f.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            float fMax = Math.max(bitmap.getHeight() / getMeasuredHeight(), bitmap.getWidth() / (getMeasuredWidth() - (a(bitmap.getWidth()) * 2)));
            float height = bitmap.getHeight() / fMax;
            float width = bitmap.getWidth() / fMax;
            float fA = a((int) width);
            rectF.left = fA;
            rectF.top = BitmapDescriptorFactory.HUE_RED;
            rectF.right = fA + width;
            rectF.bottom = height;
            Drawable drawable = this.f56112j;
            if (drawable != null) {
                Rect rect = new Rect();
                rectF.roundOut(rect);
                drawable.setBounds(rect);
            }
            Drawable drawable2 = this.k;
            if (drawable2 != null) {
                Rect rect2 = new Rect();
                rectF.roundOut(rect2);
                drawable2.setBounds(rect2);
            }
        }
        setMeasuredDimension(getMeasuredWidth(), (int) rectF.height());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        if (i == 0 || i2 == 0) {
            this.f56111h = null;
            this.e = null;
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            this.f56111h = bitmapCreateBitmap;
            this.e = new Canvas(bitmapCreateBitmap);
        }
        b();
    }

    public final void setBorderActivated(boolean activated) {
        if (this.f56113l == activated) {
            return;
        }
        this.f56113l = activated;
        invalidate();
    }

    public final void setDecorationEnabled(boolean enabled) {
        if (this.f56114m == enabled) {
            return;
        }
        this.f56114m = enabled;
        invalidate();
    }

    public final void setMask(@NotNull b mask) {
        Intrinsics.checkNotNullParameter(mask, "mask");
        if (Intrinsics.f(this.f56109c, mask)) {
            return;
        }
        this.f56109c = mask;
        Drawable drawable = getResources().getDrawable(mask.b(), getContext().getTheme());
        Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
        this.d = DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null);
        if (mask.a() != null) {
            this.f56112j = null;
            this.k = null;
        }
        requestLayout();
    }

    public final void setMaskBackground(int background) {
        if (this.f56108b == background) {
            return;
        }
        this.f56108b = background;
        b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraMaskView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56107a = kli.a.k(context, 16.0f);
        this.f56108b = ContextCompat.getColor(context, R$color.internal_background_80_night);
        this.f = new Rect();
        this.f56110g = new RectF();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.i = paint;
        new RectF();
    }
}
