package com.onfido.android.sdk.capture.ui.camera.selfie;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class SelfieCaptureFragment$viewModel$2 extends u implements Function0<ViewModelProvider.Factory> {
    final /* synthetic */ SelfieCaptureFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieCaptureFragment$viewModel$2(SelfieCaptureFragment selfieCaptureFragment) {
        super(0);
        this.this$0 = selfieCaptureFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ViewModelProvider.Factory invoke() {
        final SelfieCaptureFragment selfieCaptureFragment = this.this$0;
        final Bundle bundle = null;
        return new AbstractSavedStateViewModelFactory(selfieCaptureFragment, bundle) { // from class: com.onfido.android.sdk.capture.ui.camera.selfie.SelfieCaptureFragment$viewModel$2$invoke$$inlined$createAbstractSavedStateFactory$default$1
            @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
            @NotNull
            public <T extends ViewModel> T create(@NotNull String key, @NotNull Class<T> modelClass, @NotNull SavedStateHandle handle) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                Intrinsics.checkNotNullParameter(handle, "handle");
                SelfieCaptureViewModel selfieCaptureViewModelCreate = selfieCaptureFragment.getViewModelFactory$onfido_capture_sdk_core_release().create(handle);
                Intrinsics.i(selfieCaptureViewModelCreate, "null cannot be cast to non-null type T of com.onfido.android.sdk.capture.component.utils.ViewModelExtKt.createAbstractSavedStateFactory.<no name provided>.create");
                return selfieCaptureViewModelCreate;
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            @NotNull
            public /* bridge */ /* synthetic */ ViewModel create(@NotNull KClass kClass, @NotNull CreationExtras creationExtras) {
                return super.create(kClass, creationExtras);
            }
        };
    }
}
