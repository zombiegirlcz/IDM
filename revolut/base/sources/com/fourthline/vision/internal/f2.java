package com.fourthline.vision.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class f2 extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f36155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f36156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f36157c;
    private e2 d;
    private final List e;
    private final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Matrix f36158g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f2(@NotNull Function0<Rect> contentDetectionArea, @NotNull Function0<? extends Matrix> imageToScreenCoordsMatrix, boolean z, e2 e2Var, @NotNull Context context) {
        this(contentDetectionArea, imageToScreenCoordsMatrix, z, e2Var, context, null, 0, 96, null);
        Intrinsics.checkNotNullParameter(contentDetectionArea, "contentDetectionArea");
        Intrinsics.checkNotNullParameter(imageToScreenCoordsMatrix, "imageToScreenCoordsMatrix");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final boolean scheduleRedraw() {
        return postDelayed(new bh(this, 2), 50L);
    }

    public final e2 getDebugConsumer() {
        return this.d;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        List<fa> detections$fourthline_vision_release;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        scheduleRedraw();
        if (this.f36157c) {
            float f = 2;
            this.f36158g.setScale(-1.0f, 1.0f, canvas.getWidth() / f, canvas.getHeight() / f);
        }
        e2 e2Var = this.d;
        if (e2Var != null && (detections$fourthline_vision_release = e2Var.getDetections$fourthline_vision_release()) != null) {
            for (fa faVar : detections$fourthline_vision_release) {
                Matrix matrix = (Matrix) this.f36156b.invoke();
                if (matrix != null) {
                    RectF rectF = ga.toRectF(ga.toRect(faVar));
                    this.f36158g.mapRect(rectF);
                    matrix.mapRect(rectF);
                    canvas.drawRect(rectF, (Paint) this.f.get(0));
                }
            }
        }
        canvas.drawRect((Rect) this.f36155a.invoke(), (Paint) this.f.get(1));
    }

    public final void setDebugConsumer(e2 e2Var) {
        this.d = e2Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f2(@NotNull Function0<Rect> contentDetectionArea, @NotNull Function0<? extends Matrix> imageToScreenCoordsMatrix, boolean z, e2 e2Var, @NotNull Context context, AttributeSet attributeSet) {
        this(contentDetectionArea, imageToScreenCoordsMatrix, z, e2Var, context, attributeSet, 0, 64, null);
        Intrinsics.checkNotNullParameter(contentDetectionArea, "contentDetectionArea");
        Intrinsics.checkNotNullParameter(imageToScreenCoordsMatrix, "imageToScreenCoordsMatrix");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(@NotNull Function0<Rect> contentDetectionArea, @NotNull Function0<? extends Matrix> imageToScreenCoordsMatrix, boolean z, e2 e2Var, @NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(contentDetectionArea, "contentDetectionArea");
        Intrinsics.checkNotNullParameter(imageToScreenCoordsMatrix, "imageToScreenCoordsMatrix");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f36155a = contentDetectionArea;
        this.f36156b = imageToScreenCoordsMatrix;
        this.f36157c = z;
        this.d = e2Var;
        List listK = zhm.v.k(-65536, -16711936);
        this.e = listK;
        ArrayList arrayList = new ArrayList(zhm.w.t(listK, 10));
        Iterator it8 = listK.iterator();
        while (it8.hasNext()) {
            int iIntValue = ((Number) it8.next()).intValue();
            Paint paint = new Paint();
            paint.setColor(iIntValue);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(5.0f);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setStrokeCap(Paint.Cap.ROUND);
            arrayList.add(paint);
        }
        this.f = arrayList;
        this.f36158g = new Matrix();
    }

    public /* synthetic */ f2(Function0 function0, Function0 function02, boolean z, e2 e2Var, Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, function02, z, e2Var, context, (i2 & 32) != 0 ? null : attributeSet, (i2 & 64) != 0 ? 0 : i);
    }
}
