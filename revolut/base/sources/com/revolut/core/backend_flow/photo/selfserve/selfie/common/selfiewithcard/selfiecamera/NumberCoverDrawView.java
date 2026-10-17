package com.revolut.core.backend_flow.photo.selfserve.selfie.common.selfiewithcard.selfiecamera;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import ihm.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kc0.f;
import kli.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/core/backend_flow/photo/selfserve/selfie/common/selfiewithcard/selfiecamera/NumberCoverDrawView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "core_backend_flow_photo_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NumberCoverDrawView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f51293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f51295c;
    public final int d;
    public final BlurMaskFilter e;
    public final Paint f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f51296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f51297h;
    public Path i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NumberCoverDrawView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(Canvas canvas, List list) {
        canvas.save();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            f fVar = (f) it8.next();
            float f = fVar.f182647b;
            Paint paint = this.f;
            paint.setStrokeWidth(f);
            canvas.drawPath(fVar.f182646a, paint);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        List list = (List) this.f51293a.f();
        if (list == null) {
            list = f0.f322471a;
        }
        a(canvas, list);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        float x3 = event.getX();
        float y2 = event.getY();
        int action = event.getAction();
        if (action == 0) {
            Path path = new Path();
            this.i = path;
            f fVar = new f(path, this.f51294b);
            b bVar = this.f51293a;
            Collection collection = (List) bVar.f();
            if (collection == null) {
                collection = f0.f322471a;
            }
            bVar.onNext(d0.F0(fVar, collection));
            this.i.reset();
            this.i.moveTo(x3, y2);
            this.f51296g = x3;
            this.f51297h = y2;
            invalidate();
            return true;
        }
        if (action == 1) {
            this.i.lineTo(this.f51296g, this.f51297h);
            invalidate();
            return true;
        }
        if (action != 2) {
            return true;
        }
        float fAbs = Math.abs(x3 - this.f51296g);
        float fAbs2 = Math.abs(y2 - this.f51297h);
        float f = this.d;
        if (fAbs >= f || fAbs2 >= f) {
            Path path2 = this.i;
            float f4 = this.f51296g;
            float f5 = this.f51297h;
            float f6 = 2;
            path2.quadTo(f4, f5, (x3 + f4) / f6, (y2 + f5) / f6);
            this.f51296g = x3;
            this.f51297h = y2;
        }
        invalidate();
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NumberCoverDrawView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberCoverDrawView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        b bVarE = b.e(f0.f322471a);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f51293a = bVarE;
        this.f51294b = a.k(context, 14.0f);
        float fK = a.k(context, 3.0f);
        this.f51295c = fK;
        this.d = a.k(context, 1.0f);
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fK, BlurMaskFilter.Blur.NORMAL);
        this.e = blurMaskFilter;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setMaskFilter(blurMaskFilter);
        this.f = paint;
        this.i = new Path();
    }

    public /* synthetic */ NumberCoverDrawView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
