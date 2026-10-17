package aq1;

import aa0.a0;
import aa0.b0;
import aa0.c0;
import aa0.d0;
import aa0.i1;
import aa0.j0;
import aa0.k0;
import aa0.l0;
import aa0.p;
import aa0.y;
import android.content.Context;
import androidx.room.migration.Migration;
import au6.c3;
import au6.k3;
import au6.m3;
import au6.r3;
import au6.w2;
import au6.x1;
import au6.y3;
import b6b.n0;
import bt6.h0;
import bt6.i0;
import c4f.g;
import c4f.k;
import c4f.u;
import c4f.w;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import cli.n;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.firebase.messaging.t;
import com.revolut.core.backend_flow.ui.BackendFlowSnapshotsCompressor;
import com.revolut.feature.backend_flow.domain.models.ExternalValidation;
import com.revolut.feature.backend_flow.domain.models.MaxAmountValidation;
import com.revolut.feature.backend_flow.domain.models.MaxLengthValidation;
import com.revolut.feature.backend_flow.domain.models.MinAmountValidation;
import com.revolut.feature.backend_flow.domain.models.MinLengthValidation;
import com.revolut.feature.backend_flow.domain.models.RegexValidation;
import com.revolut.feature.backend_flow.domain.models.WidgetProgressionItem;
import com.revolut.feature.freelancer.impl.database.tax_pockets.FreelancerTaxPocketsDatabase;
import com.revolut.feature.freelancer.impl.network.services.FreelancerPricingPlanService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerTaxAuthorityService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerTaxCalendarEventsService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerTaxConfigurationService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerTaxPocketsService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerTaxProfileService;
import com.revolut.feature.freelancer.impl.network.services.FreelancerVatReminderService;
import com.revolut.feature.freelancer.impl.network.services.InvoiceTemplateService;
import com.revolut.feature.payment.counterparty.impl.data.network.PaymentCounterpartyService;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_type.CobrandedCardsTypeSelectionScreenContract$InputData;
import com.revolut.feature.trading.impl.data.database.TradingDatabase;
import cu1.i;
import fmc.z;
import gq1.l;
import hn.h;
import java.util.Collection;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import lp.r1;
import ne0.j;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import rp0.g1;
import rp0.x0;
import t80.e;
import v3e.e0;
import v3e.m;
import vc.s;
import wli.x;
import wpg.v;
import y99.g0;
import zhm.f0;
import zx7.q;
import zx7.r;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8241c;

    public /* synthetic */ e(Object obj2, int i, int i2) {
        this.f8239a = i2;
        this.f8241c = obj2;
        this.f8240b = i;
    }

    private final Object a() {
        bt6.b bVar = (bt6.b) this.f8241c;
        int i = this.f8240b;
        switch (i) {
            case 0:
                return new m3((FreelancerTaxPocketsService) bVar.f18308w.get(), (j) bVar.f18309x.get(), bVar.k());
            case 1:
                i0 i0Var = bVar.f18295b;
                FreelancerTaxPocketsService freelancerTaxPocketsService = (FreelancerTaxPocketsService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) bVar.v.get(), "retrofit", FreelancerTaxPocketsService.class, "create(...)");
                s.k(freelancerTaxPocketsService);
                return freelancerTaxPocketsService;
            case 2:
                i0 i0Var2 = bVar.f18295b;
                Retrofit retrofitI = ((c21.b) bVar.f18296c).i();
                s.j(retrofitI);
                o oVar = (o) bVar.u.get();
                Retrofit.Builder builderX = p.a.x(retrofitI, "retrofit", oVar, "gson");
                builderX.converterFactories().clear();
                Retrofit retrofitBuild = builderX.addConverterFactory(GsonConverterFactory.create(oVar)).build();
                Intrinsics.checkNotNullExpressionValue(retrofitBuild, "build(...)");
                s.k(retrofitBuild);
                return retrofitBuild;
            case 3:
                i0 i0Var3 = bVar.f18295b;
                o gson = ((c21.b) bVar.f18296c).h();
                s.j(gson);
                Intrinsics.checkNotNullParameter(gson, "gson");
                return gson;
            case 4:
                return new ne0.d();
            case 5:
                return new y3((FreelancerVatReminderService) bVar.z.get(), (j) bVar.f18309x.get(), bVar.k(), (os6.e) bVar.B.get(), (os6.f) bVar.C.get());
            case 6:
                i0 i0Var4 = bVar.f18295b;
                FreelancerVatReminderService freelancerVatReminderService = (FreelancerVatReminderService) com.google.android.gms.internal.mlkit_vision_face.a.i((Retrofit) bVar.v.get(), "retrofit", FreelancerVatReminderService.class, "create(...)");
                s.k(freelancerVatReminderService);
                return freelancerVatReminderService;
            case 7:
                FreelancerTaxPocketsDatabase database = (FreelancerTaxPocketsDatabase) bVar.A.get();
                h0.Companion.getClass();
                Intrinsics.checkNotNullParameter(database, "database");
                os6.e eVarI = database.i();
                s.k(eVarI);
                return eVarI;
            case 8:
                Context context = bVar.f18298h;
                yk0.a databaseSessionProvider = bVar.e.b();
                s.j(databaseSessionProvider);
                de0.a databaseEncryptionMigratorFactory = ((c21.b) bVar.f18296c).b();
                h0.Companion.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(databaseEncryptionMigratorFactory, "databaseEncryptionMigratorFactory");
                FreelancerTaxPocketsDatabase freelancerTaxPocketsDatabase = (FreelancerTaxPocketsDatabase) FreelancerTaxPocketsDatabase.INSTANCE.a(context, databaseSessionProvider, new Migration[]{qs6.a.f248751c, qs6.b.f248752c}, databaseEncryptionMigratorFactory);
                s.k(freelancerTaxPocketsDatabase);
                return freelancerTaxPocketsDatabase;
            case 9:
                FreelancerTaxPocketsDatabase database2 = (FreelancerTaxPocketsDatabase) bVar.A.get();
                h0.Companion.getClass();
                Intrinsics.checkNotNullParameter(database2, "database");
                os6.f fVarJ = database2.j();
                s.k(fVarJ);
                return fVarJ;
            case 10:
                return new c3((j) bVar.f18309x.get(), bVar.k(), (FreelancerTaxCalendarEventsService) bVar.E.get(), (os6.b) bVar.F.get());
            case 11:
                i0 i0Var5 = bVar.f18295b;
                FreelancerTaxCalendarEventsService freelancerTaxCalendarEventsService = (FreelancerTaxCalendarEventsService) v0.a.f((c21.b) bVar.f18296c, "retrofit", FreelancerTaxCalendarEventsService.class, "create(...)");
                s.k(freelancerTaxCalendarEventsService);
                return freelancerTaxCalendarEventsService;
            case 12:
                FreelancerTaxPocketsDatabase database3 = (FreelancerTaxPocketsDatabase) bVar.A.get();
                h0.Companion.getClass();
                Intrinsics.checkNotNullParameter(database3, "database");
                os6.b bVarG = database3.g();
                s.k(bVarG);
                return bVarG;
            case 13:
                return new k3((FreelancerTaxConfigurationService) bVar.H.get(), (j) bVar.f18309x.get(), bVar.k());
            case 14:
                i0 i0Var6 = bVar.f18295b;
                FreelancerTaxConfigurationService freelancerTaxConfigurationService = (FreelancerTaxConfigurationService) v0.a.f((c21.b) bVar.f18296c, "retrofit", FreelancerTaxConfigurationService.class, "create(...)");
                s.k(freelancerTaxConfigurationService);
                return freelancerTaxConfigurationService;
            case 15:
                return new r3((j) bVar.f18309x.get(), (FreelancerTaxProfileService) bVar.J.get(), (os6.d) bVar.K.get(), bVar.k());
            case 16:
                i0 i0Var7 = bVar.f18295b;
                FreelancerTaxProfileService freelancerTaxProfileService = (FreelancerTaxProfileService) v0.a.f((c21.b) bVar.f18296c, "retrofit", FreelancerTaxProfileService.class, "create(...)");
                s.k(freelancerTaxProfileService);
                return freelancerTaxProfileService;
            case 17:
                FreelancerTaxPocketsDatabase database4 = (FreelancerTaxPocketsDatabase) bVar.A.get();
                h0.Companion.getClass();
                Intrinsics.checkNotNullParameter(database4, "database");
                os6.d dVarH = database4.h();
                s.k(dVarH);
                return dVarH;
            case 18:
                return new w2((FreelancerTaxAuthorityService) bVar.M.get(), (j) bVar.f18309x.get(), bVar.k());
            case 19:
                i0 i0Var8 = bVar.f18295b;
                FreelancerTaxAuthorityService freelancerTaxAuthorityService = (FreelancerTaxAuthorityService) v0.a.f((c21.b) bVar.f18296c, "retrofit", FreelancerTaxAuthorityService.class, "create(...)");
                s.k(freelancerTaxAuthorityService);
                return freelancerTaxAuthorityService;
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        c43.j jVar = (c43.j) this.f8241c;
        int i = this.f8240b;
        if (i == 0) {
            return new com.revolut.feature.card_payment_method.impl.flows.selector.flow.a(jVar.f21034a);
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) jVar.e.get();
        o43.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        return x0.a(g1.Companion, controller.C2().D2());
    }

    private final Object c() {
        c4e.c cVar = (c4e.c) this.f8241c;
        int i = this.f8240b;
        switch (i) {
            case 0:
                hri.b bVar = cVar.f21160a;
                return new ifm.b();
            case 1:
                hri.b bVar2 = cVar.f21160a;
                return new iri.j();
            case 2:
                return new um.c();
            case 3:
                return new e0();
            case 4:
                return new cn.e();
            case 5:
                cVar.getClass();
                return new h(ImmutableSet.copyOf((Collection) hn.f.a()));
            case 6:
                return new ln.c();
            case 7:
                return new ym.d();
            case 8:
                return new mm.d();
            case 9:
                return new sm.e();
            case 10:
                return new om.c();
            case 11:
                return new s3l.f();
            case 12:
                return new m((v3e.d) cVar.f21165j.get(), (ln.a) cVar.f21167m.get(), ((s41.a) cVar.f21162c).d());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        g gVar = (g) this.f8241c;
        int i = this.f8240b;
        if (i == 0) {
            return new b5f.d((n) gVar.f21214b.get());
        }
        if (i == 1) {
            return new b5f.g(gVar.f21213a);
        }
        throw new AssertionError(i);
    }

    private final Object e() {
        k kVar = (k) this.f8241c;
        c4f.b bVar = kVar.f21222a;
        int i = this.f8240b;
        switch (i) {
            case 0:
                z tradingDatabaseProvider = bVar.a();
                w.Companion.getClass();
                Intrinsics.checkNotNullParameter(tradingDatabaseProvider, "tradingDatabaseProvider");
                k3f.a aVarI = ((TradingDatabase) tradingDatabaseProvider.f136369b).i();
                s.k(aVarI);
                return aVarI;
            case 1:
                z tradingDatabaseProvider2 = bVar.a();
                w.Companion.getClass();
                Intrinsics.checkNotNullParameter(tradingDatabaseProvider2, "tradingDatabaseProvider");
                k3f.b bVarL = ((TradingDatabase) tradingDatabaseProvider2.f136369b).l();
                s.k(bVarL);
                return bVarL;
            case 2:
                z tradingDatabaseProvider3 = bVar.a();
                w.Companion.getClass();
                Intrinsics.checkNotNullParameter(tradingDatabaseProvider3, "tradingDatabaseProvider");
                j3f.c cVarH = ((TradingDatabase) tradingDatabaseProvider3.f136369b).h();
                s.k(cVarH);
                return cVarH;
            case 3:
                z tradingDatabaseProvider4 = bVar.a();
                w.Companion.getClass();
                Intrinsics.checkNotNullParameter(tradingDatabaseProvider4, "tradingDatabaseProvider");
                j3f.a aVarG = ((TradingDatabase) tradingDatabaseProvider4.f136369b).g();
                s.k(aVarG);
                return aVarG;
            case 4:
                return new d4f.e(((nj0.d) kVar.f21223b).j());
            case 5:
                w.Companion.getClass();
                return new u();
            case 6:
                gte.a aVarB = kVar.e.b();
                s.j(aVarB);
                return new d4f.c(aVarB);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        c51.c cVar = (c51.c) this.f8241c;
        Context context = cVar.f21322a;
        int i = this.f8240b;
        if (i != 0) {
            if (i == 1) {
                t70.g gVarO = cVar.f21324c.o();
                s.j(gVarO);
                return gVarO;
            }
            if (i == 2) {
                return new f73.c();
            }
            if (i == 3) {
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) cVar.d).c();
                s.j(aVarC);
                return aVarC;
            }
            if (i != 4) {
                throw new AssertionError(i);
            }
            c51.k.Companion.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            phm.a aVar = (phm.a) ue0.e.j(context).a().get(i.class);
            b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
            if (aVar2 != null) {
                return ((i) aVar2.b()).a();
            }
            throw new IllegalStateException(a0.d.q("Api ", i.class, " is not found"));
        }
        c51.k.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        r1 r1Var = ((ip.a) ue0.e.j(context)).b().k.f197513b;
        r1Var.getClass();
        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(357);
        builderBuilderWithExpectedSize.put("app/apps-flyer", r1Var.L1);
        builderBuilderWithExpectedSize.put("app/slots/checklists", r1Var.M1);
        builderBuilderWithExpectedSize.put("app/consumer-tickets", r1Var.N1);
        builderBuilderWithExpectedSize.put("app/self-serve", r1Var.O1);
        builderBuilderWithExpectedSize.put("app/source-of-transactions", r1Var.P1);
        builderBuilderWithExpectedSize.put("app/tickets", r1Var.Q1);
        builderBuilderWithExpectedSize.put("app/warrant-details", r1Var.R1);
        builderBuilderWithExpectedSize.put("app/chat", r1Var.S1);
        builderBuilderWithExpectedSize.put("app/assistant/escalate", r1Var.T1);
        builderBuilderWithExpectedSize.put("app/trading/stocks", r1Var.U1);
        builderBuilderWithExpectedSize.put("app/your-cashback", r1Var.V1);
        builderBuilderWithExpectedSize.put("app/lounges", r1Var.W1);
        builderBuilderWithExpectedSize.put("app/lounges-upgrade", r1Var.X1);
        builderBuilderWithExpectedSize.put("app/lounges-order-pass", r1Var.Y1);
        builderBuilderWithExpectedSize.put("app/lounges-select", r1Var.Z1);
        builderBuilderWithExpectedSize.put("app/co-brands", r1Var.f198112a2);
        builderBuilderWithExpectedSize.put("app/trading/spousal-consent", r1Var.f198121b2);
        builderBuilderWithExpectedSize.put("app/trading/remediation", r1Var.c2);
        builderBuilderWithExpectedSize.put("app/trading/account-remediation", r1Var.f198131d2);
        builderBuilderWithExpectedSize.put("app/trading/investment-account-objectives", r1Var.e2);
        builderBuilderWithExpectedSize.put("app/trading/onboarding/otp/challenge", r1Var.f198142f2);
        builderBuilderWithExpectedSize.put("app/trading/immediate-family-member", r1Var.f198148g2);
        builderBuilderWithExpectedSize.put("app/trading/extended-hours-onboarding", r1Var.h2);
        builderBuilderWithExpectedSize.put("app/trading/onboarding/acknowledgements/w8ben", r1Var.i2);
        builderBuilderWithExpectedSize.put("app/trading/onboarding-result", r1Var.j2);
        builderBuilderWithExpectedSize.put("app/trading/startstocksonboarding", r1Var.f198172k2);
        builderBuilderWithExpectedSize.put("app/trading/free-stocks", r1Var.l2);
        builderBuilderWithExpectedSize.put("app/trading/onboarding", r1Var.f198182m2);
        builderBuilderWithExpectedSize.put("app/account-limits", r1Var.f198188n2);
        builderBuilderWithExpectedSize.put("app/plan", r1Var.f198196o2);
        builderBuilderWithExpectedSize.put("app/plans", r1Var.p2);
        builderBuilderWithExpectedSize.put("app/plus", r1Var.f198210q2);
        builderBuilderWithExpectedSize.put("app/premium", r1Var.r2);
        builderBuilderWithExpectedSize.put("app/metal", r1Var.s2);
        builderBuilderWithExpectedSize.put("app/ultra", r1Var.t2);
        builderBuilderWithExpectedSize.put("app/private", r1Var.u2);
        builderBuilderWithExpectedSize.put("app/ultra_only", r1Var.v2);
        builderBuilderWithExpectedSize.put("app/plan-downgrade", r1Var.f198246w2);
        builderBuilderWithExpectedSize.put("app/metal-upgrade-conf", r1Var.f198252x2);
        builderBuilderWithExpectedSize.put("app/switch-to-annual", r1Var.y2);
        builderBuilderWithExpectedSize.put("app/promo-link", r1Var.f198264z2);
        builderBuilderWithExpectedSize.put("app/partners", r1Var.A2);
        builderBuilderWithExpectedSize.put("app/offers", r1Var.B2);
        builderBuilderWithExpectedSize.put("app/students", r1Var.C2);
        builderBuilderWithExpectedSize.put("app/email-confirm", r1Var.D2);
        builderBuilderWithExpectedSize.put("app/halloween-theme-apply", r1Var.E2);
        builderBuilderWithExpectedSize.put("app/christmas-theme-apply", r1Var.F2);
        builderBuilderWithExpectedSize.put("app/profile-details-confirmation", r1Var.G2);
        builderBuilderWithExpectedSize.put("app/cards/card-confirmation", r1Var.H2);
        builderBuilderWithExpectedSize.put("app/personal-details", r1Var.I2);
        builderBuilderWithExpectedSize.put("app/change-passcode", r1Var.J2);
        builderBuilderWithExpectedSize.put("app/account-terminate", r1Var.K2);
        builderBuilderWithExpectedSize.put("app/profile-details", r1Var.L2);
        builderBuilderWithExpectedSize.put("app/security-hub", r1Var.M2);
        builderBuilderWithExpectedSize.put("app/remind-passcode", r1Var.N2);
        builderBuilderWithExpectedSize.put("app/second-device-login", r1Var.O2);
        builderBuilderWithExpectedSize.put("app/direct-debit", r1Var.P2);
        builderBuilderWithExpectedSize.put("app/exchange/crypto", r1Var.Q2);
        builderBuilderWithExpectedSize.put("app/bank-account-switch", r1Var.R2);
        builderBuilderWithExpectedSize.put("app/group-bills", r1Var.S2);
        builderBuilderWithExpectedSize.put("app/create-group", r1Var.T2);
        builderBuilderWithExpectedSize.put("app/groups", r1Var.U2);
        builderBuilderWithExpectedSize.put("app/pod-nominees", r1Var.V2);
        builderBuilderWithExpectedSize.put("app/enable-contacts-permission", r1Var.W2);
        builderBuilderWithExpectedSize.put("app/send-transfer", r1Var.X2);
        builderBuilderWithExpectedSize.put("app/send-payment", r1Var.Y2);
        builderBuilderWithExpectedSize.put("app/learn", r1Var.Z2);
        builderBuilderWithExpectedSize.put("app/feature", r1Var.f198113a3);
        builderBuilderWithExpectedSize.put("app/crypto/recurring-buys", r1Var.f198122b3);
        builderBuilderWithExpectedSize.put("app/feature/crypto/recurring", r1Var.c3);
        builderBuilderWithExpectedSize.put("app/credit-card", r1Var.f198132d3);
        builderBuilderWithExpectedSize.put("app/overdraft", r1Var.f198138e3);
        builderBuilderWithExpectedSize.put("app/credit/post-termination-plan/{plan}/details", r1Var.f198143f3);
        builderBuilderWithExpectedSize.put("app/credit/post-termination-plan/{plan}/repay", r1Var.g3);
        builderBuilderWithExpectedSize.put("app/trading/corporate-events", r1Var.h3);
        builderBuilderWithExpectedSize.put("app/mandate-institution-auth", r1Var.i3);
        builderBuilderWithExpectedSize.put("app/mandate/create", r1Var.j3);
        builderBuilderWithExpectedSize.put("app/create-personal-vault", r1Var.k3);
        builderBuilderWithExpectedSize.put("app/create-group-vault", r1Var.l3);
        builderBuilderWithExpectedSize.put("app/vaults", r1Var.m3);
        builderBuilderWithExpectedSize.put("app/money-boxes", r1Var.n3);
        builderBuilderWithExpectedSize.put("app/money-box-invitations", r1Var.o3);
        builderBuilderWithExpectedSize.put("app/high-apy-offer", r1Var.p3);
        builderBuilderWithExpectedSize.put("app/vaults-documents-reacceptance", r1Var.f198211q3);
        builderBuilderWithExpectedSize.put("app/bank-transfer", r1Var.r3);
        builderBuilderWithExpectedSize.put("app/transfer", r1Var.s3);
        builderBuilderWithExpectedSize.put("app/card-transfer", r1Var.t3);
        builderBuilderWithExpectedSize.put("app/savings", r1Var.f198236u3);
        builderBuilderWithExpectedSize.put("app/pay-bills-taxes", r1Var.f198242v3);
        builderBuilderWithExpectedSize.put("app/phone-top-ups", r1Var.w3);
        builderBuilderWithExpectedSize.put("app/taxes", r1Var.x3);
        builderBuilderWithExpectedSize.put("app/pay-later", r1Var.f198258y3);
        builderBuilderWithExpectedSize.put("app/credit/ftc-application", r1Var.z3);
        builderBuilderWithExpectedSize.put("app/credit/cc-application", r1Var.A3);
        builderBuilderWithExpectedSize.put("app/credit/cc_cli-application", r1Var.B3);
        builderBuilderWithExpectedSize.put("app/credit/fcc-application", r1Var.C3);
        builderBuilderWithExpectedSize.put("app/credit/rfl-application", r1Var.D3);
        builderBuilderWithExpectedSize.put("app/credit/bnpl-application", r1Var.E3);
        builderBuilderWithExpectedSize.put("app/credit/mtg-application", r1Var.F3);
        builderBuilderWithExpectedSize.put("app/credit/mtg-rf-application", r1Var.G3);
        builderBuilderWithExpectedSize.put("app/credit/od-application", r1Var.H3);
        builderBuilderWithExpectedSize.put("app/credit/{product}-fbr-application", r1Var.I3);
        builderBuilderWithExpectedSize.put("app/credit/{product}/{facility}/intro", r1Var.J3);
        builderBuilderWithExpectedSize.put("app/credit/pt-rp-application/{facility}", r1Var.K3);
        builderBuilderWithExpectedSize.put("app/credit/pt-ps-application/{facility}", r1Var.L3);
        builderBuilderWithExpectedSize.put("app/credit/mtg-rng-application/{facility}/FORBEARANCE", r1Var.M3);
        builderBuilderWithExpectedSize.put("app/credit/mtg-rng-application/{facility}/REFURBISHMENT", r1Var.N3);
        builderBuilderWithExpectedSize.put("app/credit/notify-me", r1Var.O3);
        builderBuilderWithExpectedSize.put("app/credit/mtg/property-valuators", r1Var.P3);
        builderBuilderWithExpectedSize.put("app/credit/cc-bcm-application", r1Var.Q3);
        builderBuilderWithExpectedSize.put("app/credit/fcc/invitation/{invitation}/decline", r1Var.R3);
        builderBuilderWithExpectedSize.put("app/credit/ne-ci-ftc-application", r1Var.S3);
        builderBuilderWithExpectedSize.put("app/credit/{product}-application/{application}/cancel", r1Var.T3);
        builderBuilderWithExpectedSize.put("app/credit/{product}-application/{application}/akahu-callback", r1Var.U3);
        builderBuilderWithExpectedSize.put("app/credit-retail", r1Var.V3);
        builderBuilderWithExpectedSize.put("app/feature/crypto", r1Var.W3);
        builderBuilderWithExpectedSize.put("app/crypto", r1Var.X3);
        builderBuilderWithExpectedSize.put("app/trading/crypto", r1Var.Y3);
        builderBuilderWithExpectedSize.put("app/revolut-pro", r1Var.Z3);
        builderBuilderWithExpectedSize.put("app/signin", r1Var.f198114a4);
        builderBuilderWithExpectedSize.put("app/email-authenticate", r1Var.b4);
        builderBuilderWithExpectedSize.put("app/sso", r1Var.f198127c4);
        builderBuilderWithExpectedSize.put("app/ads", r1Var.f198133d4);
        builderBuilderWithExpectedSize.put("app/rewards", r1Var.e4);
        builderBuilderWithExpectedSize.put("app/trading/stocks.*", r1Var.f4);
        builderBuilderWithExpectedSize.put("app/user-migration", r1Var.f198149g4);
        builderBuilderWithExpectedSize.put("app/qes-terms", r1Var.f198155h4);
        builderBuilderWithExpectedSize.put("app/form", r1Var.f198161i4);
        builderBuilderWithExpectedSize.put("app/app-form", r1Var.f198166j4);
        builderBuilderWithExpectedSize.put("app/budgeting", r1Var.f198173k4);
        builderBuilderWithExpectedSize.put("app/bug-report", r1Var.l4);
        builderBuilderWithExpectedSize.put("app/joint-accounts", r1Var.f198183m4);
        builderBuilderWithExpectedSize.put("app/topup-joint", r1Var.f198189n4);
        builderBuilderWithExpectedSize.put("app/topup-joint-method", r1Var.f198197o4);
        builderBuilderWithExpectedSize.put("app/alerts", r1Var.f198204p4);
        builderBuilderWithExpectedSize.put("app/watchlist", r1Var.f198212q4);
        builderBuilderWithExpectedSize.put("app/converter", r1Var.r4);
        builderBuilderWithExpectedSize.put("app/replace-terminated-card", r1Var.s4);
        builderBuilderWithExpectedSize.put("app/revolut-pay/cash-reward", r1Var.f198232t4);
        builderBuilderWithExpectedSize.put("app/revolut-pay", r1Var.f198237u4);
        builderBuilderWithExpectedSize.put("app/revpay-upcoming-transaction", r1Var.v4);
        builderBuilderWithExpectedSize.put("app/revpay-native", r1Var.f198247w4);
        builderBuilderWithExpectedSize.put("app/revolut-pay/topup", r1Var.f198253x4);
        builderBuilderWithExpectedSize.put("app/payments-revolut-pay-oauth-authorization", r1Var.f198259y4);
        builderBuilderWithExpectedSize.put("app/revolut-pay/join", r1Var.z4);
        builderBuilderWithExpectedSize.put("app/revolut-pay/article-loyalty", r1Var.A4);
        builderBuilderWithExpectedSize.put("app/revolut-pay/featured-merchants", r1Var.B4);
        builderBuilderWithExpectedSize.put("app/statement", r1Var.C4);
        builderBuilderWithExpectedSize.put("app/documents/consolidated-tax-hub", r1Var.D4);
        builderBuilderWithExpectedSize.put("app/transaction-confirmation", r1Var.E4);
        builderBuilderWithExpectedSize.put("app/transfer/revert", r1Var.F4);
        builderBuilderWithExpectedSize.put("app/cash-deposit-eu", r1Var.G4);
        builderBuilderWithExpectedSize.put("app/cash-deposit/report-issue", r1Var.H4);
        builderBuilderWithExpectedSize.put("app/block-merchant", r1Var.I4);
        builderBuilderWithExpectedSize.put("app/blocked-merchants", r1Var.J4);
        builderBuilderWithExpectedSize.put("app/cards", r1Var.K4);
        builderBuilderWithExpectedSize.put("app/trading/collections", r1Var.L4);
        builderBuilderWithExpectedSize.put("app/instruments/most-traded/crypto", r1Var.M4);
        builderBuilderWithExpectedSize.put("app/instruments/most-popular", r1Var.N4);
        builderBuilderWithExpectedSize.put("app/instruments/top-movers", r1Var.O4);
        builderBuilderWithExpectedSize.put("app/instruments/collection", r1Var.P4);
        builderBuilderWithExpectedSize.put("app/invest/transactions", r1Var.Q4);
        builderBuilderWithExpectedSize.put("app/trading/statements", r1Var.R4);
        builderBuilderWithExpectedSize.put("app/trading/screener", r1Var.S4);
        builderBuilderWithExpectedSize.put("app/hotels", r1Var.T4);
        builderBuilderWithExpectedSize.put("app/pending-transaction-info", r1Var.U4);
        builderBuilderWithExpectedSize.put("app/revert-pending-transaction", r1Var.V4);
        builderBuilderWithExpectedSize.put("app/robo", r1Var.W4);
        builderBuilderWithExpectedSize.put("app/trading/invest", r1Var.X4);
        builderBuilderWithExpectedSize.put("app/trading/stock-lending", r1Var.Y4);
        builderBuilderWithExpectedSize.put("app/workflows", r1Var.Z4);
        builderBuilderWithExpectedSize.put("app/relaunch", r1Var.f198115a5);
        builderBuilderWithExpectedSize.put("app/information-request", r1Var.b5);
        builderBuilderWithExpectedSize.put("app/adoption-journey", r1Var.c5);
        builderBuilderWithExpectedSize.put("app/user-checklist", r1Var.d5);
        builderBuilderWithExpectedSize.put("app/kyc", r1Var.e5);
        builderBuilderWithExpectedSize.put("app/qes", r1Var.f5);
        builderBuilderWithExpectedSize.put("app/trading/transfer-out", r1Var.g5);
        builderBuilderWithExpectedSize.put("app/trading/transfer", r1Var.f198156h5);
        builderBuilderWithExpectedSize.put("app/institution-auth-relink", r1Var.i5);
        builderBuilderWithExpectedSize.put("app/open-banking-show-consent", r1Var.j5);
        builderBuilderWithExpectedSize.put("app/one-off-topup-institution-auth", r1Var.k5);
        builderBuilderWithExpectedSize.put("app/topup-institution-auth", r1Var.l5);
        builderBuilderWithExpectedSize.put("app/linked-accounts", r1Var.m5);
        builderBuilderWithExpectedSize.put("app/openbanking", r1Var.f198190n5);
        builderBuilderWithExpectedSize.put("app/institution-auth-egiro", r1Var.f198198o5);
        builderBuilderWithExpectedSize.put("app/topup", r1Var.f198205p5);
        builderBuilderWithExpectedSize.put("app/topup-direct-link", r1Var.q5);
        builderBuilderWithExpectedSize.put("app/topup-plaid", r1Var.f198219r5);
        builderBuilderWithExpectedSize.put("app/institution-selection", r1Var.f198226s5);
        builderBuilderWithExpectedSize.put("app/institution-auth", r1Var.t5);
        builderBuilderWithExpectedSize.put("app/penny-institution-auth", r1Var.u5);
        builderBuilderWithExpectedSize.put("app/institution-auth-akahu", r1Var.v5);
        builderBuilderWithExpectedSize.put("app/car-insurance", r1Var.w5);
        builderBuilderWithExpectedSize.put("app/credit/loan/{loan}/insurance", r1Var.x5);
        builderBuilderWithExpectedSize.put("app/insurance", r1Var.y5);
        builderBuilderWithExpectedSize.put("app/insurance/{insurance_type}", r1Var.f198265z5);
        builderBuilderWithExpectedSize.put("app/apm-area", r1Var.A5);
        builderBuilderWithExpectedSize.put("app/apm-payment-area", r1Var.B5);
        builderBuilderWithExpectedSize.put("app/apm-chat", r1Var.C5);
        builderBuilderWithExpectedSize.put("app/apm-consent", r1Var.D5);
        builderBuilderWithExpectedSize.put("app/apm-verify-ownership", r1Var.E5);
        builderBuilderWithExpectedSize.put("app/apm-money-request", r1Var.F5);
        builderBuilderWithExpectedSize.put("app/topup-requests", r1Var.G5);
        builderBuilderWithExpectedSize.put("app/open-banking-auth-ideal", r1Var.H5);
        builderBuilderWithExpectedSize.put("app/iris", r1Var.I5);
        builderBuilderWithExpectedSize.put("app/mbway", r1Var.J5);
        builderBuilderWithExpectedSize.put("app/qvik", r1Var.K5);
        builderBuilderWithExpectedSize.put("app/wero", r1Var.L5);
        builderBuilderWithExpectedSize.put("app/upi", r1Var.M5);
        builderBuilderWithExpectedSize.put("app/transport", r1Var.N5);
        builderBuilderWithExpectedSize.put("app/credit/loan", r1Var.O5);
        builderBuilderWithExpectedSize.put("app/credit/cancellation-application", r1Var.P5);
        builderBuilderWithExpectedSize.put("app/vts/app-otp-verification", r1Var.Q5);
        builderBuilderWithExpectedSize.put("app/mdes/app-otp-verification", r1Var.R5);
        builderBuilderWithExpectedSize.put("app/auto-direct-deposit", r1Var.S5);
        builderBuilderWithExpectedSize.put("app/subaccounts", r1Var.T5);
        builderBuilderWithExpectedSize.put("app/past-transactions/card", r1Var.U5);
        builderBuilderWithExpectedSize.put("app/past-transactions/cards", r1Var.V5);
        builderBuilderWithExpectedSize.put("app/help/quick-action/dispute-transaction", r1Var.W5);
        builderBuilderWithExpectedSize.put("app/help/quick-action/cancel-transfer", r1Var.X5);
        builderBuilderWithExpectedSize.put("app/help/quick-action/view-card-pin", r1Var.Y5);
        builderBuilderWithExpectedSize.put("app/help/quick-action/help-with-card", r1Var.Z5);
        builderBuilderWithExpectedSize.put("app/price-plan-add-ons", r1Var.f198116a6);
        builderBuilderWithExpectedSize.put("app/legal-entity-learn-more", r1Var.f198123b6);
        builderBuilderWithExpectedSize.put("app/cfds", r1Var.c6);
        builderBuilderWithExpectedSize.put("app/home/widgets/interactive/enable", r1Var.d6);
        builderBuilderWithExpectedSize.put("app/incentives", r1Var.e6);
        builderBuilderWithExpectedSize.put("app/physical-card", r1Var.f6);
        builderBuilderWithExpectedSize.put("app/virtual-card", r1Var.g6);
        builderBuilderWithExpectedSize.put("app/physical-card-group", r1Var.f198157h6);
        builderBuilderWithExpectedSize.put("app/virtual-card-group", r1Var.i6);
        builderBuilderWithExpectedSize.put("app/virtual-card-revpoints", r1Var.f198167j6);
        builderBuilderWithExpectedSize.put("app/cards/card_id/delivery", r1Var.k6);
        builderBuilderWithExpectedSize.put("app/global-br-card", r1Var.f198178l6);
        builderBuilderWithExpectedSize.put("app/local-br-card", r1Var.m6);
        builderBuilderWithExpectedSize.put("app/physical-card-replacement-handler", r1Var.f198191n6);
        builderBuilderWithExpectedSize.put("app/open-wallet-app", r1Var.f198199o6);
        builderBuilderWithExpectedSize.put("app/standing-order-details", r1Var.f198206p6);
        builderBuilderWithExpectedSize.put("app/account-switching", r1Var.f198213q6);
        builderBuilderWithExpectedSize.put("app/terms", r1Var.f198220r6);
        builderBuilderWithExpectedSize.put("app/product-articles", r1Var.s6);
        builderBuilderWithExpectedSize.put("app/email-authenticate/post-onboarding-email-verification", r1Var.f198233t6);
        builderBuilderWithExpectedSize.put("app/esim", r1Var.f198238u6);
        builderBuilderWithExpectedSize.put("app/plan-gifting", r1Var.v6);
        builderBuilderWithExpectedSize.put("app/birthday-gifting", r1Var.w6);
        builderBuilderWithExpectedSize.put("app/monthly-draws", r1Var.f198254x6);
        builderBuilderWithExpectedSize.put("app/locate-inbound-transfer", r1Var.f198260y6);
        builderBuilderWithExpectedSize.put("app/in-store", r1Var.z6);
        builderBuilderWithExpectedSize.put("app/pix", r1Var.A6);
        builderBuilderWithExpectedSize.put("app/invest/global-markets/overview", r1Var.B6);
        builderBuilderWithExpectedSize.put("app/support/all-invites", r1Var.C6);
        builderBuilderWithExpectedSize.put("app/referral", r1Var.D6);
        builderBuilderWithExpectedSize.put("app/support/invite-details", r1Var.E6);
        builderBuilderWithExpectedSize.put("app/share", r1Var.F6);
        builderBuilderWithExpectedSize.put("app/trading/account-closure", r1Var.G6);
        builderBuilderWithExpectedSize.put("app/trading/account-closure/negative-balance", r1Var.H6);
        builderBuilderWithExpectedSize.put("app/private-markets", r1Var.I6);
        builderBuilderWithExpectedSize.put("app/language-settings", r1Var.J6);
        builderBuilderWithExpectedSize.put("app/income-sorters", r1Var.K6);
        builderBuilderWithExpectedSize.put("app/analytics", r1Var.L6);
        builderBuilderWithExpectedSize.put("app/total-wealth", r1Var.M6);
        builderBuilderWithExpectedSize.put("app/cards/cash-withdrawal-exception", r1Var.N6);
        builderBuilderWithExpectedSize.put("app/login", r1Var.O6);
        builderBuilderWithExpectedSize.put("app/signup", r1Var.P6);
        builderBuilderWithExpectedSize.put("app/challenges/qr", r1Var.Q6);
        builderBuilderWithExpectedSize.put("app/money-requests", r1Var.R6);
        builderBuilderWithExpectedSize.put("app/cryptocurrency-volatility", r1Var.S6);
        builderBuilderWithExpectedSize.put("app/stories", r1Var.T6);
        builderBuilderWithExpectedSize.put("app/stories/v2", r1Var.U6);
        builderBuilderWithExpectedSize.put("app/price-actions", r1Var.V6);
        builderBuilderWithExpectedSize.put("app/suspicious-transaction", r1Var.W6);
        builderBuilderWithExpectedSize.put("app/payments-qr-scan", r1Var.X6);
        builderBuilderWithExpectedSize.put("app/my-payment-profile", r1Var.Y6);
        builderBuilderWithExpectedSize.put("app/username-contact", r1Var.Z6);
        builderBuilderWithExpectedSize.put("app/payment-profiles", r1Var.a7);
        builderBuilderWithExpectedSize.put("app/p2p-transfer", r1Var.b7);
        builderBuilderWithExpectedSize.put("app/standing-orders", r1Var.c7);
        builderBuilderWithExpectedSize.put("app/subscriptions", r1Var.f198134d7);
        builderBuilderWithExpectedSize.put("app/scheduled-payments", r1Var.f198139e7);
        builderBuilderWithExpectedSize.put("app/bank-transfers", r1Var.f198144f7);
        builderBuilderWithExpectedSize.put("app/transfers", r1Var.f198150g7);
        builderBuilderWithExpectedSize.put("app/payments", r1Var.f198158h7);
        builderBuilderWithExpectedSize.put("app/request-money-list", r1Var.f198162i7);
        builderBuilderWithExpectedSize.put("app/send-money-list", r1Var.f198168j7);
        builderBuilderWithExpectedSize.put("app/request-payment", r1Var.f198174k7);
        builderBuilderWithExpectedSize.put("app/push-to-card", r1Var.f198179l7);
        builderBuilderWithExpectedSize.put("app/bank-accounts", r1Var.f198184m7);
        builderBuilderWithExpectedSize.put("app/contacts", r1Var.f198192n7);
        builderBuilderWithExpectedSize.put("app/pago-pa-option", r1Var.f198200o7);
        builderBuilderWithExpectedSize.put("app/accept-payment-link", r1Var.f198207p7);
        builderBuilderWithExpectedSize.put("app/payment-links", r1Var.f198214q7);
        builderBuilderWithExpectedSize.put("app/payment-chat", r1Var.f198221r7);
        builderBuilderWithExpectedSize.put("app/account", r1Var.f198227s7);
        builderBuilderWithExpectedSize.put("app/topup-bank-transfer", r1Var.t7);
        builderBuilderWithExpectedSize.put("app/topup-bank-transfer-ccy", r1Var.u7);
        builderBuilderWithExpectedSize.put("app/troubleshooting/cards", r1Var.v7);
        builderBuilderWithExpectedSize.put("app/block-future-payments", r1Var.w7);
        builderBuilderWithExpectedSize.put("app/workflow-chat", r1Var.x7);
        builderBuilderWithExpectedSize.put("app/crypto/competition", r1Var.f198261y7);
        builderBuilderWithExpectedSize.put("app/salary-account", r1Var.f198266z7);
        builderBuilderWithExpectedSize.put("app/salary-account/move-salary", r1Var.A7);
        builderBuilderWithExpectedSize.put("app/salary-switch", r1Var.B7);
        builderBuilderWithExpectedSize.put("app/tax-exemption", r1Var.C7);
        builderBuilderWithExpectedSize.put("app/pay-stamp-duty", r1Var.D7);
        builderBuilderWithExpectedSize.put("app/test", r1Var.E7);
        builderBuilderWithExpectedSize.put("app/checklist/step-details", r1Var.F7);
        builderBuilderWithExpectedSize.put("app/checklist/collection", r1Var.G7);
        builderBuilderWithExpectedSize.put("app/open-banking/brazil", r1Var.H7);
        builderBuilderWithExpectedSize.put("app/open-banking/brazil-handoff", r1Var.I7);
        builderBuilderWithExpectedSize.put("app/open-banking/pix-mandate-created", r1Var.J7);
        builderBuilderWithExpectedSize.put("app/pet-insurance", r1Var.K7);
        builderBuilderWithExpectedSize.put("app/card-verification-topup", r1Var.L7);
        builderBuilderWithExpectedSize.put("app/payto", r1Var.M7);
        builderBuilderWithExpectedSize.put("app/feedback", r1Var.N7);
        builderBuilderWithExpectedSize.put("app/set-checklist-reminder", r1Var.O7);
        builderBuilderWithExpectedSize.put("app/youth", r1Var.P7);
        builderBuilderWithExpectedSize.put("app/progression", r1Var.Q7);
        builderBuilderWithExpectedSize.put("app/feature/commodities", r1Var.R7);
        builderBuilderWithExpectedSize.put("app/trading/commodity", r1Var.S7);
        builderBuilderWithExpectedSize.put("app/crypto/deposit", r1Var.T7);
        builderBuilderWithExpectedSize.put("app/crypto/request", r1Var.U7);
        builderBuilderWithExpectedSize.put("app/crypto/direct-deposit", r1Var.V7);
        builderBuilderWithExpectedSize.put("app/crypto/withdraw", r1Var.W7);
        builderBuilderWithExpectedSize.put("app/crypto/send", r1Var.X7);
        builderBuilderWithExpectedSize.put("app/crypto/limits", r1Var.Y7);
        builderBuilderWithExpectedSize.put("app/feature/crypto/onboarding", r1Var.Z7);
        builderBuilderWithExpectedSize.put("app/crypto/disclaimer", r1Var.f198117a8);
        builderBuilderWithExpectedSize.put("app/crypto/tax", r1Var.f198124b8);
        builderBuilderWithExpectedSize.put("app/crypto/staking", r1Var.f198128c8);
        builderBuilderWithExpectedSize.put("app/crypto/spare-change", r1Var.f198135d8);
        builderBuilderWithExpectedSize.put("app/crypto/documents", r1Var.f198140e8);
        builderBuilderWithExpectedSize.put("app/crypto/strategies", r1Var.f198145f8);
        builderBuilderWithExpectedSize.put("app/crypto/exchange/fees", r1Var.f198151g8);
        builderBuilderWithExpectedSize.put("app/crypto/multi-network", r1Var.f198159h8);
        builderBuilderWithExpectedSize.put("app/crypto-exchange", r1Var.f198163i8);
        builderBuilderWithExpectedSize.put("app/credit/onboarding_pcw", r1Var.f198169j8);
        builderBuilderWithExpectedSize.put("app/credit/financial-difficulty", r1Var.f198175k8);
        builderBuilderWithExpectedSize.put("app/credit/forbearance-application/loan", r1Var.f198180l8);
        builderBuilderWithExpectedSize.put("app/credit/forbearance-application/loans", r1Var.m8);
        builderBuilderWithExpectedSize.put("app/credit/rc2ftc", r1Var.f198193n8);
        builderBuilderWithExpectedSize.put("app/home/accounts", r1Var.f198201o8);
        builderBuilderWithExpectedSize.put("app/home/account-switcher", r1Var.f198208p8);
        builderBuilderWithExpectedSize.put("app/home/theme-customisation", r1Var.f198215q8);
        builderBuilderWithExpectedSize.put("app/trading/trade", r1Var.f198222r8);
        builderBuilderWithExpectedSize.put("app/trading/portfolio-settings", r1Var.f198228s8);
        builderBuilderWithExpectedSize.put("app/trading", r1Var.f198234t8);
        builderBuilderWithExpectedSize.put("app/crypto/card-design-selection", r1Var.f198239u8);
        builderBuilderWithExpectedSize.put("app/crypto/physical-card-design-selection", r1Var.f198243v8);
        builderBuilderWithExpectedSize.put("app/crypto/newly-added", r1Var.f198248w8);
        builderBuilderWithExpectedSize.put("app/crypto/zerofeespromo", r1Var.f198255x8);
        builderBuilderWithExpectedSize.put("app/crypto/settings", r1Var.f198262y8);
        builderBuilderWithExpectedSize.put("app/credit/apply", r1Var.f198267z8);
        builderBuilderWithExpectedSize.put("app/lifestyle-prompts", r1Var.A8);
        builderBuilderWithExpectedSize.put("app/lifestyle", r1Var.B8);
        builderBuilderWithExpectedSize.put("app/rev-points", r1Var.C8);
        builderBuilderWithExpectedSize.put("app/exclusive-store", r1Var.D8);
        return new ami.a(builderBuilderWithExpectedSize.build());
    }

    private final Object g() {
        c51.e eVar = (c51.e) this.f8241c;
        int i = this.f8240b;
        switch (i) {
            case 0:
                return new ngi.c();
            case 1:
                return new com.revolut.feature.stories.navigation.a(((w3e.a) eVar.f21336b).a());
            case 2:
                return new p7k.e();
            case 3:
                return new q5a.b();
            case 4:
                return new h1a.a();
            case 5:
                return new w6k.a();
            case 6:
                return new ul3.c();
            case 7:
                return new upg.b();
            case 8:
                return new pwl.c();
            case 9:
                gte.a aVarB = eVar.f21338c.b();
                s.j(aVarB);
                return new bwe.a(aVarB);
            case 10:
                return new id9.b();
            case 11:
                return new y99.b();
            case 12:
                return new xc9.a();
            case 13:
                gte.a aVarB2 = eVar.f21338c.b();
                s.j(aVarB2);
                return new sw5.a(aVarB2);
            case 14:
                return new ji3.a();
            case 15:
                return new vwj.c();
            case 16:
                return new edj.b();
            case 17:
                return new gak.a();
            case 18:
                return new hte.b();
            case 19:
                return new bw3.c();
            case 20:
                ede.b bVar = eVar.d;
                return new jwl.a(new gde.d());
            case 21:
                return new sz4.e();
            case 22:
                return new nza.a();
            case 23:
                return new u0i.a();
            case 24:
                gte.a aVarB3 = eVar.f21338c.b();
                s.j(aVarB3);
                return new u0i.b(aVarB3);
            case 25:
                return new byh.b();
            case 26:
                return new nyc.a();
            case 27:
                o8g.a aVar = (o8g.a) eVar.e.f141752a.get();
                s.j(aVar);
                return aVar;
            case 28:
                return new vo5.a();
            case 29:
                return new nz9.f();
            case 30:
                return new d9i.d();
            case 31:
                return new v96.a();
            case 32:
                gte.a aVarB4 = eVar.f21338c.b();
                s.j(aVarB4);
                return new com.revolut.feature.kyc.impl.a(aVarB4);
            case 33:
                gte.a aVarB5 = eVar.f21338c.b();
                s.j(aVarB5);
                return new sz2.c(aVarB5);
            case 34:
                return new na6.c();
            case 35:
                return new c73.g();
            case 36:
                return new cv2.a();
            case 37:
                gte.a aVarB6 = eVar.f21338c.b();
                s.j(aVarB6);
                return new ax2.b(aVarB6, 2);
            case 38:
                gte.a aVarB7 = eVar.f21338c.b();
                s.j(aVarB7);
                return new o33.a(aVarB7);
            case 39:
                gte.a aVarB8 = eVar.f21338c.b();
                s.j(aVarB8);
                return new ax2.b(aVarB8, 0);
            case 40:
                return new oy2.a();
            case 41:
                return new nah.a();
            case 42:
                return new uah.b(eVar.f.I());
            case 43:
                return new qah.b();
            case 44:
                gte.a aVarB9 = eVar.f21338c.b();
                s.j(aVarB9);
                return new zae.e(aVarB9);
            case 45:
                return new ice.e();
            case 46:
                gte.a aVarB10 = eVar.f21338c.b();
                s.j(aVarB10);
                return new uf6.h(aVarB10);
            case 47:
                return new x8i.e();
            case 48:
                return new oqa.c();
            case 49:
                return new oqa.b();
            case 50:
                return new oqa.d();
            case 51:
                return new cx7.b();
            case 52:
                gte.a aVarB11 = eVar.f21338c.b();
                s.j(aVarB11);
                return new o4i.c(aVarB11, new o4i.a());
            case 53:
                gte.a aVarB12 = eVar.f21338c.b();
                s.j(aVarB12);
                return new ax2.b(aVarB12, 1);
            case 54:
                gte.a aVarB13 = eVar.f21338c.b();
                s.j(aVarB13);
                return new djg.c(aVarB13);
            case 55:
                return new t33.j();
            case 56:
                thf.m mVarG = eVar.f21341g.g();
                s.j(mVarG);
                return new rjf.g(mVarG);
            case 57:
                return new rwl.a();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        ca9.d dVar = (ca9.d) this.f8241c;
        int i = this.f8240b;
        switch (i) {
            case 0:
                hri.b bVar = dVar.f22559a;
                return new ifm.b();
            case 1:
                hri.b bVar2 = dVar.f22559a;
                return new iri.j();
            case 2:
                return new g0();
            case 3:
                return new y99.e0((y99.i) dVar.f22564j.get(), (y99.g) dVar.k.get(), (ifm.b) dVar.f22563h.get());
            case 4:
                ea9.a aVar = new ea9.a((y99.i) dVar.f22564j.get());
                aa9.b bVar3 = new aa9.b((y99.i) dVar.f22564j.get(), new z99.a());
                y99.i iVar = (y99.i) dVar.f22564j.get();
                fk3.b bVarB = dVar.f22561c.b();
                s.j(bVarB);
                ba9.a aVar2 = new ba9.a(iVar, bVarB);
                yme.a aVarA = dVar.d.a();
                s.j(aVarA);
                y99.i iVar2 = (y99.i) dVar.f22564j.get();
                ang.f fVarE = dVar.e.e();
                t70.g gVarO = dVar.f22560b.o();
                s.j(gVarO);
                return new y99.o(aVar, bVar3, aVar2, aVarA, iVar2, fVarE, gVarO, dVar.f.a(), (ifm.b) dVar.f22563h.get());
            case 5:
                return new ln.c();
            case 6:
                return new cn.e();
            case 7:
                return new um.c();
            case 8:
                dVar.getClass();
                return new h(ImmutableSet.copyOf((Collection) hn.f.a()));
            case 9:
                return new ym.d();
            case 10:
                return new mm.d();
            case 11:
                return new sm.e();
            case 12:
                return new om.c();
            case 13:
                return new wm.a();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        cad.a aVar = (cad.a) this.f8241c;
        int i = this.f8240b;
        if (i == 0) {
            return new fad.g(aVar.f22598a, new fad.j(new had.b(), new had.c(), (f01.a) aVar.f22600c.get()));
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        com.revolut.kompot.navigable.a screen = (com.revolut.kompot.navigable.a) aVar.f22599b.get();
        gad.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new f01.c(screen.m2());
    }

    @Override // phm.a
    public final Object get() {
        Object cVar;
        Object modelsProvider;
        Object aVar;
        Object bVar;
        switch (this.f8239a) {
            case 0:
                f fVar = (f) this.f8241c;
                b bVar2 = fVar.f8243b;
                int i = this.f8240b;
                if (i == 0) {
                    Object extension = (jq1.a) fVar.f8244c.get();
                    dq1.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(extension, "extension");
                    yji.n nVar = (yji.n) extension;
                    s.k(nVar);
                    return nVar;
                }
                if (i == 1) {
                    wo1.b bVarB = ((up1.e) bVar2.f8232a).b();
                    s.j(bVarB);
                    return new jq1.e(new zjh.j(bVarB), new yp1.b(), new yp1.a());
                }
                if (i != 2) {
                    throw new AssertionError(i);
                }
                wo1.b bVarB2 = ((up1.e) bVar2.f8232a).b();
                s.j(bVarB2);
                zjh.j jVar = new zjh.j(bVarB2);
                jq1.a aVar2 = (jq1.a) fVar.f8244c.get();
                gq1.b formItemMapper = new gq1.b();
                Intrinsics.checkNotNullParameter(formItemMapper, "formItemMapper");
                return new l(jVar, aVar2, new gq1.n(), fVar.f8242a);
            case 1:
                at6.a aVar3 = (at6.a) this.f8241c;
                ee0.a aVar4 = aVar3.f9001b;
                int i2 = this.f8240b;
                if (i2 == 0) {
                    return new x1((FreelancerPricingPlanService) aVar3.d.get(), (j) aVar3.e.get(), (ue0.c) aVar3.f.get(), new ft6.o());
                }
                if (i2 == 1) {
                    FreelancerPricingPlanService freelancerPricingPlanService = (FreelancerPricingPlanService) v0.a.f((c21.b) aVar3.f9000a, "retrofit", FreelancerPricingPlanService.class, "create(...)");
                    s.k(freelancerPricingPlanService);
                    return freelancerPricingPlanService;
                }
                if (i2 == 2) {
                    return new ne0.d();
                }
                if (i2 != 3) {
                    throw new AssertionError(i2);
                }
                je0.d mapper = aVar4.b();
                s.j(mapper);
                yk0.a databaseSessionProvider = aVar3.f9002c.b();
                s.j(databaseSessionProvider);
                xe0.f storageFactory = aVar4.f();
                s.j(storageFactory);
                at6.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.f(storageFactory, databaseSessionProvider, "freelancer_pricing", mapper, 1, f0.f322471a, 32);
            case 2:
                int i3 = this.f8240b;
                if (i3 == 0) {
                    return new mx4.k(((ax4.e) this.f8241c).f10866a);
                }
                if (i3 == 1) {
                    return new lx4.a();
                }
                throw new AssertionError(i3);
            case 3:
                ay7.b bVar3 = (ay7.b) this.f8241c;
                int i5 = this.f8240b;
                switch (i5) {
                    case 0:
                        hri.b bVar4 = bVar3.f11091a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar5 = bVar3.f11091a;
                        return new iri.j();
                    case 2:
                        return new zx7.s();
                    case 3:
                        return new om.c();
                    case 4:
                        return new cn.e();
                    case 5:
                        return new um.c();
                    case 6:
                        bVar3.getClass();
                        return new h(ImmutableSet.copyOf((Collection) hn.f.a()));
                    case 7:
                        return new ln.c();
                    case 8:
                        return new ym.d();
                    case 9:
                        return new mm.d();
                    case 10:
                        g3l.a aVar5 = (g3l.a) bVar3.o.get();
                        t tVarA = bVar3.a();
                        fx7.f fVarB = bVar3.f11093c.b();
                        s.j(fVarB);
                        cVar = new zx7.c(aVar5, tVarA, fVarB, (zx7.l) bVar3.f11094g.get(), (ln.a) bVar3.f11097l.get());
                        break;
                    case 11:
                        return new g3l.g();
                    case 12:
                        e4m.e eVar = bVar3.o;
                        ex7.a aVar6 = bVar3.f11093c;
                        g3l.a aVar7 = (g3l.a) eVar.get();
                        fx7.f fVarB2 = aVar6.b();
                        s.j(fVarB2);
                        fx7.l lVarD = aVar6.d();
                        s.j(lVarD);
                        return new dy7.c(aVar7, fVarB2, lVarD, (zx7.l) bVar3.f11094g.get(), (ln.a) bVar3.f11097l.get(), bVar3.a());
                    case 13:
                        wm.e eVar2 = (wm.e) bVar3.f11102r.get();
                        t tVarA2 = bVar3.a();
                        fx7.f fVarB3 = bVar3.f11093c.b();
                        s.j(fVarB3);
                        cVar = new f08.m(eVar2, tVarA2, fVarB3, (f08.c) bVar3.f11094g.get(), (g3l.a) bVar3.o.get(), (ln.a) bVar3.f11097l.get());
                        break;
                    case 14:
                        return new wm.a();
                    case 15:
                        return new sm.e();
                    case 16:
                        ifm.b bVar6 = (ifm.b) bVar3.e.get();
                        zx7.l lVar = (zx7.l) bVar3.f11094g.get();
                        fx7.f fVarB4 = bVar3.f11093c.b();
                        s.j(fVarB4);
                        return new q(bVar6, lVar, fVarB4);
                    case 17:
                        return new r((ln.a) bVar3.f11097l.get());
                    default:
                        throw new AssertionError(i5);
                }
                return cVar;
            case 4:
                b05.e eVar3 = (b05.e) this.f8241c;
                int i6 = this.f8240b;
                switch (i6) {
                    case 0:
                        hri.b bVar7 = eVar3.f11590a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar8 = eVar3.f11590a;
                        return new iri.j();
                    case 2:
                        return new cn.e();
                    case 3:
                        return new um.c();
                    case 4:
                        eVar3.getClass();
                        modelsProvider = new h(ImmutableSet.copyOf((Collection) hn.f.a()));
                        return modelsProvider;
                    case 5:
                        return new ln.c();
                    case 6:
                        eVar3.getClass();
                        modelsProvider = new a05.d(new qc0.g1(new com.revolut.feature.chooser.e(), new tc0.c(), new onh.b(new BackendFlowSnapshotsCompressor())));
                        return modelsProvider;
                    case 7:
                        e4m.e eVar4 = eVar3.W;
                        l70.e eVar5 = eVar3.f11592b;
                        r54.f fVar2 = eVar3.e;
                        c05.c cVar2 = (c05.c) eVar4.get();
                        qc0.k kVar = (qc0.k) eVar3.f11611s.get();
                        dcl.q qVar = new dcl.q(new aa0.i(), qw7.u.j(fVar2));
                        am2.a aVarA = eVar3.f11597g.a();
                        t70.b bVarG = eVar5.g();
                        s.j(bVarG);
                        mm.d dVar = (mm.d) eVar3.X.get();
                        xl2.f fVarJ = qw7.u.j(fVar2);
                        x xVarD = ((s41.a) eVar3.f11598h).d();
                        s70.a aVarM = eVar5.m();
                        s.j(aVarM);
                        return new a05.c(cVar2, kVar, qVar, aVarA, bVarG, dVar, fVarJ, xVarD, aVarM, (yc0.a) eVar3.Y.get());
                    case 8:
                        qc0.k kVar2 = (qc0.k) eVar3.f11611s.get();
                        wl2.f fVar3 = (wl2.f) eVar3.f11612t.get();
                        ifm.b bVar9 = (ifm.b) eVar3.f11603m.get();
                        com.revolut.feature.chooser.a aVar8 = new com.revolut.feature.chooser.a((com.revolut.feature.chooser.d) eVar3.u.get(), (qi3.o) eVar3.v.get());
                        yc0.k kVar3 = (yc0.k) eVar3.f11613w.get();
                        aa0.f0 f0Var = (aa0.f0) eVar3.f11614x.get();
                        w80.b bVarJ = eVar3.f11592b.j();
                        s.j(bVarJ);
                        aa0.z zVar = new aa0.z(bVarJ);
                        aa0.b bVar10 = (aa0.b) eVar3.f11615y.get();
                        c0 c0Var = (c0) eVar3.z.get();
                        k0 k0Var = (k0) eVar3.A.get();
                        aa0.i0 i0Var = new aa0.i0();
                        b0 b0Var = (b0) eVar3.D.get();
                        aa0.h hVar = (aa0.h) eVar3.E.get();
                        aa0.n nVar2 = (aa0.n) eVar3.F.get();
                        aa0.d dVar2 = (aa0.d) eVar3.G.get();
                        p pVar = (p) eVar3.H.get();
                        aa0.l lVar2 = (aa0.l) eVar3.I.get();
                        aa0.m mVar = (aa0.m) eVar3.J.get();
                        a0 a0Var = (a0) eVar3.K.get();
                        i1 i1Var = (i1) eVar3.L.get();
                        l0 l0Var = (l0) eVar3.M.get();
                        aa0.e0 e0Var = (aa0.e0) eVar3.N.get();
                        j0 j0Var = (j0) eVar3.O.get();
                        aa0.j jVar2 = new aa0.j();
                        aa0.t tVar = new aa0.t();
                        dcl.q qVar2 = new dcl.q(new aa0.i(), qw7.u.j(eVar3.e));
                        aa0.s sVar = new aa0.s((ad0.a) eVar3.P.get(), 1);
                        aa0.f fVar4 = new aa0.f();
                        aa0.g gVar = new aa0.g();
                        aa0.u uVar = new aa0.u();
                        aa0.g0 g0Var = new aa0.g0();
                        aa0.q qVar3 = new aa0.q((ad0.a) eVar3.P.get());
                        aa0.s sVar2 = new aa0.s((ad0.a) eVar3.P.get(), 0);
                        aa0.k kVar4 = new aa0.k();
                        aa0.a aVar9 = new aa0.a();
                        d0 d0Var = new d0();
                        t tVarD = eVar3.d();
                        eli.j jVarA = eVar3.f.a();
                        ca0.a aVar10 = new ca0.a();
                        bd0.d dVar3 = (bd0.d) eVar3.R.get();
                        yc0.f fVar5 = (yc0.f) eVar3.U.get();
                        ad0.a aVar11 = (ad0.a) eVar3.P.get();
                        aa0.o oVar = new aa0.o();
                        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(6);
                        builderBuilderWithExpectedSize.put(ExternalValidation.class, new ed0.d((wl2.a) eVar3.V.get()));
                        builderBuilderWithExpectedSize.put(MaxLengthValidation.class, new ed0.f());
                        builderBuilderWithExpectedSize.put(MinLengthValidation.class, new ed0.h());
                        builderBuilderWithExpectedSize.put(RegexValidation.class, new ed0.i((zzl.b) eVar3.B.get()));
                        builderBuilderWithExpectedSize.put(MinAmountValidation.class, new ed0.g());
                        builderBuilderWithExpectedSize.put(MaxAmountValidation.class, new ed0.e());
                        modelsProvider = new a05.b(new qc0.j0(kVar2, fVar3, bVar9, aVar8, kVar3, f0Var, zVar, bVar10, c0Var, k0Var, i0Var, b0Var, hVar, nVar2, dVar2, pVar, lVar2, mVar, a0Var, i1Var, l0Var, e0Var, j0Var, jVar2, tVar, qVar2, sVar, fVar4, gVar, uVar, g0Var, qVar3, sVar2, kVar4, aVar9, d0Var, tVarD, jVarA, aVar10, dVar3, fVar5, aVar11, oVar, new dd0.c(builderBuilderWithExpectedSize.build()), new cd0.d()), (b0) eVar3.D.get());
                        return modelsProvider;
                    case 9:
                        rz4.b interactor = (rz4.b) eVar3.f11594c.f250354s.get();
                        s.j(interactor);
                        b80.c connectivityRepository = eVar3.f11592b.p();
                        s.j(connectivityRepository);
                        b05.f.Companion.getClass();
                        Intrinsics.checkNotNullParameter(interactor, "interactor");
                        Intrinsics.checkNotNullParameter(connectivityRepository, "connectivityRepository");
                        aVar = new b1e.a(interactor, connectivityRepository);
                        return aVar;
                    case 10:
                        x90.c cVar3 = eVar3.d;
                        qc0.k state = (qc0.k) eVar3.f11611s.get();
                        Intrinsics.checkNotNullParameter(state, "state");
                        s.k(state);
                        return state;
                    case 11:
                        x90.c cVar4 = eVar3.d;
                        modelsProvider = new qi3.b((com.revolut.feature.chooser.d) eVar3.u.get());
                        Intrinsics.checkNotNullParameter(modelsProvider, "modelsProvider");
                        return modelsProvider;
                    case 12:
                        x90.c cVar5 = eVar3.d;
                        l80.e eVarH = eVar3.f11592b.h();
                        s.j(eVarH);
                        return v.l(cVar5, eVarH);
                    case 13:
                        x90.c cVar6 = eVar3.d;
                        return new aa0.f0();
                    case 14:
                        x90.c cVar7 = eVar3.d;
                        return new aa0.b();
                    case 15:
                        x90.c cVar8 = eVar3.d;
                        return new c0();
                    case 16:
                        x90.c cVar9 = eVar3.d;
                        return new k0();
                    case 17:
                        x90.c cVar10 = eVar3.d;
                        z80.b bVarS = eVar3.f11592b.s();
                        s.j(bVarS);
                        return v.g(cVar10, bVarS, (y) eVar3.C.get());
                    case 18:
                        return v.i(eVar3.d, (zzl.b) eVar3.B.get());
                    case 19:
                        b05.f.Companion.getClass();
                        return new zzl.c();
                    case 20:
                        x90.c cVar11 = eVar3.d;
                        return new aa0.h();
                    case 21:
                        x90.c cVar12 = eVar3.d;
                        return new aa0.n();
                    case 22:
                        return v.h(eVar3.d, (y) eVar3.C.get());
                    case 23:
                        x90.c cVar13 = eVar3.d;
                        return new p();
                    case 24:
                        x90.c cVar14 = eVar3.d;
                        return new aa0.l();
                    case 25:
                        x90.c cVar15 = eVar3.d;
                        return new aa0.m();
                    case 26:
                        x90.c cVar16 = eVar3.d;
                        return new a0();
                    case 27:
                        x90.c cVar17 = eVar3.d;
                        return new i1();
                    case 28:
                        x90.c cVar18 = eVar3.d;
                        return new l0();
                    case 29:
                        x90.c cVar19 = eVar3.d;
                        return new aa0.e0();
                    case 30:
                        x90.c cVar20 = eVar3.d;
                        return new j0();
                    case 31:
                        x90.c cVar21 = eVar3.d;
                        return new ad0.b();
                    case 32:
                        return new ym.d();
                    case 33:
                        x90.c cVar22 = eVar3.d;
                        return new bd0.e();
                    case 34:
                        return v.s(eVar3.d, (yc0.b0) eVar3.T.get());
                    case 35:
                        return v.u(eVar3.d, (qc0.k) eVar3.f11611s.get(), new smd.s((la0.c) eVar3.S.get()));
                    case 36:
                        return v.e(eVar3.d, (qc0.k) eVar3.f11611s.get());
                    case 37:
                        x90.c cVar23 = eVar3.d;
                        modelsProvider = new aa0.w((wl2.f) eVar3.f11612t.get(), eVar3.f11597g.b());
                        Intrinsics.checkNotNullParameter(modelsProvider, "legacyBackendFlowAdapterInteractor");
                        return modelsProvider;
                    case 38:
                        return new mm.d();
                    case 39:
                        return v.c(eVar3.d, (yc0.b0) eVar3.T.get());
                    case 40:
                        aVar = new vc0.a((qc0.j) eVar3.Z.get(), (qc0.k) eVar3.f11611s.get(), (ln.a) eVar3.f11609r.get(), qw7.u.j(eVar3.e), (mm.d) eVar3.X.get(), eVar3.d());
                        return aVar;
                    case 41:
                        modelsProvider = new vc0.b((ln.a) eVar3.f11609r.get());
                        return modelsProvider;
                    case 42:
                        aVar = new vc0.c((qc0.k) eVar3.f11611s.get(), (qc0.j) eVar3.Z.get(), (wl2.f) eVar3.f11612t.get(), eVar3.f.a(), new ca0.a(), eVar3.d());
                        return aVar;
                    case 43:
                        x90.c cVar24 = eVar3.d;
                        qc0.j router = (qc0.j) eVar3.Z.get();
                        Intrinsics.checkNotNullParameter(router, "router");
                        s.k(router);
                        return router;
                    case 44:
                        return new sm.e();
                    case 45:
                        return new om.c();
                    case 46:
                        return new g3l.g();
                    case 47:
                        return new an.a();
                    case 48:
                        return new d4l.a();
                    case 49:
                        x90.c cVar25 = eVar3.d;
                        qc0.h state2 = (qc0.h) eVar3.W.get();
                        Intrinsics.checkNotNullParameter(state2, "state");
                        s.k(state2);
                        return state2;
                    case 50:
                        b05.f.Companion.getClass();
                        return new t80.c(new e.a("ForbearanceApplication"), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE);
                    case 51:
                        return v.d(eVar3.d, (qc0.k) eVar3.f11611s.get(), (la0.c) eVar3.S.get(), ImmutableMap.of(WidgetProgressionItem.class, new z90.b()));
                    case 52:
                        Context context = eVar3.i;
                        b05.f.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        modelsProvider = new p80.a(context);
                        return modelsProvider;
                    case 53:
                        return v.t(eVar3.d, (bd0.d) eVar3.R.get());
                    case 54:
                        x90.c cVar26 = eVar3.d;
                        z70.a aVarF = eVar3.f11592b.f();
                        s.j(aVarF);
                        return v.p(cVar26, aVarF);
                    case 55:
                        x90.c cVar27 = eVar3.d;
                        return new yc0.w();
                    case 56:
                        x90.c cVar28 = eVar3.d;
                        qc0.j router2 = (qc0.j) eVar3.Z.get();
                        Intrinsics.checkNotNullParameter(router2, "router");
                        s.k(router2);
                        return router2;
                    case 57:
                        x90.c cVar29 = eVar3.d;
                        qc0.h state3 = (qc0.h) eVar3.W.get();
                        Intrinsics.checkNotNullParameter(state3, "state");
                        s.k(state3);
                        return state3;
                    default:
                        throw new AssertionError(i6);
                }
            case 5:
                b1l.b bVar11 = (b1l.b) this.f8241c;
                int i21 = this.f8240b;
                switch (i21) {
                    case 0:
                        hri.b bVar12 = bVar11.f11825a;
                        return new ifm.b();
                    case 1:
                        hri.b bVar13 = bVar11.f11825a;
                        return new iri.j();
                    case 2:
                        return new y0l.h();
                    case 3:
                        return new ln.c();
                    case 4:
                        return new cn.e();
                    case 5:
                        return new um.c();
                    case 6:
                        bVar11.getClass();
                        return new h(ImmutableSet.copyOf((Collection) hn.f.a()));
                    case 7:
                        g3l.a aVar12 = (g3l.a) bVar11.f11834p.get();
                        sf0.h hVarB = bVar11.f11827c.b();
                        s.j(hVarB);
                        v60.e eVarA = bVar11.d.a();
                        s.j(eVarA);
                        return new vxk.e(aVar12, hVarB, eVarA, (ln.a) bVar11.f11831l.get());
                    case 8:
                        return new g3l.g();
                    case 9:
                        return new ym.d();
                    case 10:
                        return new mm.d();
                    case 11:
                        return new vxk.b((ln.a) bVar11.f11831l.get(), bVar11.h(), bVar11.a());
                    case 12:
                        return new vxk.b(bVar11.h(), (ln.a) bVar11.f11831l.get(), bVar11.a());
                    case 13:
                        return new sm.e();
                    case 14:
                        return new om.c();
                    case 15:
                        return new y0l.g((mm.d) bVar11.f11837s.get(), (ln.a) bVar11.f11831l.get());
                    case 16:
                        return new y0l.f((y0l.c) bVar11.k.get());
                    default:
                        throw new AssertionError(i21);
                }
            case 6:
                b3j.w wVar = (b3j.w) this.f8241c;
                b3j.t tVar2 = wVar.f12115b;
                int i22 = this.f8240b;
                switch (i22) {
                    case 0:
                        n60.a aVar13 = (n60.a) wVar.d.get();
                        o5k.i.l(aVar13);
                        return aVar13;
                    case 1:
                        return o5k.i.q((com.revolut.kompot.navigable.a) wVar.f12116c.get());
                    case 2:
                        Object extension2 = (g4j.a) wVar.f.get();
                        o4j.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(extension2, "extension");
                        yji.n nVar3 = (yji.n) extension2;
                        s.k(nVar3);
                        return nVar3;
                    case 3:
                        return new g4j.b(new h4j.b());
                    case 4:
                        z2j.c cVar30 = new z2j.c(new z2j.a());
                        d3j.b bVarE = ((b3j.p) tVar2.d).e();
                        n8b.b bVarB3 = tVar2.f12106r.b();
                        s.j(bVarB3);
                        return new com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.missing_fields.a(new n4j.i(cVar30, new n4j.f(bVarE, bVarB3), new p4j.b(new z2j.c(new z2j.a()), new s4j.a(), new n4j.c())), (ldd.b) wVar.f12118h.get(), new d5j.a(new s4j.a(), new zq.a(new usc.a((dnm.a) tVar2.v.get()), (zzl.b) tVar2.f12109w.get()), new n4j.c(), new n4j.j()), (g4j.a) wVar.f.get(), (n60.a) wVar.d.get(), wVar.f12114a, new ac4.g(new p4j.a(new q4j.a(new s4j.a(), (ldd.b) wVar.f12118h.get(), new q4j.b(), new ogm.i(new z2j.c(new z2j.a()), new q4j.c()), new nd.l(new q4j.c(), new n4j.c()), new nd.k(new q4j.c())), new p4j.b(new z2j.c(new z2j.a()), new s4j.a(), new n4j.c()), new p4j.c(new z2j.c(new z2j.a()), new s4j.a(), new n4j.c()), new m3j.o()), new n4j.a(new n4j.c())));
                    case 5:
                        ldd.a factory = new ldd.a();
                        e5j.b.Companion.getClass();
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        return new ldd.b();
                    case 6:
                        return new r4j.c(new z2j.k());
                    default:
                        throw new AssertionError(i22);
                }
            case 7:
                b3j.x xVar = (b3j.x) this.f8241c;
                int i32 = this.f8240b;
                if (i32 == 0) {
                    n60.a aVar14 = (n60.a) xVar.f12122c.get();
                    o5k.i.l(aVar14);
                    return aVar14;
                }
                if (i32 == 1) {
                    return o5k.i.q((com.revolut.kompot.navigable.a) xVar.f12121b.get());
                }
                if (i32 != 2) {
                    throw new AssertionError(i32);
                }
                n60.a aVar15 = (n60.a) xVar.f12122c.get();
                m4j.n searchDelegate = new m4j.n();
                m4j.a itemImageMapper = new m4j.a();
                Intrinsics.checkNotNullParameter(searchDelegate, "searchDelegate");
                Intrinsics.checkNotNullParameter(itemImageMapper, "itemImageMapper");
                return new m4j.k(aVar15, new m4j.m(), xVar.f12120a);
            case 8:
                b6b.d0 d0Var2 = (b6b.d0) this.f8241c;
                int i33 = this.f8240b;
                if (i33 != 0) {
                    if (i33 == 1) {
                        return new e7b.i();
                    }
                    throw new AssertionError(i33);
                }
                n nVar4 = (n) d0Var2.d.get();
                CobrandedCardsTypeSelectionScreenContract$InputData cobrandedCardsTypeSelectionScreenContract$InputData = d0Var2.f12574a;
                b6b.o oVar2 = d0Var2.f12575b;
                q5b.b bVarB4 = oVar2.f12651b.b();
                s.j(bVarB4);
                return new e7b.h(nVar4, cobrandedCardsTypeSelectionScreenContract$InputData, new r10.f(bVarB4, oVar2.e.a()));
            case 9:
                b6b.k0 k0Var2 = (b6b.k0) this.f8241c;
                int i43 = this.f8240b;
                if (i43 == 0) {
                    return new a8b.j((n) k0Var2.f12632c.get());
                }
                if (i43 == 1) {
                    return new a8b.l(k0Var2.f12630a, new c7b.a(k0Var2.f12631b.d.g(), 0));
                }
                throw new AssertionError(i43);
            case 10:
                b6b.l0 l0Var2 = (b6b.l0) this.f8241c;
                int i59 = this.f8240b;
                if (i59 == 0) {
                    return new a8b.j((n) l0Var2.d.get());
                }
                if (i59 == 1) {
                    return new a8b.l(l0Var2.f12636a, new c7b.a(l0Var2.f12637b.d.g(), 0));
                }
                throw new AssertionError(i59);
            case 11:
                n0 n0Var = (n0) this.f8241c;
                int i66 = this.f8240b;
                if (i66 == 0) {
                    return new e8b.a();
                }
                if (i66 != 1) {
                    throw new AssertionError(i66);
                }
                c6b.n nVar5 = (c6b.n) n0Var.f12647a.Q.get();
                s.j(nVar5);
                return new d8b.k(nVar5, new d8b.b(), new d8b.a(new c7b.a(n0Var.f12648b.g(), 0)));
            case 12:
                bfb.b bVar14 = (bfb.b) this.f8241c;
                a31.a aVar16 = bVar14.f14928g;
                ecm.q qVar4 = bVar14.f14925a;
                a31.a aVar17 = bVar14.f14932m;
                a31.a aVar18 = bVar14.e;
                a31.a aVar19 = bVar14.f;
                int i74 = this.f8240b;
                if (i74 == 0) {
                    return new dfb.i(qVar4, bVar14.f14926b, bVar14.f14927c, bVar14.d, aVar18, aVar19, aVar16, bVar14.f14929h, bVar14.i, bVar14.f14930j, bVar14.k, bVar14.f14937s, aVar17, bVar14.f14933n, bVar14.u, bVar14.f14935q);
                }
                if (i74 == 1) {
                    dfb.h hVar2 = (dfb.h) ((dfb.o) bVar14.f14936r.get()).b();
                    s.k(hVar2);
                    return hVar2;
                }
                if (i74 == 2) {
                    return new dfb.o(aVar16, bVar14.f14931l, qVar4);
                }
                if (i74 != 3) {
                    if (i74 == 4) {
                        return new dfb.j(aVar19, aVar18, aVar17, bVar14.o, bVar14.f14934p);
                    }
                    throw new AssertionError(i74);
                }
                dfb.f fVar6 = (dfb.f) ((dfb.j) bVar14.f14938t.get()).b();
                s.k(fVar6);
                return fVar6;
            case 13:
                blb.c cVar31 = (blb.c) this.f8241c;
                int i92 = this.f8240b;
                if (i92 == 0) {
                    return new alb.j((n) cVar31.f16499c.get(), cVar31.f16497a, new ykb.c(new zkb.b(new z70.c(cVar31.f16498b.k.a()))), new ykb.e());
                }
                if (i92 == 1) {
                    return new alb.m(new dcd.b());
                }
                throw new AssertionError(i92);
            case 14:
                bo9.a aVar20 = (bo9.a) this.f8241c;
                ee0.a aVar21 = aVar20.f17336b;
                int i96 = this.f8240b;
                switch (i96) {
                    case 0:
                        bVar = new co9.b((yn9.c) aVar20.f17339h.get(), (co9.a) aVar20.i.get());
                        break;
                    case 1:
                        Retrofit retrofit = ((nj0.d) aVar20.f17335a).f();
                        bo9.f.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Object objCreate = retrofit.create(PaymentCounterpartyService.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                        PaymentCounterpartyService paymentCounterpartyService = (PaymentCounterpartyService) objCreate;
                        s.k(paymentCounterpartyService);
                        bVar = new yn9.c(paymentCounterpartyService, (ue0.c) aVar20.f.get(), (j) aVar20.f17338g.get());
                        break;
                    case 2:
                        je0.d mapper2 = aVar21.b();
                        s.j(mapper2);
                        yk0.a databaseSessionProvider2 = aVar20.f17337c.b();
                        s.j(databaseSessionProvider2);
                        xe0.f storageFactory2 = aVar21.f();
                        s.j(storageFactory2);
                        bo9.f.Companion.getClass();
                        Intrinsics.checkNotNullParameter(mapper2, "mapper");
                        Intrinsics.checkNotNullParameter(databaseSessionProvider2, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(storageFactory2, "storageFactory");
                        return xe0.f.f(storageFactory2, databaseSessionProvider2, "counterparties", mapper2, 2, zhm.u.c(new vn9.a()), 32);
                    case 3:
                        return new ne0.d();
                    case 4:
                        uw1.c cVarD = ((lz1.m) aVar20.d).d();
                        s.j(cVarD);
                        vo1.c cVarA = ((up1.e) aVar20.e).a();
                        s.j(cVarA);
                        bVar = new co9.a(cVarD, cVarA);
                        break;
                    case 5:
                        return new do9.d(new do9.b());
                    case 6:
                        return new eo9.b();
                    default:
                        throw new AssertionError(i96);
                }
                return bVar;
            case 15:
                return a();
            case 16:
                bt7.a aVar22 = (bt7.a) this.f8241c;
                int i99 = this.f8240b;
                if (i99 == 0) {
                    return new gt7.d((n) aVar22.f18402b.get());
                }
                if (i99 == 1) {
                    return new gt7.f(aVar22.f18401a);
                }
                throw new AssertionError(i99);
            case 17:
                bt7.d dVar4 = (bt7.d) this.f8241c;
                int i100 = this.f8240b;
                if (i100 == 0) {
                    return new ot7.f((n) dVar4.f18411b.get());
                }
                if (i100 == 1) {
                    return new ot7.h(dVar4.f18410a);
                }
                throw new AssertionError(i100);
            case 18:
                int i101 = this.f8240b;
                if (i101 == 0) {
                    return new fth.i((jki.p) ((bth.c) this.f8241c).f18579a.get());
                }
                if (i101 == 1) {
                    return new fth.h();
                }
                throw new AssertionError(i101);
            case 19:
                c3d.b bVar15 = (c3d.b) this.f8241c;
                int i102 = this.f8240b;
                if (i102 != 0) {
                    if (i102 != 1) {
                        throw new AssertionError(i102);
                    }
                    Context context2 = bVar15.f20929a;
                    e3d.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(context2, "context");
                    return sri.o.c(context2, null, null, 14);
                }
                sri.m mVar2 = (sri.m) bVar15.d.get();
                xoj.a aVarA2 = bVar15.f20930b.a();
                s.j(aVarA2);
                gte.a aVarB = bVar15.f20931c.b();
                s.j(aVarB);
                return new b3d.c(mVar2, aVarA2, aVarB);
            case 20:
                c43.i iVar = (c43.i) this.f8241c;
                int i103 = this.f8240b;
                if (i103 == 0) {
                    return new p43.i(iVar.f21031a);
                }
                if (i103 == 1) {
                    return new p43.j((jki.p) iVar.f21032b.get());
                }
                throw new AssertionError(i103);
            case 21:
                return b();
            case 22:
                return c();
            case 23:
                return d();
            case 24:
                return e();
            case 25:
                return f();
            case 26:
                return g();
            case 27:
                return h();
            case 28:
                return i();
            default:
                cad.d dVar5 = (cad.d) this.f8241c;
                ee0.a aVar23 = dVar5.d;
                int i104 = this.f8240b;
                if (i104 == 0) {
                    ybh.c0 c0Var2 = new ybh.c0((InvoiceTemplateService) dVar5.f22606a.e.get());
                    zk0.b bVarL = dVar5.f22607b.l();
                    s.j(bVarL);
                    return new y9d.e(c0Var2, bVarL, (j) dVar5.f.get(), (ue0.c) dVar5.f22610h.get());
                }
                if (i104 == 1) {
                    return new ne0.d();
                }
                if (i104 != 2) {
                    if (i104 != 3) {
                        throw new AssertionError(i104);
                    }
                    le0.b gsonObjectMapperFactory = aVar23.c();
                    s.j(gsonObjectMapperFactory);
                    o gson = fe0.c.a();
                    cad.f.Companion.getClass();
                    Intrinsics.checkNotNullParameter(gsonObjectMapperFactory, "gsonObjectMapperFactory");
                    Intrinsics.checkNotNullParameter(gson, "gson");
                    return gsonObjectMapperFactory.a(new kg.p(gson).b());
                }
                yk0.a databaseSessionProvider3 = dVar5.f22608c.b();
                s.j(databaseSessionProvider3);
                je0.d objectMapper = (je0.d) dVar5.f22609g.get();
                xe0.f storageFactory3 = aVar23.f();
                s.j(storageFactory3);
                cad.f.Companion.getClass();
                Intrinsics.checkNotNullParameter(databaseSessionProvider3, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
                Intrinsics.checkNotNullParameter(storageFactory3, "storageFactory");
                return xe0.f.f(storageFactory3, databaseSessionProvider3, "storage_shared_invoices.pref", objectMapper, 2, zhm.u.c(new z9d.a()), 32);
        }
    }

    public /* synthetic */ e(Object obj2, xki.e eVar, int i, int i2) {
        this.f8239a = i2;
        this.f8241c = eVar;
        this.f8240b = i;
    }
}
