package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.LinearGaugeChartView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.z;
import kotlin.reflect.KProperty;
import ms0.t1;
import ms0.u1;
import org.jetbrains.annotations.NotNull;
import r10.q;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 >2\u00020\u0001:\u0004?\n@AB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010,\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R/\u00105\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010-8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R0\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006B"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/LinearGaugeChartView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/internal/views/e;", "model", "", "setModel", "(Lcom/revolut/core/ui_kit/internal/views/e;)V", "", "pointerProgress", "lineProgress", "setProgresses", "(FLjava/lang/Float;)V", "Landroid/graphics/Bitmap;", "o", "Lkotlin/Lazy;", "getPointerBitmap", "()Landroid/graphics/Bitmap;", "pointerBitmap", "Landroid/graphics/Paint;", "p", "getLinePaint", "()Landroid/graphics/Paint;", "linePaint", "value", "v", "F", "setAppearingAnimatedValue", "(F)V", "appearingAnimatedValue", "position", "B", "I", "getSelectedPosition", "()I", "setSelectedPosition", "(I)V", "selectedPosition", "Luw0/i;", "<set-?>", "C", "Lr10/q;", "getDataChangeAnimationRequest", "()Luw0/i;", "setDataChangeAnimationRequest", "(Luw0/i;)V", "dataChangeAnimationRequest", "Lkotlin/Function1;", "D", "Lkotlin/jvm/functions/Function1;", "getSelectionListener", "()Lkotlin/jvm/functions/Function1;", "setSelectionListener", "(Lkotlin/jvm/functions/Function1;)V", "selectionListener", "Companion", "b", "ms0/u1", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LinearGaugeChartView extends View {
    public u1 A;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public int selectedPosition;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public final q dataChangeAnimationRequest;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public Function1 selectionListener;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f56233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f56234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f56235c;
    public final float d;
    public final int e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f56236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f56237h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f56238j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f56239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RectF f56240m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f56241n;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final Lazy pointerBitmap;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final Lazy linePaint;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f56243q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final nr0.e f56244r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextPaint f56245s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ir0.g f56246t;
    public final ir0.e u;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public float appearingAnimatedValue;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final iv0.j f56247w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final GestureDetector f56248x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e f56249y;
    public u1 z;
    public static final /* synthetic */ KProperty[] E = {o0.f186429a.f(new z(LinearGaugeChartView.class, "dataChangeAnimationRequest", "getDataChangeAnimationRequest()Lcom/revolut/core/ui_kit/recycler/animation/ItemAnimationRequest;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f56250a = new a();

            private a() {
            }
        }

        private b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinearGaugeChartView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Unit a(LinearGaugeChartView linearGaugeChartView, float f) {
        linearGaugeChartView.setAppearingAnimatedValue(f);
        return Unit.f186387a;
    }

    private final Paint getLinePaint() {
        return (Paint) this.linePaint.getValue();
    }

    private final Bitmap getPointerBitmap() {
        return (Bitmap) this.pointerBitmap.getValue();
    }

    private final void setAppearingAnimatedValue(float f) {
        this.appearingAnimatedValue = f;
        invalidate();
    }

    public final void b(int i) {
        float f;
        float f4;
        float f5;
        float f6;
        if (this.f56238j) {
            ArrayList arrayList = this.k;
            arrayList.clear();
            RectF rectF = this.f56240m;
            gj7.b.d(rectF);
            RectF rectF2 = this.f56239l;
            gj7.b.d(rectF2);
            boolean z = false;
            if (this.f56249y.f56922a.isEmpty()) {
                this.f56238j = false;
                return;
            }
            List list = this.f56249y.f56922a;
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList2.add(Float.valueOf(((t1) it8.next()).c()));
            }
            float fS0 = d0.S0(arrayList2);
            float f32 = this.f56235c;
            float size = i - ((this.f56249y.f56922a.size() - 1) * f32);
            float size2 = this.f56249y.f56922a.size();
            float f35 = this.d;
            float f36 = size - (size2 * f35);
            List list2 = this.f56249y.f56922a;
            int size3 = list2.size();
            float f37 = BitmapDescriptorFactory.HUE_RED;
            int i2 = 0;
            float f41 = 0.0f;
            while (i2 < size3) {
                t1 t1Var = (t1) list2.get(i2);
                float fC = fS0 > f37 ? ((t1Var.c() / fS0) * f36) + f35 : f37;
                if (d()) {
                    f = f37;
                    f4 = this.f;
                } else {
                    f = f37;
                    f4 = f + this.f56243q;
                }
                float f42 = fS0;
                float f57 = f36;
                List list3 = list2;
                arrayList.add(new Pair(new RectF(f41, f4, f41 + fC, this.f56233a + f4), t1Var));
                u1 u1Var = this.A;
                int i3 = this.f56236g;
                if (u1Var != null && u1Var.f208449c == i2) {
                    if (fC <= i3) {
                        f6 = (fC / 2) + f41;
                    } else {
                        float f69 = 2;
                        float f75 = i3 / f69;
                        f6 = ((fC - (f69 * f75)) * u1Var.f208448b) + f75 + f41;
                    }
                    float f77 = this.f56237h;
                    float f81 = this.i;
                    rectF2.set(f6, f81, f6, f77 + f81);
                }
                u1 u1Var2 = this.z;
                if (u1Var2 != null && u1Var2.f208449c == i2) {
                    float f82 = i3;
                    float f93 = 2;
                    float f94 = f82 / f93;
                    if (fC <= f82) {
                        f5 = ((fC / f93) + f41) - f94;
                    } else {
                        float f99 = i3 / f93;
                        f5 = (((fC - (f93 * f99)) * u1Var2.f208448b) + (f99 + f41)) - f94;
                    }
                    rectF.set(f5, -2.0f, f5 + f82, f82 - 2.0f);
                }
                if (i2 < this.f56249y.f56922a.size() - 1) {
                    f41 += fC + f32;
                }
                i2++;
                f37 = f;
                fS0 = f42;
                f36 = f57;
                list2 = list3;
                z = false;
            }
            this.f56238j = z;
        }
    }

    public final void c() {
        float f = this.f56233a;
        float f4 = this.f56234b;
        int i = this.f56243q;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f56233a = kli.a.l(context, this.f56249y.f56923b);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f56234b = kli.a.l(context2, this.f56249y.f56924c);
        int iK = 0;
        if (!this.f56249y.f56922a.isEmpty()) {
            List list = this.f56249y.f56922a;
            Clause clauseA = ((t1) d0.b0(list)).a();
            TextPaint textPaint = this.f56245s;
            nr0.e eVar = this.f56244r;
            float height = clauseA != null ? eVar.b(clauseA, textPaint).getHeight() : 0.0f;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                height = Math.max(height, ((t1) list.get(i2)).a() != null ? eVar.b(r12, textPaint).getHeight() : 0.0f);
            }
            int i3 = (int) height;
            if (i3 > 0) {
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                iK = kli.a.k(context3, 4.0f) + i3;
            }
        }
        this.f56243q = iK;
        if (f == this.f56233a && f4 == this.f56234b && i == iK) {
            return;
        }
        requestLayout();
    }

    public final boolean d() {
        return (this.A == null && this.z == null) ? false : true;
    }

    public final u1 e(Float f) {
        if (f == null) {
            return null;
        }
        List list = this.f56249y.f56922a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(Float.valueOf(((t1) it8.next()).c()));
        }
        float fS0 = d0.S0(arrayList);
        float fC = BitmapDescriptorFactory.HUE_RED;
        if (fS0 <= BitmapDescriptorFactory.HUE_RED) {
            return null;
        }
        List list2 = this.f56249y.f56922a;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            t1 t1Var = (t1) list2.get(i);
            float f4 = fC / fS0;
            float fC2 = (t1Var.c() + fC) / fS0;
            if (f.floatValue() <= fC2) {
                if (f4 == fC2) {
                    return null;
                }
                return new u1(f.floatValue(), (f.floatValue() - f4) / (fC2 - f4), i);
            }
            fC += t1Var.c();
        }
        return null;
    }

    public final uw0.i getDataChangeAnimationRequest() {
        KProperty property = E[0];
        q qVar = this.dataChangeAnimationRequest;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(this, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return (uw0.i) qVar.d;
    }

    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    public final Function1<Integer, Unit> getSelectionListener() {
        return this.selectionListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0214 A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r25) {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.LinearGaugeChartView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int iMin = d() ? this.e : (int) (this.f56233a + this.f56243q);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            iMin = Math.min(iMin, size2);
        } else if (mode == 1073741824) {
            iMin = size2;
        }
        setMeasuredDimension(size, iMin);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        b(i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (d() || !this.f56249y.d) {
            return super.onTouchEvent(event);
        }
        this.f56248x.onTouchEvent(event);
        return true;
    }

    public final void setDataChangeAnimationRequest(uw0.i iVar) {
        this.dataChangeAnimationRequest.setValue(this, E[0], iVar);
    }

    public final void setModel(@NotNull e model) {
        TextPaint textPaint;
        nr0.e eVar;
        Intrinsics.checkNotNullParameter(model, "model");
        List list = model.f56922a;
        int size = list.size();
        int i = 0;
        while (true) {
            textPaint = this.f56245s;
            eVar = this.f56244r;
            if (i >= size) {
                break;
            }
            Clause clauseA = ((t1) list.get(i)).a();
            if (clauseA != null) {
                eVar.f(clauseA, textPaint);
            }
            i++;
        }
        List list2 = this.f56249y.f56922a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Clause clauseA2 = ((t1) list2.get(i2)).a();
            if (clauseA2 != null) {
                eVar.e(clauseA2, textPaint);
            }
        }
        this.f56249y = model;
        setSelectedPosition(-1);
        c();
        this.f56238j = true;
        invalidate();
        uw0.i dataChangeAnimationRequest = getDataChangeAnimationRequest();
        if (!jo0.m.f176851h) {
            dataChangeAnimationRequest = null;
        }
        this.f56247w.a(dataChangeAnimationRequest);
    }

    public final void setProgresses(float pointerProgress, Float lineProgress) {
        boolean zD = d();
        this.z = e(Float.valueOf(pointerProgress));
        this.A = e(lineProgress);
        boolean zD2 = d();
        if (zD2) {
            setSelectedPosition(-1);
        }
        this.f56238j = true;
        if (zD != zD2) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final void setSelectedPosition(int i) {
        if (this.selectedPosition != i) {
            this.selectedPosition = i;
            if (i != -1) {
                this.u.a();
            }
            invalidate();
        }
    }

    public final void setSelectionListener(Function1<? super Integer, Unit> function1) {
        this.selectionListener = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LinearGaugeChartView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearGaugeChartView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56233a = kli.a.l(context, 8.0f);
        this.f56234b = kli.a.l(context, 2.0f);
        this.f56235c = kli.a.l(context, 4.0f);
        this.d = kli.a.l(context, 12.0f);
        this.e = kli.a.k(context, 24.0f);
        this.f = kli.a.l(context, 7.0f);
        this.f56236g = kli.a.k(context, 16.0f);
        this.f56237h = kli.a.l(context, 20.0f);
        this.i = kli.a.l(context, 2.0f);
        this.k = new ArrayList();
        this.f56239l = new RectF();
        this.f56240m = new RectF();
        Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        paintC.setStyle(Paint.Style.FILL);
        paintC.setStrokeCap(Paint.Cap.ROUND);
        this.f56241n = paintC;
        final int i2 = 0;
        this.pointerBitmap = yhm.j.b(new Function0(this) { // from class: ms0.p1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinearGaugeChartView f208364b;

            {
                this.f208364b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                LinearGaugeChartView linearGaugeChartView = this.f208364b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = LinearGaugeChartView.E;
                        VectorDrawableCompat vectorDrawableCompatCreate = VectorDrawableCompat.create(linearGaugeChartView.getResources(), R$drawable.uikit_icn_10_stocks_arrow_down, linearGaugeChartView.getContext().getTheme());
                        int i5 = linearGaugeChartView.f56236g;
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i5, i5, Bitmap.Config.ARGB_8888);
                        Canvas canvasE = ch.qos.logback.core.util.a.e(bitmapCreateBitmap, "createBitmap(...)", bitmapCreateBitmap);
                        if (vectorDrawableCompatCreate != null) {
                            vectorDrawableCompatCreate.setBounds(0, 0, canvasE.getWidth(), canvasE.getHeight());
                        }
                        if (vectorDrawableCompatCreate != null) {
                            Context context2 = linearGaugeChartView.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            vectorDrawableCompatCreate.setColorFilter(new PorterDuffColorFilter(kli.a.s(R$attr.uikit_colorForeground, context2), PorterDuff.Mode.SRC_IN));
                        }
                        if (vectorDrawableCompatCreate != null) {
                            vectorDrawableCompatCreate.draw(canvasE);
                        }
                        return bitmapCreateBitmap;
                    case 1:
                        KProperty[] kPropertyArr2 = LinearGaugeChartView.E;
                        linearGaugeChartView.c();
                        linearGaugeChartView.invalidate();
                        return Unit.f186387a;
                    default:
                        return Boolean.valueOf(!linearGaugeChartView.f56249y.f56922a.isEmpty());
                }
            }
        });
        this.linePaint = yhm.j.b(new lu0.a(context, 2));
        final int i3 = 1;
        this.f56244r = new nr0.e(this, new Function0(this) { // from class: ms0.p1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinearGaugeChartView f208364b;

            {
                this.f208364b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                LinearGaugeChartView linearGaugeChartView = this.f208364b;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = LinearGaugeChartView.E;
                        VectorDrawableCompat vectorDrawableCompatCreate = VectorDrawableCompat.create(linearGaugeChartView.getResources(), R$drawable.uikit_icn_10_stocks_arrow_down, linearGaugeChartView.getContext().getTheme());
                        int i5 = linearGaugeChartView.f56236g;
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i5, i5, Bitmap.Config.ARGB_8888);
                        Canvas canvasE = ch.qos.logback.core.util.a.e(bitmapCreateBitmap, "createBitmap(...)", bitmapCreateBitmap);
                        if (vectorDrawableCompatCreate != null) {
                            vectorDrawableCompatCreate.setBounds(0, 0, canvasE.getWidth(), canvasE.getHeight());
                        }
                        if (vectorDrawableCompatCreate != null) {
                            Context context2 = linearGaugeChartView.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            vectorDrawableCompatCreate.setColorFilter(new PorterDuffColorFilter(kli.a.s(R$attr.uikit_colorForeground, context2), PorterDuff.Mode.SRC_IN));
                        }
                        if (vectorDrawableCompatCreate != null) {
                            vectorDrawableCompatCreate.draw(canvasE);
                        }
                        return bitmapCreateBitmap;
                    case 1:
                        KProperty[] kPropertyArr2 = LinearGaugeChartView.E;
                        linearGaugeChartView.c();
                        linearGaugeChartView.invalidate();
                        return Unit.f186387a;
                    default:
                        return Boolean.valueOf(!linearGaugeChartView.f56249y.f56922a.isEmpty());
                }
            }
        });
        TextPaint textPaint = new TextPaint();
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);
        textPaint.setColor(kli.a.s(R$attr.uikit_colorForeground, context));
        jb3.l.d(textPaint, context, R$attr.internal_textAppearanceEmphasis3);
        this.f56245s = textPaint;
        ir0.g gVarA = ebm.a.a(this, paintC);
        gVarA.i(false);
        this.f56246t = gVarA;
        this.u = new ir0.e(this, gVarA);
        this.appearingAnimatedValue = 1.0f;
        iv0.j jVar = new iv0.j(this, gVarA, hx7.q.b(new mqi.a(this, 3)), new lm.d(13));
        this.f56247w = jVar;
        this.f56248x = new GestureDetector(context, new bx0.q(this, 6));
        this.f56249y = new e(f0.f322471a, false, 30);
        this.selectedPosition = -1;
        final int i5 = 2;
        this.dataChangeAnimationRequest = new q(jVar, new Function0(this) { // from class: ms0.p1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LinearGaugeChartView f208364b;

            {
                this.f208364b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i5;
                LinearGaugeChartView linearGaugeChartView = this.f208364b;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = LinearGaugeChartView.E;
                        VectorDrawableCompat vectorDrawableCompatCreate = VectorDrawableCompat.create(linearGaugeChartView.getResources(), R$drawable.uikit_icn_10_stocks_arrow_down, linearGaugeChartView.getContext().getTheme());
                        int i59 = linearGaugeChartView.f56236g;
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i59, i59, Bitmap.Config.ARGB_8888);
                        Canvas canvasE = ch.qos.logback.core.util.a.e(bitmapCreateBitmap, "createBitmap(...)", bitmapCreateBitmap);
                        if (vectorDrawableCompatCreate != null) {
                            vectorDrawableCompatCreate.setBounds(0, 0, canvasE.getWidth(), canvasE.getHeight());
                        }
                        if (vectorDrawableCompatCreate != null) {
                            Context context2 = linearGaugeChartView.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            vectorDrawableCompatCreate.setColorFilter(new PorterDuffColorFilter(kli.a.s(R$attr.uikit_colorForeground, context2), PorterDuff.Mode.SRC_IN));
                        }
                        if (vectorDrawableCompatCreate != null) {
                            vectorDrawableCompatCreate.draw(canvasE);
                        }
                        return bitmapCreateBitmap;
                    case 1:
                        KProperty[] kPropertyArr2 = LinearGaugeChartView.E;
                        linearGaugeChartView.c();
                        linearGaugeChartView.invalidate();
                        return Unit.f186387a;
                    default:
                        return Boolean.valueOf(!linearGaugeChartView.f56249y.f56922a.isEmpty());
                }
            }
        });
    }

    public /* synthetic */ LinearGaugeChartView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
