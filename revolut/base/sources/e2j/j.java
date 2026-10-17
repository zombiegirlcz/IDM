package e2j;

import c12.c0;
import com.revolut.chat.ui.inbox.InboxScreenContract$DomainState;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.data.network.models.topup.McyTransferReviewDto;
import com.revolut.data.network.models.topup.MultiCurrencyTransferReviewRequest;
import com.revolut.feature.credit.application.plugins.impl.ui.amount_input.CreditAmountInputScreenContract$InputData;
import com.revolut.feature.freelancer.common.models.tax_hub.TaxHubCalendarEvent;
import com.revolut.feature.freelancer.impl.ui.tax_hub.hub.flow.TaxHubFlowContract$Step;
import com.revolut.feature.in_app_calls.InAppCallStateWithData;
import com.revolut.feature.masav.impl.ui.payment_authorisation.confirmation.interactor.PaymentAuthorisationExpiredException;
import com.revolut.kompot.common.flow.permissions.a;
import com.revolut.retail.feature.balance.picker.api.R$string;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import com.revolut.revolut.feature_fourthline_impl.R;
import dfl.i0;
import e3i.s;
import e60.y;
import grl.r2;
import ip0.nb0;
import ip0.pb0;
import ip0.yl;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import r10.v;
import skm.a2;
import v30.e1;
import vkm.j2;
import x15.a0;
import x15.b0;
import x15.z;
import xq3.w;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f122129b;

    public /* synthetic */ j(q qVar, f fVar) {
        this.f122128a = 1;
        this.f122129b = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        e60.i iVarA;
        int i = this.f122128a;
        int i2 = 14;
        int i3 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object obj3 = this.f122129b;
        switch (i) {
            case 0:
                o oVar = (o) obj3;
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return nim.a.w(oVar.I2(), new e1.b(oVar, it8, 9));
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new h(new TextLocalisedClause(R$string.currency_picker_accessibility_label, u.c(((f) obj3).f122122c), null, 12), q.a(), false);
            case 2:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return (e1) ((e30.e) obj3).f122166b.get("chat_ws_config");
            case 3:
                MultiCurrencyTransferReviewRequest params = (MultiCurrencyTransferReviewRequest) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (McyTransferReviewDto) ((e31.j) obj3).f122183g.get(params);
            case 4:
                c35.f fVar = (c35.f) obj3;
                b0 application = (b0) obj2;
                Intrinsics.checkNotNullParameter(application, "application");
                if (application instanceof z) {
                    return nim.a.v(w.a(fVar.f20891b, r2.ADD_NEW_PRODUCT), new e1d.h(fVar, 10));
                }
                if (application instanceof a0) {
                    return new go.g(new Data(null, null, false, 6, null), 2);
                }
                throw new NoWhenBranchMatchedException();
            case 5:
                com.revolut.feature.freelancer.impl.ui.tax_hub.hub.flow.c cVar = (com.revolut.feature.freelancer.impl.ui.tax_hub.hub.flow.c) obj3;
                g37.q result = (g37.q) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, g37.l.f140220a)) {
                    oki.h.t2(cVar, cVar.f74283t, TaxHubFlowContract$Step.TaxSettings.f74274a, true, null, false, 12);
                } else if (result instanceof g37.m) {
                    yki.i iVar = cVar.f74283t;
                    TaxHubCalendarEvent taxHubCalendarEvent = ((g37.m) result).f140221a;
                    oki.h.t2(cVar, iVar, new TaxHubFlowContract$Step.TaxAssessment(taxHubCalendarEvent.f73484b, taxHubCalendarEvent.f73483a), true, null, false, 12);
                } else if (Intrinsics.f(result, g37.n.f140222a)) {
                    cVar.n2(new com.revolut.feature.freelancer.impl.ui.tax_hub.hub.flow.a(cVar, null), new whi.b(6));
                } else if (result instanceof g37.o) {
                    oki.h.t2(cVar, cVar.f74283t, new TaxHubFlowContract$Step.TaxProfile(((g37.o) result).f140223a, true), true, null, false, 12);
                } else {
                    if (!Intrinsics.f(result, g37.p.f140224a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.t2(cVar, cVar.f74283t, TaxHubFlowContract$Step.TransactionExport.f74275a, true, null, false, 12);
                }
                return Unit.f186387a;
            case 6:
                e3i.j update = (e3i.j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return e3i.j.a(update, 0L, null, (e3i.l) obj3, null, true, false, 1727);
            case 7:
                e3i.j update2 = (e3i.j) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                long j2 = ((s) obj3).o.f96979c;
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                return e3i.j.a(update2, j2, ZERO, null, null, false, false, 1788);
            case 8:
                e3i.j update3 = (e3i.j) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return e3i.j.a(update3, 0L, null, null, (e3i.k) obj3, false, false, 1919);
            case 9:
                v vVar = (v) obj3;
                List<w30.n> tickets = (List) obj2;
                Intrinsics.checkNotNullParameter(tickets, "tickets");
                ArrayList arrayList = new ArrayList();
                for (w30.n nVar : tickets) {
                    e40.w wVar = (e40.w) vVar.f250864c;
                    w30.n nVarA = w30.n.a(nVar, null, null, null, 523775);
                    n40.a aVar = n40.b.Companion;
                    zhm.a0.x(wVar.d(nVarA, false), arrayList);
                }
                return arrayList;
            case 10:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                ((com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog.b) obj3).C2(c0.f20324a);
                return Boolean.FALSE;
            case 11:
                e44.a params2 = (e44.a) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return (lv3.a) ((e44.b) obj3).f122384c.get(params2.f122381a.f137835a);
            case 12:
                e4b.q qVar = (e4b.q) obj3;
                i0 trade = (i0) obj2;
                Intrinsics.checkNotNullParameter(trade, "trade");
                if (trade instanceof dfl.v) {
                    return ((dfl.v) trade).f114502s;
                }
                throw new IllegalStateException(p.a.p("trade ", ((e4b.e) ((j2) qVar.f122537t.f22677a).getValue()).f122518a.f114490a, " should be OvernightFee"));
            case 13:
                a3h.d update4 = (a3h.d) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return a3h.d.a(update4, null, (a3h.f) obj3, 1);
            case 14:
                BankTransferData updateTransferData = (BankTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                return BankTransferData.a(updateTransferData, 0L, null, null, null, null, null, null, null, null, ((fpf.b) obj3).f137095a, null, null, null, 1044479);
            case 15:
                return InboxScreenContract$DomainState.a((InboxScreenContract$DomainState) obj2, null, null, null, (InAppCallStateWithData) obj3, null, false, false, null, null, 503);
            case 16:
                CreditAmountInputScreenContract$InputData creditAmountInputScreenContract$InputData = (CreditAmountInputScreenContract$InputData) obj3;
                e54.m mVar = (e54.m) obj2;
                long j3 = creditAmountInputScreenContract$InputData.f67036a;
                long j5 = creditAmountInputScreenContract$InputData.f67037b;
                Long l2 = creditAmountInputScreenContract$InputData.f67038c;
                String strValueOf = l2 != null ? String.valueOf(l2.longValue()) : null;
                if (strValueOf == null) {
                    strValueOf = "";
                }
                return e54.m.a(mVar, j3, j5, l2, strValueOf, creditAmountInputScreenContract$InputData.e, creditAmountInputScreenContract$InputData.f67039g, creditAmountInputScreenContract$InputData.f67041j, false, creditAmountInputScreenContract$InputData.f67040h, creditAmountInputScreenContract$InputData.i, false, 2336);
            case 17:
                com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.flow.a aVar2 = (com.revolut.feature.freelancer.impl.ui.vat_reminder.settings.flow.a) obj3;
                g57.k result2 = (g57.k) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (!Intrinsics.f(result2, g57.i.f140675a) && !Intrinsics.f(result2, g57.j.f140676a)) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.D2(aVar2.o);
                return Unit.f186387a;
            case 18:
                y yVar = (y) obj3;
                com.revolut.kompot.common.flow.permissions.a result3 = (com.revolut.kompot.common.flow.permissions.a) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (Intrinsics.f(result3, a.C0596a.f98352a)) {
                    e60.h hVar = yVar.f122877q;
                    if (((hVar == null || (iVarA = hVar.a()) == null) ? null : iVarA.f122856n) == oli.m.DOCUMENT_SCANNER && yVar.h3() && yVar.o.isPresent()) {
                        a2 a2Var = yVar.f122880t;
                        if (a2Var != null) {
                            a2Var.f(null);
                        }
                        yVar.f122880t = yVar.T2(new e60.w(yVar, objArr == true ? 1 : 0, 3), new yi5.b(27));
                    } else {
                        yVar.i3();
                    }
                }
                return Unit.f186387a;
            case 19:
                com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.flow.a aVar3 = (com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.flow.a) obj3;
                g65.f output = (g65.f) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof g65.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar3.l2(new dz6.o(aVar3, output, objArr2 == true ? 1 : 0, 23), new yi5.b(26));
                return Unit.f186387a;
            case 20:
                e69.u uVar = (e69.u) obj3;
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (it9 instanceof PaymentAuthorisationExpiredException) {
                    yji.l.a1(uVar, uVar.X1(new y0("EXPIRED_DIALOG_ID", new nii.z(new TextLocalisedClause(R.string.transaction_threeds_timedout, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4)), null, null, new dze.n(uVar, objArr3 == true ? 1 : 0, i2), 3);
                }
                return Unit.f186387a;
            case 21:
                yvh.d dVar = (yvh.d) obj3;
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list) {
                    if (((yvh.b) obj4).k == dVar) {
                        arrayList2.add(obj4);
                    }
                }
                return arrayList2;
            case 22:
                e76.b params3 = (e76.b) obj2;
                Intrinsics.checkNotNullParameter(params3, "params");
                return (e8l.d) ((e76.d) obj3).f123088b.get(params3.f123086c);
            case 23:
                com.revolut.feature.giro.impl.ui.review.a aVar4 = (com.revolut.feature.giro.impl.ui.review.a) obj3;
                h1j.b result4 = (h1j.b) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (result4 instanceof h1j.d) {
                    aVar4.H2(aVar4.f74560q, new e77.j(result4, i3));
                }
                return Unit.f186387a;
            case 24:
                e7b.h hVar2 = (e7b.h) obj3;
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                yji.l.a1(hVar2, hVar2.X1(new y0(null, new nii.z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.error_generic, null, null, 14), null, new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 5)), null, null, new e7b.g(hVar2, null), 3);
                return Boolean.TRUE;
            case 25:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                ((e7e.a) obj3).L2(q7e.b.a());
                return Boolean.TRUE;
            case 26:
                e7f.b bVar = (e7f.b) obj3;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list2 = (List) pair.f186385a;
                del.b bVar2 = (del.b) pair.f186386b;
                vel.l lVar = (vel.l) d0.d0(list2);
                if (lVar == null) {
                    return null;
                }
                ael.z zVar = bVar.d;
                dj0.d dVarQ = mif.a.Q(bVar2.f113708a);
                vel.k kVar = lVar.f288366c;
                return zVar.a(dVarQ, kVar.f288362a, kVar.f288363b);
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return yp0.b.g(zhm.v.k(new yl("ManagedPortfolioPerformanceSummaryExtensionMapper_header_loading", 0, 30), nb0.b(pb0.Companion, "ManagedPortfolioPerformanceSummaryExtensionMapper_row_loading", false, 0, false, 30)), ((e7f.i) obj3).f123325c, null, 0, 0, 126);
            case 28:
                e7f.k kVar2 = (e7f.k) obj3;
                Pair pair2 = (Pair) obj2;
                List list3 = (List) pair2.f186385a;
                del.b bVar3 = (del.b) pair2.f186386b;
                vel.l lVar2 = (vel.l) d0.d0(list3);
                if (lVar2 == null) {
                    return null;
                }
                ael.z zVar2 = kVar2.f123329p;
                dj0.d dVarQ2 = mif.a.Q(bVar3.f113708a);
                vel.k kVar3 = lVar2.f288366c;
                return zVar2.a(dVarQ2, kVar3.f288362a, kVar3.f288363b);
            default:
                e7i.j update5 = (e7i.j) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return e7i.j.a(update5, 0L, (ibd.j) obj3, 11);
        }
    }

    public /* synthetic */ j(Object obj2, int i) {
        this.f122128a = i;
        this.f122129b = obj2;
    }
}
