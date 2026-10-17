package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.bottomsheet.BottomSheetBehaviorExposed;
import com.revolut.core.ui_kit.internal.views.linearlayout.UIKitLinearLayout;
import ix0.i1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.la;
import mx0.z9;
import org.jetbrains.annotations.NotNull;
import ybh.c0;
import yt0.a0;
import yt0.b0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/views/ModalViewContainerBehavior;", "Lcom/google/android/material/bottomsheet/BottomSheetBehaviorExposed;", "Lcom/revolut/core/ui_kit/internal/views/linearlayout/UIKitLinearLayout;", "Companion", "mx0/z9", "yt0/a0", "ybh/c0", "a", "b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ModalViewContainerBehavior extends BottomSheetBehaviorExposed<UIKitLinearLayout> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final la f58780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f58781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f58782c;
    public final cr0.l d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ViewConfiguration f58783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public WeakReference f58784h;
    public WeakReference i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CoordinatorLayout f58785j;
    public final z9 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f58786l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f58787m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c0 f58788n;
    public final Function1 o;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public au0.o f58789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f58790b;
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.ModalViewContainerBehavior$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static ModalViewContainerBehavior a(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
                throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
            }
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof ModalViewContainerBehavior) {
                return (ModalViewContainerBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with ModalViewContainerBehavior");
        }
    }

    public ModalViewContainerBehavior(o modalViewContainerView) {
        Intrinsics.checkNotNullParameter(modalViewContainerView, "modalViewContainerView");
        this.f58780a = new la(this, 2);
        this.e = -1;
        this.f = -1;
        this.k = new z9(this);
        this.f58786l = new a();
        this.f58787m = new ArrayList();
        this.o = new mt9.c(this, new Object(), 14);
        this.f58782c = modalViewContainerView;
        this.d = new cr0.l(modalViewContainerView);
        this.f58781b = true;
    }

    public static final void a(ModalViewContainerBehavior modalViewContainerBehavior, boolean z) {
        super.setDraggable(z);
    }

    public static void b(View view, a aVar) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        if (view.getVisibility() == 8) {
            return;
        }
        au0.o oVar = aVar.f58789a;
        if (oVar == null || aVar.f58790b == null) {
            if (view instanceof au0.o) {
                if (oVar == null) {
                    oVar = (au0.o) view;
                }
                aVar.f58789a = oVar;
                return;
            }
            if (view instanceof ViewPager2) {
                View childAt = ((ViewPager2) view).getChildAt(0);
                View view2 = null;
                RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
                RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                Integer numValueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition()) : null;
                if (numValueOf != null && (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(numValueOf.intValue())) != null) {
                    view2 = viewHolderFindViewHolderForAdapterPosition.itemView;
                }
                if (view2 != null) {
                    b(view2, aVar);
                    return;
                }
                return;
            }
            if (ViewCompat.isNestedScrollingEnabled(view)) {
                View view3 = aVar.f58790b;
                if (view3 != null) {
                    view = view3;
                }
                aVar.f58790b = view;
                return;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt2 = viewGroup.getChildAt(i);
                    Intrinsics.checkNotNullExpressionValue(childAt2, "getChildAt(...)");
                    b(childAt2, aVar);
                }
            }
        }
    }

    public final void c(ViewGroup viewGroup) {
        if (viewGroup instanceof ViewPager2) {
            ViewPager2 viewPager = (ViewPager2) viewGroup;
            z9 z9Var = this.k;
            z9Var.getClass();
            Intrinsics.checkNotNullParameter(viewPager, "viewPager");
            View childAt = viewPager.getChildAt(0);
            RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
            if (recyclerView != null) {
                if (Intrinsics.f(z9Var.f210144a, recyclerView)) {
                    return;
                }
                RecyclerView recyclerView2 = z9Var.f210144a;
                if (recyclerView2 != null) {
                    recyclerView2.removeOnAttachStateChangeListener(z9Var);
                    recyclerView2.removeOnScrollListener(z9Var);
                }
                z9Var.f210144a = recyclerView;
                recyclerView.addOnScrollListener(z9Var);
                recyclerView.addOnAttachStateChangeListener(z9Var);
                if (z9Var.f210144a != null) {
                    return;
                }
            }
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt2 = viewGroup.getChildAt(i);
            if (childAt2 instanceof ViewGroup) {
                c((ViewGroup) childAt2);
            }
        }
    }

    public final void d(CoordinatorLayout coordinatorLayout) {
        boolean z;
        a aVar = this.f58786l;
        b(coordinatorLayout, aVar);
        au0.o oVar = aVar.f58789a;
        View view = aVar.f58790b;
        aVar.f58789a = null;
        aVar.f58790b = null;
        if (oVar != null) {
            or0.u.f(oVar);
        }
        WeakReference weakReference = this.i;
        boolean z3 = true;
        if ((weakReference != null ? (au0.o) weakReference.get() : null) != oVar) {
            this.i = oVar != null ? new WeakReference(oVar) : null;
            z = true;
        } else {
            z = false;
        }
        WeakReference weakReference2 = this.f58784h;
        if ((weakReference2 != null ? (View) weakReference2.get() : null) != view) {
            this.f58784h = view != null ? new WeakReference(view) : null;
        } else {
            z3 = z;
        }
        if (z3) {
            ArrayList arrayList = this.f58787m;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                a0 a0Var = (a0) arrayList.get(i);
                WeakReference weakReference3 = this.f58784h;
                View view2 = weakReference3 != null ? (View) weakReference3.get() : null;
                WeakReference weakReference4 = this.i;
                au0.o oVar2 = weakReference4 != null ? (au0.o) weakReference4.get() : null;
                b0 b0Var = a0Var.f316517a;
                b0Var.c(view2 instanceof RecyclerView ? (RecyclerView) view2 : null);
                yt0.w listener = b0Var.k;
                if (!Intrinsics.f(b0Var.e, oVar2)) {
                    au0.o oVar3 = b0Var.e;
                    if (oVar3 != null) {
                        Intrinsics.checkNotNullParameter(listener, "listener");
                        oVar3.f9295g.remove(listener);
                    }
                    b0Var.e = oVar2;
                    if (oVar2 != null) {
                        Intrinsics.checkNotNullParameter(listener, "listener");
                        oVar2.f9295g.add(listener);
                    }
                }
                b0Var.f316520c.invoke(Float.valueOf(i1.b(b0Var.a(), 1.0f, b0Var.f316522h)));
            }
        }
        setParentClassNestedScrollingChildRef(this.f58784h);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onInterceptTouchEvent(CoordinatorLayout parent, View view, MotionEvent event) {
        UIKitLinearLayout child = (UIKitLinearLayout) view;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(event, "event");
        if (!super.onInterceptTouchEvent(parent, child, event)) {
            ViewConfiguration viewConfiguration = this.f58783g;
            if (viewConfiguration == null) {
                viewConfiguration = ViewConfiguration.get(parent.getContext());
                this.f58783g = viewConfiguration;
            }
            int action = event.getAction();
            if (action == 0) {
                this.e = (int) event.getX();
                this.f = (int) event.getY();
                return false;
            }
            if (action == 2) {
                WeakReference weakReference = this.f58784h;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null) {
                    float fAbs = Math.abs(event.getX() - this.e);
                    float y2 = event.getY() - this.f;
                    boolean z = fAbs < Math.abs(y2);
                    boolean z3 = y2 > ((float) viewConfiguration.getScaledTouchSlop());
                    boolean zIsPointInChildBounds = parent.isPointInChildBounds(view2, (int) event.getX(), (int) event.getY());
                    boolean zCanScrollVertically = view2.canScrollVertically(-1);
                    boolean z4 = y2 < BitmapDescriptorFactory.HUE_RED && getState() != 3;
                    WeakReference weakReference2 = this.i;
                    au0.o oVar = weakReference2 != null ? (au0.o) weakReference2.get() : null;
                    boolean z6 = oVar != null && oVar.f9292a < 1.0f;
                    if (!z || ((!z3 || z6 || (zCanScrollVertically && zIsPointInChildBounds)) && !z4)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r10, android.view.View r11, int r12) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.ModalViewContainerBehavior.onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onMeasureChild(CoordinatorLayout parent, View view, int i, int i2, int i3, int i5) {
        UIKitLinearLayout child = (UIKitLinearLayout) view;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        c0 c0Var = this.f58788n;
        if (c0Var != null) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(child, "child");
            yt0.v vVar = (yt0.v) c0Var.f312297a;
            if (child == vVar.f316594a.getFrame$ui_kit_components_release()) {
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i3);
                if (size != 0 && size2 != 0) {
                    float f = size;
                    float fB = i1.b(m72.b.a(vVar.f, 2.0f, f, f), 1.0f, BitmapDescriptorFactory.HUE_RED);
                    float f4 = size2;
                    int iC = rim.d.c(((f4 - (f4 * fB)) / 2.0f) / fB);
                    vVar.f316599j = iC;
                    child.measure(i, View.MeasureSpec.makeMeasureSpec(size2 + iC, 1073741824));
                    return true;
                }
            }
        }
        return super.onMeasureChild(parent, child, i, i2, i3, i5);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    public final void setDraggable(boolean z) {
        if (this.f58781b) {
            hx7.e.h(new IllegalAccessException(com.google.android.gms.internal.mlkit_vision_face.a.r("setDraggable called directly without TokenActivator, value=", z)));
        }
        super.setDraggable(z);
    }

    public ModalViewContainerBehavior(Context context, o oVar) {
        super(context, null);
        this.f58780a = new la(this, 2);
        this.e = -1;
        this.f = -1;
        this.k = new z9(this);
        this.f58786l = new a();
        this.f58787m = new ArrayList();
        this.o = new mt9.c(this, new Object(), 14);
        this.f58782c = oVar;
        this.d = new cr0.l(oVar);
        this.f58781b = true;
    }
}
