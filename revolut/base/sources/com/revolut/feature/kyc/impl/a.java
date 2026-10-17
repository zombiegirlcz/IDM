package com.revolut.feature.kyc.impl;

import android.content.Context;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.kyc.api.KycApi$FeatureToggle;
import com.revolut.feature.kyc.api.KycContract$Requirement;
import com.revolut.feature.kyc.api.model.KycFinalCommand;
import com.revolut.feature.kyc.api.navigation.KycFeatureConfig;
import com.revolut.feature.kyc.impl.flow.kyc_consolidated.KycConsolidatedFlowContract$InputData;
import com.revolut.feature.kyc.impl.flow.kyc_consolidated.KycConsolidatedFlowDestination;
import com.revolut.feature.kyc.impl.init.InitKycActivity;
import com.revolut.feature.kyc.impl.init.InitKycScreenContract$Configuration;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import cu8.b1;
import cu8.m1;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import my8.r;
import sri.m;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements uri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f77566a;

    public a(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f77566a = featureToggleInteractor;
    }

    public static FeatureCommand d(KycConsolidatedFlowContract$InputData kycConsolidatedFlowContract$InputData, Integer num, boolean z) {
        return new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new KycConsolidatedFlowDestination(kycConsolidatedFlowContract$InputData), false, num, z ? 335577088 : 0, 37));
    }

    public static /* synthetic */ FeatureCommand e(KycConsolidatedFlowContract$InputData kycConsolidatedFlowContract$InputData, Integer num, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        return d(kycConsolidatedFlowContract$InputData, num, false);
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof KycFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        ActivityNavigateCommand activityNavigateCommand;
        NaviCommand naviCommandE;
        KycFeatureConfig config = (KycFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof KycFeatureConfig.InitKyc) {
            KycFeatureConfig.InitKyc initKyc = (KycFeatureConfig.InitKyc) config;
            naviCommandE = new ActivityNavigateCommand(new ExplicitActivityDestination(InitKycActivity.class), new InitKycScreenContract$Configuration(initKyc.f77486a, initKyc.f77487b, initKyc.f77488c, initKyc.d, initKyc.e), null, null, 0, null, null, null, null, false, 1020);
        } else {
            boolean z = config instanceof KycFeatureConfig.StartKyc;
            gte.a aVar = this.f77566a;
            if (z) {
                if (((jte.d) aVar).c(KycApi$FeatureToggle.KycKompotMigration.f77463c)) {
                    KycFeatureConfig.StartKyc startKyc = (KycFeatureConfig.StartKyc) config;
                    String str = startKyc.f77491a;
                    KycFinalCommand kycFinalCommand = startKyc.f77492b;
                    boolean z3 = startKyc.d;
                    naviCommandE = d(new KycConsolidatedFlowContract$InputData(str, kycFinalCommand, startKyc.f77496j, startKyc.f77495h, startKyc.k, startKyc.f77493c, (wi0.b) null, z3, startKyc.f77494g, startKyc.i, startKyc.f77497l, startKyc.f77498m, startKyc.f77499n, startKyc.o, startKyc.f77501q, 320), startKyc.e, startKyc.f);
                } else {
                    m1.Companion.getClass();
                    ExplicitActivityDestination explicitActivityDestination = b1.f108824b;
                    KycFeatureConfig.StartKyc startKyc2 = (KycFeatureConfig.StartKyc) config;
                    String str2 = startKyc2.f77491a;
                    KycFinalCommand kycFinalCommand2 = startKyc2.f77492b;
                    boolean z4 = startKyc2.d;
                    activityNavigateCommand = new ActivityNavigateCommand(explicitActivityDestination, new KycScreenContract$Configuration(str2, kycFinalCommand2, startKyc2.f77493c, (wi0.b) null, z4, startKyc2.f77494g, startKyc2.f77496j, startKyc2.f77495h, startKyc2.i, startKyc2.f77497l, startKyc2.k, startKyc2.f77498m, startKyc2.f77499n, startKyc2.o, startKyc2.f77500p, startKyc2.f77501q, 40), null, startKyc2.e, 0, null, null, null, null, false, 1012);
                    naviCommandE = startKyc2.f ? com.revolut.retail.core.navigation.a.a(activityNavigateCommand) : activityNavigateCommand;
                }
            } else if (config instanceof KycFeatureConfig.StartKycMyNumber) {
                if (((jte.d) aVar).c(KycApi$FeatureToggle.KycKompotMigration.f77463c)) {
                    naviCommandE = e(new KycConsolidatedFlowContract$InputData("KYC_FLOW", (KycFinalCommand) null, r.JP_MY_NUMBER, true, gt8.a.VERIFY_IDENTITY_IN_PROGRESS, (wi0.b) null, (wi0.b) null, true, (KycContract$Requirement) null, (AnalyticsProduct) null, (String) null, (yt8.e) null, (String) null, (String) null, (Set) null, 65120), null, 6);
                } else {
                    m1.Companion.getClass();
                    activityNavigateCommand = new ActivityNavigateCommand(b1.f108824b, new KycScreenContract$Configuration("KYC_FLOW", (KycFinalCommand) null, (wi0.b) null, (wi0.b) null, true, (KycContract$Requirement) null, r.JP_MY_NUMBER, true, (AnalyticsProduct) null, (String) null, gt8.a.VERIFY_IDENTITY_IN_PROGRESS, (yt8.e) null, (String) null, (String) null, false, (Set) null, 128588), null, null, 0, null, null, null, null, false, 1020);
                }
            } else {
                boolean z6 = config instanceof KycFeatureConfig.AddressVerificationKyc;
                DummyCommand dummyCommand = DummyCommand.f98635a;
                if (z6) {
                    if (((jte.d) aVar).c(KycApi$FeatureToggle.KycKompotMigration.f77463c)) {
                        KycFeatureConfig.AddressVerificationKyc addressVerificationKyc = (KycFeatureConfig.AddressVerificationKyc) config;
                        naviCommandE = e(new KycConsolidatedFlowContract$InputData(addressVerificationKyc.d, (KycFinalCommand) new KycFinalCommand.Success(dummyCommand), r.ADDRESS, addressVerificationKyc.e, addressVerificationKyc.f, addressVerificationKyc.f77482a, (wi0.b) null, true, addressVerificationKyc.f77484c, (AnalyticsProduct) null, (String) null, (yt8.e) null, (String) null, (String) null, (Set) null, 64832), addressVerificationKyc.f77483b, 4);
                    } else {
                        m1.Companion.getClass();
                        KycFeatureConfig.AddressVerificationKyc addressVerificationKyc2 = (KycFeatureConfig.AddressVerificationKyc) config;
                        activityNavigateCommand = new ActivityNavigateCommand(b1.f108824b, new KycScreenContract$Configuration(addressVerificationKyc2.d, (KycFinalCommand) new KycFinalCommand.Success(dummyCommand), addressVerificationKyc2.f77482a, (wi0.b) null, true, addressVerificationKyc2.f77484c, r.ADDRESS, addressVerificationKyc2.e, (AnalyticsProduct) null, (String) null, addressVerificationKyc2.f, (yt8.e) null, (String) null, (String) null, addressVerificationKyc2.f77485g, (Set) null, 95784), null, addressVerificationKyc2.f77483b, 0, null, null, null, null, false, 1012);
                    }
                } else {
                    if (!(config instanceof KycFeatureConfig.TaxMissingProofKyc)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((jte.d) aVar).c(KycApi$FeatureToggle.KycKompotMigration.f77463c)) {
                        KycFeatureConfig.TaxMissingProofKyc taxMissingProofKyc = (KycFeatureConfig.TaxMissingProofKyc) config;
                        naviCommandE = e(new KycConsolidatedFlowContract$InputData(taxMissingProofKyc.d, (KycFinalCommand) new KycFinalCommand.Success(dummyCommand), taxMissingProofKyc.f77503a, false, taxMissingProofKyc.e, (wi0.b) null, taxMissingProofKyc.f77504b, true, new KycContract$Requirement(true), (AnalyticsProduct) null, (String) null, (yt8.e) null, (String) null, (String) null, (Set) null, 64800), taxMissingProofKyc.f77505c, 4);
                    } else {
                        m1.Companion.getClass();
                        KycFeatureConfig.TaxMissingProofKyc taxMissingProofKyc2 = (KycFeatureConfig.TaxMissingProofKyc) config;
                        activityNavigateCommand = new ActivityNavigateCommand(b1.f108824b, new KycScreenContract$Configuration(taxMissingProofKyc2.d, (KycFinalCommand) new KycFinalCommand.Success(dummyCommand), (wi0.b) null, taxMissingProofKyc2.f77504b, true, new KycContract$Requirement(true), taxMissingProofKyc2.f77503a, false, (AnalyticsProduct) null, (String) null, taxMissingProofKyc2.e, (yt8.e) null, (String) null, (String) null, false, (Set) null, 128548), null, taxMissingProofKyc2.f77505c, 0, null, null, null, null, false, 1012);
                    }
                }
            }
        }
        navigator.c(naviCommandE);
    }
}
