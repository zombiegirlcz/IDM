package mx0;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.ButtonsActionsView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class p2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ButtonsActionsView f209920b;

    public /* synthetic */ p2(ButtonsActionsView buttonsActionsView, int i) {
        this.f209919a = i;
        this.f209920b = buttonsActionsView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        aw0.p0 p0Var;
        aw0.p0 p0Var2;
        switch (this.f209919a) {
            case 0:
                RowDelegate.Model model = (RowDelegate.Model) obj2;
                ButtonsActionsView buttonsActionsView = this.f209920b;
                rp0.m mVar = buttonsActionsView.f58373g;
                if (mVar != null) {
                    mVar.b(false);
                }
                e01.a aVar = buttonsActionsView.e;
                Object obj3 = model.u;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.core.ui_kit.models.ButtonsAction");
                aVar.b((aw0.p0) obj3);
                return Unit.f186387a;
            case 1:
                ButtonsActionsView buttonsActionsView2 = this.f209920b;
                aw0.q0 q0Var = buttonsActionsView2.f;
                if (q0Var != null && (p0Var = q0Var.f10478a) != null) {
                    buttonsActionsView2.e.b(p0Var);
                }
                return Unit.f186387a;
            case 2:
                ButtonsActionsView buttonsActionsView3 = this.f209920b;
                aw0.q0 q0Var2 = buttonsActionsView3.f;
                if (q0Var2 != null && (p0Var2 = q0Var2.f10479b) != null) {
                    buttonsActionsView3.e.b(p0Var2);
                }
                return Unit.f186387a;
            default:
                return ButtonsActionsView.a(this.f209920b);
        }
    }
}
