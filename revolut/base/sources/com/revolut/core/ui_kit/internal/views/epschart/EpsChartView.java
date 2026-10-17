package com.revolut.core.ui_kit.internal.views.epschart;

import a.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.epschart.EpsChartView;
import com.revolut.core.ui_kit_resources.R$attr;
import ihm.f;
import ip0.qf;
import ip0.rf;
import ip0.tf;
import ip0.uf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import jb3.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kt0.b;
import kt0.d;
import nr0.e;
import od0.h;
import od0.i;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001\u0010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR$\u0010\"\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00068@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/epschart/EpsChartView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lip0/uf;", "chartData", "", "setData", "(Lip0/uf;)V", "Lkt0/f;", "a", "Lkotlin/Lazy;", "getGestureHelper", "()Lkt0/f;", "gestureHelper", "", "Lip0/rf;", "Landroid/graphics/RectF;", "A", "Ljava/util/Map;", "getChartEntriesRect$ui_kit_components_release", "()Ljava/util/Map;", "chartEntriesRect", "value", "getSelectedPosition$ui_kit_components_release", "()I", "setSelectedPosition$ui_kit_components_release", "(I)V", "selectedPosition", "Companion", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EpsChartView extends FrameLayout {
    public final LinkedHashMap A;
    public final f B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f56925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public uf f56926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f56927c;
    public final RectF d;
    public final RectF e;
    public final RectF f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RectF f56928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RectF f56929h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f56930j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f56931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f56932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Paint f56933n;
    public final Paint o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Paint f56934p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Paint f56935q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextPaint f56936r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextPaint f56937s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextPaint f56938t;
    public final Paint u;
    public final Paint v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f56939w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f56940x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f56941y;
    public float z;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final int C = R$attr.uikit_colorPerformancePositive;
    public static final int D = R$attr.uikit_colorPerformanceNegative;
    public static final int E = R$attr.uikit_colorGreyTone10;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.epschart.EpsChartView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EpsChartView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final kt0.f getGestureHelper() {
        return (kt0.f) this.f56925a.getValue();
    }

    public final float a(RectF rectF, float f) {
        float f4 = rectF.top;
        float f5 = this.f56941y;
        return (rectF.height() * (1.0f - ((f - f5) / (this.z - f5)))) + f4;
    }

    @NotNull
    public final Map<rf, RectF> getChartEntriesRect$ui_kit_components_release() {
        return this.A;
    }

    public final int getSelectedPosition$ui_kit_components_release() {
        uf ufVar = this.f56926b;
        if (ufVar != null) {
            return ufVar.f166652c;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v51, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v57, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        TextPaint textPaint;
        LinkedHashMap linkedHashMap;
        int i2;
        int i3;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        int i5;
        int i6;
        int i21;
        Paint paint;
        uf ufVar;
        List list;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Float fValueOf;
        Float fValueOf2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        boolean z = this.f56927c;
        int i22 = this.k;
        int i32 = this.f56930j;
        TextPaint textPaint2 = this.f56937s;
        TextPaint textPaint3 = this.f56938t;
        RectF rectF = this.f56928g;
        TextPaint textPaint4 = this.f56936r;
        int i33 = this.f56939w;
        RectF rectF2 = this.f;
        LinkedHashMap linkedHashMap3 = this.A;
        e eVar = this.f56932m;
        RectF rectF3 = this.e;
        if (!z || (ufVar = this.f56926b) == null) {
            i = i22;
            textPaint = textPaint4;
            linkedHashMap = linkedHashMap3;
            i2 = 0;
            i3 = 2;
        } else {
            i3 = 2;
            float f = ufVar.d;
            ArrayList arrayList2 = ufVar.f166650a;
            List list2 = ufVar.f166651b;
            float paddingLeft = getPaddingLeft();
            i = i22;
            RectF rectF4 = this.d;
            rectF4.left = paddingLeft;
            rectF4.top = getPaddingTop();
            rectF4.right = (getWidth() - getPaddingRight()) - getPaddingLeft();
            rectF4.bottom = (getHeight() - getPaddingBottom()) - getPaddingTop();
            List list3 = list2;
            Iterator it8 = list3.iterator();
            if (it8.hasNext()) {
                list = list3;
                numValueOf = Integer.valueOf(eVar.b(((qf) it8.next()).f165972b, textPaint4).getWidth());
                while (it8.hasNext()) {
                    LinkedHashMap linkedHashMap4 = linkedHashMap3;
                    Integer numValueOf4 = Integer.valueOf(eVar.b(((qf) it8.next()).f165972b, textPaint4).getWidth());
                    if (numValueOf.compareTo(numValueOf4) < 0) {
                        numValueOf = numValueOf4;
                    }
                    linkedHashMap3 = linkedHashMap4;
                }
            } else {
                list = list3;
                numValueOf = null;
            }
            LinkedHashMap linkedHashMap5 = linkedHashMap3;
            int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            Iterator it9 = list.iterator();
            if (it9.hasNext()) {
                numValueOf2 = Integer.valueOf(eVar.b(((qf) it9.next()).f165972b, textPaint4).getHeight());
                while (it9.hasNext()) {
                    float f4 = f;
                    Integer numValueOf5 = Integer.valueOf(eVar.b(((qf) it9.next()).f165972b, textPaint4).getHeight());
                    if (numValueOf2.compareTo(numValueOf5) < 0) {
                        numValueOf2 = numValueOf5;
                    }
                    f = f4;
                }
            } else {
                numValueOf2 = null;
            }
            float f5 = f;
            int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
            float f6 = (rectF4.right - iIntValue) - (!list2.isEmpty() ? this.i : 0);
            int i43 = iIntValue2;
            ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
            int i59 = 0;
            for (Object obj2 : arrayList2) {
                int i66 = i59 + 1;
                if (i59 < 0) {
                    v.s();
                    throw null;
                }
                TextPaint textPaint5 = textPaint4;
                rf rfVar = (rf) obj2;
                ArrayList arrayList4 = arrayList2;
                arrayList3.add(Integer.valueOf(i59 == ufVar.f166652c ? eVar.b(rfVar.f166172c, textPaint3).getHeight() : eVar.b(rfVar.f166172c, textPaint2).getHeight()));
                arrayList2 = arrayList4;
                i59 = i66;
                textPaint4 = textPaint5;
            }
            textPaint = textPaint4;
            ArrayList arrayList5 = arrayList2;
            Iterator it10 = arrayList3.iterator();
            if (it10.hasNext()) {
                numValueOf3 = Integer.valueOf(((Number) it10.next()).intValue());
                while (it10.hasNext()) {
                    Integer numValueOf6 = Integer.valueOf(((Number) it10.next()).intValue());
                    if (numValueOf3.compareTo(numValueOf6) < 0) {
                        numValueOf3 = numValueOf6;
                    }
                }
            } else {
                numValueOf3 = null;
            }
            int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : 0;
            rectF.left = rectF4.left;
            float f32 = rectF4.bottom;
            rectF.top = ((f32 - iIntValue3) - i32) - (i * 2);
            rectF.right = f6;
            rectF.bottom = f32;
            rectF2.left = f6;
            int i74 = i43 / 2;
            rectF2.top = rectF4.top + Math.max(i74, i33);
            rectF2.right = rectF4.right;
            rectF2.bottom = rectF.top - Math.max(i74, i33);
            rectF3.left = rectF4.left;
            rectF3.top = rectF4.top + Math.max(i74, i33);
            rectF3.right = rectF2.left;
            rectF3.bottom = rectF.top - Math.max(i74, i33);
            Iterator it11 = list.iterator();
            if (it11.hasNext()) {
                float fMin = ((qf) it11.next()).f165971a;
                while (it11.hasNext()) {
                    fMin = Math.min(fMin, ((qf) it11.next()).f165971a);
                }
                fValueOf = Float.valueOf(fMin);
            } else {
                fValueOf = null;
            }
            float fFloatValue = fValueOf != null ? fValueOf.floatValue() : BitmapDescriptorFactory.HUE_RED;
            Iterator it12 = arrayList5.iterator();
            if (!it12.hasNext()) {
                throw new NoSuchElementException();
            }
            rf rfVar2 = (rf) it12.next();
            tf tfVar = rfVar2.f166171b;
            float fMin2 = tfVar != null ? tfVar.f166512a : BitmapDescriptorFactory.HUE_RED;
            Float f35 = rfVar2.f166170a;
            float fFloatValue2 = f35 != null ? f35.floatValue() : BitmapDescriptorFactory.HUE_RED;
            if (fMin2 > fFloatValue2) {
                fMin2 = fFloatValue2;
            }
            while (it12.hasNext()) {
                rf rfVar3 = (rf) it12.next();
                tf tfVar2 = rfVar3.f166171b;
                float f36 = tfVar2 != null ? tfVar2.f166512a : BitmapDescriptorFactory.HUE_RED;
                Float f37 = rfVar3.f166170a;
                float fFloatValue3 = f37 != null ? f37.floatValue() : BitmapDescriptorFactory.HUE_RED;
                if (f36 > fFloatValue3) {
                    f36 = fFloatValue3;
                }
                fMin2 = Math.min(fMin2, f36);
            }
            this.f56941y = Math.min(fFloatValue, Math.min(fMin2, f5));
            Iterator it13 = list.iterator();
            if (it13.hasNext()) {
                float fMax = ((qf) it13.next()).f165971a;
                while (it13.hasNext()) {
                    fMax = Math.max(fMax, ((qf) it13.next()).f165971a);
                }
                fValueOf2 = Float.valueOf(fMax);
            } else {
                fValueOf2 = null;
            }
            float fFloatValue4 = fValueOf2 != null ? fValueOf2.floatValue() : BitmapDescriptorFactory.HUE_RED;
            Iterator it14 = arrayList5.iterator();
            if (!it14.hasNext()) {
                throw new NoSuchElementException();
            }
            rf rfVar4 = (rf) it14.next();
            tf tfVar3 = rfVar4.f166171b;
            float fMax2 = tfVar3 != null ? tfVar3.f166512a : BitmapDescriptorFactory.HUE_RED;
            Float f41 = rfVar4.f166170a;
            float fFloatValue5 = f41 != null ? f41.floatValue() : BitmapDescriptorFactory.HUE_RED;
            if (fMax2 < fFloatValue5) {
                fMax2 = fFloatValue5;
            }
            while (it14.hasNext()) {
                rf rfVar5 = (rf) it14.next();
                tf tfVar4 = rfVar5.f166171b;
                float f42 = tfVar4 != null ? tfVar4.f166512a : BitmapDescriptorFactory.HUE_RED;
                Float f57 = rfVar5.f166170a;
                float fFloatValue6 = f57 != null ? f57.floatValue() : BitmapDescriptorFactory.HUE_RED;
                if (f42 < fFloatValue6) {
                    f42 = fFloatValue6;
                }
                fMax2 = Math.max(fMax2, f42);
            }
            this.z = Math.max(fFloatValue4, Math.max(fMax2, f5));
            this.f56940x = a(rectF3, f5);
            float fWidth = rectF.width() / arrayList5.size();
            float f69 = rectF.left;
            linkedHashMap5.clear();
            int size = arrayList5.size();
            int i92 = 0;
            while (i92 < size) {
                ArrayList arrayList6 = arrayList5;
                rf rfVar6 = (rf) arrayList6.get(i92);
                float f75 = fWidth;
                LinkedHashMap linkedHashMap6 = linkedHashMap5;
                RectF rectF5 = (RectF) linkedHashMap6.get(rfVar6);
                if (rectF5 == null) {
                    rectF5 = new RectF();
                }
                int i96 = size;
                RectF rectF6 = rectF5;
                rectF6.top = rectF4.top;
                rectF6.left = f69;
                f69 += f75;
                rectF6.right = f69;
                rectF6.bottom = rectF4.bottom;
                linkedHashMap6.put(rfVar6, rectF6);
                i92++;
                linkedHashMap5 = linkedHashMap6;
                fWidth = f75;
                size = i96;
                arrayList5 = arrayList6;
            }
            linkedHashMap = linkedHashMap5;
            i2 = 0;
            this.f56927c = false;
        }
        uf ufVar2 = this.f56926b;
        if (ufVar2 != null) {
            int i99 = ufVar2.f166652c;
            ArrayList arrayList7 = ufVar2.f166650a;
            if (!arrayList7.isEmpty()) {
                int size2 = arrayList7.size();
                int i100 = i2;
                while (i100 < size2) {
                    rf rfVar7 = (rf) arrayList7.get(i100);
                    ?? r87 = rfVar7.f166172c;
                    RectF rectF7 = (RectF) linkedHashMap.get(rfVar7);
                    if (rectF7 == null) {
                        linkedHashMap2 = linkedHashMap;
                        arrayList = arrayList7;
                        i6 = i;
                        i5 = i32;
                    } else {
                        Layout layoutB = i100 == i99 ? eVar.b(r87, textPaint3) : eVar.b(r87, textPaint2);
                        linkedHashMap2 = linkedHashMap;
                        float fCenterX = rectF7.centerX();
                        arrayList = arrayList7;
                        float f77 = i32;
                        float f81 = rectF.top + f77;
                        int i101 = i;
                        i5 = i32;
                        float f82 = f81 + i101;
                        i6 = i101;
                        a.g(layoutB, canvas, fCenterX, f82);
                        if (i100 == i99) {
                            float f93 = rectF.top + f77;
                            RectF rectF8 = this.f56929h;
                            rectF8.top = f93;
                            rectF8.bottom = rectF.bottom;
                            rectF8.left = rectF7.left;
                            rectF8.right = rectF7.right;
                            float f94 = this.f56931l;
                            canvas.drawRoundRect(rectF8, f94, f94, this.u);
                        }
                    }
                    i100++;
                    arrayList7 = arrayList;
                    i32 = i5;
                    i = i6;
                    linkedHashMap = linkedHashMap2;
                }
            }
        }
        uf ufVar3 = this.f56926b;
        if (ufVar3 != null) {
            List list4 = ufVar3.f166651b;
            if (!list4.isEmpty()) {
                int size3 = list4.size();
                for (int i102 = 0; i102 < size3; i102++) {
                    qf qfVar = (qf) list4.get(i102);
                    float f99 = qfVar.f165971a;
                    a.i(eVar.b(qfVar.f165972b, textPaint), canvas, rectF2.right, a(rectF2, f99) - (r5.getHeight() / 2));
                }
            }
        }
        float f100 = rectF3.left;
        float f101 = this.f56940x;
        canvas.drawLine(f100, f101, rectF3.right, f101, this.v);
        uf ufVar4 = this.f56926b;
        if (ufVar4 == null) {
            return;
        }
        ArrayList arrayList8 = ufVar4.f166650a;
        float fWidth2 = rectF3.width() / arrayList8.size();
        float f102 = rectF3.left;
        int i103 = 0;
        for (Object obj3 : arrayList8) {
            int i104 = i103 + 1;
            if (i103 < 0) {
                v.s();
                throw null;
            }
            rf rfVar8 = (rf) obj3;
            Float f103 = rfVar8.f166170a;
            tf tfVar5 = rfVar8.f166171b;
            f102 += i103 == 0 ? fWidth2 / 2.0f : fWidth2;
            if (f103 != null) {
                float fA = a(rectF3, f103.floatValue());
                float f104 = i33;
                canvas.drawCircle(f102, fA, f104, this.f56934p);
                canvas.drawCircle(f102, fA, f104, this.f56935q);
            }
            if (tfVar5 != null) {
                float fA2 = a(rectF3, tfVar5.f166512a);
                int i105 = b.f189491a[tfVar5.f166513b.ordinal()];
                if (i105 != 1) {
                    i21 = i3;
                    if (i105 != i21) {
                        throw new NoWhenBranchMatchedException();
                    }
                    paint = this.o;
                } else {
                    i21 = i3;
                    paint = this.f56933n;
                }
                canvas.drawCircle(f102, fA2, i33, paint);
            } else {
                i21 = i3;
            }
            i103 = i104;
            i3 = i21;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent e) {
        if (e != null) {
            kt0.f gestureHelper = getGestureHelper();
            gestureHelper.getClass();
            Intrinsics.checkNotNullParameter(e, "e");
            boolean zOnTouchEvent = gestureHelper.f189499c.onTouchEvent(e);
            if (!zOnTouchEvent && (e.getAction() == 3 || e.getAction() == 1)) {
                kt0.e eVar = gestureHelper.f189498b;
                eVar.d = false;
                ((kt0.f) eVar.f).f189497a.removeCallbacks((d) eVar.e);
            }
            if (zOnTouchEvent) {
                return true;
            }
        }
        return super.onTouchEvent(e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void setData(@NotNull uf chartData) {
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        if (Intrinsics.f(this.f56926b, chartData)) {
            return;
        }
        this.f56926b = chartData;
        e eVar = this.f56932m;
        eVar.a();
        ArrayList arrayList = chartData.f166650a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ?? r56 = ((rf) arrayList.get(i)).f166172c;
            if (i == chartData.f166652c) {
                eVar.f(r56, this.f56938t);
            } else {
                eVar.f(r56, this.f56937s);
            }
        }
        List list = chartData.f166651b;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            eVar.f(((qf) list.get(i2)).f165972b, this.f56936r);
        }
        this.f56927c = true;
        invalidate();
    }

    public final void setSelectedPosition$ui_kit_components_release(int i) {
        uf ufVar = this.f56926b;
        if (ufVar != null) {
            if (i >= ufVar.f166650a.size()) {
                i = -1;
            }
            h hVar = i.Companion;
            uf ufVar2 = this.f56926b;
            rf rfVar = ufVar2 != null ? (rf) d0.e0(i, ufVar2.f166650a) : null;
            hVar.getClass();
            this.B.onNext(h.a(rfVar));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EpsChartView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpsChartView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i2 = 0;
        this.f56925a = te0.w.y0(new Function0(this) { // from class: kt0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EpsChartView f189490b;

            {
                this.f189490b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                EpsChartView epsChartView = this.f189490b;
                switch (i3) {
                    case 0:
                        EpsChartView.Companion companion = EpsChartView.INSTANCE;
                        return new f(epsChartView);
                    default:
                        epsChartView.f56927c = true;
                        epsChartView.invalidate();
                        return Unit.f186387a;
                }
            }
        });
        final int i3 = 1;
        this.f56927c = true;
        this.d = new RectF();
        this.e = new RectF();
        this.f = new RectF();
        this.f56928g = new RectF();
        this.f56929h = new RectF();
        this.i = kli.a.k(context, 8.0f);
        this.f56930j = kli.a.k(context, 8.0f);
        this.k = kli.a.k(context, 4.0f);
        this.f56931l = kli.a.l(context, 4.0f);
        this.f56932m = new e(this, new Function0(this) { // from class: kt0.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EpsChartView f189490b;

            {
                this.f189490b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                EpsChartView epsChartView = this.f189490b;
                switch (i32) {
                    case 0:
                        EpsChartView.Companion companion = EpsChartView.INSTANCE;
                        return new f(epsChartView);
                    default:
                        epsChartView.f56927c = true;
                        epsChartView.invalidate();
                        return Unit.f186387a;
                }
            }
        });
        Paint paintC = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        Paint.Style style = Paint.Style.FILL;
        paintC.setStyle(style);
        paintC.setColor(kli.a.s(C, context));
        this.f56933n = paintC;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(style);
        paint.setColor(kli.a.s(D, context));
        this.o = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        paint2.setColor(kli.a.s(E, context));
        this.f56934p = paint2;
        Paint paintC2 = com.google.android.gms.internal.mlkit_vision_face.a.c(true);
        Paint.Style style2 = Paint.Style.STROKE;
        paintC2.setStyle(style2);
        paintC2.setDither(true);
        paintC2.setStrokeJoin(Paint.Join.ROUND);
        paintC2.setStrokeCap(Paint.Cap.ROUND);
        paintC2.setColor(kli.a.s(R$attr.uikit_colorGreyTone20, context));
        paintC2.setPathEffect(new ComposePathEffect(new DashPathEffect(new float[]{kli.a.l(context, 2.0f), kli.a.l(context, 2.0f)}, BitmapDescriptorFactory.HUE_RED), new CornerPathEffect(kli.a.l(context, 2.0f))));
        this.f56935q = paintC2;
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.RIGHT);
        this.f56936r = textPaint;
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setAntiAlias(true);
        Paint.Align align = Paint.Align.CENTER;
        textPaint2.setTextAlign(align);
        this.f56937s = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        textPaint3.setAntiAlias(true);
        textPaint3.setTextAlign(align);
        this.f56938t = textPaint3;
        Paint paint3 = new Paint();
        paint3.setStyle(style);
        this.u = paint3;
        Paint paint4 = new Paint();
        paint4.setStyle(style2);
        this.v = paint4;
        this.f56939w = kli.a.k(context, 5.0f);
        this.A = new LinkedHashMap();
        this.B = v0.a.d("create(...)");
        setWillNotDraw(false);
        l.d(textPaint, context, R$attr.internal_textAppearanceBody3);
        textPaint.setColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        textPaint.setAlpha(178);
        textPaint2.setColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        l.d(textPaint2, context, R$attr.internal_textAppearanceEmphasis4);
        textPaint2.setAlpha(178);
        textPaint3.setColor(kli.a.s(R$attr.uikit_colorAccent, context));
        l.d(textPaint3, context, R$attr.internal_textAppearanceEmphasis4);
        paint3.setColor(kli.a.s(R$attr.uikit_colorActionBackground, context));
        paint3.setAlpha(51);
        paint4.setAntiAlias(true);
        paint4.setColor(kli.a.s(R$attr.uikit_colorGrey20, context));
        paint4.setStyle(style2);
        paint4.setStrokeWidth(kli.a.l(context, 1.0f));
        paint4.setPathEffect(new ComposePathEffect(new DashPathEffect(new float[]{kli.a.l(context, 2.0f), kli.a.l(context, 2.0f)}, BitmapDescriptorFactory.HUE_RED), new CornerPathEffect(kli.a.l(context, 2.0f))));
    }

    public /* synthetic */ EpsChartView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
