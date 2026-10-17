package ovb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.RevPointsExclusiveStoreProductCheckoutScreen;
import com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.RevPointsExclusiveStoreProductCheckoutScreenContract$Step;
import com.revolut.feature.store.core.api.model.StoreProduct;
import com.revolut.kompot.common.ModalDestination;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsExclusiveStoreProductCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RevPointsExclusiveStoreProductCheckoutScreen revPointsExclusiveStoreProductCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsExclusiveStoreProductCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Iterable list;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(model.f53228a, "DELIVERY_ADDRESS_ITEM_ID")) {
            com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d dVar = (com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d) this.v.R2();
            StoreProduct storeProduct = (StoreProduct) ((e) ((j2) dVar.f83612y.f22677a).getValue()).f230013a.getContent();
            if (storeProduct == null || (list = storeProduct.f88637n) == null) {
                list = f0.f322471a;
            }
            lvb.c cVar = dVar.v;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(list, "list");
            j2 j2Var = cVar.f200355b;
            Iterable iterable = list;
            ArrayList arrayList = new ArrayList(w.t(iterable, 10));
            Iterator it8 = iterable.iterator();
            while (it8.hasNext()) {
                String upperCase = ((String) it8.next()).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                arrayList.add(upperCase);
            }
            j2Var.setValue(d0.i1(arrayList));
            oki.h.w2(dVar.z, RevPointsExclusiveStoreProductCheckoutScreenContract$Step.AddressUpdate.f83597a, ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
