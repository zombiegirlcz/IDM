package lb0;

import com.revolut.core.backend_flow.R$string;
import com.revolut.core.backend_flow.impl.ui.form_screen.FormController;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.backend_flow.domain.models.BackendFlowFile;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import zc0.x3;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FormController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(FormController formController, Continuation continuation) {
        super(2, continuation);
        this.v = formController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarK3 = this.v.k3();
        Intrinsics.h(model);
        com.revolut.core.backend_flow.impl.ui.form_screen.a aVar2 = (com.revolut.core.backend_flow.impl.ui.form_screen.a) qVarK3;
        r0 r0Var = aVar2.f51284t;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        Continuation continuation = null;
        x3 x3Var = obj3 instanceof x3 ? (x3) obj3 : null;
        if (x3Var != null) {
            String str = x3Var.f321156a;
            BackendFlowFile backendFlowFile = x3Var.f321157b;
            if (backendFlowFile.d != null) {
                r0Var.getClass();
                yji.l.a1(aVar2, aVar2.X1(new y0(null, new nii.l0(new TextLocalisedClause(R$string.form_builder_uploading_remove_upload_title, null, null, 14), null, null, new TextLocalisedClause(R$string.form_builder_uploading_remove_upload_remove, null, null, 14), new TextLocalisedClause(R$string.form_builder_uploading_remove_upload_cancel, null, null, 14), null, false, null, 998), false, 5)), null, null, new c0(aVar2, str, backendFlowFile, continuation, 0), 3);
            } else {
                r0Var.getClass();
                yji.l.a1(aVar2, aVar2.X1(new y0(null, new nii.z(new TextLocalisedClause(R$string.form_builder_uploading_failed_title, null, null, 14), new TextLocalisedClause(R$string.form_builder_uploading_failed_description, null, null, 14), new TextLocalisedClause(R$string.form_builder_uploading_failed_retry, null, null, 14), new TextLocalisedClause(R$string.form_builder_uploading_failed_remove_upload, null, null, 14), null, null, false, null, null, null, null, null, null, 32724), false, 5)), null, null, new c0(aVar2, str, backendFlowFile, continuation, 1), 3);
            }
        }
        return Unit.f186387a;
    }
}
