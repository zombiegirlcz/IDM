package a3i;

import akf.s1;
import cli.y;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.payments.splitbill.api.navigation.RecurringPaymentSplitNavigation$Destination;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.feature_market_data_api.navigation.HistoricFeeBreakdownFeatureConfig;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kye.k3;
import tof.a3;
import vkm.j2;
import zh9.u0;
import zhm.a0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public final /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1159w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Serializable f1160x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i, Serializable serializable, Object obj2, Object obj3, Continuation continuation) {
        super(1, continuation);
        this.u = i;
        this.v = obj2;
        this.f1159w = obj3;
        this.f1160x = serializable;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(0, (String) this.f1160x, (com.revolut.feature_exchange.impl.ui.order_details_kompot.b) this.v, (ChargeBreakdown) this.f1159w, continuation);
            case 1:
                return new t(1, (a3) this.f1160x, (s1) this.v, (qua.p) this.f1159w, continuation);
            case 2:
                return new t((String) this.f1160x, (com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.a) this.v, (String) this.f1159w, continuation);
            case 3:
                return new t(3, (xi0.b) this.f1160x, (com.revolut.trading.orders.ui.screens.pocket_picker.b) this.v, (xi0.b) this.f1159w, continuation);
            case 4:
                k3 k3Var = (k3) this.v;
                return new t(4, (String) this.f1159w, (String) this.f1160x, continuation, k3Var);
            case 5:
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g gVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g) this.v;
                return new t(5, (oki.g) this.f1159w, (String) this.f1160x, continuation, gVar);
            default:
                return new t(6, (dj0.d) this.f1160x, (com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.a) this.v, (LoanDetails) this.f1159w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((t) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        ArrayList arrayList;
        int i = this.u;
        Object next = null;
        int i2 = 28;
        Serializable serializable = this.f1160x;
        Object obj3 = this.f1159w;
        Object obj4 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return ((com.revolut.feature_exchange.impl.ui.order_details_kompot.b) obj4).C1(u0.c(new HistoricFeeBreakdownFeatureConfig((ChargeBreakdown) obj3, (String) serializable, (z3i.b) null, (xi0.b) null, false, false, c4i.a.EXCHANGE, (AnalyticsProduct.Retail) null, OnfidoActivity.RESULT_EXIT_BACKGROUND_STOP)));
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s1 s1Var = (s1) obj4;
                s1Var.getClass();
                s1Var.A2(new RecurringPaymentSplitNavigation$Destination((qua.p) obj3, ((a3) serializable).f272581b));
                return Unit.f186387a;
            case 2:
                String str = (String) obj3;
                com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.a aVar3 = (com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.a) obj4;
                y yVar = aVar3.f91596p;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str2 = (String) serializable;
                if (!Intrinsics.f(str2, "ACCOUNT_INFO_ACCOUNT_NUMBER")) {
                    if (Intrinsics.f(str2, "ACCOUNT_INFO_ACCOUNT_HOLDER_NAME")) {
                        aVar3.H2(yVar, new ak7.g(str, 28));
                    }
                    return Unit.f186387a;
                }
                aVar3.H2(yVar, new ak7.g(str, 27));
                aVar3.I2(yVar);
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.screens.pocket_picker.b bVar = (com.revolut.trading.orders.ui.screens.pocket_picker.b) obj4;
                fvl.l lVar = bVar.f107056s;
                cvl.l currentState = (cvl.l) ((j2) bVar.getState().f22677a).getValue();
                xi0.b currency = (xi0.b) obj3;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(currentState, "currentState");
                Intrinsics.checkNotNullParameter(currency, "currency");
                SourcePocket sourcePocket = currentState.f109491c;
                if (!currentState.k) {
                    Data data2 = currentState.f;
                    try {
                        Object content = data2.getContent();
                        if (content != null) {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it8 = ((List) content).iterator();
                            while (it8.hasNext()) {
                                a0.x(((xdf.i) it8.next()).f304438b, arrayList2);
                            }
                            arrayList = new ArrayList();
                            Iterator it9 = arrayList2.iterator();
                            while (it9.hasNext()) {
                                a0.x(((xdf.h) it9.next()).f304436c, arrayList);
                            }
                        } else {
                            arrayList = null;
                        }
                        data = new Data(arrayList, data2.getError(), data2.getLoading());
                    } catch (Throwable th10) {
                        data = new Data(null, th10, data2.getLoading());
                    }
                    Iterable iterable = (List) data.getContent();
                    if (iterable == null) {
                        iterable = f0.f322471a;
                    }
                    nkm.h hVarN = nkm.y.n(d0.Q(iterable), new dv5.p(17, currency));
                    nkm.g gVar = new nkm.g(nkm.y.n(hVarN, new fv6.n(20)));
                    if (gVar.hasNext()) {
                        next = gVar.next();
                        if (gVar.hasNext()) {
                            dj0.d f91792b = ((SourcePocket) next).getF91792b();
                            if (f91792b == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            do {
                                Object next2 = gVar.next();
                                dj0.d f91792b2 = ((SourcePocket) next2).getF91792b();
                                if (f91792b2 == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                if (f91792b.compareTo(f91792b2) < 0) {
                                    next = next2;
                                    f91792b = f91792b2;
                                }
                            } while (gVar.hasNext());
                        }
                    }
                    SourcePocket sourcePocket2 = (SourcePocket) next;
                    if (sourcePocket2 == null) {
                        SourcePocket sourcePocket3 = (SourcePocket) nkm.y.r(hVarN);
                        if (sourcePocket3 != null) {
                            sourcePocket = sourcePocket3;
                        }
                    } else {
                        sourcePocket = sourcePocket2;
                    }
                    break;
                }
                bVar.H2(bVar.getState(), new c1g.o(currency, i2, (xi0.b) serializable, sourcePocket));
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k3 k3Var = (k3) obj4;
                j60.a aVar7 = k3Var.v;
                String topupCurrency = (String) serializable;
                String cardCurrency = (String) obj3;
                k3Var.E.getClass();
                Intrinsics.checkNotNullParameter(topupCurrency, "topupCurrency");
                Intrinsics.checkNotNullParameter(cardCurrency, "cardCurrency");
                rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.top_up_prompt_update_currency_title, null, null, 14), new TextLocalisedClause(R$string.top_up_prompt_update_currency_subtitle, zhm.u.c(cardCurrency), null, 12), null, 28);
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.top_up_prompt_update_currency_action_switch, zhm.u.c(cardCurrency), null, 12);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                int i3 = R$attr.uikit_dp16;
                LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("LIST_ID_CURRENCIES_DIALOG_SWITCH", defaultFilledButton, null, textLocalisedClause, false, null, cardCurrency, R$attr.uikit_dp8, 0, i3, i3, 1392);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.top_up_prompt_update_currency_action_continue, zhm.u.c(topupCurrency), null, 12);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
                int i5 = R$attr.uikit_dp16;
                aVar7.x(new rp0.y(zhm.v.k(model, new LargeActionButtonDelegate.Model("LIST_ID_CURRENCIES_DIALOG_CONTINUE", defaultFilledButton2, null, textLocalisedClause2, false, null, null, i5, i5, i5, i5, 496)), tVar, rp0.l.WINDOW, null, null, null, 1016));
                return Unit.f186387a;
            case 5:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g gVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g) obj4;
                return gVar2.A1(new sik.h(gVar2, (String) serializable, (oki.g) obj3, null, 0), new sik.c(gVar2, 5));
            default:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.a aVar10 = (com.revolut.feature.credit.loan.impl.ui.rev10.instalmentdetails.a) obj4;
                return aVar10.C1(((g55.c) aVar10.f70437t).b((LoanDetails) obj3, (dj0.d) serializable));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i, Object obj2, String str, Continuation continuation, oki.h hVar) {
        super(1, continuation);
        this.u = i;
        this.v = hVar;
        this.f1160x = str;
        this.f1159w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String str, com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.a aVar, String str2, Continuation continuation) {
        super(1, continuation);
        this.u = 2;
        this.f1160x = str;
        this.v = aVar;
        this.f1159w = str2;
    }
}
