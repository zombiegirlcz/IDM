package nrd;

import a15.l;
import android.os.Parcelable;
import axi.m;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.direct.debit.account_confirmation.InternalData;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.flow.FreelancerAcquiringOrderFlowContract$Step;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeaturesState;
import com.revolut.feature.workflow.engine.rfi.impl.ui.flow.ScreeningFlowContract$State;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.checkout.AirportLoungeCheckoutFlowContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.checkout.AirportLoungeCheckoutFlowContract$State;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.models.StockFinancialsStatementPeriodState;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import com.youTransactor.uCube.rpc.Constants;
import cuc.c0;
import ip0.v7;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.t0;
import mu8.e;
import nii.y0;
import no.e0;
import ntf.r;
import nuc.m;
import nv4.p;
import nv4.z;
import nv7.i;
import nvk.q;
import nxa.v;
import ou6.k;
import te0.w;
import tof.i7;
import vkm.j2;
import yt8.k;
import zhm.d0;
import zhm.f0;
import zhm.q0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f218617b;

    public /* synthetic */ g(Object obj2, int i) {
        this.f218616a = i;
        this.f218617b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f218616a;
        int i2 = 4;
        int i3 = 2;
        int i5 = 14;
        Continuation continuation = null;
        int i6 = 0;
        int i21 = 1;
        Object obj3 = this.f218617b;
        switch (i) {
            case 0:
                a update = (a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data categoriesData = update.f218609a;
                Intrinsics.checkNotNullParameter(categoriesData, "categoriesData");
                return new a(categoriesData, (vzi.b) obj3);
            case 1:
                nrj.f updateState = (nrj.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                uzi.b budgetingCycle = new uzi.b((uzi.c) obj3, 1);
                updateState.getClass();
                Intrinsics.checkNotNullParameter(budgetingCycle, "budgetingCycle");
                return new nrj.f(budgetingCycle);
            case 2:
                nt9.g update2 = (nt9.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return nt9.g.a(update2, null, null, null, null, (st9.b) obj3, false, 95);
            case 3:
                com.revolut.feature.payments.groups.impl.ui_new.group_creation.b bVar = (com.revolut.feature.payments.groups.impl.ui_new.group_creation.b) obj3;
                h1j.b result = (h1j.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof h1j.c) {
                    bVar.H2(bVar.f79487w, new e77.j(result, i3));
                }
                return Unit.f186387a;
            case 4:
                r rVar = (r) obj3;
                rVar.H2(rVar.u, new lph.c(((Boolean) obj2).booleanValue(), 24));
                return Unit.f186387a;
            case 5:
                com.revolut.feature.freelancer.impl.ui.acquiring_order.flow.a aVar = (com.revolut.feature.freelancer.impl.ui.acquiring_order.flow.a) obj3;
                k result2 = (k) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (Intrinsics.f(result2, ou6.i.f229831a)) {
                    oki.h.D2(aVar.o);
                } else {
                    if (!(result2 instanceof ou6.j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.t2(aVar, aVar.o, new FreelancerAcquiringOrderFlowContract$Step.OrderDetails(((ou6.j) result2).f229832a), false, null, false, 14);
                }
                return Unit.f186387a;
            case 6:
                com.revolut.feature.security_hub.impl.ui.hidden_transactions.a aVar2 = (com.revolut.feature.security_hub.impl.ui.hidden_transactions.a) obj3;
                eii.k output = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof eii.g) {
                    aVar2.A1(new c0(aVar2, continuation, i2), new yi5.b(25));
                }
                return Unit.f186387a;
            case 7:
                nuc.h hVar = (nuc.h) obj3;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new m(iii.c.c(5), false, false, false, f0.f322471a, hVar.f219285c || hVar.f219284b.length() > 0, 56);
            case 8:
                ScreeningFlowContract$State update3 = (ScreeningFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                List list = update3.f96554b;
                Question currentQuestion = update3.f96553a;
                ArrayList answers = d0.F0(((iuh.g) obj3).f168610a, guh.a.a(currentQuestion.getF105636a(), list));
                Intrinsics.checkNotNullParameter(currentQuestion, "currentQuestion");
                Intrinsics.checkNotNullParameter(answers, "answers");
                return new ScreeningFlowContract$State(currentQuestion, answers);
            case 9:
                com.revolut.feature.credit.card.impl.ui.statement.export.b bVar2 = (com.revolut.feature.credit.card.impl.ui.statement.export.b) obj3;
                gii.a result3 = (gii.a) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                for (vl4.i iVar : bVar2.J2().f219461b) {
                    if (Intrinsics.f(pyd.c.h0(iVar.f290263a), result3.f144218a)) {
                        bVar2.H2(bVar2.f69703t, new l(20, iVar.f290263a));
                        return Unit.f186387a;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 10:
                Function0 defaultItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultItems, "defaultItems");
                List list2 = (List) defaultItems.invoke();
                ((z) obj3).getClass();
                return new p(list2, nv4.l.f219469a);
            case 11:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                List list3 = (List) getDefaultLoadingItems.invoke();
                ((nv7.m) obj3).getClass();
                return new nv7.j(list3, i.b.f219548a);
            case 12:
                com.revolut.feature.kyc.impl.flow.addressverification.a aVar3 = (com.revolut.feature.kyc.impl.flow.addressverification.a) obj3;
                mu8.e outputData = (mu8.e) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof mu8.f) {
                    aVar3.C1(new BridgeDestination(new FinishCommand(-1, q0.c(new Pair("KYC_DOCUMENT_FILE_EXTRA_URI", ((f80.b) aVar3.f77686p).a(((mu8.f) outputData).f209006a))), null, 4)));
                } else if (outputData instanceof e.a) {
                    yji.l.b1(aVar3, aVar3.X1(new y0("dialog.id", new nii.z(new TextLocalisedClause(R$string.kyc_proof_of_address_supporting_docs_error_large_file_title, null, null, 14), new TextLocalisedClause(R$string.kyc_proof_of_address_supporting_docs_error_large_file_subtitle, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4)), null, new nv8.f(aVar3, continuation, i6), 3);
                } else {
                    if (!(outputData instanceof e.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    yji.l.b1(aVar3, aVar3.X1(new y0("dialog.id", new nii.z(new TextLocalisedClause(R$string.auto_kyc_vendors_reviewing_error_applicant, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 4)), null, new nv8.f(aVar3, continuation, i21), 3);
                }
                return Unit.f186387a;
            case 13:
                kdh.b bVar3 = (kdh.b) obj3;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list4 = (List) pair.f186385a;
                List list5 = (List) pair.f186386b;
                return list4.isEmpty() ? w.j(list5) : new pfm.a(((ang.f) bVar3.f182900c).f(false), new noi.l(i5, new e0(bVar3, list4, 23)), i2).f(w.j(list5));
            case 14:
                nv9.b bVar4 = (nv9.b) obj3;
                List entities = (List) obj2;
                Intrinsics.checkNotNullParameter(entities, "entities");
                List<iv9.m> list6 = entities;
                ArrayList arrayList = new ArrayList(zhm.w.t(list6, 10));
                for (iv9.m mVar : list6) {
                    bVar4.getClass();
                    arrayList.add(nv9.b.a(mVar));
                }
                return arrayList;
            case 15:
                esk.b bVar5 = (esk.b) obj3;
                nvk.k update4 = (nvk.k) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                int i22 = q.f219729a[update4.f219715b.ordinal()];
                if (i22 == 1) {
                    return nvk.k.a(update4, null, null, new StockFinancialsStatementPeriodState(Integer.valueOf(bVar5.f128995a), bVar5.f128996b), null, null, null, null, null, Constants.TAG_FB_CHARGING_STATUS);
                }
                if (i22 == 2) {
                    return nvk.k.a(update4, null, null, null, new StockFinancialsStatementPeriodState(Integer.valueOf(bVar5.f128995a), bVar5.f128996b), null, null, null, null, Constants.TAG_BLE_FIRMWARE_VERSION);
                }
                throw new NoWhenBranchMatchedException();
            case 16:
                nvk.w result4 = (nvk.w) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                uqk.e period = result4.f219740a;
                Intrinsics.checkNotNullParameter(period, "period");
                ((com.revolut.retail.feature.stockdetails.impl.ui.screens.financials_statements.a) obj3).f103973t.k(period);
                return Unit.f186387a;
            case 17:
                nw5.i iVar2 = (nw5.i) obj3;
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                LinkedHashSet linkedHashSet = config.M;
                xi0.a aVar4 = xi0.b.Companion;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(linkedHashSet, 10));
                Iterator it8 = linkedHashSet.iterator();
                while (it8.hasNext()) {
                    t61.a.A(aVar4, (String) it8.next(), arrayList2);
                }
                Collection[] elements = {arrayList2, config.T};
                Intrinsics.checkNotNullParameter(elements, "elements");
                ArrayList arrayListU = zhm.w.u(kotlin.collections.d.L(elements));
                Set setC = iVar2.f219782c.c(td0.a.LISTED);
                ArrayList arrayList3 = new ArrayList(zhm.w.t(setC, 10));
                Iterator it9 = setC.iterator();
                while (it9.hasNext()) {
                    t61.a.A(xi0.b.Companion, (String) it9.next(), arrayList3);
                }
                Set setJ1 = d0.j1(arrayListU, arrayList3);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : setJ1) {
                    xi0.b bVar6 = (xi0.b) obj4;
                    if (cp5.d.z(bVar6) || cp5.d.A(bVar6)) {
                        arrayList4.add(obj4);
                    }
                }
                return d0.i1(arrayList4);
            case 18:
                i7 it10 = (i7) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return whf.b.a((whf.b) ((jid.z) obj3).f174462c, w.h(it10), null, 1, null, 10);
            case 19:
                yt8.k it11 = (yt8.k) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return ((nw8.c) obj3).f219792c.f77821a ? ((it11 instanceof k.c) || (it11 instanceof yt8.m)) ? k.b.f316671a : it11 : it11;
            case 20:
                nw8.f fVar = (nw8.f) obj3;
                if (((Boolean) obj2).booleanValue()) {
                    fVar.f219800c.c(fVar.e);
                }
                NaviCommand finishCommand = ((nw8.c) fVar.f219798a).f219792c.f77822b;
                if (finishCommand == null) {
                    finishCommand = new FinishCommand(null, null, null, 7);
                }
                fVar.f219800c.c(finishCommand);
                return Unit.f186387a;
            case 21:
                nwc.g update5 = (nwc.g) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return nwc.g.a(update5, (WealthProtectionFeaturesState) obj3, null, null, null, 14);
            case 22:
                nwf.l lVar = (nwf.l) obj3;
                if (((Boolean) obj2).booleanValue()) {
                    lVar.l2(new nwf.j(lVar, continuation, i6), new yi5.b(26));
                }
                return Unit.f186387a;
            case 23:
                com.revolut.retail.feature.airportlounges.impl.ui.flows.checkout.a aVar5 = (com.revolut.retail.feature.airportlounges.impl.ui.flows.checkout.a) obj3;
                AirportLoungeCheckoutFlowContract$InputData airportLoungeCheckoutFlowContract$InputData = aVar5.o;
                axi.m output2 = (axi.m) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof m.a) {
                    aVar5.C2(new nwi.c(((AirportLoungeCheckoutFlowContract$State) ((j2) aVar5.f98960p.f22677a).getValue()).f98958b, ((m.a) output2).f10958a, airportLoungeCheckoutFlowContract$InputData.f98956b));
                } else {
                    if (!(output2 instanceof m.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar5.C2(new nwi.d(airportLoungeCheckoutFlowContract$InputData.f98956b));
                }
                return Unit.f186387a;
            case 24:
                return AmountEditView.f0((AmountEditView) obj3, (CharSequence) obj2);
            case 25:
                com.revolut.feature.referrals.impl.personalized_tracking.a aVar6 = (com.revolut.feature.referrals.impl.personalized_tracking.a) obj3;
                Throwable t2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(t2, "t");
                aVar6.X1(new y0(null, tj0.a.a(t2) ? new nii.e0((Clause) new TextLocalisedClause(com.revolut.kompot.common.R$string.common_offline_state_title, null, null, 14), (Clause) new TextLocalisedClause(com.revolut.kompot.common.R$string.common_offline_state_description, null, null, 14), (TextLocalisedClause) null, (Parcelable) null, false, (AnalyticsProduct) null, 1020) : new nii.z(new TextLocalisedClause(com.revolut.kompot.common.R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5));
                return Boolean.TRUE;
            case 26:
                String transactionId = (String) obj2;
                Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                return (t0) v7.r("TRANSACTION_BANNER_MEM_KEY_", transactionId, ((nxb.e) obj3).f220550c);
            case 27:
                Long l2 = (Long) obj2;
                l2.getClass();
                ((ihm.j) obj3).onNext(l2);
                return Unit.f186387a;
            case 28:
                return new ny4.d(new Data((InternalData) obj3, null, false, 6, null));
            default:
                kgm.i iVar3 = (kgm.i) obj3;
                String formattedQuery = (String) obj2;
                Intrinsics.checkNotNullParameter(formattedQuery, "formattedQuery");
                wl3.h hVar2 = (wl3.h) ((cl3.a) iVar3.f184023b);
                rfm.f0 f0VarO = new rfm.m(hVar2.d(formattedQuery).m(hVar2.q(formattedQuery)), new ny7.j(new v(13), 9), i21).o();
                Intrinsics.checkNotNullExpressionValue(f0VarO, "toSingle(...)");
                return new ufm.i(w.H0(f0VarO, ((ang.f) iVar3.f184024c).f(false)), new ny7.j(new v(12), 8), 1);
        }
    }

    public /* synthetic */ g(nuc.p pVar, nuc.h hVar) {
        this.f218616a = 7;
        this.f218617b = hVar;
    }
}
