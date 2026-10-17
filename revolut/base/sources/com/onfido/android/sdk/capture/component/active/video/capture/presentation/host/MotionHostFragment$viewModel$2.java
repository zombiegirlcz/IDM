package com.onfido.android.sdk.capture.component.active.video.capture.presentation.host;

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
public final class MotionHostFragment$viewModel$2 extends u implements Function0<ViewModelProvider.Factory> {
    final /* synthetic */ MotionHostFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionHostFragment$viewModel$2(MotionHostFragment motionHostFragment) {
        super(0);
        this.this$0 = motionHostFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ViewModelProvider.Factory invoke() {
        final MotionHostFragment motionHostFragment = this.this$0;
        final Bundle bundle = null;
        return new AbstractSavedStateViewModelFactory(motionHostFragment, bundle) { // from class: com.onfido.android.sdk.capture.component.active.video.capture.presentation.host.MotionHostFragment$viewModel$2$invoke$$inlined$createAbstractSavedStateFactory$default$1
            @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
            @NotNull
            public <T extends ViewModel> T create(@NotNull String key, @NotNull Class<T> modelClass, @NotNull SavedStateHandle handle) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                Intrinsics.checkNotNullParameter(handle, "handle");
                MotionHostViewModel motionHostViewModelCreate = motionHostFragment.getMotionHostViewModelFactory$onfido_capture_sdk_core_release().create(handle, motionHostFragment.getMotionOptions().getAudioEnabled(), motionHostFragment.getMotionOptions().getShowIntro());
                Intrinsics.i(motionHostViewModelCreate, "null cannot be cast to non-null type T of com.onfido.android.sdk.capture.component.utils.ViewModelExtKt.createAbstractSavedStateFactory.<no name provided>.create");
                return motionHostViewModelCreate;
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            @NotNull
            public /* bridge */ /* synthetic */ ViewModel create(@NotNull KClass kClass, @NotNull CreationExtras creationExtras) {
                return super.create(kClass, creationExtras);
            }
        };
    }
}
