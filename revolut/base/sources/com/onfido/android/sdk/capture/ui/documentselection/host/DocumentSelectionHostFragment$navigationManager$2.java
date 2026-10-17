package com.onfido.android.sdk.capture.ui.documentselection.host;

import androidx.fragment.app.FragmentManager;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.internal.navigation.navigator.FragmentNavigationManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/onfido/android/sdk/capture/internal/navigation/navigator/FragmentNavigationManager;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class DocumentSelectionHostFragment$navigationManager$2 extends u implements Function0<FragmentNavigationManager> {
    final /* synthetic */ DocumentSelectionHostFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentSelectionHostFragment$navigationManager$2(DocumentSelectionHostFragment documentSelectionHostFragment) {
        super(0);
        this.this$0 = documentSelectionHostFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final FragmentNavigationManager invoke() {
        DocumentSelectionHostFragment documentSelectionHostFragment = this.this$0;
        FragmentManager childFragmentManager = documentSelectionHostFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        return new FragmentNavigationManager(documentSelectionHostFragment, childFragmentManager, R.id.fragmentContainerView);
    }
}
