package n68;

import aa0.d0;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aqd.n1;
import com.feature.feature_meta_sso_api.navigation.OutputData;
import com.revolut.core.backend_flow.impl.flow.permission.FormPermissionFlowContract$OutputData;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedGenderClause;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.backend_flow.domain.models.AddressInputItem;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.PermissionInputItem;
import com.revolut.feature.card_design.api.CardDesignCatalogueDestination;
import com.revolut.feature.crypto_investments.api.model.CryptoCommodityPositions;
import com.revolut.feature.crypto_investments.api.model.PocketBalancesWithSum;
import com.revolut.feature.derivatives.models.DerivativesBalance;
import com.revolut.feature.junior.account_activation.impl.ui.screen.request.ActivationRequestScreenContract$CheckboxData;
import com.revolut.feature.junior_card.impl.R$string;
import com.revolut.feature.junior_core.models.configuration.JuniorPlanConfiguration;
import com.revolut.feature.junior_onboarding.api.model.OnboardingTerms;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.referrals.shared.ui.api.navigation.ReferralsBizFeatureConfig;
import com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.PaymentScheduleSelection;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.search.Child;
import com.revolut.feature_travel_hotels_models.property.search.HotelsPropertyRoomOccupancy;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import h93.j0;
import h93.l0;
import java.io.Serializable;
import java.math.BigDecimal;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;
import jel.a3;
import k4l.e0;
import k4l.q0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nvg.m0;
import nvg.p0;
import o9c.n0;
import o9c.o0;
import oqk.g0;
import tof.fc;
import tof.i7;
import tof.q6;
import tof.qb;
import tof.v6;
import tof.y6;
import vkm.j2;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f212742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f212743c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w(int i, String str, Object obj2, Object obj3, Object obj4) {
        this.f212741a = i;
        this.f212743c = obj2;
        this.d = obj3;
        this.f212742b = str;
        this.e = obj4;
    }

    private final Object a(Object obj2) {
        FormScreen formScreenC;
        oa0.d dVar = (oa0.d) this.f212743c;
        FormScreen formScreen = (FormScreen) this.d;
        String str = ((PermissionInputItem) this.e).f63555a;
        l3l.m mVar = (l3l.m) this.f212742b;
        OutputData result = (OutputData) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof OutputData.Success) {
            formScreenC = dVar.f223489l.c(formScreen, str, new PermissionInputItem.PermissionValue(xl2.x.SUCCESS, new PermissionInputItem.PermissionPayload.MetaPermissionPayload(((OutputData.Success) result).f26214a)));
        } else {
            if (!Intrinsics.f(result, OutputData.Cancelled.f26213a)) {
                throw new NoWhenBranchMatchedException();
            }
            formScreenC = dVar.f223489l.c(formScreen, str, new PermissionInputItem.PermissionValue(xl2.x.SKIP, null));
        }
        mVar.invoke(new ya0.b(formScreenC));
        return Unit.f186387a;
    }

    private final Object b(Object obj2) {
        d0 d0Var = ((oa0.h) this.f212743c).f223491a;
        FormScreen formScreen = (FormScreen) this.d;
        String str = ((PermissionInputItem) this.e).f63555a;
        Function1 function1 = (Function1) this.f212742b;
        FormPermissionFlowContract$OutputData result = (FormPermissionFlowContract$OutputData) obj2;
        Intrinsics.checkNotNullParameter(result, "result");
        PermissionInputItem.PermissionPayload.LocationPermissionPayload locationPermissionPayload = null;
        if (result instanceof FormPermissionFlowContract$OutputData.Skip) {
            function1.invoke(new ya0.b(d0Var.c(formScreen, str, new PermissionInputItem.PermissionValue(xl2.x.SKIP, null))));
        } else {
            if (!(result instanceof FormPermissionFlowContract$OutputData.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            FormPermissionFlowContract$OutputData.Success success = (FormPermissionFlowContract$OutputData.Success) result;
            Double d = success.f51235b;
            Double d5 = success.f51234a;
            if (d != null && d5 != null) {
                locationPermissionPayload = new PermissionInputItem.PermissionPayload.LocationPermissionPayload(d.doubleValue(), d5.doubleValue(), null, null, null);
            }
            function1.invoke(new ya0.b(d0Var.c(formScreen, str, new PermissionInputItem.PermissionValue(xl2.x.SUCCESS, locationPermissionPayload))));
        }
        return Unit.f186387a;
    }

    private final Object c(Object obj2) {
        oq3.o oVar = (oq3.o) this.f212743c;
        String str = (String) this.f212742b;
        String str2 = (String) this.d;
        String str3 = (String) this.e;
        od0.i it8 = (od0.i) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        if (!it8.d()) {
            ufm.b bVarM = efm.d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        oVar.f227732c.c(str);
        pfm.h hVar = new pfm.h(new ne0.o(oVar, oq3.o.b((hha.d) it8.c(), str2, str3), 17), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar.D(Boolean.TRUE);
    }

    private final Object d(Object obj2) {
        efm.r rVarC;
        efm.r rVarB;
        oqk.s sVar = (oqk.s) this.f212743c;
        g0 g0Var = (g0) this.d;
        i7 i7Var = (i7) this.e;
        TransactionContext context = (TransactionContext) this.f212742b;
        Boolean loaded = (Boolean) obj2;
        Intrinsics.checkNotNullParameter(loaded, "loaded");
        nie.c cVar = sVar.f227987h;
        ProductId f89727a = cVar != null ? cVar.getF89727a() : null;
        int i = f89727a == null ? -1 : oqk.u.f227991a[f89727a.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            rVarC = ((jqk.g) g0Var.f227937a).c(sVar.f227984b, sVar.f227987h, sVar.f);
        } else if (i != 5) {
            rVarC = efm.r.just(f0.f322471a);
            Intrinsics.checkNotNullExpressionValue(rVarC, "just(...)");
        } else {
            rVarC = ((jqk.g) g0Var.f227937a).c(sVar.f227984b, sVar.f227987h, sVar.f);
        }
        AccountId accountId = sVar.e;
        if (accountId instanceof AccountId.Joint) {
            qsi.g gVar = g0Var.f227937a;
            AccountId.Joint accountId2 = (AccountId.Joint) accountId;
            Set disablePredefinedFilters = sVar.f227986g;
            jqk.g gVar2 = (jqk.g) gVar;
            gVar2.getClass();
            Intrinsics.checkNotNullParameter(accountId2, "accountId");
            Intrinsics.checkNotNullParameter(disablePredefinedFilters, "disablePredefinedFilters");
            i7 i7VarA = mhf.b.a(gVar2.e, i7Var, null, ifk.b.L(disablePredefinedFilters), 2);
            if (i7VarA == null) {
                i7VarA = i7Var;
            }
            gqk.e eVar = (gqk.e) gVar2.f177752a;
            eVar.getClass();
            Intrinsics.checkNotNullParameter(accountId2, "accountId");
            Intrinsics.checkNotNullParameter(disablePredefinedFilters, "disablePredefinedFilters");
            TransactionContext.INSTANCE.getClass();
            efm.r map = te0.w.l(eVar.a(i7Var, TransactionContext.f60264c, disablePredefinedFilters), ((njf.j) eVar.f145771b).b(accountId2)).map(new gqk.b(new gqa.a(12), 1));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            rVarB = map.map(new jof.a(17, new jp3.b(gVar2, i7VarA, 9)));
            Intrinsics.checkNotNullExpressionValue(rVarB, "map(...)");
        } else {
            qsi.g gVar3 = g0Var.f227937a;
            Set disablePredefinedFilters2 = sVar.f227986g;
            boolean z = sVar.i;
            jqk.g gVar4 = (jqk.g) gVar3;
            gVar4.getClass();
            Intrinsics.checkNotNullParameter(disablePredefinedFilters2, "disablePredefinedFilters");
            Intrinsics.checkNotNullParameter(context, "context");
            i7 i7VarA2 = mhf.b.a(gVar4.e, i7Var, null, ifk.b.L(disablePredefinedFilters2), 2);
            if (i7VarA2 == null) {
                i7VarA2 = i7Var;
            }
            if (gVar4.f177755g || z) {
                rVarB = jqk.g.b(gVar4, i7Var, context, disablePredefinedFilters2, i7VarA2);
            } else {
                rVarB = efm.r.concat(jqk.g.a(gVar4, i7Var, context, disablePredefinedFilters2, i7VarA2), jqk.g.b(gVar4, i7Var, context, disablePredefinedFilters2, i7VarA2));
                Intrinsics.checkNotNullExpressionValue(rVarB, "concat(...)");
            }
        }
        return te0.w.l(rVarC, rVarB).map(new oq3.f(11, new n1(15, loaded))).doOnNext(new oq3.f(12, new oqk.n(g0Var, sVar, 1)));
    }

    private final Object e(Object obj2) {
        ifm.b bVar = (ifm.b) this.f212743c;
        g0 g0Var = (g0) this.d;
        AccountId accountId = (AccountId) this.e;
        q6[] q6VarArr = (q6[]) this.f212742b;
        x71.b bVar2 = g0Var.e;
        q6[] transactionScopes = (q6[]) Arrays.copyOf(q6VarArr, q6VarArr.length);
        xif.e eVar = (xif.e) bVar2;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(transactionScopes, "transactionScopes");
        BreadcrumbException breadcrumbException = new BreadcrumbException();
        x71.e eVar2 = eVar.f306351a;
        i7.c cVar = i7.Companion;
        y6[] y6VarArr = {y6.TOPUP, y6.EXCHANGE};
        cVar.getClass();
        efm.b bVarSwitchMapCompletable = ((xif.s) eVar2).e(fc.a(i7.c.d(y6VarArr), new qb(zhm.u.c(v6.PENDING))), Priority.LOW.f60262b, breadcrumbException).switchMapCompletable(new xg6.k(new wtl.f(eVar, 20, transactionScopes, accountId), 11));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        m3l.d dVar = new m3l.d(11, new oma.n(new BreadcrumbException(), 4));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar = new pfm.a(bVarSwitchMapCompletable, dVar, 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new o9h.d(2, oqk.x.f227994a), oqk.w.f227993a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(bVar, hVarW);
        return Unit.f186387a;
    }

    private final Object g(Object obj2) {
        orb.o oVar = (orb.o) this.f212743c;
        TradingAccount tradingAccount = (TradingAccount) this.d;
        nel.n nVar = (nel.n) this.e;
        bfl.g gVar = (bfl.g) this.f212742b;
        InstrumentTicker instrumentTicker = (InstrumentTicker) obj2;
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        vrl.s sVar = oVar.i;
        String string = com.revolut.shared.feature.wealth.models.trading_accounts.d.l(tradingAccount).f105210a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return rd0.e.b(sVar.a(string, nVar.f214596b, gVar, (56 & 8) != 0 ? null : nel.x.a(instrumentTicker) ? q0.DAY : q0.MARKET_ON_OPEN, (56 & 16) != 0 ? null : Boolean.FALSE, null, (56 & 64) != 0 ? w4l.h.f294642c : null));
    }

    private final Object h(Object obj2) {
        prl.r rVar = (prl.r) this.f212743c;
        String str = (String) this.f212742b;
        String str2 = (String) this.d;
        bfl.g gVar = (bfl.g) this.e;
        e0 e0Var = (e0) obj2;
        w4l.f fVar = rVar.f;
        prl.p pVar = new prl.p(str, str2, gVar, null, null, null);
        Intrinsics.h(e0Var);
        fVar.k(pVar, e0Var);
        return Unit.f186387a;
    }

    private final Object i(Object obj2) {
        Object next;
        BigDecimal bigDecimal;
        psd.c cVar = (psd.c) this.f212743c;
        DerivativesBalance derivativesBalance = (DerivativesBalance) this.d;
        String str = (String) this.f212742b;
        xi0.b bVar = (xi0.b) this.e;
        List rates = (List) obj2;
        Intrinsics.checkNotNullParameter(rates, "rates");
        Iterator it8 = rates.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            qta.c cVar2 = (qta.c) next;
            if (Intrinsics.f(cVar2.f249046a, derivativesBalance.f71898a) && Intrinsics.f(cVar2.f249047b, bVar)) {
                break;
            }
        }
        qta.c cVar3 = (qta.c) next;
        return (cVar3 == null || (bigDecimal = cVar3.f249048c) == null) ? cVar : psd.d.a(derivativesBalance, str, pyd.c.L(derivativesBalance.f71907p, bigDecimal, bVar));
    }

    private final Object j(Object obj2) {
        PocketBalancesWithSum pocketBalancesWithSum = (PocketBalancesWithSum) this.f212743c;
        CryptoCommodityPositions cryptoCommodityPositions = (CryptoCommodityPositions) this.d;
        dj0.d dVar = (dj0.d) this.e;
        List list = (List) this.f212742b;
        List exchangeRates = (List) obj2;
        Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
        return new vf0.k(pocketBalancesWithSum, exchangeRates, cryptoCommodityPositions, dVar, list);
    }

    private final Object k(Object obj2) throws InvalidKeySpecException, NoSuchAlgorithmException {
        pv9.i iVar = (pv9.i) this.f212743c;
        SecretKey secretKey = (SecretKey) this.d;
        KeyPair keyPair = (KeyPair) this.e;
        do3.n nVar = (do3.n) this.f212742b;
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        Object obj3 = pair.f186385a;
        Intrinsics.checkNotNullExpressionValue(obj3, "component1(...)");
        kv9.d dVar = (kv9.d) obj3;
        PrivateKey privateKey = keyPair.getPrivate();
        Intrinsics.checkNotNullExpressionValue(privateKey, "getPrivate(...)");
        PublicKey publicKeyL = iVar.f240029b.l(dVar.getPublicKey());
        String code = dVar.getCode();
        String str = nVar.f116414l;
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        cv9.a aVar = iVar.d;
        byte[] encoded = secretKey.getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "getEncoded(...)");
        ufm.i iVar2 = new ufm.i(((pv9.d) aVar).f(encoded, publicKeyL, privateKey, pyd.c.r(code, str)), new prl.n(22, new pth.l(iVar, 6)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return new ufm.i(iVar2, new prl.n(20, new pv9.h(dVar, 0)), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v18, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v19, types: [i9g.l] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        ArrayList arrayListQ2;
        List listK;
        ?? arrayList;
        HotelsPropertyRoomOccupancy hotelsPropertyRoomOccupancy;
        SQLiteStatement sQLiteStatementPrepare;
        SQLiteStatement sQLiteStatementPrepare2;
        sh1.h hVarB;
        PaymentScheduleSelection paymentScheduleSelectionB;
        dj0.d dVar;
        int i = this.f212741a;
        int i2 = 2;
        Object obj3 = this.f212742b;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f212743c;
        switch (i) {
            case 0:
                Data data2 = (Data) obj6;
                Data data3 = (Data) obj5;
                com.revolut.feature.junior.account_activation.impl.ui.screen.request.c cVar = (com.revolut.feature.junior.account_activation.impl.ui.screen.request.c) obj4;
                String str = (String) obj3;
                k kVar = (k) obj2;
                OnboardingTerms onboardingTerms = (OnboardingTerms) data2.getContent();
                try {
                    Object content = data2.getContent();
                    if (content != null) {
                        OnboardingTerms onboardingTerms2 = (OnboardingTerms) content;
                        wi0.b bVar = onboardingTerms2.f76955b;
                        boolean z = onboardingTerms2.f76954a;
                        ActivationRequestScreenContract$CheckboxData.PersonalDataAccurate personalDataAccurate = ActivationRequestScreenContract$CheckboxData.PersonalDataAccurate.f76671b;
                        if (z) {
                            listK = zhm.u.c(personalDataAccurate);
                        } else {
                            wi0.b.Companion.getClass();
                            if (Intrinsics.f(bVar, wi0.b.y2)) {
                                listK = zhm.u.c(personalDataAccurate);
                            } else {
                                boolean zS = com.bumptech.glide.d.s(bVar);
                                ActivationRequestScreenContract$CheckboxData.TermsAndConditions termsAndConditions = ActivationRequestScreenContract$CheckboxData.TermsAndConditions.f76674b;
                                listK = zS ? zhm.v.k(personalDataAccurate, new ActivationRequestScreenContract$CheckboxData.PersonalDataKidControlDetails(onboardingTerms2.f76956c.d), termsAndConditions) : com.bumptech.glide.d.u(bVar) ? zhm.v.k(personalDataAccurate, new ActivationRequestScreenContract$CheckboxData.SameAddress(str), termsAndConditions) : com.bumptech.glide.d.k(bVar) ? zhm.v.k(personalDataAccurate, ActivationRequestScreenContract$CheckboxData.AccountPurpose.f76670b, termsAndConditions) : zhm.v.k(personalDataAccurate, termsAndConditions);
                            }
                        }
                        arrayListQ2 = cVar.Q2(listK);
                    } else {
                        arrayListQ2 = null;
                    }
                    data = new Data(arrayListQ2, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                return k.c(kVar, null, null, null, null, onboardingTerms, data3, data, 31);
            case 1:
                c93.e eVar = (c93.e) obj5;
                String str2 = (String) obj3;
                NaviCommand naviCommand = (NaviCommand) obj4;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) pair.f186385a;
                return juniorBankingProfile.i.compareTo((ChronoLocalDate) ((l80.f) ((nc8.d) obj6).f214165a).e().minusYears((long) ((JuniorPlanConfiguration) pair.f186386b).f76900c)) > 0 ? new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new CardDesignCatalogueDestination(null, eVar, j0.YOUTH, l0.DEBIT, null, null, str2, null, false, false, naviCommand, null, null, null, null, null, null, null, false, null, juniorBankingProfile.f77099b, 8387504), false, (Integer) null, 0, 61)) : com.revolut.retail.operation_status.modal_screen.a.a(h3l.g.Companion, new StatusViewConfiguration.Error("ID_STATUS_VIEW_USER_NOT_ELIGIBLE_FOR_CARD_ORDER", new TextLocalisedClause(R$string.junior_card_order_too_old_title, null, null, 14), new TextLocalisedClause(R$string.junior_card_order_too_old_refer_message, null, null, 14), new TextLocalisedGenderClause(juniorBankingProfile.d, R$string.junior_card_order_too_old_refer_button, zhm.u.c(juniorBankingProfile.f77099b)), null, null, null, 8176), com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new ReferralsBizFeatureConfig.InviteCampaignHomeFeatureConfig(null, 31))), null, null, null, 508);
            case 2:
                neg.l update = (neg.l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Map map = update.k;
                ((l80.f) ((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c) obj4).f94037t).getClass();
                return neg.l.a(update, null, null, null, (zfi.a) obj6, (zfi.a) obj5, null, null, null, null, false, r0.q(map, new Pair((String) obj3, Long.valueOf(System.currentTimeMillis()))), 0L, 3047);
            case 3:
                zfi.a aVar = (zfi.a) obj4;
                Data data4 = (Data) obj6;
                neg.l lVar = (neg.l) obj2;
                Intrinsics.h(aVar);
                Intrinsics.h(data4);
                return neg.l.a(lVar, (Data) obj5, data4, aVar, aVar, aVar, this.f212742b, null, null, null, false, null, 0L, 4032);
            case 4:
                nei.c cVar2 = (nei.c) obj6;
                String str3 = (String) obj3;
                LocalDate localDate = (LocalDate) obj5;
                LocalDate localDate2 = (LocalDate) obj4;
                HotelsProperty property = (HotelsProperty) obj2;
                Intrinsics.checkNotNullParameter(property, "property");
                if (str3 != null) {
                    List listN0 = kotlin.text.d0.n0(str3, new String[]{","}, 0, 6);
                    ArrayList<List> arrayList2 = new ArrayList(zhm.w.t(listN0, 10));
                    Iterator it8 = listN0.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(kotlin.text.d0.n0((String) it8.next(), new String[]{"-"}, 0, 6));
                    }
                    arrayList = new ArrayList();
                    for (List list : arrayList2) {
                        String str4 = (String) zhm.d0.d0(list);
                        if (str4 != null) {
                            int i3 = Integer.parseInt(str4);
                            List listV = zhm.d0.V(list, 1);
                            ArrayList arrayList3 = new ArrayList(zhm.w.t(listV, 10));
                            Iterator it9 = listV.iterator();
                            while (it9.hasNext()) {
                                arrayList3.add(new Child(Integer.valueOf(Integer.parseInt((String) it9.next()))));
                            }
                            hotelsPropertyRoomOccupancy = new HotelsPropertyRoomOccupancy(i3, arrayList3);
                        } else {
                            hotelsPropertyRoomOccupancy = null;
                        }
                        if (hotelsPropertyRoomOccupancy != null) {
                            arrayList.add(hotelsPropertyRoomOccupancy);
                        }
                    }
                } else {
                    arrayList = f0.f322471a;
                }
                rfm.j jVar = new rfm.j(cVar2.f214548b.b(property, arrayList, localDate, localDate2), new nd3.a(new f9g.d(property, i2), 12), i2);
                Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
                return jVar;
            case 5:
                List list2 = (List) obj5;
                LocalDate localDate3 = (LocalDate) obj4;
                LocalDate localDate4 = (LocalDate) obj3;
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return ((nei.c) obj6).f214548b.a((HotelsProperty) rVar.f314202b, (do3.n) rVar.f314201a, list2 != null ? i2b.a.t(list2, (List) rVar.f314203c) : f0.f322471a, localDate3, localDate4);
            case 6:
                nmb.b bVar2 = (nmb.b) obj6;
                List filteredProducts = (List) obj5;
                nmb.c update2 = (nmb.c) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                List productsData = bVar2.f217232a;
                xi0.b baseCurrency = bVar2.f217234c;
                wi0.b userCountryCode = bVar2.d;
                Intrinsics.checkNotNullParameter(productsData, "productsData");
                Intrinsics.checkNotNullParameter(filteredProducts, "filteredProducts");
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                Intrinsics.checkNotNullParameter(userCountryCode, "userCountryCode");
                return nmb.c.a(update2, zi0.c.P(new nmb.b(productsData, filteredProducts, baseCurrency, userCountryCode), false, null, 3), (SavingsProductData) obj4, (String) obj3, false, 20);
            case 7:
                return nvg.d.f((nvg.d) obj6, (List) obj5, (List) obj4, (List) obj3);
            case 8:
                return nvg.h.j((nvg.h) obj6, (pvg.g) obj5, (List) obj4, (List) obj3);
            case 9:
                String str5 = (String) obj3;
                eel.c cVar3 = (eel.c) obj5;
                String str6 = (String) obj4;
                b21.a aVar2 = ((nvg.t) obj6).f219674c;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM `complex_analytics_combined_realised_pnl` WHERE `request_product_types` = ? AND `time_span` = ? AND `currency` = ?");
                try {
                    if (str5 == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, str5);
                    }
                    String strC = pvg.t.c(cVar3);
                    if (strC == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, strC);
                    }
                    if (str6 == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindText(3, str6);
                    }
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "request_product_types");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "item_product_type");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time_span");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "asset");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "sell_date");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pnl_fifo");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pnl_average");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ref");
                    int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "opening_price");
                    int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "quantity");
                    int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    ArrayList arrayList4 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        iwg.a aVarE = pvg.t.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                        eel.c cVarG = pvg.t.g(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                        String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                        String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5);
                        String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                        pvg.o oVar = new pvg.o(cVarG, aVarE, text, text2, text3, sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11), b21.a.g(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7)), b21.a.g(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8)), b21.a.e(sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow10)), text4 != null ? org.joda.time.LocalDate.parse(text4) : null);
                        int i5 = columnIndexOrThrow9;
                        int i6 = columnIndexOrThrow4;
                        oVar.f240197l = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12);
                        arrayList4.add(oVar);
                        columnIndexOrThrow4 = i6;
                        columnIndexOrThrow9 = i5;
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList4;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 10:
                eel.c cVar4 = (eel.c) obj6;
                String str7 = (String) obj3;
                String str8 = (String) obj5;
                String str9 = (String) obj4;
                sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("\n        DELETE FROM complex_analytics_dividends\n        WHERE time_span = ? \n          AND currency = ? \n          AND portfolio_id = ?\n          AND ((? IS NULL AND account_types IS NULL) OR account_types = ?)\n        ");
                try {
                    String strC2 = pvg.t.c(cVar4);
                    if (strC2 == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, strC2);
                    }
                    if (str7 == null) {
                        sQLiteStatementPrepare2.bindNull(2);
                    } else {
                        sQLiteStatementPrepare2.bindText(2, str7);
                    }
                    if (str8 == null) {
                        sQLiteStatementPrepare2.bindNull(3);
                    } else {
                        sQLiteStatementPrepare2.bindText(3, str8);
                    }
                    if (str9 == null) {
                        sQLiteStatementPrepare2.bindNull(4);
                    } else {
                        sQLiteStatementPrepare2.bindText(4, str9);
                    }
                    if (str9 == null) {
                        sQLiteStatementPrepare2.bindNull(5);
                    } else {
                        sQLiteStatementPrepare2.bindText(5, str9);
                    }
                    sQLiteStatementPrepare2.step();
                    sQLiteStatementPrepare2.close();
                    return null;
                } finally {
                    sQLiteStatementPrepare2.close();
                }
            case 11:
                eel.c cVar5 = (eel.c) obj6;
                String str10 = (String) obj5;
                List<String> list3 = (List) obj4;
                SQLiteStatement sQLiteStatementPrepare3 = ((SQLiteConnection) obj2).prepare((String) obj3);
                try {
                    String strC3 = pvg.t.c(cVar5);
                    if (strC3 == null) {
                        sQLiteStatementPrepare3.bindNull(1);
                    } else {
                        sQLiteStatementPrepare3.bindText(1, strC3);
                    }
                    if (str10 == null) {
                        sQLiteStatementPrepare3.bindNull(2);
                    } else {
                        sQLiteStatementPrepare3.bindText(2, str10);
                    }
                    sQLiteStatementPrepare3.bindText(3, "LOCAL_PORTFOLIO_ID");
                    sQLiteStatementPrepare3.bindNull(4);
                    sQLiteStatementPrepare3.bindNull(5);
                    int i21 = 6;
                    for (String str11 : list3) {
                        if (str11 == null) {
                            sQLiteStatementPrepare3.bindNull(i21);
                        } else {
                            sQLiteStatementPrepare3.bindText(i21, str11);
                        }
                        i21++;
                    }
                    int columnIndexOrThrow13 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "time_span");
                    int columnIndexOrThrow14 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "currency");
                    int columnIndexOrThrow15 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "portfolio_id");
                    int columnIndexOrThrow16 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "account_types");
                    int columnIndexOrThrow17 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "date");
                    int columnIndexOrThrow18 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "symbol");
                    int columnIndexOrThrow19 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "ref");
                    int columnIndexOrThrow20 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "amount");
                    int columnIndexOrThrow21 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare3, "id");
                    ArrayList arrayList5 = new ArrayList();
                    while (sQLiteStatementPrepare3.step()) {
                        pvg.u uVar = new pvg.u(pvg.t.g(sQLiteStatementPrepare3.isNull(columnIndexOrThrow13) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow13)), sQLiteStatementPrepare3.isNull(columnIndexOrThrow14) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow14), sQLiteStatementPrepare3.isNull(columnIndexOrThrow15) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow15), sQLiteStatementPrepare3.isNull(columnIndexOrThrow16) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow16), b21.a.q(sQLiteStatementPrepare3.isNull(columnIndexOrThrow17) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow17)), sQLiteStatementPrepare3.isNull(columnIndexOrThrow18) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow18), sQLiteStatementPrepare3.isNull(columnIndexOrThrow19) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow19), b21.a.g(sQLiteStatementPrepare3.isNull(columnIndexOrThrow20) ? null : sQLiteStatementPrepare3.getText(columnIndexOrThrow20)));
                        uVar.i = (int) sQLiteStatementPrepare3.getLong(columnIndexOrThrow21);
                        arrayList5.add(uVar);
                        break;
                    }
                    sQLiteStatementPrepare3.close();
                    return arrayList5;
                } finally {
                    sQLiteStatementPrepare3.close();
                }
            case 12:
                iwg.a aVar3 = (iwg.a) obj6;
                eel.c cVar6 = (eel.c) obj5;
                String str12 = (String) obj3;
                String str13 = (String) obj4;
                sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("DELETE FROM `complex_analytics_realised_pnl` WHERE `asset_type` = ? AND `time_span` = ? AND `currency` = ? AND `portfolio_id` = ?");
                try {
                    String strA = pvg.t.a(aVar3);
                    if (strA == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, strA);
                    }
                    String strC4 = pvg.t.c(cVar6);
                    if (strC4 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, strC4);
                    }
                    if (str12 == null) {
                        sQLiteStatementPrepare.bindNull(3);
                    } else {
                        sQLiteStatementPrepare.bindText(3, str12);
                    }
                    if (str13 == null) {
                        sQLiteStatementPrepare.bindNull(4);
                    } else {
                        sQLiteStatementPrepare.bindText(4, str13);
                    }
                    sQLiteStatementPrepare.step();
                    sQLiteStatementPrepare.close();
                    return null;
                } finally {
                }
            case 13:
                iwg.a aVar4 = (iwg.a) obj5;
                a3 a3Var = (a3) obj4;
                String str14 = (String) obj3;
                b21.a aVar5 = ((p0) obj6).f219662c;
                sQLiteStatementPrepare2 = ((SQLiteConnection) obj2).prepare("\n            SELECT `caa`.`assetType`, `caa`.`sector`, `caa`.`currency`, `caa`.`total_value`,\n            `ass`.`asset` as `asset_asset`, `ass`.`quantity` as `asset_quantity`, `ass`.`value` as `asset_value`, `ass`.`allocation` as `asset_allocation`,  `ass`.`ref` as `asset_ref`\n            FROM `complex_analytics_sector_allocations` as `caa`\n            LEFT JOIN `complex_analytics_sector_allocations_assets` as `ass`\n            ON `caa`.`assetType` = `ass`.`assetType` AND `caa`.`sector` = `ass`.`sector`\n            WHERE `caa`.`assetType` = ?\n            AND `caa`.`sector` = ?\n            AND `caa`.`currency` = ?\n        ");
                try {
                    String strA2 = pvg.t.a(aVar4);
                    if (strA2 == null) {
                        sQLiteStatementPrepare2.bindNull(1);
                    } else {
                        sQLiteStatementPrepare2.bindText(1, strA2);
                    }
                    String strD = pvg.t.d(a3Var);
                    if (strD == null) {
                        sQLiteStatementPrepare2.bindNull(2);
                    } else {
                        sQLiteStatementPrepare2.bindText(2, strD);
                    }
                    if (str14 == null) {
                        sQLiteStatementPrepare2.bindNull(3);
                    } else {
                        sQLiteStatementPrepare2.bindText(3, str14);
                    }
                    ArrayList arrayList6 = new ArrayList();
                    while (sQLiteStatementPrepare2.step()) {
                        iwg.a aVarE2 = pvg.t.e(sQLiteStatementPrepare2.isNull(0) ? null : sQLiteStatementPrepare2.getText(0));
                        String text5 = sQLiteStatementPrepare2.isNull(1) ? null : sQLiteStatementPrepare2.getText(1);
                        arrayList6.add(new pvg.d0(aVarE2, text5 != null ? ta6.a.c0(text5) : null, sQLiteStatementPrepare2.isNull(2) ? null : sQLiteStatementPrepare2.getText(2), b21.a.g(sQLiteStatementPrepare2.isNull(3) ? null : sQLiteStatementPrepare2.getText(3)), sQLiteStatementPrepare2.isNull(4) ? null : sQLiteStatementPrepare2.getText(4), sQLiteStatementPrepare2.isNull(5) ? null : sQLiteStatementPrepare2.getText(5), b21.a.g(sQLiteStatementPrepare2.isNull(6) ? null : sQLiteStatementPrepare2.getText(6)), sQLiteStatementPrepare2.isNull(7) ? null : Float.valueOf((float) sQLiteStatementPrepare2.getDouble(7)), sQLiteStatementPrepare2.isNull(8) ? null : sQLiteStatementPrepare2.getText(8)));
                        break;
                    }
                    sQLiteStatementPrepare2.close();
                    return arrayList6;
                } finally {
                }
            case 14:
                com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b bVar3 = (com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b) obj6;
                gk3.d dVar2 = (gk3.d) obj5;
                o23.d0 d0Var = (o23.d0) obj4;
                o23.y yVar = (o23.y) obj3;
                o23.w update3 = (o23.w) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                if (bVar3.o.f65118b) {
                    mk3.a aVar6 = bVar3.f65131p;
                    sh1.h hVar = update3.f221464a;
                    aVar6.getClass();
                    hVarB = mk3.a.b(hVar, dVar2);
                } else {
                    hVarB = update3.f221464a;
                }
                return o23.w.a(update3, hVarB, d0Var, null, null, null, d0Var == o23.d0.MANUAL || ((o23.w) ((j2) bVar3.D.f22677a).getValue()).f221467g, yVar, null, null, dVar2, false, null, 30522);
            case 15:
                o3b.t update4 = (o3b.t) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return o3b.t.a(update4, (BigDecimal) obj6, (BigDecimal) obj5, (BigDecimal) obj4, (BigDecimal) obj3, null, null, 8161);
            case 16:
                String str15 = (String) obj3;
                String str16 = (String) obj4;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                od0.i iVar = (od0.i) pair2.f186385a;
                q9c.r paymentOptionsState = (q9c.r) pair2.f186386b;
                r9c.i iVar2 = ((com.revolut.feature.revolutpay.impl.ui.summary_screen.f) obj6).D;
                s6c.k initialAmount = ((n0) obj5).f223214c;
                dj0.d dVar3 = initialAmount.f260227a;
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(initialAmount, "initialAmount");
                Intrinsics.checkNotNullParameter(paymentOptionsState, "paymentOptionsState");
                t6c.f fVar = paymentOptionsState.f243875b;
                dj0.d dVar4 = (fVar == null || (dVar = fVar.f268291a) == null) ? dVar3 : dVar;
                if (fVar != null) {
                    PaymentScheduleSelection paymentScheduleSelection = paymentOptionsState.f243876c;
                    if (paymentScheduleSelection == null) {
                        paymentScheduleSelection = PaymentScheduleSelection.PayNow.f84446a;
                    }
                    paymentScheduleSelectionB = com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.a.b(fVar, paymentScheduleSelection);
                } else {
                    paymentScheduleSelectionB = null;
                }
                PaymentScheduleSelection.PayLater payLater = paymentScheduleSelectionB instanceof PaymentScheduleSelection.PayLater ? (PaymentScheduleSelection.PayLater) paymentScheduleSelectionB : null;
                return new o0(iVar, paymentOptionsState, new s6c.d(dVar4, dVar3, initialAmount.f260228b, paymentOptionsState.a(), initialAmount.f260229c, payLater != null ? payLater.f84445a : null), str15, str16);
            case 17:
                AddressFlowContract$OutputData result = (AddressFlowContract$OutputData) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                ((l3l.m) obj3).invoke(new ya0.b(((oa0.b) obj6).f223488n.c((FormScreen) obj5, ((AddressInputItem) obj4).f63233a, result.f60940a)));
                return Unit.f186387a;
            case 18:
                return a(obj2);
            case 19:
                return b(obj2);
            case 20:
                return c(obj2);
            case 21:
                return d(obj2);
            case 22:
                return e(obj2);
            case 23:
                return g(obj2);
            case 24:
                return pdg.m.a((pdg.m) obj2, (Data) obj6, null, null, (Data) obj5, (Data) obj4, (List) obj3, null, null, null, false, 8077);
            case 25:
                return h(obj2);
            case 26:
                return i(obj2);
            case 27:
                return j(obj2);
            case 28:
                return k(obj2);
            default:
                q2k.e eVar2 = (q2k.e) obj6;
                String str17 = (String) obj3;
                qua.p recurringPayment = (qua.p) obj2;
                Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
                TransferReasonsValues transferReasonsValuesK = mra.d.k((rtf.c) obj5);
                eVar2.getClass();
                xua.a aVar7 = eVar2.f241737a;
                e6k.a aVarA = e6k.c.a((FundingSource) obj4);
                String str18 = aVarA.f123012a;
                String str19 = aVarA.f123013b;
                qua.v vVar = aVarA.f123014c;
                return (str17 == null || str17.length() == 0) ? xua.a.c(aVar7, recurringPayment, transferReasonsValuesK, null, str18, str19, vVar, 4) : ((yua.q) aVar7).y(qua.p.a(recurringPayment, null, null, null, null, null, null, null, null, null, 0, str18, -1, 33488895), transferReasonsValuesK, str19, vVar);
        }
    }

    public /* synthetic */ w(Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f212741a = i;
        this.f212743c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f212742b = obj5;
    }

    public /* synthetic */ w(Object obj2, String str, Serializable serializable, Object obj3, int i) {
        this.f212741a = i;
        this.f212743c = obj2;
        this.f212742b = str;
        this.d = serializable;
        this.e = obj3;
    }

    public /* synthetic */ w(nvg.d0 d0Var, eel.c cVar, String str, String str2, String str3) {
        this.f212741a = 10;
        this.f212743c = cVar;
        this.f212742b = str;
        this.d = str2;
        this.e = str3;
    }

    public /* synthetic */ w(nvg.d0 d0Var, String str, eel.c cVar, String str2, List list) {
        this.f212741a = 11;
        this.f212742b = str;
        this.f212743c = cVar;
        this.d = str2;
        this.e = list;
    }

    public /* synthetic */ w(m0 m0Var, iwg.a aVar, eel.c cVar, String str, String str2) {
        this.f212741a = 12;
        this.f212743c = aVar;
        this.d = cVar;
        this.f212742b = str;
        this.e = str2;
    }

    public /* synthetic */ w(psd.c cVar, psd.d dVar, DerivativesBalance derivativesBalance, String str, xi0.b bVar) {
        this.f212741a = 26;
        this.f212743c = cVar;
        this.d = derivativesBalance;
        this.f212742b = str;
        this.e = bVar;
    }

    public /* synthetic */ w(zfi.a aVar, Data data, Data data2, Map map) {
        this.f212741a = 3;
        this.e = aVar;
        this.f212743c = data;
        this.d = data2;
        this.f212742b = map;
    }
}
