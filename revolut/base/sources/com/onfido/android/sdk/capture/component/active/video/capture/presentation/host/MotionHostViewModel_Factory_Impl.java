package com.onfido.android.sdk.capture.component.active.video.capture.presentation.host;

import androidx.lifecycle.SavedStateHandle;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostViewModel;
import com.onfido.javax.inject.Provider;
import el.c;

/* JADX INFO: loaded from: classes17.dex */
public final class MotionHostViewModel_Factory_Impl implements MotionHostViewModel.Factory {
    private final C2003MotionHostViewModel_Factory delegateFactory;

    public MotionHostViewModel_Factory_Impl(C2003MotionHostViewModel_Factory c2003MotionHostViewModel_Factory) {
        this.delegateFactory = c2003MotionHostViewModel_Factory;
    }

    @Override // com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostViewModel.Factory
    public MotionHostViewModel create(SavedStateHandle savedStateHandle, boolean z, boolean z3) {
        return this.delegateFactory.get(savedStateHandle, z, z3);
    }

    public static Provider create(C2003MotionHostViewModel_Factory c2003MotionHostViewModel_Factory) {
        return new c(new MotionHostViewModel_Factory_Impl(c2003MotionHostViewModel_Factory));
    }
}
