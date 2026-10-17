package com.onfido.android.sdk.capture.component.active.video.capture.di.host;

import android.content.Context;
import android.content.res.Resources;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionHostModule_ProvideResourcesFactory implements b {
    private final Provider contextProvider;
    private final MotionHostModule module;

    public MotionHostModule_ProvideResourcesFactory(MotionHostModule motionHostModule, Provider provider) {
        this.module = motionHostModule;
        this.contextProvider = provider;
    }

    public static MotionHostModule_ProvideResourcesFactory create(MotionHostModule motionHostModule, Provider provider) {
        return new MotionHostModule_ProvideResourcesFactory(motionHostModule, provider);
    }

    public static Resources provideResources(MotionHostModule motionHostModule, Context context) {
        Resources resourcesProvideResources = motionHostModule.provideResources(context);
        e.g(resourcesProvideResources);
        return resourcesProvideResources;
    }

    @Override // com.onfido.javax.inject.Provider
    public Resources get() {
        return provideResources(this.module, (Context) this.contextProvider.get());
    }
}
