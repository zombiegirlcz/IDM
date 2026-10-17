package com.revolut.feature.onboarding.impl.onboarding;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.network.exceptions.HandledNetworkException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.kyc.api.KycContract$Requirement;
import com.revolut.feature.onboarding.api.onboarding.models.EmailData;
import com.revolut.feature.onboarding.api.user_under_18.UserUnder18Data;
import com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$Step;
import com.revolut.feature.onboarding.impl.onboarding.country.flow.CountryOfResidenceFlow;
import com.revolut.feature.onboarding.impl.onboarding.country.flow.CountryOfResidenceFlowContract$InputData;
import com.revolut.feature_retail_user_declarations.email.flow.EmailFlowInputData;
import com.revolut.feature_retail_user_declarations.email.navigation.EmailFlowDescriptor;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.api.userauth.models.UserAuthElement;
import com.revolut.retail.feature.pod_nominees.api.navigation.PodNomineesFlowUseCase;
import ga9.b0;
import ga9.c0;
import ga9.e0;
import ga9.f0;
import ga9.l0;
import grl.k9;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import mri.w;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import ts6.z0;
import ulm.r1;
import vkm.j2;
import vkm.v1;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class v extends oki.h implements ga9.d {

    @NotNull
    public static final ga9.j Companion = new ga9.j();
    public final fwj.p A;
    public final aci.a B;
    public final utk.f C;
    public final yp.b D;
    public final n8b.a E;
    public final jte.c F;
    public final xoj.a G;
    public final fn2.c H;
    public final wl0.c I;
    public final w J;
    public final xai.a K;
    public final xa9.d L;
    public final jb9.h M;
    public final i1b.e N;
    public final fwj.d O;
    public final qki.d P;
    public final yki.i Q;
    public final OnboardingFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fk3.a f78490p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fne.b f78491q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z80.b f78492r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s89.a f78493s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yva.a f78494t;
    public final eb9.a u;
    public final q89.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j89.a f78495w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final gte.a f78496x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ga9.a f78497y;
    public final z0 z;

    public v(OnboardingFlowContract$InputData inputData, fk3.a configurationInteractor, fne.b taxResidencyFlowProvider, z80.b phoneToolsProvider, s89.a onboardingDialogModelProvider, yva.a referralCodeInteractor, eb9.a onboardingJuniorScreenProvider, q89.e onboardingInteractor, j89.a qesTermsConfigurationProvider, gte.a featureToggleInteractor, ga9.a aiCallsConsentControllerProvider, z0 freelancerDeeplinkObserver, fwj.p userOnboardingInteractor, aci.a purposeOfAccountInteractor, utk.f onboardingFlowErrorHelper, yp.b appStoreNavigationFactory, n8b.a countryInteractor, jte.c experimentsFetchingInteractor, xoj.a featuresInteractor, fn2.c productCatalogueLoader, wl0.c biometricHelper, w revolutJobInteractor, xai.a emailVerificationEventEmitter, xa9.d emailOtpDispatcher, jb9.h passcodeDialogModelProvider, i1b.e appsFlyerAnalyticsInteractor, fwj.d userAuthAnalyticsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(taxResidencyFlowProvider, "taxResidencyFlowProvider");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(onboardingDialogModelProvider, "onboardingDialogModelProvider");
        Intrinsics.checkNotNullParameter(referralCodeInteractor, "referralCodeInteractor");
        Intrinsics.checkNotNullParameter(onboardingJuniorScreenProvider, "onboardingJuniorScreenProvider");
        Intrinsics.checkNotNullParameter(onboardingInteractor, "onboardingInteractor");
        Intrinsics.checkNotNullParameter(qesTermsConfigurationProvider, "qesTermsConfigurationProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(aiCallsConsentControllerProvider, "aiCallsConsentControllerProvider");
        Intrinsics.checkNotNullParameter(freelancerDeeplinkObserver, "freelancerDeeplinkObserver");
        Intrinsics.checkNotNullParameter(userOnboardingInteractor, "userOnboardingInteractor");
        Intrinsics.checkNotNullParameter(purposeOfAccountInteractor, "purposeOfAccountInteractor");
        Intrinsics.checkNotNullParameter(onboardingFlowErrorHelper, "onboardingFlowErrorHelper");
        Intrinsics.checkNotNullParameter(appStoreNavigationFactory, "appStoreNavigationFactory");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(experimentsFetchingInteractor, "experimentsFetchingInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueLoader, "productCatalogueLoader");
        Intrinsics.checkNotNullParameter(biometricHelper, "biometricHelper");
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(emailVerificationEventEmitter, "emailVerificationEventEmitter");
        Intrinsics.checkNotNullParameter(emailOtpDispatcher, "emailOtpDispatcher");
        Intrinsics.checkNotNullParameter(passcodeDialogModelProvider, "passcodeDialogModelProvider");
        Intrinsics.checkNotNullParameter(appsFlyerAnalyticsInteractor, "appsFlyerAnalyticsInteractor");
        Intrinsics.checkNotNullParameter(userAuthAnalyticsInteractor, "userAuthAnalyticsInteractor");
        this.o = inputData;
        this.f78490p = configurationInteractor;
        this.f78491q = taxResidencyFlowProvider;
        this.f78492r = phoneToolsProvider;
        this.f78493s = onboardingDialogModelProvider;
        this.f78494t = referralCodeInteractor;
        this.u = onboardingJuniorScreenProvider;
        this.v = onboardingInteractor;
        this.f78495w = qesTermsConfigurationProvider;
        this.f78496x = featureToggleInteractor;
        this.f78497y = aiCallsConsentControllerProvider;
        this.z = freelancerDeeplinkObserver;
        this.A = userOnboardingInteractor;
        this.B = purposeOfAccountInteractor;
        this.C = onboardingFlowErrorHelper;
        this.D = appStoreNavigationFactory;
        this.E = countryInteractor;
        this.F = experimentsFetchingInteractor;
        this.G = featuresInteractor;
        this.H = productCatalogueLoader;
        this.I = biometricHelper;
        this.J = revolutJobInteractor;
        this.K = emailVerificationEventEmitter;
        this.L = emailOtpDispatcher;
        this.M = passcodeDialogModelProvider;
        this.N = appsFlyerAnalyticsInteractor;
        this.O = userAuthAnalyticsInteractor;
        this.P = hx7.e.b(this, new OnboardingFlowContract$State(inputData.f78309a, null, inputData.f78311c, h0.f322473a));
        this.Q = d8l.d.a(this, new g75.i(this, 6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (Y2(r7, null, r0, 3) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.onboarding.impl.onboarding.v r7, wi0.b r8, t89.a r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof ga9.k
            if (r0 == 0) goto L13
            r0 = r10
            ga9.k r0 = (ga9.k) r0
            int r1 = r0.f142088x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f142088x = r1
            goto L18
        L13:
            ga9.k r0 = new ga9.k
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f142088x
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r10)
            goto L74
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            yhm.o.b(r10)
            goto L69
        L3a:
            wi0.b r8 = r0.u
            yhm.o.b(r10)
            goto L52
        L40:
            yhm.o.b(r10)
            q89.e r10 = r7.v
            r0.u = r8
            r0.f142088x = r5
            db9.d r10 = (db9.d) r10
            java.lang.Object r9 = r10.b(r8, r9, r0)
            if (r9 != r1) goto L52
            goto L73
        L52:
            qki.d r9 = r7.P
            java.lang.Object r9 = r9.f22677a
            vkm.j2 r9 = (vkm.j2) r9
            java.lang.Object r9 = r9.getValue()
            com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$State r9 = (com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$State) r9
            r0.u = r6
            r0.f142088x = r4
            java.lang.Object r8 = r7.W2(r8, r9, r0)
            if (r8 != r1) goto L69
            goto L73
        L69:
            r0.u = r6
            r0.f142088x = r3
            java.lang.Object r7 = Y2(r7, r6, r0, r3)
            if (r7 != r1) goto L74
        L73:
            return r1
        L74:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.onboarding.v.I2(com.revolut.feature.onboarding.impl.onboarding.v, wi0.b, t89.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (Y2(r8, null, r0, 3) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ac, code lost:
    
        if (r8 != r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.onboarding.impl.onboarding.v r8, vja.n r9, com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$State r10, gim.c r11) {
        /*
            boolean r0 = r11 instanceof ga9.g0
            if (r0 == 0) goto L13
            r0 = r11
            ga9.g0 r0 = (ga9.g0) r0
            int r1 = r0.f142076w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f142076w = r1
            goto L18
        L13:
            ga9.g0 r0 = new ga9.g0
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f142076w
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3f
            if (r2 == r6) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            yhm.o.b(r11)
            goto Laf
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r11)
            goto L96
        L3b:
            yhm.o.b(r11)
            goto L5e
        L3f:
            yhm.o.b(r11)
            qki.d r11 = r8.P
            ga9.g r2 = new ga9.g
            r7 = 0
            r2.<init>(r10, r7)
            r8.H2(r11, r2)
            vja.l r10 = vja.l.f289673a
            boolean r10 = kotlin.jvm.internal.Intrinsics.f(r9, r10)
            if (r10 == 0) goto L61
            r0.f142076w = r6
            java.lang.Object r8 = Y2(r8, r3, r0, r4)
            if (r8 != r1) goto L5e
            goto Lae
        L5e:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L61:
            vja.j r10 = vja.j.f289670a
            boolean r10 = kotlin.jvm.internal.Intrinsics.f(r9, r10)
            if (r10 == 0) goto L6d
            r8.B2()
            goto L7a
        L6d:
            vja.m r10 = vja.m.f289674a
            boolean r10 = kotlin.jvm.internal.Intrinsics.f(r9, r10)
            if (r10 == 0) goto L7d
            q89.f r9 = q89.f.STORIES
            r8.T2(r9)
        L7a:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L7d:
            boolean r10 = r9 instanceof vja.k
            if (r10 == 0) goto Lb2
            fwj.p r10 = r8.A
            vja.k r9 = (vja.k) r9
            java.lang.String r11 = r9.f289671a
            java.lang.String r9 = r9.f289672b
            ufm.n r9 = r10.a(r11, r9)
            r0.f142076w = r5
            java.lang.Object r11 = nim.a.b(r9, r0)
            if (r11 != r1) goto L96
            goto Lae
        L96:
            com.revolut.retail.feature.api.userauth.models.UserAuthElement r11 = (com.revolut.retail.feature.api.userauth.models.UserAuthElement) r11
            kotlin.jvm.internal.Intrinsics.h(r11)
            r0.f142076w = r4
            amf.k r9 = new amf.k
            r10 = 2
            r9.<init>(r8, r11, r3, r10)
            java.lang.Object r8 = r8.V2(r9, r0)
            if (r8 != r1) goto Laa
            goto Lac
        Laa:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        Lac:
            if (r8 != r1) goto Laf
        Lae:
            return r1
        Laf:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        Lb2:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.onboarding.v.J2(com.revolut.feature.onboarding.impl.onboarding.v, vja.n, com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$State, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.feature.onboarding.impl.onboarding.v r7, wi0.b r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof ga9.h0
            if (r0 == 0) goto L13
            r0 = r9
            ga9.h0 r0 = (ga9.h0) r0
            int r1 = r0.f142080x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f142080x = r1
            goto L18
        L13:
            ga9.h0 r0 = new ga9.h0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f142080x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            wi0.b r8 = r0.u
            yhm.o.b(r9)
            goto L7f
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r9)
            fk3.a r9 = r7.f78490p
            ik3.c r9 = (ik3.c) r9
            r9.getClass()
            java.lang.String r2 = "configType"
            e7l.g$a r5 = e7l.g.a.f123406a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            efm.r r9 = r9.k(r5)
            ijj.p r2 = new ijj.p
            r5 = 6
            r2.<init>(r5)
            efm.r r9 = nim.a.w(r9, r2)
            ijj.r r2 = new ijj.r
            r5 = 1
            r2.<init>(r5)
            efm.r r9 = m70.a.g(r9, r3, r2, r4)
            efm.d0 r9 = r9.firstOrError()
            h35.c r2 = new h35.c
            r5 = 21
            r2.<init>(r5)
            r9.getClass()
            pfm.z r5 = new pfm.z
            r6 = 1
            r5.<init>(r9, r6, r2, r3)
            java.lang.String r9 = "onErrorReturn(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r9)
            r0.u = r8
            r0.f142080x = r4
            java.lang.Object r9 = nim.a.b(r5, r0)
            if (r9 != r1) goto L7f
            return r1
        L7f:
            java.util.List r9 = (java.util.List) r9
            boolean r9 = r9.contains(r8)
            if (r9 == 0) goto La4
            z80.b r9 = r7.f78492r
            com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$InputData r7 = r7.o
            java.lang.String r7 = r7.f78310b
            wi0.b r7 = r9.e(r7)
            if (r7 == 0) goto L95
            java.lang.String r3 = r7.f297794a
        L95:
            if (r3 != 0) goto L99
            java.lang.String r3 = ""
        L99:
            java.lang.String r7 = r8.f297794a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r3)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        La4:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.onboarding.v.K2(com.revolut.feature.onboarding.impl.onboarding.v, wi0.b, gim.c):java.lang.Object");
    }

    public static final void L2(v vVar, OnboardingFlowContract$InputData onboardingFlowContract$InputData, OnboardingFlowContract$State onboardingFlowContract$State, UserAuthElement userAuthElement, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        vVar.getClass();
        Address address = onboardingFlowContract$State.f78312a;
        EmailData emailData = onboardingFlowContract$State.f78313b;
        String str5 = onboardingFlowContract$State.f78314c;
        wi0.b bVarP = nz8.d.p(address);
        Continuation continuation = null;
        if (userAuthElement instanceof UserAuthElement.Country) {
            if (((o8b.c) vVar.E).g()) {
                vVar.R2(new f0(vVar, bVarP, onboardingFlowContract$State, null, 1));
                return;
            }
            UserAuthElement.Country country = (UserAuthElement.Country) userAuthElement;
            String str6 = country.f99287a;
            if (str6 != null) {
                wi0.b.Companion.getClass();
                bVarP = wi0.a.a(str6);
            }
            vVar.U2(new OnboardingFlowContract$Step.Country(8, bVarP, str6 != null, country.f99288b), false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.RetailAndCreditTerms) {
            vVar.U2(new OnboardingFlowContract$Step.RetailAndCreditTerms(bVarP, t89.a.CREDIT_TERMS), false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.BankTerms) {
            if (((UserAuthElement.BankTerms) userAuthElement).f99282a) {
                vVar.R2(new e0(vVar, bVarP, null, 1));
                return;
            } else {
                vVar.U2(new OnboardingFlowContract$Step.BankTerms(bVarP), false);
                return;
            }
        }
        if (userAuthElement instanceof UserAuthElement.Email) {
            if (emailData == null || (str4 = emailData.f78192a) == null) {
                m70.a.c(t0.f186434a);
                str3 = "";
            } else {
                str3 = str4;
            }
            UserAuthElement.Email email = (UserAuthElement.Email) userAuthElement;
            vVar.U2(new OnboardingFlowContract$Step.Email(bVarP, z, str3, email.f99297a, email.f99298b), z);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.EmailWithMarketingConsent) {
            boolean z3 = emailData != null ? emailData.f78193b : false;
            if (emailData == null || (str2 = emailData.f78192a) == null) {
                m70.a.c(t0.f186434a);
                str = "";
            } else {
                str = str2;
            }
            UserAuthElement.EmailWithMarketingConsent emailWithMarketingConsent = (UserAuthElement.EmailWithMarketingConsent) userAuthElement;
            vVar.U2(new OnboardingFlowContract$Step.EmailWithMarketingConsent(bVarP, z, str, z3, emailWithMarketingConsent.f99299a, emailWithMarketingConsent.f99300b), z);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.Password) {
            vVar.U2(new OnboardingFlowContract$Step.PasscodeCreation(onboardingFlowContract$InputData.f78310b, z), z);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.WaitingList) {
            vVar.U2(new OnboardingFlowContract$Step.WaitingList(bVarP, z), z);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.RiskCheck) {
            vVar.U2(new OnboardingFlowContract$Step.RiskCheck(((UserAuthElement.RiskCheck) userAuthElement).f99319a), false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.WaitingVerification) {
            vVar.U2(new OnboardingFlowContract$Step.WaitingVerification(((UserAuthElement.WaitingVerification) userAuthElement).f99330a), false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.Unsupported) {
            Object obj2 = vVar.C.f283121a;
            new v60.b();
            yji.l.a1(vVar, vVar.X1(new y0("ERROR_DIALOG_ID", new z(new TextLocalisedClause("error.generic", (List) null, (Clause) null, false, 14), null, new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4)), null, null, null, 7);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.Workflow) {
            vVar.U2(new OnboardingFlowContract$Step.Workflow(((UserAuthElement.Workflow) userAuthElement).f99332a, str5, bVarP), false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.ProductLifecycle) {
            vVar.U2(new OnboardingFlowContract$Step.ProductLifecycle(bVarP, str5), false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.Address) {
            vVar.U2(new OnboardingFlowContract$Step.Address(bVarP), false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.ProfileDetails) {
            vVar.U2(OnboardingFlowContract$Step.ProfileDetails.f78365a, false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.ContactsSync) {
            vVar.U2(OnboardingFlowContract$Step.ContactsSync.f78328a, false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.Name) {
            vVar.U2(new OnboardingFlowContract$Step.Name(bVarP, ((UserAuthElement.Name) userAuthElement).f99306a), false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.DateOfBirth) {
            vVar.U2(new OnboardingFlowContract$Step.DateOfBirth(null), false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.Occupation) {
            vVar.U2(new OnboardingFlowContract$Step.Occupation(bVarP), false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.PurposeOfAccount) {
            vVar.U2(new OnboardingFlowContract$Step.PurposeOfAccount(bVarP), false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.ActivationReady) {
            vVar.U2(new OnboardingFlowContract$Step.WaitingListActivationReady(bVarP), false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.AddressVerificationKyc) {
            vVar.U2(new OnboardingFlowContract$Step.AddressVerificationKyc(new KycContract$Requirement(((UserAuthElement.AddressVerificationKyc) userAuthElement).f99279a), bVarP), false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.PoliticallyExposedPersonDeclaration) {
            vVar.U2(OnboardingFlowContract$Step.PoliticallyExposedPersonDeclaration.f78361a, false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.MonthlyIncome) {
            xi0.b.Companion.getClass();
            vVar.U2(new OnboardingFlowContract$Step.MonthlyIncome(xi0.a.b(bVarP)), false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.Citizenship) {
            vVar.U2(new OnboardingFlowContract$Step.Citizenship(bVarP), false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.Qes) {
            vVar.U2(new OnboardingFlowContract$Step.Qes(bVarP), false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.TrackingConsent) {
            UserAuthElement.TrackingConsent trackingConsent = (UserAuthElement.TrackingConsent) userAuthElement;
            if (trackingConsent.f99324a) {
                vVar.U2(new OnboardingFlowContract$Step.AnalyticsEventTrackingConsent(z, trackingConsent.f99325b), z);
                return;
            } else {
                vVar.R2(new ga9.o(vVar, continuation, 3));
                return;
            }
        }
        if (userAuthElement instanceof UserAuthElement.PodBeneficiaries) {
            vVar.U2(new OnboardingFlowContract$Step.PodBeneficiaries(new PodNomineesFlowUseCase.Onboarding.LegacyOnboarding(bVarP), z), false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.AiCallsConsent) {
            vVar.U2(OnboardingFlowContract$Step.AiCallsConsent.f78318a, false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.MarketingConsent) {
            vVar.U2(new OnboardingFlowContract$Step.MarketingConsent(bVarP, z, ((UserAuthElement.MarketingConsent) userAuthElement).f99304a), z);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.ProductOnboarding) {
            vVar.U2(OnboardingFlowContract$Step.ProductOnboarding.f78364a, false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.DuplicateAccount) {
            vVar.U2(OnboardingFlowContract$Step.DuplicateAccount.f78338a, false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.TaxResidencies) {
            vVar.U2(new OnboardingFlowContract$Step.TaxResidency(bVarP), false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.DocumentKyc) {
            UserAuthElement.DocumentKyc documentKyc = (UserAuthElement.DocumentKyc) userAuthElement;
            vVar.U2(new OnboardingFlowContract$Step.DocumentKyc(bVarP, new KycContract$Requirement(documentKyc.f99292a), str5 == null ? "" : str5, documentKyc.f99293b, onboardingFlowContract$State.d), false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.DocumentId) {
            vVar.U2(new OnboardingFlowContract$Step.DocumentId(new KycContract$Requirement(((UserAuthElement.DocumentId) userAuthElement).f99290a), bVarP), false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.ContactsPermission) {
            vVar.U2(OnboardingFlowContract$Step.ContactsPermission.f78327a, false);
            return;
        }
        if (userAuthElement instanceof UserAuthElement.JuniorGraduation) {
            vVar.U2(new OnboardingFlowContract$Step.JuniorGraduationIdentification(((UserAuthElement.JuniorGraduation) userAuthElement).f99301a, onboardingFlowContract$InputData.f78310b, onboardingFlowContract$InputData.d), false);
        } else if (userAuthElement instanceof UserAuthElement.JuniorGraduationAccountLinked) {
            vVar.U2(new OnboardingFlowContract$Step.JuniorGraduationAccountLinked(z, ((UserAuthElement.JuniorGraduationAccountLinked) userAuthElement).f99303a), z);
        } else {
            if (!(userAuthElement instanceof UserAuthElement.SelfieKyc)) {
                throw new NoWhenBranchMatchedException();
            }
            vVar.U2(new OnboardingFlowContract$Step.Biometric(null, ((UserAuthElement.SelfieKyc) userAuthElement).f99321a), false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r0.h(o0j.c.d.f221219a, r1) == r7) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M2(com.revolut.feature.onboarding.impl.onboarding.v r5, boolean r6, gim.c r7) {
        /*
            fwj.p r0 = r5.A
            boolean r1 = r7 instanceof ga9.j0
            if (r1 == 0) goto L15
            r1 = r7
            ga9.j0 r1 = (ga9.j0) r1
            int r2 = r1.f142086x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f142086x = r2
            goto L1a
        L15:
            ga9.j0 r1 = new ga9.j0
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r5 = r1.v
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.f142086x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r5)
            goto L61
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            boolean r6 = r1.u
            yhm.o.b(r5)
            goto L54
        L3a:
            yhm.o.b(r5)
            loi.a r5 = r0.f138699w
            noi.a r5 = (noi.a) r5
            pfm.a r5 = r5.b(r6)
            pfm.a r5 = ue0.e.v(r5)
            r1.u = r6
            r1.f142086x = r4
            java.lang.Object r5 = nim.a.a(r5, r1)
            if (r5 != r7) goto L54
            goto L60
        L54:
            r1.u = r6
            r1.f142086x = r3
            o0j.c$d r5 = o0j.c.d.f221219a
            java.lang.Object r5 = r0.h(r5, r1)
            if (r5 != r7) goto L61
        L60:
            return r7
        L61:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.onboarding.v.M2(com.revolut.feature.onboarding.impl.onboarding.v, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (nim.a.a(r5, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N2(com.revolut.feature.onboarding.impl.onboarding.v r5, com.revolut.feature.onboarding.api.onboarding.models.EmailData r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof ga9.k0
            if (r0 == 0) goto L13
            r0 = r7
            ga9.k0 r0 = (ga9.k0) r0
            int r1 = r0.f142089w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f142089w = r1
            goto L18
        L13:
            ga9.k0 r0 = new ga9.k0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f142089w
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L36
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L62 java.util.concurrent.CancellationException -> L70
            goto L5f
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r7)
            goto L4e
        L36:
            yhm.o.b(r7)
            boolean r7 = r6.f78194c
            if (r7 == 0) goto L4e
            fwj.p r7 = r5.A
            boolean r6 = r6.f78193b
            pfm.r r6 = r7.i(r6)
            r0.f142089w = r3
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L4e
            goto L5e
        L4e:
            jte.c r5 = r5.F     // Catch: java.lang.Exception -> L62 java.util.concurrent.CancellationException -> L70
            com.revolut.domain.interactors.experiments.ExperimentsFetchingInteractor$ExperimentType r6 = com.revolut.domain.interactors.experiments.ExperimentsFetchingInteractor$ExperimentType.SKYWALKER     // Catch: java.lang.Exception -> L62 java.util.concurrent.CancellationException -> L70
            pfm.t r5 = jte.c.a(r5, r6, r4)     // Catch: java.lang.Exception -> L62 java.util.concurrent.CancellationException -> L70
            r0.f142089w = r4     // Catch: java.lang.Exception -> L62 java.util.concurrent.CancellationException -> L70
            java.lang.Object r5 = nim.a.a(r5, r0)     // Catch: java.lang.Exception -> L62 java.util.concurrent.CancellationException -> L70
            if (r5 != r1) goto L5f
        L5e:
            return r1
        L5f:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L62 java.util.concurrent.CancellationException -> L70
            goto L6d
        L62:
            r5 = move-exception
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r7 = rd0.c.ERROR
            r0 = 0
            rd0.d.a(r7, r0, r0, r5, r6)
        L6d:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L70:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.onboarding.v.N2(com.revolut.feature.onboarding.impl.onboarding.v, com.revolut.feature.onboarding.api.onboarding.models.EmailData, gim.c):java.lang.Object");
    }

    public static Object Y2(v vVar, ga9.v vVar2, Continuation continuation, int i) {
        boolean z = (i & 1) == 0;
        Function2 iVar = vVar2;
        if ((i & 2) != 0) {
            iVar = new e31.i(2, 19, null);
        }
        vVar.getClass();
        Object objP2 = vVar.p2(continuation, new l0(vVar, iVar, z, null));
        return objP2 == fim.a.COROUTINE_SUSPENDED ? objP2 : Unit.f186387a;
    }

    @Override // yji.l
    public final void I1() {
        this.z.init();
        xa9.d dVar = this.L;
        yji.l.a1(this, new v1(new wih.c(new vkm.t0(dVar.f303790a, 1), (Continuation) null, dVar)), null, null, new c0(this, null, 1), 3);
    }

    @Override // yki.j
    public final void M0() {
        l2(new ga9.m(this, null, 7), new ga9.f(this, 9));
    }

    public final CountryOfResidenceFlow O2(wi0.b bVar, t89.a aVar, boolean z, boolean z3) {
        CountryOfResidenceFlow countryOfResidenceFlow = new CountryOfResidenceFlow(new CountryOfResidenceFlowContract$InputData(bVar, aVar, z ? rbl.a.BACK : rbl.a.NONE, z3));
        ga9.f block = new ga9.f(this, 6);
        Intrinsics.checkNotNullParameter(block, "block");
        countryOfResidenceFlow.H = block;
        return countryOfResidenceFlow;
    }

    public final ViewController P2(wi0.b bVar, boolean z, String str, boolean z3, boolean z4, boolean z6) {
        TextLocalisedClause textLocalisedClause = com.bumptech.glide.d.v(bVar) ? new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.signup_main_form_email_sg_subtitle, null, null, 14) : null;
        EmailFlowInputData.PrefillEmailData prefillEmailData = !d0.W(str) ? new EmailFlowInputData.PrefillEmailData(str, true, z3) : null;
        k9 k9Var = k9.Onboarding;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        ViewController viewControllerE1 = e1(new EmailFlowDescriptor(new EmailFlowInputData(com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), new EmailFlowInputData.EmailScreenItemData(new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.signup_main_form_email_new_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.signup_main_form_email_placeholder, null, null, 14), new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.signup_main_form_email_error_invalid_email, null, null, 14), new TextLocalisedClause(R$string.common_action_continue, null, null, 14), textLocalisedClause, z ? rbl.a.BACK : rbl.a.NONE), prefillEmailData, bVar, z4, true, z6)));
        a6j.a block = new a6j.a(this, z4, 29);
        Intrinsics.checkNotNullParameter(block, "block");
        viewControllerE1.H = block;
        return viewControllerE1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q2(java.lang.String r6, java.lang.String r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ga9.d0
            if (r0 == 0) goto L13
            r0 = r8
            ga9.d0 r0 = (ga9.d0) r0
            int r1 = r0.f142066w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f142066w = r1
            goto L18
        L13:
            ga9.d0 r0 = new ga9.d0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f142066w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L62
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r8)
            goto L48
        L36:
            yhm.o.b(r8)
            fwj.p r8 = r5.A
            ufm.n r6 = r8.a(r6, r7)
            r0.f142066w = r4
            java.lang.Object r8 = nim.a.b(r6, r0)
            if (r8 != r1) goto L48
            goto L61
        L48:
            com.revolut.retail.feature.api.userauth.models.UserAuthElement r8 = (com.revolut.retail.feature.api.userauth.models.UserAuthElement) r8
            kotlin.jvm.internal.Intrinsics.h(r8)
            r0.f142066w = r3
            amf.k r6 = new amf.k
            r7 = 0
            r2 = 2
            r6.<init>(r5, r8, r7, r2)
            java.lang.Object r6 = r5.V2(r6, r0)
            if (r6 != r1) goto L5d
            goto L5f
        L5d:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L5f:
            if (r6 != r1) goto L62
        L61:
            return r1
        L62:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.onboarding.v.Q2(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    public final void R2(Function1 function1) {
        l2(new ga9.v(this, (Continuation) null, function1), new g48.j(this, function1));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S2(java.lang.Throwable r11, kotlin.jvm.functions.Function1 r12) {
        /*
            r10 = this;
            boolean r0 = r10.o1(r11)
            if (r0 == 0) goto L7
            return
        L7:
            utk.f r0 = r10.C
            java.lang.Object r1 = r0.f283121a
            v60.e r1 = (v60.e) r1
            java.lang.String r2 = "error"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            java.lang.Object r0 = r0.f283122b
            sf0.h r0 = (sf0.h) r0
            com.revolut.core.error.data.model.ServerError r0 = r0.a(r11)
            if (r0 == 0) goto L2a
            int r0 = r0.f51362a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            ao0.a r1 = (ao0.a) r1
            v60.c r0 = r1.b(r0)
            if (r0 != 0) goto L2f
        L2a:
            v60.b r0 = new v60.b
            r0.<init>()
        L2f:
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            java.lang.String r2 = r0.a()
            boolean r5 = r0 instanceof v60.c
            r6 = 14
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            s89.a r0 = r10.f78493s
            ua9.a r0 = (ua9.a) r0
            nii.z r11 = r0.a(r1, r11)
            nii.y0 r0 = new nii.y0
            r1 = 0
            r2 = 4
            java.lang.String r3 = "ERROR_DIALOG_ID"
            r0.<init>(r3, r11, r1, r2)
            kotlinx.coroutines.flow.Flow r5 = r10.X1(r0)
            g23.q r8 = new g23.q
            r11 = 0
            r8.<init>(r10, r11, r12)
            r9 = 3
            r6 = 0
            r7 = 0
            r4 = r10
            yji.l.a1(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.onboarding.v.S2(java.lang.Throwable, kotlin.jvm.functions.Function1):void");
    }

    public final void T2(q89.f fVar) {
        C2(new q89.c(fVar));
    }

    public final void U2(OnboardingFlowContract$Step onboardingFlowContract$Step, boolean z) {
        yki.i iVar = this.Q;
        if (iVar.c() && !z) {
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            iVar.a();
        }
        oki.h.t2(this, iVar, onboardingFlowContract$Step, z, TransitionAnimation.SLIDE_END_TO_START.f98395a, false, 8);
    }

    public final Object V2(Function3 function3, gim.c cVar) {
        Object objInvoke = function3.invoke(this.o, ((j2) this.P.f22677a).getValue(), cVar);
        return objInvoke == fim.a.COROUTINE_SUSPENDED ? objInvoke : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e5, code lost:
    
        if (r6.h(r2, r3) == r4) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W2(wi0.b r28, com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$State r29, gim.c r30) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.onboarding.v.W2(wi0.b, com.revolut.feature.onboarding.impl.onboarding.OnboardingFlowContract$State, gim.c):java.lang.Object");
    }

    public final void X2(v89.a errorCode) {
        int i;
        this.M.getClass();
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.signup_create_passcode_weak_passcode_alert_title, null, null, 14);
        int i2 = jb9.i.f172617a[errorCode.ordinal()];
        if (i2 == 1) {
            i = com.revolut.feature.onboarding.impl.R$string.signup_create_passcode_weak_passcode_alert_current_date_description;
        } else if (i2 == 2) {
            i = com.revolut.feature.onboarding.impl.R$string.signup_create_passcode_weak_passcode_alert_created_date_description;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = com.revolut.feature.onboarding.impl.R$string.signup_create_passcode_weak_passcode_alert_repeated_digits_description;
        }
        yji.l.a1(this, X1(new y0("PASSCODE_ERROR_DIALOG_ID", new z(textLocalisedClause, new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(com.revolut.feature.onboarding.impl.R$string.signup_create_passcode_weak_passcode_alert_change_passcode_button, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4)), null, null, new b0(this, null, 1), 3);
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.P;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // yji.l
    public final boolean o1(Throwable throwable) throws IOException {
        Integer num;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (throwable instanceof HandledNetworkException) {
            return true;
        }
        boolean z = throwable instanceof HttpException;
        utk.f fVar = this.C;
        if (z) {
            HttpException httpException = (HttpException) throwable;
            if (httpException.code() == 401) {
                fVar.getClass();
                Intrinsics.checkNotNullParameter(httpException, "httpException");
                ServerError serverErrorC = ((sf0.h) fVar.f283122b).c(httpException);
                if (serverErrorC != null && serverErrorC.f51362a == q89.a.UNAUTHORISED_ERROR_CODE.a()) {
                    T2(q89.f.STORIES);
                    return true;
                }
            }
        }
        boolean z3 = false;
        if (z) {
            HttpException throwable2 = (HttpException) throwable;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(throwable2, "httpException");
            ServerError serverErrorC2 = ((sf0.h) fVar.f283122b).c(throwable2);
            fb9.a aVar = 0;
            aVar = 0;
            Integer numValueOf = serverErrorC2 != null ? Integer.valueOf(serverErrorC2.f51362a) : null;
            int iA = i89.a.CAN_NOT_OPEN_ACCOUNT.a();
            yki.i iVar = this.Q;
            if (numValueOf == null || numValueOf.intValue() != iA) {
                int iA2 = i89.a.CAN_NOT_OPEN_ACCOUNT_FOREIGN_APPLICANT.a();
                if (numValueOf == null || numValueOf.intValue() != iA2) {
                    int iA3 = c99.a.USER_UNDER_18_NOT_ELIGIBLE_FOR_SELF_SIGN_UP_ERROR_CODE.a();
                    if (numValueOf == null || numValueOf.intValue() != iA3) {
                        int iA4 = c99.a.USER_UNDER_18_ELIGIBLE_FOR_SELF_SIGN_UP_ERROR_CODE.a();
                        if (numValueOf == null || numValueOf.intValue() != iA4) {
                            int iA5 = q89.a.ONLY_LOCAL_PHONE_NUMBER_SUPPORTED_ERROR_CODE.a();
                            if (numValueOf != null && numValueOf.intValue() == iA5) {
                                n2(new ga9.m(this, aVar, 6), new whi.b(6));
                                return true;
                            }
                            v89.a aVar2 = v89.a.PASSCODE_CONTAINS_CURRENT_DATE_ERROR_CODE;
                            int iA6 = aVar2.a();
                            if (numValueOf != null && numValueOf.intValue() == iA6) {
                                X2(aVar2);
                                return true;
                            }
                            v89.a aVar3 = v89.a.PASSCODE_CONTAINS_INDIVIDUAL_CREATED_DATE_ERROR_CODE;
                            int iA7 = aVar3.a();
                            if (numValueOf != null && numValueOf.intValue() == iA7) {
                                X2(aVar3);
                                return true;
                            }
                            v89.a aVar4 = v89.a.PASSCODE_IS_NOT_STRONG_ERROR_CODE;
                            int iA8 = aVar4.a();
                            if (numValueOf != null && numValueOf.intValue() == iA8) {
                                X2(aVar4);
                                return true;
                            }
                        }
                    }
                    int iA9 = c99.a.USER_UNDER_18_ELIGIBLE_FOR_SELF_SIGN_UP_ERROR_CODE.a();
                    if (numValueOf != null && numValueOf.intValue() == iA9) {
                        z3 = true;
                    }
                    Intrinsics.checkNotNullParameter(throwable2, "throwable");
                    fb9.b bVar = (fb9.b) fVar.f283123c;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(throwable2, "throwable");
                    r1 r1VarM = i26.l.m(throwable2);
                    String strString = r1VarM != null ? r1VarM.string() : null;
                    if (strString != null) {
                        try {
                            aVar = (fb9.a) bVar.f133530a.b(strString, fb9.a.class);
                        } catch (Exception e) {
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                        }
                    }
                    oki.h.t2(this, iVar, new OnboardingFlowContract$Step.UserUnder18(new UserUnder18Data(z3, (aVar == 0 || (num = aVar.f133528a) == null) ? 18 : num.intValue())), true, TransitionAnimation.SLIDE_END_TO_START.f98395a, false, 8);
                    return true;
                }
            }
            oki.h.t2(this, iVar, new OnboardingFlowContract$Step.CanNotOpenAccount(numValueOf.intValue(), false), false, TransitionAnimation.SLIDE_END_TO_START.f98395a, false, 8);
            return true;
        }
        return false;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.Q;
    }
}
