package e07;

import efm.r;
import et6.h1;
import et6.h3;
import jki.p;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ma1.v;
import pfm.z;
import skm.p0;
import te0.w;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends jki.g implements g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kda.b f121447p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f121448q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xa1.a f121449r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h1 f121450s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gr6.j f121451t;
    public final h3 u;
    public final r10.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f121452w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kda.b accountClosureExtension, j60.a bottomDialogExtension, xa1.a cardReaderOrderInteractor, h1 freelancerInteractor, gr6.j freelancerInviteCampaignInteractor, h3 freelancerSaleTypeAvailabilityInteractor, r10.f taxHubProfileInteractor, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(accountClosureExtension, "accountClosureExtension");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(cardReaderOrderInteractor, "cardReaderOrderInteractor");
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(freelancerInviteCampaignInteractor, "freelancerInviteCampaignInteractor");
        Intrinsics.checkNotNullParameter(freelancerSaleTypeAvailabilityInteractor, "freelancerSaleTypeAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(taxHubProfileInteractor, "taxHubProfileInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f121447p = accountClosureExtension;
        this.f121448q = bottomDialogExtension;
        this.f121449r = cardReaderOrderInteractor;
        this.f121450s = freelancerInteractor;
        this.f121451t = freelancerInviteCampaignInteractor;
        this.u = freelancerSaleTypeAvailabilityInteractor;
        this.v = taxHubProfileInteractor;
        this.f121452w = new e(0);
    }

    @Override // yji.l
    public final void I1() {
        y2();
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f121452w;
    }

    public final void y2() {
        r rVarC = this.f121450s.c();
        v0f.p pVarC = this.u.c();
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        r rVarC2 = rd0.e.c(pVarC, gVar);
        Continuation continuation = null;
        z zVarO = m70.a.g(((jfc.h) ((mfc.c) this.f121449r).f204988a).f.f(Unit.f186387a, false), null, null, 3).map(new v(28, new md0.c(18))).firstOrError().o(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(zVarO, "onErrorReturnItem(...)");
        r rVarX = zVarO.x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        r rVarC3 = rd0.e.c(this.v.t0(), gVar);
        r rVarX2 = w.o0(p0.f264003c, new i(this, continuation, 0)).x();
        Intrinsics.checkNotNullExpressionValue(rVarX2, "toObservable(...)");
        yji.l.a1(this, rd0.e.b(w.o(rVarC, rVarC2, rVarX, rVarC3, rVarX2)), null, null, new dob.c(this, continuation, 29), 3);
    }
}
