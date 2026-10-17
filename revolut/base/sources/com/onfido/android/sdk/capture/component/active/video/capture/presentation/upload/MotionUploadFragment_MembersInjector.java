package com.onfido.android.sdk.capture.component.active.video.capture.presentation.upload;

import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionUploadFragment_MembersInjector implements MembersInjector {
    private final Provider viewModelProvider;

    public MotionUploadFragment_MembersInjector(Provider provider) {
        this.viewModelProvider = provider;
    }

    public static MembersInjector create(Provider provider) {
        return new MotionUploadFragment_MembersInjector(provider);
    }

    public static void injectViewModelProvider(MotionUploadFragment motionUploadFragment, Provider provider) {
        motionUploadFragment.viewModelProvider = provider;
    }

    public void injectMembers(MotionUploadFragment motionUploadFragment) {
        injectViewModelProvider(motionUploadFragment, this.viewModelProvider);
    }
}
