package kl;

import android.content.DialogInterface;
import com.onfido.android.sdk.capture.ExitCode;
import com.onfido.workflow.internal.ui.WorkflowFragment;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class m extends kotlin.jvm.internal.u implements Function1 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ WorkflowFragment f185195h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(WorkflowFragment workflowFragment, int i) {
        super(1);
        this.f = i;
        this.f185195h = workflowFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f) {
            case 0:
                List screens = (List) obj2;
                Intrinsics.checkNotNullParameter(screens, "screens");
                this.f185195h.getWorkflowViewModel().b(new ml.s(screens));
                break;
            case 1:
                int iIntValue = ((Number) obj2).intValue();
                WorkflowFragment workflowFragment = this.f185195h;
                boolean z = true;
                if (iIntValue <= 1 && !workflowFragment.toolbarStateShowBackButton) {
                    z = false;
                }
                workflowFragment.setupToolbarBackButton(z);
                break;
            case 2:
                DialogInterface it8 = (DialogInterface) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                WorkflowFragment workflowFragment2 = this.f185195h;
                c2 workflowViewModel = workflowFragment2.getWorkflowViewModel();
                workflowViewModel.f185157w.trackFlowUserExitConfirmed(c2.e((ml.e) workflowViewModel.c().e()));
                workflowFragment2.setFragmentResult(0, new Pair("onfido_exit_code", ExitCode.USER_LEFT_ACTIVITY));
                break;
            default:
                DialogInterface it9 = (DialogInterface) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                c2 workflowViewModel2 = this.f185195h.getWorkflowViewModel();
                workflowViewModel2.f185157w.trackFlowUserExitCanceled(c2.e((ml.e) workflowViewModel2.c().e()));
                break;
        }
        return Unit.f186387a;
    }
}
