package dv4;

import com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow.CreditCardSelectDueDateFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import ds4.y;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow.b f118028b;

    public /* synthetic */ c(com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow.b bVar, int i) {
        this.f118027a = i;
        this.f118028b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f118027a;
        com.revolut.feature.credit.card.impl.ui.settings.select_due_date_flow.b bVar = this.f118028b;
        switch (i) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                h.w2(bVar.f69650r, CreditCardSelectDueDateFlowContract$Step.Error.f69639a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                return Boolean.TRUE;
            default:
                gu4.d result = (gu4.d) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof gu4.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar.n2(new y(bVar, null, 2), new whi.b(6));
                return Unit.f186387a;
        }
    }
}
