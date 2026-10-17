package udk;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.plan_rewards.impl.presentation.reveal.screen.PlanRewardsRevealScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okl.l1;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import u7k.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class z extends oki.h implements cli.z {

    @NotNull
    private static final w Companion = new w();
    public final PlanRewardsRevealScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bdk.j f279277p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ffk.t f279278q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kbb.c f279279r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f279280s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a2 f279281t;
    public a2 u;
    public a2 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public skm.r f279282w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final cli.y f279283x;

    public z(PlanRewardsRevealScreenContract$InputData inputData, bdk.j planRewardsRepository, ffk.t pricingPlanInteractor, kbb.c themedVideoPreloader, b0 stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(planRewardsRepository, "planRewardsRepository");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(themedVideoPreloader, "themedVideoPreloader");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f279277p = planRewardsRepository;
        this.f279278q = pricingPlanInteractor;
        this.f279279r = themedVideoPreloader;
        this.f279283x = mra.d.b(this, new d(new Data(null, null, true, 3, null), inputData.f102577b, null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        if (this.o.f102577b == null) {
            yji.l.a1(this, new l1(rd0.e.n(rd0.e.b(this.f279278q.q()), h0.f322473a), 9), null, null, new f0(this, null, 25), 3);
        }
        I2();
    }

    public final void I2() {
        a2 a2Var = this.f279280s;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        a2 a2Var2 = this.f279281t;
        if (a2Var2 != null) {
            a2Var2.f(null);
        }
        a2 a2Var3 = this.v;
        if (a2Var3 != null) {
            a2Var3.f(null);
        }
        this.v = null;
        a2 a2Var4 = this.u;
        if (a2Var4 != null) {
            a2Var4.f(null);
        }
        this.u = null;
        this.f279280s = l2(new y(this, continuation, 0), new ud3.n(this, 2));
    }

    public final void J2(boolean z) {
        a2 a2Var = this.u;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.u = null;
        H2(this.f279283x, new rk.b(z, 25));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f279283x;
    }
}
