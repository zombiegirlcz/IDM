package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util;

import android.content.Context;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class MicAvailabilityHelper_Factory implements b {
    private final Provider contextProvider;

    public MicAvailabilityHelper_Factory(Provider provider) {
        this.contextProvider = provider;
    }

    public static MicAvailabilityHelper_Factory create(Provider provider) {
        return new MicAvailabilityHelper_Factory(provider);
    }

    public static MicAvailabilityHelper newInstance(Context context) {
        return new MicAvailabilityHelper(context);
    }

    @Override // com.onfido.javax.inject.Provider
    public MicAvailabilityHelper get() {
        return newInstance((Context) this.contextProvider.get());
    }
}
