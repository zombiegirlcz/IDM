package ep0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import androidx.core.graphics.drawable.DrawableCompat;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.drawables.LabelBadgeDrawable;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit_core.displayers.image.drawables.GradientTintDrawable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends ImageSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f128017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageClauseTint f128018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Float f128019c;
    public final Float d;
    public final boolean e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference f128020g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f128021h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, int i, ImageClauseTint imageClauseTint, Float f, Float f4) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f128021h = new g();
        this.f128017a = context;
        this.f128018b = imageClauseTint;
        this.f128019c = f;
        this.d = f4;
        this.e = false;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i5, int i6, Paint paint) {
        float fHeight;
        int color;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.save();
        Drawable drawable = getDrawable();
        if (this.e) {
            fHeight = (((i6 - i3) - drawable.getBounds().height()) / 2.0f) + i3;
        } else {
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            fHeight = (i5 - (drawable.getBounds().height() / 2.0f)) - (((fontMetricsInt.descent - fontMetricsInt.ascent) / 2.0f) - fontMetricsInt.descent);
        }
        canvas.translate(f, fHeight);
        boolean z = this.f128018b instanceof ImageClauseTint.TextColor;
        if (z) {
            paint = this.f128021h.a(paint, charSequence, i, i2);
        }
        if (z && (color = paint.getColor()) != this.f) {
            this.f = color;
            drawable.setTint(color);
        }
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
    public final Drawable getDrawable() {
        WeakReference weakReference = this.f128020g;
        Drawable drawable = weakReference != null ? (Drawable) weakReference.get() : null;
        if (drawable == null) {
            drawable = super.getDrawable();
            ImageClauseTint imageClauseTint = this.f128018b;
            boolean z = imageClauseTint instanceof ImageClauseTint.Color;
            Context context = this.f128017a;
            if (z) {
                Drawable drawableMutate = drawable.mutate();
                Intrinsics.checkNotNullExpressionValue(drawableMutate, "mutate(...)");
                drawable = DrawableCompat.wrap(drawableMutate);
                Intrinsics.checkNotNullExpressionValue(drawable, "wrap(...)");
                drawable.setTint(io0.a.c(context, ((ImageClauseTint.Color) imageClauseTint).f57788a));
            } else if (imageClauseTint instanceof ImageClauseTint.TextColor) {
                Drawable drawableMutate2 = drawable.mutate();
                Intrinsics.checkNotNullExpressionValue(drawableMutate2, "mutate(...)");
                drawable = DrawableCompat.wrap(drawableMutate2);
                Intrinsics.h(drawable);
            } else if (imageClauseTint instanceof ImageClauseTint.Gradient) {
                Drawable drawableMutate3 = drawable.mutate();
                Intrinsics.checkNotNullExpressionValue(drawableMutate3, "mutate(...)");
                GradientTintDrawable.Companion companion = GradientTintDrawable.INSTANCE;
                ArrayList arrayList = ((ImageClauseTint.Gradient) imageClauseTint).f57789a;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(Integer.valueOf(io0.a.c(context, (Color) it8.next())));
                }
                int[] iArrC1 = d0.c1(arrayList2);
                companion.getClass();
                drawable = GradientTintDrawable.Companion.a(drawableMutate3, iArrC1);
            } else {
                if (imageClauseTint != null) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.h(drawable);
            }
            this.f128020g = new WeakReference(drawable);
            Float f = this.f128019c;
            int iK = f != null ? kli.a.k(context, f.floatValue()) : drawable.getBounds().width();
            Float f4 = this.d;
            drawable.setBounds(0, 0, iK, f4 != null ? kli.a.k(context, f4.floatValue()) : drawable.getBounds().height());
            this.f = 0;
        }
        if (drawable instanceof AnimatedVectorDrawable) {
            ((AnimatedVectorDrawable) drawable).start();
        }
        return drawable;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int iK;
        Intrinsics.checkNotNullParameter(paint, "paint");
        Rect bounds = getDrawable().getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            Float f = this.d;
            if (f != null) {
                iK = kli.a.k(this.f128017a, f.floatValue());
            } else {
                iK = fontMetricsInt2.descent - fontMetricsInt2.ascent;
            }
            int i3 = bounds.bottom - bounds.top;
            int i5 = (iK / 2) + fontMetricsInt2.ascent;
            int i6 = i3 / 2;
            int i21 = i5 - i6;
            fontMetricsInt.ascent = i21;
            fontMetricsInt.top = i21;
            int i22 = i5 + i6;
            fontMetricsInt.descent = i22;
            fontMetricsInt.bottom = i22;
        }
        return bounds.right;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, LabelBadgeDrawable drawable, Float f, Float f4) {
        super(drawable);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f128021h = new g();
        this.f128017a = context;
        this.f128018b = null;
        this.f128019c = f;
        this.d = f4;
        this.e = true;
    }
}
