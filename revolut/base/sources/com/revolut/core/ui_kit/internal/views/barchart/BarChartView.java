package com.revolut.core.ui_kit.internal.views.barchart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.barchart.BarChartView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import ct0.c0;
import ct0.m;
import ct0.p;
import hx7.q;
import ihm.f;
import ip0.d3;
import ip0.dl;
import ip0.e3;
import ip0.f3;
import ip0.fl;
import ip0.h3;
import ip0.i3;
import ip0.m3;
import ip0.n3;
import ip0.p3;
import ip0.t3;
import ip0.u3;
import ip0.y3;
import ip0.z3;
import ir0.e;
import ir0.g;
import iv0.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import jb3.l;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import ps0.d;
import ps0.j;
import ps0.k;
import ts0.a;
import uw0.i;
import vs0.b;
import vs0.c;
import zhm.d0;
import zhm.q0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u008a\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004\u008b\u0001\u008c\u0001B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010%\u001a\u0004\u0018\u00010!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R*\u0010.\u001a\u00020&2\u0006\u0010'\u001a\u00020&8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00102\u001a\u00020&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b/\u0010)\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R\"\u00106\u001a\u00020&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u0010)\u001a\u0004\b4\u0010+\"\u0004\b5\u0010-R.\u0010>\u001a\u0004\u0018\u0001072\b\u0010'\u001a\u0004\u0018\u0001078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R*\u0010E\u001a\u00020?2\u0006\u0010'\u001a\u00020?8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR*\u0010M\u001a\u00020F2\u0006\u0010'\u001a\u00020F8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR*\u0010U\u001a\u00020N2\u0006\u0010'\u001a\u00020N8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR*\u0010[\u001a\u00020\t2\u0006\u0010V\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010W\u001a\u0004\bX\u0010\u000e\"\u0004\bY\u0010ZR*\u0010_\u001a\u00020\t2\u0006\u0010V\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010W\u001a\u0004\b]\u0010\u000e\"\u0004\b^\u0010ZR$\u0010f\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010n\u001a\u00020g8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR\"\u0010r\u001a\u00020g8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\bo\u0010i\u001a\u0004\bp\u0010k\"\u0004\bq\u0010mR.\u0010{\u001a\u000e\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020g0s8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\"\u0010\u007f\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b|\u0010)\u001a\u0004\b}\u0010+\"\u0004\b~\u0010-R\u0013\u0010\u0081\u0001\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010\u000eR\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u008d\u0001"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/barchart/BarChartView;", "Landroid/widget/FrameLayout;", "Lts0/a;", "Lvs0/a;", "Lvs0/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getHorizontalPadding", "()I", "Lct0/c0;", "b", "Lct0/c0;", "getChartDrawer", "()Lct0/c0;", "chartDrawer", "Lvs0/b;", "f", "Lvs0/b;", "getSelectionType", "()Lvs0/b;", "selectionType", "Lps0/d;", "h", "Lkotlin/Lazy;", "getGestureHelper", "()Lps0/d;", "gestureHelper", "Landroid/graphics/drawable/Drawable;", "u", "getSelectedCategoryBackground", "()Landroid/graphics/drawable/Drawable;", "selectedCategoryBackground", "", "value", "z", "F", "getScaleAnimatorValue", "()F", "setScaleAnimatorValue", "(F)V", "scaleAnimatorValue", "A", "getHighlightAnimatorValue", "setHighlightAnimatorValue", "highlightAnimatorValue", "B", "getSelectionAnimatorValue", "setSelectionAnimatorValue", "selectionAnimatorValue", "Luw0/i;", "E", "Luw0/i;", "getDataChangeAnimationRequest", "()Luw0/i;", "setDataChangeAnimationRequest", "(Luw0/i;)V", "dataChangeAnimationRequest", "Lip0/dl;", "Lip0/dl;", "getDataset", "()Lip0/dl;", "setDataset", "(Lip0/dl;)V", "dataset", "Lip0/f3;", "G", "Lip0/f3;", "getStyle", "()Lip0/f3;", "setStyle", "(Lip0/f3;)V", "style", "", "H", "Z", "getBackgroundEnabled", "()Z", "setBackgroundEnabled", "(Z)V", "backgroundEnabled", "position", "I", "getSelectedPosition", "setSelectedPosition", "(I)V", "selectedPosition", "J", "getDefaultSelectedCategory", "setDefaultSelectedCategory", "defaultSelectedCategory", "K", "Ljava/lang/Float;", "getSelectionAreaWidth", "()Ljava/lang/Float;", "setSelectionAreaWidth", "(Ljava/lang/Float;)V", "selectionAreaWidth", "Landroid/graphics/RectF;", "L", "Landroid/graphics/RectF;", "getDrawRect$ui_kit_components_release", "()Landroid/graphics/RectF;", "setDrawRect$ui_kit_components_release", "(Landroid/graphics/RectF;)V", "drawRect", "M", "getGraphRect$ui_kit_components_release", "setGraphRect$ui_kit_components_release", "graphRect", "", "Lip0/i3;", "N", "Ljava/util/Map;", "getCategoryRects$ui_kit_components_release", "()Ljava/util/Map;", "setCategoryRects$ui_kit_components_release", "(Ljava/util/Map;)V", "categoryRects", "O", "getCategorySelectionAreaWidth$ui_kit_components_release", "setCategorySelectionAreaWidth$ui_kit_components_release", "categorySelectionAreaWidth", "getCurrentSelectedPosition", "currentSelectedPosition", "Lip0/p3;", "getBarDataset", "()Lip0/p3;", "barDataset", "Lip0/fl;", "getLineDataset", "()Lip0/fl;", "lineDataset", "Companion", "ps0/i", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BarChartView extends FrameLayout implements a, vs0.a, c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public float highlightAnimatorValue;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public float selectionAnimatorValue;
    public final o C;
    public final e D;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public i dataChangeAnimationRequest;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public dl dataset;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public f3 style;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public boolean backgroundEnabled;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public int selectedPosition;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public int defaultSelectedCategory;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public Float selectionAreaWidth;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public RectF drawRect;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public RectF graphRect;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public Map categoryRects;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public float categorySelectionAreaWidth;
    public Map P;
    public List Q;
    public Map R;
    public Object S;
    public Object T;
    public Path U;
    public boolean V;
    public float W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f56520a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f56521a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final c0 chartDrawer;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f56523b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ct0.c f56524c;
    public float c0;
    public final p d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f56525d0;
    public final ps0.i e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final RectF f56526e0;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final b selectionType;
    public final Path f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vs0.e f56527g;
    public final float[] g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final Lazy gestureHelper;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final float[] f56529h0;
    public final SparseIntArray i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nr0.e f56530j;
    public final k k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextPaint f56531l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextPaint f56532m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextPaint f56533n;
    public final float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Paint f56534p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Paint f56535q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Paint f56536r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Paint f56537s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Paint f56538t;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final Lazy selectedCategoryBackground;
    public final f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f56539w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Matrix f56540x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g f56541y;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public float scaleAnimatorValue;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.barchart.BarChartView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BarChartView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static ArrayList a(BarChartView barChartView, float f, u3 series) {
        Pair pair;
        Intrinsics.checkNotNullParameter(series, "series");
        List<h3> list = barChartView.getLineDataset().f164274a;
        ArrayList arrayList = new ArrayList();
        for (h3 h3Var : list) {
            z3 z3Var = (z3) h3Var.f164501c.get(series.f166584a);
            if (z3Var == null) {
                pair = null;
            } else {
                float f4 = z3Var.f167391a;
                pair = new Pair(new Point((int) ((RectF) r0.h(h3Var.f164499a, barChartView.getCategoryRects$ui_kit_components_release())).centerX(), (int) (f4 >= BitmapDescriptorFactory.HUE_RED ? barChartView.f56525d0 - (f4 * f) : barChartView.f56525d0 + (Math.abs(f4) * f))), z3Var.f167393c == y3.DASHED ? barChartView.f56536r : barChartView.f56535q);
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return arrayList;
    }

    public static float c(p3 p3Var, float f, float f4) {
        return ((p3Var.f165762a.size() - 1) * f4) + (p3Var.f165762a.size() * f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p3 getBarDataset() {
        return this.dataset.f163917a;
    }

    private final d getGestureHelper() {
        return (d) this.gestureHelper.getValue();
    }

    private final int getHorizontalPadding() {
        int i = j.f239365a[this.style.f164187a.ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i == 4) {
                return 0;
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return this.k.f239367a;
    }

    private final fl getLineDataset() {
        fl flVar = this.dataset.f163918b;
        if (flVar != null) {
            return flVar;
        }
        fl.Companion.getClass();
        return fl.d;
    }

    private final Drawable getSelectedCategoryBackground() {
        return (Drawable) this.selectedCategoryBackground.getValue();
    }

    public static float j(fl flVar) {
        Float fValueOf;
        List list = flVar.f164274a;
        Sequence sequence = flVar.f164275b;
        Iterator it8 = list.iterator();
        if (it8.hasNext()) {
            Float fA = y.A(y.z(sequence, new ps0.e((h3) it8.next(), 3)));
            float fFloatValue = fA != null ? fA.floatValue() : 0.0f;
            while (it8.hasNext()) {
                Float fA2 = y.A(y.z(sequence, new ps0.e((h3) it8.next(), 3)));
                fFloatValue = Math.max(fFloatValue, fA2 != null ? fA2.floatValue() : 0.0f);
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        return Math.max(fValueOf != null ? fValueOf.floatValue() : 0.0f, BitmapDescriptorFactory.HUE_RED);
    }

    public static float l(fl flVar) {
        Float fValueOf;
        List list = flVar.f164274a;
        Sequence sequence = flVar.f164275b;
        Iterator it8 = list.iterator();
        if (it8.hasNext()) {
            Float fC = y.C(y.z(sequence, new ps0.e((h3) it8.next(), 2)));
            float fFloatValue = fC != null ? fC.floatValue() : 0.0f;
            while (it8.hasNext()) {
                Float fC2 = y.C(y.z(sequence, new ps0.e((h3) it8.next(), 2)));
                fFloatValue = Math.min(fFloatValue, fC2 != null ? fC2.floatValue() : 0.0f);
            }
            fValueOf = Float.valueOf(fFloatValue);
        } else {
            fValueOf = null;
        }
        return Math.min(fValueOf != null ? fValueOf.floatValue() : 0.0f, BitmapDescriptorFactory.HUE_RED);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03da  */
    /* JADX WARN: Type inference failed for: r10v14, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v73, types: [java.lang.Object, java.util.Map] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instruction units count: 2035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.barchart.BarChartView.d():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.e.dispatchHoverEvent(event) || super.dispatchHoverEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.e.dispatchKeyEvent(event) || super.dispatchKeyEvent(event);
    }

    public final Pair e(p3 p3Var, h3 h3Var, float f, float f4, float f5, float f6) {
        float fMax;
        f3 f3Var = this.style;
        boolean z = f3Var instanceof d3;
        float fMin = BitmapDescriptorFactory.HUE_RED;
        if (z) {
            Float fA = y.A(y.z(p3Var.f165763b, new ps0.e(h3Var, 0)));
            fMax = Math.max(fA != null ? fA.floatValue() : 0.0f, BitmapDescriptorFactory.HUE_RED);
        } else {
            if (!(f3Var instanceof e3)) {
                throw new NoWhenBranchMatchedException();
            }
            fMax = Math.max(y.G(y.z(p3Var.f165763b, new ps0.e(h3Var, 6))), BitmapDescriptorFactory.HUE_RED);
        }
        float f32 = fMax * f;
        f3 f3Var2 = this.style;
        if (f3Var2 instanceof d3) {
            Float fC = y.C(y.z(p3Var.f165763b, new ps0.e(h3Var, 7)));
            fMin = Math.min(fC != null ? fC.floatValue() : 0.0f, BitmapDescriptorFactory.HUE_RED);
        } else if (!(f3Var2 instanceof e3)) {
            throw new NoWhenBranchMatchedException();
        }
        i3 i3Var = h3Var.f164499a;
        RectF rectF = new RectF();
        rectF.left = f4;
        rectF.right = f5;
        rectF.top = f6 - Math.abs(f32);
        rectF.bottom = Math.abs(fMin * f) + f6;
        return new Pair(i3Var, rectF);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016c  */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.graphics.Canvas r32, boolean r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.barchart.BarChartView.f(android.graphics.Canvas, boolean, boolean):void");
    }

    public final LinkedHashMap g(m3 m3Var, float f, float f4) {
        Map map = m3Var.f165309a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            float fFloatValue = ((Number) entry.getKey()).floatValue();
            if (f4 <= fFloatValue && fFloatValue <= f) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Clause clause = (Clause) entry2.getValue();
            nr0.e eVar = this.f56530j;
            TextPaint textPaint = this.f56533n;
            eVar.f(clause, textPaint);
            linkedHashMap2.put(key, eVar.b(clause, textPaint));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(q0.b(linkedHashMap2.size()));
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            linkedHashMap3.put(Long.valueOf((long) ((Number) entry3.getKey()).floatValue()), entry3.getValue());
        }
        return linkedHashMap3;
    }

    public final boolean getBackgroundEnabled() {
        return this.backgroundEnabled;
    }

    @NotNull
    public final Map<i3, RectF> getCategoryRects$ui_kit_components_release() {
        Map<i3, RectF> map = this.categoryRects;
        if (map != null) {
            return map;
        }
        Intrinsics.r("categoryRects");
        throw null;
    }

    /* JADX INFO: renamed from: getCategorySelectionAreaWidth$ui_kit_components_release, reason: from getter */
    public final float getCategorySelectionAreaWidth() {
        return this.categorySelectionAreaWidth;
    }

    public final int getCurrentSelectedPosition() {
        Integer numValueOf = Integer.valueOf(this.selectedPosition);
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : this.defaultSelectedCategory;
    }

    public final i getDataChangeAnimationRequest() {
        return this.dataChangeAnimationRequest;
    }

    @NotNull
    public final dl getDataset() {
        return this.dataset;
    }

    public final int getDefaultSelectedCategory() {
        return this.defaultSelectedCategory;
    }

    @NotNull
    public final RectF getDrawRect$ui_kit_components_release() {
        RectF rectF = this.drawRect;
        if (rectF != null) {
            return rectF;
        }
        Intrinsics.r("drawRect");
        throw null;
    }

    @NotNull
    public final RectF getGraphRect$ui_kit_components_release() {
        RectF rectF = this.graphRect;
        if (rectF != null) {
            return rectF;
        }
        Intrinsics.r("graphRect");
        throw null;
    }

    @Override // vs0.a
    public float getHighlightAnimatorValue() {
        return this.highlightAnimatorValue;
    }

    @Override // vs0.a
    public float getScaleAnimatorValue() {
        return this.scaleAnimatorValue;
    }

    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    @Override // vs0.c
    public float getSelectionAnimatorValue() {
        return this.selectionAnimatorValue;
    }

    public final Float getSelectionAreaWidth() {
        return this.selectionAreaWidth;
    }

    @Override // vs0.c
    @NotNull
    public b getSelectionType() {
        return this.selectionType;
    }

    @NotNull
    public final f3 getStyle() {
        return this.style;
    }

    /* JADX WARN: Type inference failed for: r14v25, types: [java.lang.Object, kotlin.Lazy] */
    public final LinkedHashMap h(final float f, n3 n3Var, float f4, float f5) {
        List listK;
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        double d = f;
        if (0.0d <= d && d <= 0.15d) {
            listK = v.k(Float.valueOf(f4), Float.valueOf((2 * f4) / 3.0f), Float.valueOf((f4 * 1) / 3.0f), fValueOf);
        } else if (0.15d <= d && d <= 0.4d) {
            listK = v.k(Float.valueOf(f4), Float.valueOf((f4 * 1) / 2.0f), fValueOf, Float.valueOf(f5));
        } else if (0.4d <= d && d <= 0.6d) {
            listK = v.k(Float.valueOf(f4), fValueOf, Float.valueOf(f5));
        } else if (0.6d <= d && d <= 0.85d) {
            listK = v.k(Float.valueOf(f4), fValueOf, Float.valueOf((1 * f5) / 2.0f), Float.valueOf(f5));
        } else {
            if (0.85d > d || d > 1.0d) {
                throw new IllegalStateException(new Function0() { // from class: ps0.g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        BarChartView.Companion companion = BarChartView.INSTANCE;
                        return "Invalid value. " + f + " should be between 0 and 1";
                    }
                }.toString());
            }
            listK = v.k(fValueOf, Float.valueOf((1 * f5) / 3.0f), Float.valueOf((2 * f5) / 3.0f), Float.valueOf(f5));
        }
        List list = listK;
        int iB = q0.b(w.t(list, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            long jFloatValue = (long) ((Number) it8.next()).floatValue();
            MoneyClause moneyClause = new MoneyClause(new dj0.d(jFloatValue, n3Var.f165449a), new MoneyClause.Format.Shorts(!((Boolean) jo0.g.E.getValue()).booleanValue(), 61), null, n3Var.f165450b, 4);
            nr0.e eVar = this.f56530j;
            TextPaint textPaint = this.f56533n;
            eVar.f(moneyClause, textPaint);
            linkedHashMap.put(Long.valueOf(jFloatValue), eVar.b(moneyClause, textPaint));
        }
        return linkedHashMap;
    }

    public final float i(p3 p3Var) {
        f3 f3Var = this.style;
        Float fValueOf = null;
        if (f3Var instanceof d3) {
            List list = p3Var.f165762a;
            Sequence sequence = p3Var.f165763b;
            Iterator it8 = list.iterator();
            if (it8.hasNext()) {
                Float fA = y.A(y.z(sequence, new ps0.e((h3) it8.next(), 4)));
                float fFloatValue = fA != null ? fA.floatValue() : 0.0f;
                while (it8.hasNext()) {
                    Float fA2 = y.A(y.z(sequence, new ps0.e((h3) it8.next(), 4)));
                    fFloatValue = Math.max(fFloatValue, fA2 != null ? fA2.floatValue() : 0.0f);
                }
                fValueOf = Float.valueOf(fFloatValue);
            }
            return Math.max(fValueOf != null ? fValueOf.floatValue() : 0.0f, BitmapDescriptorFactory.HUE_RED);
        }
        if (!(f3Var instanceof e3)) {
            throw new NoWhenBranchMatchedException();
        }
        List list2 = p3Var.f165762a;
        Sequence sequence2 = p3Var.f165763b;
        Iterator it9 = list2.iterator();
        if (it9.hasNext()) {
            float fG = y.G(y.z(sequence2, new ps0.e((h3) it9.next(), 5)));
            while (it9.hasNext()) {
                fG = Math.max(fG, y.G(y.z(sequence2, new ps0.e((h3) it9.next(), 5))));
            }
            fValueOf = Float.valueOf(fG);
        }
        return Math.max(fValueOf != null ? fValueOf.floatValue() : 0.0f, BitmapDescriptorFactory.HUE_RED);
    }

    public final float k(p3 p3Var) {
        f3 f3Var = this.style;
        if (!(f3Var instanceof d3)) {
            if (f3Var instanceof e3) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            throw new NoWhenBranchMatchedException();
        }
        List list = p3Var.f165762a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            Float fC = y.C(y.z(p3Var.f165763b, new ps0.e((h3) it8.next(), 1)));
            arrayList.add(Float.valueOf(fC != null ? fC.floatValue() : 0.0f));
        }
        Float fW0 = d0.w0(arrayList);
        return Math.min(fW0 != null ? fW0.floatValue() : 0.0f, BitmapDescriptorFactory.HUE_RED);
    }

    public final void m(int i) {
        h3 h3Var = (h3) d0.e0(i, getBarDataset().f165762a);
        this.v.onNext(new t3(h3Var != null ? h3Var.f164499a : null));
    }

    public final int n(int i) {
        SparseIntArray sparseIntArray = this.i;
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

    public final ArrayList o(p3 p3Var, float f, float f4, float f5) {
        List list = p3Var.f165762a;
        float fWidth = (getGraphRect$ui_kit_components_release().width() - (list.size() * f)) / (list.size() - 1 > 2 ? list.size() - 1 : 1);
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            float f6 = ((fWidth + f) * i) + getGraphRect$ui_kit_components_release().left;
            arrayList.add(e(p3Var, (h3) obj2, f4, f6, f6 + f, f5));
            i = i2;
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object, java.util.Map] */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float fA;
        long j2;
        float fA2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f56539w) {
            d();
        }
        boolean z = this.f56520a;
        if (z && this.backgroundEnabled) {
            this.f56524c.a(canvas, getGraphRect$ui_kit_components_release());
        }
        p pVar = this.d;
        if (z) {
            pVar.d(canvas, m.ZERO, this.f56521a0, this.f56523b0, this.c0);
        } else {
            Path path = this.U;
            if (path == null) {
                Intrinsics.r("baselinePath");
                throw null;
            }
            canvas.drawPath(path, this.f56537s);
        }
        if ((this.f56541y.n() || this.selectedPosition != -1) && !z) {
            f(canvas, true, false);
            f(canvas, false, true);
        } else {
            f(canvas, true, true);
        }
        Map map = this.R;
        if (map == null) {
            Intrinsics.r("xAxisLayouts");
            throw null;
        }
        int i = 0;
        for (Object obj2 : map.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj2;
            i3 i3Var = (i3) entry.getKey();
            Layout layout = (Layout) entry.getValue();
            RectF rectF = getCategoryRects$ui_kit_components_release().get(i3Var);
            if (rectF != null) {
                float f = getDrawRect$ui_kit_components_release().bottom - this.W;
                if (getCurrentSelectedPosition() == i) {
                    Drawable selectedCategoryBackground = getSelectedCategoryBackground();
                    if (selectedCategoryBackground != null) {
                        float f4 = 2;
                        selectedCategoryBackground.setBounds((int) (rectF.centerX() - (this.categorySelectionAreaWidth / f4)), (int) f, (int) ((this.categorySelectionAreaWidth / f4) + rectF.centerX()), (int) getDrawRect$ui_kit_components_release().bottom);
                    }
                    Drawable selectedCategoryBackground2 = getSelectedCategoryBackground();
                    if (selectedCategoryBackground2 != null) {
                        selectedCategoryBackground2.draw(canvas);
                    }
                }
                float f5 = f + this.k.f239372j;
                if (z) {
                    pVar.b(canvas, layout, this.f56531l, rectF.centerX(), f5, getCurrentSelectedPosition() == i);
                } else {
                    a.a.g(layout, canvas, rectF.centerX(), f5);
                }
            }
            i = i2;
        }
        ?? r110 = this.S;
        if (r110 == 0) {
            Intrinsics.r("rightYAxisLayouts");
            throw null;
        }
        if (!r110.isEmpty()) {
            ?? r111 = this.S;
            if (r111 == 0) {
                Intrinsics.r("rightYAxisLayouts");
                throw null;
            }
            Iterator it8 = r111.entrySet().iterator();
            if (!it8.hasNext()) {
                throw new NoSuchElementException();
            }
            long jLongValue = ((Number) ((Map.Entry) it8.next()).getKey()).longValue();
            while (it8.hasNext()) {
                long jLongValue2 = ((Number) ((Map.Entry) it8.next()).getKey()).longValue();
                if (jLongValue < jLongValue2) {
                    jLongValue = jLongValue2;
                }
            }
            float f6 = jLongValue;
            ?? r87 = this.S;
            if (r87 == 0) {
                Intrinsics.r("rightYAxisLayouts");
                throw null;
            }
            Iterator it9 = r87.entrySet().iterator();
            if (!it9.hasNext()) {
                throw new NoSuchElementException();
            }
            long jLongValue3 = ((Number) ((Map.Entry) it9.next()).getKey()).longValue();
            while (it9.hasNext()) {
                long jLongValue4 = ((Number) ((Map.Entry) it9.next()).getKey()).longValue();
                if (jLongValue3 > jLongValue4) {
                    jLongValue3 = jLongValue4;
                }
            }
            float f32 = jLongValue3;
            float fI = i(getBarDataset());
            float fK = k(getBarDataset());
            float fJ = j(getLineDataset());
            float fL = l(getLineDataset());
            ?? r132 = this.S;
            if (r132 == 0) {
                Intrinsics.r("rightYAxisLayouts");
                throw null;
            }
            for (Map.Entry entry2 : r132.entrySet()) {
                long jLongValue5 = ((Number) entry2.getKey()).longValue();
                Layout layout2 = (Layout) entry2.getValue();
                boolean z3 = this.V;
                if (z3) {
                    j2 = 0;
                    fA2 = this.f56525d0;
                } else {
                    j2 = 0;
                    fA2 = this.f56521a0;
                }
                if (jLongValue5 > j2) {
                    float fMax = z3 ? getBarDataset().d.equals(getLineDataset().f164276c) ? Math.max(fI, Math.max(fJ, f6)) : Math.max(Math.abs(fJ), f6) : Math.max(fI, f6);
                    fA2 -= (fA2 - getGraphRect$ui_kit_components_release().top) * (Math.abs(fMax) == BitmapDescriptorFactory.HUE_RED ? 0.0f : jLongValue5 / Math.abs(fMax));
                } else if (jLongValue5 < j2) {
                    float fMin = z3 ? getBarDataset().d.equals(getLineDataset().f164276c) ? Math.min(fK, Math.min(fL, f32)) : Math.min(fL, f32) : Math.min(fK, f32);
                    fA2 = j6.a.a(getGraphRect$ui_kit_components_release().bottom, fA2, Math.abs(fMin) == BitmapDescriptorFactory.HUE_RED ? 0.0f : jLongValue5 / fMin, fA2);
                }
                a.a.i(layout2, canvas, getDrawRect$ui_kit_components_release().right, fA2 - (layout2.getHeight() / 2.0f));
            }
        }
        ?? r112 = this.T;
        if (r112 == 0) {
            Intrinsics.r("leftYAxisLayouts");
            throw null;
        }
        if (!r112.isEmpty()) {
            ?? r113 = this.T;
            if (r113 == 0) {
                Intrinsics.r("leftYAxisLayouts");
                throw null;
            }
            Iterator it10 = r113.entrySet().iterator();
            if (!it10.hasNext()) {
                throw new NoSuchElementException();
            }
            long jLongValue6 = ((Number) ((Map.Entry) it10.next()).getKey()).longValue();
            while (it10.hasNext()) {
                long jLongValue7 = ((Number) ((Map.Entry) it10.next()).getKey()).longValue();
                if (jLongValue6 < jLongValue7) {
                    jLongValue6 = jLongValue7;
                }
            }
            float f35 = jLongValue6;
            ?? r4 = this.T;
            if (r4 == 0) {
                Intrinsics.r("leftYAxisLayouts");
                throw null;
            }
            Iterator it11 = r4.entrySet().iterator();
            if (!it11.hasNext()) {
                throw new NoSuchElementException();
            }
            long jLongValue8 = ((Number) ((Map.Entry) it11.next()).getKey()).longValue();
            while (it11.hasNext()) {
                long jLongValue9 = ((Number) ((Map.Entry) it11.next()).getKey()).longValue();
                if (jLongValue8 > jLongValue9) {
                    jLongValue8 = jLongValue9;
                }
            }
            float f36 = jLongValue8;
            ?? r56 = this.T;
            if (r56 == 0) {
                Intrinsics.r("leftYAxisLayouts");
                throw null;
            }
            for (Map.Entry entry3 : r56.entrySet()) {
                long jLongValue10 = ((Number) entry3.getKey()).longValue();
                Layout layout3 = (Layout) entry3.getValue();
                if (jLongValue10 > 0) {
                    float fMax2 = Math.max(i(getBarDataset()), f35);
                    float fAbs = Math.abs(fMax2) == BitmapDescriptorFactory.HUE_RED ? 0.0f : jLongValue10 / Math.abs(fMax2);
                    float f37 = this.f56521a0;
                    fA = f37 - ((f37 - getGraphRect$ui_kit_components_release().top) * fAbs);
                } else if (jLongValue10 < 0) {
                    float fMin2 = Math.min(k(getBarDataset()), f36);
                    fA = j6.a.a(getGraphRect$ui_kit_components_release().bottom, this.f56521a0, Math.abs(fMin2) == BitmapDescriptorFactory.HUE_RED ? 0.0f : jLongValue10 / fMin2, this.f56521a0);
                } else {
                    fA = this.f56521a0;
                }
                a.a.h(layout3, canvas, getDrawRect$ui_kit_components_release().left, fA - (layout3.getHeight() / 2.0f));
            }
        }
        if (!isInEditMode()) {
            return;
        }
        Set<Map.Entry<i3, RectF>> setEntrySet = getCategoryRects$ui_kit_components_release().entrySet();
        ArrayList arrayList = new ArrayList(w.t(setEntrySet, 10));
        Iterator<T> it12 = setEntrySet.iterator();
        while (true) {
            boolean zHasNext = it12.hasNext();
            Paint paint = this.f56538t;
            if (!zHasNext) {
                canvas.drawRect(getDrawRect$ui_kit_components_release(), paint);
                canvas.drawRect(getGraphRect$ui_kit_components_release(), paint);
                return;
            } else {
                canvas.drawRect((RectF) ((Map.Entry) it12.next()).getValue(), paint);
                arrayList.add(Unit.f186387a);
            }
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.e.onFocusChanged(z, i, rect);
    }

    @Override // android.widget.FrameLayout, android.view.View
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
        d();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent e) {
        Intrinsics.checkNotNullParameter(e, "event");
        d gestureHelper = getGestureHelper();
        gestureHelper.getClass();
        Intrinsics.checkNotNullParameter(e, "e");
        boolean zOnTouchEvent = gestureHelper.f239354c.onTouchEvent(e);
        if (!zOnTouchEvent && (e.getAction() == 3 || e.getAction() == 1)) {
            kt0.e eVar = gestureHelper.f239353b;
            eVar.d = false;
            ((d) eVar.f).f239352a.removeCallbacks((o6.a) eVar.e);
        }
        if (zOnTouchEvent) {
            return true;
        }
        return super.onTouchEvent(e);
    }

    public final void setBackgroundEnabled(boolean z) {
        if (this.backgroundEnabled != z) {
            this.backgroundEnabled = z;
            invalidate();
        }
    }

    public final void setCategoryRects$ui_kit_components_release(@NotNull Map<i3, ? extends RectF> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.categoryRects = map;
    }

    public final void setCategorySelectionAreaWidth$ui_kit_components_release(float f) {
        this.categorySelectionAreaWidth = f;
    }

    public final void setDataChangeAnimationRequest(i iVar) {
        if (Intrinsics.f(this.dataChangeAnimationRequest, iVar)) {
            return;
        }
        this.dataChangeAnimationRequest = iVar;
        p3 barDataset = getBarDataset();
        p3.Companion.getClass();
        if (Intrinsics.f(barDataset, p3.e)) {
            return;
        }
        this.C.a(iVar);
    }

    public final void setDataset(@NotNull dl value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f56539w = true;
        this.dataset = value;
        this.C.a(this.dataChangeAnimationRequest);
        invalidate();
        this.e.invalidateRoot();
    }

    public final void setDefaultSelectedCategory(int i) {
        if (this.defaultSelectedCategory != i) {
            this.defaultSelectedCategory = i;
            if (this.selectedPosition == -1) {
                invalidate();
            }
        }
    }

    public final void setDrawRect$ui_kit_components_release(@NotNull RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<set-?>");
        this.drawRect = rectF;
    }

    public final void setGraphRect$ui_kit_components_release(@NotNull RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "<set-?>");
        this.graphRect = rectF;
    }

    @Override // vs0.a
    public void setHighlightAnimatorValue(float f) {
        this.highlightAnimatorValue = f;
    }

    @Override // vs0.a
    public void setScaleAnimatorValue(float f) {
        this.scaleAnimatorValue = f;
        this.f56540x.setScale(1.0f, getScaleAnimatorValue(), BitmapDescriptorFactory.HUE_RED, this.f56521a0);
    }

    public final void setSelectedPosition(int i) {
        if (this.selectedPosition != i) {
            boolean z = (i == -1 || i == getCurrentSelectedPosition()) ? false : true;
            this.selectedPosition = i;
            if (z) {
                if (this.f56520a) {
                    this.f56527g.a();
                } else {
                    this.D.a();
                }
                this.f56539w = true;
            }
            invalidate();
        }
    }

    @Override // vs0.c
    public void setSelectionAnimatorValue(float f) {
        this.selectionAnimatorValue = f;
    }

    public final void setSelectionAreaWidth(Float f) {
        this.selectionAreaWidth = f;
    }

    public final void setStyle(@NotNull f3 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.style = value;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BarChartView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    /* JADX INFO: renamed from: getChartDrawer, reason: from getter and merged with bridge method [inline-methods] */
    public c0 m3747getChartDrawer() {
        return this.chartDrawer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public BarChartView(@NotNull Context context, AttributeSet attributeSet, int i) {
        o jVar;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56520a = ((Boolean) jo0.g.E.getValue()).booleanValue();
        this.chartDrawer = new c0(context, this);
        this.f56524c = new ct0.c(context);
        this.d = new p(context);
        this.e = new ps0.i(this);
        this.selectionType = b.ALWAYS_SELECTED;
        this.f56527g = new vs0.e(this);
        final int i2 = 0;
        this.gestureHelper = yhm.j.b(new Function0(this) { // from class: ps0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BarChartView f239362b;

            {
                this.f239362b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                BarChartView barChartView = this.f239362b;
                switch (i3) {
                    case 0:
                        BarChartView.Companion companion = BarChartView.INSTANCE;
                        return new d(barChartView);
                    default:
                        barChartView.f56539w = true;
                        barChartView.invalidate();
                        return Unit.f186387a;
                }
            }
        });
        this.i = new SparseIntArray();
        final int i3 = 1;
        this.f56530j = new nr0.e(this, new Function0(this) { // from class: ps0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BarChartView f239362b;

            {
                this.f239362b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                BarChartView barChartView = this.f239362b;
                switch (i32) {
                    case 0:
                        BarChartView.Companion companion = BarChartView.INSTANCE;
                        return new d(barChartView);
                    default:
                        barChartView.f56539w = true;
                        barChartView.invalidate();
                        return Unit.f186387a;
                }
            }
        });
        k kVar = new k(context);
        this.k = kVar;
        TextPaint textPaint = new TextPaint();
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        textPaint.setAntiAlias(true);
        textPaint.setColor(n(R$attr.uikit_colorGreyTone50));
        this.f56531l = textPaint;
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setTextAlign(align);
        textPaint2.setAntiAlias(true);
        textPaint2.setColor(n(R$attr.uikit_colorAccent));
        this.f56532m = textPaint2;
        TextPaint textPaint3 = new TextPaint();
        textPaint3.setTextAlign(Paint.Align.RIGHT);
        textPaint3.setAntiAlias(true);
        textPaint3.setColor(n(R$attr.uikit_colorGreyTone50));
        this.f56533n = textPaint3;
        Paint.FontMetrics fontMetrics = textPaint3.getFontMetrics();
        this.o = fontMetrics.descent - fontMetrics.ascent;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        this.f56534p = paint;
        Paint paint2 = new Paint();
        paint2.setColor(kli.a.s(R$attr.uikit_colorOrange, context));
        paint2.setAntiAlias(true);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(kli.a.l(context, 2.0f));
        this.f56535q = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(kli.a.s(R$attr.uikit_colorOrange, context));
        paint3.setAntiAlias(true);
        paint3.setStrokeCap(cap);
        paint3.setStrokeWidth(kli.a.l(context, 2.0f));
        paint3.setPathEffect(new DashPathEffect(new float[]{kli.a.l(context, 1.0f), kli.a.l(context, 4.0f)}, BitmapDescriptorFactory.HUE_RED));
        this.f56536r = paint3;
        Paint paint4 = new Paint();
        paint4.setStyle(Paint.Style.STROKE);
        List list = kVar.o;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(Float.valueOf(kli.a.k(context, ((Number) it8.next()).floatValue())));
        }
        paint4.setPathEffect(new DashPathEffect(d0.a1(arrayList), BitmapDescriptorFactory.HUE_RED));
        paint4.setColor(n(R$attr.uikit_colorGreyTone50));
        paint4.setAntiAlias(true);
        this.f56537s = paint4;
        Paint paint5 = new Paint();
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setColor(-65536);
        this.f56538t = paint5;
        this.selectedCategoryBackground = yhm.j.b(new lu0.a(context, 19));
        this.v = v0.a.d("create(...)");
        this.f56539w = true;
        this.f56540x = new Matrix();
        g gVarA = ebm.a.a(this, new Paint(this.f56534p));
        this.f56541y = gVarA;
        this.scaleAnimatorValue = 1.0f;
        this.highlightAnimatorValue = 1.0f;
        this.selectionAnimatorValue = 1.0f;
        if (this.f56520a) {
            jVar = new iv0.f(this);
        } else {
            jVar = new iv0.j(this, gVarA, q.b(new pp5.d(this, 17)), new lm.d(13));
        }
        this.C = jVar;
        this.D = new e(this, gVarA);
        p3.Companion.getClass();
        this.dataset = new dl(p3.e, null, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        this.style = new d3(0);
        this.selectedPosition = -1;
        this.defaultSelectedCategory = -1;
        setWillNotDraw(false);
        ViewCompat.setAccessibilityDelegate(this, this.e);
        if (this.f56520a) {
            l.d(this.f56531l, context, R$attr.internal_textAppearanceBody3);
        } else {
            l.d(this.f56531l, context, R$attr.internal_textAppearanceEmphasis4);
            l.d(this.f56532m, context, R$attr.internal_textAppearanceEmphasis4);
        }
        l.d(this.f56533n, context, R$attr.internal_textAppearanceBody3);
        this.f56526e0 = new RectF();
        this.f0 = new Path();
        float f = this.k.f239375n;
        this.g0 = new float[]{f, f, f, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
        this.f56529h0 = new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f, f, f};
    }

    public /* synthetic */ BarChartView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
