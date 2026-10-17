package zc0;

import com.revolut.feature.backend_flow.domain.models.BackendFlowExitDialog;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class w1 extends kotlin.jvm.internal.q implements Function1 {
    public static final w1 f = new w1();

    public w1() {
        super(1, gc0.c.class, "toAlertDialogConfiguration", "toAlertDialogConfiguration(Lcom/revolut/feature/backend_flow/domain/models/BackendFlowExitDialog;)Lcom/revolut/core/ui_kit/dialogs/AlertDialogDisplayer$Configuration;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        BackendFlowExitDialog p0 = (BackendFlowExitDialog) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        return new rp0.b("EXIT_DIALOG_ID", p0.f63276a, p0.f63277b, p0.f63278c, null, p0.d, null, false, 976);
    }
}
