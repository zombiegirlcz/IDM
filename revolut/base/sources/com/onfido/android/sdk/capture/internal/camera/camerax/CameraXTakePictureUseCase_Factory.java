package com.onfido.android.sdk.capture.internal.camera.camerax;

import android.content.Context;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class CameraXTakePictureUseCase_Factory implements el.b {
    private final Provider applicationContextProvider;

    public CameraXTakePictureUseCase_Factory(Provider provider) {
        this.applicationContextProvider = provider;
    }

    public static CameraXTakePictureUseCase_Factory create(Provider provider) {
        return new CameraXTakePictureUseCase_Factory(provider);
    }

    public static CameraXTakePictureUseCase newInstance(Context context) {
        return new CameraXTakePictureUseCase(context);
    }

    @Override // com.onfido.javax.inject.Provider
    public CameraXTakePictureUseCase get() {
        return newInstance((Context) this.applicationContextProvider.get());
    }
}
