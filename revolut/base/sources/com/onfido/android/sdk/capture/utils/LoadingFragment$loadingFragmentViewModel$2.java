package com.onfido.android.sdk.capture.utils;

import a41.h0;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.onfido.android.sdk.capture.ui.widget.LoadingFragmentViewModel;
import com.onfido.android.sdk.capture.utils.LoadingFragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class LoadingFragment$loadingFragmentViewModel$2 extends u implements Function0<ViewModelProvider.Factory> {
    final /* synthetic */ LoadingFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingFragment$loadingFragmentViewModel$2(LoadingFragment loadingFragment) {
        super(0);
        this.this$0 = loadingFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ViewModelProvider.Factory invoke() {
        final LoadingFragment loadingFragment = this.this$0;
        return new ViewModelProvider.Factory() { // from class: com.onfido.android.sdk.capture.utils.LoadingFragment$loadingFragmentViewModel$2$invoke$$inlined$createViewModelFactory$1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            @NotNull
            public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
                Parcelable parcelable;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                LoadingFragmentViewModel.Factory loadingViewModelFactory$onfido_capture_sdk_core_release = loadingFragment.getLoadingViewModelFactory$onfido_capture_sdk_core_release();
                Bundle bundleRequireArguments = loadingFragment.requireArguments();
                Intrinsics.checkNotNullExpressionValue(bundleRequireArguments, "requireArguments(...)");
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) h0.t(bundleRequireArguments);
                } else {
                    Parcelable parcelable2 = bundleRequireArguments.getParcelable("arg_mode");
                    if (!(parcelable2 instanceof LoadingFragment.Companion.DialogMode)) {
                        parcelable2 = null;
                    }
                    parcelable = (LoadingFragment.Companion.DialogMode) parcelable2;
                }
                if (parcelable == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                LoadingFragmentViewModel loadingFragmentViewModelCreate = loadingViewModelFactory$onfido_capture_sdk_core_release.create((LoadingFragment.Companion.DialogMode) parcelable);
                Intrinsics.i(loadingFragmentViewModelCreate, "null cannot be cast to non-null type T of com.onfido.android.sdk.capture.component.utils.ViewModelExtKt.createViewModelFactory.<no name provided>.create");
                return loadingFragmentViewModelCreate;
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
        };
    }
}
