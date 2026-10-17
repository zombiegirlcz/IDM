package com.onfido.android.sdk.capture.common.di;

import android.content.Context;
import android.media.AudioManager;
import com.onfido.javax.inject.Provider;
import el.b;
import n14.e;

/* JADX INFO: loaded from: classes17.dex */
public final class SdkModule_ProvideAudioManagerFactory implements b {
    private final Provider contextProvider;
    private final SdkModule module;

    public SdkModule_ProvideAudioManagerFactory(SdkModule sdkModule, Provider provider) {
        this.module = sdkModule;
        this.contextProvider = provider;
    }

    public static SdkModule_ProvideAudioManagerFactory create(SdkModule sdkModule, Provider provider) {
        return new SdkModule_ProvideAudioManagerFactory(sdkModule, provider);
    }

    public static AudioManager provideAudioManager(SdkModule sdkModule, Context context) {
        AudioManager audioManagerProvideAudioManager = sdkModule.provideAudioManager(context);
        e.g(audioManagerProvideAudioManager);
        return audioManagerProvideAudioManager;
    }

    @Override // com.onfido.javax.inject.Provider
    public AudioManager get() {
        return provideAudioManager(this.module, (Context) this.contextProvider.get());
    }
}
