package com.onfido.android.sdk.capture.internal.camera.camerax;

import android.content.Context;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class CameraXTakeVideoUseCase_Factory implements el.b {
    private final Provider applicationContextProvider;

    public CameraXTakeVideoUseCase_Factory(Provider provider) {
        this.applicationContextProvider = provider;
    }

    public static CameraXTakeVideoUseCase_Factory create(Provider provider) {
        return new CameraXTakeVideoUseCase_Factory(provider);
    }

    public static CameraXTakeVideoUseCase newInstance(Context context) {
        return new CameraXTakeVideoUseCase(context);
    }

    @Override // com.onfido.javax.inject.Provider
    public CameraXTakeVideoUseCase get() {
        return newInstance((Context) this.applicationContextProvider.get());
    }
}
