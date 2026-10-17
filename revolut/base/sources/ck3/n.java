package ck3;

import cli.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends oki.h implements dli.b, od0.f {
    public final z0h.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mre.c f24767p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fk3.a f24768q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final pre.c f24769r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ek3.a f24770s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f24771t;

    public n(h initialState, r stateMapper, z0h.d wealthDisclaimerDataProvider, mre.c termsNavigationFactory, fk3.a configurationInteractor, pre.c termsInteractor, ek3.a dialogConfigurationProvider) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimerDataProvider, "wealthDisclaimerDataProvider");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(dialogConfigurationProvider, "dialogConfigurationProvider");
        this.o = wealthDisclaimerDataProvider;
        this.f24767p = termsNavigationFactory;
        this.f24768q = configurationInteractor;
        this.f24769r = termsInteractor;
        this.f24770s = dialogConfigurationProvider;
        this.f24771t = mra.d.b(this, initialState, stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.o.s1(), null, null, new cbh.g(this, null, 28), 3);
    }

    @Override // od0.f
    public final void accept(Object obj2) {
        g action = (g) obj2;
        Intrinsics.checkNotNullParameter(action, "action");
        Continuation continuation = null;
        if (action instanceof d) {
            l2(new k(this, continuation, 0), new yi5.b(26));
        } else if (action.equals(e.f24758a)) {
            B2();
        } else {
            if (!action.equals(f.f24759a)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new k(this, continuation, 1), new yi5.b(26));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f24771t;
    }
}
