package jh9;

import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.feature.pay_bills_taxes.impl.ui_payment.form.amount.FormAmountScreenContract$InputData;
import com.revolut.feature.transfer.core.api.schedule.ScheduleTransferInputData;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import imk.p0;
import ip0.v7;
import java.time.LocalDate;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends oki.h implements k {
    public final wo1.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x02.a f174175p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x02.b f174176q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x02.d f174177r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vo9.a f174178s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zof.f f174179t;
    public final FormAmountScreenContract$InputData u;
    public final y v;

    public p(wo1.b billsInteractor, x02.a pocketInteractor, x02.b quoteInteractor, x02.d quoteRouter, vo9.a pocketMapper, zof.f transferFeatureScreensProvider, FormAmountScreenContract$InputData inputData, q stateMapper) {
        Intrinsics.checkNotNullParameter(billsInteractor, "billsInteractor");
        Intrinsics.checkNotNullParameter(pocketInteractor, "pocketInteractor");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(quoteRouter, "quoteRouter");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = billsInteractor;
        this.f174175p = pocketInteractor;
        this.f174176q = quoteInteractor;
        this.f174177r = quoteRouter;
        this.f174178s = pocketMapper;
        this.f174179t = transferFeatureScreensProvider;
        this.u = inputData;
        dj0.d dVar = inputData.f78786c;
        g gVar = new g(null, null);
        LocalDate localDate = inputData.e;
        this.v = mra.d.b(this, new f(dVar, null, gVar, localDate != null ? new TransferScheduleData(ebm.a.P(localDate), (jli.c) null, 6) : null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new p0(this, continuation, 27), new yi5.b(26));
        yji.l.a1(this, vkm.q.Q(v7.w(this.v.B(new je5.n(23))), new iw6.l(continuation, this, 16)), null, null, new j82.q(this, continuation, 26), 3);
    }

    public final void I2() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pay_bills_taxes_action_continue, null, null, 14);
        List listC = u.c(jli.c.PERIOD_SELECTION_NONE);
        TransferScheduleData transferScheduleData = ((f) ((j2) this.v.f22677a).getValue()).d;
        if (transferScheduleData == null) {
            transferScheduleData = new TransferScheduleData(0L, (jli.c) null, 7);
        }
        yji.l.g2(this, ((qpf.h) this.f174179t).d(new ScheduleTransferInputData((TextLocalisedClause) null, transferScheduleData, m1l.a.SCHEDULE_REQUIRED, textLocalisedClause, listC, false, (AnalyticsContext) null, (LocalDate) null, (LocalDate) null, false, false, false, 4065)), null, new m(this, 0), 1);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
