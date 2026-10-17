package com.revolut.feature.tab.crypto.impl.ui.settings;

import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.crypto.onboarding.api.CryptoOnboardingApi$Toggles;
import com.revolut.feature.staking.api.StakingApi$FeatureToggles;
import com.revolut.feature.tab.crypto.api.navigation.CryptoSettingsInputData;
import hx7.e;
import i4b.f;
import ji5.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lje.b;
import mra.d;
import oki.h;
import vy5.d0;
import wje.j;
import wje.n;
import wje.q;
import wje.s;
import xv5.c;
import xv5.g;
import yji.l;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements wje.h {
    public final b A;
    public final gte.a B;
    public final avd.b C;
    public final iq6.a D;
    public final hq6.a E;
    public final y F;
    public final com.revolut.kompot.navigable.vc.modal.a G;
    public boolean H;
    public final CryptoSettingsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f89801p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f89802q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f89803r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final tl5.b f89804s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final jl5.a f89805t;
    public final f u;
    public final sl5.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final xh5.a f89806w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final toa.a f89807x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final jla.h f89808y;
    public final i z;

    public a(s stateMapper, CryptoSettingsScreenContract$InputData inputData, c cryptoCommodityBaseCurrencyInteractor, j60.a bottomDialogControllerExtension, g cryptoCommodityStorageInteractor, tl5.b cryptoSpareChangeScreensProvider, jl5.a cryptoSpareChangeDialogsProvider, f cryptoSpareChangeFeatureChecker, sl5.f cryptoSpareChangeInteractor, xh5.a cryptoFeatureEnabledInteractor, toa.a notificationSettingsInteractor, jla.h productCatalogueInteractor, i cryptoOnboardingInteractor, b cryptoCurrencyDisplayInteractor, gte.a featureToggleInteractor, avd.b flexibleStakingConsentInteractor, iq6.a autoStakingResultPopupProvider, hq6.a autoStakingDisableConfirmDialogProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogControllerExtension, "bottomDialogControllerExtension");
        Intrinsics.checkNotNullParameter(cryptoCommodityStorageInteractor, "cryptoCommodityStorageInteractor");
        Intrinsics.checkNotNullParameter(cryptoSpareChangeScreensProvider, "cryptoSpareChangeScreensProvider");
        Intrinsics.checkNotNullParameter(cryptoSpareChangeDialogsProvider, "cryptoSpareChangeDialogsProvider");
        Intrinsics.checkNotNullParameter(cryptoSpareChangeFeatureChecker, "cryptoSpareChangeFeatureChecker");
        Intrinsics.checkNotNullParameter(cryptoSpareChangeInteractor, "cryptoSpareChangeInteractor");
        Intrinsics.checkNotNullParameter(cryptoFeatureEnabledInteractor, "cryptoFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(notificationSettingsInteractor, "notificationSettingsInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(cryptoOnboardingInteractor, "cryptoOnboardingInteractor");
        Intrinsics.checkNotNullParameter(cryptoCurrencyDisplayInteractor, "cryptoCurrencyDisplayInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(flexibleStakingConsentInteractor, "flexibleStakingConsentInteractor");
        Intrinsics.checkNotNullParameter(autoStakingResultPopupProvider, "autoStakingResultPopupProvider");
        Intrinsics.checkNotNullParameter(autoStakingDisableConfirmDialogProvider, "autoStakingDisableConfirmDialogProvider");
        this.o = inputData;
        this.f89801p = cryptoCommodityBaseCurrencyInteractor;
        this.f89802q = bottomDialogControllerExtension;
        this.f89803r = cryptoCommodityStorageInteractor;
        this.f89804s = cryptoSpareChangeScreensProvider;
        this.f89805t = cryptoSpareChangeDialogsProvider;
        this.u = cryptoSpareChangeFeatureChecker;
        this.v = cryptoSpareChangeInteractor;
        this.f89806w = cryptoFeatureEnabledInteractor;
        this.f89807x = notificationSettingsInteractor;
        this.f89808y = productCatalogueInteractor;
        this.z = cryptoOnboardingInteractor;
        this.A = cryptoCurrencyDisplayInteractor;
        this.B = featureToggleInteractor;
        this.C = flexibleStakingConsentInteractor;
        this.D = autoStakingResultPopupProvider;
        this.E = autoStakingDisableConfirmDialogProvider;
        this.F = d.b(this, new wje.g(0), stateMapper, null, false, 12);
        this.G = e.a(this, new wde.f(this, 15));
    }

    @Override // yji.l
    public final void I1() {
        CryptoSettingsInputData cryptoSettingsInputData = this.o.f89797a;
        Continuation continuation = null;
        if (cryptoSettingsInputData instanceof CryptoSettingsInputData.OpenSpareChangeAtTop) {
            l2(new q(this, ((CryptoSettingsInputData.OpenSpareChangeAtTop) cryptoSettingsInputData).f89779a, null), new yi5.b(26));
        } else if (cryptoSettingsInputData != null) {
            throw new NoWhenBranchMatchedException();
        }
        l.a1(this, rd0.e.b(c.b(this.f89801p)), null, null, new wje.l(this, continuation, 1), 3);
        l.a1(this, this.A.a(), null, null, new wje.l(this, continuation, 2), 3);
        l2(new n(this, null), new wgk.f(28));
        H2(this.F, new j(this, 0));
        CryptoOnboardingApi$Toggles.CryptoMarketNotificationSettings cryptoMarketNotificationSettings = CryptoOnboardingApi$Toggles.CryptoMarketNotificationSettings.f70883c;
        jte.d dVar = (jte.d) this.B;
        if (!dVar.c(cryptoMarketNotificationSettings) || this.f89808y.d("CRYPTO_MARKET_NOTIFICATIONS", null).a()) {
            l.a1(this, rd0.e.b(this.f89807x.b()), null, null, new wje.l(this, continuation, 4), 3);
        }
        if (dVar.c(StakingApi$FeatureToggles.FlexibleStaking.f88055c)) {
            l.a1(this, this.C.a(), null, null, new wje.l(this, continuation, 0), 3);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.G;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, mo3.a.g(this.z.a(false), null, new wf0.b(20), 1), null, new wje.l(this, continuation, 5), 3);
        l.a1(this, t1.E(new d0(this.A.f195662a.f309210a.C0("KEY_CURRENCY_DISPLAY_SHORTCUT_TIP", Boolean.TYPE), 26)), null, null, new rf9.h(this, continuation, 18), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.F;
    }
}
