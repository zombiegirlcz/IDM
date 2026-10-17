package c7b;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_selection.CobrandedCardsSelectionScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends oki.h implements p {
    public final CobrandedCardsSelectionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l6b.i f21909p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f21910q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f21911r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f21912s;

    public t(cli.n stateMapper, CobrandedCardsSelectionScreenContract$InputData inputData, l6b.i planDashboardDataProvider, o planActionHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(planDashboardDataProvider, "planDashboardDataProvider");
        Intrinsics.checkNotNullParameter(planActionHandler, "planActionHandler");
        this.o = inputData;
        this.f21909p = planDashboardDataProvider;
        this.f21910q = planActionHandler;
        this.f21911r = new vii.b(w4l.i.f294643c);
        this.f21912s = mra.d.b(this, new i(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f21911r, new bw4.s(continuation, this, 8)), null, null, new c1i.f(this, continuation, 16), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f21912s;
    }
}
