package cea;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pockets.impl.details_v2.linked_account_details.LinkedAccountDetailsScreen;
import com.revolut.feature.pockets.impl.details_v2.linked_account_details.LinkedAccountDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ LinkedAccountDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LinkedAccountDetailsScreen linkedAccountDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = linkedAccountDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.pockets.impl.details_v2.linked_account_details.a aVar2 = (com.revolut.feature.pockets.impl.details_v2.linked_account_details.a) kVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53228a, "LIST_ID_ACTION_REVOKE")) {
            String str = aVar2.o.f80812a.f163154p;
            if (str == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Institution name should present for linked account");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                str = "";
            }
            oki.h.v2(aVar2.J, new LinkedAccountDetailsScreenContract$ModalStep.RevokeConfirmation(str), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
