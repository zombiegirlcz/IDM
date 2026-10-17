package qe5;

import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends jki.g implements d {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final mre.c f245078p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sla.h f245079q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final am2.a f245080r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tla.f f245081s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f80.a f245082t;
    public final c u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p stateMapper, mre.c termsNavigationFactory, sla.h termsAndConditionsNavigationFactory, am2.a profileTypeInteractor, tla.f profileOnboarding, f80.a uriHelper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(termsAndConditionsNavigationFactory, "termsAndConditionsNavigationFactory");
        Intrinsics.checkNotNullParameter(profileTypeInteractor, "profileTypeInteractor");
        Intrinsics.checkNotNullParameter(profileOnboarding, "profileOnboarding");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f245078p = termsNavigationFactory;
        this.f245079q = termsAndConditionsNavigationFactory;
        this.f245080r = profileTypeInteractor;
        this.f245081s = profileOnboarding;
        this.f245082t = uriHelper;
        this.u = new c(0);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(this.f245080r.a()), null, null, new qc3.c(this, null, 7), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }
}
