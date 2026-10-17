package com.revolut.core.ui_kit.internal.views.order_book;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.PopupWindow;
import aw0.m8;
import aw0.n8;
import aw0.o8;
import aw0.p8;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.TooltipView;
import cp7.k;
import du0.f;
import eu0.a;
import eu0.b;
import eu0.d;
import eu0.h;
import ip0.kz;
import ir0.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qw0.e;
import te0.w;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0017\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 R.\u0010*\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\"8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R0\u00102\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020\f0+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/order_book/OrderBookChartView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Law0/m8;", "model", "", "setModel", "(Law0/m8;)V", "Lip0/kz;", "tooltipCalculator", "setTooltipCalculator", "(Lip0/kz;)V", "b", "Lkotlin/Lazy;", "getTooltipOffsetFromPointer", "()I", "tooltipOffsetFromPointer", "Lcom/revolut/core/ui_kit/internal/views/TooltipView;", "c", "getTooltip", "()Lcom/revolut/core/ui_kit/internal/views/TooltipView;", "tooltip", "Landroid/widget/PopupWindow;", "d", "getTooltipPopup", "()Landroid/widget/PopupWindow;", "tooltipPopup", "Leu0/h;", "value", "e", "Leu0/h;", "getCurrentTooltip", "()Leu0/h;", "setCurrentTooltip", "(Leu0/h;)V", "currentTooltip", "Lkotlin/Function1;", "f", "Lkotlin/jvm/functions/Function1;", "getSelectedTooltipChangedListener", "()Lkotlin/jvm/functions/Function1;", "setSelectedTooltipChangedListener", "(Lkotlin/jvm/functions/Function1;)V", "selectedTooltipChangedListener", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderBookChartView extends View {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f57430g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f57431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f57432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f57433c;
    public final Object d;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public h currentTooltip;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Function1 selectedTooltipChangedListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderBookChartView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static PopupWindow a(Context context, OrderBookChartView orderBookChartView) {
        PopupWindow popupWindow = new PopupWindow(context);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setContentView(orderBookChartView.getTooltip());
        return popupWindow;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TooltipView getTooltip() {
        return (TooltipView) this.f57433c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getTooltipOffsetFromPointer() {
        return ((Number) this.f57432b.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final PopupWindow getTooltipPopup() {
        return (PopupWindow) this.d.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Float r10) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.order_book.OrderBookChartView.b(java.lang.Float):void");
    }

    public final void c(h hVar) {
        eu0.f fVar;
        if (((hVar == null || (fVar = hVar.f129462c) == null) ? null : fVar.f129459c) == null) {
            getTooltipPopup().dismiss();
            return;
        }
        o8 o8Var = hVar.f129462c.f129459c;
        if (!(o8Var instanceof n8)) {
            throw new NoWhenBranchMatchedException();
        }
        List<? extends e> list = ((n8) o8Var).f10439a;
        int i = (int) hVar.f129460a;
        getTooltip().setData(list);
        getTooltip().measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), 0);
        int measuredWidth = (i - getTooltip().getMeasuredWidth()) - getTooltipOffsetFromPointer();
        int tooltipOffsetFromPointer = i + getTooltipOffsetFromPointer();
        if (measuredWidth < 0) {
            measuredWidth = tooltipOffsetFromPointer;
        }
        int measuredHeight = (getMeasuredHeight() / 2) - (getTooltip().getMeasuredHeight() / 2);
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        Point point = new Point(iArr[0] + measuredWidth, iArr[1] + measuredHeight);
        if (getTooltipPopup().isShowing()) {
            getTooltipPopup().update(point.x, point.y, getTooltip().getMeasuredWidth(), getTooltip().getMeasuredHeight());
        } else {
            getTooltipPopup().showAtLocation(this, 0, point.x, point.y);
        }
    }

    public final h getCurrentTooltip() {
        return this.currentTooltip;
    }

    @NotNull
    public final Function1<h, Unit> getSelectedTooltipChangedListener() {
        return this.selectedTooltipChangedListener;
    }

    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (canvas.getHeight() == 0 || canvas.getWidth() == 0) {
            return;
        }
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        h hVar = this.currentTooltip;
        Float fValueOf = hVar != null ? Float.valueOf(hVar.f129460a) : null;
        f fVar = this.f57431a;
        ir0.e eVar = fVar.f117524q;
        g gVar = fVar.f117523p;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float f = paddingStart;
        float f4 = fVar.f117516c;
        int iSave = canvas.save();
        canvas.translate(f + f4, paddingTop + f4);
        try {
            Path path = fVar.L;
            if (path != null) {
                canvas.drawPath(path, (Paint) fVar.f117527t.getValue());
            }
            float f5 = fVar.A;
            float f6 = fVar.z;
            int iSave2 = canvas.save();
            canvas.clipRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f5, f6);
            try {
                Path path2 = fVar.I;
                if (path2 != null) {
                    canvas.drawPath(path2, (Paint) fVar.f117525r.getValue());
                }
                Path path3 = fVar.K;
                if (path3 != null) {
                    canvas.drawPath(path3, (Paint) fVar.f117526s.getValue());
                }
                canvas.restoreToCount(iSave2);
                float f32 = -f4;
                float f35 = fVar.A + f4;
                float f36 = fVar.z + f4;
                iSave2 = canvas.save();
                canvas.clipRect(f32, f32, f35, f36);
                try {
                    Path path4 = fVar.H;
                    if (path4 != null) {
                        gVar.d(fVar.i);
                        eVar.b(canvas, path4, fValueOf);
                    }
                    Path path5 = fVar.J;
                    if (path5 != null) {
                        gVar.d(fVar.k);
                        eVar.b(canvas, path5, fValueOf);
                    }
                    canvas.restoreToCount(iSave2);
                    fVar.a(canvas);
                    if (fValueOf != null) {
                        float f37 = kotlin.ranges.f.f(fValueOf.floatValue() - f4, BitmapDescriptorFactory.HUE_RED, fVar.A);
                        canvas.drawLine(f37, BitmapDescriptorFactory.HUE_RED, f37, fVar.z, (Paint) fVar.v.getValue());
                    }
                    canvas.restoreToCount(iSave);
                } finally {
                }
            } finally {
            }
        } catch (Throwable th10) {
            canvas.restoreToCount(iSave);
            throw th10;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        this.f57431a.e(i, i2, getPaddingEnd() + getPaddingStart(), getPaddingBottom() + getPaddingTop());
        b(null);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if ((numValueOf != null && numValueOf.intValue() == 0) || (numValueOf != null && numValueOf.intValue() == 2)) {
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            b(Float.valueOf(motionEvent.getX()));
            return true;
        }
        if ((numValueOf == null || numValueOf.intValue() != 1) && (numValueOf == null || numValueOf.intValue() != 3)) {
            return super.onTouchEvent(motionEvent);
        }
        ViewParent parent2 = getParent();
        if (parent2 != null) {
            parent2.requestDisallowInterceptTouchEvent(false);
        }
        b(null);
        return true;
    }

    public final void setCurrentTooltip(h hVar) {
        this.currentTooltip = hVar;
        c(hVar);
        invalidate();
    }

    public final void setModel(@NotNull m8 model) {
        float fMax;
        Intrinsics.checkNotNullParameter(model, "model");
        a aVar = b.Companion;
        b bVar = this.f57431a.M;
        k runIfNew = new k(this, 23);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(runIfNew, "runIfNew");
        List list = model.f10426a;
        float f = model.f10428c;
        List listP0 = d0.P0(list, new eu0.e());
        List listP02 = d0.P0(model.f10427b, new d());
        if (Intrinsics.f(bVar != null ? bVar.f129450a : null, listP0)) {
            Intrinsics.f(bVar.f129451b, listP02);
        }
        if (listP0.size() == 1 && listP02.isEmpty()) {
            fMax = f;
        } else {
            int size = listP0.size();
            float fAbs = BitmapDescriptorFactory.HUE_RED;
            float fMax2 = Math.max(size >= 2 ? Math.abs(((p8) d0.m0(listP0)).f10471a - ((p8) a0.d.e(2, listP0)).f10471a) : 0.0f, listP02.size() >= 2 ? Math.abs(((p8) d0.m0(listP02)).f10471a - ((p8) a0.d.e(2, listP02)).f10471a) : 0.0f);
            p8 p8Var = (p8) d0.o0(listP0);
            float fAbs2 = p8Var != null ? Math.abs(f - p8Var.f10471a) : 0.0f;
            p8 p8Var2 = (p8) d0.o0(listP02);
            if (p8Var2 != null) {
                fAbs = Math.abs(p8Var2.f10471a - f);
            }
            fMax = Math.max(fAbs2, fAbs) + fMax2;
        }
        runIfNew.invoke(new b(qk.d.c(listP0, eu0.g.BID, f, fMax), qk.d.c(listP02, eu0.g.ASK, f, fMax), f, fMax));
    }

    public final void setSelectedTooltipChangedListener(@NotNull Function1<? super h, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.selectedTooltipChangedListener = function1;
    }

    public final void setTooltipCalculator(@NotNull kz tooltipCalculator) {
        Intrinsics.checkNotNullParameter(tooltipCalculator, "tooltipCalculator");
        c(this.currentTooltip);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderBookChartView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderBookChartView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f57431a = new f(this);
        this.f57432b = w.y0(new b0.b(context, 7));
        this.f57433c = w.y0(new b0.b(context, 8));
        this.d = w.y0(new cf6.a(context, this, 25));
        this.selectedTooltipChangedListener = new cs.a(13);
    }

    public /* synthetic */ OrderBookChartView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
