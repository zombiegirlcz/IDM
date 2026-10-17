package u47;

import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.review.TaxHubTransactionExportReviewScreenContract$InputData;
import ds6.f0;
import et6.s3;
import gr6.q;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import od0.i;
import w4l.h;
import yji.n;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends n implements g {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TaxHubTransactionExportReviewScreenContract$InputData.Inbound f277267l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r10.d f277268m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q f277269n;

    public a(TaxHubTransactionExportReviewScreenContract$InputData.Inbound inputData, r10.d taxHubCalendarEventsInteractor, q taxHubTransactionExportInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(taxHubCalendarEventsInteractor, "taxHubCalendarEventsInteractor");
        Intrinsics.checkNotNullParameter(taxHubTransactionExportInteractor, "taxHubTransactionExportInteractor");
        this.f277267l = inputData;
        this.f277268m = taxHubCalendarEventsInteractor;
        this.f277269n = taxHubTransactionExportInteractor;
    }

    @Override // u47.g
    public final void P1(LinkedHashSet excludedTransactionIds) {
        Intrinsics.checkNotNullParameter(excludedTransactionIds, "excludedTransactionIds");
        r2().M0(new d(excludedTransactionIds));
    }

    @Override // u47.g
    public final akg.n T() {
        Flow flowA;
        TaxHubTransactionExportReviewScreenContract$InputData.Inbound inbound = this.f277267l;
        String taxCalendarEventId = inbound.e;
        if (taxCalendarEventId == null) {
            i.Companion.getClass();
            flowA = new go.g(zi0.c.P(i.f224256b, false, null, 3), 2);
        } else {
            r10.d dVar = this.f277268m;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(taxCalendarEventId, "taxCalendarEventId");
            h loadingStrategy = h.f294642c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            flowA = nim.a.A(boh.f.e(((zjh.i) dVar.f250819b).j(loadingStrategy), new eq4.c(dVar, taxCalendarEventId, 21)), new u3a.g(26));
        }
        return nim.a.v(u0.m(flowA, ((s3) this.f277269n).a(f0.INBOUND, inbound.f74424a, inbound.f74425b, inbound.f74426c, inbound.d)), new u3a.g(25));
    }
}
