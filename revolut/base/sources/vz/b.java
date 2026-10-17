package vz;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uz.c;
import uz.d;

/* JADX INFO: loaded from: classes16.dex */
public final class b extends c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f293350w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Path f293351x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final RectF f293352y;
    public final Paint z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.f293350w = view;
        this.f293351x = new Path();
        this.f293352y = new RectF();
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(b(2.0f));
        paint.setAntiAlias(true);
        paint.setColor(-1);
        this.z = paint;
    }

    @Override // uz.c
    public final int a(int i) {
        d dVar = this.f293350w;
        if (dVar.getMeasuredWidth() == 0 || dVar.getMeasuredHeight() == 0) {
            return 0;
        }
        Path path = this.f293351x;
        path.reset();
        float fB = b(96.0f) + c(dVar.getMeasuredWidth());
        float measuredWidth = dVar.getMeasuredWidth() - (2 * fB);
        int measuredHeight = dVar.getMeasuredHeight();
        float fB2 = b(2.0f);
        RectF rectF = this.f284479c;
        rectF.left = fB;
        rectF.top = fB2;
        rectF.right = fB + measuredWidth;
        float f = measuredHeight;
        rectF.bottom = f - fB2;
        path.addRoundRect(rectF, b(24.0f), b(24.0f), Path.Direction.CW);
        path.computeBounds(this.f293352y, true);
        return (int) (fB2 + f + this.f284487q + 2.0f);
    }

    @Override // uz.c
    public final void f(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawPath(this.f293351x, this.z);
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
