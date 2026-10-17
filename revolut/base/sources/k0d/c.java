package k0d;

import aii.r;
import akl.o;
import android.content.Context;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.viewbinding.ViewBinding;
import com.revolut.chat.domain.model.ChatMessageToPass;
import com.revolut.core.ui_kit.dialogs.AlertDialogDisplayer$Button;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import com.revolut.feature.apm.core.models.recipients.PayIdBeneficiary;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferWrapperNavigation$InputData;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.TaxHubTransactionExportFlowContract$State;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.TaxHubTransactionExportFlowContract$Step;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.new_transfer.NewTransferScreen;
import com.revolut.feature.statements.api.navigation.SavingsAccountsStatementFeatureConfig$SavingsAccountInfo;
import com.revolut.feature.travel.common.api.R$string;
import com.revolut.feature.travel.experiences.api.models.search.TravelSearchResponse;
import com.revolut.feature.travel.experiences.impl.ui.flow.tabs.TravelExperiencesTabsFlowContract$PagerItem;
import com.revolut.feature.wealth.asset.selection.impl.ui.screens.instrument.InstrumentSelectionController;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewGridLayoutManager;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import java.io.File;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import jck.y;
import k49.l;
import k4a.u;
import k50.b1;
import k50.c0;
import k50.f1;
import k50.h0;
import k50.m0;
import k50.m1;
import k50.n0;
import k50.o0;
import k50.s2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import n47.k;
import nii.y0;
import nii.z;
import npg.j;
import od0.i;
import org.jmrtd.cbeff.ISO781611;
import pfm.h;
import r7a.g;
import v20.n;
import v20.u0;
import yhm.m;
import zhm.a1;
import zhm.d0;
import zhm.f0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f180016b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f180015a = i;
        this.f180016b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        Instant instant;
        int i = this.f180015a;
        int i2 = 8;
        int i3 = 26;
        ?? r132 = 1;
        ?? r56 = 0;
        r56 = 0;
        r56 = 0;
        Object obj3 = this.f180016b;
        switch (i) {
            case 0:
                String teenUserId = (String) obj2;
                Intrinsics.checkNotNullParameter(teenUserId, "teenUserId");
                return (List) ((f) obj3).f180020b.get(f.a(teenUserId));
            case 1:
                com.revolut.feature.statements.impl.ui.savings.a aVar = (com.revolut.feature.statements.impl.ui.savings.a) obj3;
                cjb.a savingsSelectionResult = (cjb.a) obj2;
                Intrinsics.checkNotNullParameter(savingsSelectionResult, "savingsSelectionResult");
                aVar.H2(aVar.f88381x, new c(savingsSelectionResult, 2));
                return Unit.f186387a;
            case 2:
                k0e.e update = (k0e.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Set<j> set = ((cjb.a) obj3).f24630a;
                ArrayList arrayList = new ArrayList(w.t(set, 10));
                for (j jVar : set) {
                    arrayList.add(new SavingsAccountsStatementFeatureConfig$SavingsAccountInfo(jVar.f218215a, jVar.f218216b));
                }
                return k0e.e.a(update, null, arrayList, null, null, null, null, ISO781611.SMT_TAG);
            case 3:
                k18.c cVar = (k18.c) obj3;
                i optionalAirTip = (i) obj2;
                Intrinsics.checkNotNullParameter(optionalAirTip, "optionalAirTip");
                o18.a aVar2 = (o18.a) optionalAirTip.f224257a;
                if (aVar2 != null && (instant = aVar2.f) != null && instant.isAfter(((l80.f) ((l80.e) cVar.d)).b())) {
                    r56 = optionalAirTip;
                }
                if (r56 != 0) {
                    return r56;
                }
                i.Companion.getClass();
                return i.f224256b;
            case 4:
                k1c.d dVar = (k1c.d) obj3;
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                pyb.c cVar2 = (pyb.c) dVar.f180209b;
                Intrinsics.checkNotNullParameter(error, "error");
                Flow flowC = dVar.c(cVar2.f240739a.f("CLAIM_REWARD_DIALOG_ID", error));
                int i5 = 2;
                o handleError = new o(i5, 23, r56);
                a27.d onSuccessCompletion = new a27.d(1, 2, null);
                o onEach = new o(i5, 24, r56);
                Intrinsics.checkNotNullParameter(flowC, "<this>");
                Intrinsics.checkNotNullParameter(handleError, "handleError");
                Intrinsics.checkNotNullParameter(onSuccessCompletion, "onSuccessCompletion");
                Intrinsics.checkNotNullParameter(onEach, "onEach");
                ash.f fVar = dVar.f108469a;
                if (fVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Intrinsics.checkNotNullParameter(flowC, "<this>");
                Intrinsics.checkNotNullParameter(handleError, "handleError");
                Intrinsics.checkNotNullParameter(onSuccessCompletion, "onSuccessCompletion");
                Intrinsics.checkNotNullParameter(onEach, "onEach");
                ((nsh.o) fVar).k2(flowC, handleError, onSuccessCompletion, onEach);
                return Boolean.TRUE;
            case 5:
                k1g.e update2 = (k1g.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return k1g.e.a(update2, ((TravelExperiencesTabsFlowContract$PagerItem) obj3).getF94249a(), null, 5);
            case 6:
                k1i.j jVar2 = (k1i.j) obj3;
                return ((rp0.c) obj2).f256052c == AlertDialogDisplayer$Button.POSITIVE ? jVar2.f180280j.b() : new h(new i1i.a(jVar2, i2), 2);
            case 7:
                InstrumentSelectionController instrumentSelectionController = (InstrumentSelectionController) obj3;
                List it8 = (List) obj2;
                InstrumentSelectionController.Companion aVar3 = InstrumentSelectionController.INSTANCE;
                Intrinsics.checkNotNullParameter(it8, "it");
                ViewBinding value = instrumentSelectionController.L.getValue(instrumentSelectionController, InstrumentSelectionController.S[0]);
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                return Boolean.valueOf(((pji.a) value).f236787b.getScrollState() == 0);
            case 8:
                com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.b bVar = (com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.b) obj3;
                p37.f result = (p37.f) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof p37.d) {
                    bVar.C2(new k37.h(((p37.d) result).f232697a));
                } else {
                    if (!(result instanceof p37.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.C2(k37.i.f180632a);
                }
                return Unit.f186387a;
            case 9:
                b21.a aVar4 = ((k3f.a) obj3).f180709b;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM `reports`");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "portfolioId");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "from");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "to");
                    ArrayList arrayList2 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList2.add(new q3f.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), b21.a.i(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow2))), b21.a.i(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow3)))));
                        break;
                    }
                    return arrayList2;
                } finally {
                }
            case 10:
                b21.a aVar5 = ((k3f.b) obj3).f180711b;
                SQLiteStatement sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("SELECT * FROM `us_reports`");
                try {
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "portfolioId");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "from");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare2, "to");
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        arrayList3.add(new q3f.b(sQLiteStatementPrepare2.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare2.getText(columnIndexOrThrow4), b21.a.i(sQLiteStatementPrepare2.isNull(columnIndexOrThrow5) ? null : Long.valueOf(sQLiteStatementPrepare2.getLong(columnIndexOrThrow5))), b21.a.i(sQLiteStatementPrepare2.isNull(columnIndexOrThrow6) ? null : Long.valueOf(sQLiteStatementPrepare2.getLong(columnIndexOrThrow6)))));
                        break;
                    }
                    return arrayList3;
                } finally {
                }
            case 11:
                k3g.o oVar = (k3g.o) obj3;
                r7a.i output = (r7a.i) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof r7a.h) {
                    oVar.l2(new k22.c(oVar, r56, 2), new yi5.b(i3));
                } else if ((output instanceof r7a.e) || (output instanceof r7a.f)) {
                    oVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.travel_common_location_error_no_permission, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5));
                } else {
                    if (!(output instanceof g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    try {
                        m.Companion companion = m.INSTANCE;
                        throw new IllegalStateException("Unhandled secondary click");
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
                return Unit.f186387a;
            case 12:
                return k3g.d.a((k3g.d) obj2, new Data((TravelSearchResponse) obj3, null, false), null, null, null, 30);
            case 13:
                return k3k.w.a((k3k.w) obj2, (RemittanceTransferData) obj3, null, null, 0, 59);
            case 14:
                com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.c cVar3 = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow.c) obj3;
                k result2 = (k) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 == null) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.t2(cVar3, cVar3.f74400s, new TaxHubTransactionExportFlowContract$Step.Filter(result2.f212318a, result2.f212319b), true, null, false, 12);
                return Unit.f186387a;
            case 15:
                TaxHubTransactionExportFlowContract$State update3 = (TaxHubTransactionExportFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return TaxHubTransactionExportFlowContract$State.a(update3, null, null, a1.l(update3.f74388c, ((s47.k) ((s47.m) obj3)).f259788a), 0, 0, 0, null, 123);
            case 16:
                i47.i iVar = (i47.i) obj3;
                TaxHubTransactionExportFlowContract$State update4 = (TaxHubTransactionExportFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return TaxHubTransactionExportFlowContract$State.a(update4, iVar.f158290a, iVar.f158291b, iVar.f158292c, iVar.d, iVar.e, iVar.f, null, 64);
            case 17:
                l lVar = (l) obj3;
                lVar.e3(new k49.j(lVar, (r) obj2, r56, r132 == true ? 1 : 0));
                return Unit.f186387a;
            case 18:
                NewTransferScreen newTransferScreen = (NewTransferScreen) obj3;
                Context it9 = (Context) obj2;
                KProperty[] kPropertyArr = NewTransferScreen.U;
                Intrinsics.checkNotNullParameter(it9, "it");
                ScreenContentRecyclerView recyclerView = newTransferScreen.d3().f174540c;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
                ((s3a.c) newTransferScreen.O.getValue()).getClass();
                k4a.c itemMatcher = new k4a.c();
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Intrinsics.checkNotNullParameter(itemMatcher, "itemMatcher");
                Context context = recyclerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                BaseRecyclerViewGridLayoutManager baseRecyclerViewGridLayoutManager = new BaseRecyclerViewGridLayoutManager(context, 4);
                baseRecyclerViewGridLayoutManager.setMeasurementCacheEnabled(false);
                baseRecyclerViewGridLayoutManager.setSpanSizeLookup(new k4a.b(itemMatcher, recyclerView));
                return baseRecyclerViewGridLayoutManager;
            case 19:
                u uVar = (u) obj3;
                uVar.H2(uVar.C, new y(((Boolean) obj2).booleanValue(), i2));
                return Unit.f186387a;
            case 20:
                d2k.f output2 = (d2k.f) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                ((com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow.b) obj3).C2(output2);
                return Unit.f186387a;
            case 21:
                com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow.c cVar4 = (com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow.c) obj3;
                d2k.f output3 = (d2k.f) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                BankTransferFlowInputData bankTransferFlowInputData = cVar4.o;
                if (output3 instanceof d2k.d) {
                    d2k.d dVar2 = (d2k.d) output3;
                    if (dVar2.f110875b != null) {
                        cVar4.l2(new k4k.h(dVar2, cVar4, null), new yi5.b(i3));
                    } else if (bankTransferFlowInputData instanceof BankTransferFlowInputData.ReviewOnly) {
                        cVar4.C2(output3);
                    } else {
                        b3a.a aVar6 = cVar4.f102098q;
                        k71.i data = qk.d.e(6, dVar2.f110874a, null, null);
                        f5j.a beneficiary = bankTransferFlowInputData.getF101940a();
                        v3a.b bVar2 = (v3a.b) aVar6;
                        bVar2.getClass();
                        Intrinsics.checkNotNullParameter(data, "data");
                        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
                        cVar4.C1(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), bVar2.e(data, beneficiary.f132335l == f5j.r.PAYID_ALIAS ? new ChatTransferRecipient.ApmTransferRecipient(new PayIdBeneficiary(new ApmIdentifier.Uuid(beneficiary.f132329a), n61.j.c(beneficiary), beneficiary)) : new ChatTransferRecipient.BeneficiaryRecipient(beneficiary, null)))));
                    }
                } else if ((output3 instanceof d2k.a) || (output3 instanceof d2k.e)) {
                    cVar4.C2(output3);
                } else {
                    if (!Intrinsics.f(output3, d2k.c.f110873a) && !Intrinsics.f(output3, d2k.b.f110872a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (bankTransferFlowInputData instanceof BankTransferFlowInputData.ReviewOnly) {
                        cVar4.C2(output3);
                    } else {
                        oki.h.D2(cVar4.f102099r);
                    }
                }
                return Unit.f186387a;
            case 22:
                os2.g gVar = (os2.g) obj3;
                pki.a aVar7 = (pki.a) gVar.f229224b;
                if (((Boolean) obj2).booleanValue()) {
                    aVar7.J1(gVar);
                } else {
                    aVar7.e0(gVar);
                }
                return Unit.f186387a;
            case 23:
                h0 update5 = (h0) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return h0.a(update5, null, null, null, null, o0.a(update5.e, null, 0L, null, null, false, null, (x30.c) obj3, 63), null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435439);
            case 24:
                n nVar = (n) obj3;
                h0 update6 = (h0) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                m1 m1Var = update6.d;
                return h0.a(update6, null, null, null, m1.a(m1Var, null, null, null, null, null, null, null, 0, r0.q(m1Var.i, new Pair(nVar.getId(), nVar)), 511), null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435447);
            case 25:
                h0 update7 = (h0) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return h0.a(update7, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, k50.a1.a(update7.A, ((s2) obj3).f181238a, f0.f322471a, 0, 1), 201326591);
            case 26:
                return h0.a((h0) obj2, null, null, null, null, null, null, (f1) obj3, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435391);
            case 27:
                ChatMessageToPass chatMessageToPass = (ChatMessageToPass) obj3;
                h0 h0Var = (h0) obj2;
                c0 c0Var = h0Var.f181091s;
                if (Intrinsics.f(c0Var != null ? c0Var.f181037a : null, chatMessageToPass.f51041b)) {
                    return h0Var;
                }
                o0 o0Var = h0Var.e;
                return h0.a(h0Var, null, null, null, null, o0.a(o0Var, "", o0Var.f181193b + 100, null, null, false, null, null, 112), null, null, null, null, null, false, false, null, null, b1.a(h0Var.f181090r, null, null, null, null, 23), null, false, null, null, null, null, null, null, null, 268238831);
            case 28:
                h0 h0Var2 = (h0) obj2;
                o0 o0Var2 = h0Var2.e;
                List list = o0Var2.f;
                List list2 = ((m0) ((n0.a) obj3)).f181177a;
                ArrayList arrayList4 = new ArrayList(w.t(list2, 10));
                Iterator it10 = list2.iterator();
                while (it10.hasNext()) {
                    arrayList4.add(new u0((File) it10.next(), null));
                }
                return h0.a(h0Var2, null, null, null, null, o0.a(o0Var2, null, 0L, null, null, false, d0.E0(arrayList4, list), null, 95), null, null, null, null, null, false, false, null, null, null, null, false, null, null, null, null, null, null, null, 268435439);
            default:
                k52.e eVar = (k52.e) obj3;
                c12.u0 result3 = (c12.u0) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (((ApmTransferWrapperNavigation$InputData.AcceptMoneyRequest) eVar.o).f62304c) {
                    eVar.C2(result3);
                } else {
                    oki.h.D2(eVar.f181384s);
                }
                return Unit.f186387a;
        }
    }
}
