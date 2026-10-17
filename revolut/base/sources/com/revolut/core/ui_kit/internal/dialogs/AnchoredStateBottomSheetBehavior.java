package com.revolut.core.ui_kit.internal.dialogs;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.os.ParcelableCompat;
import androidx.core.os.ParcelableCompatCreatorCallbacks;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.R;
import gq0.f;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u0000 \u000b*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0006\f\r\u000e\u000e\u000f\u0010B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/revolut/core/ui_kit/internal/dialogs/AnchoredStateBottomSheetBehavior;", "Landroid/view/View;", "V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "cr0/a", "b", "cr0/b", "SavedState", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class AnchoredStateBottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public int A;
    public int B;
    public cr0.b C;
    public cr0.b D;
    public final f E;
    public final cr0.c F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f55881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f55882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f55883c;
    public boolean d;
    public boolean e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f55884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f55885h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewDragHelper f55886j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f55887l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f55888m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public WeakReference f55889n;
    public WeakReference o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CopyOnWriteArrayList f55890p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f55891q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f55892r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f55893s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f55894t;
    public Integer u;
    public final float v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f55895w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f55896x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f55897y;
    public int z;

    public static abstract class b implements cr0.a {
        @Override // cr0.a
        public void a(View bottomSheet, int i, int i2) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }

        @Override // cr0.a
        public void b(int i) {
        }

        @Override // cr0.a
        public void onSlide(View bottomSheet, float f) {
            Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        }
    }

    public AnchoredStateBottomSheetBehavior() {
        this.f55881a = true;
        this.f55883c = true;
        this.i = 4;
        this.f55890p = new CopyOnWriteArrayList();
        this.u = 0;
        this.z = 500;
        this.E = new f();
        this.F = new cr0.c(this);
    }

    public static View b(View view) {
        if (view instanceof NestedScrollingChild) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            View viewB = b(childAt);
            if (viewB != null) {
                return viewB;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (((r11 * 0.2f) + r9) < r10) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r9, float r10, float r11, int[] r12) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.dialogs.AnchoredStateBottomSheetBehavior.a(android.view.View, float, float, int[]):void");
    }

    public final void c(int i) {
        WeakReference weakReference = this.f55889n;
        if ((weakReference != null ? (View) weakReference.get() : null) != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f55890p;
            int size = copyOnWriteArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((cr0.a) copyOnWriteArrayList.get(i2)).b(i);
            }
        }
    }

    public final boolean d(MotionEvent motionEvent, View view) {
        Intrinsics.h(view);
        if (!view.isShown() || !this.f55881a) {
            return false;
        }
        int actionMasked = MotionEventCompat.getActionMasked(motionEvent);
        if (this.i == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper = this.f55886j;
        if (viewDragHelper != null) {
            viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 2 && !this.k) {
            float fAbs = Math.abs(this.f55893s - motionEvent.getY());
            Intrinsics.h(this.f55886j);
            if (fAbs > r1.getTouchSlop()) {
                ViewDragHelper viewDragHelper2 = this.f55886j;
                Intrinsics.h(viewDragHelper2);
                viewDragHelper2.captureChildView(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.k;
    }

    public void dispatchOnSlide(int i) {
        float f;
        float f4;
        WeakReference weakReference = this.f55889n;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            int i2 = this.B;
            if (i > i2) {
                f = i2 - i;
                f4 = this.f55888m - i2;
            } else {
                f = i2 - i;
                f4 = i2 - this.A;
            }
            float f5 = f / f4;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f55890p;
            int size = copyOnWriteArrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((cr0.a) copyOnWriteArrayList.get(i3)).onSlide(view, f5);
            }
        }
    }

    public final void e(int i, View view) {
        cr0.b bVar = this.C;
        if (bVar != null) {
            bVar.f178087a = true;
        }
        cr0.b bVar2 = new cr0.b(this, view, i, 0);
        view.postOnAnimation(bVar2);
        this.C = bVar2;
    }

    public final void f(int i) {
        if (this.z == i) {
            return;
        }
        this.z = i;
        if (this.e) {
            this.A = i;
        }
        Object obj2 = this.D;
        if (obj2 == null) {
            obj2 = -1;
        }
        if (obj2.equals(-1) || obj2.equals(6)) {
            cr0.b bVar = this.C;
            int i2 = bVar != null ? bVar.d : -1;
            if (this.i == 6 || i2 == 6) {
                h(2);
                g(6, false);
            }
        }
    }

    public final void g(int i, boolean z) {
        if (i == this.i) {
            return;
        }
        this.f = this.f || z;
        WeakReference weakReference = this.f55889n;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            if (i == 3 || i == 4 || i == 5 || i == 6) {
                this.f55884g = this.f;
                this.i = i;
                return;
            }
            return;
        }
        if (this.f) {
            cr0.b bVar = this.D;
            if (bVar != null) {
                bVar.f178087a = true;
            }
            cr0.b bVar2 = this.C;
            if (bVar2 != null) {
                bVar2.f178087a = true;
            }
            ViewDragHelper viewDragHelper = this.f55886j;
            if (viewDragHelper != null) {
                viewDragHelper.cancel();
            }
            h(i);
            return;
        }
        cr0.b bVar3 = this.D;
        if (bVar3 != null) {
            bVar3.f178087a = true;
        }
        if (!this.f55885h && (view.getParent() == null || !view.getParent().isLayoutRequested() || !view.isAttachedToWindow())) {
            i(i, view);
            return;
        }
        cr0.b bVar4 = new cr0.b(this, view, i, 1);
        view.post(bVar4);
        this.D = bVar4;
    }

    public final void h(int i) {
        int i2 = this.i;
        if (i2 == i) {
            return;
        }
        this.f55884g = this.f;
        this.i = i;
        WeakReference weakReference = this.f55889n;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            Iterator it8 = this.f55890p.iterator();
            while (it8.hasNext()) {
                ((cr0.a) it8.next()).a(view, i2, i);
            }
        }
        if (view == null || !view.isAttachedToWindow()) {
            return;
        }
        f fVar = this.E;
        if (i != 3) {
            if (i == 4 || i == 5) {
                fVar.a(false);
                return;
            } else if (i != 6) {
                return;
            }
        }
        fVar.a(true);
    }

    public final void i(int i, View view) {
        int i2;
        if (i == 3) {
            i2 = this.A;
        } else if (i == 4) {
            i2 = this.B;
        } else if (i == 5) {
            i2 = this.f55888m;
        } else {
            if (i != 6) {
                throw new IllegalArgumentException(a0.d.n("Illegal state argument: ", i));
            }
            i2 = this.z;
            int i3 = this.A;
            if (i2 <= i3) {
                i = 3;
                i2 = i3;
            }
        }
        h(2);
        c(i);
        ViewDragHelper viewDragHelper = this.f55886j;
        if (viewDragHelper == null || !viewDragHelper.smoothSlideViewTo(view, view.getLeft(), i2)) {
            return;
        }
        e(i, view);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onInterceptTouchEvent(CoordinatorLayout parent, View child, MotionEvent event) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(event, "event");
        if (!child.isShown() || !this.f55881a) {
            this.k = true;
            return false;
        }
        int action = event.getAction();
        if (action == 0) {
            int x3 = (int) event.getX();
            this.f55893s = (int) event.getY();
            WeakReference weakReference = this.o;
            Intrinsics.h(weakReference);
            View view = (View) weakReference.get();
            if (view != null && parent.isPointInChildBounds(view, x3, this.f55893s)) {
                this.f55894t = true;
            }
            this.k = !parent.isPointInChildBounds(child, x3, this.f55893s);
        } else if (action == 1 || action == 3) {
            this.f55894t = false;
            if (this.k) {
                this.k = false;
                return false;
            }
        }
        if (!this.k) {
            ViewDragHelper viewDragHelper = this.f55886j;
            Intrinsics.h(viewDragHelper);
            if (viewDragHelper.shouldInterceptTouchEvent(event)) {
                return true;
            }
        }
        WeakReference weakReference2 = this.o;
        Intrinsics.h(weakReference2);
        View view2 = (View) weakReference2.get();
        if (action == 2 && view2 != null && !this.k && this.i != 1 && !parent.isPointInChildBounds(view2, (int) event.getX(), (int) event.getY())) {
            float fAbs = Math.abs(this.f55893s - event.getY());
            Intrinsics.h(this.f55886j);
            if (fAbs > r8.getTouchSlop()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout parent, View view, int i) {
        int iMax;
        int i2;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(view, "child");
        if (ViewCompat.getFitsSystemWindows(parent) && !ViewCompat.getFitsSystemWindows(view)) {
            view.setFitsSystemWindows(true);
        }
        int top = view.getTop();
        this.f55885h = true;
        parent.onLayoutChild(view, i);
        this.f55885h = false;
        this.f55888m = parent.getHeight();
        if (this.f55896x) {
            if (this.f55897y == 0) {
                Integer num = this.u;
                Intrinsics.h(num);
                this.f55897y = num.intValue();
            }
            iMax = Math.max(this.f55897y, this.f55888m - ((parent.getWidth() * 9) / 16));
        } else {
            iMax = this.f55895w;
        }
        if (this.e) {
            i2 = this.z;
        } else {
            Integer num2 = this.u;
            Intrinsics.h(num2);
            i2 = -num2.intValue();
        }
        this.A = i2;
        int iMax2 = Math.max(this.f55888m - iMax, i2);
        this.B = iMax2;
        int i3 = this.i;
        if (i3 == 3) {
            ViewCompat.offsetTopAndBottom(view, this.A);
        } else if (i3 == 5) {
            ViewCompat.offsetTopAndBottom(view, this.f55888m);
        } else if (i3 == 4) {
            ViewCompat.offsetTopAndBottom(view, iMax2);
        } else if (i3 == 1 || i3 == 2) {
            ViewCompat.offsetTopAndBottom(view, top - view.getTop());
        } else if (i3 == 6) {
            int i5 = this.z;
            int i6 = this.A;
            if (i5 > i6) {
                ViewCompat.offsetTopAndBottom(view, i5);
            } else {
                this.i = 3;
                ViewCompat.offsetTopAndBottom(view, i6);
            }
        }
        if (this.f55886j == null) {
            this.f55886j = ViewDragHelper.create(parent, this.F);
        }
        WeakReference weakReference = this.f55889n;
        if ((weakReference != null ? (View) weakReference.get() : null) != view) {
            this.f55889n = new WeakReference(view);
            f fVar = this.E;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(view, "view");
            WeakReference weakReference2 = fVar.d;
            View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
            if (!Intrinsics.f(view2, view)) {
                fVar.a(false);
                if (view2 != null) {
                    view2.removeOnAttachStateChangeListener(fVar);
                }
                view.addOnAttachStateChangeListener(fVar);
                fVar.d = new WeakReference(view);
            }
        }
        WeakReference weakReference3 = this.o;
        if (weakReference3 == null || weakReference3.get() == null) {
            this.o = new WeakReference(b(view));
        }
        this.f = false;
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View child, View target, float f, float f4) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        if (!this.f55881a) {
            return false;
        }
        this.f55891q = f;
        this.f55892r = -f4;
        WeakReference weakReference = this.o;
        Intrinsics.h(weakReference);
        return target == weakReference.get() && (this.i != 3 || super.onNestedPreFling(coordinatorLayout, child, target, f, f4));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View child, View target, int i, int i2, int[] consumed) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        if (this.f55881a) {
            WeakReference weakReference = this.o;
            Intrinsics.h(weakReference);
            if (target != ((View) weakReference.get())) {
                return;
            }
            int top = child.getTop();
            int i3 = top - i2;
            if (i2 > 0) {
                boolean z = this.f55883c;
                if (!z && i3 < this.z) {
                    return;
                }
                int i5 = this.A;
                if (i3 >= i5 || !z) {
                    consumed[1] = i2;
                    ViewCompat.offsetTopAndBottom(child, -i2);
                    h(1);
                } else {
                    int i6 = top - i5;
                    consumed[1] = i6;
                    ViewCompat.offsetTopAndBottom(child, -i6);
                    h(3);
                }
            } else if (i2 < 0 && !ViewCompat.canScrollVertically(target, -1)) {
                int i21 = this.B;
                if (i3 <= i21 || this.f55882b) {
                    consumed[1] = i2;
                    ViewCompat.offsetTopAndBottom(child, -i2);
                    h(1);
                } else {
                    int i22 = top - i21;
                    consumed[1] = i22;
                    ViewCompat.offsetTopAndBottom(child, -i22);
                    h(4);
                }
            }
            dispatchOnSlide(child.getTop());
            this.f55887l = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onRestoreInstanceState(CoordinatorLayout parent, View child, Parcelable state) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(state, "state");
        SavedState savedState = (SavedState) state;
        Parcelable superState = savedState.getSuperState();
        Intrinsics.h(superState);
        super.onRestoreInstanceState(parent, child, superState);
        int i = savedState.f55898a;
        if (i == 1 || i == 2) {
            i = 4;
        }
        this.i = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable onSaveInstanceState(CoordinatorLayout parent, View child) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        return new SavedState(super.onSaveInstanceState(parent, child), this.i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View child, View directTargetChild, View target, int i) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(directTargetChild, "directTargetChild");
        Intrinsics.checkNotNullParameter(target, "target");
        if (!this.f55881a) {
            return false;
        }
        this.f55887l = false;
        return (i & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View child, View target) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        if (this.f55881a) {
            if (child.getTop() == this.A) {
                h(3);
                return;
            }
            WeakReference weakReference = this.o;
            Intrinsics.h(weakReference);
            if (target == weakReference.get() && this.f55887l) {
                int[] iArr = new int[2];
                a(child, this.f55891q, this.f55892r, iArr);
                this.f55891q = BitmapDescriptorFactory.HUE_RED;
                this.f55892r = BitmapDescriptorFactory.HUE_RED;
                int i = iArr[0];
                int i2 = iArr[1];
                ViewDragHelper viewDragHelper = this.f55886j;
                Intrinsics.h(viewDragHelper);
                if (viewDragHelper.smoothSlideViewTo(child, child.getLeft(), i)) {
                    h(2);
                    c(i2);
                    e(i2, child);
                } else {
                    h(i2);
                }
                this.f55887l = false;
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onTouchEvent(CoordinatorLayout parent, View child, MotionEvent ev10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(ev10, "ev");
        try {
            return d(ev10, child);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public final void setPeekHeight(int i) {
        if (i == -1) {
            if (this.f55896x) {
                return;
            } else {
                this.f55896x = true;
            }
        } else {
            if (!this.f55896x && this.f55895w == i) {
                return;
            }
            this.f55896x = false;
            this.f55895w = i > 0 ? i : 0;
            this.B = this.f55888m - i;
        }
        if (this.i == 4) {
            WeakReference weakReference = this.f55889n;
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view != null) {
                view.requestLayout();
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/internal/dialogs/AnchoredStateBottomSheetBehavior$SavedState;", "Landroidx/customview/view/AbsSavedState;", "Companion", "b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SavedState extends AbsSavedState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f55898a;
        public static final Parcelable.Creator<SavedState> CREATOR = ParcelableCompat.newCreator(new a());

        public static final class a implements ParcelableCompatCreatorCallbacks {
            @Override // androidx.core.os.ParcelableCompatCreatorCallbacks
            public final Object createFromParcel(Parcel in10, ClassLoader loader) {
                Intrinsics.checkNotNullParameter(in10, "in");
                Intrinsics.checkNotNullParameter(loader, "loader");
                return new SavedState(in10, loader);
            }

            @Override // androidx.core.os.ParcelableCompatCreatorCallbacks
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcel source, ClassLoader classLoader) {
            super(source, classLoader);
            Intrinsics.checkNotNullParameter(source, "source");
            this.f55898a = source.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            super.writeToParcel(out, i);
            out.writeInt(this.f55898a);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            Intrinsics.h(parcelable);
            this.f55898a = i;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredStateBottomSheetBehavior(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f55881a = true;
        this.f55883c = true;
        this.i = 4;
        this.f55890p = new CopyOnWriteArrayList();
        this.u = 0;
        this.z = 500;
        this.E = new f();
        this.F = new cr0.c(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BottomSheetBehavior_Layout);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        setPeekHeight(-1);
        typedArrayObtainStyledAttributes.recycle();
        this.i = 6;
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.v = r2.getScaledMinimumFlingVelocity();
    }
}
