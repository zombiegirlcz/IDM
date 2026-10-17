package com.onfido.android.sdk.capture.internal.usecase;

import android.os.ResultReceiver;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.utils.TimeProvider;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class MediaCallbacksUseCase_Factory implements el.b {
    private final Provider mediaCallbackProvider;
    private final Provider schedulersProvider;
    private final Provider timeProvider;

    public MediaCallbacksUseCase_Factory(Provider provider, Provider provider2, Provider provider3) {
        this.mediaCallbackProvider = provider;
        this.schedulersProvider = provider2;
        this.timeProvider = provider3;
    }

    public static MediaCallbacksUseCase_Factory create(Provider provider, Provider provider2, Provider provider3) {
        return new MediaCallbacksUseCase_Factory(provider, provider2, provider3);
    }

    public static MediaCallbacksUseCase newInstance(ResultReceiver resultReceiver, SchedulersProvider schedulersProvider, TimeProvider timeProvider) {
        return new MediaCallbacksUseCase(resultReceiver, schedulersProvider, timeProvider);
    }

    @Override // com.onfido.javax.inject.Provider
    public MediaCallbacksUseCase get() {
        return newInstance((ResultReceiver) this.mediaCallbackProvider.get(), (SchedulersProvider) this.schedulersProvider.get(), (TimeProvider) this.timeProvider.get());
    }
}
