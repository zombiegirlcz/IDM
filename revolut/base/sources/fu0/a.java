package fu0;

import androidx.view.OnBackPressedCallback;
import com.onfido.workflow.internal.ui.WorkflowFragment;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.core.ui_kit.views.video.ZoomableFullScreenVideoView;
import ml.r;
import rp0.s1;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends OnBackPressedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f138050b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, Object obj2, boolean z) {
        super(false);
        this.f138049a = i;
        this.f138050b = obj2;
    }

    @Override // androidx.view.OnBackPressedCallback
    public final void handleOnBackPressed() {
        int i = this.f138049a;
        Object obj2 = this.f138050b;
        switch (i) {
            case 0:
                e eVar = (e) obj2;
                b bVar = eVar.f138060j;
                if (bVar != null) {
                    ((rr0.g) bVar).d(eVar);
                }
                break;
            case 1:
                int i2 = ZoomableFullScreenVideoView.C;
                ((ZoomableFullScreenVideoView) obj2).f(false);
                break;
            case 2:
                WorkflowFragment workflowFragment = (WorkflowFragment) obj2;
                workflowFragment.getWorkflowViewModel().b(new r(workflowFragment.getNavigationManager().getCurrentScreensSnapshot()));
                break;
            case 3:
                ((com.revolut.core.ui_kit.internal.views.floatingbottombar.a) obj2).d(false);
                break;
            case 4:
                s1 s1Var = (s1) obj2;
                if (s1Var.i) {
                    s1Var.d(true);
                    s1Var.f256166b.m();
                }
                break;
            default:
                ((ReactionsKeyboardView) obj2).G();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, int i) {
        super(true);
        this.f138049a = i;
        this.f138050b = obj2;
    }
}
