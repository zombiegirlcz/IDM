package com.onfido.android.sdk.capture.validation;

import com.onfido.android.sdk.capture.validation.CaptureValidationBubblePresenter;
import com.onfido.android.sdk.capture.validation.OnfidoCaptureValidationBubble;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class CaptureValidationBubblePresenter_Factory_Impl implements CaptureValidationBubblePresenter.Factory {
    private final C2172CaptureValidationBubblePresenter_Factory delegateFactory;

    public CaptureValidationBubblePresenter_Factory_Impl(C2172CaptureValidationBubblePresenter_Factory c2172CaptureValidationBubblePresenter_Factory) {
        this.delegateFactory = c2172CaptureValidationBubblePresenter_Factory;
    }

    @Override // com.onfido.android.sdk.capture.validation.CaptureValidationBubblePresenter.Factory
    public CaptureValidationBubblePresenter create(OnfidoCaptureValidationBubble.BubbleMode bubbleMode, CaptureValidationBubblePresenter.View view) {
        return this.delegateFactory.get(bubbleMode, view);
    }

    public static Provider create(C2172CaptureValidationBubblePresenter_Factory c2172CaptureValidationBubblePresenter_Factory) {
        return new el.c(new CaptureValidationBubblePresenter_Factory_Impl(c2172CaptureValidationBubblePresenter_Factory));
    }
}
