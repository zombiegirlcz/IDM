package k1;

import ael.t;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazySaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import aw0.k8;
import aw0.l8;
import aw0.o9;
import ch.qos.logback.core.CoreConstants;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.chat.domain.model.ChatMode;
import com.revolut.core.chaosmanagement.ui.model.ChaosManagementIncidentUiItem;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CustomColors;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.credit.application.plugins.api.ui.prompts.PromptApplicationCancellation;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.LoanCancellationV2FlowContract$State;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.TaxHubTransactionExportFlowContract$State;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.TaxHubTransactionExportFlowContract$Step;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import com.revolut.feature_exchange.impl.R$string;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import ds6.y;
import efm.r;
import et6.h1;
import et6.i2;
import i2l.e0;
import io3.i;
import ip0.cs;
import ip0.ky;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import jel.e2;
import jel.v2;
import k1g.n;
import k1i.g;
import k1i.h;
import k1i.j;
import k1j.d;
import k25.u;
import k3k.t0;
import k3k.x;
import k50.b1;
import k50.j0;
import k50.j4;
import k50.k0;
import k50.m1;
import k50.o0;
import k50.s2;
import k50.s3;
import k50.v0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import kotlin.text.d0;
import kotlinx.coroutines.CoroutineScope;
import mha.k;
import mha.o;
import mha.p;
import mha.s;
import org.jmrtd.cbeff.ISO781611;
import pfm.m;
import r10.w;
import rd0.e;
import skm.p0;
import tof.i1;
import tof.i7;
import tof.q6;
import tof.q7;
import tof.u9;
import tof.ua;
import v20.q2;
import vkm.j2;
import y1h.f;
import yw4.l;
import zhm.a1;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f180068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f180069c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f180067a = i;
        this.f180068b = obj2;
        this.f180069c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v34 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        final Clause textClause;
        final int i;
        n nVar;
        r rVarW;
        String str;
        String str2;
        l8 l8VarA;
        l8 l8VarA2;
        TextLocalisedClause textLocalisedClause;
        UUID uuid;
        int i2 = 22;
        int i3 = 26;
        int i5 = 2;
        int i6 = 1;
        ?? r132 = 0;
        l8 l8VarA3 = null;
        num = null;
        Integer num = null;
        r132 = 0;
        switch (this.f180067a) {
            case 0:
                return AwaitFirstLayoutModifier.Node.requestOnAfterLayoutCallback$lambda$0((AwaitFirstLayoutModifier.Node) this.f180068b, (AwaitFirstLayoutModifier) this.f180069c, (RelativeLayoutBounds) obj2);
            case 1:
                return LazySaveableStateHolder.Companion.saver$lambda$1((SaveableStateRegistry) this.f180068b, (SaveableStateHolder) this.f180069c, (Map) obj2);
            case 2:
                g gVar = (g) this.f180068b;
                final j jVar = (j) this.f180069c;
                s planLimit = (s) obj2;
                Intrinsics.checkNotNullParameter(planLimit, "planLimit");
                p pVar = planLimit.f205467h;
                k kVar = planLimit.f205466g;
                if (pVar != null && kVar != null) {
                    Intrinsics.checkNotNullParameter(pVar, "<this>");
                    if (pVar instanceof mha.n) {
                        textClause = new MoneyClause(((mha.n) pVar).f205461a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                    } else {
                        if (!(pVar instanceof o)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textClause = new TextClause(String.valueOf(((o) pVar).f205462a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    }
                    final Clause clauseA = k1i.a.a(kVar);
                    int i21 = h.f180277a[gVar.ordinal()];
                    if (i21 == 1) {
                        i = R$string.fx_orders_fee_alert_message;
                    } else {
                        if (i21 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R$string.fx_orders_fee_alert_limit_message;
                    }
                    pfm.h hVar = new pfm.h(new kfm.a() { // from class: k1i.e
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kfm.a
                        public final void run() {
                            ((npi.c) jVar.i).R(new rp0.b("FEE_DIALOG", new TextLocalisedClause(R$string.fx_orders_fee_alert_title, null, null, 14), new TextLocalisedClause(i, v.k(textClause, clauseA), null, 12), new TextLocalisedClause(R$string.fx_orders_fee_alert_action_upgrade, null, null, 14), new TextLocalisedClause(R$string.fx_orders_fee_alert_action_got_it, null, null, 14), null, null, false, 992));
                        }
                    }, i5);
                    Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                    r132 = hVar;
                }
                if (r132 != 0) {
                    return r132;
                }
                m mVar = m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            case 3:
                u uVar = (u) this.f180068b;
                yw4.p pVar2 = (yw4.p) this.f180069c;
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return uVar.f180350c.a(u.r(uVar, (CreditCard) rVar.f314201a, (ll4.o) ((Map) rVar.f314202b).get(pVar2.f317325a), l.SPEND_ONLY, (wi0.b) rVar.f314203c, f0.f322471a));
            case 4:
                u uVar2 = (u) this.f180068b;
                ProductAccountId productAccountId = (ProductAccountId) this.f180069c;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String pocketId = (String) pair.f186385a;
                xi0.b bVar = (xi0.b) pair.f186386b;
                RecurringPaymentFilter.And andB = uVar2.f180360s.b(new h9e.a(productAccountId.f89729a, pocketId));
                Intrinsics.checkNotNullParameter(pocketId, "pocketId");
                ua uaVar = new ua(pocketId);
                i7.c cVar = i7.Companion;
                i7[] i7VarArr = {new u9(false), uaVar};
                cVar.getClass();
                q7 q7VarA = i7.c.a(i7VarArr);
                TransactionContext transactionContext = u.u;
                List listC = zhm.u.c(i1.f272794a);
                ProductId productId = ProductId.CREDIT;
                return new ssi.n(q7VarA, new nce.b(andB, bVar.f306286a), transactionContext, listC, new TransactionListDestination(new TransactionListDestination.InputData((Clause) null, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) new TransactionsListFilterType.ByAccounts(new ProductAccountDescriptor$Value.Main(productAccountId, productId), transactionContext), (String) null, (AccountId) null, (rhf.h) null, rhf.g.CREDIT_CARD_HOME, (TransactionDestination) null, (q6) null, (Set) null, (RecurringPaymentAccount) null, (RecurringPaymentFilter) andB, false, 57071)), null, null, new ProductAccountDescriptor$Value.Main(productAccountId, productId), null, 864);
            case 5:
                k2h.n nVar2 = (k2h.n) this.f180068b;
                f fVar = (f) this.f180069c;
                List instrumentWithTickers = (List) obj2;
                Intrinsics.checkNotNullParameter(instrumentWithTickers, "instrumentWithTickers");
                List list = instrumentWithTickers;
                nVar2.getClass();
                int i22 = k2h.k.f180590a[fVar.ordinal()];
                if (i22 == 1) {
                    nVar = new n(21);
                } else {
                    if (i22 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar = new n(i2);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (((Boolean) nVar.invoke(obj3)).booleanValue()) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 6:
                k2h.n nVar3 = (k2h.n) this.f180068b;
                String str3 = (String) this.f180069c;
                xi0.b selectedCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
                return e.b(t.d(nVar3.f180593q, str3, false, null, selectedCurrency, false, null, 50));
            case 7:
                w wVar = (w) this.f180068b;
                d dVar = (d) this.f180069c;
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                wVar.getClass();
                int i32 = k2j.b.f180600a[dVar.ordinal()];
                if (i32 == 1) {
                    rVarW = nim.a.w(osg.b.e((wsg.n) wVar.f250865a, false, null, null, i.INTERNAL, io3.j.PERSONAL, qsg.a.RECENT_FIRST, null, 70), new n(28));
                } else {
                    if (i32 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h1 h1Var = (h1) wVar.f250866b;
                    w4l.h loadingStrategy = w4l.h.f294642c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    rVarW = e.c(((i2) h1Var.e).c(loadingStrategy), kotlin.coroutines.g.f186406a);
                }
                return nim.a.w(rVarW, new e0(it8, 29));
            case 8:
                k30.a aVar = (k30.a) this.f180068b;
                UUID agentId = (UUID) this.f180069c;
                Intrinsics.checkNotNullParameter((p20.b) obj2, "it");
                s20.d dVar2 = aVar.f180613a;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(agentId, "agentId");
                return new pfm.a(dVar2.e.g(agentId, false), mfm.f.f205044g, i6);
            case 9:
                List list2 = (List) this.f180068b;
                Regex regex = ((com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.b) this.f180069c).f74309s;
                List beneficiaries = (List) obj2;
                Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : beneficiaries) {
                    f5j.a aVar2 = (f5j.a) obj4;
                    List list3 = list2;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it9 = list3.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                y yVar = (y) it9.next();
                                String str4 = yVar.f117254b;
                                String str5 = yVar.f117255c;
                                if (str4 != null && str5 != null) {
                                    String strReplace = regex.replace(str4, "");
                                    Map map = aVar2.u;
                                    if (Intrinsics.f(strReplace, (map == null || (str2 = (String) map.get("ACCOUNT_NUMBER")) == null) ? null : regex.replace(str2, ""))) {
                                        String strReplace2 = regex.replace(str5, "");
                                        Map map2 = aVar2.u;
                                        if (Intrinsics.f(strReplace2, (map2 == null || (str = (String) map2.get("SORT_CODE")) == null) ? null : regex.replace(str, ""))) {
                                            arrayList2.add(obj4);
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                }
                return arrayList2;
            case 10:
                t0 t0Var = (t0) this.f180068b;
                RemittanceTransferData remittanceTransferData = (RemittanceTransferData) this.f180069c;
                dpf.c output = (dpf.c) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof dpf.a)) {
                    if (!(output instanceof dpf.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    t0Var.B2(new bg2.p(output, 7));
                    if (remittanceTransferData.f102053h == m1l.a.SCHEDULE_REQUIRED) {
                        t0Var.v2(new k3k.y(t0Var.A2()));
                    }
                }
                return Unit.f186387a;
            case 11:
                t0 t0Var2 = (t0) this.f180068b;
                String str6 = (String) this.f180069c;
                RemittanceTransferData updateTransferData = (RemittanceTransferData) obj2;
                Intrinsics.checkNotNullParameter(updateTransferData, "$this$updateTransferData");
                return RemittanceTransferData.a(updateTransferData, t0Var2.H.b(str6, updateTransferData.f102050b.f306286a), null, null, null, null, null, null, null, null, null, null, 8190);
            case 12:
                kq2.c cVar2 = (kq2.c) this.f180068b;
                x xVar = (x) this.f180069c;
                k3k.w updateState = (k3k.w) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                RemittanceTransferData remittanceTransferData2 = updateState.f180805c;
                return k3k.w.a(updateState, remittanceTransferData2 != null ? RemittanceTransferData.a(remittanceTransferData2, 0L, null, null, null, null, null, null, null, null, cVar2, null, 7167) : null, xVar, null, 0, 51);
            case 13:
                Function1 function1 = (Function1) this.f180068b;
                t0 t0Var3 = (t0) this.f180069c;
                k3k.w updateState2 = (k3k.w) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return k3k.w.a(updateState2, (RemittanceTransferData) function1.invoke(t0Var3.A2()), null, null, 0, 59);
            case 14:
                t0 t0Var4 = (t0) this.f180068b;
                xi0.b targetCurrency = (xi0.b) this.f180069c;
                k3k.w wVar2 = (k3k.w) obj2;
                o3k.g gVar2 = t0Var4.f180793q;
                gVar2.getClass();
                Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
                wi0.b bVar2 = gVar2.f221843a.getF102028a().f101977a;
                wi0.b.Companion.getClass();
                if (Intrinsics.f(bVar2, wi0.b.p0)) {
                    xi0.b.Companion.getClass();
                    if (Intrinsics.f(targetCurrency, xi0.b.f306273h)) {
                        num = 18;
                    }
                }
                return k3k.w.a(wVar2, null, null, num, 0, 47);
            case 15:
                com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.c cVar3 = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.c) this.f180068b;
                TaxHubTransactionExportFlowContract$Step.Filter filter = (TaxHubTransactionExportFlowContract$Step.Filter) this.f180069c;
                i47.i result = (i47.i) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                if (result.f > 100) {
                    cVar3.l2(new fc0.e(14, filter.f74390a, cVar3, filter.f74391b, result.f158291b, h0.f322473a, (Continuation) null), new yi5.b(i3));
                } else {
                    cVar3.H2(cVar3.f74401t, new k0d.c(result, i));
                    oki.h.t2(cVar3, cVar3.f74400s, new TaxHubTransactionExportFlowContract$Step.Review(com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.a.INBOUND, filter.f74390a, filter.f74391b), true, null, false, 12);
                }
                return Unit.f186387a;
            case 16:
                com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.c cVar4 = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.c) this.f180068b;
                qki.d dVar3 = cVar4.f74401t;
                TaxHubTransactionExportFlowContract$Step.Review review = (TaxHubTransactionExportFlowContract$Step.Review) this.f180069c;
                s47.m result2 = (s47.m) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof s47.k) {
                    cVar4.H2(dVar3, new k0d.c(result2, 15));
                    oki.h.t2(cVar4, cVar4.f74400s, new TaxHubTransactionExportFlowContract$Step.Review(com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.a.OUTBOUND, review.f74394b, review.f74395c), true, null, false, 12);
                } else {
                    if (!(result2 instanceof s47.l)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LinkedHashSet linkedHashSetL = a1.l(((TaxHubTransactionExportFlowContract$State) ((j2) dVar3.f22677a).getValue()).f74388c, ((s47.l) result2).f259789a);
                    cVar4.H2(dVar3, new an9.t(linkedHashSetL, 9));
                    cVar4.l2(new fc0.e(14, review.f74394b, cVar4, review.f74395c, ((TaxHubTransactionExportFlowContract$State) ((j2) dVar3.f22677a).getValue()).f74387b, linkedHashSetL, (Continuation) null), new yi5.b(i3));
                }
                return Unit.f186387a;
            case 17:
                UUID uuid2 = (UUID) this.f180068b;
                q2 q2Var = (q2) this.f180069c;
                k50.h0 update = (k50.h0) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                m1 m1Var = update.d;
                k50.a1 a1Var = update.A;
                Map map3 = m1Var.f181181g;
                return (map3.containsKey(uuid2) || (q2Var == q2.AVAILABLE && !d0.W(a1Var.f181022b) && ((Set) a1Var.e.getValue()).contains(uuid2))) ? k50.h0.a(update, null, null, null, m1.a(update.d, null, null, null, null, null, null, r0.l(uuid2, map3), 0, null, 895), null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435447) : k50.h0.a(update, null, null, null, m1.a(update.d, null, null, null, null, null, null, r0.q(map3, new Pair(uuid2, q2Var)), 0, null, 895), null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435447);
            case 18:
                j4 j4Var = (j4) this.f180068b;
                Object obj5 = this.f180069c;
                Intrinsics.checkNotNullParameter((r50.d) obj2, "it");
                j4Var.l2(new s3(j4Var, ((ChaosManagementIncidentUiItem) obj5).f51357a, r132, i6), new yi5.b(i3));
                return Unit.f186387a;
            case 19:
                j4 j4Var2 = (j4) this.f180068b;
                v30.j jVar2 = (v30.j) this.f180069c;
                k50.h0 update2 = (k50.h0) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return j4Var2.f3(update2, new Data(jVar2, null, false, 6, null));
            case 20:
                o30.c cVar5 = (o30.c) this.f180068b;
                ArrayList arrayList3 = (ArrayList) this.f180069c;
                k50.h0 update3 = (k50.h0) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                o0 o0Var = update3.e;
                x30.b bVar3 = cVar5.f221672a;
                CharSequence charSequence = bVar3.f302603a;
                if (charSequence == null) {
                    charSequence = o0Var.f181192a;
                }
                o0 o0VarA = o0.a(o0Var, charSequence, o0Var.f181193b + 100, cVar5.f221673b, bVar3.f302605c, false, arrayList3, bVar3.e, 16);
                x30.c cVar6 = cVar5.f221672a.e;
                if (cVar6 != null) {
                    l8.Companion.getClass();
                    l8VarA = k8.a(cVar6);
                } else {
                    l8VarA = null;
                }
                if (update3.f181094x == v0.PROMPT) {
                    k8 k8Var = l8.Companion;
                    v0 v0Var = v0.MESSAGES;
                    k8Var.getClass();
                    l8VarA3 = k8.a(v0Var);
                }
                return k50.h0.a(update3, null, null, null, null, o0VarA, null, null, null, null, null, false, false, null, null, null, null, false, null, null, l8VarA, null, l8VarA3, null, null, 247463919);
            case 21:
                s2 s2Var = (s2) this.f180068b;
                List list4 = (List) this.f180069c;
                k50.h0 update4 = (k50.h0) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                k50.a1 a1Var2 = update4.A;
                if (!a1Var2.f181021a) {
                    return update4;
                }
                k50.a1 a1VarA = k50.a1.a(a1Var2, s2Var.f181238a, list4, 0, 1);
                if (s2Var.f181239b) {
                    k8 k8Var2 = l8.Companion;
                    j0 j0Var = j0.f181115a;
                    k8Var2.getClass();
                    l8VarA2 = k8.a(j0Var);
                } else {
                    l8VarA2 = update4.u;
                }
                return k50.h0.a(update4, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, l8VarA2, null, null, null, null, null, a1VarA, 200278015);
            case 22:
                v20.n nVar4 = (v20.n) this.f180068b;
                String str7 = (String) this.f180069c;
                k50.h0 update5 = (k50.h0) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                o0 o0VarA2 = o0.a(update5.e, null, 0L, nVar4, str7, false, null, null, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG);
                k8 k8Var3 = l8.Companion;
                k0 k0Var = new k0(true);
                k8Var3.getClass();
                l8 l8VarA4 = k8.a(k0Var);
                k50.a1.Companion.getClass();
                return k50.h0.a(update5, null, null, null, null, o0VarA2, null, null, null, null, null, false, false, null, null, null, null, false, l8VarA4, null, null, null, null, null, k50.a1.f, 200277999);
            case 23:
                j4 j4Var3 = (j4) this.f180068b;
                v0 v0Var2 = (v0) this.f180069c;
                k50.h0 h0Var = (k50.h0) obj2;
                b1 b1Var = h0Var.f181090r;
                b30.e eVar = j4Var3.X.f267606a;
                b30.b bVar4 = eVar.f11982g;
                if (bVar4 == null || eVar.d.a().toEpochMilli() - bVar4.f11975c >= CoreConstants.MILLIS_IN_ONE_DAY) {
                    String str8 = (String) zhm.d0.H0(b30.e.f11978h, tim.c.INSTANCE);
                    TextLocalisedClause textLocalisedClauseA = b30.e.a(str8);
                    b30.b bVar5 = new b30.b(textLocalisedClauseA, str8, eVar.d.a().toEpochMilli());
                    eVar.f11982g = bVar5;
                    CoroutineScope coroutineScope = eVar.e;
                    p0 p0Var = p0.f264001a;
                    skm.e0.C(coroutineScope, elm.f.f127540b, null, new avk.i(eVar, bVar5, r132, 19), 2);
                    textLocalisedClause = textLocalisedClauseA;
                } else {
                    textLocalisedClause = bVar4.f11973a;
                }
                return k50.h0.a(h0Var, null, null, null, null, null, null, null, null, null, null, false, false, null, null, b1.a(b1Var, null, textLocalisedClause, null, v0Var2, 13), null, false, null, null, null, null, null, null, null, 268304383);
            case 24:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f180068b;
                ChatMode chatMode = (ChatMode) this.f180069c;
                k50.h0 h0Var2 = (k50.h0) obj2;
                if (chatMode instanceof ChatMode.Default) {
                    uuid = ((ChatMode.Default) chatMode).f51043a;
                } else {
                    if (!(chatMode instanceof ChatMode.Feed) && !chatMode.equals(ChatMode.SingleFeed.f51045a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    uuid = h0Var2.f181079a;
                }
                UUID uuid3 = uuid;
                ref$ObjectRef.f186409a = uuid3;
                return k50.h0.a(h0Var2, uuid3, null, null, null, null, null, null, null, chatMode, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435198);
            case 25:
                k5e.m mVar2 = (k5e.m) this.f180068b;
                e2 e2Var = (e2) this.f180069c;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list5 = (List) pair2.f186385a;
                List list6 = (List) pair2.f186386b;
                int iB = q0.b(zhm.w.t(list6, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB >= 16 ? iB : 16);
                for (Object obj6 : list6) {
                    linkedHashMap.put(((InstrumentTicker) obj6).f105112b, obj6);
                }
                p4e.a aVar3 = mVar2.u;
                List<Pair> list7 = list5;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list7, 10));
                Iterator it10 = list7.iterator();
                while (it10.hasNext()) {
                    arrayList4.add((mel.j0) ((Pair) it10.next()).f186386b);
                }
                aVar3.getClass();
                q4e.c cVarA = p4e.a.a(e2Var, arrayList4);
                if (cVarA == null) {
                    od0.i.Companion.getClass();
                    return od0.i.f224256b;
                }
                od0.h hVar2 = od0.i.Companion;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(list7, 10));
                for (Pair pair3 : list7) {
                    v2 v2Var = (v2) pair3.f186385a;
                    arrayList5.add(new k5e.f(v2Var, (mel.j0) pair3.f186386b, (InstrumentTicker) linkedHashMap.get(v2Var.f173579a)));
                }
                k5e.g gVar3 = new k5e.g(cVarA, arrayList5);
                hVar2.getClass();
                return od0.h.a(gVar3);
            case 26:
                k5l.b bVar6 = (k5l.b) this.f180068b;
                String searchQuery = (String) this.f180069c;
                Boolean enabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                int i33 = 3;
                if (!enabled.booleanValue()) {
                    r rVarJust = r.just(zi0.c.P(f0.f322471a, false, null, 3));
                    Intrinsics.h(rVarJust);
                    return rVarJust;
                }
                uwl.d dVar4 = (uwl.d) bVar6;
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                r map4 = nim.a.w(mif.a.f(((ypg.p) dVar4.f283699c).e(pcd.d.f234853b), dVar4.d.k(false), dVar4.i, e.c(new ahe.l(dVar4.f283701h.k(), 20), kotlin.coroutines.g.f186406a)), new uif.d(searchQuery, dVar4, i2)).map(new uwf.b(i33, new uwi.v(dVar4, i33)));
                Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
                return map4;
            case 27:
                k64.h hVar3 = (k64.h) this.f180068b;
                w0 w0Var = (w0) this.f180069c;
                gu3.a promptContent = (gu3.a) obj2;
                Intrinsics.checkNotNullParameter(promptContent, "it");
                hz3.c cVar7 = hVar3.d;
                AnalyticsContext analyticsContext = new AnalyticsContext(w0Var);
                cVar7.getClass();
                PromptApplicationCancellation promptApplicationCancellation = PromptApplicationCancellation.f66906a;
                Intrinsics.checkNotNullParameter(promptContent, "promptContent");
                String str9 = promptContent.e;
                String str10 = promptContent.f146690c;
                if (str9 == null) {
                    return new cqi.b(new TextClause(promptContent.f146688a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(promptContent.f146689b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), str10 != null ? new UrlImage(str10, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D076", null, null, null, 30), new TextClause(promptContent.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), promptApplicationCancellation, analyticsContext);
                }
                return new cqi.d(new TextClause(promptContent.f146688a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(promptContent.f146689b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), str10 != null ? new UrlImage(str10, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D076", null, null, null, 30), new TextClause(promptContent.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(str9, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), promptApplicationCancellation, null, analyticsContext, 644);
            case 28:
                String str11 = (String) this.f180068b;
                z45.c cVar8 = (z45.c) this.f180069c;
                Intrinsics.checkNotNullParameter((LoanCancellationV2FlowContract$State) obj2, "$this$update");
                return new LoanCancellationV2FlowContract$State(str11, cVar8);
            default:
                k6a.u uVar3 = (k6a.u) this.f180068b;
                k6a.j jVar3 = (k6a.j) this.f180069c;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                boolean z = jVar3.f181659h;
                ky kyVarB = ((ia3.c) uVar3.f181676b).b("CARD_LOADING_LIST_ID", R$attr.uikit_dp16, new CustomColors(1, null, new Color.Solid(R$attr.uikit_colorShimmer)));
                cs csVar = new cs("SHOW_HIDE_DETAILS_BTN_ID");
                yp0.b.r(csVar, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 12);
                return zhm.d0.E0(l6a.a.c(com.revolut.feature.payments_migration.impl.R$string.payments_migration_move_payment_instructions_first_step_card_description, R$attr.uikit_dp16, z), v.k(kyVarB, csVar));
        }
    }
}
