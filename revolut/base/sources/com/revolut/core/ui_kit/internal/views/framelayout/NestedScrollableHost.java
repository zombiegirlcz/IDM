package com.revolut.core.ui_kit.internal.views.framelayout;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.revolut.core.ui_kit.internal.recycler.layout_manager.LimitedLinesLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nmm.h;
import nt0.a;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/framelayout/NestedScrollableHost;", "Lnt0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "o", "Lkotlin/Lazy;", "getScrollableChild", "()Landroid/view/View;", "scrollableChild", "getChildOrientation", "()Ljava/lang/Integer;", "childOrientation", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NestedScrollableHost extends a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f57089s = 0;
    public final Rect i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f57090j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f57091l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MotionEvent f57092m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ViewGroup f57093n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f57094p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f57095q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f57096r;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Integer d(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        return layoutManager instanceof GridLayoutManager ? Integer.valueOf(((GridLayoutManager) layoutManager).getOrientation()) : layoutManager instanceof LinearLayoutManager ? Integer.valueOf(((LinearLayoutManager) layoutManager).getOrientation()) : layoutManager instanceof StaggeredGridLayoutManager ? Integer.valueOf(((StaggeredGridLayoutManager) layoutManager).getOrientation()) : layoutManager instanceof LimitedLinesLayoutManager ? 0 : null;
    }

    private final Integer getChildOrientation() {
        View scrollableChild = getScrollableChild();
        return scrollableChild instanceof RecyclerView ? d((RecyclerView) scrollableChild) : scrollableChild instanceof HorizontalScrollView ? 0 : null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final View getScrollableChild() {
        return (View) this.o.getValue();
    }

    public final void c(MotionEvent motionEvent) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        ViewGroup viewGroup = this.f57093n;
        if (this.k && viewGroup != null) {
            this.f57090j = true;
            Rect rect = this.i;
            rect.setEmpty();
            viewGroup.offsetDescendantRectToMyCoords(this, rect);
            motionEvent.offsetLocation(rect.left, rect.top);
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            viewGroup.dispatchTouchEvent(motionEventObtain);
            viewGroup.dispatchTouchEvent(motionEvent);
            motionEventObtain.recycle();
            this.f57090j = false;
        }
        MotionEvent motionEvent2 = this.f57092m;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.f57092m = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f57093n = null;
        this.f57091l = false;
        this.k = false;
        MotionEvent motionEvent = this.f57092m;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.f57092m = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x001c, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fa  */
    @Override // nt0.a, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.framelayout.NestedScrollableHost.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollableHost(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.i = new Rect();
        this.o = w.y0(new h(this, 19));
        this.f57094p = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public /* synthetic */ NestedScrollableHost(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
