package pqc;

import android.os.Parcelable;
import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.t;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ConfigurableResourceImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.card_management.impl.cardlimit.screens.setlimit.CardSetLimitScreen;
import com.revolut.feature.card_management.impl.ui.kompot.settings.RevolutCardSettingsScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_increase_preference.CreditCardLimitIncreasePreferenceController;
import com.revolut.feature.credit.direct.debit.account_details.DirectDebitAccountDetailsScreen;
import com.revolut.feature.kyc.impl.introduction.IntroductionScreen;
import com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreen;
import com.revolut.feature.payments.groups.impl.ui_new.group_details_settings_name.GroupSettingsNameScreenModel$StatusViewSuccessPayload;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureDetails;
import com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreen;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.adjust_asset_value.AdjustAssetValueController;
import com.revolut.feature.transfer_reasons.impl.ui.transactions.TransferReasonsTransactionsScreen;
import com.revolut.feature.wealth_discovery.impl.screener.screens.sorting_picker.ScreenerSortingPickerScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.stock_details.StockDetailsFlowController;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.stock_details.StockDetailsFlowControllerContract$Page;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import ep6.m;
import fsl.v;
import h93.f0;
import ip0.t5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import m9d.w0;
import mii.q;
import nel.n;
import nii.n1;
import okhttp3.ResponseBody;
import org.jmrtd.lds.LDSFile;
import oti.b1;
import oti.w1;
import oti.z1;
import pnh.d0;
import pqg.i0;
import prl.r;
import psl.p;
import psl.s;
import pti.u;
import pti.z;
import pwc.a0;
import q03.h0;
import q09.b0;
import retrofit2.Response;
import vkm.j2;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f238726w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f238726w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k((com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.a) this.f238726w, continuation, 0);
                kVar.v = obj2;
                return kVar;
            case 1:
                return new k((i0) this.v, (TextLocalisedClause) this.f238726w, continuation, 1);
            case 2:
                k kVar2 = new k((ScreenerSortingPickerScreen) this.f238726w, continuation, 2);
                kVar2.v = obj2;
                return kVar2;
            case 3:
                k kVar3 = new k((AdjustAssetValueController) this.f238726w, continuation, 3);
                kVar3.v = obj2;
                return kVar3;
            case 4:
                return new k((prg.a) this.v, (String) this.f238726w, continuation, 4);
            case 5:
                k kVar4 = new k((prl.e) this.f238726w, continuation, 5);
                kVar4.v = obj2;
                return kVar4;
            case 6:
                k kVar5 = new k((prl.f) this.f238726w, continuation, 6);
                kVar5.v = obj2;
                return kVar5;
            case 7:
                return new k((r) this.v, (xi0.b) this.f238726w, continuation, 7);
            case 8:
                k kVar6 = new k((psk.h) this.f238726w, continuation, 8);
                kVar6.v = obj2;
                return kVar6;
            case 9:
                k kVar7 = new k((psl.c) this.f238726w, continuation, 9);
                kVar7.v = obj2;
                return kVar7;
            case 10:
                k kVar8 = new k((CreditCardLimitIncreasePreferenceController) this.f238726w, continuation, 10);
                kVar8.v = obj2;
                return kVar8;
            case 11:
                k kVar9 = new k((pt9.i) this.f238726w, continuation, 11);
                kVar9.v = obj2;
                return kVar9;
            case 12:
                k kVar10 = new k((TransferReasonsTransactionsScreen) this.f238726w, continuation, 12);
                kVar10.v = obj2;
                return kVar10;
            case 13:
                k kVar11 = new k((ptf.l) this.f238726w, continuation, 13);
                kVar11.v = obj2;
                return kVar11;
            case 14:
                k kVar12 = new k((com.revolut.feature.workflow.engine.onboarding.impl.workflow.a) this.f238726w, continuation, 14);
                kVar12.v = obj2;
                return kVar12;
            case 15:
                k kVar13 = new k((pti.e) this.f238726w, continuation, 15);
                kVar13.v = obj2;
                return kVar13;
            case 16:
                k kVar14 = new k((u) this.f238726w, continuation, 16);
                kVar14.v = obj2;
                return kVar14;
            case 17:
                k kVar15 = new k((z) this.f238726w, continuation, 17);
                kVar15.v = obj2;
                return kVar15;
            case 18:
                return new k((com.revolut.feature.kyc.impl.cmd.flow.b) this.v, (String) this.f238726w, continuation, 18);
            case 19:
                k kVar16 = new k((StockDetailsFlowController) this.f238726w, continuation, 19);
                kVar16.v = obj2;
                return kVar16;
            case 20:
                k kVar17 = new k((IntroductionScreen) this.f238726w, continuation, 20);
                kVar17.v = obj2;
                return kVar17;
            case 21:
                k kVar18 = new k((WealthProtectionLimitChangeScreen) this.f238726w, continuation, 21);
                kVar18.v = obj2;
                return kVar18;
            case 22:
                k kVar19 = new k((DirectDebitAccountDetailsScreen) this.f238726w, continuation, 22);
                kVar19.v = obj2;
                return kVar19;
            case 23:
                k kVar20 = new k((aah.g) this.f238726w, continuation, 23);
                kVar20.v = obj2;
                return kVar20;
            case 24:
                k kVar21 = new k((CardSetLimitScreen) this.f238726w, continuation, 24);
                kVar21.v = obj2;
                return kVar21;
            case 25:
                k kVar22 = new k((aah.g) this.f238726w, continuation, 25);
                kVar22.v = obj2;
                return kVar22;
            case 26:
                k kVar23 = new k((com.revolut.feature.card_management.impl.ui.kompot.settings.b) this.f238726w, continuation, 26);
                kVar23.v = obj2;
                return kVar23;
            case 27:
                k kVar24 = new k(continuation, (h0) this.f238726w);
                kVar24.v = obj2;
                return kVar24;
            case 28:
                k kVar25 = new k((LessonScreen) this.f238726w, continuation, 28);
                kVar25.v = obj2;
                return kVar25;
            default:
                k kVar26 = new k((com.revolut.feature.apm.core.ui.impl.ui.new_contact.a) this.f238726w, continuation, 29);
                kVar26.v = obj2;
                return kVar26;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((k) create((q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((k) create((pqh.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((k) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((k) create((prl.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((k) create((InvestOrdersParams) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((k) create((n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((k) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((k) create((xp3.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((k) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((k) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((k) create((m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((k) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((k) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((k) create((Response) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((k) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((k) create((StockDetailsFlowControllerContract$Page) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((k) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((k) create((t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((k) create((t5) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((k) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((k) create((pz2.m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((k) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((k) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((k) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((k) create((b0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v85, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v60, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List listC;
        int i;
        Iterable iterableL;
        Object obj3;
        i93.k kVar;
        int i2 = this.u;
        int i3 = 2;
        int i5 = 3;
        int i6 = 4;
        int i21 = 26;
        Object obj4 = this.f238726w;
        switch (i2) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.a aVar2 = (com.revolut.feature.salary_switch.impl.ui.brazil.screen.bank_list.a) obj4;
                aVar2.H2(aVar2.f85283r, new d0(data, aVar2));
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i0 i0Var = (i0) this.v;
                i0Var.v2(new jpg.d(new jpg.a(i0Var.u.f94775a.f234881a), (TextLocalisedClause) obj4));
                return Unit.f186387a;
            case 2:
                pqh.h hVar = (pqh.h) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                pqh.n nVar = (pqh.n) ((ScreenerSortingPickerScreen) obj4).P.getValue();
                zel.g metric = hVar.f238783a;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(metric, "metric");
                nVar.H2(nVar.f238790p, new pqh.l(metric, nVar));
                return Unit.f186387a;
            case 3:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                prd.i iVarE3 = ((AdjustAssetValueController) obj4).e3();
                String amountString = charSequence.toString();
                iVarE3.getClass();
                Intrinsics.checkNotNullParameter(amountString, "amountString");
                y yVar = iVarE3.f238993r;
                xi0.b bVar = ((prd.a) ((j2) yVar.f22677a).getValue()).f238977a.f115083b;
                iVarE3.H2(yVar, new iff.c(iVarE3.f238992q.b(amountString, bVar.f306286a), bVar, 1));
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return ((prg.a) this.v).f239014q.a((String) obj4);
            case 5:
                prl.c cVar = (prl.c) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                krl.k kVarA = ((krl.l) ((prl.e) obj4).d).a(cVar.f239323a);
                if (kVarA != null) {
                    return mrl.d.e(kVarA);
                }
                return null;
            case 6:
                InvestOrdersParams investOrdersParams = (InvestOrdersParams) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                krl.l lVar = ((prl.f) obj4).f239329c;
                if (investOrdersParams instanceof InvestOrdersParams.OrdersAll) {
                    listC = lVar.b(null);
                } else if (investOrdersParams instanceof InvestOrdersParams.OrdersByCurrency) {
                    listC = lVar.b(((InvestOrdersParams.OrdersByCurrency) investOrdersParams).f106806a.f306286a);
                } else {
                    if (!(investOrdersParams instanceof InvestOrdersParams.OrdersByCurrencies)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Set set = ((InvestOrdersParams.OrdersByCurrencies) investOrdersParams).f106803a;
                    ArrayList arrayList = new ArrayList(w.t(set, 10));
                    Iterator it8 = set.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((xi0.b) it8.next()).f306286a);
                    }
                    listC = lVar.c(arrayList);
                }
                List list = listC;
                ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(mrl.d.e((krl.k) it9.next()));
                }
                return (List) ue0.e.M(nkm.y.J(nkm.y.n(nkm.y.n(nkm.y.n(nkm.y.n(zhm.d0.Q(arrayList2), new v(investOrdersParams, 1)), new v(investOrdersParams, i3)), new v(investOrdersParams, i5)), new v(investOrdersParams, i6))));
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                z9h.n.l(String.class, ((r) this.v).f239350c, "INVEST_ORDER_FLOW_DISPLAY_CURRENCY", ((xi0.b) obj4).f306286a);
                return Unit.f186387a;
            case 8:
                n nVar2 = (n) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((psk.h) obj4).f239504c.Z2(nVar2);
                return Unit.f186387a;
            case 9:
                p pVar = ((psl.c) obj4).d;
                Object obj5 = this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                String e = ((koi.j) obj5).getF53837a();
                switch (e.hashCode()) {
                    case -1938321481:
                        if (e.equals("ESTIMATED_TOTAL_CREDIT")) {
                            pVar.c3(s.f239544a);
                        }
                        break;
                    case -463199690:
                        if (e.equals("SETTLEMENT_DATE_ID")) {
                            pVar.c3(psl.y.f239550a);
                        }
                        break;
                    case -356883849:
                        if (e.equals("TIME_IN_FORCE_ID")) {
                            pVar.c3(psl.u.f239546a);
                        }
                        break;
                    case -343285075:
                        if (e.equals("STATUS_ROW_ID")) {
                            pVar.c3(psl.w.f239548a);
                        }
                        break;
                    case -310398965:
                        if (e.equals("ESTIMATED_TOTAL_COST")) {
                            pVar.c3(psl.r.f239543a);
                        }
                        break;
                    case 522835369:
                        if (e.equals("TOTAL_VALUE_ROW_ID")) {
                            pVar.c3(psl.t.f239545a);
                        }
                        break;
                    case 1513672630:
                        if (e.equals("LIST_ID_UNIFIED_FEE")) {
                            pVar.c3(psl.v.f239547a);
                        }
                        break;
                    case 1650216939:
                        if (e.equals("SHARES_ROW_ID")) {
                            pVar.c3(psl.q.f239542a);
                        }
                        break;
                }
                return Unit.f186387a;
            case 10:
                xp3.d option = (xp3.d) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                pt4.h hVar2 = (pt4.h) ((CreditCardLimitIncreasePreferenceController) obj4).R.getValue();
                hVar2.getClass();
                Intrinsics.checkNotNullParameter(option, "option");
                hVar2.H2(hVar2.f239611q, new pp5.d(option, i21));
                return Unit.f186387a;
            case 11:
                n1 n1Var = (n1) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Parcelable parcelableA = n1Var.a().a();
                GroupSettingsNameScreenModel$StatusViewSuccessPayload groupSettingsNameScreenModel$StatusViewSuccessPayload = parcelableA instanceof GroupSettingsNameScreenModel$StatusViewSuccessPayload ? (GroupSettingsNameScreenModel$StatusViewSuccessPayload) parcelableA : null;
                if (groupSettingsNameScreenModel$StatusViewSuccessPayload != null) {
                    ((pt9.i) obj4).v2(new pt9.b(groupSettingsNameScreenModel$StatusViewSuccessPayload.f79493a));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(com.revolut.data.database.models.openbanking.d.s("StatusDialog Result not supported: ", n1Var));
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
            case 12:
                String query = (String) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ptf.g gVarE3 = ((TransferReasonsTransactionsScreen) obj4).e3();
                Intrinsics.h(query);
                ptf.l lVar2 = (ptf.l) gVarE3;
                lVar2.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                lVar2.f239670r.setValue(kotlin.text.d0.F0(query).toString());
                return Unit.f186387a;
            case 13:
                Data data2 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ptf.l lVar3 = (ptf.l) obj4;
                lVar3.H2(lVar3.f239671s, new pj3.b(data2, lVar3, i21));
                return Unit.f186387a;
            case 14:
                m mVar = (m) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if ((mVar instanceof ep6.j) || Intrinsics.f(mVar, ep6.l.f128091a)) {
                    com.revolut.feature.workflow.engine.onboarding.impl.workflow.a aVar17 = (com.revolut.feature.workflow.engine.onboarding.impl.workflow.a) obj4;
                    Continuation continuation = null;
                    aVar17.l2(new prl.k(aVar17, continuation, continuation, i6), new yi5.b(i21));
                } else if (!(mVar instanceof ep6.i) && !(mVar instanceof ep6.k)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 15:
                String str = (String) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                z1 z1Var = (z1) j6.a.k(z1.class, ((pti.e) obj4).f239735c, j6.a.q("KEY_TERMINAL_", str));
                if (z1Var != null) {
                    return qti.b.a(z1Var);
                }
                return null;
            case 16:
                String str2 = (String) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                b1 b1Var = (b1) j6.a.k(b1.class, ((u) obj4).f239760c, j6.a.q("KEY_PASS_", str2));
                if (b1Var != null) {
                    return oi0.d.M(b1Var);
                }
                return null;
            case 17:
                z zVar = (z) obj4;
                Response response = (Response) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Object objBody = response.body();
                if (objBody != null) {
                    return new pti.v(((w1) zVar.f239771c.b(w1.Companion.serializer(), ((ResponseBody) objBody).string())).f229700a, z.a(zVar, response, "Retry-After"), z.a(zVar, response, "x-retry-timeout"));
                }
                throw new IllegalArgumentException("Required value was null.");
            case 18:
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.kyc.impl.cmd.flow.b) this.v).C2(new ms8.d((String) obj4));
                return Unit.f186387a;
            case 19:
                StockDetailsFlowControllerContract$Page page = (StockDetailsFlowControllerContract$Page) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                puk.s sVar = (puk.s) ((StockDetailsFlowController) obj4).e3();
                sVar.getClass();
                Intrinsics.checkNotNullParameter(page, "page");
                sVar.H2(sVar.z, new pth.l(page, i6));
                return Unit.f186387a;
            case 20:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                pw8.k kVarE3 = ((IntroductionScreen) obj4).d();
                Intrinsics.h(clickData);
                pw8.l lVar4 = (pw8.l) kVarE3;
                lVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                lVar4.C2(new pw8.f(clickData.f275445a, clickData.d));
                return Unit.f186387a;
            case 21:
                t data3 = (t) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                pwc.p pVarE3 = ((WealthProtectionLimitChangeScreen) obj4).e3();
                Intrinsics.h(data3);
                com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a aVar25 = (com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a) pVarE3;
                aVar25.getClass();
                Intrinsics.checkNotNullParameter(data3, "data");
                ActionWidgetDelegate.Model model = data3.f54722b;
                if (Intrinsics.f(model.f51590a, "STREET_MODE_WIFI_SUGGESTION_LIST_ITEM_ID")) {
                    Object obj6 = model.f51596l;
                    String str3 = obj6 instanceof String ? (String) obj6 : null;
                    if (str3 == null) {
                        throw new IllegalArgumentException("Wi-Fi suggestion banner must carry the ssid");
                    }
                    ActionWidgetDelegate.a aVar26 = data3.f54721a;
                    int i22 = 25;
                    if (aVar26 instanceof ActionWidgetDelegate.a.c) {
                        aVar25.A1(new a0(aVar25, str3, null, 0), new yi5.b(i22));
                    } else {
                        Continuation continuation2 = null;
                        if (aVar26 instanceof ActionWidgetDelegate.a.d) {
                            aVar25.A1(new a0(aVar25, str3, continuation2, 1), new yi5.b(i22));
                        } else {
                            Unit unit = Unit.f186387a;
                        }
                    }
                }
                return Unit.f186387a;
            case 22:
                t5 model2 = (t5) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                py4.f fVar = (py4.f) ((DirectDebitAccountDetailsScreen) obj4).Y.getValue();
                Intrinsics.h(model2);
                fVar.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                c70.a.b(fVar.f240664p, "CLIPBOARD_LABEL", String.valueOf(model2.e), false, 4);
                r70.c.b(fVar.f240665q, 3);
                fVar.X1(te0.w.a("ID_COPIED_TO_CLIPBOARD", new TextLocalisedClause(R.string.account_detail_alert_copied_clipboard, null, null, 14), null, new ConfigurableResourceImage(R$drawable.uikit_icn_24_copy, null, null, null, 1022), null, null, LDSFile.EF_DG12_TAG));
                return Unit.f186387a;
            case 23:
                ty0.a aVar28 = (ty0.a) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((pyg.a) ((aah.g) obj4).e).Z2(aVar28);
                return Unit.f186387a;
            case 24:
                pz2.m event = (pz2.m) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                pz2.n nVar3 = (pz2.n) ((CardSetLimitScreen) obj4).M.getValue();
                nVar3.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof pz2.j) {
                    nVar3.B2();
                } else if (event instanceof pz2.l) {
                    String str4 = ((pz2.l) event).f240879a;
                    w80.b bVar2 = nVar3.o;
                    y yVar2 = nVar3.f240881q;
                    nVar3.H2(yVar2, new ar3.a(new dj0.d(bVar2.b(str4, ((pz2.h) ((j2) yVar2.f22677a).getValue()).f240873a.f64823b.f115083b.f306286a), ((pz2.h) ((j2) yVar2.f22677a).getValue()).f240873a.f64823b.f115083b), nVar3));
                } else {
                    if (!(event instanceof pz2.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar3.l2(new pwb.p(nVar3, null, i3), new yi5.b(i21));
                }
                return Unit.f186387a;
            case 25:
                ty0.a aVar31 = (ty0.a) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((pzh.a) ((aah.g) obj4).e).b3(aVar31);
                return Unit.f186387a;
            case 26:
                Pair pair = (Pair) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar3 = (com.revolut.feature.card_management.impl.ui.kompot.settings.b) obj4;
                bVar3.H2(bVar3.E, new w0((Data) pair.f186385a, (Data) pair.f186386b, 10));
                return Unit.f186387a;
            case 27:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                yhm.r rVar2 = (yhm.r) rVar.f314201a;
                yhm.r rVar3 = (yhm.r) rVar.f314202b;
                Pair pair2 = (Pair) rVar.f314203c;
                Object obj7 = rVar2.f314201a;
                Object obj8 = rVar2.f314202b;
                Object obj9 = rVar2.f314203c;
                Object obj10 = rVar3.f314201a;
                Object obj11 = rVar3.f314202b;
                Object obj12 = rVar3.f314203c;
                Object obj13 = pair2.f186385a;
                od0.i iVar = (od0.i) pair2.f186386b;
                int iIntValue = ((Number) obj12).intValue();
                List scaCounters = (List) obj11;
                Set unsupportedCardSettings = (Set) obj10;
                e7l.f config = (e7l.f) obj9;
                yt8.i kycStatus = (yt8.i) obj8;
                f0 f0Var = (f0) obj7;
                h0 h0Var2 = (h0) obj4;
                u03.n nVar4 = h0Var2.f;
                i93.c cVar2 = (i93.c) ((od0.i) obj13).f224257a;
                if (cVar2 == null) {
                    cVar2 = f0Var.f150113g;
                }
                f0 card = f0.b(f0Var, cVar2);
                boolean z = card.f150112c;
                boolean z3 = card.d;
                RevolutCardSettingsScreenContract$InputData revolutCardSettingsScreenContract$InputData = h0Var2.f241072a;
                AccountId accountId = revolutCardSettingsScreenContract$InputData.f64901b;
                wy2.b flowType = revolutCardSettingsScreenContract$InputData.d;
                WealthProtectionFeatureDetails wealthProtectionFeatureDetails = (WealthProtectionFeatureDetails) iVar.f224257a;
                Intrinsics.checkNotNullParameter(card, "card");
                Intrinsics.checkNotNullParameter(kycStatus, "kycStatus");
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(unsupportedCardSettings, "unsupportedCardSettings");
                Intrinsics.checkNotNullParameter(scaCounters, "scaCounters");
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                Intrinsics.checkNotNullParameter(flowType, "flowType");
                boolean z4 = (!ngm.n.p(kycStatus) || z3 || card.S()) ? false : true;
                boolean z6 = (z || card.y() || Intrinsics.f(card.f150121r, Boolean.TRUE)) ? false : true;
                boolean z11 = z && card.X;
                boolean z12 = !card.y();
                i93.c cVar3 = card.f150113g;
                if (cVar3 == null || (kVar = cVar3.f159551c) == null) {
                    i = 1;
                    iterableL = zhm.f0.f322471a;
                } else {
                    i = 1;
                    i93.i[] elements = {kVar.d, kVar.f159567c, kVar.f159566b, kVar.f159565a, kVar.e, kVar.f};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    iterableL = kotlin.collections.d.L(elements);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj14 : iterableL) {
                    if (!unsupportedCardSettings.contains(((i93.i) obj14).f159561a)) {
                        arrayList3.add(obj14);
                    }
                }
                ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                Iterator it10 = arrayList3.iterator();
                while (it10.hasNext()) {
                    arrayList4.add(u03.l.a((i93.i) it10.next(), card.v));
                }
                Iterator it11 = scaCounters.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        Object next = it11.next();
                        if (Intrinsics.f(((h93.o) next).f150157a, card.f150110a)) {
                            obj3 = next;
                        }
                    } else {
                        obj3 = null;
                    }
                }
                return new e03.b(card, z4, z6, z11, config, arrayList4, (h93.o) obj3, !unsupportedCardSettings.contains(i93.e.ATM_WITHDRAWAL), nVar4.f276052b.a("com.google.android.apps.walletnfcrel") && card.H() && iIntValue == i && nVar4.f276051a.b() && !z3, accountId, z12, flowType, wealthProtectionFeatureDetails);
            case 28:
                b0 b0Var = (b0) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                LessonScreen lessonScreen = (LessonScreen) obj4;
                KProperty[] kPropertyArr = LessonScreen.c0;
                lessonScreen.Z2().f110334b.post(new p6.e(b0Var, lessonScreen, i5));
                return Unit.f186387a;
            default:
                Boolean bool = (Boolean) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.apm.core.ui.impl.ui.new_contact.a aVar37 = (com.revolut.feature.apm.core.ui.impl.ui.new_contact.a) obj4;
                y yVar3 = aVar37.u;
                aVar37.H2(yVar3, new aqd.n1(17, bool));
                if (aVar37.o.f) {
                    aVar37.H2(yVar3, new aqd.n1(18, bool));
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f238726w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Continuation continuation, h0 h0Var) {
        super(2, continuation);
        this.u = 27;
        this.f238726w = h0Var;
    }
}
