package j6b;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.plan_hub.CobrandedCardsPlanHubFlowContract$InputData;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.plan_hub.CobrandedCardsPlanHubFlowContract$PagerItem;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends oki.h implements ali.h {
    public final CobrandedCardsPlanHubFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q5b.b f171730p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f171731q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f171732r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ali.b f171733s;

    public j(n stateMapper, CobrandedCardsPlanHubFlowContract$InputData inputData, q5b.b cobrandedCardsPlansInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cobrandedCardsPlansInteractor, "cobrandedCardsPlansInteractor");
        this.o = inputData;
        this.f171730p = cobrandedCardsPlansInteractor;
        CobrandedCardsPlanHubFlowContract$PagerItem cobrandedCardsPlanHubFlowContract$PagerItem = CobrandedCardsPlanHubFlowContract$PagerItem.OVERVIEW;
        List listK = v.k(cobrandedCardsPlanHubFlowContract$PagerItem, CobrandedCardsPlanHubFlowContract$PagerItem.TRANSACTIONS);
        this.f171731q = listK;
        this.f171732r = mra.d.b(this, new c(listK, cobrandedCardsPlanHubFlowContract$PagerItem.getF94249a(), new Data(null, null, true, 3, null), false, null), stateMapper, null, false, 12);
        this.f171733s = s.b(this, new j2c.n(this, 12));
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f171733s;
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, ((c6b.i) this.f171730p).a(w4l.h.f294642c), null, null, new iug.j(this, (Continuation) null, 27), 3);
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f171732r;
    }
}
