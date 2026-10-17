package com.onfido.android.sdk.capture.ui.camera.selfie;

import androidx.lifecycle.SavedStateHandle;
import com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureViewModel;
import com.onfido.javax.inject.Provider;
import el.c;

/* JADX INFO: loaded from: classes17.dex */
public final class SelfieCaptureViewModel_Factory_Impl implements SelfieCaptureViewModel.Factory {
    private final C2126SelfieCaptureViewModel_Factory delegateFactory;

    public SelfieCaptureViewModel_Factory_Impl(C2126SelfieCaptureViewModel_Factory c2126SelfieCaptureViewModel_Factory) {
        this.delegateFactory = c2126SelfieCaptureViewModel_Factory;
    }

    @Override // com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureViewModel.Factory
    public SelfieCaptureViewModel create(SavedStateHandle savedStateHandle) {
        return this.delegateFactory.get(savedStateHandle);
    }

    public static Provider create(C2126SelfieCaptureViewModel_Factory c2126SelfieCaptureViewModel_Factory) {
        return new c(new SelfieCaptureViewModel_Factory_Impl(c2126SelfieCaptureViewModel_Factory));
    }
}
