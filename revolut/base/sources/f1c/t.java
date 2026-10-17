package f1c;

import a3e.u;
import cli.y;
import com.revolut.feature.rev_points.impl.ui.wrapped.cards.RevPointsWrappedCardsScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends oki.h implements r {
    public final RevPointsWrappedCardsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u29.q f131252p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h60.d f131253q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f131254r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f131255s;

    public t(u stateMapper, RevPointsWrappedCardsScreenContract$InputData inputData, u29.q lifestyleWrappedInteractor, h60.d lottieAnimationControllerExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(lifestyleWrappedInteractor, "lifestyleWrappedInteractor");
        Intrinsics.checkNotNullParameter(lottieAnimationControllerExtension, "lottieAnimationControllerExtension");
        this.o = inputData;
        this.f131252p = lifestyleWrappedInteractor;
        this.f131253q = lottieAnimationControllerExtension;
        this.f131254r = new vii.b();
        this.f131255s = mra.d.b(this, new l(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f131254r, new dz6.n(continuation, this, 26)), null, null, new ew1.d(this, continuation, 20), 3);
    }

    public final void I2(Object obj2) {
        if (obj2 instanceof a) {
            C2(new m(((a) obj2).f131232a));
            return;
        }
        boolean z = obj2 instanceof b;
        y yVar = this.f131255s;
        if (z) {
            H2(yVar, new f0d.k(6));
        } else if (obj2 instanceof d) {
            H2(yVar, new av8.o(obj2, 14));
            if (((d) obj2).f131238c) {
                this.f131253q.R(h60.a.f149577a);
            }
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f131255s;
    }
}
