package p5e;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.gson.reflect.TypeToken;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.RejectedLazyFlowContract$Step;
import com.revolut.feature.external_accounts.impl.domain.open_banking.payment_fees.OutboundPaymentBreakdown;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.OpenBankingAuthPaymentFlowContract$Step;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OutboundPaymentExtras;
import com.revolut.feature.pay_bills_taxes.api.R$string;
import com.revolut.feature.pricingplans.models.PricingPlanUpdateSource;
import com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.SalaryHubV3ControllerContract$ModalStep;
import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import com.revolut.feature.travel.miles.api.model.TravelMilesFlightFilters$FilterOption;
import com.revolut.feature_web_view.presentation.WebViewActivity;
import com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.EsimSubscriptionsScreenContract$ModalStep;
import com.revolut.revolut.feature_fourthline_impl.R;
import dx4.y;
import e54.n;
import e54.o;
import e54.p;
import h93.f0;
import hs3.k1;
import igk.q;
import ip0.qd0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kl.t1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import nii.y0;
import nii.z;
import pf4.j;
import pgi.s;
import pgk.k;
import qi1.a;
import rgc.l;
import yhm.m;
import zh9.u0;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f233106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f233107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f233108c;

    public /* synthetic */ h(Object obj2, Object obj3, int i) {
        this.f233106a = i;
        this.f233107b = obj2;
        this.f233108c = obj3;
    }

    private final Object a(Object obj2) throws Throwable {
        com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.content.b) this.f233107b;
        y yVar = (y) this.f233108c;
        p outputData = (p) obj2;
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        if (outputData instanceof o) {
            bVar.n2(new oqk.i(bVar, yVar, outputData, null, 17), new whi.b(6));
        } else {
            if (!(outputData instanceof n)) {
                throw new NoWhenBranchMatchedException();
            }
            n nVar = (n) outputData;
            Long l2 = nVar.f122756b;
            if (l2 != null) {
                bVar.C2(new j(nVar.f122755a.f120542a, yVar.i, l2.longValue()));
                Unit unit = Unit.f186387a;
            } else {
                try {
                    m.Companion companion = m.INSTANCE;
                    throw new IllegalStateException("Custom output without amount is not supported in OfferContentScreenModel");
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = m.INSTANCE;
                    Throwable thA = m.a(yhm.o.a(th10));
                    if (thA != null) {
                        hx7.e.n(thA);
                    }
                }
            }
        }
        return Unit.f186387a;
    }

    private final Object b(Object obj2) {
        pf9.e eVar = (pf9.e) this.f233107b;
        ap1.d dVar = (ap1.d) this.f233108c;
        Throwable throwable = (Throwable) obj2;
        Intrinsics.checkNotNullParameter(throwable, "it");
        qm1.h hVar = eVar.o;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ServerError serverErrorA = hVar.f247753a.a(throwable);
        yji.n.j2(eVar, eVar.L2((serverErrorA == null || serverErrorA.f51362a != 57402) ? hVar.b(throwable) : new y0(null, new z(new TextLocalisedClause(R$string.pay_bills_taxes_country_br_search_error_not_found_title, null, null, 14), new TextLocalisedClause(R$string.pay_bills_taxes_country_br_search_error_not_found_description, null, null, 14), new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5)), null, new o4a.b(eVar, dVar, null, 13), 3);
        return Boolean.TRUE;
    }

    private final Object c(Object obj2) {
        pfa.i iVar = (pfa.i) this.f233107b;
        wi0.b bVar = (wi0.b) this.f233108c;
        f0 card = (f0) obj2;
        Intrinsics.checkNotNullParameter(card, "card");
        return iVar.e.a(card, bVar);
    }

    private final Object d(Object obj2) {
        com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a aVar = (com.revolut.feature.retail.salary_account.impl.salary_hub_phase3.a) this.f233107b;
        SalaryHubV3ControllerContract$ModalStep salaryHubV3ControllerContract$ModalStep = (SalaryHubV3ControllerContract$ModalStep) this.f233108c;
        ngb.b output = (ngb.b) obj2;
        Intrinsics.checkNotNullParameter(output, "output");
        if (!Intrinsics.f(output, ngb.b.f215130a)) {
            throw new NoWhenBranchMatchedException();
        }
        aVar.I2(((SalaryHubV3ControllerContract$ModalStep.RewardStep) salaryHubV3ControllerContract$ModalStep).f82996a.getF83007a());
        return Unit.f186387a;
    }

    private final Object e(Object obj2) {
        pgc.j jVar = (pgc.j) this.f233107b;
        rgc.i iVar = (rgc.i) this.f233108c;
        jVar.d.insert((SQLiteConnection) obj2, iVar);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object g(Object obj2) {
        rgc.j jVar;
        pgc.j jVar2 = (pgc.j) this.f233107b;
        String str = (String) this.f233108c;
        b21.a aVar = jVar2.e;
        SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM rewards_details WHERE id = ? LIMIT 1");
        try {
            if (str == null) {
                sQLiteStatementPrepare.bindNull(1);
            } else {
                sQLiteStatementPrepare.bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "primaryCategoryId");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "description");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "loyalty_description");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "details");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "merchant");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "start");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "end");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "steps");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "loyalty_steps");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "claim_type");
            int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "activation_state");
            int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "total_outlets_number");
            int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "extra_cashback");
            int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "only_manual_activation");
            int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "requires_external_registration");
            int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "can_redeem_via_email");
            int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "activation_button_text");
            int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "social_proof_likes");
            int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedbackrating");
            int columnIndexOrThrow22 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "feedbackcomment");
            if (sQLiteStatementPrepare.step()) {
                String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                rgc.e eVarB = tgc.a.b(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                rgc.e eVarB2 = tgc.a.b(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                String json = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                Intrinsics.checkNotNullParameter(json, "json");
                kg.o oVarA = xgc.a.a();
                Type type = new TypeToken<rgc.g>() { // from class: com.revolut.feature.rewards.impl.data.database.typeconverter.RewardsTypeConverters$jsonToDetails$$inlined$fromJson$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                Object objD = oVarA.d(json, type);
                Intrinsics.checkNotNullExpressionValue(objD, "fromJson(...)");
                rgc.g gVar = (rgc.g) objD;
                sgc.a aVarC = tgc.a.c(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow8));
                Long lValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow9));
                List listK = b21.a.k(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10));
                List listK2 = b21.a.k(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11));
                String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow13);
                Integer numValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow14) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow14));
                boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow15)) != 0;
                boolean z3 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow16)) != 0;
                boolean z4 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow17)) != 0;
                boolean z6 = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow18)) != 0;
                String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow19);
                l lVar = !sQLiteStatementPrepare.isNull(columnIndexOrThrow20) ? new l((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow20)) : null;
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow21) && sQLiteStatementPrepare.isNull(columnIndexOrThrow22)) {
                    jVar = null;
                } else {
                    jVar = new rgc.j((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow21), sQLiteStatementPrepare.isNull(columnIndexOrThrow22) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow22));
                }
                iVar = new rgc.i(text, text2, text3, eVarB, eVarB2, gVar, aVarC, lValueOf, lValueOf2, lVar, listK, listK2, jVar, text4, text5, numValueOf, z, z3, z4, z6, text6);
            }
            sQLiteStatementPrepare.close();
            return iVar;
        } catch (Throwable th10) {
            sQLiteStatementPrepare.close();
            throw th10;
        }
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    private final Object h(Object obj2) {
        s sVar = (s) this.f233107b;
        String str = (String) this.f233108c;
        pgi.j jVar = (pgi.j) sVar.L();
        if (jVar != null) {
            ?? r56 = ((WebViewActivity) jVar).H0;
            if (((pgi.f) r56.getValue()).f235960a != pgi.g.DIRECT_NAVIGATION) {
                ((pgi.f) r56.getValue()).b(pgi.g.IDLE);
            }
        }
        sVar.i.e(sVar.f235970h.i, str);
        return Unit.f186387a;
    }

    private final Object i(Object obj2) {
        String strL;
        k kVar = (k) this.f233107b;
        HashMap map = (HashMap) this.f233108c;
        hha.d plan = (hha.d) obj2;
        Intrinsics.checkNotNullParameter(plan, "plan");
        if (!plan.f152296p) {
            sri.m mVar = kVar.f235994a;
            ajk.f fVar = kVar.e;
            String str = (String) map.get("source");
            mVar.c(q.a(fVar, (str == null || (strL = m70.a.l(str)) == null) ? null : new PricingPlanUpdateSource.Dynamic(strL)));
        }
        return Boolean.TRUE;
    }

    private final Object j(Object obj2) {
        com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d dVar = (com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.d) this.f233107b;
        RejectedLazyFlowContract$Step.Rejected rejected = (RejectedLazyFlowContract$Step.Rejected) this.f233108c;
        dii.g output = (dii.g) obj2;
        Intrinsics.checkNotNullParameter(output, "output");
        if (output instanceof dii.e) {
            dVar.R2(rejected.f68306a.f154913c.f154904b);
        } else if (output instanceof dii.f) {
            k1 k1Var = rejected.f68306a.d;
            if (k1Var != null) {
                dVar.R2(k1Var.f154904b);
            } else {
                dVar.O2(null, dVar.f68313p.f68304c.f66892b);
            }
        } else if (output instanceof dii.c) {
            dVar.S2(((dii.c) output).f115066a.f275445a, rejected.f68306a);
        } else {
            if (!(output instanceof dii.b) && !(output instanceof dii.d)) {
                throw new NoWhenBranchMatchedException();
            }
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "RejectedLazyFlowModel", "Unsupported actions bottom sheet " + o0.f186429a.b(output.getClass()) + " output", null, h0Var);
        }
        return Unit.f186387a;
    }

    private final Object k(Object obj2) {
        String str = (String) this.f233107b;
        vfe.a aVar = (vfe.a) this.f233108c;
        List items = (List) obj2;
        Intrinsics.checkNotNullParameter(items, "items");
        return new ohe.b(new TotalWealthCategoryKey.Youth(str), items, aVar.f288607b, 8);
    }

    private final Object l(Object obj2) {
        Set setI1;
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.f233107b;
        phg.l lVar = (phg.l) this.f233108c;
        phg.g update = (phg.g) obj2;
        Intrinsics.checkNotNullParameter(update, "$this$update");
        if (model.f53306c == qd0.SELECTED) {
            setI1 = h0.f322473a;
        } else {
            ArrayList arrayList = lVar.o.f94335a;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                arrayList2.add(((TravelMilesFlightFilters$FilterOption) it8.next()).f94096a);
            }
            setI1 = d0.i1(arrayList2);
        }
        return phg.g.a(update, setI1, null, false, 6);
    }

    private final Object m(Object obj2) {
        Function1 function1 = (Function1) this.f233107b;
        Address address = (Address) this.f233108c;
        qi1.a output = (qi1.a) obj2;
        Intrinsics.checkNotNullParameter(output, "output");
        if (Intrinsics.f(output, a.C1348a.f246621a)) {
            function1.invoke(address);
        } else if (!Intrinsics.f(output, a.b.f246622a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }

    private final Object n(Object obj2) {
        com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d dVar = (com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.payment.d) this.f233107b;
        OpenBankingAuthPaymentFlowContract$Step openBankingAuthPaymentFlowContract$Step = (OpenBankingAuthPaymentFlowContract$Step) this.f233108c;
        fj6.e result = (fj6.e) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        if (Intrinsics.f(result, fj6.c.f135543a)) {
            OutboundPaymentExtras outboundPaymentExtras = ((OpenBankingAuthPaymentFlowContract$Step.PaymentBreakdown) openBankingAuthPaymentFlowContract$Step).f72511a;
            t1 t1Var = dVar.v;
            if (outboundPaymentExtras instanceof OutboundPaymentExtras.LegacyQuote) {
                dVar.C1(u0.b(t1Var.g(((OutboundPaymentExtras.LegacyQuote) outboundPaymentExtras).f72531a)));
            } else {
                if (!(outboundPaymentExtras instanceof OutboundPaymentExtras.PaymentBreakdown)) {
                    throw new NoWhenBranchMatchedException();
                }
                OutboundPaymentBreakdown outboundPaymentBreakdown = ((OutboundPaymentExtras.PaymentBreakdown) outboundPaymentExtras).f72532a;
                if (outboundPaymentBreakdown instanceof OutboundPaymentBreakdown.SameCurrency) {
                    IllegalStateException illegalStateException = new IllegalStateException("Exchange rate clicked for same-currency payment");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else {
                    if (!(outboundPaymentBreakdown instanceof OutboundPaymentBreakdown.CrossCurrency)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    OutboundPaymentBreakdown.CrossCurrency.ExchangeRate exchangeRate = ((OutboundPaymentBreakdown.CrossCurrency) outboundPaymentBreakdown).f;
                    dVar.C1(u0.b(t1Var.h(exchangeRate.f72380a, exchangeRate.f72381b)));
                }
            }
        } else {
            if (!Intrinsics.f(result, fj6.d.f135544a)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar.L2(((OpenBankingAuthPaymentFlowContract$Step.PaymentBreakdown) openBankingAuthPaymentFlowContract$Step).f72511a);
        }
        return Unit.f186387a;
    }

    private final Object o(Object obj2) {
        com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar = (com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b) this.f233107b;
        EsimSubscriptionsScreenContract$ModalStep esimSubscriptionsScreenContract$ModalStep = (EsimSubscriptionsScreenContract$ModalStep) this.f233108c;
        dii.g output = (dii.g) obj2;
        Intrinsics.checkNotNullParameter(output, "output");
        if (Intrinsics.f(output, dii.e.f115068a)) {
            bjj.f fVar = bVar.H;
            String str = ((EsimSubscriptionsScreenContract$ModalStep.SubscriptionActivationConfirmation) esimSubscriptionsScreenContract$ModalStep).f101038a;
            String string = bVar.f101082p.a().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            fVar.Z2(str, string);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:303:0x0abd  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0ac0  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0b2d  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0b30  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0b85  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0bf1  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0bff  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0c03  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0c64  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0c75  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0c79  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0189  */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v31 */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r68) {
        /*
            Method dump skipped, instruction units count: 3400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p5e.h.invoke(java.lang.Object):java.lang.Object");
    }
}
