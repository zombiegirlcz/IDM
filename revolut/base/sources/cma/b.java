package cma;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.collection.ArrayMap;
import androidx.sqlite.SQLiteConnection;
import androidx.viewpager.widget.ViewPager;
import c84.t;
import cci.g;
import cli.y;
import cni.f;
import cni.o;
import cni.q;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.data.database.models.beneficiary.BeneficiaryDao_Impl;
import com.revolut.data.database.models.openbanking.ExternalInstitutionsDao_Impl;
import com.revolut.data.database.models.recurringpayments.RecurringPaymentDao_Impl;
import com.revolut.data.database.models.splitbill.SplitBillDao_Impl;
import com.revolut.data.database.models.splitbill.SplitBillEntity;
import com.revolut.data.database.models.transactioncategory.TransactionCustomCategoryDao_Impl;
import com.revolut.data.model.Data;
import com.revolut.data.network.models.splitbill.SplitBillRepositoryImpl;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.credit.application.plugins.impl.ui.akahu.AkahuFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.akahu.AkahuFlowContract$Step;
import com.revolut.feature.external_accounts.api.navigation.EasyBankTransferDescriptor$PreselectedInstitutionInfo;
import com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.EasyBankTransferFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.EasyBankTransferFlowContract$Step;
import com.revolut.feature.kyc.core.models.KycConfiguration;
import com.revolut.feature.kyc.impl.KycScreenContract$Step;
import com.revolut.feature.kyc.impl.choosedocument.model.SelectedKycDocs;
import com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$Destination;
import com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData;
import com.revolut.feature_retail_user_declarations.citizenship.SubmitCitizenshipFlowOutput;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.network.NetworkChangedReceiver;
import com.revolut.oauth.impl.R$string;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.StockFinancialsStatementsActivity;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.StockFinancialsStatementsContract$Configuration;
import com.revolut.retail.feature.stockdetails.impl.ui.utils.TabNavigationId;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import csk.p;
import cu8.d1;
import cu8.g1;
import cu8.n1;
import cu8.x0;
import dx4.z2;
import eii.k;
import fy4.s;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ks8.j;
import my8.r;
import nel.n;
import nii.y0;
import nii.z;
import pfm.m;
import rv3.b;
import skm.p0;
import vkm.j2;
import we6.u;
import xn6.h;
import xn6.i;
import xn6.j;
import yji.l;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25182c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f25180a = i;
        this.f25181b = obj2;
        this.f25182c = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v39, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        boolean z;
        Object obj3;
        String selectedTabId;
        Bundle extras;
        int i = this.f25180a;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        int i2 = 1;
        int i3 = 2;
        Object obj4 = this.f25182c;
        Object obj5 = this.f25181b;
        switch (i) {
            case 0:
                g purpose = (g) obj2;
                Intrinsics.checkNotNullParameter(purpose, "purpose");
                return ((d) obj5).f25187b.c(purpose, (wi0.b) obj4);
            case 1:
                com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e eVar = (com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.e) obj5;
                EasyBankTransferFlowContract$InputData easyBankTransferFlowContract$InputData = eVar.o;
                yki.b bVar = (yki.b) obj4;
                j result = (j) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof h) {
                    ExternalInstitution externalInstitution = ((h) result).f307323a;
                    boolean z3 = externalInstitution.k;
                    String str = externalInstitution.f66108b;
                    if (z3) {
                        Collection collection = externalInstitution.d;
                        List list = externalInstitution.f66111h;
                        if (collection == null) {
                            collection = f0.f322471a;
                        }
                        if (collection.isEmpty()) {
                            eVar.C2(new u(new EasyBankTransferDescriptor$PreselectedInstitutionInfo.Data.Institution(externalInstitution.f66107a, externalInstitution.f66108b, externalInstitution.f66109c, easyBankTransferFlowContract$InputData.f72959a.f115083b, externalInstitution.i, list.contains(ho3.c.REMITTER_IBAN))));
                            if (!easyBankTransferFlowContract$InputData.f) {
                                oki.h.D2(eVar.v);
                            }
                        } else {
                            oki.h.t2(eVar, eVar.v, new EasyBankTransferFlowContract$Step.Branches(externalInstitution.f66107a, str, externalInstitution.f66109c, list.contains(ho3.c.REMITTER_IBAN)), true, null, false, 12);
                        }
                    } else {
                        oki.h.w2(bVar, new EasyBankTransferFlowContract$Step.InstitutionNotAvailableDialog(str), bottom_dialog);
                    }
                } else if (result instanceof i) {
                    eVar.C1(u0.b(((i) result).f307324a));
                } else if (result instanceof j.a) {
                    eVar.B2();
                } else {
                    if (!(result instanceof xn6.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i5 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 2:
                q qVar = (q) obj5;
                f fVar = (f) obj4;
                Throwable cause = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(cause, "cause");
                if (tj0.a.a(cause)) {
                    z = false;
                } else {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, "Unable to confirm OAuth consent", cause, h0Var);
                    String str2 = fVar.f25434a.f315017c.f315013b;
                    l.a1(qVar, qVar.X1(new y0("confirm_failure_dialog", new z(new TextLocalisedClause(R$string.revolut_oauth_consent_failure_title_with_client_name, zhm.u.c(str2), null, 12), null, new TextLocalisedClause(R$string.revolut_oauth_consent_failure_go_back, zhm.u.c(str2), null, 12), null, null, null, false, null, null, null, null, null, null, 32758), false, 4)), null, null, new o(qVar, null, 0), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                return ((BeneficiaryDao_Impl) obj5).lambda$getByIdSync$5((String) obj4, (SQLiteConnection) obj2);
            case 4:
                return ((BeneficiaryDao_Impl) obj5).lambda$insertAll$0((List) obj4, (SQLiteConnection) obj2);
            case 5:
                return ((ExternalInstitutionsDao_Impl) obj5).lambda$__fetchRelationshipinstitutionBranchAscomRevolutDataDatabaseModelsOpenbankingExternalInstitutionBranchEntity$5((SQLiteConnection) obj4, (ArrayMap) obj2);
            case 6:
                return ((RecurringPaymentDao_Impl) obj5).lambda$getByReceiver$2((String) obj4, (SQLiteConnection) obj2);
            case 7:
                return ((RecurringPaymentDao_Impl) obj5).lambda$insertOrUpdateAll$0((List) obj4, (SQLiteConnection) obj2);
            case 8:
                return ((SplitBillDao_Impl) obj5).lambda$createOrUpdate$1((SplitBillEntity) obj4, (SQLiteConnection) obj2);
            case 9:
                return ((SplitBillDao_Impl) obj5).lambda$getById$4((String) obj4, (SQLiteConnection) obj2);
            case 10:
                return ((TransactionCustomCategoryDao_Impl) obj5).lambda$insertAll$1((List) obj4, (SQLiteConnection) obj2);
            case 11:
                return SplitBillRepositoryImpl.reloadSplitBillsAndRequestorDetails$lambda$0$0((SplitBillRepositoryImpl) obj5, (String) obj4, (String) obj2);
            case 12:
                com.revolut.feature.credit.application.plugins.impl.ui.akahu.b bVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.akahu.b) obj5;
                AkahuFlowContract$InputData akahuFlowContract$InputData = bVar2.f67026p;
                yki.l lVar = (yki.l) obj4;
                rv3.b outputData = (rv3.b) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof b.a) {
                    t.J2(bVar2, false, null, null, 7);
                } else if (outputData instanceof rv3.c) {
                    int i6 = b54.c.f12428a[((rv3.c) outputData).f257692a.ordinal()];
                    if (i6 == 1) {
                        mw3.e eVar2 = bVar2.f67028r;
                        String applicationId = akahuFlowContract$InputData.a9().f137835a;
                        eVar2.getClass();
                        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                        if (!Intrinsics.f(eVar2.f209323a, applicationId)) {
                            eVar2.f209323a = applicationId;
                            eVar2.f209324b.i();
                        }
                        oki.h.t2(bVar2, lVar, new AkahuFlowContract$Step.CustomTab(akahuFlowContract$InputData.f67021a), false, null, false, 14);
                    } else if (i6 == 2) {
                        z2 z2Var = akahuFlowContract$InputData.f67023c;
                        if (z2Var != null) {
                            bVar2.f2(bVar2.e1(new s(new fy4.t(z2Var))), bottom_dialog, new b54.b(bVar2, i2));
                        } else {
                            bVar2.l2(new b54.e(bVar2, null, i3), new b54.b(bVar2, i3));
                        }
                    } else {
                        if (i6 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        t.J2(bVar2, false, null, null, 7);
                    }
                } else {
                    if (!(outputData instanceof b.C1428b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i21 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 13:
                return NetworkChangedReceiver.runLocationUpdatesIfNeeded$lambda$0((NetworkChangedReceiver) obj5, (Context) obj4, (fo3.c) obj2);
            case 14:
                com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a aVar = (com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a) obj5;
                String str3 = (String) obj4;
                d67.u result2 = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof d67.s) {
                    aVar.l2(new c34.d(aVar, str3, (Continuation) null, 25), new yi5.b(26));
                } else {
                    oki.h.D2(aVar.z);
                }
                return Unit.f186387a;
            case 15:
                com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.a aVar2 = (com.revolut.feature.payments.bills_chooser.impl.ui.itemization.add.a) obj5;
                cq9.f update = (cq9.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return cq9.f.a(update, aVar2.o.b((String) obj4, aVar2.f79273q.f108050a.f306286a), null, 0, 6);
            case 16:
                String text = (String) obj5;
                cqf.e eVar3 = (cqf.e) obj2;
                boolean zY2 = ((cqf.h) obj4).y2(text);
                String label = eVar3.f108090a;
                int i22 = eVar3.f108092c;
                Intrinsics.checkNotNullParameter(label, "label");
                Intrinsics.checkNotNullParameter(text, "text");
                return new cqf.e(i22, label, zY2, text);
            case 17:
                com.revolut.feature.wealth_discovery.impl.screener.screens.meta_collection.a aVar3 = (com.revolut.feature.wealth_discovery.impl.screener.screens.meta_collection.a) obj5;
                poh.l lVar2 = (poh.l) obj4;
                k output = (k) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof eii.i) {
                    Object obj6 = ((eii.i) output).f126655a;
                    poh.k kVar = obj6 instanceof poh.k ? (poh.k) obj6 : null;
                    if (kVar != null) {
                        y yVar = aVar3.f96250w;
                        aVar3.H2(yVar, new b(lVar2, kVar, 18));
                        j2 j2Var = aVar3.v;
                        wgl.d dVarA = aVar3.f96245p.a(aVar3.f96249t, ((cqh.g) ((j2) yVar.f22677a).getValue()).f108106b);
                        j2Var.getClass();
                        j2Var.g(null, dVarA);
                    }
                }
                return Unit.f186387a;
            case 18:
                cqh.g update2 = (cqh.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return cqh.g.a(update2, null, r0.q(update2.f108106b, new Pair((poh.l) obj5, (poh.k) obj4)), null, null, 13);
            case 19:
                csk.q qVar2 = (csk.q) obj5;
                yrk.g gVar = qVar2.k;
                StockFinancialsStatementsContract$Configuration stockFinancialsStatementsContract$Configuration = qVar2.f108523h;
                csk.g gVar2 = (csk.g) obj4;
                Data it8 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List list2 = (List) it8.getContent();
                List list3 = list2;
                if (list3 == null || list3.isEmpty()) {
                    fsk.a aVar4 = fsk.c.Companion;
                    String str4 = stockFinancialsStatementsContract$Configuration.f103795b;
                    uqk.l lVar3 = stockFinancialsStatementsContract$Configuration.f103796c;
                    uqk.e eVar4 = (uqk.e) ((xrk.k) gVar.f316331a).x0().get();
                    aVar4.getClass();
                    FragmentNavigateCommand page = fsk.a.a(str4, lVar3, eVar4, null, null);
                    StockFinancialsStatementsActivity stockFinancialsStatementsActivity = (StockFinancialsStatementsActivity) gVar2;
                    Intrinsics.checkNotNullParameter(page, "page");
                    stockFinancialsStatementsActivity.Z0().setVisibility(8);
                    stockFinancialsStatementsActivity.z0 = f0.f322471a;
                    ((vqi.c) stockFinancialsStatementsActivity.f103792w0.getValue()).b(zhm.u.c(page));
                } else {
                    List listP0 = d0.P0(list2, new a9j.f(new p(), 16));
                    List<esk.b> list4 = listP0;
                    ArrayList<pwk.a> tabs = new ArrayList(w.t(list4, 10));
                    for (esk.b bVar3 : list4) {
                        TabNavigationId tabNavigationId = new TabNavigationId(z92.f.P(bVar3));
                        fsk.a aVar5 = fsk.c.Companion;
                        String str5 = stockFinancialsStatementsContract$Configuration.f103795b;
                        uqk.l lVar4 = stockFinancialsStatementsContract$Configuration.f103796c;
                        uqk.e eVar5 = (uqk.e) ((xrk.k) gVar.f316331a).x0().get();
                        List list5 = listP0;
                        Integer numValueOf = Integer.valueOf(bVar3.f128995a);
                        List list6 = list4;
                        Integer num = bVar3.f128996b;
                        aVar5.getClass();
                        tabs.add(new pwk.a(tabNavigationId, fsk.a.a(str5, lVar4, eVar5, numValueOf, num), qVar2.f108526m.c(bVar3)));
                        listP0 = list5;
                        list4 = list6;
                    }
                    List list7 = listP0;
                    Iterator it9 = list4.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            Object next = it9.next();
                            if (((esk.b) next).f128997c) {
                                obj3 = next;
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    esk.b bVar4 = (esk.b) obj3;
                    if (bVar4 == null || (selectedTabId = z92.f.P(bVar4)) == null) {
                        selectedTabId = z92.f.P((esk.b) d0.b0(list7));
                    }
                    StockFinancialsStatementsActivity stockFinancialsStatementsActivity2 = (StockFinancialsStatementsActivity) gVar2;
                    Intrinsics.checkNotNullParameter(tabs, "tabs");
                    Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
                    stockFinancialsStatementsActivity2.z0 = tabs;
                    vqi.c cVar = (vqi.c) stockFinancialsStatementsActivity2.f103792w0.getValue();
                    ArrayList arrayList = new ArrayList(w.t(tabs, 10));
                    Iterator it10 = tabs.iterator();
                    while (it10.hasNext()) {
                        arrayList.add(((pwk.a) it10.next()).f240487b);
                    }
                    cVar.b(arrayList);
                    ViewPager viewPagerB1 = stockFinancialsStatementsActivity2.b1();
                    Iterator it11 = tabs.iterator();
                    int i32 = 0;
                    while (true) {
                        if (!it11.hasNext()) {
                            i32 = -1;
                        } else if (!Intrinsics.f(((pwk.a) it11.next()).f240486a.f104064a, selectedTabId)) {
                            i32++;
                        }
                    }
                    viewPagerB1.setCurrentItem(i32, false);
                    Tabs tabsZ0 = stockFinancialsStatementsActivity2.Z0();
                    ArrayList arrayList2 = new ArrayList(w.t(tabs, 10));
                    for (pwk.a aVar6 : tabs) {
                        Intrinsics.checkNotNullParameter(aVar6, "<this>");
                        arrayList2.add(new com.revolut.core.ui_kit.views.q(aVar6.f240486a.f104064a, new com.revolut.core.ui_kit.views.t(aVar6.f240488c), 58));
                    }
                    tabsZ0.setItems(arrayList2, selectedTabId);
                    stockFinancialsStatementsActivity2.Z0().setVisibility(0);
                }
                return Unit.f186387a;
            case 20:
                TradingAccount tradingAccount = (TradingAccount) obj5;
                csl.c cVar2 = (csl.c) obj4;
                n instrument = (n) obj2;
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                if ((tradingAccount instanceof TradingAccount.GIA) || (tradingAccount instanceof TradingAccount.TaxAdvantage.Isa) || (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa) || (tradingAccount instanceof TradingAccount.TaxAdvantage.Pea)) {
                    return cVar2.a(u0.f(new InvestOrderContract$Destination(InvestOrderContract$InputData.Companion.e(InvestOrderContract$InputData.INSTANCE, instrument, tradingAccount.getF105262a(), null, 28))), instrument, tradingAccount);
                }
                if (!(tradingAccount instanceof TradingAccount.Margin) && !(tradingAccount instanceof TradingAccount.MoneyMarketFunds) && !(tradingAccount instanceof TradingAccount.Robo) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.Unknown) && !(tradingAccount instanceof TradingAccount.PaperTrading) && !(tradingAccount instanceof TradingAccount.Unknown)) {
                    throw new NoWhenBranchMatchedException();
                }
                return efm.d0.l(new IllegalStateException("Account launching recurring order is not acceptable: " + tradingAccount.W()));
            case 21:
                efm.b bVar5 = (efm.b) obj5;
                cu8.a aVar7 = (cu8.a) obj4;
                ks8.j kycResult = (ks8.j) obj2;
                Intrinsics.checkNotNullParameter(kycResult, "kycResult");
                if (kycResult instanceof j.a) {
                    return bVar5;
                }
                if (kycResult instanceof ks8.i) {
                    return new pfm.h(new a08.l(aVar7, kycResult, 12), 2);
                }
                throw new NoWhenBranchMatchedException();
            case 22:
                com.revolut.feature.kyc.impl.b bVar6 = (com.revolut.feature.kyc.impl.b) obj5;
                List list8 = (List) obj4;
                Boolean hasMoreDocs = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(hasMoreDocs, "hasMoreDocs");
                if (hasMoreDocs.booleanValue()) {
                    return bVar6.B3(new KycScreenContract$Step.MoreDocs(list8));
                }
                n1 n1Var = (n1) bVar6.e;
                efm.b bVarIgnoreElements = n1Var.f108867l.getValue(n1Var, n1.f108861y[11]).b(Boolean.TRUE).ignoreElements();
                Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                return bVarIgnoreElements;
            case 23:
                SelectedKycDocs selectedKycDocs = (SelectedKycDocs) obj4;
                my8.l defaultDoc = (my8.l) obj2;
                Intrinsics.checkNotNullParameter(defaultDoc, "defaultDoc");
                te0.e eVarH0 = ((n1) ((com.revolut.feature.kyc.impl.b) obj5).e).H0();
                Intrinsics.h(selectedKycDocs);
                return eVarH0.b(com.revolut.feature.kyc.impl.choosedocument.model.a.c(selectedKycDocs, defaultDoc));
            case 24:
                com.revolut.feature.kyc.impl.b bVar7 = (com.revolut.feature.kyc.impl.b) obj5;
                my8.k kVar2 = (my8.k) obj4;
                wi0.b countryCode = (wi0.b) obj2;
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                return Boolean.valueOf(com.bumptech.glide.d.x(countryCode) && !((Set) ((n1) bVar7.e).w0().get()).contains(kVar2));
            case 25:
                com.revolut.feature.kyc.impl.c cVar3 = (com.revolut.feature.kyc.impl.c) obj5;
                wi0.b bVar8 = ((SubmitCitizenshipFlowOutput.SelectedCitizenship) obj4).f97507a;
                r kycScope = (r) obj2;
                Intrinsics.checkNotNullParameter(kycScope, "kycScope");
                g1 g1Var = cVar3.o;
                if (kycScope == r.DOCUMENT_ID) {
                    efm.d0 d0VarFirstOrError = ((n1) ((com.revolut.feature.kyc.impl.b) g1Var).e).I0().c(te0.s.f270018a).firstOrError();
                    cu8.n nVar = new cu8.n(15, new b(bVar8, cVar3));
                    d0VarFirstOrError.getClass();
                    pfm.a aVar8 = new pfm.a(d0VarFirstOrError, nVar, 4);
                    Intrinsics.checkNotNullExpressionValue(aVar8, "flatMapCompletable(...)");
                    return aVar8;
                }
                com.revolut.feature.kyc.impl.b bVar9 = (com.revolut.feature.kyc.impl.b) g1Var;
                pfm.a aVarA3 = bVar9.A3(bVar8);
                n1 n1Var2 = (n1) bVar9.e;
                te0.e eVarH02 = n1Var2.H0();
                SelectedKycDocs selectedKycDocs2 = (SelectedKycDocs) n1Var2.H0().get();
                Intrinsics.checkNotNullParameter(selectedKycDocs2, "<this>");
                efm.b bVarIgnoreElements2 = eVarH02.b(SelectedKycDocs.a(selectedKycDocs2, null, null, 3)).ignoreElements();
                Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements2, "ignoreElements(...)");
                return aVarA3.e(bVarIgnoreElements2).e(bVar9.B3(KycScreenContract$Step.RemoteDocs.f77560a));
            case 26:
                com.revolut.feature.kyc.impl.c cVar4 = (com.revolut.feature.kyc.impl.c) obj4;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                my8.l lVar5 = (my8.l) pair.f186385a;
                KycConfiguration kycConfiguration = (KycConfiguration) pair.f186386b;
                Intent intent = ((kpi.a) obj5).f188248c;
                Uri uri2 = (intent == null || (extras = intent.getExtras()) == null) ? null : (Uri) extras.getParcelable("KYC_DOCUMENT_FILE_EXTRA_URI");
                File fileD = uri2 != null ? ((f80.b) cVar4.f77584y).d(uri2) : null;
                if (fileD != null) {
                    return cVar4.f77583x.c0(new sx8.f(fileD, lVar5.f210384b, cVar4.f77579r.f77547l, kycConfiguration.f77524c));
                }
                throw new IllegalStateException("Required value was null.");
            case 27:
                com.revolut.feature.kyc.impl.c cVar5 = (com.revolut.feature.kyc.impl.c) obj5;
                wi0.b currentCitizenship = (wi0.b) obj2;
                Intrinsics.checkNotNullParameter(currentCitizenship, "currentCitizenship");
                return !Intrinsics.f(currentCitizenship, (wi0.b) obj4) ? new pfm.h(new cu8.o(cVar5, i2), 2) : m.f235744a;
            case 28:
                wi0.b countryCode2 = (wi0.b) obj2;
                Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
                return pd.b.n(p0.f264003c, new c34.d((rp0.z) obj5, (com.revolut.feature.kyc.impl.f) obj4, countryCode2, (Continuation) null, 28));
            default:
                com.revolut.feature.kyc.impl.f fVar2 = (com.revolut.feature.kyc.impl.f) obj5;
                my8.l lVar6 = (my8.l) obj4;
                r kycScope2 = (r) obj2;
                Intrinsics.checkNotNullParameter(kycScope2, "kycScope");
                switch (x0.f108910b[kycScope2.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        return (pfm.h) ((com.revolut.feature.kyc.impl.b) fVar2.f77669c).f77569g.c0(d1.f108833a);
                    case 12:
                        return new pfm.h(new a08.l(fVar2, lVar6, 14), 2);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
        }
    }

    public /* synthetic */ b(wi0.b bVar, com.revolut.feature.kyc.impl.c cVar) {
        this.f25180a = 27;
        this.f25182c = bVar;
        this.f25181b = cVar;
    }
}
