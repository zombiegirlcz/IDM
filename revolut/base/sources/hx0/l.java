package hx0;

import android.R;
import android.animation.Animator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes19.dex */
public final class l implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f156319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f156320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageView f156321c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ View e;
    public final /* synthetic */ NavBarWithContainer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ View f156322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ View f156323h;
    public final /* synthetic */ ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ImageView f156324j;
    public final /* synthetic */ ViewGroup k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f156325l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f156326m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ View f156327n;
    public final /* synthetic */ NavBarWithContainer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ View f156328p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ View f156329q;

    public l(ImageView imageView, ViewGroup viewGroup, ImageView imageView2, Ref$ObjectRef ref$ObjectRef, View view, NavBarWithContainer navBarWithContainer, View view2, FloatingBottomBarView floatingBottomBarView, ImageView imageView3, ImageView imageView4, ViewGroup viewGroup2, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, View view3, NavBarWithContainer navBarWithContainer2, View view4, FloatingBottomBarView floatingBottomBarView2) {
        this.f156319a = imageView;
        this.f156320b = viewGroup;
        this.f156321c = imageView2;
        this.d = ref$ObjectRef;
        this.e = view;
        this.f = navBarWithContainer;
        this.f156322g = view2;
        this.f156323h = floatingBottomBarView;
        this.i = imageView3;
        this.f156324j = imageView4;
        this.k = viewGroup2;
        this.f156325l = ref$ObjectRef2;
        this.f156326m = ref$ObjectRef3;
        this.f156327n = view3;
        this.o = navBarWithContainer2;
        this.f156328p = view4;
        this.f156329q = floatingBottomBarView2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        ImageView imageView = this.f156321c;
        ViewGroup viewGroup2 = this.f156320b;
        Ref$ObjectRef ref$ObjectRef = this.d;
        ImageView imageView2 = this.f156319a;
        if (imageView2 != null) {
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getRootView().findViewById(R.id.content);
            if (viewGroup3 != null) {
                viewGroup3.removeView(imageView2);
                viewGroup3.removeView(imageView);
            }
        } else if (ref$ObjectRef.f186409a != null && (viewGroup = (ViewGroup) viewGroup2.getRootView().findViewById(R.id.content)) != null) {
            viewGroup.removeView((View) ref$ObjectRef.f186409a);
        }
        ImageView imageView3 = (ImageView) ref$ObjectRef.f186409a;
        if (imageView3 != null) {
            imageView3.setHasTransientState(false);
        }
        if (imageView != null) {
            imageView.setHasTransientState(false);
        }
        if (imageView2 != null) {
            imageView2.setHasTransientState(false);
        }
        View view = this.e;
        if (view != null) {
            view.setHasTransientState(false);
        }
        this.f.setHasTransientState(false);
        this.f156322g.setHasTransientState(false);
        View view2 = this.f156323h;
        if (view2 != null) {
            view2.setHasTransientState(false);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.k;
        Ref$ObjectRef ref$ObjectRef = this.f156326m;
        ImageView imageView = this.f156324j;
        ImageView imageView2 = this.i;
        if (imageView2 != null && imageView != null) {
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getRootView().findViewById(R.id.content);
            int childCount = this.f156325l.f186409a == null ? 0 : viewGroup3.getChildCount();
            if (viewGroup3 != null) {
                viewGroup3.addView(imageView, childCount);
                viewGroup3.addView(imageView2, childCount + 1);
                imageView2.layout(0, 0, imageView2.getDrawable().getIntrinsicWidth(), imageView2.getDrawable().getIntrinsicHeight());
                imageView.layout(0, 0, imageView.getDrawable().getIntrinsicWidth(), imageView.getDrawable().getIntrinsicHeight());
            }
        } else if (ref$ObjectRef.f186409a != null && (viewGroup = (ViewGroup) viewGroup2.getRootView().findViewById(R.id.content)) != null) {
            viewGroup.addView((View) ref$ObjectRef.f186409a);
            Drawable drawable = ((ImageView) ref$ObjectRef.f186409a).getDrawable();
            ((ImageView) ref$ObjectRef.f186409a).layout(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        ImageView imageView3 = (ImageView) ref$ObjectRef.f186409a;
        if (imageView3 != null) {
            imageView3.setHasTransientState(true);
        }
        if (imageView2 != null) {
            imageView2.setHasTransientState(true);
        }
        if (imageView != null) {
            imageView.setHasTransientState(true);
        }
        View view = this.f156327n;
        if (view != null) {
            view.setHasTransientState(true);
        }
        this.o.setHasTransientState(true);
        this.f156328p.setHasTransientState(true);
        View view2 = this.f156329q;
        if (view2 != null) {
            view2.setHasTransientState(true);
        }
    }
}
