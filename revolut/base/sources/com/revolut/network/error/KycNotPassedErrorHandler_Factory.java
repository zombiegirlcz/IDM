package com.revolut.network.error;

import e4m.e;
import ks8.l;
import mt8.a;
import sri.m;

/* JADX INFO: loaded from: classes10.dex */
public final class KycNotPassedErrorHandler_Factory implements e {
    private final e kycFeatureToggleProvider;
    private final e kycPromptNaviCommandFactoryProvider;
    private final e navigatorProvider;
    private final e serverErrorsProvider;

    private KycNotPassedErrorHandler_Factory(e eVar, e eVar2, e eVar3, e eVar4) {
        this.navigatorProvider = eVar;
        this.kycPromptNaviCommandFactoryProvider = eVar2;
        this.serverErrorsProvider = eVar3;
        this.kycFeatureToggleProvider = eVar4;
    }

    public static KycNotPassedErrorHandler_Factory create(e eVar, e eVar2, e eVar3, e eVar4) {
        return new KycNotPassedErrorHandler_Factory(eVar, eVar2, eVar3, eVar4);
    }

    public static KycNotPassedErrorHandler newInstance(m mVar, l lVar, v60.e eVar, a aVar) {
        return new KycNotPassedErrorHandler(mVar, lVar, eVar, aVar);
    }

    @Override // phm.a
    public KycNotPassedErrorHandler get() {
        return newInstance((m) this.navigatorProvider.get(), (l) this.kycPromptNaviCommandFactoryProvider.get(), (v60.e) this.serverErrorsProvider.get(), (a) this.kycFeatureToggleProvider.get());
    }
}
