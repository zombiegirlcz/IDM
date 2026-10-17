package vh3;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements ph3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final onh.b f289302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final li0.b f289303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f73.c f289304c;
    public final mt8.a d;
    public final up3.a e;

    public c(onh.b postActivationStatusProvider, li0.b tapAndPayClient, f73.c revolutCardsNavigationFactory, mt8.a kycFeatureToggleProvider, up3.a creditCardPostRetailOnboardingInteractor) {
        Intrinsics.checkNotNullParameter(postActivationStatusProvider, "postActivationStatusProvider");
        Intrinsics.checkNotNullParameter(tapAndPayClient, "tapAndPayClient");
        Intrinsics.checkNotNullParameter(revolutCardsNavigationFactory, "revolutCardsNavigationFactory");
        Intrinsics.checkNotNullParameter(kycFeatureToggleProvider, "kycFeatureToggleProvider");
        Intrinsics.checkNotNullParameter(creditCardPostRetailOnboardingInteractor, "creditCardPostRetailOnboardingInteractor");
        this.f289302a = postActivationStatusProvider;
        this.f289303b = tapAndPayClient;
        this.f289304c = revolutCardsNavigationFactory;
        this.d = kycFeatureToggleProvider;
        this.e = creditCardPostRetailOnboardingInteractor;
    }

    public final FeatureCommand a() {
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, null, 6)));
    }

    public final CompositeCommand b(AccountId accountId, String cardId, String str, boolean z) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return this.f289304c.d(Intrinsics.f(cardId, "NO_ID") ? CardScreenAction.Idle.f65329a : new CardScreenAction.Select(cardId, 6, false, false), accountId, z, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(yt8.i r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof vh3.a
            if (r0 == 0) goto L13
            r0 = r6
            vh3.a r0 = (vh3.a) r0
            int r1 = r0.f289298w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f289298w = r1
            goto L18
        L13:
            vh3.a r0 = new vh3.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f289298w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f289298w = r3
            up3.a r6 = r4.e
            yq3.b r6 = (yq3.b) r6
            java.io.Serializable r6 = r6.a(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            dt3.d r6 = (dt3.d) r6
            if (r6 == 0) goto L4e
            com.revolut.retail.core.navigation.FeatureCommand r5 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig$CreditPostRetailOnboarding r0 = new com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig$CreditPostRetailOnboarding
            r0.<init>(r6)
            r5.<init>(r0)
            return r5
        L4e:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vh3.c.c(yt8.i, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(h93.f0 r10, yt8.i r11, com.revolut.analytics.tracking.v3.AnalyticsProduct r12, gim.c r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof vh3.b
            if (r0 == 0) goto L13
            r0 = r13
            vh3.b r0 = (vh3.b) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            vh3.b r0 = new vh3.b
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.f289300x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            com.revolut.analytics.tracking.v3.AnalyticsProduct r10 = r0.f289299w
            com.revolut.analytics.tracking.v3.AnalyticsProduct r10 = (com.revolut.analytics.tracking.v3.AnalyticsProduct) r10
            yt8.i r11 = r0.v
            h93.f0 r12 = r0.u
            yhm.o.b(r13)
            goto L80
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            com.revolut.analytics.tracking.v3.AnalyticsProduct r10 = r0.f289299w
            r12 = r10
            com.revolut.analytics.tracking.v3.AnalyticsProduct r12 = (com.revolut.analytics.tracking.v3.AnalyticsProduct) r12
            yt8.i r11 = r0.v
            h93.f0 r10 = r0.u
            yhm.o.b(r13)
            goto L65
        L47:
            yhm.o.b(r13)
            r0.u = r10
            r0.v = r11
            r13 = r12
            com.revolut.analytics.tracking.v3.AnalyticsProduct r13 = (com.revolut.analytics.tracking.v3.AnalyticsProduct) r13
            r0.f289299w = r13
            r0.z = r4
            onh.b r13 = r9.f289302a
            java.lang.Object r13 = r13.f226950b
            mfa.b r13 = (mfa.b) r13
            mfa.a r13 = r13.f204967a
            r2 = 0
            java.lang.Object r13 = r13.b(r2, r0)
            if (r13 != r1) goto L65
            goto L7c
        L65:
            gfa.a r13 = (gfa.a) r13
            boolean r13 = r13 instanceof gfa.a.f
            if (r13 == 0) goto L85
            r0.u = r10
            r0.v = r11
            r13 = r12
            com.revolut.analytics.tracking.v3.AnalyticsProduct r13 = (com.revolut.analytics.tracking.v3.AnalyticsProduct) r13
            r0.f289299w = r13
            r0.z = r3
            java.lang.Object r13 = r9.c(r11, r0)
            if (r13 != r1) goto L7d
        L7c:
            return r1
        L7d:
            r8 = r12
            r12 = r10
            r10 = r8
        L80:
            com.revolut.retail.core.navigation.NaviCommand r13 = (com.revolut.retail.core.navigation.NaviCommand) r13
            r5 = r10
            r1 = r12
            goto L88
        L85:
            r13 = 0
            r1 = r10
            r5 = r12
        L88:
            if (r13 != 0) goto Lbe
            boolean r10 = ngm.n.p(r11)
            if (r10 != 0) goto L95
            com.revolut.retail.core.navigation.FeatureCommand r10 = r9.a()
            return r10
        L95:
            com.revolut.retail.core.navigation.FeatureCommand r2 = r9.a()
            boolean r10 = r1.J()
            if (r10 == 0) goto Lbd
            li0.b r10 = r9.f289303b
            boolean r10 = cp5.c.j(r10)
            if (r10 == 0) goto Lbd
            boolean r10 = r1.w()
            if (r10 == 0) goto Lbd
            com.revolut.retail.core.navigation.FeatureCommand r10 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.card_add_to_googlepay.api.AddToGooglePayFeatureConfig r0 = new com.revolut.feature.card_add_to_googlepay.api.AddToGooglePayFeatureConfig
            r6 = 0
            r7 = 418(0x1a2, float:5.86E-43)
            r4 = 0
            r3 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r10.<init>(r0)
            return r10
        Lbd:
            return r2
        Lbe:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: vh3.c.d(h93.f0, yt8.i, com.revolut.analytics.tracking.v3.AnalyticsProduct, gim.c):java.lang.Object");
    }
}
