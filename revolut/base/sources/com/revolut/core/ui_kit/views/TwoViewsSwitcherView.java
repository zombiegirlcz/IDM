package com.revolut.core.ui_kit.views;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import au0.l5;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kx7.o0;
import mx0.dd;
import mx0.ed;
import mx0.fd;
import mx0.gd;
import org.jetbrains.annotations.NotNull;
import yhm.m;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001:\u0003\n\u0015\u001dB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/revolut/core/ui_kit/views/TwoViewsSwitcherView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lmx0/dd;", "factory", "", "setInAnimatorFactory", "(Lmx0/dd;)V", "setOutAnimatorFactory", "Landroid/view/View;", "firstView", "secondView", "setChildren", "(Landroid/view/View;Landroid/view/View;)V", "Lmx0/fd;", "f", "Lmx0/fd;", "getPlayStrategy", "()Lmx0/fd;", "setPlayStrategy", "(Lmx0/fd;)V", "playStrategy", "mx0/ed", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class TwoViewsSwitcherView extends FrameLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f58925g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dd f58926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dd f58927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f58928c;
    public AnimatorSet d;
    public ed e;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public fd playStrategy;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TwoViewsSwitcherView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final View a(int i) {
        if (getChildCount() != 2) {
            throw new IllegalStateException(p.a.p("Add exactly two children to ", kotlin.jvm.internal.o0.f186429a.b(getClass()).m(), " to be able to switch them"));
        }
        View childAt = getChildAt(i);
        Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
        return childAt;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() == 2) {
            throw new IllegalStateException("Supports only two children max");
        }
        super.addView(view);
    }

    public final void b(View view, View view2, boolean z) throws Throwable {
        Object objA;
        Object objA2;
        dd ddVar;
        dd ddVar2;
        try {
            m.Companion companion = yhm.m.INSTANCE;
            ddVar2 = this.f58927b;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        if (ddVar2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        objA = ddVar2.d(view);
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        if (objA instanceof yhm.n) {
            objA = null;
        }
        Animator animatorD = (Animator) objA;
        o0 o0Var = this.f58928c;
        if (animatorD == null) {
            animatorD = o0Var.d(view);
        }
        animatorD.addListener(new cx0.b(view, 9));
        try {
            ddVar = this.f58926a;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th11) {
            m.Companion companion3 = yhm.m.INSTANCE;
            objA2 = yhm.o.a(th11);
        }
        if (ddVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        objA2 = ddVar.d(view2);
        Throwable thA2 = yhm.m.a(objA2);
        if (thA2 != null) {
            hx7.e.n(thA2);
        }
        Animator animatorD2 = (Animator) (objA2 instanceof yhm.n ? null : objA2);
        if (animatorD2 == null) {
            animatorD2 = o0Var.d(view2);
        }
        animatorD2.addListener(new cx0.b(view2, 10));
        AnimatorSet animatorSet = new AnimatorSet();
        int i = gd.f209725a[this.playStrategy.ordinal()];
        if (i == 1) {
            animatorSet.playSequentially(animatorD, animatorD2);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            animatorSet.playTogether(animatorD, animatorD2);
        }
        animatorSet.addListener(new l5(this, 19));
        if (!z) {
            animatorSet.setDuration(0L);
        }
        this.d = animatorSet;
        animatorSet.start();
    }

    public final void c(boolean z) {
        Object objA;
        Object objA2;
        AnimatorSet animatorSet;
        if (this.e == ed.SHOWING_FIRST) {
            return;
        }
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = a(0);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        if (objA instanceof yhm.n) {
            objA = null;
        }
        View view = (View) objA;
        if (view == null) {
            return;
        }
        try {
            objA2 = a(1);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th11) {
            m.Companion companion3 = yhm.m.INSTANCE;
            objA2 = yhm.o.a(th11);
        }
        Throwable thA2 = yhm.m.a(objA2);
        if (thA2 != null) {
            hx7.e.n(thA2);
        }
        View view2 = (View) (objA2 instanceof yhm.n ? null : objA2);
        if (view2 == null) {
            return;
        }
        if (this.e == ed.SHOWING_SECOND && (animatorSet = this.d) != null) {
            animatorSet.cancel();
        }
        b(view2, view, z);
        this.e = ed.SHOWING_FIRST;
    }

    public final void d(boolean z) {
        Object objA;
        Object objA2;
        AnimatorSet animatorSet;
        if (this.e == ed.SHOWING_SECOND) {
            return;
        }
        try {
            m.Companion companion = yhm.m.INSTANCE;
            objA = a(0);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = yhm.m.INSTANCE;
            objA = yhm.o.a(th10);
        }
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
        if (objA instanceof yhm.n) {
            objA = null;
        }
        View view = (View) objA;
        if (view == null) {
            return;
        }
        try {
            objA2 = a(1);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th11) {
            m.Companion companion3 = yhm.m.INSTANCE;
            objA2 = yhm.o.a(th11);
        }
        Throwable thA2 = yhm.m.a(objA2);
        if (thA2 != null) {
            hx7.e.n(thA2);
        }
        View view2 = (View) (objA2 instanceof yhm.n ? null : objA2);
        if (view2 == null) {
            return;
        }
        if (this.e == ed.SHOWING_FIRST && (animatorSet = this.d) != null) {
            animatorSet.cancel();
        }
        b(view, view2, z);
        this.e = ed.SHOWING_SECOND;
    }

    @NotNull
    public final fd getPlayStrategy() {
        return this.playStrategy;
    }

    public final void setChildren(@NotNull View firstView, @NotNull View secondView) {
        Intrinsics.checkNotNullParameter(firstView, "firstView");
        Intrinsics.checkNotNullParameter(secondView, "secondView");
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(1);
        if (!Intrinsics.f(childAt, firstView)) {
            if (childAt != null) {
                removeViewAt(0);
            }
            addView(firstView, 0);
        }
        if (Intrinsics.f(childAt2, secondView)) {
            return;
        }
        if (childAt2 != null) {
            removeViewAt(1);
        }
        addView(secondView, 1);
    }

    public final void setInAnimatorFactory(dd factory) {
        if (Intrinsics.f(this.f58926a, factory)) {
            return;
        }
        this.f58926a = factory;
    }

    public final void setOutAnimatorFactory(dd factory) {
        if (Intrinsics.f(this.f58927b, factory)) {
            return;
        }
        this.f58927b = factory;
    }

    public final void setPlayStrategy(@NotNull fd fdVar) {
        Intrinsics.checkNotNullParameter(fdVar, "<set-?>");
        this.playStrategy = fdVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TwoViewsSwitcherView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoViewsSwitcherView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58928c = new o0(16);
        this.e = ed.IDLE;
        this.playStrategy = fd.SEQUENTIALLY;
    }

    public /* synthetic */ TwoViewsSwitcherView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
