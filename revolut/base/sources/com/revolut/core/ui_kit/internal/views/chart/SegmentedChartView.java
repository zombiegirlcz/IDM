package com.revolut.core.ui_kit.internal.views.chart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import ct0.c0;
import ct0.u;
import ct0.w;
import ct0.z;
import hx7.q;
import iv0.j;
import iv0.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import jb3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th9.t;
import ts0.l0;
import ts0.m0;
import ts0.o0;
import ts0.p0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u0000 E2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\rFB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010#\u001a\u00020\u00188\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR6\u0010-\u001a\b\u0012\u0004\u0012\u00020%0$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00105\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R*\u0010<\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010D\u001a\u00020=2\u0006\u0010&\u001a\u00020=8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006G"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chart/SegmentedChartView;", "Landroid/view/View;", "Lts0/a;", "Lvs0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lct0/c0;", "b", "Lct0/c0;", "getChartDrawer", "()Lct0/c0;", "chartDrawer", "Lcom/revolut/core/ui_kit/internal/views/chart/SegmentedChartView$b;", "e", "Lcom/revolut/core/ui_kit/internal/views/chart/SegmentedChartView$b;", "getDrawHolder$ui_kit_components_release", "()Lcom/revolut/core/ui_kit/internal/views/chart/SegmentedChartView$b;", "drawHolder", "", "t", "F", "getScaleAnimatorValue", "()F", "setScaleAnimatorValue", "(F)V", "scaleAnimatorValue", "u", "getHighlightAnimatorValue", "setHighlightAnimatorValue", "highlightAnimatorValue", "", "Lts0/l0;", "value", "x", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "items", "Luw0/i;", "y", "Luw0/i;", "getDataChangeAnimationRequest", "()Luw0/i;", "setDataChangeAnimationRequest", "(Luw0/i;)V", "dataChangeAnimationRequest", "z", "I", "getSelectedPosition", "()I", "setSelectedPosition", "(I)V", "selectedPosition", "", "A", "Z", "getGesturesEnabled", "()Z", "setGesturesEnabled", "(Z)V", "gesturesEnabled", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SegmentedChartView extends View implements ts0.a, vs0.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final p0 D = new p0(null);
    public static final int E = R$attr.internal_textAppearanceEmphasis4;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public boolean gesturesEnabled;
    public final ihm.b B;
    public boolean C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f56737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final c0 chartDrawer;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseIntArray f56739c;
    public final nr0.e d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final b drawHolder;
    public final RectF f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o0 f56740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f56741h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f56742j;
    public final TextPaint k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Paint f56743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f56744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f56745n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f56746p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f56747q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f56748r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f56749s;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public float scaleAnimatorValue;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public float highlightAnimatorValue;
    public final ir0.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o f56751w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f56752x;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public uw0.i dataChangeAnimationRequest;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public int selectedPosition;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.chart.SegmentedChartView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RectF[] f56754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f56755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f56756c;
        public final RectF d;
        public final RectF e;

        public b() {
            this(0);
        }

        public b(int i) {
            RectF[] barRects = new RectF[0];
            RectF barDrawingRect = new RectF();
            RectF marksDrawingRect = new RectF();
            Intrinsics.checkNotNullParameter(barRects, "barRects");
            Intrinsics.checkNotNullParameter(barDrawingRect, "barDrawingRect");
            Intrinsics.checkNotNullParameter(marksDrawingRect, "marksDrawingRect");
            this.f56754a = barRects;
            this.f56755b = 0;
            this.f56756c = 0;
            this.d = barDrawingRect;
            this.e = marksDrawingRect;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SegmentedChartView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static float e(l0 l0Var) {
        List list = l0Var.f273886c;
        boolean zIsEmpty = list.isEmpty();
        float f = BitmapDescriptorFactory.HUE_RED;
        if (!zIsEmpty) {
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                f += ((m0) listIterator.previous()).f273889a;
            }
        }
        return f;
    }

    public final int a(l0 l0Var) {
        List list = l0Var.f273886c;
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            int i2 = 0;
            while (it8.hasNext()) {
                if (!(((m0) it8.next()).f273889a == BitmapDescriptorFactory.HUE_RED) && (i2 = i2 + 1) < 0) {
                    v.r();
                    throw null;
                }
            }
            i = i2;
        }
        return (i - 1) * this.o;
    }

    public final float b(float f, l0 l0Var) {
        int size = l0Var.f273886c.size();
        if (f == BitmapDescriptorFactory.HUE_RED || size == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return (f / e(l0Var)) * (this.drawHolder.d.height() - a(l0Var));
    }

    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v25, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object, java.util.List] */
    public final void c() {
        Object next;
        float f;
        int size;
        float fB;
        ?? r110 = this.f56752x;
        b bVar = this.drawHolder;
        RectF[] rectFArr = bVar.f56754a;
        RectF rectF = bVar.d;
        for (RectF rectF2 : rectFArr) {
            gj7.b.d(rectF2);
        }
        if (r110.size() > rectFArr.length) {
            int size2 = r110.size();
            RectF[] rectFArr2 = new RectF[size2];
            for (int i = 0; i < size2; i++) {
                RectF rectF3 = (RectF) kotlin.collections.d.W(i, rectFArr);
                if (rectF3 == null) {
                    rectF3 = new RectF();
                }
                rectFArr2[i] = rectF3;
            }
            rectFArr = rectFArr2;
        }
        Intrinsics.checkNotNullParameter(rectFArr, "<set-?>");
        bVar.f56754a = rectFArr;
        float fMax = BitmapDescriptorFactory.HUE_RED;
        float fMin = BitmapDescriptorFactory.HUE_RED;
        for (l0 l0Var : (Iterable) this.f56752x) {
            fMax = Math.max(fMax, e(l0Var));
            fMin = Math.min(fMin, e(l0Var));
        }
        Iterator it8 = ((Iterable) this.f56752x).iterator();
        boolean zHasNext = it8.hasNext();
        TextPaint textPaint = this.k;
        nr0.e eVar = this.d;
        if (zHasNext) {
            next = it8.next();
            if (it8.hasNext()) {
                int height = eVar.b(((l0) next).f273885b, textPaint).getHeight();
                do {
                    Object next2 = it8.next();
                    int height2 = eVar.b(((l0) next2).f273885b, textPaint).getHeight();
                    if (height < height2) {
                        next = next2;
                        height = height2;
                    }
                } while (it8.hasNext());
            }
        } else {
            next = null;
        }
        Integer numValueOf = next != null ? Integer.valueOf(eVar.b(((l0) next).f273885b, textPaint).getHeight()) : null;
        bVar.f56756c = numValueOf != null ? numValueOf.intValue() : 0;
        rectF.left = getPaddingLeft();
        rectF.top = getPaddingTop();
        rectF.right = getWidth() - getPaddingRight();
        float height3 = getHeight();
        int i2 = bVar.f56756c;
        rectF.bottom = ((height3 - ((i2 + r7) + r8)) - this.f56747q) - this.f56748r;
        RectF rectF4 = bVar.e;
        rectF4.left = rectF.left;
        rectF4.top = rectF.bottom;
        rectF4.right = rectF.right;
        rectF4.bottom = getHeight();
        if (this.f56752x.isEmpty()) {
            return;
        }
        float fWidth = rectF.width();
        int size3 = this.f56752x.size();
        int i3 = this.f56746p;
        float size4 = (fWidth - (size3 * i3)) / (this.f56752x.size() + 1);
        bVar.f56755b = (int) size4;
        int i5 = 0;
        for (Object obj2 : (Iterable) this.f56752x) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                v.s();
                throw null;
            }
            l0 l0Var2 = (l0) obj2;
            RectF[] rectFArr3 = bVar.f56754a;
            RectF rectF5 = rectFArr3[i5];
            if (i5 == 0) {
                f = rectF.left;
                size = 2;
            } else {
                f = rectFArr3[i5 - 1].right + size4;
                size = this.f56752x.size() - 1;
            }
            float f4 = (size4 / size) + f;
            rectF5.left = f4;
            rectF5.right = f4 + i3;
            float f5 = rectF.top;
            float fA = a(l0Var2);
            List list = l0Var2.f273886c;
            if (list.isEmpty()) {
                fB = BitmapDescriptorFactory.HUE_RED;
            } else {
                ListIterator listIterator = list.listIterator(list.size());
                fB = BitmapDescriptorFactory.HUE_RED;
                while (listIterator.hasPrevious()) {
                    fB += b(((m0) listIterator.previous()).f273889a, l0Var2);
                }
            }
            rectF5.top = f5 - (fA + fB);
            rectF5.bottom = rectF.bottom;
            i5 = i6;
        }
        this.C = false;
    }

    public final void d(Canvas canvas, l0 l0Var, int i, int i2) {
        b bVar = this.drawHolder;
        RectF rectF = bVar.f56754a[i];
        Layout layoutB = this.d.b(l0Var.f273885b, this.k);
        float f = bVar.e.top + this.f56744m;
        layoutB.getPaint().setColor(i2);
        a.a.g(layoutB, canvas, rectF.centerX(), f);
    }

    public final int f(int i) {
        SparseIntArray sparseIntArray = this.f56739c;
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

    public final uw0.i getDataChangeAnimationRequest() {
        return this.dataChangeAnimationRequest;
    }

    @NotNull
    /* JADX INFO: renamed from: getDrawHolder$ui_kit_components_release, reason: from getter */
    public final b getDrawHolder() {
        return this.drawHolder;
    }

    public final boolean getGesturesEnabled() {
        return this.gesturesEnabled;
    }

    @Override // vs0.a
    public float getHighlightAnimatorValue() {
        return this.highlightAnimatorValue;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<ts0.l0>] */
    @NotNull
    public final List<l0> getItems() {
        return this.f56752x;
    }

    @Override // vs0.a
    public float getScaleAnimatorValue() {
        return this.scaleAnimatorValue;
    }

    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        RectF rectF;
        Canvas canvas2 = canvas;
        Intrinsics.checkNotNullParameter(canvas2, "canvas");
        super.onDraw(canvas);
        if (this.C) {
            c();
        }
        Iterator it8 = ((Iterable) this.f56752x).iterator();
        int i3 = 0;
        while (true) {
            boolean zHasNext = it8.hasNext();
            RectF rectF2 = this.f;
            b bVar = this.drawHolder;
            if (!zHasNext) {
                int i5 = this.selectedPosition;
                if (i5 >= 0) {
                    RectF rectF3 = bVar.f56754a[i5];
                    l0 l0Var = (l0) this.f56752x.get(i5);
                    gj7.b.d(rectF2);
                    rectF2.left = rectF3.centerX() - (bVar.f56755b / 2);
                    float f = bVar.e.top;
                    int i6 = this.f56744m;
                    int i21 = this.f56747q;
                    float f4 = f + (i6 - i21);
                    rectF2.top = f4;
                    rectF2.bottom = f4 + bVar.f56756c + i21 + this.f56748r;
                    rectF2.right = rectF3.centerX() + (bVar.f56755b / 2);
                    int i22 = this.f56742j;
                    Paint paint = this.f56743l;
                    paint.setColor(i22);
                    float f5 = this.f56749s;
                    canvas2.drawRoundRect(rectF2, f5, f5, paint);
                    d(canvas2, l0Var, this.selectedPosition, this.i);
                    return;
                }
                return;
            }
            Object next = it8.next();
            int i32 = i3 + 1;
            if (i3 < 0) {
                v.s();
                throw null;
            }
            l0 l0Var2 = (l0) next;
            List list = l0Var2.f273886c;
            RectF rectF4 = bVar.f56754a[i3];
            int size = list.size();
            int i33 = 0;
            float f6 = 0.0f;
            while (i33 < size) {
                m0 m0Var = (m0) list.get(i33);
                rectF2.left = rectF4.left;
                rectF2.right = rectF4.right;
                float f32 = m0Var.f273889a;
                float fB = b(f32, l0Var2);
                if (f32 < BitmapDescriptorFactory.HUE_RED) {
                    float f35 = rectF4.top + f6;
                    rectF2.top = f35;
                    rectF2.bottom = f35 + fB;
                } else {
                    float f36 = rectF4.bottom - f6;
                    rectF2.bottom = f36;
                    rectF2.top = f36 - (getScaleAnimatorValue() * fB);
                }
                int iF = f(m0Var.f273890b);
                if (this.f56737a) {
                    i2 = i33;
                    i = size;
                    z.b(m3750getChartDrawer(), canvas2, rectF2, iF, f32 < BitmapDescriptorFactory.HUE_RED ? u.DOWN : u.UP, list.size() == 1 ? w.TIP : i33 == 0 ? w.BASE : i33 == v.j(list) ? w.TIP : w.BODY, null, 48);
                    canvas2 = canvas;
                    rectF = rectF2;
                } else {
                    i = size;
                    RectF rectF5 = rectF2;
                    i2 = i33;
                    this.v.d(iF);
                    float f37 = rectF5.left;
                    float f41 = rectF5.top;
                    float f42 = rectF5.right;
                    float f57 = rectF5.bottom;
                    float f69 = this.f56745n;
                    rectF = rectF5;
                    canvas2 = canvas;
                    this.v.k(canvas2, f37, f41, f42, f57, f69, f69);
                }
                f6 = f6 + fB + this.o;
                i33 = i2 + 1;
                size = i;
                rectF2 = rectF;
            }
            d(canvas2, l0Var2, i3, this.f56741h);
            i3 = i32;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
        } else if (mode == 1073741824) {
            suggestedMinimumWidth = size;
        }
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            suggestedMinimumHeight = Math.min(suggestedMinimumHeight, size2);
        } else if (mode2 == 1073741824) {
            suggestedMinimumHeight = size2;
        }
        setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        c();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "event");
        if (this.gesturesEnabled) {
            o0 o0Var = this.f56740g;
            o0Var.getClass();
            Intrinsics.checkNotNullParameter(e, "e");
            boolean zOnTouchEvent = o0Var.d.onTouchEvent(e);
            if (!zOnTouchEvent && (e.getAction() == 3 || e.getAction() == 1)) {
                i iVar = o0Var.f273896b;
                iVar.d = false;
                iVar.e.f273895a.removeCallbacks(iVar.f56786c);
            }
            if (zOnTouchEvent) {
                return true;
            }
        }
        return super.onTouchEvent(e);
    }

    public final void setDataChangeAnimationRequest(uw0.i iVar) {
        this.dataChangeAnimationRequest = iVar;
    }

    public final void setGesturesEnabled(boolean z) {
        if (!z && this.gesturesEnabled) {
            setSelectedPosition(-1);
        }
        this.gesturesEnabled = z;
    }

    @Override // vs0.a
    public void setHighlightAnimatorValue(float f) {
        this.highlightAnimatorValue = f;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void setItems(@NotNull List<l0> value) {
        TextPaint textPaint;
        nr0.e eVar;
        Intrinsics.checkNotNullParameter(value, "value");
        l0 l0Var = (l0) d0.e0(this.selectedPosition, this.f56752x);
        String str = l0Var != null ? l0Var.f273884a : null;
        List<l0> list = value;
        Iterator<T> it8 = list.iterator();
        while (true) {
            boolean zHasNext = it8.hasNext();
            textPaint = this.k;
            eVar = this.d;
            if (!zHasNext) {
                break;
            } else {
                eVar.f(((l0) it8.next()).f273885b, textPaint);
            }
        }
        Iterator it9 = ((Iterable) this.f56752x).iterator();
        while (it9.hasNext()) {
            eVar.e(((l0) it9.next()).f273885b, textPaint);
        }
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (l0 l0Var2 : list) {
            List list2 = l0Var2.f273886c;
            ArrayList fractions = new ArrayList();
            for (Object obj2 : list2) {
                if (((m0) obj2).f273889a != BitmapDescriptorFactory.HUE_RED) {
                    fractions.add(obj2);
                }
            }
            String id10 = l0Var2.f273884a;
            Clause title = l0Var2.f273885b;
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(fractions, "fractions");
            arrayList.add(new l0(title, id10, fractions));
        }
        this.f56752x = arrayList;
        Iterator it10 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it10.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.f(((l0) it10.next()).f273884a, str)) {
                break;
            } else {
                i++;
            }
        }
        setSelectedPosition(i);
        this.C = true;
        this.f56751w.a(this.dataChangeAnimationRequest);
        invalidate();
    }

    @Override // vs0.a
    public void setScaleAnimatorValue(float f) {
        this.scaleAnimatorValue = f;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final void setSelectedPosition(int i) {
        if (i != this.selectedPosition) {
            this.selectedPosition = i;
            invalidate();
            p0 p0Var = D;
            ihm.b bVar = this.B;
            if (i < 0) {
                bVar.onNext(p0Var);
                return;
            }
            if (i <= v.j(this.f56752x)) {
                bVar.onNext(new p0((l0) this.f56752x.get(i)));
                return;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.l(i, "selectedPosition ", " larger than number of items"));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            bVar.onNext(p0Var);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SegmentedChartView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    /* JADX INFO: renamed from: getChartDrawer, reason: from getter and merged with bridge method [inline-methods] */
    public c0 m3750getChartDrawer() {
        return this.chartDrawer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    public SegmentedChartView(@NotNull Context context, AttributeSet attributeSet, int i) {
        o jVar;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        boolean zBooleanValue = ((Boolean) jo0.g.E.getValue()).booleanValue();
        this.f56737a = zBooleanValue;
        this.chartDrawer = new c0(context, this);
        this.f56739c = new SparseIntArray();
        this.d = new nr0.e(this, new t(this, 19));
        this.drawHolder = new b(0);
        this.f = new RectF();
        this.f56740g = new o0(this);
        this.f56741h = f(R$attr.uikit_colorGreyTone50);
        this.i = f(R$attr.uikit_colorAccent);
        this.f56742j = f(R$attr.uikit_colorActionBackground);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);
        this.k = textPaint;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(kli.a.k(context, 1.0f));
        paint.setAntiAlias(true);
        this.f56743l = paint;
        this.f56744m = kli.a.k(context, 12.0f);
        this.f56745n = kli.a.k(context, 2.0f);
        this.o = kli.a.k(context, 2.0f);
        this.f56746p = kli.a.k(context, 8.0f);
        this.f56747q = kli.a.k(context, 4.0f);
        this.f56748r = kli.a.k(context, 4.0f);
        this.f56749s = kli.a.k(context, 4.0f);
        this.scaleAnimatorValue = 1.0f;
        this.highlightAnimatorValue = 1.0f;
        ir0.g gVarA = ebm.a.a(this, new Paint());
        this.v = gVarA;
        if (zBooleanValue) {
            jVar = new iv0.f(this);
        } else {
            jVar = new j(this, gVarA, q.b(new tpl.o(this, 8)), new lm.d(13));
        }
        this.f56751w = jVar;
        this.f56752x = f0.f322471a;
        this.selectedPosition = -1;
        this.gesturesEnabled = true;
        this.B = j6.a.h("create(...)");
        setWillNotDraw(false);
        l.d(textPaint, context, E);
    }

    public /* synthetic */ SegmentedChartView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
