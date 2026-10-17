package o7b;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.modal.reward_selection.CobrandedCardsPlanHubRewardSelectionScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends oki.h implements dli.b {
    public final CobrandedCardsPlanHubRewardSelectionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q5b.b f222744p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f222745q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f222746r;

    public h(n stateMapper, CobrandedCardsPlanHubRewardSelectionScreenContract$InputData inputData, q5b.b cobrandedCardsPlansInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cobrandedCardsPlansInteractor, "cobrandedCardsPlansInteractor");
        this.o = inputData;
        this.f222744p = cobrandedCardsPlansInteractor;
        this.f222745q = new vii.b();
        this.f222746r = mra.d.b(this, new e(new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f222745q, new ns9.h(continuation, this, 15)), null, null, new nwc.f(this, continuation, 29), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f222746r;
    }
}
