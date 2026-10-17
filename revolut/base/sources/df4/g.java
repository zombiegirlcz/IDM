package df4;

import cli.n;
import cli.y;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.animated_intro.AnimatedIntroScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends oki.h implements e {
    public final AnimatedIntroScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rx3.a f113785p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f113786q;

    public g(n stateMapper, AnimatedIntroScreenContract$InputData inputData, rx3.a creditAnimatedIntroInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditAnimatedIntroInteractor, "creditAnimatedIntroInteractor");
        this.o = inputData;
        this.f113785p = creditAnimatedIntroInteractor;
        d.Companion.getClass();
        this.f113786q = mra.d.b(this, new d(false), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f113786q;
    }
}
