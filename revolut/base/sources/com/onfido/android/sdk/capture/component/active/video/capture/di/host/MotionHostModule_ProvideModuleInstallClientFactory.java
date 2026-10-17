package com.onfido.android.sdk.capture.component.active.video.capture.di.host;

import android.content.Context;
import com.google.android.gms.common.moduleinstall.ModuleInstallClient;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionHostModule_ProvideModuleInstallClientFactory implements b {
    private final Provider contextProvider;
    private final MotionHostModule module;

    public MotionHostModule_ProvideModuleInstallClientFactory(MotionHostModule motionHostModule, Provider provider) {
        this.module = motionHostModule;
        this.contextProvider = provider;
    }

    public static MotionHostModule_ProvideModuleInstallClientFactory create(MotionHostModule motionHostModule, Provider provider) {
        return new MotionHostModule_ProvideModuleInstallClientFactory(motionHostModule, provider);
    }

    public static ModuleInstallClient provideModuleInstallClient(MotionHostModule motionHostModule, Context context) {
        ModuleInstallClient moduleInstallClientProvideModuleInstallClient = motionHostModule.provideModuleInstallClient(context);
        e.g(moduleInstallClientProvideModuleInstallClient);
        return moduleInstallClientProvideModuleInstallClient;
    }

    @Override // com.onfido.javax.inject.Provider
    public ModuleInstallClient get() {
        return provideModuleInstallClient(this.module, (Context) this.contextProvider.get());
    }
}
