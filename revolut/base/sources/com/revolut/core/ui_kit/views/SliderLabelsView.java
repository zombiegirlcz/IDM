package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.wq;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.x8;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u000eJ+\u0010\u0015\u001a\u00020\f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/revolut/core/ui_kit/views/SliderLabelsView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "", "setStartLabel", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "setEndLabel", "", "Lip0/wq;", "items", "min", "max", "setLabels", "(Ljava/util/List;II)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SliderLabelsView extends View {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f58870h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Clause f58871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Clause f58872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f58873c;
    public int d;
    public List e;
    public final TextPaint f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nr0.e f58874g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SliderLabelsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        nr0.e eVar;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        TextPaint textPaint = this.f;
        float fAbs = Math.abs(textPaint.getFontMetrics().top - textPaint.getFontMetrics().ascent);
        Iterator it8 = this.e.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            eVar = this.f58874g;
            if (!zHasNext) {
                break;
            }
            Clause clause = ((wq) it8.next()).f167057b;
            if (clause != null) {
                Layout layoutB = eVar.b(clause, textPaint);
                float f = this.d - this.f58873c;
                if (f > BitmapDescriptorFactory.HUE_RED) {
                    a.a.g(layoutB, canvas, getWidth() * ((r3.f167056a - r7) / f), fAbs);
                }
            }
        }
        Clause clause2 = this.f58871a;
        if (clause2 != null) {
            wq wqVar = (wq) d0.d0(this.e);
            if (wqVar != null && wqVar.f167056a == this.f58873c) {
                clause2 = null;
            }
            if (clause2 != null) {
                a.a.h(eVar.b(clause2, textPaint), canvas, BitmapDescriptorFactory.HUE_RED, fAbs);
            }
        }
        Clause clause3 = this.f58872b;
        if (clause3 != null) {
            wq wqVar2 = (wq) d0.o0(this.e);
            Clause clause4 = (wqVar2 == null || wqVar2.f167056a != this.d) ? clause3 : null;
            if (clause4 != null) {
                a.a.i(eVar.b(clause4, textPaint), canvas, getWidth(), fAbs);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Paint.FontMetrics fontMetrics = this.f.getFontMetrics();
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
        } else if (mode == 1073741824) {
            suggestedMinimumWidth = size;
        }
        int iMin = (int) (fontMetrics.bottom - fontMetrics.top);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, size2);
        } else if (mode2 == 1073741824) {
            iMin = size2;
        }
        setMeasuredDimension(suggestedMinimumWidth, iMin);
    }

    public final void setEndLabel(@NotNull Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        if (Intrinsics.f(this.f58872b, clause)) {
            return;
        }
        Clause clause2 = this.f58872b;
        TextPaint textPaint = this.f;
        nr0.e eVar = this.f58874g;
        if (clause2 != null) {
            eVar.e(clause2, textPaint);
        }
        this.f58872b = clause;
        eVar.f(clause, textPaint);
        invalidate();
    }

    public final void setLabels(@NotNull List<wq> items, int min, int max) {
        TextPaint textPaint;
        nr0.e eVar;
        Intrinsics.checkNotNullParameter(items, "items");
        this.f58873c = min;
        this.d = max;
        Iterator it8 = this.e.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            textPaint = this.f;
            eVar = this.f58874g;
            if (!zHasNext) {
                break;
            } else {
                eVar.e(((wq) it8.next()).f167057b, textPaint);
            }
        }
        this.e = items;
        Iterator<T> it9 = items.iterator();
        while (it9.hasNext()) {
            eVar.f(((wq) it9.next()).f167057b, textPaint);
        }
        invalidate();
    }

    public final void setStartLabel(@NotNull Clause clause) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        if (Intrinsics.f(this.f58871a, clause)) {
            return;
        }
        Clause clause2 = this.f58871a;
        TextPaint textPaint = this.f;
        nr0.e eVar = this.f58874g;
        if (clause2 != null) {
            eVar.e(clause2, textPaint);
        }
        this.f58871a = clause;
        eVar.f(clause, textPaint);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SliderLabelsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderLabelsView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.e = f0.f322471a;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);
        textPaint.setColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        jb3.l.d(textPaint, context, R$attr.internal_textAppearanceBody3);
        this.f = textPaint;
        this.f58874g = new nr0.e(this, new x8(this, 3));
    }

    public /* synthetic */ SliderLabelsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
