package jma;

import com.revolut.feature.credit.application.models.initialization_contract.PluginLaunchInstructions;
import com.revolut.feature.credit.application.models.plugins.EntryPointParams;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.profile.api.ProfileApi$Toggles$ProfileEmailMigration;
import com.revolut.feature.profile.api.navigation.ProfileFeatureConfig;
import com.revolut.feature.profile.impl.navigation.ChangeUserDetailsDestination$EmailChange;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.d0;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements sla.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f176501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xq3.k f176502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f176503c;

    public g(sri.m navigator, xq3.k creditEmailVerificationStateInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(creditEmailVerificationStateInteractor, "creditEmailVerificationStateInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f176501a = navigator;
        this.f176502b = creditEmailVerificationStateInteractor;
        this.f176503c = featureToggleInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "email-confirm");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        xq3.k kVar = this.f176502b;
        ReentrantLock reentrantLock = kVar.f308081b;
        reentrantLock.lock();
        try {
            ss3.b bVar = kVar.f308080a;
            reentrantLock.unlock();
            if (bVar == null) {
                return ((jte.d) this.f176503c).c(ProfileApi$Toggles$ProfileEmailMigration.f81317c) ? new q06.h(new BridgeDestination(vhi.c.c(new ChangeUserDetailsDestination$EmailChange(cVar.e(2)), yhi.b.SOLID, null, false, 12)), null) : new q06.h(new BridgeDestination(new FeatureCommand(new ProfileFeatureConfig.EmailVerification(cVar.e(2)))), null);
            }
            String strE = cVar.e(2);
            PluginPayload pluginPayload = bVar.f265262a;
            it3.d status = pluginPayload.f66247a;
            wi0.b countryCode = pluginPayload.f66248b;
            EntryPointParams entryPointParams = pluginPayload.f66249c;
            PluginLaunchInstructions pluginLaunchInstructions = pluginPayload.e;
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(entryPointParams, "entryPointParams");
            return new q06.h(new BridgeDestination(new FeatureCommand(new CreditApplicationKompotFeatureConfig.EmailVerificationContinue(strE, new PluginPayload(status, countryCode, entryPointParams, true, pluginLaunchInstructions), null))), new q06.b(ibb.c.f160140a, null));
        } catch (Throwable th10) {
            reentrantLock.unlock();
            throw th10;
        }
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.c cVar = new ufm.c(new fag.g(this, deeplink, 15), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        return ue0.e.F(cVar, Boolean.FALSE);
    }
}
