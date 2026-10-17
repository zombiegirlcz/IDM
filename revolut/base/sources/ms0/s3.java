package ms0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class s3 extends View {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f208414j = Color.rgb(255, Constants.TAG_F5, Constants.TAG_BOOT_LOADER_VERSION);
    public static final int k = Color.argb(255, 129, 178, Constants.TAG_SYSTEM_FAILURE_LOG_RECORD_1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f208415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f208416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f208417c;
    public float d;
    public ViewGroup e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.camera.viewfinder.a f208418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ValueAnimator f208419h;
    public int i;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        float fL = kli.a.l(context, 50.0f);
        this.f208415a = fL;
        Paint paint = new Paint(1);
        int i = f208414j;
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        paint.setMaskFilter(new BlurMaskFilter(fL, BlurMaskFilter.Blur.NORMAL));
        this.f208416b = paint;
        this.f208417c = 0.71f;
        this.d = 1.4f;
        this.f208418g = new androidx.camera.viewfinder.a(this, 19);
        this.i = i;
        setWillNotDraw(false);
    }

    public final void a(ViewGroup parent) {
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(parent, "parent");
        boolean z = this.f;
        androidx.camera.viewfinder.a aVar = this.f208418g;
        if (z && z && (viewGroup = this.e) != null) {
            viewGroup.removeOnLayoutChangeListener(aVar);
            viewGroup.getOverlay().remove(this);
            this.e = null;
            this.f = false;
        }
        this.e = parent;
        parent.getOverlay().add(this);
        parent.addOnLayoutChangeListener(aVar);
        this.f = true;
        b();
    }

    public final void b() {
        ViewGroup viewGroup;
        int width;
        if (this.f && (viewGroup = this.e) != null && (width = viewGroup.getWidth()) > 0) {
            int i = (int) (width * this.d);
            int i2 = (width - i) / 2;
            layout(i2, -((int) (i * this.f208417c)), i + i2, 0);
        }
    }

    public final float getBlurRadius() {
        return this.f208415a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f = this.f208415a * 1.5f;
        canvas.drawOval(f, f, getWidth() - f, getHeight() - f, this.f208416b);
    }

    public final void setColor(int i) {
        if (this.i == i) {
            return;
        }
        this.i = i;
        ValueAnimator valueAnimator = this.f208419h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z = this.f;
        Paint paint = this.f208416b;
        if (!z || getVisibility() != 0 || getAlpha() == BitmapDescriptorFactory.HUE_RED) {
            paint.setColor(i);
            invalidate();
            return;
        }
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(paint.getColor(), i);
        valueAnimatorOfArgb.setDuration(200L);
        valueAnimatorOfArgb.addUpdateListener(new au0.b5(this, 27));
        valueAnimatorOfArgb.start();
        this.f208419h = valueAnimatorOfArgb;
    }
}
