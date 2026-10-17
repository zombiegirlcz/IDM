package lu5;

import android.content.Context;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.card_input.common.ui.CardInputActivity;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.FreelancerAcquiringOrderFiltersScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.FreelancerAcquiringOrderFiltersScreenContract$ModalStep;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.statements.api.navigation.SavingsAccountsStatementFeatureConfig$SavingsAccountInfo;
import com.revolut.feature.statements.impl.ui.savings.flow.SavingsStatementsFlowContract$Step;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.custom_amount.CheckoutCustomAmountScreenContract$ValidationResult;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.retail.operation_status.modal_status.SuccessType;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import d9.e1;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kx7.i0;
import lv4.s;
import lz7.a;
import nkm.y;
import nr6.c0;
import o97.m0;
import org.joda.time.LocalDate;
import pfm.t;
import skm.p0;
import wm.b;
import zhm.a1;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f200036b;

    public /* synthetic */ o(Enum r110, com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a aVar, int i) {
        this.f200035a = i;
        this.f200036b = r110;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v40 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Set setR1;
        Set setF9;
        Object next;
        Object dVar;
        int i = this.f200035a;
        int i2 = 6;
        int i3 = 12;
        int i5 = 7;
        int i6 = 5;
        boolean z = false;
        z = false;
        final int i21 = 2;
        final int i22 = 1;
        int i32 = 4;
        Object obj3 = this.f200036b;
        switch (i) {
            case 0:
                List walletsWithPockets = (List) obj2;
                Intrinsics.checkNotNullParameter(walletsWithPockets, "walletsWithPockets");
                return y.n(y.n(y.n(y.n(y.s(d0.Q(walletsWithPockets), new lsl.b(i32)), new lsl.b(i6)), new lsl.b((r) obj3, i2)), new lsl.b(i5)), new lsl.b(8));
            case 1:
                FreelancerAcquiringOrderFiltersScreen freelancerAcquiringOrderFiltersScreen = (FreelancerAcquiringOrderFiltersScreen) obj3;
                KProperty[] kPropertyArr = FreelancerAcquiringOrderFiltersScreen.X;
                Intrinsics.checkNotNullParameter((Context) obj2, "it");
                ScreenGridLayoutManager screenGridLayoutManager = new ScreenGridLayoutManager(freelancerAcquiringOrderFiltersScreen.m2(), 2, 8);
                screenGridLayoutManager.setSpanSizeLookup(new lu6.c(freelancerAcquiringOrderFiltersScreen, screenGridLayoutManager));
                return screenGridLayoutManager;
            case 2:
                ju6.b bVar = (ju6.b) obj3;
                lu6.l update = (lu6.l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                AcquiringOrderFilter acquiringOrderFilter = update.f200048b;
                if (acquiringOrderFilter == null || (setR1 = acquiringOrderFilter.r1()) == null) {
                    setR1 = h0.f322473a;
                }
                Set setB = bVar.b();
                Set setK = setR1.containsAll(setB) ? a1.k(setR1, setB) : a1.l(setR1, setB);
                return lu6.l.a(update, null, setK.isEmpty() ? acquiringOrderFilter != null ? acquiringOrderFilter.j9(o0.f186429a.b(AcquiringOrderFilter.Channel.class)) : null : com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a.J2(acquiringOrderFilter, new AcquiringOrderFilter.Channel(setK)), 5);
            case 3:
                c0 c0Var = (c0) obj3;
                lu6.l update2 = (lu6.l) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                AcquiringOrderFilter acquiringOrderFilter2 = update2.f200048b;
                if (acquiringOrderFilter2 == null || (setF9 = acquiringOrderFilter2.F9()) == null) {
                    setF9 = h0.f322473a;
                }
                LinkedHashSet linkedHashSetA = gc0.c.A(setF9, c0Var);
                return lu6.l.a(update2, null, linkedHashSetA.isEmpty() ? acquiringOrderFilter2 != null ? acquiringOrderFilter2.j9(o0.f186429a.b(AcquiringOrderFilter.Status.class)) : null : com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a.J2(acquiringOrderFilter2, new AcquiringOrderFilter.Status(linkedHashSetA)), 5);
            case 4:
                com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a aVar = (com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen.a) obj3;
                kw6.b result = (kw6.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result == null) {
                    throw new NoWhenBranchMatchedException();
                }
                oki.h.v2(aVar.f73687s, new FreelancerAcquiringOrderFiltersScreenContract$ModalStep.EndDateRangePicker(result.f190295a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Unit.f186387a;
            case 5:
                lua.a update3 = (lua.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return lua.a.a(update3, null, ((nua.b) obj3).f219268a, 1);
            case 6:
                com.revolut.feature.security_hub.impl.ui.hidden_accounts_and_transactions.a aVar2 = (com.revolut.feature.security_hub.impl.ui.hidden_accounts_and_transactions.a) obj3;
                qa7.b it8 = (qa7.b) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (!Intrinsics.f(it8, qa7.b.f243971a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2.C2(luc.e.f200217a);
                return Unit.f186387a;
            case 7:
                OrderQuote it9 = (OrderQuote) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return ((kbb.c) obj3).g(e1.l(it9));
            case 8:
                Function0 loadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(loadingItems, "loadingItems");
                List list = (List) loadingItems.invoke();
                ((lv4.d0) obj3).getClass();
                return new s(null, list);
            case 9:
                final lwl.e eVar = (lwl.e) obj3;
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                pfm.h hVar = new pfm.h(new i1i.a(eVar, 11), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                pfm.r rVarD = o70.a.d(hVar);
                pfm.h hVar2 = new pfm.h(new Callable() { // from class: lwl.a
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i22) {
                            case 0:
                                e eVar2 = eVar;
                                if (e.k) {
                                    return pfm.m.f235744a;
                                }
                                p0 p0Var = p0.f264001a;
                                return pd.b.n(elm.f.f127540b, new c(eVar2, null, 0));
                            case 1:
                                e eVar3 = eVar;
                                if (e.k) {
                                    return pfm.m.f235744a;
                                }
                                p0 p0Var2 = p0.f264001a;
                                return pd.b.n(elm.f.f127540b, new c(eVar3, null, 2));
                            default:
                                e eVar4 = eVar;
                                if (e.k) {
                                    return pfm.m.f235744a;
                                }
                                p0 p0Var3 = p0.f264001a;
                                return pd.b.n(elm.f.f127540b, new d(eVar4, null));
                        }
                    }
                }, 1);
                Intrinsics.checkNotNullExpressionValue(hVar2, "defer(...)");
                pfm.a aVarV = ue0.e.v(hVar2);
                final int i33 = z ? 1 : 0;
                pfm.h hVar3 = new pfm.h(new Callable() { // from class: lwl.a
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i33) {
                            case 0:
                                e eVar2 = eVar;
                                if (e.k) {
                                    return pfm.m.f235744a;
                                }
                                p0 p0Var = p0.f264001a;
                                return pd.b.n(elm.f.f127540b, new c(eVar2, null, 0));
                            case 1:
                                e eVar3 = eVar;
                                if (e.k) {
                                    return pfm.m.f235744a;
                                }
                                p0 p0Var2 = p0.f264001a;
                                return pd.b.n(elm.f.f127540b, new c(eVar3, null, 2));
                            default:
                                e eVar4 = eVar;
                                if (e.k) {
                                    return pfm.m.f235744a;
                                }
                                p0 p0Var3 = p0.f264001a;
                                return pd.b.n(elm.f.f127540b, new d(eVar4, null));
                        }
                    }
                }, 1);
                Intrinsics.checkNotNullExpressionValue(hVar3, "defer(...)");
                pfm.a aVarV2 = ue0.e.v(hVar3);
                pfm.h hVar4 = new pfm.h(new Callable() { // from class: lwl.a
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        switch (i21) {
                            case 0:
                                e eVar2 = eVar;
                                if (e.k) {
                                    return pfm.m.f235744a;
                                }
                                p0 p0Var = p0.f264001a;
                                return pd.b.n(elm.f.f127540b, new c(eVar2, null, 0));
                            case 1:
                                e eVar3 = eVar;
                                if (e.k) {
                                    return pfm.m.f235744a;
                                }
                                p0 p0Var2 = p0.f264001a;
                                return pd.b.n(elm.f.f127540b, new c(eVar3, null, 2));
                            default:
                                e eVar4 = eVar;
                                if (e.k) {
                                    return pfm.m.f235744a;
                                }
                                p0 p0Var3 = p0.f264001a;
                                return pd.b.n(elm.f.f127540b, new d(eVar4, null));
                        }
                    }
                }, 1);
                Intrinsics.checkNotNullExpressionValue(hVar4, "defer(...)");
                pfm.a aVarV3 = ue0.e.v(hVar4);
                p0 p0Var = p0.f264001a;
                pfm.f fVarO = efm.b.o(v.k(rVarD, aVarV, aVarV2, aVarV3, pd.b.n(elm.f.f127540b, new lwl.c(eVar, , i22))));
                bji.a aVar3 = new bji.a(3);
                dfm.c cVar = mfm.f.d;
                en.a aVar4 = mfm.f.f205043c;
                t tVar = new t(fVarO, cVar, cVar, aVar4, aVar4, aVar3, aVar4);
                Intrinsics.checkNotNullExpressionValue(tVar, "doAfterTerminate(...)");
                return tVar;
            case 10:
                List external = (List) obj2;
                Intrinsics.checkNotNullParameter(external, "external");
                ufm.i iVar = new ufm.i(((lx3.a) obj3).f200522a.y(AccountId.Personal.f51414a), new lr9.m(new lv9.c(i3), 26), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                ufm.i iVar2 = new ufm.i(iVar, new lr9.m(new lsl.d(external, i21), 25), 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return iVar2;
            case 11:
                jx0.a aVar5 = (jx0.a) obj3;
                do3.n it10 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                String str = it10.f116414l;
                if (str == null) {
                    str = "";
                }
                return aVar5.i(str);
            case 12:
                lxe.d dVar2 = (lxe.d) obj2;
                dj0.d customAmount = dVar2.f200559a;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(customAmount, "customAmount");
                return new lxe.d(customAmount, (CheckoutCustomAmountScreenContract$ValidationResult) obj3);
            case 13:
                List list2 = (List) obj2;
                Intrinsics.h(list2);
                ((CardInputActivity) ((jy2.l) obj3)).setItems(list2);
                return Unit.f186387a;
            case 14:
                FreelancerInvoiceSettings invoiceSettings = (FreelancerInvoiceSettings) obj2;
                Intrinsics.checkNotNullParameter(invoiceSettings, "invoiceSettings");
                aii.o oVarR2 = ((ly6.c) obj3).r2();
                if (invoiceSettings.f != null && (!r4.isEmpty())) {
                    z = true;
                }
                List list3 = invoiceSettings.f;
                List list4 = list3;
                if (list3 == null) {
                    list4 = f0.f322471a;
                }
                List list5 = list4;
                boolean zIsEmpty = list5.isEmpty();
                List listD1 = list5;
                if (zIsEmpty) {
                    listD1 = d0.d1(sr6.m.a());
                }
                oVarR2.M0(new ly6.e(z, d0.P0(listD1, new ly6.a())));
                return new jy6.g(null, invoiceSettings);
            case 15:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                FreelancerInvoice freelancerInvoice = (FreelancerInvoice) pair.f186385a;
                FreelancerInvoiceSettings freelancerInvoiceSettings = (FreelancerInvoiceSettings) pair.f186386b;
                aii.o oVarR22 = ((ly6.k) obj3).r2();
                boolean z3 = !freelancerInvoice.o.isEmpty();
                List list6 = freelancerInvoice.o;
                boolean zIsEmpty2 = list6.isEmpty();
                List list7 = list6;
                if (zIsEmpty2) {
                    List list8 = freelancerInvoiceSettings.f;
                    list7 = list8;
                    if (list8 == null) {
                        list7 = f0.f322471a;
                    }
                }
                List list9 = list7;
                boolean zIsEmpty3 = list9.isEmpty();
                List listD12 = list9;
                if (zIsEmpty3) {
                    listD12 = d0.d1(sr6.m.a());
                }
                oVarR22.M0(new ly6.e(z3, d0.P0(listD12, new ly6.g())));
                return new jy6.g(freelancerInvoice, freelancerInvoiceSettings);
            case 16:
                ly9.j paymentSearchItem = (ly9.j) obj2;
                Intrinsics.checkNotNullParameter(paymentSearchItem, "paymentSearchItem");
                return new o97.y((m0) obj3, paymentSearchItem, null, 60);
            case 17:
                lyd.q item = (lyd.q) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                String str2 = item.f200796a;
                f01.c cVar2 = ((lyd.n) obj3).f200792a;
                xi0.b.Companion.getClass();
                return cVar2.b(new CurrencyClause(xi0.a.a(str2), null, null, 6)).toString();
            case 18:
                svi.s sVar = (svi.s) obj3;
                lyi.a update4 = (lyi.a) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return lyi.a.a(update4, null, sVar.f265982b, sVar.f265983c, sVar, 1);
            case 19:
                xel.b kyc2 = (xel.b) obj2;
                Intrinsics.checkNotNullParameter(kyc2, "kyc");
                return nim.a.w(((hyk.l) ((kye.e) obj3).f190729b).d.f(Unit.f186387a, true), new o(kyc2, 20));
            case 20:
                xel.b bVar2 = (xel.b) obj3;
                List requiredDocuments = (List) obj2;
                Intrinsics.checkNotNullParameter(requiredDocuments, "requiredDocuments");
                List<xel.c> list10 = requiredDocuments;
                ArrayList arrayList = new ArrayList(w.t(list10, 10));
                for (xel.c cVar3 : list10) {
                    Iterator it11 = bVar2.f304702a.iterator();
                    while (true) {
                        if (it11.hasNext()) {
                            next = it11.next();
                            if (Intrinsics.f(((xel.c) next).f304706b, cVar3.f304706b)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    xel.c cVar4 = (xel.c) next;
                    arrayList.add(xel.c.a(cVar3, cVar4 != null ? cVar4.i : null));
                }
                return arrayList;
            case 21:
                lz7.d dVar3 = (lz7.d) obj3;
                mz7.a aVar6 = dVar3.f200947b;
                lz7.a action = (lz7.a) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                if (action instanceof a.C1141a) {
                    dVar = b.c.f298571a;
                } else if (action instanceof a.b) {
                    dVar = new wm.d(aVar6.a(null));
                } else {
                    if (!(action instanceof lz7.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar = new wm.d(aVar6.a(((lz7.b) action).f200944a));
                }
                return dVar3.f200946a.c0(dVar);
            case 22:
                lz7.f fVar = (lz7.f) obj3;
                lz7.c action2 = (lz7.c) obj2;
                Intrinsics.checkNotNullParameter(action2, "action");
                fx7.m mVar = fVar.f200949a;
                Date date = action2.f200945a;
                Intrinsics.checkNotNullParameter(date, "date");
                i0 i0Var = mVar.f138771a;
                i0Var.getClass();
                Intrinsics.checkNotNullParameter(date, "date");
                Intrinsics.checkNotNullParameter(date, "<this>");
                LocalDate localDateFromDateFields = LocalDate.fromDateFields(date);
                Intrinsics.checkNotNullExpressionValue(localDateFromDateFields, "fromDateFields(...)");
                String strK = ce9.m.K(localDateFromDateFields);
                Intrinsics.checkNotNullExpressionValue(strK, "toISO8601Format(...)");
                pfm.a aVarE = te0.w.g0(i0Var.f190466a.setPurchaseReminder(new jx7.f(strK))).e(new pfm.a(((w4l.f) ((kx7.f) mVar.f138772b).d.getValue()).g(Unit.f186387a, false), mfm.f.f205044g, 1));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                g3l.a aVar7 = fVar.f200950b;
                Date date2 = action2.f200945a;
                int i43 = R$string.pets_dashboard_issues_purchase_reminder_success_title;
                long time = date2.getTime();
                TimeClause.Format.INSTANCE.getClass();
                pfm.a aVarE2 = aVarE.e(aVar7.c0(new StatusViewConfiguration.Success("REMINDER_SUCCESS_STATUS_DIALOG_ID", new TextLocalisedClause(i43, u.c(new TimeClause(time, TimeClause.Format.f57959a, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), null, 8)), null, 12), null, null, SuccessType.Simple.f104398a, 1916)));
                Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                return aVarE2;
            case 23:
                com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.c cVar5 = (com.revolut.feature.topup_screen.impl.flows.topup_flows.ideal.c) obj3;
                Throwable e = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(e, "e");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                cVar5.C2(new lze.c(e));
                oki.h.D2(cVar5.f91002q);
                return Boolean.TRUE;
            case 24:
                rp0.y yVar = (rp0.y) obj2;
                j60.a aVar8 = ((m0a.n) obj3).f201129l;
                Intrinsics.h(yVar);
                return aVar8.G(yVar);
            case 25:
                com.revolut.feature.statements.impl.ui.savings.flow.a aVar9 = (com.revolut.feature.statements.impl.ui.savings.flow.a) obj3;
                cjb.a output = (cjb.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                yki.a aVar10 = aVar9.f88387p;
                Set<npg.j> set = output.f24630a;
                ArrayList arrayList2 = new ArrayList(w.t(set, 10));
                for (npg.j jVar : set) {
                    arrayList2.add(new SavingsAccountsStatementFeatureConfig$SavingsAccountInfo(jVar.f218215a, jVar.f218216b));
                }
                oki.h.t2(aVar9, aVar10, new SavingsStatementsFlowContract$Step.StatementGeneration(arrayList2), false, TransitionAnimation.SLIDE_END_TO_START.f98395a, false, 8);
                return Unit.f186387a;
            case 26:
                oyf.b bVar3 = (oyf.b) obj3;
                Data pageData = (Data) obj2;
                Intrinsics.checkNotNullParameter(pageData, "pageData");
                d0g.a aVar11 = (d0g.a) pageData.getContent();
                List list11 = aVar11 != null ? aVar11.f110359b : f0.f322471a;
                boolean loading = pageData.getLoading();
                d0g.a aVar12 = (d0g.a) pageData.getContent();
                return new lk0.e(list11, bVar3, loading, aVar12 != null ? aVar12.f110358a : 0, null, 16);
            case 27:
                lk0.g it12 = (lk0.g) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                pfm.h hVar5 = new pfm.h(new la8.j((m0k.c) obj3, it12, i5), 2);
                Intrinsics.checkNotNullExpressionValue(hVar5, "fromAction(...)");
                return hVar5;
            case 28:
                m0k.b bVar4 = (m0k.b) obj3;
                Data it13 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                rzj.k kVar = (rzj.k) it13.getContent();
                List list12 = kVar != null ? kVar.f258697a : null;
                if (list12 == null) {
                    list12 = f0.f322471a;
                }
                return new lk0.e(list12, bVar4, it13.getLoading(), null, it13.getError(), 8);
            default:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new rzj.k(it14, ((rzj.e) obj3).f258694b);
        }
    }

    public /* synthetic */ o(Object obj2, int i) {
        this.f200035a = i;
        this.f200036b = obj2;
    }
}
