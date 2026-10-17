package use;

import ak7.g;
import akg.n;
import com.revolut.data.model.Data;
import com.revolut.shared.feature.selfserve.entity.config.api.repository.EntityConfigRepository$Params;
import efm.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import qsa.p;
import qse.i;
import uo7.k;
import w4l.h;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f282891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bal.a f282892b;

    public d(i ticketsRepository, bal.a entityConfigRepository) {
        Intrinsics.checkNotNullParameter(ticketsRepository, "ticketsRepository");
        Intrinsics.checkNotNullParameter(entityConfigRepository, "entityConfigRepository");
        this.f282891a = ticketsRepository;
        this.f282892b = entityConfigRepository;
    }

    public final n a(String ticketId) {
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        ayc.i iVar = (ayc.i) this.f282892b;
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        EntityConfigRepository$Params.Ticket params = new EntityConfigRepository$Params.Ticket(ticketId);
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(nim.a.v(nim.a.v(iVar.f.b(params, loadingStrategy), new ayc.a(iVar, 4)), new g(ticketId, 19)), new k(ticketId, 6));
    }

    public final Flow b(List ticketIds, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(ticketIds, "ticketIds");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        if (ticketIds.isEmpty()) {
            return new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
        }
        ArrayList<List> arrayListS = d0.S(ticketIds, 50);
        ArrayList arrayList = new ArrayList(w.t(arrayListS, 10));
        for (List ticketIds2 : arrayListS) {
            ayc.i iVar = (ayc.i) this.f282892b;
            Intrinsics.checkNotNullParameter(ticketIds2, "ticketIds");
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            arrayList.add(nim.a.v(nim.a.v(iVar.f11132g.b(ticketIds2, loadingStrategy), new ayc.a(iVar, 5)), new s78.n(ticketIds2, 27)));
        }
        return nim.a.v(u0.k(arrayList), b.f);
    }

    public final r c(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        r rVarFilter = this.f282891a.f.e(Unit.f186387a, loadingStrategy).filter(new qsa.a(9, new p(5)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filterEmptyData(...)");
        r rVarDistinctUntilChanged = rVarFilter.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return nim.a.w(rVarDistinctUntilChanged, new k(transactionId, 5));
    }

    public final pfm.r d(String ticketId) {
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        Intrinsics.checkNotNullParameter(ticketId, "ticketId");
        i iVar = this.f282891a;
        pfm.a aVar = new pfm.a(iVar.f248813a.setTicketSeen(ticketId).l(new oma.r(iVar, 17)), new qsa.a(8, new p(4)), 1);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorComplete(...)");
        return te0.w.g0(aVar);
    }
}
