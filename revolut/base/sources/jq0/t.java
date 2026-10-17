package jq0;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ix0.a0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes19.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f177400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f177401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f177402c;
    public Function1 d;
    public ValueAnimator e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f177403g;

    public t(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f177400a = view;
        this.f177402c = new Rect();
    }

    public final void a(long j2, Function0 function0, boolean z) {
        t tVar;
        s sVar = this.f177401b;
        if (sVar != null) {
            sVar.cancel();
        }
        s sVar2 = null;
        this.f177401b = null;
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.e = null;
        View view = this.f177400a;
        if (!z) {
            c(kotlin.ranges.f.i(b() ? 0L : (long) (((view.getHeight() - this.f) * j2) / view.getHeight()), 0L, j2), function0, false);
            return;
        }
        if (view.getVisibility() == 8) {
            view.setVisibility(4);
        }
        if (!ViewCompat.isLaidOut(view) || view.isLayoutRequested()) {
            s sVar3 = new s(view, this, j2, function0);
            tVar = this;
            view.addOnLayoutChangeListener(sVar3);
            sVar2 = sVar3;
        } else {
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
                this.f = view.getHeight();
                d();
            }
            c(kotlin.ranges.f.i(b() ? 0L : (long) ((j2 * this.f) / view.getHeight()), 0L, j2), function0, true);
            tVar = this;
        }
        tVar.f177401b = sVar2;
    }

    public final boolean b() {
        View view = this.f177400a;
        if (view.getHeight() == 0) {
            return true;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        return view2 == null || !view2.isLaidOut();
    }

    public final void c(long j2, Function0 function0, boolean z) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f, z ? BitmapDescriptorFactory.HUE_RED : this.f177400a.getHeight());
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        valueAnimatorOfFloat.setDuration(j2);
        a0 a0Var = new a0(valueAnimatorOfFloat, ref$BooleanRef, this, z, function0, ref$BooleanRef);
        valueAnimatorOfFloat.addListener(a0Var);
        valueAnimatorOfFloat.addUpdateListener(a0Var);
        valueAnimatorOfFloat.start();
        this.e = valueAnimatorOfFloat;
    }

    public final void d() {
        this.f177400a.setTranslationY(this.f + this.f177403g);
    }
}
