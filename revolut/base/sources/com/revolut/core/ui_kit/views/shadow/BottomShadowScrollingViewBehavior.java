package com.revolut.core.ui_kit.views.shadow;

import abf.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewGroupKt;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import b0.b;
import by0.a;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/views/shadow/BottomShadowScrollingViewBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BottomShadowScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f59647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f59648b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomShadowScrollingViewBehavior(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f59647a = w.y0(new b(context, 3));
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        return dependency instanceof BottomShadowView;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout parent, View child, int i) {
        Object next;
        View view;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        List<View> dependencies = parent.getDependencies(child);
        Intrinsics.checkNotNullExpressionValue(dependencies, "getDependencies(...)");
        Iterator<T> it8 = dependencies.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((View) next) instanceof BottomShadowView) {
                break;
            }
        }
        BottomShadowView bottomShadowView = next instanceof BottomShadowView ? (BottomShadowView) next : null;
        if (bottomShadowView == null) {
            return super.onLayoutChild(parent, child, i);
        }
        if (child instanceof RecyclerView) {
            RecyclerView recyclerView = (RecyclerView) child;
            a aVar = this.f59648b;
            if (aVar != null) {
                recyclerView.removeOnScrollListener(aVar);
            }
            a aVar2 = new a(this, bottomShadowView);
            this.f59648b = aVar2;
            recyclerView.addOnScrollListener(aVar2);
        } else if (child instanceof NestedScrollView) {
            ((NestedScrollView) child).setOnScrollChangeListener(new c(this, bottomShadowView, 9));
        } else if ((child instanceof FrameLayout) && (view = (View) y.r(ViewGroupKt.getChildren((ViewGroup) child))) != null) {
            if (view instanceof RecyclerView) {
                RecyclerView recyclerView2 = (RecyclerView) view;
                a aVar3 = this.f59648b;
                if (aVar3 != null) {
                    recyclerView2.removeOnScrollListener(aVar3);
                }
                a aVar4 = new a(this, bottomShadowView);
                this.f59648b = aVar4;
                recyclerView2.addOnScrollListener(aVar4);
            } else if (view instanceof NestedScrollView) {
                ((NestedScrollView) view).setOnScrollChangeListener(new c(this, bottomShadowView, 9));
            }
        }
        return super.onLayoutChild(parent, child, i);
    }
}
