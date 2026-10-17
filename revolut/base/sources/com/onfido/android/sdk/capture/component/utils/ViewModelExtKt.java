package com.onfido.android.sdk.capture.component.utils;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.os.SavedStateRegistryOwner;
import ch.qos.logback.core.net.SyslogConstants;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aB\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\b\u0004\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u00020\tH\u0080\bø\u0001\u0000\u001a(\u0010\u000b\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u000e\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\fH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"createAbstractSavedStateFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "T", "Landroidx/lifecycle/ViewModel;", "savedStateRegistryOwner", "Landroidx/savedstate/SavedStateRegistryOwner;", "defaultArgs", "Landroid/os/Bundle;", "block", "Lkotlin/Function1;", "Landroidx/lifecycle/SavedStateHandle;", "createViewModelFactory", "Lkotlin/Function0;", "onfido-capture-sdk-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ViewModelExtKt {

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.component.utils.ViewModelExtKt$createAbstractSavedStateFactory$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00030\b2\u0006\u0010\t\u001a\u00020\nH\u0014¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"com/onfido/android/sdk/capture/component/utils/ViewModelExtKt$createAbstractSavedStateFactory$1", "Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "create", "T", "Landroidx/lifecycle/ViewModel;", "key", "", "modelClass", "Ljava/lang/Class;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = SyslogConstants.LOG_LOCAL6)
    public static final class AnonymousClass1 extends AbstractSavedStateViewModelFactory {
        final /* synthetic */ Function1<SavedStateHandle, T> $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle, Function1<? super SavedStateHandle, ? extends T> function1) {
            super(savedStateRegistryOwner, bundle);
            this.$block = function1;
        }

        @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
        @NotNull
        public <T extends ViewModel> T create(@NotNull String key, @NotNull Class<T> modelClass, @NotNull SavedStateHandle handle) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(handle, "handle");
            Object objInvoke = this.$block.invoke(handle);
            Intrinsics.i(objInvoke, "null cannot be cast to non-null type T of com.onfido.android.sdk.capture.component.utils.ViewModelExtKt.createAbstractSavedStateFactory.<no name provided>.create");
            return (T) objInvoke;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        @NotNull
        public /* bridge */ /* synthetic */ ViewModel create(@NotNull KClass kClass, @NotNull CreationExtras creationExtras) {
            return super.create(kClass, creationExtras);
        }
    }

    public static final /* synthetic */ <T extends ViewModel> ViewModelProvider.Factory createAbstractSavedStateFactory(SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle, Function1<? super SavedStateHandle, ? extends T> block) {
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "savedStateRegistryOwner");
        Intrinsics.checkNotNullParameter(block, "block");
        return new AnonymousClass1(savedStateRegistryOwner, bundle, block);
    }

    public static /* synthetic */ ViewModelProvider.Factory createAbstractSavedStateFactory$default(SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle, Function1 block, int i, Object obj2) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "savedStateRegistryOwner");
        Intrinsics.checkNotNullParameter(block, "block");
        return new AnonymousClass1(savedStateRegistryOwner, bundle, block);
    }

    @InternalOnfidoApi
    public static final /* synthetic */ <T extends ViewModel> ViewModelProvider.Factory createViewModelFactory(final Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new ViewModelProvider.Factory() { // from class: com.onfido.android.sdk.capture.component.utils.ViewModelExtKt.createViewModelFactory.1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            @NotNull
            public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                Object objInvoke = block.invoke();
                Intrinsics.i(objInvoke, "null cannot be cast to non-null type T of com.onfido.android.sdk.capture.component.utils.ViewModelExtKt.createViewModelFactory.<no name provided>.create");
                return (T) objInvoke;
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
