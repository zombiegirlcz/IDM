package a15;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.health.impl.domain.model.CreditScoreDetails;
import com.revolut.feature.credit.health.impl.domain.model.ScoreSnapshot;
import com.revolut.feature.credit.health.impl.ui.insights.InsightsScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import vkm.q;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends oki.h implements dli.b {
    public final r05.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j2 f541p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f542q;

    public m(p stateMapper, InsightsScreenContract$InputData inputData, r05.f insightsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(insightsInteractor, "insightsInteractor");
        this.o = insightsInteractor;
        CreditScoreDetails creditScoreDetails = inputData.f70000a;
        this.f541p = q.c(((ScoreSnapshot) d0.m0(creditScoreDetails.f69959a)).f69993a);
        this.f542q = mra.d.b(this, new h(creditScoreDetails, ((ScoreSnapshot) d0.m0(creditScoreDetails.f69959a)).f69993a, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.n(q.Q(this.f541p, new a0e.m(continuation, this, 1)), h0.f322473a), null, null, new a0l.k(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f542q;
    }
}
