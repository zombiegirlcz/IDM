package ox5;

import aw0.o9;
import aw0.y4;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationAmendment;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.freelancer.impl.ui.invoice.details.screen.InvoiceDetailsScreen;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.shared.invoices.api.domain.model.InvoiceTemplate;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230617a;

    public /* synthetic */ t0(int i) {
        this.f230617a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        UUID uuid;
        UUID uuid2;
        ly9.j eVar;
        String country;
        switch (this.f230617a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                IntRange intRangeO = kotlin.ranges.f.o(0, 6);
                ArrayList arrayList = new ArrayList(zhm.w.t(intRangeO, 10));
                vim.f it8 = intRangeO.iterator();
                while (it8.f289625c) {
                    ip0.f fVar = new ip0.f(a0.d.n("COLLECTIONS_LOADING_ID_", it8.nextInt()));
                    yp0.b.l(fVar, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(fVar);
                }
                return zhm.v.k(new ListSubheaderDelegate.Model("COLLECTIONS_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.wealth_trading_discovery_collections, null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(R.string.common_action_see_all, null, null, 14), true, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp16, 0, 0, 0, (String) null, 253754), new hg("COLLECTIONS_LIST_ID", arrayList, 3, new y4(x0.f230618g), null, null, false, false, null, null, 0, 0, 0, 0, 32752));
            case 1:
                CellDetailsActionDelegate.Model it9 = (CellDetailsActionDelegate.Model) obj2;
                KProperty[] kPropertyArr = InvoiceDetailsScreen.Z;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(Intrinsics.f(it9.f51781a, "ITEM_ID_ITEMS_VAT_SUM"));
            case 2:
                CellDetailsDelegate.Model it10 = (CellDetailsDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = InvoiceDetailsScreen.Z;
                Intrinsics.checkNotNullParameter(it10, "it");
                Object obj3 = it10.o;
                if (obj3 instanceof xy6.a) {
                    return (xy6.a) obj3;
                }
                return null;
            case 3:
                InvoiceTemplate it11 = (InvoiceTemplate) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it11);
            case 4:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 6:
                WealthAccount wealthAccount = (WealthAccount) obj2;
                Intrinsics.checkNotNullParameter(wealthAccount, "wealthAccount");
                if (!(wealthAccount instanceof WealthAccount.Robo) && !(wealthAccount instanceof WealthAccount.Commodities)) {
                    if (wealthAccount instanceof WealthAccount.Margin) {
                        string = ((WealthAccount.Margin) wealthAccount).f95234c;
                    } else if (wealthAccount instanceof WealthAccount.Securities) {
                        TradingAccount.Portfolio portfolio = ((WealthAccount.Securities) wealthAccount).f95240c;
                        if (portfolio != null && (uuid2 = portfolio.f105210a) != null) {
                            string = uuid2.toString();
                        }
                    } else {
                        if (!(wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        TradingAccount.Portfolio d = ((WealthAccount.TaxAdvantageWealthAccount) wealthAccount).getD();
                        if (d != null && (uuid = d.f105210a) != null) {
                            string = uuid.toString();
                        }
                    }
                }
                od0.i.Companion.getClass();
                return od0.h.a(string);
            case 7:
                wel.e it12 = (wel.e) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it12);
            case 8:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 9:
                NaviCommand it13 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new o97.l(it13);
            case 10:
                dj0.d money = (dj0.d) obj2;
                Intrinsics.checkNotNullParameter(money, "money");
                return nub.a.i(qvb.a.c(money), null, null, o9.NON_SENSITIVE, 3);
            case 11:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(dsd.i.b(it14).contains("INVITE_A_FRIEND"));
            case 12:
                NaviCommand it15 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new o97.l(it15);
            case 13:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it16 = list2.iterator();
                while (it16.hasNext()) {
                    arrayList2.add(new ly9.f((PaymentGroup) it16.next()));
                }
                return arrayList2;
            case 14:
                List list3 = (List) obj2;
                Intrinsics.checkNotNullParameter(list3, "list");
                List<jq9.k> listV0 = zhm.d0.V0(list3, 3);
                ArrayList arrayList3 = new ArrayList();
                for (jq9.k kVar : listV0) {
                    if (kVar instanceof jq9.m) {
                        eVar = new ly9.b(((jq9.m) kVar).f177508b);
                    } else if (kVar instanceof jq9.n) {
                        eVar = new ly9.c(((jq9.n) kVar).f177510b.f81495a);
                    } else if (kVar instanceof jq9.p) {
                        eVar = new ly9.d(((jq9.p) kVar).f177514b);
                    } else if (kVar instanceof jq9.s) {
                        eVar = new ly9.f(((jq9.s) kVar).f177520b);
                    } else if (kVar instanceof jq9.l) {
                        eVar = new ly9.a(((jq9.l) kVar).f177506b);
                    } else if (kVar instanceof jq9.q) {
                        eVar = new ly9.e(((jq9.q) kVar).f177516b);
                    } else {
                        if (!(kVar instanceof jq9.o) && !(kVar instanceof jq9.r)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        eVar = null;
                    }
                    if (eVar != null) {
                        arrayList3.add(eVar);
                    }
                }
                return arrayList3;
            case 15:
                List list4 = (List) obj2;
                Intrinsics.checkNotNullParameter(list4, "list");
                List list5 = list4;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                Iterator it17 = list5.iterator();
                while (it17.hasNext()) {
                    arrayList4.add(new ly9.b((f5j.a) it17.next()));
                }
                return arrayList4;
            case 16:
                List paymentCounterparties = (List) obj2;
                Intrinsics.checkNotNullParameter(paymentCounterparties, "paymentCounterparties");
                List list6 = paymentCounterparties;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(list6, 10));
                Iterator it18 = list6.iterator();
                while (it18.hasNext()) {
                    arrayList5.add(new ly9.e((PaymentCounterpartyInfo) it18.next()));
                }
                return arrayList5;
            case 17:
                List it19 = (List) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return zi0.c.P(it19, false, null, 3);
            case 18:
                NaviCommand naviCommand = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
                return new o97.l(naviCommand);
            case 19:
                oy9.i it20 = (oy9.i) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return zi0.c.P(it20, false, null, 3);
            case 20:
                List list7 = (List) obj2;
                Intrinsics.checkNotNullParameter(list7, "list");
                return m72.b.x(list7, od0.i.Companion);
            case 21:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                Address address = user.k;
                if (address == null || (country = address.getCountry()) == null) {
                    throw new IllegalStateException("No user country");
                }
                return country;
            case 22:
                Boolean isRequired = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isRequired, "isRequired");
                aim.e eVarB = zhm.u.b();
                TermsScope.INSTANCE.getClass();
                eVarB.add(TermsScope.X);
                if (isRequired.booleanValue()) {
                    eVarB.add(TermsScope.N);
                }
                return zhm.u.a(eVarB);
            case 23:
                kyc.h evidenceResponse = (kyc.h) obj2;
                Intrinsics.checkNotNullParameter(evidenceResponse, "evidenceResponse");
                return evidenceResponse.getId();
            case 24:
                ApmPaymentAuthorisationSummary it21 = (ApmPaymentAuthorisationSummary) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return new ApmPaymentAuthorisationPendingAction.Mandate(it21);
            case 25:
                ApmPaymentAuthorisationAmendment it22 = (ApmPaymentAuthorisationAmendment) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return new ApmPaymentAuthorisationPendingAction.Amendment(it22);
            case 26:
                List<String> path = (List) obj2;
                Intrinsics.checkNotNullParameter(path, "path");
                od0.h hVar = od0.i.Companion;
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                String strO = "";
                for (String str : path) {
                    m70.a.a(kotlin.jvm.internal.t0.f186434a);
                    String str2 = strO.length() > 0 ? " · " : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    strO = com.google.android.gms.internal.mlkit_vision_face.a.o(strO, str2, str);
                }
                hVar.getClass();
                return od0.h.a(strO);
            case 27:
                od0.i submission = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(submission, "submission");
                od0.h hVar2 = od0.i.Companion;
                gzc.q qVar = (gzc.q) submission.g();
                string = qVar != null ? qVar.f148026a : null;
                hVar2.getClass();
                return od0.h.a(string);
            case 28:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return Boolean.valueOf((((Boolean) rVar.f314201a).booleanValue() || ((Boolean) rVar.f314202b).booleanValue() || ((Boolean) rVar.f314203c).booleanValue()) ? false : true);
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return ((Boolean) pair.f186385a).booleanValue() ? g0d.a.LOCKED : ((gzc.w) pair.f186386b).d ? g0d.a.LIMITED : g0d.a.NORMAL;
        }
    }

    public /* synthetic */ t0(dsd.i iVar) {
        this.f230617a = 11;
    }
}
