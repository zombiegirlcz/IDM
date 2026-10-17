package q97;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class c0 extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f243660b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f243661c;
    public final Object d;
    public final t97.d e;
    public final Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(t97.c productCellProvider, vpc.a salarySwitchInteractor, wsg.b walletInteractor, kbb.c accountDetailsInteractor) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(salarySwitchInteractor, "salarySwitchInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(accountDetailsInteractor, "accountDetailsInteractor");
        this.f = salarySwitchInteractor;
        this.f243661c = walletInteractor;
        this.d = accountDetailsInteractor;
        this.e = t97.d.TOPUP_SALARY_TOPUP;
    }

    @Override // r97.b
    public final Flow d() {
        switch (this.f243660b) {
            case 0:
                return cp5.d.h(new vkm.y(new n33.r0(mo3.a.g(rd0.e.n(((js7.d) this.f).e(grl.r2.GLOBAL_SEARCH), zhm.h0.f322473a), null, new q92.f(5), 1), 24), new otd.a(3, 15, null)), new pyc.a(this, 24));
            case 1:
                return cp5.d.h(new vkm.y(new n33.r0(mo3.a.g(rd0.e.n(((qx4.f) ((l35.a) this.f)).e(grl.r2.GLOBAL_SEARCH), zhm.h0.f322473a), null, new q92.f(14), 1), 28), new otd.a(3, 17, null)), new pyc.a(this, 25));
            case 2:
                return cp5.d.h(new vkm.y(mo3.a.g(rd0.e.n(((y45.n) this.f).d(), zhm.h0.f322473a), null, new q92.f(17), 1), new otd.a(3, 20, null)), new pyc.a(this, 28));
            case 3:
                return cp5.d.h(new vkm.y(mo3.a.h(rd0.e.n(((o95.g) this.f).f(grl.r2.GLOBAL_SEARCH), zhm.h0.f322473a), new pv7.t(18), new q92.f(21), 2), new otd.a(3, 22, null)), new p1(this, 0));
            case 4:
                return new vkm.v1(new l10.m(this, (Continuation) null, 13));
            default:
                return new tse.c(rd0.e.b(m70.a.g(((am2.a) this.d).a(), null, new u4i.u(14), 1)), this, 11);
        }
    }

    @Override // r97.b
    public final p97.b f() {
        switch (this.f243660b) {
        }
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // r97.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q97.c0.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(t97.c productCellProvider, u79.a offboardingInteractor, gte.a featureToggleInteractor, am2.a profileTypeInteractor) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(offboardingInteractor, "offboardingInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(profileTypeInteractor, "profileTypeInteractor");
        this.f = offboardingInteractor;
        this.f243661c = featureToggleInteractor;
        this.d = profileTypeInteractor;
        this.e = t97.d.CLOSE_ACCOUNT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(t97.c productCellProvider, o95.g overdraftProductFeatureTogglesInteractor, xq3.u creditMarketingAvailabilityInteractor, h95.a overdraftNavigationCommandFactory) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(overdraftProductFeatureTogglesInteractor, "overdraftProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(creditMarketingAvailabilityInteractor, "creditMarketingAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(overdraftNavigationCommandFactory, "overdraftNavigationCommandFactory");
        this.f = overdraftProductFeatureTogglesInteractor;
        this.f243661c = creditMarketingAvailabilityInteractor;
        this.d = overdraftNavigationCommandFactory;
        this.e = t97.d.OVERDRAFT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(t97.c productCellProvider, y45.n mortgageProductFeatureTogglesInteractor, xq3.u creditMarketingAvailabilityInteractor, gz3.a startCreditApplicationNavigationDestinationProvider) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(mortgageProductFeatureTogglesInteractor, "mortgageProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(creditMarketingAvailabilityInteractor, "creditMarketingAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(startCreditApplicationNavigationDestinationProvider, "startCreditApplicationNavigationDestinationProvider");
        this.f = mortgageProductFeatureTogglesInteractor;
        this.f243661c = creditMarketingAvailabilityInteractor;
        this.d = startCreditApplicationNavigationDestinationProvider;
        this.e = t97.d.MORTGAGE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(t97.c productCellProvider, js7.d creditCardInsuranceProductFeatureTogglesInteractor, xq3.u creditMarketingAvailabilityInteractor, gz3.a startCreditApplicationNavigationDestinationProvider) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(creditCardInsuranceProductFeatureTogglesInteractor, "creditCardInsuranceProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(creditMarketingAvailabilityInteractor, "creditMarketingAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(startCreditApplicationNavigationDestinationProvider, "startCreditApplicationNavigationDestinationProvider");
        this.f = creditCardInsuranceProductFeatureTogglesInteractor;
        this.f243661c = creditMarketingAvailabilityInteractor;
        this.d = startCreditApplicationNavigationDestinationProvider;
        this.e = t97.d.NON_EMBEDDED_CREDIT_INSURANCE_CREDIT_CARD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(t97.c productCellProvider, l35.a creditInsuranceProductFeatureTogglesInteractor, xq3.u creditMarketingAvailabilityInteractor, gz3.a startCreditApplicationNavigationDestinationProvider) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(creditInsuranceProductFeatureTogglesInteractor, "creditInsuranceProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(creditMarketingAvailabilityInteractor, "creditMarketingAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(startCreditApplicationNavigationDestinationProvider, "startCreditApplicationNavigationDestinationProvider");
        this.f = creditInsuranceProductFeatureTogglesInteractor;
        this.f243661c = creditMarketingAvailabilityInteractor;
        this.d = startCreditApplicationNavigationDestinationProvider;
        this.e = t97.d.NON_EMBEDDED_CREDIT_INSURANCE_LOAN;
    }
}
