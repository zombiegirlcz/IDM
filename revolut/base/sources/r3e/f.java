package r3e;

import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.feature.store.api.model.StoreMegaOfferListItem;
import com.revolut.feature.store.impl.ui.search.StoreSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StoreSearchScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(StoreSearchScreen storeSearchScreen, Continuation continuation) {
        super(2, continuation);
        this.v = storeSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RewardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RewardDelegate.Model model = (RewardDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.f53195h;
        m2e.b bVar = obj3 instanceof m2e.b ? (m2e.b) obj3 : null;
        if (bVar != null) {
            com.revolut.feature.store.impl.ui.search.a aVar2 = (com.revolut.feature.store.impl.ui.search.a) this.v.R2();
            aVar2.getClass();
            aVar2.f88737r.Z2(bVar);
            Object obj4 = bVar.f201957a;
            StoreMegaOfferListItem storeMegaOfferListItem = obj4 instanceof StoreMegaOfferListItem ? (StoreMegaOfferListItem) obj4 : null;
            if (storeMegaOfferListItem != null) {
                aVar2.C2(new i(storeMegaOfferListItem.f88561a, storeMegaOfferListItem.f, u3e.e.b(((g2e.c) aVar2.f88735p).a(), aVar2.u)));
            }
        }
        return Unit.f186387a;
    }
}
