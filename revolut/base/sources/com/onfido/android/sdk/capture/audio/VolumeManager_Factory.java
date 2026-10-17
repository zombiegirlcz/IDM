package com.onfido.android.sdk.capture.audio;

import android.media.AudioManager;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class VolumeManager_Factory implements b {
    private final Provider audioManagerProvider;

    public VolumeManager_Factory(Provider provider) {
        this.audioManagerProvider = provider;
    }

    public static VolumeManager_Factory create(Provider provider) {
        return new VolumeManager_Factory(provider);
    }

    public static VolumeManager newInstance(AudioManager audioManager) {
        return new VolumeManager(audioManager);
    }

    @Override // com.onfido.javax.inject.Provider
    public VolumeManager get() {
        return newInstance((AudioManager) this.audioManagerProvider.get());
    }
}
