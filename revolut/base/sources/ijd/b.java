package ijd;

import aw0.n6;
import com.revolut.data.model.Data;
import com.revolut.feature.shops.impl.ui.items_details.ShopsItemsDetailsScreen;
import com.revolut.feature.shops.impl.ui.items_details.ShopsItemsDetailsScreenContract$ModalStep;
import com.revolut.feature.store.api.model.StorePurchaseDetailsResponse;
import com.revolut.feature.store.core.api.StoreCoreApi$Toggles$StoreDMD2Compliance;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import skm.a2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ShopsItemsDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(ShopsItemsDetailsScreen shopsItemsDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = shopsItemsDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a2 a2Var;
        Data data;
        StorePurchaseDetailsResponse storePurchaseDetailsResponse;
        String str;
        int i = this.u;
        ShopsItemsDetailsScreen shopsItemsDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.shops.impl.ui.items_details.b bVar = (com.revolut.feature.shops.impl.ui.items_details.b) ((d) shopsItemsDetailsScreen.Q.getValue());
                if (((jte.d) bVar.f87213q).c(StoreCoreApi$Toggles$StoreDMD2Compliance.f88626c) && (((a2Var = bVar.f87215s) == null || !a2Var.d()) && (data = ((c) ((j2) bVar.getState().f22677a).getValue()).f161774h) != null && (storePurchaseDetailsResponse = (StorePurchaseDetailsResponse) data.getContent()) != null && storePurchaseDetailsResponse.f88586g && (str = bVar.o.f87207h) != null)) {
                    if (storePurchaseDetailsResponse.f88587h) {
                        oki.h.v2(bVar.f87216t, ShopsItemsDetailsScreenContract$ModalStep.Shipped.f87210a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    } else {
                        bVar.f87215s = bVar.A1(new com.revolut.feature.shops.impl.ui.items_details.a(bVar, str, null), new yi5.b(25));
                    }
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.shops.impl.ui.items_details.b) ((d) shopsItemsDetailsScreen.Q.getValue())).B2();
                break;
        }
        return Unit.f186387a;
    }
}
