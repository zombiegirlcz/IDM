package com.onfido.android.sdk.capture.ui.proofOfAddress.documentSelection;

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
public final class PoaDocumentSelectionFragment$viewModel$2 extends u implements Function0<ViewModelProvider.Factory> {
    final /* synthetic */ PoaDocumentSelectionFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PoaDocumentSelectionFragment$viewModel$2(PoaDocumentSelectionFragment poaDocumentSelectionFragment) {
        super(0);
        this.this$0 = poaDocumentSelectionFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ViewModelProvider.Factory invoke() {
        final PoaDocumentSelectionFragment poaDocumentSelectionFragment = this.this$0;
        return new ViewModelProvider.Factory() { // from class: com.onfido.android.sdk.capture.ui.proofOfAddress.documentSelection.PoaDocumentSelectionFragment$viewModel$2$invoke$$inlined$createViewModelFactory$1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            @NotNull
            public <T extends ViewModel> T create(@NotNull Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                PoaDocumentSelectionViewModel poaDocumentSelectionViewModel = (PoaDocumentSelectionViewModel) poaDocumentSelectionFragment.getPoaViewModelFactory().get();
                Intrinsics.i(poaDocumentSelectionViewModel, "null cannot be cast to non-null type T of com.onfido.android.sdk.capture.component.utils.ViewModelExtKt.createViewModelFactory.<no name provided>.create");
                return poaDocumentSelectionViewModel;
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
