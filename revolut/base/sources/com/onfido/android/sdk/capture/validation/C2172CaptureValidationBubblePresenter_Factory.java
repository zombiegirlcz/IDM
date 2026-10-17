package com.onfido.android.sdk.capture.validation;

import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.validation.CaptureValidationBubblePresenter;
import com.onfido.android.sdk.capture.validation.OnfidoCaptureValidationBubble;
import com.onfido.javax.inject.Provider;

/* JADX INFO: renamed from: com.onfido.android.sdk.capture.validation.CaptureValidationBubblePresenter_Factory, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C2172CaptureValidationBubblePresenter_Factory {
    private final Provider announcementServiceProvider;
    private final Provider schedulersProvider;

    public C2172CaptureValidationBubblePresenter_Factory(Provider provider, Provider provider2) {
        this.announcementServiceProvider = provider;
        this.schedulersProvider = provider2;
    }

    public static C2172CaptureValidationBubblePresenter_Factory create(Provider provider, Provider provider2) {
        return new C2172CaptureValidationBubblePresenter_Factory(provider, provider2);
    }

    public static CaptureValidationBubblePresenter newInstance(AnnouncementService announcementService, SchedulersProvider schedulersProvider, OnfidoCaptureValidationBubble.BubbleMode bubbleMode, CaptureValidationBubblePresenter.View view) {
        return new CaptureValidationBubblePresenter(announcementService, schedulersProvider, bubbleMode, view);
    }

    public CaptureValidationBubblePresenter get(OnfidoCaptureValidationBubble.BubbleMode bubbleMode, CaptureValidationBubblePresenter.View view) {
        return newInstance((AnnouncementService) this.announcementServiceProvider.get(), (SchedulersProvider) this.schedulersProvider.get(), bubbleMode, view);
    }
}
