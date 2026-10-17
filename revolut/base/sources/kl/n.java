package kl;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResultRegistry;
import com.onfido.android.sdk.capture.OnfidoConfig;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.android.sdk.capture.internal.navigation.navigator.FragmentNavigationManager;
import com.onfido.android.sdk.capture.utils.LifecycleAwareDialog;
import com.onfido.android.sdk.capture.utils.UserExitFlowMenuProvider;
import com.onfido.javax.inject.Provider;
import com.onfido.workflow.internal.ui.WorkflowFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class n extends kotlin.jvm.internal.u implements Function0 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ WorkflowFragment f185199h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(WorkflowFragment workflowFragment, int i) {
        super(0);
        this.f = i;
        this.f185199h = workflowFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f) {
            case 0:
                WorkflowFragment workflowFragment = this.f185199h;
                FragmentNavigationManager navigationManager = workflowFragment.getNavigationManager();
                FragmentManager childFragmentManager = workflowFragment.getChildFragmentManager();
                m mVar = new m(workflowFragment, 0);
                Intrinsics.h(childFragmentManager);
                return new ll.c(navigationManager, mVar, childFragmentManager, new m(workflowFragment, 1));
            case 1:
                return new LifecycleAwareDialog(this.f185199h, (Function1) null, 2, (DefaultConstructorMarker) null);
            case 2:
                WorkflowFragment workflowFragment2 = this.f185199h;
                rl.b workflowIntentFactory = workflowFragment2.getWorkflowIntentFactory();
                ActivityResultRegistry activityResultRegistry = workflowFragment2.requireActivity().getActivityResultRegistry();
                Intrinsics.checkNotNullExpressionValue(activityResultRegistry, "getActivityResultRegistry(...)");
                jpc.e eVar = ((rl.d) workflowIntentFactory).f254902a;
                return new rl.f((Context) ((il.a) eVar.f177256b).get(), (Navigator) ((Provider) eVar.f177257c).get(), (OnfidoConfig) ((il.f) eVar.d).get(), activityResultRegistry);
            case 3:
                c2 workflowViewModel = this.f185199h.getWorkflowViewModel();
                workflowViewModel.f185157w.trackFlowUserExitButtonClicked(c2.e((ml.e) workflowViewModel.c().e()));
                return Unit.f186387a;
            default:
                WorkflowFragment workflowFragment3 = this.f185199h;
                return new UserExitFlowMenuProvider(workflowFragment3.getLifecycleAwareDialog(), 0, new n(workflowFragment3, 3), new m(workflowFragment3, 2), new m(workflowFragment3, 3), 2, null);
        }
    }
}
