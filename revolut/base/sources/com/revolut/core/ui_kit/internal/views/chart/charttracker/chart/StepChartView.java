package com.revolut.core.ui_kit.internal.views.chart.charttracker.chart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import at0.a;
import aw0.a7;
import aw0.t6;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import efm.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import nr0.e;
import org.jetbrains.annotations.NotNull;
import xs0.c;
import xs0.d;
import ys0.b;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 _2\u00020\u0001:\u0001\u000bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR.\u0010\u0018\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010,\u001a\u00020'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u00102\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010?\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010\f\u001a\u0004\b<\u0010\u000e\"\u0004\b=\u0010>R\"\u0010C\u001a\u0002038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u00105\u001a\u0004\bA\u00107\"\u0004\bB\u00109R\u0014\u0010E\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u000eR\u0014\u0010G\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u000eR\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020I0H8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR(\u0010N\u001a\u0004\u0018\u00010M2\b\u0010\u0011\u001a\u0004\u0018\u00010M8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0016\u0010S\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010\u001cR\u0014\u0010W\u001a\u00020T8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\"\u0010[\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010X8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0016\u0010^\u001a\u0004\u0018\u00010!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]¨\u0006`"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chart/charttracker/chart/StepChartView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "a", "F", "getOptionalZeroLineBottomPadding$ui_kit_components_release", "()F", "optionalZeroLineBottomPadding", "Law0/a7;", "value", "b", "Law0/a7;", "getXAxis", "()Law0/a7;", "setXAxis", "(Law0/a7;)V", "xAxis", "e", "Ljava/lang/Float;", "getTooltipXCoordinate$ui_kit_components_release", "()Ljava/lang/Float;", "setTooltipXCoordinate$ui_kit_components_release", "(Ljava/lang/Float;)V", "tooltipXCoordinate", "", "Lxs0/a;", "f", "Ljava/util/List;", "getChartData", "()Ljava/util/List;", "chartData", "Landroid/graphics/RectF;", "g", "Landroid/graphics/RectF;", "getBounds$ui_kit_components_release", "()Landroid/graphics/RectF;", "bounds", "Lat0/a;", "h", "Lat0/a;", "getTooltip$ui_kit_components_release", "()Lat0/a;", "tooltip", "", "m", "Z", "getShowDotOnlyWithTooltip", "()Z", "setShowDotOnlyWithTooltip", "(Z)V", "showDotOnlyWithTooltip", "n", "getScaleFactor", "setScaleFactor", "(F)V", "scaleFactor", "o", "getReadOnly", "setReadOnly", "readOnly", "getLeftMostTooltipPosition$ui_kit_components_release", "leftMostTooltipPosition", "getRightMostTooltipPosition$ui_kit_components_release", "rightMostTooltipPosition", "Lefm/i;", "", "getObserveChartItemChanges", "()Lefm/i;", "observeChartItemChanges", "Lxs0/c;", "horizontalLine", "Lxs0/c;", "setHorizontalLine", "(Lxs0/c;)V", "getZeroLineY", "zeroLineY", "Lkotlin/ranges/IntRange;", "getDisplayedRange", "()Lkotlin/ranges/IntRange;", "displayedRange", "Lkotlin/Pair;", "getDisplayedValuesRange", "()Lkotlin/Pair;", "displayedValuesRange", "getTooltipEntry", "()Lxs0/a;", "tooltipEntry", "Companion", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StepChartView extends FrameLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float optionalZeroLineBottomPadding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public a7 xAxis;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f56765c;
    public final b d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public Float tooltipXCoordinate;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final RectF bounds;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final a tooltip;
    public final ws0.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final GestureDetector f56768j;
    public final zs0.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dgm.e f56769l;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean showDotOnlyWithTooltip;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public float scaleFactor;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean readOnly;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.chart.charttracker.chart.StepChartView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StepChartView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final IntRange getDisplayedRange() {
        return new IntRange(0, v.j(this.f), 1);
    }

    private final Pair<Float, Float> getDisplayedValuesRange() {
        ArrayList arrayList = this.f;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        if (it8.hasNext()) {
            throw v0.a.e(it8);
        }
        Float fW0 = d0.w0(arrayList2);
        float fFloatValue = BitmapDescriptorFactory.HUE_RED;
        Float fValueOf = Float.valueOf(fW0 != null ? fW0.floatValue() : 0.0f);
        Float fQ0 = d0.q0(arrayList2);
        if (fQ0 != null) {
            fFloatValue = fQ0.floatValue();
        }
        return new Pair<>(fValueOf, Float.valueOf(fFloatValue));
    }

    private final xs0.a getTooltipEntry() {
        if (this.tooltipXCoordinate == null) {
            return null;
        }
        d0.b0(this.f).getClass();
        throw new ClassCastException();
    }

    private final Float getZeroLineY() {
        this.k.getClass();
        return null;
    }

    private final void setHorizontalLine(c cVar) {
    }

    public final void a(float f) {
        if (this.f.isEmpty()) {
            return;
        }
        this.tooltipXCoordinate = Float.valueOf(f.f(f, getLeftMostTooltipPosition$ui_kit_components_release(), getRightMostTooltipPosition$ui_kit_components_release()));
        a aVar = this.tooltip;
        aVar.setVisibility(0);
        getTooltipEntry();
        d dVar = d.EVENT_TOUCH;
        aVar.getVisibility();
        postInvalidateOnAnimation();
    }

    public final void b(MotionEvent e2) {
        Intrinsics.checkNotNullParameter(e2, "e2");
        getTooltipEntry();
        d dVar = d.EVENT_TOUCH;
        this.tooltip.getVisibility();
    }

    @NotNull
    /* JADX INFO: renamed from: getBounds$ui_kit_components_release, reason: from getter */
    public final RectF getBounds() {
        return this.bounds;
    }

    @NotNull
    public final List<xs0.a> getChartData() {
        return this.f;
    }

    public final float getLeftMostTooltipPosition$ui_kit_components_release() {
        return this.bounds.left + getPaddingLeft();
    }

    @NotNull
    public final i getObserveChartItemChanges() {
        return this.f56769l;
    }

    /* JADX INFO: renamed from: getOptionalZeroLineBottomPadding$ui_kit_components_release, reason: from getter */
    public final float getOptionalZeroLineBottomPadding() {
        return this.optionalZeroLineBottomPadding;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    public final float getRightMostTooltipPosition$ui_kit_components_release() {
        return this.bounds.right + getPaddingRight();
    }

    public final float getScaleFactor() {
        return this.scaleFactor;
    }

    public final boolean getShowDotOnlyWithTooltip() {
        return this.showDotOnlyWithTooltip;
    }

    @NotNull
    /* JADX INFO: renamed from: getTooltip$ui_kit_components_release, reason: from getter */
    public final a getTooltip() {
        return this.tooltip;
    }

    /* JADX INFO: renamed from: getTooltipXCoordinate$ui_kit_components_release, reason: from getter */
    public final Float getTooltipXCoordinate() {
        return this.tooltipXCoordinate;
    }

    public final a7 getXAxis() {
        return this.xAxis;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.readOnly && !this.f.isEmpty()) {
            if (event.getAction() == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (event.getAction() == 1 || event.getAction() == 3) {
                this.i.f299641c = false;
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.f56768j.onTouchEvent(event);
            return true;
        }
        return super.onTouchEvent(event);
    }

    public final void setReadOnly(boolean z) {
        this.readOnly = z;
    }

    public final void setScaleFactor(float f) {
        this.scaleFactor = f;
    }

    public final void setShowDotOnlyWithTooltip(boolean z) {
        this.showDotOnlyWithTooltip = z;
    }

    public final void setTooltipXCoordinate$ui_kit_components_release(Float f) {
        this.tooltipXCoordinate = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    public final void setXAxis(a7 a7Var) {
        b bVar = this.d;
        e eVar = this.f56765c;
        if (a7Var != null) {
            Iterator it8 = a7Var.f10233a.iterator();
            while (it8.hasNext()) {
                eVar.f(((t6) it8.next()).f10543b, bVar.f316378h);
            }
        }
        a7 a7Var2 = this.xAxis;
        if (a7Var2 != null) {
            Iterator it9 = a7Var2.f10233a.iterator();
            while (it9.hasNext()) {
                eVar.e(((t6) it9.next()).f10543b, bVar.f316378h);
            }
        }
        this.xAxis = a7Var;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StepChartView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepChartView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        kli.a.k(context, 32.0f);
        kli.a.k(context, 30.0f);
        kli.a.k(context, 6.0f);
        this.optionalZeroLineBottomPadding = kli.a.k(context, 98.0f);
        kli.a.k(context, 8.0f);
        new ArrayList();
        this.f56765c = new e(this, new wp0.b(this, 7));
        b bVar = new b(context);
        this.d = bVar;
        bVar.f316378h.getFontSpacing();
        this.f = new ArrayList();
        this.bounds = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        new Path();
        new LinkedHashMap();
        kli.a.k(context, 8.0f);
        kli.a.k(context, 4.0f);
        ws0.a aVar = new ws0.a(this);
        this.i = aVar;
        this.f56768j = new GestureDetector(context, aVar);
        this.k = new zs0.a();
        dgm.e eVar = new dgm.e();
        Intrinsics.checkNotNullExpressionValue(eVar, "create(...)");
        this.f56769l = eVar;
        new Matrix();
        new Canvas();
        a aVar2 = new a(context, null, 6, 0);
        aVar2.setVisibility(4);
        aVar2.setZ(2.0f);
        this.tooltip = aVar2;
        addView(aVar2);
        setWillNotDraw(false);
        this.scaleFactor = 0.85f;
    }

    public /* synthetic */ StepChartView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
