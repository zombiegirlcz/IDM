package c51;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.revolut.feature.card.verification.api.navigation.CardVerificationFeatureConfig;
import com.revolut.feature.card_add_to_googlepay.api.AddToGooglePayFeatureConfig;
import com.revolut.feature.card_contactless_limit.api.CardContactlessLimitFeatureConfig;
import com.revolut.feature.card_input.api.CardInputFeatureConfig;
import com.revolut.feature.card_management.api.CardManagementFeatureConfig;
import com.revolut.feature.card_order_new.api.GetCardFeatureConfig;
import com.revolut.feature.card_order_new.api.IssueVirtualCardFeatureConfig;
import com.revolut.feature.card_screen.api.activity.CardsScreenFeatureConfig;
import com.revolut.feature.card_screen.api.navigation.RetailCardsScreenFeatureConfig;
import com.revolut.feature.checkout.api.resume.ResumeCheckoutFeatureConfig;
import com.revolut.feature.contacts.api.navigation.ContactsFeatureConfig;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.credit.forbearance.application.api.navigation.ForbearanceFeatureConfig;
import com.revolut.feature.credit.loan.api.navigation.LoanExternalFeatureConfig;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoWithdrawFeatureConfig;
import com.revolut.feature.cryptocommodity_invest.api.CryptoCommodityInvestFeatureConfig;
import com.revolut.feature.donations.api.navigation.DonationsFeatureConfig;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.feature.insurance_pet.api.navigation.PetFeatureConfig;
import com.revolut.feature.kyc.api.navigation.KycFeatureConfig;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.onboarding.api.missinginfo.MissingInfoFeatureConfig;
import com.revolut.feature.onboarding.api.revolut_card_ready.RevolutCardReadyConfig;
import com.revolut.feature.onboarding.api.verify_account.VerifyAccountFeatureConfig;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestFeatureConfig;
import com.revolut.feature.payments.social.api.navigation.SocialPaymentsFeatureConfig;
import com.revolut.feature.payments.splitbill.api.navigation.SplitBillFeatureConfig;
import com.revolut.feature.payments.who_to_transfer.api.who_to_transfer.navigation.WhoToTransferFeatureConfig;
import com.revolut.feature.push_to_card.api.feature_config.PushToCardAddCardFeatureConfig;
import com.revolut.feature.push_to_card.api.feature_config.PushToCardCardTransferFeatureConfig;
import com.revolut.feature.push_to_card.api.feature_config.PushToCardRecipientDetailsFeatureConfig;
import com.revolut.feature.remote_stories.models.navigation.RemoteStoriesFeatureConfig;
import com.revolut.feature.selfserve.sot.api.navigation.SotFeatureConfig;
import com.revolut.feature.stories.navigation.StoriesFeatureConfig;
import com.revolut.feature.subscriptions.api.subscriptiondetails.SubscriptionsDetailsFeatureConfig;
import com.revolut.feature.subscriptions.api.subscriptionlist.SubscriptionListFeatureConfig;
import com.revolut.feature.support.api.navigation.CardDeliveryTroubleshootingFeatureConfig;
import com.revolut.feature.toggles.api.navigation.FeatureToggleNaviConfig;
import com.revolut.feature.topup_screen.api.feature_config.TopUpCheckoutFeatureConfig;
import com.revolut.feature.transactions.api.navigation.TransactionMerchantFeedbackFeatureConfig;
import com.revolut.feature.travel.hotels.api.navigation.TravelHotelsFeatureConfig;
import com.revolut.feature.trusted_merchants.api.TrustedMerchantsFeatureConfig;
import com.revolut.feature.vaults.api.navigation.VaultsFeatureConfig;
import com.revolut.feature.wealth.api.declaration.DisclosuresFeatureConfig;
import com.revolut.feature.wealth.api.declaration.MostTradedAssetsFeatureConfig;
import com.revolut.feature.wealth.api.declaration.TopMoversFeatureConfig;
import com.revolut.feature_crypto_order_details.api.navigation.TPSLOrderDetailsFeatureConfig;
import com.revolut.feature_document_view.declaration.DocumentViewFeatureConfiguration;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_exchange.api.navigation.OrderDetailsFeatureConfig;
import com.revolut.feature_market_data_api.navigation.TransactionBreakdownFeatureConfig;
import com.revolut.feature_news_api.NewsInfoFeatureConfig;
import com.revolut.feature_pdf_view.PdfViewFeatureConfiguration;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig;
import com.revolut.retail.feature.cryptocommoditydetails.api.navigation.CryptoCommodityDetailsFeatureConfig;
import com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinksFeatureConfig;
import com.revolut.retail.feature.pda.api.navigation.PdaFeatureConfig;
import cpi.o;
import g9g.n1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import vc.s;
import zhm.r0;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements cri.c {
    public final aq1.e A;
    public final aq1.e B;
    public final aq1.e C;
    public final aq1.e D;
    public final aq1.e E;
    public final aq1.e F;
    public final aq1.e G;
    public final aq1.e H;
    public final aq1.e I;
    public final aq1.e J;
    public final aq1.e K;
    public final aq1.e L;
    public final aq1.e M;
    public final aq1.e N;
    public final aq1.e O;
    public final aq1.e P;
    public final aq1.e Q;
    public final aq1.e R;
    public final aq1.e S;
    public final aq1.e T;
    public final aq1.e U;
    public final aq1.e V;
    public final aq1.e W;
    public final aq1.e X;
    public final aq1.e Y;
    public final aq1.e Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21334a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final aq1.e f21335a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w3e.b f21336b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final aq1.e f21337b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ite.a f21338c;
    public final aq1.e c0;
    public final ede.b d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final aq1.e f21339d0;
    public final n1 e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final aq1.e f21340e0;
    public final h9h.a f;
    public final aq1.e f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final djf.c f21341g;
    public final aq1.e g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final aq1.e f21342h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final aq1.e f21343h0;
    public final aq1.e i;
    public final aq1.e i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final aq1.e f21344j;
    public final aq1.e j0;
    public final aq1.e k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final aq1.e f21345k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final aq1.e f21346l;
    public final aq1.e l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final aq1.e f21347m;
    public final aq1.e m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final aq1.e f21348n;
    public final aq1.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final aq1.e f21349p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final aq1.e f21350q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final aq1.e f21351r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final aq1.e f21352s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final aq1.e f21353t;
    public final aq1.e u;
    public final aq1.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final aq1.e f21354w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final aq1.e f21355x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final aq1.e f21356y;
    public final aq1.e z;

    public e(eri.b bVar, w3e.b bVar2, ite.a aVar, ede.b bVar3, n1 n1Var, djf.c cVar, h9h.a aVar2, Context context) {
        this.f21334a = context;
        this.f21336b = bVar2;
        this.f21338c = aVar;
        this.d = bVar3;
        this.e = n1Var;
        this.f = aVar2;
        this.f21341g = cVar;
        int i = 26;
        this.f21342h = new aq1.e(this, 0, i);
        this.i = new aq1.e(this, 1, i);
        this.f21344j = new aq1.e(this, 2, i);
        this.k = new aq1.e(this, 3, i);
        this.f21346l = new aq1.e(this, 4, i);
        this.f21347m = new aq1.e(this, 5, i);
        this.f21348n = new aq1.e(this, 6, i);
        this.o = new aq1.e(this, 7, i);
        this.f21349p = new aq1.e(this, 8, i);
        this.f21350q = new aq1.e(this, 9, i);
        this.f21351r = new aq1.e(this, 10, i);
        this.f21352s = new aq1.e(this, 11, i);
        this.f21353t = new aq1.e(this, 12, i);
        this.u = new aq1.e(this, 13, i);
        this.v = new aq1.e(this, 14, i);
        this.f21354w = new aq1.e(this, 15, i);
        this.f21355x = new aq1.e(this, 16, i);
        this.f21356y = new aq1.e(this, 17, i);
        this.z = new aq1.e(this, 18, i);
        this.A = new aq1.e(this, 19, i);
        this.B = new aq1.e(this, 20, i);
        this.C = new aq1.e(this, 21, i);
        this.D = new aq1.e(this, 22, i);
        this.E = new aq1.e(this, 23, i);
        this.F = new aq1.e(this, 24, i);
        this.G = new aq1.e(this, 25, i);
        this.H = new aq1.e(this, 26, i);
        this.I = new aq1.e(this, 27, i);
        this.J = new aq1.e(this, 28, i);
        this.K = new aq1.e(this, 29, i);
        this.L = new aq1.e(this, 30, i);
        this.M = new aq1.e(this, 31, i);
        this.N = new aq1.e(this, 32, i);
        this.O = new aq1.e(this, 33, i);
        this.P = new aq1.e(this, 34, i);
        this.Q = new aq1.e(this, 35, i);
        this.R = new aq1.e(this, 36, i);
        this.S = new aq1.e(this, 37, i);
        this.T = new aq1.e(this, 38, i);
        this.U = new aq1.e(this, 39, i);
        this.V = new aq1.e(this, 40, i);
        this.W = new aq1.e(this, 41, i);
        this.X = new aq1.e(this, 42, i);
        this.Y = new aq1.e(this, 43, i);
        this.Z = new aq1.e(this, 44, i);
        this.f21335a0 = new aq1.e(this, 45, i);
        this.f21337b0 = new aq1.e(this, 46, i);
        this.c0 = new aq1.e(this, 47, i);
        this.f21339d0 = new aq1.e(this, 48, i);
        this.f21340e0 = new aq1.e(this, 49, i);
        this.f0 = new aq1.e(this, 50, i);
        this.g0 = new aq1.e(this, 51, i);
        this.f21343h0 = new aq1.e(this, 52, i);
        this.i0 = new aq1.e(this, 53, i);
        this.j0 = new aq1.e(this, 54, i);
        this.f21345k0 = new aq1.e(this, 55, i);
        this.l0 = new aq1.e(this, 56, i);
        this.m0 = new aq1.e(this, 57, i);
    }

    public final LinkedHashMap a() {
        o.Companion.getClass();
        Context context = this.f21334a;
        Intrinsics.checkNotNullParameter(context, "context");
        ImmutableMap legacyLaunchers = ((ip.a) ue0.e.j(context)).b().k.f197513b.s();
        s.k(legacyLaunchers);
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(58);
        builderBuilderWithExpectedSize.put(WebViewFeatureConfig.class, this.f21342h);
        builderBuilderWithExpectedSize.put(StoriesFeatureConfig.class, this.i);
        builderBuilderWithExpectedSize.put(PaymentLinksFeatureConfig.class, this.f21344j);
        builderBuilderWithExpectedSize.put(WhoToTransferFeatureConfig.class, this.k);
        builderBuilderWithExpectedSize.put(SplitBillFeatureConfig.class, this.f21346l);
        builderBuilderWithExpectedSize.put(MoneyRequestFeatureConfig.class, this.f21347m);
        builderBuilderWithExpectedSize.put(ContactsFeatureConfig.class, this.f21348n);
        builderBuilderWithExpectedSize.put(VaultsFeatureConfig.class, this.o);
        builderBuilderWithExpectedSize.put(MainScreenFeatureConfig.class, this.f21349p);
        builderBuilderWithExpectedSize.put(TopUpCheckoutFeatureConfig.class, this.f21350q);
        builderBuilderWithExpectedSize.put(VerifyAccountFeatureConfig.class, this.f21351r);
        builderBuilderWithExpectedSize.put(MissingInfoFeatureConfig.class, this.f21352s);
        builderBuilderWithExpectedSize.put(RevolutCardReadyConfig.class, this.f21353t);
        builderBuilderWithExpectedSize.put(CryptoCommodityInvestFeatureConfig.class, this.u);
        builderBuilderWithExpectedSize.put(ResumeCheckoutFeatureConfig.class, this.v);
        builderBuilderWithExpectedSize.put(UserAuthFeatureConfig.class, this.f21354w);
        builderBuilderWithExpectedSize.put(CryptoCommodityDetailsFeatureConfig.class, this.f21355x);
        builderBuilderWithExpectedSize.put(PdaFeatureConfig.class, this.f21356y);
        builderBuilderWithExpectedSize.put(FeatureToggleNaviConfig.class, this.z);
        builderBuilderWithExpectedSize.put(CreditApplicationFeatureConfig.class, this.A);
        builderBuilderWithExpectedSize.put(LoanExternalFeatureConfig.class, this.B);
        builderBuilderWithExpectedSize.put(ForbearanceFeatureConfig.class, this.C);
        builderBuilderWithExpectedSize.put(RemoteStoriesFeatureConfig.class, this.D);
        builderBuilderWithExpectedSize.put(ExchangeFeatureConfig.class, this.E);
        builderBuilderWithExpectedSize.put(OrderDetailsFeatureConfig.class, this.F);
        builderBuilderWithExpectedSize.put(TPSLOrderDetailsFeatureConfig.class, this.G);
        builderBuilderWithExpectedSize.put(SotFeatureConfig.class, this.H);
        builderBuilderWithExpectedSize.put(TravelHotelsFeatureConfig.class, this.I);
        builderBuilderWithExpectedSize.put(CryptoWithdrawFeatureConfig.class, this.J);
        builderBuilderWithExpectedSize.put(SocialPaymentsFeatureConfig.class, this.K);
        builderBuilderWithExpectedSize.put(PdfViewFeatureConfiguration.class, this.L);
        builderBuilderWithExpectedSize.put(DocumentViewFeatureConfiguration.class, this.M);
        builderBuilderWithExpectedSize.put(KycFeatureConfig.class, this.N);
        builderBuilderWithExpectedSize.put(CardManagementFeatureConfig.class, this.O);
        builderBuilderWithExpectedSize.put(DonationsFeatureConfig.class, this.P);
        builderBuilderWithExpectedSize.put(CardsScreenFeatureConfig.class, this.Q);
        builderBuilderWithExpectedSize.put(CardVerificationFeatureConfig.class, this.R);
        builderBuilderWithExpectedSize.put(AddToGooglePayFeatureConfig.class, this.S);
        builderBuilderWithExpectedSize.put(GetCardFeatureConfig.class, this.T);
        builderBuilderWithExpectedSize.put(CardContactlessLimitFeatureConfig.class, this.U);
        builderBuilderWithExpectedSize.put(CardInputFeatureConfig.class, this.V);
        builderBuilderWithExpectedSize.put(DisclosuresFeatureConfig.class, this.W);
        builderBuilderWithExpectedSize.put(TopMoversFeatureConfig.class, this.X);
        builderBuilderWithExpectedSize.put(MostTradedAssetsFeatureConfig.class, this.Y);
        builderBuilderWithExpectedSize.put(SubscriptionsDetailsFeatureConfig.class, this.Z);
        builderBuilderWithExpectedSize.put(SubscriptionListFeatureConfig.class, this.f21335a0);
        builderBuilderWithExpectedSize.put(ExternalAccountsFeatureConfig.class, this.f21337b0);
        builderBuilderWithExpectedSize.put(NewsInfoFeatureConfig.class, this.c0);
        builderBuilderWithExpectedSize.put(PushToCardCardTransferFeatureConfig.class, this.f21339d0);
        builderBuilderWithExpectedSize.put(PushToCardAddCardFeatureConfig.class, this.f21340e0);
        builderBuilderWithExpectedSize.put(PushToCardRecipientDetailsFeatureConfig.class, this.f0);
        builderBuilderWithExpectedSize.put(PetFeatureConfig.class, this.g0);
        builderBuilderWithExpectedSize.put(TransactionBreakdownFeatureConfig.class, this.f21343h0);
        builderBuilderWithExpectedSize.put(CardDeliveryTroubleshootingFeatureConfig.class, this.i0);
        builderBuilderWithExpectedSize.put(TrustedMerchantsFeatureConfig.class, this.j0);
        builderBuilderWithExpectedSize.put(IssueVirtualCardFeatureConfig.class, this.f21345k0);
        builderBuilderWithExpectedSize.put(TransactionMerchantFeedbackFeatureConfig.class, this.l0);
        builderBuilderWithExpectedSize.put(RetailCardsScreenFeatureConfig.class, this.m0);
        ImmutableMap launchersFromModule = builderBuilderWithExpectedSize.build();
        Intrinsics.checkNotNullParameter(legacyLaunchers, "legacyLaunchers");
        Intrinsics.checkNotNullParameter(launchersFromModule, "launchersFromModule");
        ArrayList arrayList = new ArrayList(legacyLaunchers.size());
        Iterator it8 = legacyLaunchers.entrySet().iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            Class cls = (Class) entry.getKey();
            phm.a aVar = (phm.a) entry.getValue();
            Intrinsics.i(cls, "null cannot be cast to non-null type java.lang.Class<com.revolut.retail.core.navigation.feature.FeatureConfig>");
            Intrinsics.i(aVar, "null cannot be cast to non-null type javax.inject.Provider<com.revolut.retail.core.navigation.feature.FeatureLauncher<*>>");
            arrayList.add(new Pair(cls, aVar));
        }
        return r0.p(r0.t(arrayList), launchersFromModule);
    }
}
