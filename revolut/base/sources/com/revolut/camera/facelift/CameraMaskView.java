package com.revolut.camera.facelift;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$color;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mx0.w5;
import org.jetbrains.annotations.NotNull;
import rd0.c;
import zhm.h0;
import zu.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0003\u0013$%B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/revolut/camera/facelift/CameraMaskView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Rect;", "getMaskBounds", "()Landroid/graphics/Rect;", "Lzu/d;", "getMaskRect", "()Lzu/d;", "", "background", "", "setMaskBackground", "(I)V", "Lzu/b;", "mask", "setMask", "(Lzu/b;)V", "", "activated", "setBorderActivated", "(Z)V", "enabled", "setDecorationEnabled", "Lcom/revolut/camera/facelift/a;", "setDrawableMask", "(Lcom/revolut/camera/facelift/a;)V", "Lzu/a;", "setCanvasMask", "(Lzu/a;)V", "Companion", "a", "b", "camera_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CameraMaskView extends View {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f50684j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f50686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Canvas f50687c;
    public final Rect d;
    public final RectF e;
    public Bitmap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Paint f50688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f50689h;
    public boolean i;

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

    public static final class b {
        private b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CameraMaskView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setCanvasMask(zu.a mask) {
        Integer numC = mask.c();
        if (numC != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            kli.a.s(numC.intValue(), context);
        }
        Integer numB = mask.b();
        if (numB != null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            kli.a.s(numB.intValue(), context2);
        }
    }

    private final void setDrawableMask(com.revolut.camera.facelift.a mask) {
        Drawable drawable = getResources().getDrawable(mask.a(), getContext().getTheme());
        Intrinsics.checkNotNullExpressionValue(drawable, "getDrawable(...)");
        this.f50686b = DrawableKt.toBitmap$default(drawable, 0, 0, null, 7, null);
        mask.d();
    }

    public final float a(float f) {
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        return kli.a.k(r0, f);
    }

    public final void b() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Canvas canvas = this.f50687c;
        if (canvas != null && (bitmap = this.f50686b) != null && (bitmap2 = this.f) != null) {
            bitmap2.eraseColor(0);
            canvas.drawColor(this.f50685a);
            canvas.drawBitmap(bitmap, this.d, this.e, this.f50688g);
            invalidate();
        }
        invalidate();
    }

    @NotNull
    public final Rect getMaskBounds() {
        Rect rect = new Rect();
        this.e.roundOut(rect);
        return rect;
    }

    @NotNull
    public final d getMaskRect() {
        Pair pair;
        WindowMetrics currentWindowMetrics;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowManager windowManager = (WindowManager) getContext().getSystemService(WindowManager.class);
                if (windowManager == null || (currentWindowMetrics = windowManager.getCurrentWindowMetrics()) == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("no available WindowManager to calculate mask");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(c.WARNING, null, null, illegalStateException, h0Var);
                    pair = new Pair(-1, -1);
                } else {
                    pair = new Pair(Integer.valueOf(currentWindowMetrics.getBounds().width()), Integer.valueOf(currentWindowMetrics.getBounds().height()));
                }
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                Display display = getDisplay();
                if (display != null) {
                    display.getRealMetrics(displayMetrics);
                    Unit unit = Unit.f186387a;
                    pair = new Pair(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
                } else {
                    IllegalStateException illegalStateException2 = new IllegalStateException("no available display to calculate mask");
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(c.WARNING, null, null, illegalStateException2, h0Var2);
                    pair = new Pair(-1, -1);
                }
            }
        } catch (Throwable th10) {
            IllegalStateException illegalStateException3 = new IllegalStateException("cannot retrieve display metrics", th10);
            h0 h0Var3 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
            rd0.d.a(c.WARNING, null, null, illegalStateException3, h0Var3);
            pair = new Pair(-1, -1);
        }
        int iIntValue = ((Number) pair.f186385a).intValue();
        int iIntValue2 = ((Number) pair.f186386b).intValue();
        Rect maskBounds = getMaskBounds();
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        return new d(iArr[0] + maskBounds.left, iArr[1] + maskBounds.top, maskBounds.width(), maskBounds.height(), iIntValue, iIntValue2);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        if (i == 0 || i2 == 0) {
            this.f = null;
            this.f50687c = null;
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            this.f = bitmapCreateBitmap;
            this.f50687c = new Canvas(bitmapCreateBitmap);
        }
        b();
    }

    public final void setBorderActivated(boolean activated) {
        if (this.f50689h == activated) {
            return;
        }
        this.f50689h = activated;
        invalidate();
    }

    public final void setDecorationEnabled(boolean enabled) {
        if (this.i == enabled) {
            return;
        }
        this.i = enabled;
        invalidate();
    }

    public final void setMask(@NotNull zu.b mask) {
        Intrinsics.checkNotNullParameter(mask, "mask");
        if (!Intrinsics.f(null, mask)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void setMaskBackground(int background) {
        if (this.f50685a == background) {
            return;
        }
        this.f50685a = background;
        b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraMaskView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        kli.a.k(context, 16.0f);
        this.f50685a = ContextCompat.getColor(context, R$color.internal_background_80_night);
        this.d = new Rect();
        this.e = new RectF();
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f50688g = paint;
        new RectF();
        float fA = a(4.0f);
        Path path = new Path();
        path.moveTo(a(272.0f), a(168.0f));
        path.cubicTo(a(272.0f), a(283.1f), a(227.1f), a(400.0f), a(136.0f), a(400.0f));
        path.cubicTo(a(44.9f), a(400.0f), a(BitmapDescriptorFactory.HUE_RED), a(291.1f), a(BitmapDescriptorFactory.HUE_RED), a(168.0f));
        path.cubicTo(a(BitmapDescriptorFactory.HUE_RED), a(44.9f), a(60.9f), a(BitmapDescriptorFactory.HUE_RED), a(136.0f), a(BitmapDescriptorFactory.HUE_RED));
        path.cubicTo(a(211.1f), a(BitmapDescriptorFactory.HUE_RED), a(272.0f), a(44.9f), a(272.0f), a(168.0f));
        path.close();
        Paint paint2 = new Paint();
        paint2.setColor(kli.a.s(R$attr.uikit_colorLightBlue, context));
        paint2.setStrokeWidth(a(8.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint();
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(fA);
        paint3.setAntiAlias(true);
        Paint paint4 = new Paint();
        paint4.setStyle(Paint.Style.FILL);
        paint4.setColor(kli.a.s(R$attr.uikit_colorLightBlue_40, context));
        new RectF();
        kli.a.s(R$attr.uikit_colorLightBlue, context);
        zu.c cVar = new zu.c();
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(1000L);
        valueAnimator.setRepeatMode(2);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new w5(this, 22));
        valueAnimator.addListener(cVar);
    }
}
