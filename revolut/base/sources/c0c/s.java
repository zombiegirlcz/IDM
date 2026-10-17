package c0c;

import cli.y;
import com.google.common.collect.ImmutableMap;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.api.RevPointsApi$Toggles;
import com.revolut.feature.rev_points.impl.ui.redeem.RevPointsRedeemScreenContract$InputData;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import gld.f0;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends oki.h implements l {
    public final y A;
    public final RevPointsRedeemScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ozb.f f20224p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final nyb.k f20225q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f20226r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Map f20227s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q06.l f20228t;
    public final mkd.d u;
    public final i4b.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final gte.a f20229w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p19.a f20230x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vii.b f20231y;
    public final vii.b z;

    public s(cli.n stateMapper, RevPointsRedeemScreenContract$InputData inputData, ozb.f learnCompletedDialogMapper, nyb.k revPointsInteractor, a aggregatedInteractor, ImmutableMap clickHandlers, q06.l deeplinkRouter, mkd.d slotManagerFeedControllerModelExtension, i4b.f legalEntityContextProvider, gte.a featureToggleInteractor, p19.a lifestyleContentGatewayInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(learnCompletedDialogMapper, "learnCompletedDialogMapper");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(aggregatedInteractor, "aggregatedInteractor");
        Intrinsics.checkNotNullParameter(clickHandlers, "clickHandlers");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(slotManagerFeedControllerModelExtension, "slotManagerFeedControllerModelExtension");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(lifestyleContentGatewayInteractor, "lifestyleContentGatewayInteractor");
        this.o = inputData;
        this.f20224p = learnCompletedDialogMapper;
        this.f20225q = revPointsInteractor;
        this.f20226r = aggregatedInteractor;
        this.f20227s = clickHandlers;
        this.f20228t = deeplinkRouter;
        this.u = slotManagerFeedControllerModelExtension;
        this.v = legalEntityContextProvider;
        this.f20229w = featureToggleInteractor;
        this.f20230x = lifestyleContentGatewayInteractor;
        this.f20231y = new vii.b();
        this.z = new vii.b();
        this.A = mra.d.b(this, new k(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        if (!this.f226127l && this.o.f83843a) {
            ((ozb.g) this.f20224p).getClass();
            X1(new mii.k("LEARN_COMPLETED_ID", new TextLocalisedClause(R$string.rev_points_learn_completed, null, null, 14), null, null, null, 28));
        }
        n nVar = new n(3, this, continuation);
        vii.b bVar = this.f20231y;
        yji.l.a1(this, vkm.q.Q(bVar, nVar), null, null, new o(3, this, null), 3);
        yji.l.a1(this, vkm.q.Q(bVar, new n(1, this, continuation)), null, null, new o(1, this, null), 3);
        yji.l.a1(this, vkm.q.Q(bVar, new n(0, this, continuation)), null, null, new o(0, this, null), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        mkd.a aVar = new mkd.a(new SlotContext(akd.s.REVPOINTS_REDEEM_HUB));
        f0 f0Var = (f0) this.u;
        f0Var.c3(aVar);
        Continuation continuation = null;
        yji.l.b1(this, f0Var.f144638l.h(), null, new o(5, this, null), 3);
        boolean zC = ((jte.d) this.f20229w).c(RevPointsApi$Toggles.RevPointsRedeemHubRewardsForYou.f83469c);
        vii.b bVar = this.z;
        if (zC) {
            yji.l.b1(this, vkm.q.Q(bVar, new n(2, this, continuation)), null, new o(2, this, null), 3);
        } else {
            yji.l.b1(this, vkm.q.Q(bVar, new n(4, this, continuation)), null, new o(4, this, null), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.A;
    }
}
