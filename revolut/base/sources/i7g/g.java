package i7g;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.travel.flights.impl.ui.screen.ticket_rules.TravelFlightsTicketRulesScreenContract$InputData;
import hcj.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends oki.h implements dli.b {
    public final b4g.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vii.b f159297p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f159298q;

    public g(i stateMapper, TravelFlightsTicketRulesScreenContract$InputData inputData, b4g.f repository) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.o = repository;
        this.f159297p = new vii.b();
        this.f159298q = mra.d.b(this, new e(new Data(null, null, true, 3, null), inputData.f93430a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f159297p, new o(continuation, this, 17)), null, null, new i13.d(this, continuation, 22), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f159298q;
    }
}
