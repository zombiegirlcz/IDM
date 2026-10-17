package com.onfido.android.sdk.capture.validation;

import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.validation.CaptureValidationBubblePresenter;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class OnfidoCaptureValidationBubble_MembersInjector implements MembersInjector {
    private final Provider announcementServiceProvider;
    private final Provider captureValidationBubblePresenterFactoryProvider;

    public OnfidoCaptureValidationBubble_MembersInjector(Provider provider, Provider provider2) {
        this.captureValidationBubblePresenterFactoryProvider = provider;
        this.announcementServiceProvider = provider2;
    }

    public static MembersInjector create(Provider provider, Provider provider2) {
        return new OnfidoCaptureValidationBubble_MembersInjector(provider, provider2);
    }

    public static void injectAnnouncementService(OnfidoCaptureValidationBubble onfidoCaptureValidationBubble, AnnouncementService announcementService) {
        onfidoCaptureValidationBubble.announcementService = announcementService;
    }

    public static void injectCaptureValidationBubblePresenterFactory(OnfidoCaptureValidationBubble onfidoCaptureValidationBubble, CaptureValidationBubblePresenter.Factory factory) {
        onfidoCaptureValidationBubble.captureValidationBubblePresenterFactory = factory;
    }

    public void injectMembers(OnfidoCaptureValidationBubble onfidoCaptureValidationBubble) {
        injectCaptureValidationBubblePresenterFactory(onfidoCaptureValidationBubble, (CaptureValidationBubblePresenter.Factory) this.captureValidationBubblePresenterFactoryProvider.get());
        injectAnnouncementService(onfidoCaptureValidationBubble, (AnnouncementService) this.announcementServiceProvider.get());
    }
}
