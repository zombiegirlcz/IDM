package ebf;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferOutSelectedAsset;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review.TransferOutReviewScreen;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review.TransferOutReviewScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransferOutReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TransferOutReviewScreen transferOutReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transferOutReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review.a aVar2 = (com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review.a) kVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.f51787l instanceof i) {
            com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.u;
            ArrayList arrayList = ((h) ((j2) aVar2.f91649t.f22677a).getValue()).f124324c;
            ArrayList arrayList2 = new ArrayList();
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                dj0.d dVar = ((TransferOutSelectedAsset) it8.next()).f91517a.f;
                if (dVar != null) {
                    arrayList2.add(dVar);
                }
            }
            oki.h.v2(aVar3, new TransferOutReviewScreenContract$ModalStep.FeesBreakdown(arrayList2), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
