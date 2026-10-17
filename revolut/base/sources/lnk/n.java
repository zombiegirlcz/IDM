package lnk;

import cli.y;
import com.revolut.data.model.Data;
import ffk.t;
import jgk.v;
import jgk.x;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends oki.h implements i {
    public final t o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f197303p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f197304q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mre.c f197305r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cha.b f197306s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f197307t;
    public final y u;

    public n(t pricingPlanInteractor, x pricingPlansFooterClauseProvider, v pricingPlanTermsNavigationCommandsProvider, mre.c termsNavigationFactory, cha.b familyPlansInteractor, f inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(pricingPlansFooterClauseProvider, "pricingPlansFooterClauseProvider");
        Intrinsics.checkNotNullParameter(pricingPlanTermsNavigationCommandsProvider, "pricingPlanTermsNavigationCommandsProvider");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(familyPlansInteractor, "familyPlansInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = pricingPlanInteractor;
        this.f197303p = pricingPlansFooterClauseProvider;
        this.f197304q = pricingPlanTermsNavigationCommandsProvider;
        this.f197305r = termsNavigationFactory;
        this.f197306s = familyPlansInteractor;
        this.f197307t = inputData;
        this.u = mra.d.b(this, new e(new Data(null, null, true, 3, null), inputData.f197294a, inputData.f197295b, false, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        wkm.l lVarA;
        f fVar = this.f197307t;
        boolean z = fVar.f197295b;
        hha.d plan = fVar.f197294a;
        Continuation continuation = null;
        if (z) {
            lVarA = q.Q(q.q(this.u.B(new llb.e(25))), new li2.f(continuation, this, 6));
        } else {
            lVarA = ((ejk.e) this.f197303p).a(plan, hha.i.ANNUAL);
        }
        yji.l.a1(this, lVarA, null, null, new l(this, null, 0), 3);
        hha.i billingCode = hha.i.ANNUAL;
        t tVar = this.o;
        tVar.getClass();
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(billingCode, "billingCode");
        yji.l.a1(this, rd0.e.b(t.u(tVar, plan.f152287a, billingCode, false, 12)), null, null, new l(this, null, 1), 3);
        l2(new k(this, null), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
