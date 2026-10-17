package com.onfido.android.sdk.capture.ui.camera.face;

import com.onfido.android.sdk.capture.utils.ImageUtils;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class FaceConfirmationFragment_MembersInjector implements MembersInjector {
    private final Provider imageUtilsProvider;

    public FaceConfirmationFragment_MembersInjector(Provider provider) {
        this.imageUtilsProvider = provider;
    }

    public static MembersInjector create(Provider provider) {
        return new FaceConfirmationFragment_MembersInjector(provider);
    }

    public static void injectImageUtils(FaceConfirmationFragment faceConfirmationFragment, ImageUtils imageUtils) {
        faceConfirmationFragment.imageUtils = imageUtils;
    }

    public void injectMembers(FaceConfirmationFragment faceConfirmationFragment) {
        injectImageUtils(faceConfirmationFragment, (ImageUtils) this.imageUtilsProvider.get());
    }
}
