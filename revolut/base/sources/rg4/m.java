package rg4;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.application.models.preapplication.PreApplicationCheckItem;
import com.revolut.feature.credit.application.models.preapplication.PreApplicationCheckItemId;
import com.revolut.feature.credit.application.plugins.impl.ui.preapplication.PreApplicationChecksScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.preapplication.PreApplicationChecksScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PreApplicationChecksScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(PreApplicationChecksScreen preApplicationChecksScreen, Continuation continuation) {
        super(2, continuation);
        this.v = preApplicationChecksScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model item = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVarE3 = this.v.R2();
        Intrinsics.h(item);
        com.revolut.feature.credit.application.plugins.impl.ui.preapplication.b bVar = (com.revolut.feature.credit.application.plugins.impl.ui.preapplication.b) sVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        Object obj3 = item.u;
        Continuation continuation = null;
        PreApplicationCheckItem preApplicationCheckItem = obj3 instanceof PreApplicationCheckItem ? (PreApplicationCheckItem) obj3 : null;
        if (preApplicationCheckItem != null && (preApplicationCheckItem instanceof PreApplicationCheckItem.Remediable)) {
            PreApplicationCheckItemId preApplicationCheckItemId = ((PreApplicationCheckItem.Remediable) preApplicationCheckItem).f66254a;
            if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.UpdatePhone) {
                oki.h.y2(bVar.f68234t, PreApplicationChecksScreenContract$ModalStep.ChangePhone.f68227a, ModalDestination.Style.FULLSCREEN_FADE.f98307a);
            } else {
                int i = 1;
                if (preApplicationCheckItemId instanceof PreApplicationCheckItemId.NegativeBalance) {
                    bVar.H2(bVar.f68233s, new rg3.d(i));
                    bVar.l2(new w(bVar, null), new yi5.b(26));
                } else if (Intrinsics.f(preApplicationCheckItemId, PreApplicationCheckItemId.DocumentsRemediation.f66256a)) {
                    bVar.l2(new v(bVar, continuation, i), new yi5.b(26));
                }
            }
        }
        return Unit.f186387a;
    }
}
