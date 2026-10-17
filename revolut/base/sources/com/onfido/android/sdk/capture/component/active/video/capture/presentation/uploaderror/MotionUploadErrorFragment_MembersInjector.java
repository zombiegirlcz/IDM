package com.onfido.android.sdk.capture.component.active.video.capture.presentation.uploaderror;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionUploadErrorFragment_MembersInjector implements MembersInjector {
    private final Provider analyticsProvider;

    public MotionUploadErrorFragment_MembersInjector(Provider provider) {
        this.analyticsProvider = provider;
    }

    public static MembersInjector create(Provider provider) {
        return new MotionUploadErrorFragment_MembersInjector(provider);
    }

    public static void injectAnalytics(MotionUploadErrorFragment motionUploadErrorFragment, OnfidoAnalytics onfidoAnalytics) {
        motionUploadErrorFragment.analytics = onfidoAnalytics;
    }

    public void injectMembers(MotionUploadErrorFragment motionUploadErrorFragment) {
        injectAnalytics(motionUploadErrorFragment, (OnfidoAnalytics) this.analyticsProvider.get());
    }
}
