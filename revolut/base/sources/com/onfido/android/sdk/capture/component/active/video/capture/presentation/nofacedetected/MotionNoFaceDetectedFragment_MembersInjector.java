package com.onfido.android.sdk.capture.component.active.video.capture.presentation.nofacedetected;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.OnfidoAnalytics;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionNoFaceDetectedFragment_MembersInjector implements MembersInjector {
    private final Provider analyticsProvider;

    public MotionNoFaceDetectedFragment_MembersInjector(Provider provider) {
        this.analyticsProvider = provider;
    }

    public static MembersInjector create(Provider provider) {
        return new MotionNoFaceDetectedFragment_MembersInjector(provider);
    }

    public static void injectAnalytics(MotionNoFaceDetectedFragment motionNoFaceDetectedFragment, OnfidoAnalytics onfidoAnalytics) {
        motionNoFaceDetectedFragment.analytics = onfidoAnalytics;
    }

    public void injectMembers(MotionNoFaceDetectedFragment motionNoFaceDetectedFragment) {
        injectAnalytics(motionNoFaceDetectedFragment, (OnfidoAnalytics) this.analyticsProvider.get());
    }
}
