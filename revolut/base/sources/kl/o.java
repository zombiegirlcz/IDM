package kl;

import androidx.fragment.app.FragmentManager;
import com.onfido.android.sdk.capture.internal.navigation.navigator.FragmentNavigationManager;
import com.onfido.workflow.R;
import com.onfido.workflow.internal.ui.WorkflowFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class o extends kotlin.jvm.internal.u implements Function0 {
    public final /* synthetic */ WorkflowFragment f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(WorkflowFragment workflowFragment) {
        super(0);
        this.f = workflowFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        WorkflowFragment workflowFragment = this.f;
        FragmentManager childFragmentManager = workflowFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        return new FragmentNavigationManager(workflowFragment, childFragmentManager, R.id.fragment_container);
    }
}
