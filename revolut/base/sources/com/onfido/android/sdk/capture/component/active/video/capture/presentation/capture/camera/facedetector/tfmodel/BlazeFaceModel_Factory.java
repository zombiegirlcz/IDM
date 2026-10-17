package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.camera.facedetector.tfmodel;

import android.content.Context;
import com.onfido.javax.inject.Provider;
import el.b;

/* JADX INFO: loaded from: classes17.dex */
public final class BlazeFaceModel_Factory implements b {
    private final Provider contextProvider;

    public BlazeFaceModel_Factory(Provider provider) {
        this.contextProvider = provider;
    }

    public static BlazeFaceModel_Factory create(Provider provider) {
        return new BlazeFaceModel_Factory(provider);
    }

    public static BlazeFaceModel newInstance(Context context) {
        return new BlazeFaceModel(context);
    }

    @Override // com.onfido.javax.inject.Provider
    public BlazeFaceModel get() {
        return newInstance((Context) this.contextProvider.get());
    }
}
