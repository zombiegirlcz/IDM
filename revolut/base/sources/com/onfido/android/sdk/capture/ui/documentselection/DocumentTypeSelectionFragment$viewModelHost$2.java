package com.onfido.android.sdk.capture.ui.documentselection;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class DocumentTypeSelectionFragment$viewModelHost$2 extends u implements Function0<ViewModelStoreOwner> {
    final /* synthetic */ DocumentTypeSelectionFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentTypeSelectionFragment$viewModelHost$2(DocumentTypeSelectionFragment documentTypeSelectionFragment) {
        super(0);
        this.this$0 = documentTypeSelectionFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final ViewModelStoreOwner invoke() {
        Fragment fragmentRequireParentFragment = this.this$0.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
        return fragmentRequireParentFragment;
    }
}
