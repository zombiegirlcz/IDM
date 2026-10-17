package com.onfido.android.sdk.capture.core;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.onfido.android.sdk.capture.common.SdkController;
import com.onfido.android.sdk.capture.core.di.DaggerOnfidoComponent;
import com.onfido.android.sdk.capture.core.di.OnfidoComponent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/onfido/android/sdk/capture/core/di/OnfidoComponent;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class OnfidoFragment$onfidoComponent$2 extends u implements Function0<OnfidoComponent> {
    final /* synthetic */ OnfidoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnfidoFragment$onfidoComponent$2(OnfidoFragment onfidoFragment) {
        super(0);
        this.this$0 = onfidoFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final OnfidoComponent invoke() {
        final OnfidoFragment onfidoFragment = this.this$0;
        return (OnfidoComponent) new ViewModelProvider(onfidoFragment, new ViewModelProvider.Factory() { // from class: com.onfido.android.sdk.capture.core.OnfidoFragment$onfidoComponent$2$invoke$$inlined$createViewModelFactory$1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            @NotNull
            public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                OnfidoComponent.Factory factory = DaggerOnfidoComponent.factory();
                SdkController companion = SdkController.INSTANCE.getInstance();
                Context contextRequireContext = onfidoFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                OnfidoComponent onfidoComponentCreate = factory.create(SdkController.getSdkComponent$default(companion, contextRequireContext, null, 2, null));
                Intrinsics.i(onfidoComponentCreate, "null cannot be cast to non-null type T of com.onfido.android.sdk.capture.component.utils.ViewModelExtKt.createViewModelFactory.<no name provided>.create");
                return onfidoComponentCreate;
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            @NotNull
            public /* bridge */ /* synthetic */ ViewModel create(@NotNull Class cls, @NotNull CreationExtras creationExtras) {
                return super.create(cls, creationExtras);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            @NotNull
            public /* bridge */ /* synthetic */ ViewModel create(@NotNull KClass kClass, @NotNull CreationExtras creationExtras) {
                return super.create(kClass, creationExtras);
            }
        }).get(OnfidoComponent.class);
    }
}
