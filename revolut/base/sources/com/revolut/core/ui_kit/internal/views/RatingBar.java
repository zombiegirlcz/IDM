package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import aw0.h9;
import aw0.j9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ms0.t3;
import ms0.u3;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0000\u0018\u0000 G2\u00020\u0001:\u0003\u001dH\"B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001aJ\u0015\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010,\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R*\u00103\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00068\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u0010\u001aR\"\u0010;\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010?\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u00106\u001a\u0004\b=\u00108\"\u0004\b>\u0010:R$\u0010@\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010\u000eR\u0014\u0010F\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u00101¨\u0006I"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/RatingBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Law0/j9;", "model", "", "setRatingCustomModel", "(Law0/j9;)V", "ratingColor", "backgroundColor", "setColors$ui_kit_components_release", "(II)V", "setColors", "Law0/h9;", "params", "setCustomRatingBarIconConfig", "(Law0/h9;)V", "newIconSize", "setIconSize", "(I)V", "newGap", "setGap", "Lms0/u3;", "onRatingChangedListener", "setOnRatingChangedListener", "(Lms0/u3;)V", "", "a", "F", "getRating$ui_kit_components_release", "()F", "setRating$ui_kit_components_release", "(F)V", "rating", "b", "getMinRating$ui_kit_components_release", "setMinRating$ui_kit_components_release", "minRating", "value", "c", "I", "getMaxRating$ui_kit_components_release", "()I", "setMaxRating$ui_kit_components_release", "maxRating", "", "d", "Z", "getHalfIconStep$ui_kit_components_release", "()Z", "setHalfIconStep$ui_kit_components_release", "(Z)V", "halfIconStep", "h", "getIndicator", "setIndicator", "indicator", "ratingCustomModel", "Law0/j9;", "getRatingCustomModel$ui_kit_components_release", "()Law0/j9;", "setRatingCustomModel$ui_kit_components_release", "getContentWidth", "contentWidth", "Companion", "ms0/t3", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RatingBar extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public float rating;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public float minRating;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int maxRating;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean halfIconStep;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f56358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean indicator;
    public final Paint i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u3 f56360j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f56361l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f56362m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public t3 f56363n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RatingBar(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static float c(float f, float f4) {
        float f5;
        float fFloor = (float) Math.floor(f);
        float f6 = f % 1;
        if (f6 < 0.75f) {
            f5 = f6 >= 0.25f ? 0.5f : 1.0f;
            return Math.max(f4, fFloor);
        }
        fFloor += f5;
        return Math.max(f4, fFloor);
    }

    private final int getContentWidth() {
        int i = this.f;
        int i2 = this.maxRating;
        return v0.a.a(i2, 1, this.e, i * i2);
    }

    public final void a(MotionEvent motionEvent) {
        float x3 = (motionEvent.getX() - ((getWidth() - getContentWidth()) * 0.5f)) / getContentWidth();
        float f = this.maxRating;
        this.rating = x3 * f;
        if (!this.halfIconStep) {
            this.rating = ((int) r3) + 1.0f;
        }
        if (this.rating > f) {
            this.rating = f;
        }
        invalidate();
    }

    public final Bitmap b(int i) {
        VectorDrawableCompat vectorDrawableCompatCreate = VectorDrawableCompat.create(getResources(), i, getContext().getTheme());
        int i2 = this.f;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvasE = ch.qos.logback.core.util.a.e(bitmapCreateBitmap, "createBitmap(...)", bitmapCreateBitmap);
        if (vectorDrawableCompatCreate != null) {
            vectorDrawableCompatCreate.setBounds(0, 0, canvasE.getWidth(), canvasE.getHeight());
        }
        if (vectorDrawableCompatCreate != null) {
            vectorDrawableCompatCreate.draw(canvasE);
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: getHalfIconStep$ui_kit_components_release, reason: from getter */
    public final boolean getHalfIconStep() {
        return this.halfIconStep;
    }

    public final boolean getIndicator() {
        return this.indicator;
    }

    /* JADX INFO: renamed from: getMaxRating$ui_kit_components_release, reason: from getter */
    public final int getMaxRating() {
        return this.maxRating;
    }

    /* JADX INFO: renamed from: getMinRating$ui_kit_components_release, reason: from getter */
    public final float getMinRating() {
        return this.minRating;
    }

    /* JADX INFO: renamed from: getRating$ui_kit_components_release, reason: from getter */
    public final float getRating() {
        return this.rating;
    }

    public final j9 getRatingCustomModel$ui_kit_components_release() {
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth() * 0.5f;
        float height = getHeight() * 0.5f;
        double dC = c(this.rating, this.minRating);
        int i = this.maxRating;
        for (int i2 = 0; i2 < i; i2++) {
            float f = this.f * 0.5f;
            canvas.save();
            canvas.translate(((i2 - ((this.maxRating - 1) * 0.5f)) * (r7 + this.e)) + (width - f), height - f);
            double d = dC - ((double) i2);
            Paint paint = this.i;
            if (d >= 1.0d) {
                paint.setColorFilter(this.f56363n.d);
                canvas.drawBitmap(this.f56363n.f208441a, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
            } else if (this.halfIconStep && d > 0.0d) {
                paint.setColorFilter(this.f56363n.e);
                canvas.drawBitmap(this.f56363n.f208443c, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
                paint.setColorFilter(this.f56363n.d);
                canvas.drawBitmap(this.f56363n.f208442b, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
            } else if (this.f56358g) {
                paint.setColorFilter(this.f56363n.e);
                canvas.drawBitmap(this.f56363n.f208441a, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
            } else {
                paint.setColorFilter(this.f56363n.e);
                canvas.drawBitmap(this.f56363n.f208443c, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.f;
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(getContentWidth(), size);
        }
        setMeasuredDimension(size, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = r5.isEnabled()
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            boolean r0 = r5.indicator
            if (r0 == 0) goto L16
            boolean r6 = super.onTouchEvent(r6)
            return r6
        L16:
            int r0 = r6.getAction()
            r2 = 1
            if (r0 == 0) goto L96
            if (r0 == r2) goto L6c
            r3 = 2
            if (r0 == r3) goto L26
            r1 = 3
            if (r0 == r1) goto L6c
            goto L95
        L26:
            float r0 = r5.f56361l
            float r3 = r6.getX()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L3b
            float r0 = r5.f56362m
            float r3 = r6.getY()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L3b
            goto L95
        L3b:
            float r0 = r5.f56361l
            float r3 = r6.getX()
            float r0 = r0 - r3
            float r3 = r5.f56362m
            float r4 = r6.getY()
            float r3 = r3 - r4
            float r0 = java.lang.Math.abs(r0)
            float r3 = java.lang.Math.abs(r3)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L62
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            r5.k = r2
            r5.a(r6)
            return r2
        L62:
            android.view.ViewParent r6 = r5.getParent()
            r6.requestDisallowInterceptTouchEvent(r1)
            r5.k = r1
            return r2
        L6c:
            boolean r0 = r5.k
            if (r0 == 0) goto L95
            r5.a(r6)
            ms0.u3 r6 = r5.f56360j
            if (r6 == 0) goto L95
            float r0 = r5.rating
            float r1 = r5.minRating
            float r0 = c(r0, r1)
            r10.w r6 = (r10.w) r6
            java.lang.Object r1 = r6.f250865a
            com.revolut.core.ui_kit.delegates.RateDelegate r1 = (com.revolut.core.ui_kit.delegates.RateDelegate) r1
            ihm.f r1 = r1.f53140c
            ip0.v70 r3 = new ip0.v70
            java.lang.Object r6 = r6.f250866b
            ip0.y70 r6 = (ip0.y70) r6
            java.lang.String r6 = r6.f167268a
            r3.<init>(r6, r0)
            r1.onNext(r3)
        L95:
            return r2
        L96:
            float r0 = r6.getX()
            r5.f56361l = r0
            float r6 = r6.getY()
            r5.f56362m = r6
            r5.k = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.RatingBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setColors$ui_kit_components_release(int ratingColor, int backgroundColor) {
        int i = R$drawable.uikit_icn_24_star_solid;
        int i2 = R$drawable.uikit_icn_24_star_half;
        int i3 = R$drawable.uikit_icn_24_star_outline;
        Bitmap bitmapB = b(i);
        Bitmap bitmapB2 = b(i2);
        Bitmap bitmapB3 = b(i3);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f56363n = new t3(bitmapB, bitmapB2, bitmapB3, new PorterDuffColorFilter(ratingColor, mode), new PorterDuffColorFilter(backgroundColor, mode));
        invalidate();
    }

    public final void setCustomRatingBarIconConfig(@NotNull h9 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        throw null;
    }

    public final void setGap(int newGap) {
        this.e = newGap;
        requestLayout();
    }

    public final void setHalfIconStep$ui_kit_components_release(boolean z) {
        this.halfIconStep = z;
    }

    public final void setIconSize(int newIconSize) {
        this.f = newIconSize;
        requestLayout();
    }

    public final void setIndicator(boolean z) {
        this.indicator = z;
    }

    public final void setMaxRating$ui_kit_components_release(int i) {
        this.maxRating = i;
        requestLayout();
    }

    public final void setMinRating$ui_kit_components_release(float f) {
        this.minRating = f;
    }

    public final void setOnRatingChangedListener(@NotNull u3 onRatingChangedListener) {
        Intrinsics.checkNotNullParameter(onRatingChangedListener, "onRatingChangedListener");
        this.f56360j = onRatingChangedListener;
    }

    public final void setRating$ui_kit_components_release(float f) {
        this.rating = f;
    }

    public final void setRatingCustomModel(@NotNull j9 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        throw null;
    }

    public final void setRatingCustomModel$ui_kit_components_release(j9 j9Var) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RatingBar(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatingBar(@NotNull Context context, AttributeSet attributeSet, int i) {
        int color;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.rating = 1.0f;
        this.maxRating = 5;
        this.e = 1;
        this.f = 1;
        this.i = new Paint();
        this.k = true;
        int i2 = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FiveStarsRatingBar);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.rating = typedArrayObtainStyledAttributes.getFloat(R$styleable.FiveStarsRatingBar_internal_fsrb_rating, BitmapDescriptorFactory.HUE_RED);
            this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.FiveStarsRatingBar_internal_fsrb_gap, 0);
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.FiveStarsRatingBar_internal_fsrb_star_size, 0);
            this.f56358g = typedArrayObtainStyledAttributes.getBoolean(R$styleable.FiveStarsRatingBar_internal_fsrb_background_star_filled, true);
            this.halfIconStep = typedArrayObtainStyledAttributes.getBoolean(R$styleable.FiveStarsRatingBar_internal_fsrb_half_star_step, false);
            this.indicator = typedArrayObtainStyledAttributes.getBoolean(R$styleable.FiveStarsRatingBar_internal_fsrb_indicator, false);
            int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.FiveStarsRatingBar_internal_fsrb_background_color, -1);
            color = typedArrayObtainStyledAttributes.getColor(R$styleable.FiveStarsRatingBar_internal_fsrb_rating_color, -1);
            typedArrayObtainStyledAttributes.recycle();
            i2 = color2;
        } else {
            color = -65536;
        }
        int i3 = R$drawable.uikit_icn_24_star_solid;
        int i5 = R$drawable.uikit_icn_24_star_half;
        int i6 = R$drawable.uikit_icn_24_star_outline;
        Bitmap bitmapB = b(i3);
        Bitmap bitmapB2 = b(i5);
        Bitmap bitmapB3 = b(i6);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f56363n = new t3(bitmapB, bitmapB2, bitmapB3, new PorterDuffColorFilter(color, mode), new PorterDuffColorFilter(i2, mode));
    }

    public /* synthetic */ RatingBar(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
