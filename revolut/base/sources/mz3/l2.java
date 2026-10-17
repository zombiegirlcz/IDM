package mz3;

import com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig;
import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.models.CreditOfferParcel;
import com.revolut.feature.credit.application.plugins.api.models.config.CreditOfferConfig;
import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.OfferPluginFactory$OfferPluginLaunchInstructions;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.OfferFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.OfferRootFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l2 implements sv3.b, oz3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hw3.e f210632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rx3.a f210633b;

    public l2(hw3.e creditApplicationConfigInteractor, rx3.a creditAnimatedIntroInteractor) {
        Intrinsics.checkNotNullParameter(creditApplicationConfigInteractor, "creditApplicationConfigInteractor");
        Intrinsics.checkNotNullParameter(creditAnimatedIntroInteractor, "creditAnimatedIntroInteractor");
        this.f210632a = creditApplicationConfigInteractor;
        this.f210633b = creditAnimatedIntroInteractor;
    }

    @Override // oz3.b
    public final PluginFlowControllerV2 a(PluginPayload pluginPayload) {
        Intrinsics.checkNotNullParameter(pluginPayload, "pluginPayload");
        PluginLaunchInstructions pluginLaunchInstructions = pluginPayload.e;
        if (!(pluginLaunchInstructions instanceof OfferPluginFactory$OfferPluginLaunchInstructions)) {
            throw new IllegalStateException(m72.b.r("Can't find plugin configuration: ", kotlin.jvm.internal.o0.f186429a.b(OfferPluginFactory$OfferPluginLaunchInstructions.class)));
        }
        OfferPluginFactory$OfferPluginLaunchInstructions offerPluginFactory$OfferPluginLaunchInstructions = (OfferPluginFactory$OfferPluginLaunchInstructions) pluginLaunchInstructions;
        return new OfferRootFlow(new OfferFlowContract$InputData(offerPluginFactory$OfferPluginLaunchInstructions.f66928a, offerPluginFactory$OfferPluginLaunchInstructions.f66929b, io3.h.R(pluginPayload, "")));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oz3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(it3.d r6, com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig r7, grl.r2 r8, wi0.b r9, java.lang.String r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mz3.l2.b(it3.d, com.revolut.feature.credit.application.api.models.CreditApplicationStatusNavigationConfig, grl.r2, wi0.b, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // sv3.b
    public final efm.d0 c(PluginPayload payload, CreditApplicationStatusNavigationConfig navigationConfig) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(navigationConfig, "navigationConfig");
        ju3.a aVar = ju3.a.OFFER;
        rfm.j jVar = new rfm.j(this.f210632a.a(payload.f66247a.f168328j), new ks0.n(new ghk.x(aVar, 27)), 2);
        Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
        ufm.b bVarM = efm.d0.m(new CreditOfferConfig(new CreditOfferParcel(false)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        ufm.i iVar = new ufm.i(jVar.l(bVarM), new s(new mt9.c(payload, this, 21), 16), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
