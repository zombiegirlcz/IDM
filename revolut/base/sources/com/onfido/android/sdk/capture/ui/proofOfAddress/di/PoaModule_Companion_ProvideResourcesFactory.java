package com.onfido.android.sdk.capture.ui.proofOfAddress.di;

import android.content.Context;
import android.content.res.Resources;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class PoaModule_Companion_ProvideResourcesFactory implements b {
    private final Provider contextProvider;

    public PoaModule_Companion_ProvideResourcesFactory(Provider provider) {
        this.contextProvider = provider;
    }

    public static PoaModule_Companion_ProvideResourcesFactory create(Provider provider) {
        return new PoaModule_Companion_ProvideResourcesFactory(provider);
    }

    public static Resources provideResources(Context context) {
        Resources resourcesProvideResources = PoaModule.INSTANCE.provideResources(context);
        e.g(resourcesProvideResources);
        return resourcesProvideResources;
    }

    @Override // com.onfido.javax.inject.Provider
    public Resources get() {
        return provideResources((Context) this.contextProvider.get());
    }
}
