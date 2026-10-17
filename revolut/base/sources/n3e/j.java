package n3e;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucher;
import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsDestination;
import com.revolut.feature.store.api.model.StorePurchase;
import com.revolut.feature.store.impl.ui.orders.see_all.StoreOrdersSeeAllContract$InputData;
import com.revolut.feature.store.impl.ui.orders.see_all.StoreOrdersSeeAllContract$ModalStep;
import com.revolut.feature.store.impl.ui.orders.see_all.StoreOrdersSeeAllScreen;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StoreOrdersSeeAllScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(StoreOrdersSeeAllScreen storeOrdersSeeAllScreen, Continuation continuation) {
        super(2, continuation);
        this.v = storeOrdersSeeAllScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVarD3 = this.v.d();
        Intrinsics.h(model);
        Object obj3 = model.u;
        com.revolut.feature.store.impl.ui.orders.see_all.a aVar2 = (com.revolut.feature.store.impl.ui.orders.see_all.a) eVarD3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        StoreOrdersSeeAllContract$InputData storeOrdersSeeAllContract$InputData = aVar2.f88719r;
        if (Intrinsics.f(storeOrdersSeeAllContract$InputData, StoreOrdersSeeAllContract$InputData.Orders.f88715a)) {
            StorePurchase storePurchase = obj3 instanceof StorePurchase ? (StorePurchase) obj3 : null;
            if (storePurchase != null) {
                oki.h.v2(aVar2.v, new StoreOrdersSeeAllContract$ModalStep.ItemDetails(k3e.b.e(storePurchase)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        } else {
            if (!(storeOrdersSeeAllContract$InputData instanceof StoreOrdersSeeAllContract$InputData.GiftCards)) {
                throw new NoWhenBranchMatchedException();
            }
            UserVoucher userVoucher = obj3 instanceof UserVoucher ? (UserVoucher) obj3 : null;
            if (userVoucher != null) {
                aVar2.C1(new RevPointsGiftcardsDestination(new RevPointsGiftcardsDestination.StartType.OpenGiftcardsDetails(null, userVoucher.f83619a, null, null, 13), null));
            }
        }
        return Unit.f186387a;
    }
}
