package jji;

import com.revolut.kompot.common.transition.AccountCreationTransitionAnimation;
import com.revolut.kompot.common.transition.CardZoomTransitionAnimation;
import com.revolut.kompot.common.transition.MainElementMoveFromCenterTransitionAnimation;
import com.revolut.kompot.common.transition.MainElementRevealTransitionAnimation;
import com.revolut.kompot.common.transition.NavBarCentredRevealTransitionAnimation;
import com.revolut.kompot.common.transition.ProfileCardTransitionAnimation;
import com.revolut.kompot.common.transition.ZoomTransitionAnimation;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements gki.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j70.a f174967a;

    public g(j70.a devicePerformance) {
        Intrinsics.checkNotNullParameter(devicePerformance, "devicePerformance");
        this.f174967a = devicePerformance;
    }

    public final lki.b a(TransitionAnimation.Custom animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (animation instanceof AccountCreationTransitionAnimation) {
            if (!b()) {
                return new a();
            }
            if (((AccountCreationTransitionAnimation) animation).f98355a) {
                return new lki.g();
            }
            lki.x.Companion.getClass();
            return lki.w.a();
        }
        if (animation instanceof MainElementRevealTransitionAnimation) {
            if (!b()) {
                return new k(((MainElementRevealTransitionAnimation) animation).f98359a);
            }
            lki.x.Companion.getClass();
            return lki.w.a();
        }
        if (animation instanceof MainElementMoveFromCenterTransitionAnimation) {
            if (!b()) {
                return new j(((MainElementMoveFromCenterTransitionAnimation) animation).f98358a);
            }
            lki.x.Companion.getClass();
            return lki.w.a();
        }
        if (animation instanceof NavBarCentredRevealTransitionAnimation) {
            if (b()) {
                lki.x.Companion.getClass();
                return lki.w.a();
            }
            NavBarCentredRevealTransitionAnimation navBarCentredRevealTransitionAnimation = (NavBarCentredRevealTransitionAnimation) animation;
            return new l(navBarCentredRevealTransitionAnimation.f98360a, navBarCentredRevealTransitionAnimation.f98361b, navBarCentredRevealTransitionAnimation.f98362c);
        }
        if (animation instanceof ZoomTransitionAnimation) {
            if (!b() || ((ZoomTransitionAnimation) animation).getF98369g()) {
                return new a0((ZoomTransitionAnimation) animation);
            }
            lki.x.Companion.getClass();
            return lki.w.a();
        }
        if (!(animation instanceof CardZoomTransitionAnimation)) {
            if (animation instanceof ProfileCardTransitionAnimation) {
                return new r(((ProfileCardTransitionAnimation) animation).f98363a);
            }
            throw new IllegalStateException("No transition found for ".concat(animation.getClass().getSimpleName()).toString());
        }
        if (b()) {
            lki.x.Companion.getClass();
            return lki.w.a();
        }
        CardZoomTransitionAnimation cardZoomTransitionAnimation = (CardZoomTransitionAnimation) animation;
        return new f(cardZoomTransitionAnimation.f98356a, cardZoomTransitionAnimation.f98357b);
    }

    public final boolean b() {
        return ((j70.c) this.f174967a).a().compareTo(j70.d.LOW) <= 0;
    }
}
