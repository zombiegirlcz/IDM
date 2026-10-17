package jji;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.slider_layout.HomeOverlayConfig;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.kompot.common.view.SlidingAnimation;
import kotlin.jvm.internal.Intrinsics;
import mx0.hd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 extends lki.b {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ZoomTransitionAnimation f174954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lki.a0 f174955h;
    public hd i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public jy0.m f174956j;

    public a0(ZoomTransitionAnimation descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f174954g = descriptor;
        this.f174955h = new lki.a0(new SlidingAnimation(R$id.root_sliding_container, dy0.o.BOTTOM, false));
    }

    @Override // lki.b
    public final Animator a(View view, View view2, boolean z) {
        jy0.m mVar;
        View view3;
        Context context;
        ValueAnimator valueAnimatorOfFloat;
        lji.c cVarL;
        ValueAnimator valueAnimatorOfFloat2;
        View view4 = view;
        if (this.f174956j == null) {
            d(view, view2, z);
        }
        View view5 = z ? view2 : view4;
        jy0.m mVar2 = this.f174956j;
        ZoomTransitionAnimation zoomTransitionAnimation = this.f174954g;
        if (mVar2 == null) {
            return zoomTransitionAnimation.getF98369g() ? new lki.d().a(view4, view2, z) : new k(lki.u.END_TO_START).a(view4, view2, z);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator valueAnimatorF = mVar2.f();
        ValueAnimator valueAnimator = null;
        if (view5 == null || (mVar = this.f174956j) == null || (view3 = mVar.f179270a) == null || (context = view3.getContext()) == null || jh.d.g(context)) {
            valueAnimatorOfFloat = null;
        } else {
            valueAnimatorOfFloat = z ? ValueAnimator.ofFloat(0.95f, 1.0f) : ValueAnimator.ofFloat(1.0f, 0.95f);
            valueAnimatorOfFloat.addUpdateListener(new androidx.core.view.j(this, view5, 13));
            valueAnimatorOfFloat.addListener(new cx0.b(view5, 6));
            hd.Companion.getClass();
            valueAnimatorOfFloat.setInterpolator(hd.i);
            valueAnimatorOfFloat.setDuration(hd.a.a(zoomTransitionAnimation.getF()) ? 350L : 450L);
        }
        if (!z) {
            view4 = view2;
        }
        if (view4 != null && (cVarL = ksj.b.l(view4)) != null) {
            float[] fArr = {BitmapDescriptorFactory.HUE_RED, 1.0f};
            if (z) {
                // fill-array-data instruction
                fArr[0] = 1.0f;
                fArr[1] = 0.0f;
                valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr);
            } else {
                valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr);
            }
            valueAnimator = valueAnimatorOfFloat2;
            hd.a aVar = hd.Companion;
            HomeOverlayConfig f = zoomTransitionAnimation.getF();
            aVar.getClass();
            valueAnimator.setDuration(hd.a.a(f) ? 350L : 450L);
            valueAnimator.addUpdateListener(new androidx.core.view.j(cVarL, valueAnimator, 14));
        }
        Animator[] elements = {valueAnimatorF, valueAnimatorOfFloat, valueAnimator};
        Intrinsics.checkNotNullParameter(elements, "elements");
        animatorSet.playTogether(kotlin.collections.d.L(elements));
        return animatorSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x013b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.View r22, android.view.View r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jji.a0.d(android.view.View, android.view.View, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    @Override // lki.b, lki.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.view.View r4, android.view.View r5, boolean r6, lki.z r7) {
        /*
            r3 = this;
            java.lang.String r0 = "transitionListener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            if (r6 == 0) goto L2e
            r0 = 0
            if (r4 != 0) goto Lf
            if (r5 != 0) goto Ld
            goto L1c
        Ld:
            r1 = r5
            goto L10
        Lf:
            r1 = r4
        L10:
            nji.b$a r2 = nji.b.Companion
            com.revolut.kompot.common.view.ControllerContainerSliderLayout r1 = nji.c.a(r2, r1)
            if (r1 == 0) goto L1c
            boolean r0 = r1.getSwipeStarted()
        L1c:
            if (r0 == 0) goto L2e
            if (r4 == 0) goto L27
            int r6 = com.revolut.kompot.common.R$id.zoom_sliding_animation
            com.revolut.kompot.common.transition.ZoomTransitionAnimation r0 = r3.f174954g
            r4.setTag(r6, r0)
        L27:
            lki.a0 r6 = r3.f174955h
            r0 = 1
            r6.e(r4, r5, r0, r7)
            return
        L2e:
            r3.d(r4, r5, r6)
            super.e(r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jji.a0.e(android.view.View, android.view.View, boolean, lki.z):void");
    }

    @Override // lki.b, lki.x
    public final void g() {
        super.g();
        this.f174955h.g();
        hd hdVar = this.i;
        if (hdVar == null) {
            return;
        }
        ViewParent parent = hdVar.getParent();
        Intrinsics.i(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).removeView(hdVar);
        this.i = null;
        this.f174956j = null;
    }
}
