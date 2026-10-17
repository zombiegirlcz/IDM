package nvg;

import androidx.camera.camera2.compat.EvCompImpl;
import androidx.content.NavBackStackEntry;
import androidx.content.NavController;
import androidx.content.NavDestination;
import androidx.content.NavOptions;
import androidx.content.NavOptionsBuilder;
import androidx.content.Navigator;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import cn3.b;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressFormat;
import com.revolut.feature.card_add_to_googlepay.impl.verification.GooglePayConfirmationFlowContract$Step;
import com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.a;
import com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$Step;
import com.revolut.feature.card_order_new.impl.kompot.screen.address_form.AddressFormScreenContract$ModalStep;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.models.config.AutoPayPromptScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import com.revolut.feature.credit.application.plugins.impl.ui.address.screen.search.CreditAddressSearchScreenContract$InputData;
import com.revolut.feature.freelancer.common.models.FreelancerOrder;
import com.revolut.feature.freelancer.common.models.onboarding.BusinessCategory;
import com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlowContract$DomainState;
import com.revolut.feature.insurance_pet.impl.ui.profile.petdetails.PetDetailsActivity;
import com.revolut.feature.lifestyle.core.impl.network.LifestyleHomeService;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import com.revolut.feature.payments.splitbill.impl.ui_new.SplitBillsFlowContract$Step;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.who_to_transfer.navigation.WhoToTransferFeatureConfig;
import com.revolut.feature.payments.who_to_transfer.api.who_to_transfer.navigation.WhoToTransferScreenMode;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.selfserve.sow.impl.services.SowService;
import com.revolut.feature.shared_separate_favourites.api.combined_watchlist.CombinedWatchlistSharedDestination;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.transfer.core.models.SourceAccount;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.models.StockFinancialsStatementPeriodState;
import com.revolut.tracking.v3.SettingsProductOptInSourceContext;
import com.youTransactor.uCube.rpc.Constants;
import grl.rb;
import grl.tb;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import m1c.x0;
import no.j2;
import ow6.e;
import s23.f;
import xy2.a;
import zhm.y0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f219595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f219596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f219597c;

    public /* synthetic */ b0(Object obj2, Serializable serializable, String str, int i) {
        this.f219595a = i;
        this.f219596b = serializable;
        this.f219597c = str;
    }

    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, java.util.Map] */
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
        Map mapW;
        tb tbVar;
        String str;
        Address address;
        Pair pair;
        int i = this.f219595a;
        int i2 = 26;
        Object nVar = null;
        Object obj3 = this.f219597c;
        int i3 = 1;
        Object obj4 = this.f219596b;
        switch (i) {
            case 0:
                eel.c cVar = (eel.c) obj4;
                String str2 = (String) obj3;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("\n        SELECT * FROM complex_analytics_dividends\n        WHERE time_span = ?\n          AND currency = ?\n          AND portfolio_id = ?\n          AND ((? IS NULL AND account_types IS NULL) OR account_types = ?)\n        ");
                try {
                    String strC = pvg.t.c(cVar);
                    if (strC == null) {
                        sQLiteStatementPrepare.bindNull(1);
                    } else {
                        sQLiteStatementPrepare.bindText(1, strC);
                    }
                    if (str2 == null) {
                        sQLiteStatementPrepare.bindNull(2);
                    } else {
                        sQLiteStatementPrepare.bindText(2, str2);
                    }
                    sQLiteStatementPrepare.bindText(3, "LOCAL_PORTFOLIO_ID");
                    sQLiteStatementPrepare.bindNull(4);
                    sQLiteStatementPrepare.bindNull(5);
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "time_span");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "currency");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "portfolio_id");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "account_types");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "date");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "symbol");
                    int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "ref");
                    int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "amount");
                    int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        pvg.u uVar = new pvg.u(pvg.t.g(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow)), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), b21.a.q(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5)), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), b21.a.g(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8)));
                        uVar.i = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9);
                        arrayList.add(uVar);
                        break;
                    }
                    sQLiteStatementPrepare.close();
                    return arrayList;
                } catch (Throwable th10) {
                    sQLiteStatementPrepare.close();
                    throw th10;
                }
            case 1:
                uqk.e eVar = (uqk.e) obj4;
                nvk.p pVar = (nvk.p) obj3;
                StockFinancialsStatementPeriodState stockFinancialsStatementPeriodState = pVar.f219728b;
                nvk.k kVar = (nvk.k) obj2;
                StockFinancialsStatementPeriodState stockFinancialsStatementPeriodState2 = eVar == uqk.e.ANNUALLY ? stockFinancialsStatementPeriodState : kVar.f219716c;
                if (eVar != uqk.e.QUARTERLY) {
                    stockFinancialsStatementPeriodState = kVar.d;
                }
                return nvk.k.a(kVar, null, eVar, stockFinancialsStatementPeriodState2, stockFinancialsStatementPeriodState, null, new Data(pVar.f219727a, null, false, 6, null), null, null, Constants.TAG_FIRMWARE_VERSION);
            case 2:
                com.revolut.feature.card_add_to_googlepay.impl.verification.a aVar = (com.revolut.feature.card_add_to_googlepay.impl.verification.a) obj4;
                yw2.a aVar2 = aVar.f64487t;
                GooglePayConfirmationFlowContract$Step googlePayConfirmationFlowContract$Step = (GooglePayConfirmationFlowContract$Step) obj3;
                com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.a result = (com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.a) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof ow2.f) {
                    boolean z = ((GooglePayConfirmationFlowContract$Step.Confirmation) googlePayConfirmationFlowContract$Step).f64480b;
                    aVar2.getClass();
                    if (z) {
                        m70.a.c(kotlin.jvm.internal.t0.f186434a);
                        mapW = pd.b.w("", true);
                    } else {
                        m70.a.c(kotlin.jvm.internal.t0.f186434a);
                        mapW = pd.b.v("", true);
                    }
                } else {
                    if (!(result instanceof a.C0461a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    boolean z3 = ((GooglePayConfirmationFlowContract$Step.Confirmation) googlePayConfirmationFlowContract$Step).f64480b;
                    aVar2.getClass();
                    mapW = z3 ? pd.b.w(null, false) : pd.b.v(null, false);
                }
                aVar.C1(new BridgeDestination(new FinishCommand(-1, mapW, null, 4)));
                return Unit.f186387a;
            case 3:
                List currencyPairs = (List) obj2;
                Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
                return ((nw5.a) obj4).d.d(currencyPairs, (tzg.j) obj3);
            case 4:
                List currencyPairs2 = (List) obj2;
                Intrinsics.checkNotNullParameter(currencyPairs2, "currencyPairs");
                return nim.a.w(((nw5.a) obj4).f219769a.e(currencyPairs2, (n9l.b) obj3), new nuc.n(17));
            case 5:
                com.revolut.feature.freelancer.impl.ui.ecommerce.auth.flow.a aVar3 = (com.revolut.feature.freelancer.impl.ui.ecommerce.auth.flow.a) obj4;
                yki.l lVar = (yki.l) obj3;
                ow6.e result2 = (ow6.e) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof ow6.d) {
                    oki.h.D2(lVar);
                    aVar3.C1(new ExternalDestination.Browser(((ow6.d) result2).f230311a, null));
                } else {
                    if (!Intrinsics.f(result2, e.a.f230312a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(lVar);
                }
                return Unit.f186387a;
            case 6:
                com.revolut.feature.card_design.impl.card_design.d dVar = (com.revolut.feature.card_design.impl.card_design.d) obj4;
                CardDesignFlowContract$Step cardDesignFlowContract$Step = (CardDesignFlowContract$Step) obj3;
                xy2.a result3 = (xy2.a) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (!(result3 instanceof a.C1720a)) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar.N2(((CardDesignFlowContract$Step.UserLegalAgreement) cardDesignFlowContract$Step).f64668b);
                return Unit.f186387a;
            case 7:
                String str3 = (String) obj3;
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                wi0.b bVarY = do3.q.y(user);
                z80.b bVar = (z80.b) ((jul.o) obj4).f178696c;
                String str4 = bVarY.f297794a;
                if (bVar.k(str3, str4)) {
                    nVar = new zm3.o(z80.b.b(bVar, str3, str4, null, 4));
                } else if (e0m.g.a(str3)) {
                    nVar = new zm3.n(str3);
                }
                od0.i.Companion.getClass();
                return od0.h.a(nVar);
            case 8:
                RevPointsOptInSource source = (RevPointsOptInSource) obj3;
                j2 j2Var = ((nyb.o) obj4).f220823g;
                String accountId = ((m1c.x) obj2).f201470a;
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                Intrinsics.checkNotNullParameter(source, "source");
                if (Intrinsics.f(source, RevPointsOptInSource.ExclusiveStore.f83989a)) {
                    tbVar = tb.EXCLUSIVE_STORE;
                } else if (Intrinsics.f(source, RevPointsOptInSource.Experiences.f83990a)) {
                    tbVar = tb.EXPERIENCES;
                } else if (Intrinsics.f(source, RevPointsOptInSource.GiftCard.f83991a)) {
                    tbVar = tb.GIFT_CARD;
                } else if (Intrinsics.f(source, RevPointsOptInSource.HomeWidget.f83992a)) {
                    tbVar = tb.HOME_WIDGET;
                } else if (Intrinsics.f(source, RevPointsOptInSource.Miles.f83996a)) {
                    tbVar = tb.MILES;
                } else if (Intrinsics.f(source, RevPointsOptInSource.PlanHub.f83998a)) {
                    tbVar = tb.PLAN_HUB;
                } else if (Intrinsics.f(source, RevPointsOptInSource.PointsPocket.f83999a)) {
                    tbVar = tb.POINTS_POCKET;
                } else if (Intrinsics.f(source, RevPointsOptInSource.Shops.f84003a)) {
                    tbVar = tb.SHOPS;
                } else if (Intrinsics.f(source, RevPointsOptInSource.Stays.f84006a)) {
                    tbVar = tb.STAYS;
                } else if (Intrinsics.f(source, RevPointsOptInSource.TabHeader.f84008a)) {
                    tbVar = tb.TAB_HEADER;
                } else if (source instanceof RevPointsOptInSource.Deeplink) {
                    tbVar = tb.DEEPLINK;
                } else if (Intrinsics.f(source, RevPointsOptInSource.CardSelection.f83982a)) {
                    tbVar = tb.CARD_SELECTION;
                } else if (Intrinsics.f(source, RevPointsOptInSource.Cashback.f83983a)) {
                    tbVar = tb.CASHBACK;
                } else if (Intrinsics.f(source, RevPointsOptInSource.ChallengesPreview.f83984a)) {
                    tbVar = tb.CHALLENGES_PREVIEW;
                } else if (Intrinsics.f(source, RevPointsOptInSource.CreditWidget.f83985a)) {
                    tbVar = tb.CREDIT_WIDGET;
                } else if (Intrinsics.f(source, RevPointsOptInSource.Donations.f83987a)) {
                    tbVar = tb.DONATIONS;
                } else if (Intrinsics.f(source, RevPointsOptInSource.Esim.f83988a)) {
                    tbVar = tb.ESIM;
                } else if (Intrinsics.f(source, RevPointsOptInSource.Lounges.f83993a)) {
                    tbVar = tb.LOUNGES;
                } else if (Intrinsics.f(source, RevPointsOptInSource.Onboarding.f83997a)) {
                    tbVar = tb.ONBOARDING;
                } else if (Intrinsics.f(source, RevPointsOptInSource.RevPay.f84002a)) {
                    tbVar = tb.REVPAY;
                } else if (Intrinsics.f(source, RevPointsOptInSource.TransactionDetails.f84009a)) {
                    tbVar = tb.TRANSACTION_DETAILS;
                } else if (Intrinsics.f(source, RevPointsOptInSource.Transport.f84010a)) {
                    tbVar = tb.TRANSPORT;
                } else if (Intrinsics.f(source, RevPointsOptInSource.TabAutoPrompt.f84007a)) {
                    tbVar = tb.TAB_AUTO_PROMPT;
                } else if (Intrinsics.f(source, RevPointsOptInSource.LoyaltySavings.f83994a)) {
                    tbVar = tb.LOYALTY_SAVINGS;
                } else if (Intrinsics.f(source, RevPointsOptInSource.PointsPocketDiscovery.f84000a)) {
                    tbVar = tb.POINTS_POCKET_DISCOVERY;
                } else if (Intrinsics.f(source, RevPointsOptInSource.SpendAnalytics.f84004a)) {
                    tbVar = tb.SPEND_ANALYTICS;
                } else if (Intrinsics.f(source, RevPointsOptInSource.RentAndBills.f84001a)) {
                    tbVar = tb.RENT_AND_BILLS;
                } else if (Intrinsics.f(source, RevPointsOptInSource.AirportTransfers.f83981a)) {
                    tbVar = tb.AIRPORT_TRANSFERS;
                } else if (Intrinsics.f(source, RevPointsOptInSource.LuggageStorage.f83995a)) {
                    tbVar = tb.LUGGAGE_STORAGE;
                } else {
                    if (!Intrinsics.f(source, RevPointsOptInSource.Stations.f84005a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tbVar = tb.STATIONS;
                }
                SettingsProductOptInSourceContext.a aVarNewBuilder = SettingsProductOptInSourceContext.newBuilder();
                rb rbVar = rb.LOYALTY;
                aVarNewBuilder.c();
                ((SettingsProductOptInSourceContext) aVarNewBuilder.f49761b).setProduct(rbVar);
                aVarNewBuilder.c();
                ((SettingsProductOptInSourceContext) aVarNewBuilder.f49761b).setAccountId(accountId);
                aVarNewBuilder.c();
                ((SettingsProductOptInSourceContext) aVarNewBuilder.f49761b).setOptInSource(tbVar);
                if ((source instanceof RevPointsOptInSource.Deeplink) && (str = ((RevPointsOptInSource.Deeplink) source).f83986a) != null) {
                    aVarNewBuilder.c();
                    ((SettingsProductOptInSourceContext) aVarNewBuilder.f49761b).setAdditionalContext(str);
                }
                com.google.protobuf.w0 w0VarA = aVarNewBuilder.a();
                Intrinsics.checkNotNullExpressionValue(w0VarA, "build(...)");
                SettingsProductOptInSourceContext context = (SettingsProductOptInSourceContext) w0VarA;
                Intrinsics.checkNotNullParameter(context, "context");
                com.revolut.analytics.tracking.v3.l.n3((com.revolut.analytics.tracking.v3.l) j2Var, null, new nmm.h(context, 8), 3);
                return Unit.f186387a;
            case 9:
                nyb.o oVar = (nyb.o) obj4;
                TermsScope termsScope = (TermsScope) obj3;
                Boolean areTermsAccepted = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(areTermsAccepted, "areTermsAccepted");
                return areTermsAccepted.booleanValue() ? pfm.m.f235744a : new pfm.a(oVar.f220821b.j(termsScope), new ny7.j(new nyb.l(oVar, i3), 15), 4);
            case 10:
                x0 x0Var = (x0) obj4;
                nyb.o oVar2 = (nyb.o) obj3;
                oyb.d config = (oyb.d) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                oyb.c cVar2 = config.f230929a;
                if (!cVar2.equals(oyb.a.f230927a)) {
                    if (cVar2.equals(oyb.b.f230928a)) {
                        return efm.d0.m(new m1c.r0(x0Var, m1c.t.f201455a));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                List list = config.f230930b;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(oVar2.f220821b.j((TermsScope) it8.next()));
                }
                return efm.d0.E(arrayList2, new ny7.j(new nya.b0(oVar2, x0Var), i2));
            case 11:
                AutoPayPromptScreenConfig config2 = (AutoPayPromptScreenConfig) obj2;
                Intrinsics.checkNotNullParameter(config2, "config");
                return ((nz3.b) obj4).g(config2, (PluginPayload) obj3);
            case 12:
                FreelancerOnboardingFlowContract$DomainState update = (FreelancerOnboardingFlowContract$DomainState) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return FreelancerOnboardingFlowContract$DomainState.a(update, (List) obj3, ((BusinessCategory) obj4).f73442a, null, null, null, null, 60);
            case 13:
                gzc.c answer = (gzc.c) obj2;
                Intrinsics.checkNotNullParameter(answer, "answer");
                SowService sowService = ((nzc.d) obj4).f221017a;
                Intrinsics.checkNotNullParameter(answer, "answer");
                return sowService.answerEvidenceQuestion((String) obj3, new jzc.b(answer.f147990c, answer.f147989b));
            case 14:
                return EvCompImpl.applyAsync$lambda$2$0((EvCompImpl) obj4, (EvCompImpl.AnonymousClass3) obj3, (Throwable) obj2);
            case 15:
                return new o03.a(new Data((h93.f0) obj4, null, false, 6, null), (d71.a) obj3);
            case 16:
                o08.c cVar3 = (o08.c) obj3;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                zw7.d0 d0Var = (zw7.d0) pair2.f186385a;
                List list2 = (List) pair2.f186386b;
                ((o08.k) obj4).k.setVisible(d0Var != null ? d0Var.k : false);
                ((PetDetailsActivity) cVar3).setItems(list2);
                return Unit.f186387a;
            case 17:
                com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a aVar4 = (com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a) obj4;
                FreelancerOrder freelancerOrder = (FreelancerOrder) obj3;
                dii.g result4 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (result4 instanceof dii.e) {
                    aVar4.C1(zh9.u0.c(new WhoToTransferFeatureConfig.Transfer(new WhoToTransferScreenMode.PredefinedFilter(zhm.v.k(WhoToTransferFilter.Revolut.f80005a, WhoToTransferFilter.Accounts.f79984a), false), g3a.h.GO_TO_SEND, new TransferMoneyPocket(freelancerOrder.f73294j, new SourceAccount.Pocket(null, io3.l.MERCHANT, null, 4)), new FlowExtras(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.d, null, null, 6)))), null, 96)));
                }
                return Unit.f186387a;
            case 18:
                com.revolut.feature.payments.splitbill.impl.ui_new.e eVar2 = (com.revolut.feature.payments.splitbill.impl.ui_new.e) obj4;
                SplitBillsFlowContract$Step.CreateGroup createGroup = (SplitBillsFlowContract$Step.CreateGroup) obj3;
                rq9.f output = (rq9.f) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (!(output instanceof rq9.d)) {
                    if (!(output instanceof rq9.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar2.l2(new com.revolut.feature.payments.splitbill.impl.ui_new.c(eVar2, ((rq9.e) output).f256510a, createGroup.f79838b, null), new yi5.b(i2));
                }
                return Unit.f186387a;
            case 19:
                com.revolut.feature.payments.splitbill.impl.ui_new.e eVar3 = (com.revolut.feature.payments.splitbill.impl.ui_new.e) obj4;
                SplitBillsFlowContract$Step.SelectContacts selectContacts = (SplitBillsFlowContract$Step.SelectContacts) obj3;
                cn3.b output2 = (cn3.b) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof cn3.c) {
                    cn3.c cVar4 = (cn3.c) output2;
                    List list3 = cVar4.f25344a;
                    if (cVar4.f25345b) {
                        List list4 = list3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it9 = list4.iterator();
                        while (it9.hasNext()) {
                            arrayList3.add(((cn3.e) it9.next()).f25347a);
                        }
                        eVar3.l2(new com.revolut.feature.payments.splitbill.impl.ui_new.b(eVar3, arrayList3, selectContacts.f79843a, null), new yi5.b(i2));
                    } else {
                        List list5 = selectContacts.f79843a;
                        List list6 = list3;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list6, 10));
                        Iterator it10 = list6.iterator();
                        while (it10.hasNext()) {
                            arrayList4.add(((cn3.e) it10.next()).f25347a);
                        }
                        eVar3.l2(new com.revolut.feature.payments.splitbill.impl.ui_new.d(eVar3, list5, arrayList4, selectContacts.f, selectContacts.e, null), new yi5.b(i2));
                    }
                } else if (output2 instanceof cn3.d) {
                    eVar3.l2(new com.revolut.feature.payments.splitbill.impl.ui_new.c(eVar3, ((cn3.d) output2).f25346a.f25348a, selectContacts.f79843a, null), new yi5.b(i2));
                } else {
                    if (!(output2 instanceof b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eVar3.I2();
                }
                return Unit.f186387a;
            case 20:
                SplitBillsFlowContract$Step.SplitSummary splitSummary = (SplitBillsFlowContract$Step.SplitSummary) obj4;
                com.revolut.feature.payments.splitbill.impl.ui_new.e eVar4 = (com.revolut.feature.payments.splitbill.impl.ui_new.e) obj3;
                bp9.g outputData = (bp9.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                List<SplitMemberType.SplitMember> list7 = splitSummary.f79847b.f79224b;
                ArrayList arrayList5 = new ArrayList();
                for (SplitMemberType.SplitMember splitMember : list7) {
                    SplitMemberType.SplitMember.ContactMember contactMember = splitMember instanceof SplitMemberType.SplitMember.ContactMember ? (SplitMemberType.SplitMember.ContactMember) splitMember : null;
                    zm3.a aVar5 = contactMember != null ? contactMember.f79217a : null;
                    if (aVar5 != null) {
                        arrayList5.add(aVar5);
                    }
                }
                if (outputData instanceof bp9.f) {
                    eVar4.l2(new o1a.g(eVar4, ((bp9.f) outputData).f17567a, arrayList5, splitSummary.d, null), new yi5.b(i2));
                } else if (!(outputData instanceof bp9.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 21:
                com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b bVar2 = (com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b) obj4;
                cli.y yVar = bVar2.D;
                AddressFormat addressFormat = (AddressFormat) obj3;
                th1.d output3 = (th1.d) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (output3 instanceof th1.b) {
                    Address empty = Address.INSTANCE.getEMPTY();
                    String strM2 = bVar2.M2();
                    String strM22 = bVar2.M2();
                    String str5 = ((th1.b) output3).f271241a;
                    wi0.b.Companion.getClass();
                    pair = new Pair(empty.copy((32704 & 1) != 0 ? empty.streetLine1 : null, (32704 & 2) != 0 ? empty.streetLine2 : null, (32704 & 4) != 0 ? empty.region : null, (32704 & 8) != 0 ? empty.city : null, (32704 & 16) != 0 ? empty.postcode : Intrinsics.f(strM22, "JP") ? str5 : null, (32704 & 32) != 0 ? empty.country : strM2, (32704 & 64) != 0 ? empty.fullAddress : null, (32704 & 128) != 0 ? empty.streetType : null, (32704 & 256) != 0 ? empty.street : null, (32704 & 512) != 0 ? empty.houseNumber : null, (32704 & 1024) != 0 ? empty.flat : null, (32704 & 2048) != 0 ? empty.neighborhood : null, (32704 & 4096) != 0 ? empty.houseName : null, (32704 & 8192) != 0 ? empty.type : null, (32704 & 16384) != 0 ? empty.landmark : null), null);
                } else {
                    if (!(output3 instanceof th1.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (addressFormat == AddressFormat.DETAILED) {
                        th1.c cVar5 = (th1.c) output3;
                        address = cVar5.f271243b;
                        if (address == null) {
                            address = cVar5.f271242a;
                        }
                    } else {
                        address = ((th1.c) output3).f271242a;
                    }
                    Address address2 = address;
                    pair = new Pair(address2.copy((32704 & 1) != 0 ? address2.streetLine1 : null, (32704 & 2) != 0 ? address2.streetLine2 : null, (32704 & 4) != 0 ? address2.region : null, (32704 & 8) != 0 ? address2.city : null, (32704 & 16) != 0 ? address2.postcode : null, (32704 & 32) != 0 ? address2.country : null, (32704 & 64) != 0 ? address2.fullAddress : "", (32704 & 128) != 0 ? address2.streetType : null, (32704 & 256) != 0 ? address2.street : null, (32704 & 512) != 0 ? address2.houseNumber : null, (32704 & 1024) != 0 ? address2.flat : null, (32704 & 2048) != 0 ? address2.neighborhood : null, (32704 & 4096) != 0 ? address2.houseName : null, (32704 & 8192) != 0 ? address2.type : null, (32704 & 16384) != 0 ? address2.landmark : null), ((th1.c) output3).f271244c);
                }
                bVar2.H2(yVar, new b0(bVar2, m33.a.b((Address) pair.f186385a, ((o23.w) ((vkm.j2) yVar.f22677a).getValue()).f221470l), (String) pair.f186386b, 22));
                return Unit.f186387a;
            case 22:
                Address address3 = (Address) obj4;
                String str6 = (String) obj3;
                o23.w update2 = (o23.w) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                sh1.h hVarO2 = com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b.O2(address3);
                String fullAddress = address3.getFullAddress();
                return o23.w.a(update2, hVarO2, null, fullAddress == null ? "" : fullAddress, null, null, true, null, null, str6, null, false, null, 32182);
            case 23:
                com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b bVar3 = (com.revolut.feature.card_order_new.impl.kompot.screen.address_form.b) obj4;
                AddressFormScreenContract$ModalStep addressFormScreenContract$ModalStep = (AddressFormScreenContract$ModalStep) obj3;
                s23.f result5 = (s23.f) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                if (result5 instanceof f.a) {
                    bVar3.C2(new o23.x(((AddressFormScreenContract$ModalStep.ConfirmDifferentAddressDialog) addressFormScreenContract$ModalStep).f65127a, ((o23.w) ((vkm.j2) bVar3.D.f22677a).getValue()).f221469j, Boolean.TRUE, 16));
                } else if (!(result5 instanceof f.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 24:
                String str7 = (String) obj3;
                od0.i locationOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(locationOptional, "locationOptional");
                LifestyleHomeService lifestyleHomeService = ((o29.u) obj4).f221584a;
                LocationDomain locationDomain = (LocationDomain) locationOptional.f224257a;
                String str8 = locationDomain != null ? locationDomain.f78066a + "," + locationDomain.f78067b : null;
                LifestyleHomeService.Companion companion = LifestyleHomeService.INSTANCE;
                return te0.w.i0(lifestyleHomeService.getHomeFeed(str7, "X-Enabled-Features,Accept-Language", str8));
            case 25:
                o3d.e eVar5 = (o3d.e) obj4;
                FavouritesAssetTypeKey favouritesAssetTypeKey = (FavouritesAssetTypeKey) obj3;
                dii.g result6 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result6, "result");
                if (Intrinsics.f(result6, dii.f.f115069a)) {
                    String str9 = eVar5.f221794m;
                    Set setB = y0.b(favouritesAssetTypeKey);
                    eVar5.B2(new CombinedWatchlistSharedDestination(new CombinedWatchlistSharedDestination.InputData(new CombinedWatchlistContext(str9, setB, setB), false), null));
                } else if (!Intrinsics.f(result6, dii.e.f115068a) && !(result6 instanceof dii.b) && !(result6 instanceof dii.d) && !(result6 instanceof dii.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 26:
                o44.m mVar = (o44.m) obj4;
                List it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                hw3.c cVar6 = mVar.f222000p;
                String strD = kotlin.text.a0.D((String) obj3, " ", "", false);
                CreditAddressSearchScreenContract$InputData creditAddressSearchScreenContract$InputData = mVar.f222001q;
                cu3.e eVar6 = creditAddressSearchScreenContract$InputData.f66963b;
                cu3.a addressLookupRequest = new cu3.a(strD, eVar6);
                String applicationId = creditAddressSearchScreenContract$InputData.f66964c.f66892b;
                cVar6.getClass();
                Intrinsics.checkNotNullParameter(addressLookupRequest, "addressLookupRequest");
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                p24.p pVar2 = cVar6.f156055a;
                pVar2.getClass();
                Intrinsics.checkNotNullParameter(addressLookupRequest, "addressLookupRequest");
                Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                CreditPluginsService creditPluginsService = pVar2.f232057c;
                Object obj5 = n14.b.f211238a;
                Intrinsics.checkNotNullParameter(addressLookupRequest, "<this>");
                return te0.w.g0(creditPluginsService.requestAddressLookup(applicationId, new vz3.b(strD, u1.g(eVar6, n14.b.f211238a))));
            case 27:
                lal.a aVar6 = (lal.a) obj4;
                Set filter = (Set) obj3;
                Map content = (Map) ((Data) obj2).getContent();
                if (content != null) {
                    o4a.h hVar = (o4a.h) aVar6.f193427c;
                    hVar.getClass();
                    Intrinsics.checkNotNullParameter(content, "content");
                    Intrinsics.checkNotNullParameter(filter, "filter");
                    if (Intrinsics.f(filter, com.revolut.feature.payments.who_to_transfer.api.common.a.f80009a)) {
                        hVar.f222185a.f("ALL_FILTERS_CACHE_KEY", content);
                    }
                }
                return Unit.f186387a;
            case 28:
                return NavController.handleDeepLink$lambda$21((NavDestination) obj4, (NavController) obj3, (NavOptionsBuilder) obj2);
            default:
                return Navigator.navigate$lambda$1((Navigator) obj4, (NavOptions) obj3, null, (NavBackStackEntry) obj2);
        }
    }

    public /* synthetic */ b0(Object obj2, Object obj3, int i) {
        this.f219595a = i;
        this.f219596b = obj2;
        this.f219597c = obj3;
    }
}
