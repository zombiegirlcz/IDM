package com.revolut.core.ui_kit.views.scrolling;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import ay0.c;
import com.google.android.material.appbar.AppBarLayout;
import g01.a;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import pd.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u000bB!\b\u0007\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/views/scrolling/HideOnScrollViewBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Landroid/view/View;", "Landroidx/recyclerview/widget/RecyclerView$OnChildAttachStateChangeListener;", "Ljava/lang/Runnable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ay0/c", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HideOnScrollViewBehavior extends CoordinatorLayout.Behavior<View> implements RecyclerView.OnChildAttachStateChangeListener, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f59643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f59644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WeakReference f59645c;
    public WeakReference d;
    public final c e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f59646g;

    public HideOnScrollViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new c(this);
        this.f59646g = new Handler(Looper.getMainLooper());
    }

    public static boolean a(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        return b.j(layoutManager != null ? Boolean.valueOf(layoutManager.canScrollVertically()) : null);
    }

    public static boolean e(ViewGroup viewGroup, ay0.b bVar) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            if (((Boolean) bVar.invoke(childAt)).booleanValue()) {
                return true;
            }
        }
        int childCount2 = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            View childAt2 = viewGroup.getChildAt(i2);
            if ((childAt2 instanceof ViewGroup) && e((ViewGroup) childAt2, bVar)) {
                return true;
            }
        }
        return false;
    }

    public final void b(AppBarLayout appBarLayout) {
        WeakReference weakReference = this.f59645c;
        AppBarLayout appBarLayout2 = weakReference != null ? (AppBarLayout) weakReference.get() : null;
        if (appBarLayout2 == appBarLayout) {
            return;
        }
        this.f59645c = new WeakReference(appBarLayout);
        c cVar = this.e;
        if (appBarLayout2 != null) {
            appBarLayout2.removeOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) cVar);
        }
        cVar.f11004a = -1;
        cVar.f11005b = 0;
        if (appBarLayout != null) {
            appBarLayout.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) cVar);
        }
    }

    public final void c(RecyclerView recyclerView) {
        WeakReference weakReference = this.f59643a;
        RecyclerView recyclerView2 = weakReference != null ? (RecyclerView) weakReference.get() : null;
        if (recyclerView2 == recyclerView) {
            return;
        }
        d(true);
        if (recyclerView2 != null) {
            if (a(recyclerView2)) {
                recyclerView2.removeOnScrollListener(this.e);
            } else {
                recyclerView2.removeOnChildAttachStateChangeListener(this);
            }
        }
        if (this.f) {
            this.f = false;
            this.f59646g.removeCallbacks(this);
        }
        this.f59644b = null;
        this.f59643a = recyclerView != null ? new WeakReference(recyclerView) : null;
        if (recyclerView != null && !a(recyclerView)) {
            recyclerView.addOnChildAttachStateChangeListener(this);
        }
        f();
    }

    public final void d(boolean z) {
        a aVar;
        WeakReference weakReference = this.d;
        if (weakReference == null || (aVar = (a) weakReference.get()) == null || !aVar.getIsVisibilityAnimationsOnScrollEnabled()) {
            return;
        }
        aVar.setVisibilityOnScroll(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if ((r2 instanceof androidx.recyclerview.widget.RecyclerView) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        r5 = (androidx.recyclerview.widget.RecyclerView) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (a(r5) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0056, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
    
        if (r4 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        r2 = (android.view.ViewGroup) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
    
        if (r2 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
    
        r4 = r2.getChildCount();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0064, code lost:
    
        if (r3 >= r4) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0066, code lost:
    
        r5 = r2.getChildAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
    
        if ((r5 instanceof androidx.recyclerview.widget.RecyclerView) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        r5 = (androidx.recyclerview.widget.RecyclerView) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0074, code lost:
    
        if (a(r5) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0077, code lost:
    
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r8 = this;
            java.lang.ref.WeakReference r0 = r8.f59644b
            r1 = 0
            if (r0 == 0) goto Lc
            java.lang.Object r0 = r0.get()
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            goto Ld
        Lc:
            r0 = r1
        Ld:
            java.lang.ref.WeakReference r2 = r8.f59643a
            if (r2 == 0) goto L18
            java.lang.Object r2 = r2.get()
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            goto L19
        L18:
            r2 = r1
        L19:
            if (r2 != 0) goto L1d
        L1b:
            r2 = r1
            goto L7a
        L1d:
            boolean r3 = a(r2)
            if (r3 == 0) goto L24
            goto L7a
        L24:
            r3 = 0
            android.view.View r2 = r2.getChildAt(r3)
        L29:
            boolean r4 = r2 instanceof android.view.ViewGroup
            if (r4 == 0) goto L49
            r5 = r2
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r6 = r5.getChildCount()
            r7 = 1
            if (r6 != r7) goto L49
            boolean r4 = r2 instanceof androidx.recyclerview.widget.RecyclerView
            if (r4 == 0) goto L44
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            boolean r4 = a(r2)
            if (r4 == 0) goto L44
            goto L7a
        L44:
            android.view.View r2 = r5.getChildAt(r3)
            goto L29
        L49:
            boolean r5 = r2 instanceof androidx.recyclerview.widget.RecyclerView
            if (r5 == 0) goto L58
            r5 = r2
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            boolean r6 = a(r5)
            if (r6 == 0) goto L58
        L56:
            r2 = r5
            goto L7a
        L58:
            if (r4 == 0) goto L5d
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L5e
        L5d:
            r2 = r1
        L5e:
            if (r2 == 0) goto L1b
            int r4 = r2.getChildCount()
        L64:
            if (r3 >= r4) goto L1b
            android.view.View r5 = r2.getChildAt(r3)
            boolean r6 = r5 instanceof androidx.recyclerview.widget.RecyclerView
            if (r6 == 0) goto L77
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            boolean r6 = a(r5)
            if (r6 == 0) goto L77
            goto L56
        L77:
            int r3 = r3 + 1
            goto L64
        L7a:
            if (r0 != r2) goto L7d
            goto L92
        L7d:
            ay0.c r3 = r8.e
            if (r0 == 0) goto L84
            r0.removeOnScrollListener(r3)
        L84:
            if (r2 == 0) goto L8b
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r2)
        L8b:
            r8.f59644b = r1
            if (r2 == 0) goto L92
            r2.addOnScrollListener(r3)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.scrolling.HideOnScrollViewBehavior.f():void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        if (dependency instanceof a) {
            child = dependency;
        } else if (!(child instanceof a)) {
            child = null;
        }
        if (child != null) {
            a aVar = (a) child;
            WeakReference weakReference = this.d;
            if ((weakReference != null ? (a) weakReference.get() : null) != aVar) {
                this.d = new WeakReference(aVar);
                d(true);
            }
        }
        return child != null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f) {
            return;
        }
        this.f = true;
        this.f59646g.post(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f) {
            return;
        }
        this.f = true;
        this.f59646g.post(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        b(null);
        c(null);
        d(true);
        this.d = null;
        c cVar = this.e;
        cVar.f11004a = -1;
        cVar.f11005b = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout parent, View child, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        e(parent, new ay0.b(ref$ObjectRef, this, ref$ObjectRef2));
        b((AppBarLayout) ref$ObjectRef.f186409a);
        c((RecyclerView) ref$ObjectRef2.f186409a);
        return false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f = false;
        f();
    }

    public HideOnScrollViewBehavior() {
        this(null, null);
    }
}
