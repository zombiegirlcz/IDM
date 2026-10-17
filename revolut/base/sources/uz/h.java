package uz;

import android.animation.ValueAnimator;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.content.ContextCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import com.revolut.camerakit.ui.models.DocumentMaskModel;
import com.revolut.camerakit.ui.models.Guideline;
import com.revolut.camerakit.ui.models.R$color;
import kotlin.jvm.internal.Intrinsics;
import mx0.w5;

/* JADX INFO: loaded from: classes16.dex */
public final class h extends c {
    public final Paint A;
    public final Path B;
    public final Paint C;
    public float D;
    public final Camera E;
    public boolean F;
    public final ValueAnimator G;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f284520w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final DocumentMaskModel f284521x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Path f284522y;
    public final RectF z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d view, DocumentMaskModel documentMaskModel) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(documentMaskModel, "documentMaskModel");
        this.f284520w = view;
        this.f284521x = documentMaskModel;
        this.f284522y = new Path();
        this.z = new RectF();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.f);
        paint.setAntiAlias(true);
        this.A = paint;
        this.B = new Path();
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.FILL);
        paint2.setStrokeWidth(this.f);
        paint2.setAntiAlias(true);
        paint2.setColor(ContextCompat.getColor(view.getContext(), R$color.camera_kit_white_40));
        this.C = paint2;
        this.E = new Camera();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 15.0f);
        valueAnimatorOfFloat.setDuration(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS);
        valueAnimatorOfFloat.setRepeatCount(0);
        valueAnimatorOfFloat.addUpdateListener(new w5(this, 14));
        this.G = valueAnimatorOfFloat;
    }

    @Override // uz.c
    public final int a(int i) {
        d dVar = this.f284520w;
        if (dVar.getMeasuredWidth() == 0 || dVar.getMeasuredHeight() == 0) {
            return 0;
        }
        Path path = this.f284522y;
        path.reset();
        Path path2 = this.B;
        path2.reset();
        float fC = c(dVar.getMeasuredWidth());
        float f = 2;
        float measuredWidth = dVar.getMeasuredWidth() - (fC * f);
        DocumentMaskModel documentMaskModel = this.f284521x;
        float f4 = documentMaskModel.f50822b;
        float f5 = documentMaskModel.f50823c;
        float f6 = measuredWidth / f4;
        int measuredHeight = dVar.getMeasuredHeight();
        float f32 = this.f284487q;
        float f35 = f32 * f;
        if (measuredHeight < ((int) (f35 + f6))) {
            float measuredHeight2 = f6 / (dVar.getMeasuredHeight() - f35);
            measuredWidth /= measuredHeight2;
            f6 /= measuredHeight2;
            fC = (dVar.getMeasuredWidth() - measuredWidth) / f;
        }
        float measuredHeight3 = ((dVar.getMeasuredHeight() - f6) / f) + f32;
        RectF rectF = this.f284479c;
        rectF.left = fC;
        rectF.top = measuredHeight3;
        rectF.right = fC + measuredWidth;
        float f36 = measuredHeight3 + f6;
        rectF.bottom = f36;
        path.addRoundRect(rectF, b(f5), b(f5), Path.Direction.CW);
        path.computeBounds(this.z, true);
        for (Guideline guideline : documentMaskModel.f50821a) {
            float f37 = rectF.left;
            float f41 = rectF.right - f37;
            float f42 = guideline.f50824a;
            float f57 = guideline.e;
            float f69 = rectF.top;
            float f75 = rectF.bottom - f69;
            path2.addRoundRect(new RectF((f42 * f41) + f37, (guideline.f50826c * f75) + f69, (f41 * guideline.f50825b) + f37, (f75 * guideline.d) + f69), b(f57), b(f57), Path.Direction.CW);
        }
        return (int) (f36 + f32 + this.f);
    }

    @Override // uz.c
    public final void f(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i = this.f284480g;
        int i2 = this.f284481h;
        if (this.u) {
            i = this.o;
        } else {
            boolean z = this.i;
            if (z && i2 != 0) {
                i = i2;
            } else if (z || i == 0) {
                i = 0;
            }
        }
        Paint paint = this.A;
        paint.setColor(i);
        canvas.save();
        Camera camera = this.E;
        camera.save();
        camera.rotateX(this.D);
        RectF rectF = this.z;
        float fCenterX = rectF.centerX();
        float f = rectF.bottom;
        canvas.translate(fCenterX, f);
        camera.applyToCanvas(canvas);
        canvas.translate(-fCenterX, -f);
        camera.restore();
        Path path = this.f284522y;
        canvas.drawPath(path, paint);
        if (!this.u) {
            canvas.drawPath(this.B, this.C);
        }
        canvas.restore();
        if (this.u) {
            canvas.save();
            boolean z3 = this.f284490t;
            RectF rectF2 = this.f284479c;
            float f4 = z3 ? rectF2.bottom : this.f284486p;
            float f5 = rectF2.left;
            float f6 = rectF2.top;
            float f32 = rectF2.right;
            RectF rectF3 = this.f284483l;
            rectF3.set(f5, f6, f32, f4);
            canvas.clipPath(path);
            canvas.drawRect(rectF3, this.f284485n);
            canvas.restore();
            canvas.drawLine(BitmapDescriptorFactory.HUE_RED, f4, this.f284520w.getWidth(), f4, this.f284484m);
        }
    }

    @Override // uz.c
    public final void m(long j2) {
        RectF rectF = this.f284479c;
        l(rectF.top, rectF.bottom);
    }

    @Override // uz.c
    public final void n() {
        if (this.F) {
            return;
        }
        this.F = true;
        this.G.start();
    }

    @Override // uz.c
    public final void p() {
        if (this.F) {
            this.G.cancel();
            this.D = BitmapDescriptorFactory.HUE_RED;
            this.F = false;
            this.f284520w.invalidate();
        }
    }
}
