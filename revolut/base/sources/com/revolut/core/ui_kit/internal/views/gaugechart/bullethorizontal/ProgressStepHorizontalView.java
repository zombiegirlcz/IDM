package com.revolut.core.ui_kit.internal.views.gaugechart.bullethorizontal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.LruCache;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.gaugechart.bullethorizontal.ProgressStepHorizontalView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb3.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nr0.c;
import nr0.e;
import or0.u;
import org.jetbrains.annotations.NotNull;
import qt0.c;
import qt0.d;
import qt0.f;
import qt0.g;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 \"2\u00020\u0001:\b#$\u000e\u0017%&'(B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u000bR6\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R6\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00170\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R*\u0010!\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010 ¨\u0006)"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/gaugechart/bullethorizontal/ProgressStepHorizontalView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getProgressTitlesHeight", "()I", "getProgressStartX", "", "Lqt0/b;", "value", "k", "Ljava/util/List;", "getSteps", "()Ljava/util/List;", "setSteps", "(Ljava/util/List;)V", "steps", "Lqt0/d;", "l", "getProgresses", "setProgresses", "progresses", "m", "I", "getProgressBackgroundLineColor", "setProgressBackgroundLineColor", "(I)V", "progressBackgroundLineColor", "Companion", "qt0/g", "b", "qt0/f", "qt0/e", "qt0/c", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProgressStepHorizontalView extends FrameLayout {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f57185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f57186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f57187c;
    public final RectF d;
    public final SparseIntArray e;
    public final LruCache f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f57188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f57189h;
    public final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final DotDividerClause f57190j;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public List steps;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public List progresses;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public int progressBackgroundLineColor;

    public static final class a {
        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextPaint f57193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextPaint f57194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Paint f57195c;
        public final Paint d;
        public final Paint e;
        public final Paint f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Paint f57196g;

        public b() {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextAlign(Paint.Align.LEFT);
            textPaint.setAntiAlias(true);
            this.f57193a = textPaint;
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setTextAlign(Paint.Align.CENTER);
            textPaint2.setAntiAlias(true);
            this.f57194b = textPaint2;
            Paint paint = new Paint();
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            Paint.Cap cap = Paint.Cap.ROUND;
            paint.setStrokeCap(cap);
            paint.setAntiAlias(true);
            this.f57195c = paint;
            Paint paint2 = new Paint();
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(-16777216);
            paint2.setAntiAlias(true);
            this.d = paint2;
            Paint paint3 = new Paint();
            paint3.setStyle(style);
            paint3.setAntiAlias(true);
            this.e = paint3;
            Paint paint4 = new Paint();
            paint4.setStyle(style);
            paint4.setStrokeCap(Paint.Cap.BUTT);
            paint4.setAntiAlias(true);
            this.f = paint4;
            Paint paint5 = new Paint();
            paint5.setStyle(style);
            paint5.setStrokeCap(cap);
            paint5.setAntiAlias(true);
            this.f57196g = paint5;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressStepHorizontalView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getProgressStartX() {
        g gVar = this.f57189h;
        return gVar.f248903a + gVar.f248905c;
    }

    private final int getProgressTitlesHeight() {
        qt0.b bVar = (qt0.b) d0.d0(this.steps);
        if (bVar == null) {
            return 0;
        }
        return this.f57186b.b(bVar.f248888a, this.i.f57193a).getHeight();
    }

    public final void a(int i) {
        float f;
        float f4;
        int i2;
        Iterator it8;
        ArrayList arrayList;
        int i3;
        ArrayList arrayList2;
        Image image;
        float width;
        c cVar;
        c cVar2;
        float f5;
        float f6;
        c cVar3;
        c cVar4;
        qt0.e eVar;
        int i5;
        float width2;
        Image image2;
        c cVar5;
        this.f57185a = false;
        float progressStartX = getProgressStartX();
        RectF rectF = this.d;
        rectF.left = progressStartX;
        float progressTitlesHeight = getProgressTitlesHeight();
        g gVar = this.f57189h;
        rectF.top = progressTitlesHeight + gVar.d;
        float f32 = rectF.left;
        int progressStartX2 = getProgressStartX();
        int i6 = gVar.f248903a;
        int i21 = gVar.f248905c;
        rectF.right = f32 + ((i - progressStartX2) - (i6 + i21));
        rectF.bottom = rectF.top + gVar.k;
        ArrayList arrayList3 = this.f57188g;
        arrayList3.clear();
        int iWidth = (int) rectF.width();
        float f35 = rectF.bottom;
        int i22 = gVar.e;
        int i32 = gVar.f248908j;
        float f36 = f35 + i22;
        float progressTitlesHeight2 = getProgressTitlesHeight();
        List list = this.steps;
        ArrayList arrayList4 = new ArrayList(w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            qt0.b bVar = (qt0.b) it9.next();
            float f37 = bVar.f248889b;
            Image image3 = bVar.f;
            float f41 = rectF.left + ((int) (iWidth * f37));
            Clause clause = bVar.d;
            b bVar2 = this.i;
            int i33 = iWidth;
            e eVar2 = this.f57186b;
            if (clause == null) {
                arrayList = arrayList3;
                i3 = i21;
                f = f36;
                f4 = progressTitlesHeight2;
                i2 = i32;
                it8 = it9;
                arrayList2 = arrayList4;
                image = image3;
                eVar = null;
            } else {
                f = f36;
                int i43 = gVar.f;
                f4 = progressTitlesHeight2;
                float f42 = gVar.i;
                int i59 = gVar.f248909l;
                i2 = i32;
                int i66 = gVar.f248906g;
                float f57 = f + i43;
                it8 = it9;
                Clause clause2 = bVar.e;
                if (clause2 != null) {
                    arrayList = arrayList3;
                    Layout layoutB = eVar2.b(clause2, bVar2.f57194b);
                    arrayList2 = arrayList4;
                    Layout layoutB2 = eVar2.b(this.f57190j, bVar2.f57194b);
                    float f69 = f41 + i66;
                    float width3 = f69 - layoutB.getWidth();
                    image = image3;
                    width = width3 - layoutB2.getWidth();
                    i3 = i21;
                    cVar = new c(f69, layoutB.getHeight() / 2, layoutB);
                    cVar2 = new c(width3, layoutB2.getHeight() / 2, layoutB2);
                    f5 = width - i6;
                } else {
                    arrayList = arrayList3;
                    i3 = i21;
                    arrayList2 = arrayList4;
                    image = image3;
                    float f75 = f41 + i66;
                    width = f75;
                    cVar = null;
                    cVar2 = null;
                    f5 = f75 - i6;
                }
                Layout layoutB3 = eVar2.b(clause, bVar2.f57194b);
                int width4 = layoutB3.getWidth();
                float fMin = Math.min(i59, width4);
                float f77 = f5 >= fMin ? 0.0f : fMin - f5;
                if (width4 >= i59) {
                    layoutB3 = this.f57187c.b(clause, bVar2.f57194b);
                }
                float height = (layoutB3.getHeight() / 2) + f57;
                if (cVar != null) {
                    cVar.f248892b = height - cVar.f248892b;
                    cVar.f248891a += f77;
                    f6 = width;
                    cVar3 = cVar;
                } else {
                    f6 = width;
                    cVar3 = null;
                }
                if (cVar2 != null) {
                    cVar2.f248892b = height - cVar2.f248892b;
                    cVar2.f248891a += f77;
                    cVar4 = cVar2;
                } else {
                    cVar4 = null;
                }
                eVar = new qt0.e(cVar3, cVar4, new c((f6 - (layoutB3.getWidth() / 2)) + f77, f57, layoutB3), f57 + layoutB3.getHeight(), f41, f4 + gVar.f248907h, (cVar == null || f41 <= f6 + f77) ? f57 - f42 : (height - (((Layout) cVar.f248893c).getHeight() / 2)) - f42);
            }
            f36 = eVar != null ? eVar.d : f;
            Layout layoutB4 = eVar2.b(bVar.f248888a, bVar2.f57193a);
            float f81 = bVar.f248889b;
            if (f81 == BitmapDescriptorFactory.HUE_RED) {
                width2 = i6;
                i5 = i3;
            } else if (f81 == 1.0f) {
                i5 = i3;
                width2 = (rectF.right + i5) - layoutB4.getWidth();
            } else {
                i5 = i3;
                width2 = f41 - (layoutB4.getWidth() / 2);
            }
            c cVar6 = new c(width2, BitmapDescriptorFactory.HUE_RED, layoutB4);
            if (image != null) {
                image2 = image;
                float f82 = i2 / 2;
                cVar5 = new c(f41 - f82, rectF.centerY() - f82, (Drawable) this.f.get(image2));
            } else {
                image2 = image;
                cVar5 = null;
            }
            ArrayList arrayList5 = arrayList2;
            arrayList5.add(new f(cVar6, eVar, cVar5, image2 == null ? new c(f41, rectF.centerY(), Integer.valueOf(b(bVar.f248890c))) : null));
            arrayList4 = arrayList5;
            i21 = i5;
            iWidth = i33;
            progressTitlesHeight2 = f4;
            i32 = i2;
            it9 = it8;
            arrayList3 = arrayList;
        }
        arrayList3.addAll(arrayList4);
    }

    public final int b(int i) {
        SparseIntArray sparseIntArray = this.e;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(i, context);
        sparseIntArray.put(i, iS);
        return iS;
    }

    public final int getProgressBackgroundLineColor() {
        return this.progressBackgroundLineColor;
    }

    @NotNull
    public final List<d> getProgresses() {
        return this.progresses;
    }

    @NotNull
    public final List<qt0.b> getSteps() {
        return this.steps;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        b bVar;
        Canvas canvas2 = canvas;
        Intrinsics.checkNotNullParameter(canvas2, "canvas");
        super.onDraw(canvas);
        if (this.f57185a) {
            a(getWidth());
        }
        ArrayList arrayList = this.f57188g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c cVar = ((f) arrayList.get(i)).f248900a;
            a.a.h((Layout) cVar.f248893c, canvas2, cVar.f248891a, cVar.f248892b);
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (true) {
            bVar = this.i;
            if (i2 >= size2) {
                break;
            }
            qt0.e eVar = ((f) arrayList.get(i2)).f248901b;
            if (eVar != null) {
                c cVar2 = eVar.f248896a;
                if (cVar2 != null) {
                    a.a.i((Layout) cVar2.f248893c, canvas2, cVar2.f248891a, cVar2.f248892b);
                }
                c cVar3 = eVar.f248897b;
                if (cVar3 != null) {
                    a.a.i((Layout) cVar3.f248893c, canvas2, cVar3.f248891a, cVar3.f248892b);
                }
                c cVar4 = eVar.f248898c;
                a.a.g((Layout) cVar4.f248893c, canvas2, cVar4.f248891a, cVar4.f248892b);
                float f = eVar.e;
                canvas2.drawLine(f, eVar.f, f, eVar.f248899g, bVar.f57195c);
            }
            i2++;
            canvas2 = canvas;
        }
        RectF rectF = this.d;
        float fCenterY = rectF.centerY();
        float f4 = rectF.left;
        float width = getWidth();
        Paint paint = bVar.f;
        Paint paint2 = bVar.e;
        Paint paint3 = bVar.f57196g;
        canvas.drawLine(f4, fCenterY, width, fCenterY, paint);
        List list = this.progresses;
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            d dVar = (d) list.get(i3);
            paint3.setColor(b(dVar.f248895b));
            float f5 = rectF.left;
            canvas.drawLine(f5, fCenterY, (rectF.width() * dVar.f248894a) + f5, fCenterY, paint3);
        }
        int size4 = arrayList.size();
        for (int i5 = 0; i5 < size4; i5++) {
            f fVar = (f) arrayList.get(i5);
            c cVar5 = fVar.f248902c;
            if (cVar5 != null) {
                float f6 = cVar5.f248891a;
                float f32 = cVar5.f248892b;
                int iSave = canvas.save();
                canvas.translate(f6, f32);
                try {
                    ((Drawable) cVar5.f248893c).draw(canvas);
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
            c cVar6 = fVar.d;
            if (cVar6 != null) {
                paint2.setColor(((Number) cVar6.f248893c).intValue());
                float f35 = cVar6.f248891a;
                float f36 = cVar6.f248892b;
                g gVar = this.f57189h;
                canvas.drawCircle(f35, f36, gVar.f248905c, bVar.d);
                canvas.drawCircle(cVar6.f248891a, cVar6.f248892b, gVar.f248905c, paint2);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Object next;
        qt0.e eVar;
        int size = View.MeasureSpec.getSize(i);
        a(size);
        Iterator it8 = this.f57188g.iterator();
        Float fValueOf = null;
        if (it8.hasNext()) {
            next = it8.next();
            if (it8.hasNext()) {
                qt0.e eVar2 = ((f) next).f248901b;
                float f = eVar2 != null ? eVar2.d : 0.0f;
                do {
                    Object next2 = it8.next();
                    qt0.e eVar3 = ((f) next2).f248901b;
                    float f4 = eVar3 != null ? eVar3.d : 0.0f;
                    if (Float.compare(f, f4) < 0) {
                        next = next2;
                        f = f4;
                    }
                } while (it8.hasNext());
            }
        } else {
            next = null;
        }
        f fVar = (f) next;
        if (fVar != null && (eVar = fVar.f248901b) != null) {
            fValueOf = Float.valueOf(eVar.d);
        }
        int iFloatValue = ((int) (fValueOf != null ? fValueOf.floatValue() : this.d.bottom)) + this.f57189h.f248904b;
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            iFloatValue = Math.min(iFloatValue, size2);
        } else if (mode == 1073741824) {
            iFloatValue = size2;
        }
        setMeasuredDimension(size, iFloatValue);
    }

    public final void setProgressBackgroundLineColor(int i) {
        this.progressBackgroundLineColor = i;
        this.i.f.setColor(b(i));
        invalidate();
    }

    public final void setProgresses(@NotNull List<d> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.progresses = value;
        Iterator<T> it8 = value.iterator();
        while (it8.hasNext()) {
            b(((d) it8.next()).f248895b);
        }
        invalidate();
    }

    public final void setSteps(@NotNull List<qt0.b> value) {
        e eVar;
        e eVar2;
        b bVar;
        Intrinsics.checkNotNullParameter(value, "value");
        Iterator<T> it8 = value.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            eVar = this.f57187c;
            eVar2 = this.f57186b;
            bVar = this.i;
            if (!zHasNext) {
                break;
            }
            qt0.b bVar2 = (qt0.b) it8.next();
            PercentageClause percentageClause = bVar2.f248888a;
            Clause clause = bVar2.d;
            TextPaint textPaint = bVar.f57193a;
            TextPaint textPaint2 = bVar.f57194b;
            eVar2.f(percentageClause, textPaint);
            eVar2.f(bVar2.e, textPaint2);
            eVar2.f(clause, textPaint2);
            eVar.f(clause, textPaint2);
            Image image = bVar2.f;
            if (image != null && this.f.get(image) == null) {
                yy0.f fVarQ = u.k(this).Q();
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int i = this.f57189h.f248908j;
                qpb.a aVar = new qpb.a(this, image, 9);
                yy0.e eVar3 = yy0.f.Companion;
                fVarQ.c(image, context, i, i, aVar, null);
            }
        }
        for (qt0.b bVar3 : this.steps) {
            PercentageClause percentageClause2 = bVar3.f248888a;
            Clause clause2 = bVar3.d;
            TextPaint textPaint3 = bVar.f57193a;
            TextPaint textPaint4 = bVar.f57194b;
            eVar2.e(percentageClause2, textPaint3);
            eVar2.e(bVar3.e, textPaint4);
            eVar2.e(clause2, textPaint4);
            eVar.e(clause2, textPaint4);
        }
        this.steps = value;
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressStepHorizontalView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressStepHorizontalView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i2 = 1;
        this.f57185a = true;
        final int i3 = 0;
        e eVar = new e(this, new Function0(this) { // from class: qt0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProgressStepHorizontalView f248887b;

            {
                this.f248887b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ProgressStepHorizontalView progressStepHorizontalView = this.f248887b;
                        progressStepHorizontalView.f57185a = true;
                        progressStepHorizontalView.requestLayout();
                        break;
                    default:
                        ProgressStepHorizontalView progressStepHorizontalView2 = this.f248887b;
                        progressStepHorizontalView2.f57185a = true;
                        progressStepHorizontalView2.requestLayout();
                        break;
                }
                return Unit.f186387a;
            }
        });
        this.f57186b = eVar;
        c.a aVar = nr0.c.Companion;
        int iK = kli.a.k(context, 120.0f);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.f57187c = new e(this, new nr0.c(iK, -1, null, null, 8), new Function0(this) { // from class: qt0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProgressStepHorizontalView f248887b;

            {
                this.f248887b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ProgressStepHorizontalView progressStepHorizontalView = this.f248887b;
                        progressStepHorizontalView.f57185a = true;
                        progressStepHorizontalView.requestLayout();
                        break;
                    default:
                        ProgressStepHorizontalView progressStepHorizontalView2 = this.f248887b;
                        progressStepHorizontalView2.f57185a = true;
                        progressStepHorizontalView2.requestLayout();
                        break;
                }
                return Unit.f186387a;
            }
        });
        this.d = new RectF();
        this.e = new SparseIntArray();
        this.f = new LruCache(10);
        this.f57188g = new ArrayList();
        g gVar = new g(context);
        this.f57189h = gVar;
        b bVar = new b();
        this.i = bVar;
        DotDividerClause dotDividerClause = new DotDividerClause(Integer.valueOf(R$attr.uikit_colorGreyTone50));
        this.f57190j = dotDividerClause;
        f0 f0Var = f0.f322471a;
        this.steps = f0Var;
        this.progresses = f0Var;
        this.progressBackgroundLineColor = R$attr.uikit_colorGreyTone10;
        setWillNotDraw(false);
        l.d(bVar.f57193a, context, R$attr.internal_textAppearanceBody3);
        int i5 = R$attr.internal_textAppearanceEmphasis3;
        TextPaint textPaint = bVar.f57194b;
        l.d(textPaint, context, i5);
        eVar.f(dotDividerClause, textPaint);
        int iB = b(R$attr.uikit_colorDeepGrey);
        Paint paint = bVar.f57195c;
        paint.setColor(iB);
        paint.setStrokeWidth(kli.a.l(context, 1.0f));
        paint.setPathEffect(new DashPathEffect(new float[]{kli.a.l(context, 1.5f), kli.a.l(context, 3.0f)}, BitmapDescriptorFactory.HUE_RED));
        Paint paint2 = bVar.f;
        float f = gVar.k;
        paint2.setStrokeWidth(f);
        bVar.f57196g.setStrokeWidth(f);
        bVar.d.setColor(b(R$attr.uikit_colorWhite));
        bVar.e.setStrokeWidth(kli.a.l(context, 3.0f));
    }

    public /* synthetic */ ProgressStepHorizontalView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
