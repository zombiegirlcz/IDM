package l3e;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucher;
import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsDestination;
import com.revolut.feature.store.api.model.StorePurchase;
import com.revolut.feature.store.impl.ui.orders.StoreOrdersContract$ModalStep;
import com.revolut.feature.store.impl.ui.orders.StoreOrdersScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StoreOrdersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(StoreOrdersScreen storeOrdersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = storeOrdersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f fVarD3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.store.impl.ui.orders.a aVar2 = (com.revolut.feature.store.impl.ui.orders.a) fVarD3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof StorePurchase) {
            oki.h.v2(aVar2.v, new StoreOrdersContract$ModalStep.ItemDetails(k3e.b.e((StorePurchase) obj3)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else if (obj3 instanceof UserVoucher) {
            aVar2.C1(new RevPointsGiftcardsDestination(new RevPointsGiftcardsDestination.StartType.OpenGiftcardsDetails(null, ((UserVoucher) obj3).f83619a, null, null, 13), null));
        }
        return Unit.f186387a;
    }
}
