package com.revolut.core.ui_kit.internal.views.swipelayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import av0.a;
import av0.b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import ifm.c;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jo0.m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vrl.i0;
import vrl.v0;
import vu0.o;
import vu0.p;
import vu0.r;
import vu0.s;
import vu0.t;
import vu0.u;
import wu0.d;
import xu0.g;
import zu0.e;
import zu0.i;
import zu0.n;
import zu0.q;
import zu0.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 {2\u00020\u0001:\u0005\n|D&\u001eB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u001a\u001a\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\b\u0002\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001c\u0010\u001dR*\u0010$\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00108\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R6\u00104\u001a\u0016\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R6\u00108\u001a\u0016\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010/\u001a\u0004\b6\u00101\"\u0004\b7\u00103R\"\u0010?\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR*\u0010K\u001a\u00020D2\u0006\u0010\u000b\u001a\u00020D8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR \u0010R\u001a\u00020L8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bM\u0010N\u0012\u0004\bQ\u0010\u001d\u001a\u0004\bO\u0010PR\u001a\u0010X\u001a\u00020S8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\u001a\u0010^\u001a\u00020Y8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010d\u001a\u00020_8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u001a\u0010j\u001a\u00020e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001a\u0010p\u001a\u00020k8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u001a\u0010v\u001a\u00020q8\u0000X\u0080\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR\u0011\u0010z\u001a\u00020w8F¢\u0006\u0006\u001a\u0004\bx\u0010y¨\u0006}"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/swipelayout/SwipeToActionLayout;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lvu0/s;", "value", "", "setDragDirection$ui_kit_components_release", "(Lvu0/s;)V", "setDragDirection", "", "left", "right", "setSwipeAreas$ui_kit_components_release", "(FF)V", "setSwipeAreas", "", "Lcom/revolut/core/ui_kit/delegates/SwipeToActionDelegate$SwipeAction;", "swipeActions", "dragDirection", "setItems", "(Ljava/util/List;Lvu0/s;)V", "setPendingItems", "()V", "a", "F", "getThresholdToOpenView", "()F", "setThresholdToOpenView", "(F)V", "thresholdToOpenView", "", "Lvu0/t;", "b", "Ljava/util/Set;", "getOnSwipeListeners$ui_kit_components_release", "()Ljava/util/Set;", "onSwipeListeners", "Lkotlin/Function2;", "Landroid/view/View;", "c", "Lkotlin/jvm/functions/Function2;", "getOnActionClickListener", "()Lkotlin/jvm/functions/Function2;", "setOnActionClickListener", "(Lkotlin/jvm/functions/Function2;)V", "onActionClickListener", "d", "getOnLongSwipeTriggered", "setOnLongSwipeTriggered", "onLongSwipeTriggered", "e", "Landroid/view/View;", "getMainView", "()Landroid/view/View;", "setMainView", "(Landroid/view/View;)V", "mainView", "f", "Lvu0/s;", "getDragDirection$ui_kit_components_release", "()Lvu0/s;", "Lvu0/u;", "h", "Lvu0/u;", "getState$ui_kit_components_release", "()Lvu0/u;", "setState$ui_kit_components_release", "(Lvu0/u;)V", "state", "Lxu0/g;", "i", "Lxu0/g;", "getTouchController$ui_kit_components_release", "()Lxu0/g;", "getTouchController$ui_kit_components_release$annotations", "touchController", "Lyu0/c;", "j", "Lyu0/c;", "getItemController$ui_kit_components_release", "()Lyu0/c;", "itemController", "Lzu0/i;", "k", "Lzu0/i;", "getLayoutStrategy$ui_kit_components_release", "()Lzu0/i;", "layoutStrategy", "Lzu0/e;", "l", "Lzu0/e;", "getLayoutController$ui_kit_components_release", "()Lzu0/e;", "layoutController", "Lwu0/d;", "m", "Lwu0/d;", "getDemoController$ui_kit_components_release", "()Lwu0/d;", "demoController", "Landroid/os/Handler;", "o", "Landroid/os/Handler;", "getMainHandler$ui_kit_components_release", "()Landroid/os/Handler;", "mainHandler", "Lvu0/i;", "p", "Lvu0/i;", "getAppearance$ui_kit_components_release", "()Lvu0/i;", "appearance", "", "getClickAvailable", "()Z", "clickAvailable", "Companion", "vu0/r", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwipeToActionLayout extends ViewGroup {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public float thresholdToOpenView;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f57614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Function2 onActionClickListener;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public Function2 onLongSwipeTriggered;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public View mainView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public s dragDirection;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f57616g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public u state;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final g touchController;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final yu0.c itemController;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final i layoutStrategy;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final e layoutController;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public final d demoController;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b f57621n;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final Handler mainHandler;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final vu0.i appearance;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipeToActionLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getTouchController$ui_kit_components_release$annotations() {
    }

    public static /* synthetic */ void setItems$default(SwipeToActionLayout swipeToActionLayout, List list, s sVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            sVar = s.BOTH;
        }
        swipeToActionLayout.setItems(list, sVar);
    }

    public final void a(boolean z) {
        b bVar = this.f57621n;
        g gVar = (g) bVar.e;
        ViewDragHelper viewDragHelper = gVar.f308870n;
        e eVar = (e) bVar.f9868c;
        Rect rect = eVar.f325197c;
        SwipeToActionLayout swipeToActionLayout = (SwipeToActionLayout) bVar.f9867b;
        u state = swipeToActionLayout.getState();
        u uVar = u.CLOSING;
        if (state == uVar || swipeToActionLayout.getMainView().getLeft() == rect.left) {
            return;
        }
        if (z && m.f176851h) {
            swipeToActionLayout.setState$ui_kit_components_release(uVar);
            View view = swipeToActionLayout.getMainView();
            int i = rect.left;
            int i2 = rect.top;
            Intrinsics.checkNotNullParameter(view, "view");
            viewDragHelper.smoothSlideViewTo(view, i, i2);
        } else {
            swipeToActionLayout.setState$ui_kit_components_release(u.CLOSE);
            viewDragHelper.abort();
            int i3 = rect.left;
            eVar.f325195a.getMainView().layout(i3, rect.top, rect.width() + i3, rect.bottom);
            eVar.e();
            View view2 = swipeToActionLayout.getMainView();
            Intrinsics.checkNotNullParameter(view2, "view");
            gVar.f308869m.onViewPositionChanged(view2, view2.getLeft(), view2.getTop(), 0, 0);
        }
        ViewCompat.postInvalidateOnAnimation(swipeToActionLayout);
    }

    public final void b(o item, SwipeToActionDelegate.SwipeAction action, Function2 function2) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(action, "action");
        this.demoController.a();
        c cVar = this.f57616g;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f57616g = null;
        item.b0();
        if (function2 != null) {
            function2.invoke(item.getView(), action);
        }
        this.f57616g = item.R().doOnNext(new v0(18, new p(this, 0))).filter(new v0(19, new i0(15))).take(1L).subscribe(new v0(20, new p(this, 1)));
    }

    public final void c(boolean z, s direction) {
        r rVar;
        Intrinsics.checkNotNullParameter(direction, "direction");
        b bVar = this.f57621n;
        boolean z3 = bVar.f9866a;
        Intrinsics.checkNotNullParameter(direction, "direction");
        ((yu0.c) bVar.d).b();
        SwipeToActionLayout swipeToActionLayout = (SwipeToActionLayout) bVar.f9867b;
        if (swipeToActionLayout.getState() == u.OPEN || swipeToActionLayout.getState() == u.OPENING) {
            return;
        }
        int i = a.f9865a[direction.ordinal()];
        if (i == 1) {
            rVar = z3 ? r.END_TO_START : r.START_TO_END;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            rVar = z3 ? r.START_TO_END : r.END_TO_START;
        }
        bVar.e(z, rVar);
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.touchController.f308870n.continueSettling(true)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        g gVar = this.touchController;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        gVar.f308871p.d(event);
        SwipeToActionLayout swipeToActionLayout = gVar.f308862a;
        Intrinsics.checkNotNullParameter(event, "event");
        return super.dispatchTouchEvent(event);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View itemView, long j2) {
        boolean zIntersects;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(itemView, "child");
        v vVar = this.layoutController.f;
        n nVar = vVar != null ? vVar.f325216b : null;
        if (this.appearance == vu0.i.CIRCLE && (itemView instanceof o) && nVar != null) {
            v vVar2 = nVar.e;
            RectF rectF = nVar.f325208c;
            RectF rectF2 = nVar.d;
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            if (vVar2.e == null) {
                zIntersects = false;
            } else {
                rectF.set(vVar2.d.getBounds());
                rectF.offset(r5.getLeft(), r5.getTop());
                rectF2.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, itemView.getWidth(), itemView.getHeight());
                itemView.getMatrix().mapRect(rectF2);
                rectF2.offset(itemView.getLeft(), itemView.getTop());
                zIntersects = RectF.intersects(rectF, rectF2);
            }
            if (zIntersects) {
                int iSave = canvas.save();
                Path path = nVar.f325207b;
                Intrinsics.checkNotNullParameter(canvas, "canvas");
                if (vVar2.e != null) {
                    rectF.set(vVar2.d.getBounds());
                    rectF.offset(r0.getLeft(), r0.getTop());
                    path.rewind();
                    float f = nVar.f325206a;
                    path.addRoundRect(rectF, f, f, Path.Direction.CW);
                    canvas.clipOutPath(path);
                }
                boolean zDrawChild = super.drawChild(canvas, itemView, j2);
                canvas.restoreToCount(iSave);
                return zDrawChild;
            }
        }
        return super.drawChild(canvas, itemView, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: getAppearance$ui_kit_components_release, reason: from getter */
    public final vu0.i getAppearance() {
        return this.appearance;
    }

    public final boolean getClickAvailable() {
        u uVar = this.state;
        return (uVar == u.OPENING || uVar == u.CLOSE || uVar == u.CLOSING_MANUALLY) ? false : true;
    }

    @NotNull
    /* JADX INFO: renamed from: getDemoController$ui_kit_components_release, reason: from getter */
    public final d getDemoController() {
        return this.demoController;
    }

    @NotNull
    /* JADX INFO: renamed from: getDragDirection$ui_kit_components_release, reason: from getter */
    public final s getDragDirection() {
        return this.dragDirection;
    }

    @NotNull
    /* JADX INFO: renamed from: getItemController$ui_kit_components_release, reason: from getter */
    public final yu0.c getItemController() {
        return this.itemController;
    }

    @NotNull
    /* JADX INFO: renamed from: getLayoutController$ui_kit_components_release, reason: from getter */
    public final e getLayoutController() {
        return this.layoutController;
    }

    @NotNull
    /* JADX INFO: renamed from: getLayoutStrategy$ui_kit_components_release, reason: from getter */
    public final i getLayoutStrategy() {
        return this.layoutStrategy;
    }

    @NotNull
    /* JADX INFO: renamed from: getMainHandler$ui_kit_components_release, reason: from getter */
    public final Handler getMainHandler() {
        return this.mainHandler;
    }

    @NotNull
    public final View getMainView() {
        View view = this.mainView;
        if (view != null) {
            return view;
        }
        Intrinsics.r("mainView");
        throw null;
    }

    public final Function2<View, SwipeToActionDelegate.SwipeAction, Unit> getOnActionClickListener() {
        return this.onActionClickListener;
    }

    public final Function2<View, SwipeToActionDelegate.SwipeAction, Unit> getOnLongSwipeTriggered() {
        return this.onLongSwipeTriggered;
    }

    @NotNull
    public final Set<t> getOnSwipeListeners$ui_kit_components_release() {
        return this.f57614b;
    }

    @NotNull
    /* JADX INFO: renamed from: getState$ui_kit_components_release, reason: from getter */
    public final u getState() {
        return this.state;
    }

    public final float getThresholdToOpenView() {
        return this.thresholdToOpenView;
    }

    @NotNull
    /* JADX INFO: renamed from: getTouchController$ui_kit_components_release, reason: from getter */
    public final g getTouchController() {
        return this.touchController;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f57616g;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f57616g = null;
        this.touchController.d();
        v vVar = this.layoutController.f;
        if (vVar != null) {
            vVar.d(zu0.p.f325209a);
        }
        this.demoController.a();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "ev");
        g gVar = this.touchController;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        return gVar.c(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        int i6 = i3 - i;
        int i21 = i5 - i2;
        e eVar = this.layoutController;
        eVar.f325196b.c(i6, i21);
        SwipeToActionLayout swipeToActionLayout = eVar.f325195a;
        if (swipeToActionLayout.getState() != u.CLOSE) {
            View mainView = swipeToActionLayout.getMainView();
            int i22 = eVar.d;
            mainView.layout(i22, 0, i22 + i6, i21);
        } else {
            swipeToActionLayout.getMainView().layout(0, 0, i6, i21);
        }
        eVar.f325197c.set(0, 0, i6, i21);
        eVar.a();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        e eVar = this.layoutController;
        SwipeToActionLayout swipeToActionLayout = eVar.f325195a;
        swipeToActionLayout.getMainView().measure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int measuredHeight = swipeToActionLayout.getMainView().getMeasuredHeight();
        eVar.f325196b.b(size, measuredHeight);
        swipeToActionLayout.setMeasuredDimension(size, measuredHeight);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        g gVar = this.touchController;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 0) {
            return true;
        }
        gVar.c(event);
        return true;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view == null || (view instanceof o)) {
            return;
        }
        setMainView(view);
        e eVar = this.layoutController;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(view, "mainView");
        v vVar = eVar.f;
        if (vVar != null) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (vVar.e != view) {
                vVar.d(zu0.p.f325209a);
                vVar.e = view;
            }
        }
        g gVar = this.touchController;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        gVar.f308871p.f292140h = view;
    }

    public final void setDragDirection$ui_kit_components_release(@NotNull s value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.dragDirection = value;
    }

    public final void setItems(@NotNull List<SwipeToActionDelegate.SwipeAction> swipeActions, @NotNull s dragDirection) {
        Intrinsics.checkNotNullParameter(swipeActions, "swipeActions");
        Intrinsics.checkNotNullParameter(dragDirection, "dragDirection");
        yu0.c cVar = this.itemController;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(swipeActions, "swipeActions");
        Intrinsics.checkNotNullParameter(dragDirection, "dragDirection");
        cVar.f316858h = swipeActions;
        cVar.i = dragDirection;
        if (cVar.f316854a.getState() != u.CLOSE) {
            cVar.b();
        }
    }

    public final void setMainView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.mainView = view;
    }

    public final void setOnActionClickListener(Function2<? super View, ? super SwipeToActionDelegate.SwipeAction, Unit> function2) {
        this.onActionClickListener = function2;
    }

    public final void setOnLongSwipeTriggered(Function2<? super View, ? super SwipeToActionDelegate.SwipeAction, Unit> function2) {
        this.onLongSwipeTriggered = function2;
    }

    public final void setPendingItems() {
        this.itemController.b();
    }

    public final void setState$ui_kit_components_release(@NotNull u newValue) {
        int iB;
        Intrinsics.checkNotNullParameter(newValue, "value");
        u oldValue = this.state;
        if (newValue != oldValue) {
            g gVar = this.touchController;
            gVar.getClass();
            Intrinsics.checkNotNullParameter(newValue, "newValue");
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
            u uVar = u.CLOSING;
            gVar.e = newValue == uVar || newValue == u.OPENING;
            u uVar2 = u.CLOSE;
            if (newValue == uVar2) {
                gVar.d();
            }
            e eVar = this.layoutController;
            v vVar = eVar.f;
            Intrinsics.checkNotNullParameter(newValue, "newValue");
            Intrinsics.checkNotNullParameter(oldValue, "oldValue");
            if (newValue == uVar) {
                if (vVar != null && (iB = eVar.b()) > 0) {
                    zu0.u uVar3 = vVar.f325217c;
                    if (!(uVar3 instanceof zu0.p)) {
                        if (!(uVar3 instanceof zu0.s) && !(uVar3 instanceof zu0.t) && !(uVar3 instanceof zu0.r) && !(uVar3 instanceof q)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        vVar.d(new q(vVar.d.getAlpha(), iB));
                    }
                }
            } else if (oldValue == uVar && newValue != uVar2 && vVar != null) {
                vVar.e();
            }
            eVar.f325196b.e(newValue, oldValue);
        }
        this.state = newValue;
    }

    public final void setSwipeAreas$ui_kit_components_release(float left, float right) {
        g gVar = this.touchController;
        gVar.k = left;
        gVar.f308868l = right;
    }

    public final void setThresholdToOpenView(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
            throw new IllegalStateException("Threshold cannot be outside of 0..1 range");
        }
        this.thresholdToOpenView = f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SwipeToActionLayout(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, kotlin.Lazy] */
    public SwipeToActionLayout(@NotNull Context context, AttributeSet attributeSet, int i) {
        vu0.i iVar;
        i mVar;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        boolean zK = jh.d.k(context);
        this.thresholdToOpenView = 0.5f;
        this.f57614b = new LinkedHashSet();
        this.dragDirection = s.BOTH;
        this.state = u.CLOSE;
        Handler handler = new Handler(Looper.getMainLooper());
        this.mainHandler = handler;
        if (((Boolean) jo0.g.O.getValue()).booleanValue()) {
            iVar = vu0.i.CIRCLE;
        } else {
            iVar = vu0.i.LEGACY;
        }
        this.appearance = iVar;
        yu0.c cVar = new yu0.c(this, new vh9.b(this, 25), zK);
        this.itemController = cVar;
        int i2 = vu0.v.f292177a[iVar.ordinal()];
        if (i2 == 1) {
            mVar = new zu0.m(this, cVar);
        } else if (i2 == 2) {
            mVar = new zu0.b(this, cVar);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.layoutStrategy = mVar;
        e eVar = new e(this, mVar, iVar == vu0.i.CIRCLE);
        this.layoutController = eVar;
        g gVar = new g(this, eVar, cVar, handler);
        this.touchController = gVar;
        this.f57621n = new b(this, eVar, cVar, gVar, zK);
        this.demoController = new d(this, handler);
    }

    public /* synthetic */ SwipeToActionLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
