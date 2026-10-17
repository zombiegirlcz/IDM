package x8h;

import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import bbk.o;
import com.feature.user.details.api.navigation.UserDetailsDestination;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.NewTicketContext;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.ObjectCarouselNavBarContentView;
import com.revolut.data.model.Data;
import com.revolut.feature.onboarding.api.workflow.WorkflowConfiguration;
import com.revolut.feature.onboarding.api.workflow.WorkflowFeatureConfig;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.trading_add_ons.impl.data.article_keys.InvestFirstVisitArticleKey;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.BondsCollectionFilterId;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilter;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilterValueId;
import com.revolut.feature_restricted_access_malware.impl.R$string;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.RestartApplicationCommand;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$OutputData;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Accept;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$ActionsBottomSheet;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Decline;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$ReturnUrl;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$StatusDialog;
import com.revolut.retail.feature.pending_payments.impl.common.PendingPaymentBottomSheetInputData;
import com.revolut.retail.feature.pending_payments.impl.ui.PendingPaymentFlowContract$Step;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import hs3.z1;
import ip0.gs;
import ip0.is;
import ip0.nb0;
import ip0.pb0;
import ip0.w40;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sgm.e3;
import zhm.y0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f303333b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f303332a = i;
        this.f303333b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [b93.d, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws UnsupportedEncodingException {
        Iterable iterable;
        Collection collection;
        List listK;
        pdh.e eVar;
        ?? r72;
        List listC;
        FeatureCommand featureCommandF;
        int i;
        int i2;
        List list;
        PendingPaymentBottomSheetInputData pendingPaymentBottomSheetInputData;
        int i3 = this.f303332a;
        d67.t tVar = d67.t.f111465a;
        d67.s sVar = d67.s.f111464a;
        int i5 = 22;
        int i6 = 6;
        int i21 = 5;
        int i22 = 3;
        boolean z = false;
        z = false;
        boolean z3 = false;
        z = false;
        Integer numValueOf = null;
        Object obj3 = this.f303333b;
        switch (i3) {
            case 0:
                z2f.a it8 = (z2f.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                int i32 = f.f303337a[((tzg.a) obj3).ordinal()];
                if (i32 == 1) {
                    return it8.f319060a.f319061a;
                }
                if (i32 == 2) {
                    return it8.f319060a.f319062b;
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                e eVar2 = (e) obj3;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Data data = (Data) pair.f186385a;
                Data data2 = (Data) pair.f186386b;
                if (data == null || (iterable = (List) data.getContent()) == null) {
                    iterable = zhm.f0.f322471a;
                }
                if (data2 == null || (collection = (List) data2.getContent()) == null) {
                    collection = zhm.f0.f322471a;
                }
                ArrayList arrayListE0 = zhm.d0.E0(iterable, collection);
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : arrayListE0) {
                    if (hashSet.add(((xzg.k) obj4).d())) {
                        arrayList.add(obj4);
                    }
                }
                List listP0 = zhm.d0.P0(arrayList, new q2j.v(eVar2, i5));
                if (data2 != null) {
                    return Data.copy$default(data2, listP0, null, false, 6, null);
                }
                return null;
            case 2:
                k kVar = (k) obj3;
                List holdingCurrencies = (List) obj2;
                Intrinsics.checkNotNullParameter(holdingCurrencies, "holdingCurrencies");
                return nim.a.v(rd0.e.b(kVar.f303354a.J(AccountId.Personal.f51414a, w4l.h.f294642c)), new d(zhm.c0.P(zhm.w.u(holdingCurrencies), kVar.e), i22));
            case 3:
                SortedSet sortedSet = (SortedSet) obj3;
                xi0.b baseCurrency = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                if (sortedSet.contains(baseCurrency)) {
                    return zhm.d0.d1(sortedSet);
                }
                ArrayList arrayListF1 = zhm.d0.f1(sortedSet);
                arrayListF1.add(0, baseCurrency);
                return arrayListF1;
            case 4:
                b9h.a params = (b9h.a) obj2;
                Intrinsics.checkNotNullParameter(params, "it");
                com.google.firebase.messaging.t tVar2 = (com.google.firebase.messaging.t) ((u0a.a) obj3).f276162b;
                Intrinsics.checkNotNullParameter(params, "params");
                return ((w4l.f) tVar2.e).f(params, true);
            case 5:
                m mVar = (m) obj3;
                ybl.h productGroupAvailability = (ybl.h) obj2;
                Intrinsics.checkNotNullParameter(productGroupAvailability, "productGroupAvailability");
                TradingAccountType[] elements = {TradingAccountType.Gia.f105270a, TradingAccountType.Robo.f105274a, TradingAccountType.Margin.f105271a, TradingAccountType.MoneyMarketFunds.f105272a, TradingAccountType.Taa.f105275a};
                Intrinsics.checkNotNullParameter(elements, "elements");
                Set setY0 = kotlin.collections.d.y0(elements);
                if (!(setY0 instanceof Collection) || !setY0.isEmpty()) {
                    Iterator it9 = setY0.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            TradingAccountType tradingAccountType = (TradingAccountType) it9.next();
                            Set set = mVar.f303362b;
                            cfl.v[] elements2 = {cfl.v.AVAILABLE, cfl.v.ONBOARDING, cfl.v.ACTIVE, cfl.v.OFFBOARDING};
                            Intrinsics.checkNotNullParameter(elements2, "elements");
                            if (!productGroupAvailability.c(set, tradingAccountType, kotlin.collections.d.y0(elements2)).isEmpty()) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 6:
                o oVar = (o) obj3;
                Data it10 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                pdh.h hVar = (pdh.h) it10.getContent();
                if ((hVar == null || (eVar = hVar.f235240c.f235234b) == null) ? false : !zhm.v.k(pdh.e.PURPOSE_LEARNING, pdh.e.PURPOSE_PRESERVE_CAPITAL).contains(eVar)) {
                    oVar.getClass();
                    listK = zhm.v.k(o.c(), new InstrumentsCollectionFilter.ListFilter(BondsCollectionFilterId.CREDIT_QUALITY, zhm.v.k(new InstrumentsCollectionFilter.ListFilter.Value(InstrumentsCollectionFilterValueId.BondsCreditQualityInvestmentGrade.f95303a, false), new InstrumentsCollectionFilter.ListFilter.Value(InstrumentsCollectionFilterValueId.BondsCreditQualityHighYield.f95302a, false)), 8), new InstrumentsCollectionFilter.RangeFilter(BondsCollectionFilterId.YIELD_TO_MATURITY, true, -20, 20, new InstrumentsCollectionFilter.RangeFilter.Range(-20, 20)), o.d(), new InstrumentsCollectionFilter.RangeFilter(BondsCollectionFilterId.MATURITY, true, 0, 20, new InstrumentsCollectionFilter.RangeFilter.Range(0, 20)), o.a(), o.b());
                } else {
                    oVar.getClass();
                    listK = zhm.v.k(o.c(), new InstrumentsCollectionFilter.RangeFilter(BondsCollectionFilterId.YIELD_TO_MATURITY, true, -20, 20, new InstrumentsCollectionFilter.RangeFilter.Range(-20, 20)), o.d(), new InstrumentsCollectionFilter.RangeFilter(BondsCollectionFilterId.MATURITY, true, 0, 20, new InstrumentsCollectionFilter.RangeFilter.Range(0, 20)), o.a(), o.b());
                }
                return zi0.c.P(listK, false, null, 3);
            case 7:
                dfl.r0 r0Var = (dfl.r0) obj3;
                return new e0h.a((List) obj2, r0Var.f114451b, r0Var.f114452c, r0Var.d);
            case 8:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                ArrayList arrayListE02 = zhm.d0.E0((List) pair2.f186386b, zhm.d0.F0(((tzg.e) obj3).f275964c.getF85125a(), zhm.d0.I0((List) pair2.f186385a)));
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : arrayListE02) {
                    if (hashSet2.add(((dfl.i0) obj5).getId())) {
                        arrayList2.add(obj5);
                    }
                }
                return arrayList2;
            case 9:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                xzg.s sVar2 = (xzg.s) pair3.f186385a;
                List list2 = (List) pair3.f186386b;
                List list3 = sVar2.f310027a;
                ((c0) obj3).getClass();
                ArrayList commodities = c0.a(list3, list2);
                ArrayList allAssets = c0.a(sVar2.f310028b, list2);
                ArrayList stocks = c0.a(sVar2.f310029c, list2);
                ArrayList crypto = c0.a(sVar2.d, list2);
                Intrinsics.checkNotNullParameter(commodities, "commodities");
                Intrinsics.checkNotNullParameter(allAssets, "allAssets");
                Intrinsics.checkNotNullParameter(stocks, "stocks");
                Intrinsics.checkNotNullParameter(crypto, "crypto");
                return new xzg.s(commodities, allAssets, stocks, crypto);
            case 10:
                e0 e0Var = (e0) obj3;
                xzg.c0 assets = (xzg.c0) obj2;
                Intrinsics.checkNotNullParameter(assets, "it");
                e0Var.getClass();
                Intrinsics.checkNotNullParameter(assets, "assets");
                return nim.a.w(mif.a.l(zhm.v.k(nim.a.w(e0Var.a(assets.f309974b), new h(4)), nim.a.w(e0Var.a(assets.f309975c), new h(i21)), nim.a.w(e0Var.a(assets.d), new h(i6)))), d0.f);
            case 11:
                ufm.g gVar = (ufm.g) obj3;
                List it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                List<qta.c> list4 = it11;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                for (qta.c cVar : list4) {
                    gVar.getClass();
                    arrayList3.add(new Pair(new Pair(cVar.f249046a, cVar.f249047b), cVar.a()));
                }
                return arrayList3;
            case 12:
                e3 e3Var = (e3) obj3;
                xzg.g0 assets2 = (xzg.g0) obj2;
                Intrinsics.checkNotNullParameter(assets2, "assets");
                return nim.a.w(kli.a.h(e3Var.n(assets2.f309992a, null), e3Var.n(assets2.f309993b, y0.b(nel.z.ETF))), new h(10));
            case 13:
                List balances = (List) obj2;
                Intrinsics.checkNotNullParameter(balances, "balances");
                return ((l0) obj3).a(balances, zhm.f0.f322471a);
            case 14:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                ((t0) obj3).getClass();
                return t0.a(it12);
            case 15:
                x97.e eVar3 = (x97.e) obj3;
                AccountId jointAccountId = (AccountId) obj2;
                Intrinsics.checkNotNullParameter(jointAccountId, "jointAccountId");
                if (jointAccountId instanceof AccountId.Joint) {
                    r72 = 0;
                    listC = zhm.v.k(null, ((AccountId.Joint) jointAccountId).f51413b);
                } else {
                    r72 = 0;
                    listC = zhm.u.c(null);
                }
                return m70.a.g(l93.f.b(eVar3.f303589a, listC, r72, 10), r72, new x48.a(18), 1).map(new x8i.g(26, new wma.e(1, eVar3, x97.e.class, "addRevolutPayManagementCard", "addRevolutPayManagementCard(Ljava/util/List;)Ljava/util/List;", 0, 19)));
            case 16:
                com.revolut.feature.onboarding.impl.language_change.flow.a aVar = (com.revolut.feature.onboarding.impl.language_change.flow.a) obj3;
                d67.u outputData = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (Intrinsics.f(outputData, sVar)) {
                    com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, aVar.f78285p.f115688b.f135878a, "locale.REQUIRE_CHECK_LANGUAGE_KEY", Boolean.TRUE);
                    aVar.C1(zh9.u0.b(RestartApplicationCommand.f98667a));
                } else if (Intrinsics.f(outputData, d67.q.f111462a)) {
                    oki.h.D2(aVar.f78286q);
                } else {
                    if (!(outputData instanceof d67.p) && !Intrinsics.f(outputData, d67.r.f111463a) && !Intrinsics.f(outputData, tVar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException(outputData + " is not supported");
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
            case 17:
                w0h.d dVar = (w0h.d) obj3;
                List assets3 = (List) obj2;
                Intrinsics.checkNotNullParameter(assets3, "assets");
                if (dVar == w0h.d.STOCK) {
                    List<vel.f> list5 = assets3;
                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                        for (vel.f fVar : list5) {
                            vel.e eVar4 = fVar instanceof vel.e ? (vel.e) fVar : null;
                            if ((eVar4 != null ? eVar4.a() : null) != null) {
                                z3 = true;
                            }
                        }
                    }
                } else {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 18:
                com.revolut.feature_restricted_access_malware.impl.flow.a aVar2 = (com.revolut.feature_restricted_access_malware.impl.flow.a) obj3;
                d67.u it13 = (d67.u) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                if (Intrinsics.f(it13, sVar)) {
                    cpi.g gVar2 = aVar2.v;
                    String query = aVar2.f97474w.b(new TextLocalisedClause(R$string.fincrime_malicious_software_prompt_browse_antivirus_software_query, null, null, 14)).toString();
                    gVar2.getClass();
                    Intrinsics.checkNotNullParameter(query, "query");
                    Intrinsics.checkNotNullParameter(query, "query");
                    String str = "market://search?q=" + URLEncoder.encode(query, "UTF-8");
                    Intrinsics.checkNotNullParameter(query, "query");
                    aVar2.C1(new ExternalDestination.ByIntent(gVar2.K(str, "https://play.google.com/store/search?q=" + URLEncoder.encode(query, "UTF-8")), null));
                } else if (Intrinsics.f(it13, tVar)) {
                    aVar2.C1(new ChatFlowDestination(new ChatTarget.ChatList((ChatListFilter) null, new TicketCreationContext((String) null, (List) null, (List) null, (NewTicketContext) null, 31), (String) null, 11), true));
                }
                return Unit.f186387a;
            case 19:
                xa.b bVar = (xa.b) obj3;
                qa.c periodicReviewState = (qa.c) obj2;
                Intrinsics.checkNotNullParameter(periodicReviewState, "periodicReviewState");
                if (periodicReviewState instanceof qa.b) {
                    featureCommandF = new FeatureCommand(new WorkflowFeatureConfig(new WorkflowConfiguration.Workflow(((qa.b) periodicReviewState).f243920a, (wi0.b) null, (NaviCommand) null, (String) null, (AnalyticsProduct) null, (WorkflowConfiguration.Extras) null, 126), true));
                } else {
                    if (!Intrinsics.f(periodicReviewState, qa.a.f243919a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    featureCommandF = zh9.u0.f(UserDetailsDestination.f26226a);
                }
                bVar.f303765a.c(featureCommandF);
                return efm.d0.m(Boolean.TRUE);
            case 20:
                ((xad.a) obj3).getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM order_initiation_pages ORDER BY createdDate DESC LIMIT ?");
                try {
                    sQLiteStatementPrepare.bindLong(1, 1);
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "createdDate");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "state");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "product");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "title");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amount");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "defaultCurrency");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "paymentLink");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "limit");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "completedOrders");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "customFieldDefinitions");
                    ArrayList arrayList4 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? numValueOf : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        long j2 = sQLiteStatementPrepare.getLong(columnIndexOrThrow2);
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? numValueOf : sQLiteStatementPrepare.getText(columnIndexOrThrow3);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? numValueOf : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? numValueOf : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        Long lValueOf = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? numValueOf : Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow6));
                        String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? numValueOf : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                        String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? numValueOf : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                        String text7 = sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? numValueOf : sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                        if (sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                            i = columnIndexOrThrow6;
                        } else {
                            i = columnIndexOrThrow6;
                            numValueOf = Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10));
                        }
                        Integer num = numValueOf;
                        Integer numValueOf2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
                        String text8 = sQLiteStatementPrepare.isNull(columnIndexOrThrow12) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow12);
                        if (text8 != null) {
                            i2 = columnIndexOrThrow;
                            list = (List) af0.b.a().b(nlm.a.a(abd.c.Companion.serializer()), text8);
                        } else {
                            i2 = columnIndexOrThrow;
                            list = null;
                        }
                        arrayList4.add(new abd.d(text, j2, text2, text3, text4, lValueOf, text5, text6, text7, num, numValueOf2, list));
                        columnIndexOrThrow6 = i;
                        columnIndexOrThrow = i2;
                        numValueOf = null;
                        break;
                    }
                    return arrayList4;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 21:
                com.revolut.retail.feature.pending_payments.impl.ui.a aVar3 = (com.revolut.retail.feature.pending_payments.impl.ui.a) obj3;
                xak.a aVar4 = aVar3.o;
                bbk.o outputData2 = (bbk.o) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (outputData2 instanceof bbk.n) {
                    PendingPaymentResult$Accept pendingPaymentResult$Accept = ((bbk.n) outputData2).f14333a;
                    if (pendingPaymentResult$Accept instanceof PendingPaymentResult$ActionsBottomSheet) {
                        PendingPaymentResult$ActionsBottomSheet pendingPaymentResult$ActionsBottomSheet = (PendingPaymentResult$ActionsBottomSheet) pendingPaymentResult$Accept;
                        pendingPaymentBottomSheetInputData = new PendingPaymentBottomSheetInputData(pendingPaymentResult$ActionsBottomSheet.f102409a, pendingPaymentResult$ActionsBottomSheet.f102410b, pendingPaymentResult$ActionsBottomSheet.f102411c, pendingPaymentResult$ActionsBottomSheet.d, pendingPaymentResult$ActionsBottomSheet.e);
                    } else if (pendingPaymentResult$Accept instanceof PendingPaymentResult$ReturnUrl) {
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.retail.feature.pending_payments.api.R$string.pending_payments_result_accept_success_title, null, null, 14);
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.feature.pending_payments.api.R$string.pending_payments_result_accept_success_description, null, null, 14);
                        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.feature.pending_payments.api.R$string.pending_payments_result_accept_success_button, null, null, 14);
                        String str2 = ((PendingPaymentResult$ReturnUrl) pendingPaymentResult$Accept).f102414a;
                        pendingPaymentBottomSheetInputData = new PendingPaymentBottomSheetInputData(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, new ExternalDestination.Browser(str2, null), new ExternalDestination.Browser(str2, null));
                    } else {
                        if (!(pendingPaymentResult$Accept instanceof PendingPaymentResult$Default)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pendingPaymentBottomSheetInputData = new PendingPaymentBottomSheetInputData(new TextLocalisedClause(com.revolut.retail.feature.pending_payments.api.R$string.pending_payments_result_accept_success_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.pending_payments.api.R$string.pending_payments_result_accept_success_description, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.pending_payments.api.R$string.pending_payments_result_accept_success_button, null, null, 14), null, null);
                    }
                    oki.h.w2(aVar3.f102427r, new PendingPaymentFlowContract$Step.BottomDialog(pendingPaymentBottomSheetInputData, PendingPaymentContract$OutputData.Accepted.f102403a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else {
                    boolean z4 = outputData2 instanceof bbk.p;
                    PendingPaymentContract$OutputData.Rejected rejected = PendingPaymentContract$OutputData.Rejected.f102406a;
                    if (z4) {
                        PendingPaymentResult$Decline pendingPaymentResult$Decline = ((bbk.p) outputData2).f14336a;
                        if (pendingPaymentResult$Decline instanceof PendingPaymentResult$StatusDialog) {
                            aVar3.I2((PendingPaymentResult$StatusDialog) pendingPaymentResult$Decline);
                        } else if (pendingPaymentResult$Decline instanceof PendingPaymentResult$ReturnUrl) {
                            aVar3.I2(new PendingPaymentResult$StatusDialog(new TextLocalisedClause(com.revolut.retail.feature.pending_payments.api.R$string.pending_payments_result_decline_success_title, null, null, 14), null, new ExternalDestination.Browser(((PendingPaymentResult$ReturnUrl) pendingPaymentResult$Decline).f102414a, null)));
                        } else {
                            if (!(pendingPaymentResult$Decline instanceof PendingPaymentResult$Default)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar4.getClass();
                            yji.l.a1(aVar3, aVar3.X1(new mii.k("DECLINE_ID", new TextLocalisedClause(com.revolut.retail.feature.pending_payments.api.R$string.pending_payments_result_decline_success_title, null, null, 14), null, null, null, 28)), null, null, null, 7);
                            aVar3.C2(rejected);
                        }
                    } else if (outputData2 instanceof bbk.q) {
                        yji.l.a1(aVar3, aVar3.X1(new nii.y0(null, new nii.z(new TextLocalisedClause(com.revolut.retail.feature.pending_payments.api.R$string.pending_payments_time_out, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new xak.e((bbk.q) outputData2, aVar3, null), 3);
                    } else if (outputData2 instanceof o.a) {
                        aVar3.C2(rejected);
                    } else {
                        if (!(outputData2 instanceof o.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar4.getClass();
                        aVar3.X1(new nii.y0("NOT_AVAILABLE_ID", new nii.z(new TextLocalisedClause(com.revolut.retail.feature.pending_payments.api.R$string.pending_payments_not_available_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.feature.pending_payments.api.R$string.pending_payments_not_available_subtitle, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 4));
                        aVar3.C2(PendingPaymentContract$OutputData.NotAvailable.f102405a);
                    }
                }
                return Unit.f186387a;
            case 22:
                xbf.d dVar2 = (xbf.d) obj3;
                lbf.p pVar = (lbf.p) obj2;
                dVar2.getClass();
                if (pVar.a()) {
                    efm.r rVarEmpty = efm.r.empty();
                    Intrinsics.checkNotNullExpressionValue(rVarEmpty, "empty(...)");
                    return rVarEmpty;
                }
                lbf.m mVar2 = pVar.f193684a;
                if (!t1.c(lbf.k.STOCKS, mVar2)) {
                    efm.r rVarEmpty2 = efm.r.empty();
                    Intrinsics.checkNotNullExpressionValue(rVarEmpty2, "empty(...)");
                    return rVarEmpty2;
                }
                Pair pairA = nbf.a.a(mVar2);
                if (pairA == null) {
                    efm.r rVarEmpty3 = efm.r.empty();
                    Intrinsics.checkNotNullExpressionValue(rVarEmpty3, "empty(...)");
                    return rVarEmpty3;
                }
                ProductArticleParams productArticleParams = new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(InvestFirstVisitArticleKey.EEA), zhm.r0.k(new Pair("discount", (String) pairA.f186385a), new Pair("commission", (String) pairA.f186386b)));
                efm.r rVarSwitchMap = nz8.d.r(skm.p0.f264003c, new xbf.a(dVar2, productArticleParams, null)).switchMap(new x9h.d(15, new x52.a(dVar2, productArticleParams, i5)));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                return rVarSwitchMap;
            case 23:
                com.revolut.retail.feature.crypto_deposits.impl.ui.deposit_flow.b bVar2 = (com.revolut.retail.feature.crypto_deposits.impl.ui.deposit_flow.b) obj3;
                Throwable th10 = (Throwable) obj2;
                if (th10 != null && !(th10 instanceof CancellationException)) {
                    oki.h.D2(bVar2.f100059s);
                }
                return Unit.f186387a;
            case 24:
                Intrinsics.checkNotNullParameter((Long) obj2, "it");
                return ((xc1.d) obj3).d;
            case 25:
                com.revolut.feature.apm.spin.impl.ui.settings.a aVar5 = (com.revolut.feature.apm.spin.impl.ui.settings.a) obj3;
                ud2.i outputData3 = (ud2.i) obj2;
                Intrinsics.checkNotNullParameter(outputData3, "outputData");
                if (outputData3 instanceof ud2.h) {
                    aVar5.f62886t.k(Unit.f186387a);
                }
                return Unit.f186387a;
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                z1 z1Var = ((xd4.a) obj3).f304255a;
                TextLocalisedClause textLocalisedClauseA = ky4.a.a(com.revolut.feature.credit.core.R$string.credit_manual_underwriting_ticketor_header_title, z1Var.f154980a);
                TextLocalisedClause textLocalisedClauseA2 = ky4.a.a(com.revolut.feature.credit.core.R$string.credit_manual_underwriting_ticketor_header_subtitle, z1Var.f154981b);
                TextLocalisedClause textLocalisedClauseA3 = ky4.a.a(com.revolut.feature.credit.core.R$string.credit_manual_underwriting_ticketor_primary_button_title, z1Var.d);
                ArrayList arrayList5 = new ArrayList(3);
                for (int i33 = 0; i33 < 3; i33++) {
                    arrayList5.add(new w40(com.google.android.gms.internal.mlkit_vision_face.a.k(i33, z1Var.f154982c, "_step_")));
                }
                yp0.b.k(arrayList5, 0, 0, 0, 0, 31);
                return new xd4.d(textLocalisedClauseA, textLocalisedClauseA2, textLocalisedClauseA3, arrayList5, true, true);
            case 27:
                xdi.g update = (xdi.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return xdi.g.a(update, null, null, ((gs) obj3).f164466b.f110014a, 3);
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                kotlin.jvm.internal.s0 s0Var = new kotlin.jvm.internal.s0(3);
                is isVar = new is("REV_POINTS_POCKET_SLIDER_ITEM_ID");
                yp0.b.r(isVar, 0, 0, 0, 0, 15);
                s0Var.a(isVar);
                nb0 nb0Var = pb0.Companion;
                List listK2 = zhm.v.k(nb0.a(nb0Var, "REV_POINTS_POCKET_MILES_ITEM_ID", false, 6), nb0.a(nb0Var, "REV_POINTS_POCKET_STAYS_ITEM_ID", false, 6));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                s0Var.b(listK2.toArray(new koi.j[0]));
                List listK3 = zhm.v.k(nb0.a(nb0Var, "REV_POINTS_POCKET_MINIMUM_BALANCE_ITEM_ID", false, 6), nb0.a(nb0Var, "REV_POINTS_POCKET_DAILY_POINTS_ITEM_ID", false, 6), nb0.a(nb0Var, "REV_POINTS_POCKET_MONEY_ANYTIME_ITEM_ID", false, 6));
                yp0.b.k(listK3, 0, 0, 0, 0, 31);
                s0Var.b(listK3.toArray(new koi.j[0]));
                ArrayList arrayList6 = s0Var.f186433a;
                return new xdi.n(zhm.v.k(arrayList6.toArray(new koi.j[arrayList6.size()])), ((xdi.w) obj3).a(false), ObjectCarouselNavBarContentView.c.a.f59436a);
            default:
                com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods_info.a aVar6 = (com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.signing_methods_info.a) obj3;
                eii.k outputData4 = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(outputData4, "outputData");
                if (outputData4 instanceof eii.i) {
                    Object obj6 = ((eii.i) outputData4).f126655a;
                    if (obj6 instanceof yy3.p) {
                        aVar6.C1(new ExternalDestination.Browser(((yy3.p) obj6).f317789c, null));
                    } else {
                        zhm.h0 h0Var2 = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "SigningMethodsInfoScreenModel", a0.d.m(obj6, "Unsupported parcel: "), null, h0Var2);
                    }
                } else {
                    if (!(outputData4 instanceof eii.d) && !(outputData4 instanceof eii.e) && !(outputData4 instanceof eii.f) && !(outputData4 instanceof eii.g) && !(outputData4 instanceof eii.h) && !(outputData4 instanceof eii.j)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i43 = jli.h.f175850a;
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ d(xd4.l lVar, xd4.a aVar) {
        this.f303332a = 26;
        this.f303333b = aVar;
    }
}
