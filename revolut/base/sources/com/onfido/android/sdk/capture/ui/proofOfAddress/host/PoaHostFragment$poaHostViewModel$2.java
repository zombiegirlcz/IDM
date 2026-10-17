package com.onfido.android.sdk.capture.ui.proofOfAddress.host;

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
public final class PoaHostFragment$poaHostViewModel$2 extends u implements Function0<ViewModelProvider.Factory> {
    final /* synthetic */ PoaHostFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoaHostFragment$poaHostViewModel$2(PoaHostFragment poaHostFragment) {
        super(0);
        this.this$0 = poaHostFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ViewModelProvider.Factory invoke() {
        final PoaHostFragment poaHostFragment = this.this$0;
        final Bundle bundleRequireArguments = poaHostFragment.requireArguments();
        final PoaHostFragment poaHostFragment2 = this.this$0;
        return new AbstractSavedStateViewModelFactory(poaHostFragment, bundleRequireArguments) { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.host.PoaHostFragment$poaHostViewModel$2$invoke$$inlined$createAbstractSavedStateFactory$1
            @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
            @NotNull
            public <T extends ViewModel> T create(@NotNull String key, @NotNull Class<T> modelClass, @NotNull SavedStateHandle handle) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                Intrinsics.checkNotNullParameter(handle, "handle");
                PoaHostViewModel poaHostViewModelCreate = poaHostFragment2.getPoaViewModelFactory$onfido_capture_sdk_core_release().create(handle);
                Intrinsics.i(poaHostViewModelCreate, "null cannot be cast to non-null type T of com.onfido.android.sdk.capture.component.utils.ViewModelExtKt.createAbstractSavedStateFactory.<no name provided>.create");
                return poaHostViewModelCreate;
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            @NotNull
            public /* bridge */ /* synthetic */ ViewModel create(@NotNull KClass kClass, @NotNull CreationExtras creationExtras) {
                return super.create(kClass, creationExtras);
            }
        };
    }
}
