package yz;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.revolut.camerakit.ui.models.QrCodeMaskModel;
import kotlin.jvm.internal.Intrinsics;
import uz.c;
import uz.d;

/* JADX INFO: loaded from: classes16.dex */
public final class a extends c {
    public final Paint A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f318013w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final QrCodeMaskModel f318014x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Path f318015y;
    public final RectF z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d view, QrCodeMaskModel maskModel) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(maskModel, "maskModel");
        this.f318013w = view;
        this.f318014x = maskModel;
        this.f318015y = new Path();
        this.z = new RectF();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(b(maskModel.f50851b));
        paint.setAntiAlias(true);
        paint.setColor(-1);
        this.A = paint;
    }

    @Override // uz.c
    public final int a(int i) {
        d dVar = this.f318013w;
        if (dVar.getMeasuredWidth() == 0 || dVar.getMeasuredHeight() == 0) {
            return 0;
        }
        Path path = this.f318015y;
        path.reset();
        float fC = c(dVar.getMeasuredWidth());
        QrCodeMaskModel qrCodeMaskModel = this.f318014x;
        float f = qrCodeMaskModel.f50852c;
        float f4 = qrCodeMaskModel.f50850a;
        float measuredWidth = fC + f;
        float f5 = 2;
        float measuredWidth2 = dVar.getMeasuredWidth() - (measuredWidth * f5);
        int measuredHeight = dVar.getMeasuredHeight();
        float f6 = this.f284487q;
        float f32 = f6 * f5;
        if (measuredHeight < ((int) (f32 + measuredWidth2))) {
            measuredWidth2 /= measuredWidth2 / (dVar.getMeasuredHeight() - f32);
            measuredWidth = (dVar.getMeasuredWidth() - measuredWidth2) / f5;
        }
        float measuredHeight2 = ((dVar.getMeasuredHeight() - measuredWidth2) / f5) + f6;
        RectF rectF = this.f284479c;
        rectF.left = measuredWidth;
        rectF.top = measuredHeight2;
        rectF.right = measuredWidth + measuredWidth2;
        float f35 = measuredHeight2 + measuredWidth2;
        rectF.bottom = f35;
        path.addRoundRect(rectF, b(f4), b(f4), Path.Direction.CW);
        path.computeBounds(this.z, true);
        return (int) (f35 + f6 + this.f);
    }

    @Override // uz.c
    public final void f(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawPath(this.f318015y, this.A);
    }

    @Override // uz.c
    public final void m(long j2) {
    }

    @Override // uz.c
    public final void n() {
    }

    @Override // uz.c
    public final void p() {
    }
}
