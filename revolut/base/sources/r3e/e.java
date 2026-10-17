package r3e;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucher;
import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsDestination;
import com.revolut.feature.store.api.model.StoreMegaOffer;
import com.revolut.feature.store.api.model.StoreMegaOfferListItem;
import com.revolut.feature.store.api.model.StorePurchase;
import com.revolut.feature.store.api.model.StoreSearchMegaOffersResponse;
import com.revolut.feature.store.impl.ui.search.StoreSearchScreen;
import com.revolut.feature.store.impl.ui.search.StoreSearchScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StoreSearchScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(StoreSearchScreen storeSearchScreen, Continuation continuation) {
        super(2, continuation);
        this.v = storeSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        Object next;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.store.impl.ui.search.a aVar2 = (com.revolut.feature.store.impl.ui.search.a) kVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        StoreMegaOffer storeMegaOffer = null;
        if (obj3 instanceof m2e.b) {
            m2e.b bVar = (m2e.b) obj3;
            aVar2.f88737r.Z2(bVar);
            Object obj4 = bVar.f201957a;
            String str = obj4 instanceof String ? (String) obj4 : null;
            if (str != null) {
                StoreSearchMegaOffersResponse storeSearchMegaOffersResponse = (StoreSearchMegaOffersResponse) ((h) ((j2) aVar2.v.f22677a).getValue()).f251282b.getContent();
                if (storeSearchMegaOffersResponse != null && (list = storeSearchMegaOffersResponse.f88597a) != null) {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it8.next();
                        if (Intrinsics.f(((StoreMegaOfferListItem) next).f88561a, str)) {
                            break;
                        }
                    }
                    StoreMegaOfferListItem storeMegaOfferListItem = (StoreMegaOfferListItem) next;
                    if (storeMegaOfferListItem != null) {
                        storeMegaOffer = storeMegaOfferListItem.f;
                    }
                }
                aVar2.C2(new i(str, storeMegaOffer, u3e.e.b(((g2e.c) aVar2.f88735p).a(), aVar2.u)));
            }
        } else if (obj3 instanceof StorePurchase) {
            oki.h.v2(aVar2.f88740w, new StoreSearchScreenContract$ModalStep.ItemDetails(k3e.b.e((StorePurchase) obj3)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else if (obj3 instanceof UserVoucher) {
            aVar2.C1(new RevPointsGiftcardsDestination(new RevPointsGiftcardsDestination.StartType.OpenGiftcardsDetails(null, ((UserVoucher) obj3).f83619a, null, null, 13), null));
        }
        return Unit.f186387a;
    }
}
