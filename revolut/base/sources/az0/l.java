package az0;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.revolut.core.ui_kit_core.displayers.image.models.CardIconInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends Drawable {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f11314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f11315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Drawable f11316c;
    public final Drawable d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11318h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f11319j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f11320l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f11321m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f11322n;

    public l(Drawable body, Drawable drawable, Drawable revolutIcon, Drawable drawable2, int i, CardIconInfo cardIconInfo, Resources resources) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(revolutIcon, "revolutIcon");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f11314a = body;
        this.f11315b = drawable;
        this.f11316c = revolutIcon;
        this.d = drawable2;
        this.e = i;
        this.f = a(resources, 14);
        this.f11317g = a(resources, 2);
        this.f11318h = a(resources, 4);
        this.i = a(resources, 3);
        this.f11319j = a(resources, cardIconInfo != null ? cardIconInfo.f59862a : 0);
        this.k = a(resources, cardIconInfo != null ? cardIconInfo.f59863b : 0);
        this.f11320l = a(resources, cardIconInfo != null ? cardIconInfo.f59864c : 0);
        this.f11321m = a(resources, cardIconInfo != null ? cardIconInfo.d : 0);
        this.f11322n = cardIconInfo != null ? cardIconInfo.e : i;
    }

    public static int a(Resources resources, int i) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return (int) Math.rint((resources.getDisplayMetrics().densityDpi / 160.0f) * i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f11314a.draw(canvas);
        Drawable drawable = this.f11315b;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        this.f11316c.draw(canvas);
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f11314a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f11314a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f11314a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f11314a.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f11314a.setBounds(bounds);
        Drawable drawable = this.f11315b;
        if (drawable != null) {
            int i = bounds.left;
            int i2 = this.f11317g;
            Rect rect = new Rect(i - i2, bounds.top, bounds.right - i2, bounds.bottom);
            Rect rect2 = new Rect();
            int i3 = this.f;
            Gravity.apply(85, i3, i3, rect, rect2, 0);
            drawable.setBounds(rect2);
        }
        int i5 = bounds.left;
        int i6 = this.f11318h;
        int i21 = bounds.top;
        int i22 = this.i;
        Rect rect3 = new Rect(i5 + i6, i21 + i22, bounds.right - i6, bounds.bottom - i22);
        Rect rect4 = new Rect();
        Drawable drawable2 = this.f11316c;
        Gravity.apply(this.e, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight(), rect3, rect4, 0);
        drawable2.setBounds(rect4);
        Drawable drawable3 = this.d;
        if (drawable3 != null) {
            int intrinsicWidth = drawable3.getIntrinsicWidth();
            int intrinsicHeight = drawable3.getIntrinsicHeight();
            Rect rect5 = new Rect(bounds.left + this.f11319j, bounds.top + this.k, bounds.right - this.f11320l, bounds.bottom - this.f11321m);
            Rect rect6 = new Rect();
            Gravity.apply(this.f11322n, intrinsicWidth, intrinsicHeight, rect5, rect6, 0);
            drawable3.setBounds(rect6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f11314a.setAlpha(i);
        Drawable drawable = this.f11315b;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        this.f11316c.setAlpha(i);
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
