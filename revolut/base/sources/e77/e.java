package e77;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.giro.impl.ui.review.DirectDebitReviewScreen;
import com.revolut.feature.giro.impl.ui.review.DirectDebitReviewScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DirectDebitReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DirectDebitReviewScreen directDebitReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = directDebitReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.Q.getValue();
        String listId = model.f51781a;
        com.revolut.feature.giro.impl.ui.review.a aVar2 = (com.revolut.feature.giro.impl.ui.review.a) hVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ID_POCKET_SELECTOR_ID")) {
            oki.h.v2(aVar2.f74561r, new DirectDebitReviewScreenContract$ModalStep.PocketSelector(((f) ((j2) aVar2.f74560q.f22677a).getValue()).f123093b), ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
