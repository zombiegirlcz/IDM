package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util;

import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class AvcTimer_Factory implements b {
    private final Provider schedulersProvider;

    public AvcTimer_Factory(Provider provider) {
        this.schedulersProvider = provider;
    }

    public static AvcTimer_Factory create(Provider provider) {
        return new AvcTimer_Factory(provider);
    }

    public static AvcTimer newInstance(SchedulersProvider schedulersProvider) {
        return new AvcTimer(schedulersProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public AvcTimer get() {
        return newInstance((SchedulersProvider) this.schedulersProvider.get());
    }
}
