package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.viewmodel.util;

import android.content.Context;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class AudioFocusHelper_Factory implements b {
    private final Provider contextProvider;

    public AudioFocusHelper_Factory(Provider provider) {
        this.contextProvider = provider;
    }

    public static AudioFocusHelper_Factory create(Provider provider) {
        return new AudioFocusHelper_Factory(provider);
    }

    public static AudioFocusHelper newInstance(Context context) {
        return new AudioFocusHelper(context);
    }

    @Override // com.onfido.javax.inject.Provider
    public AudioFocusHelper get() {
        return newInstance((Context) this.contextProvider.get());
    }
}
