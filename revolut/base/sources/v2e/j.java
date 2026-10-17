package v2e;

import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.feature.rev_points.exclusive_store.api.navigation.RevPointsExclusiveStoreProductDestination;
import com.revolut.feature.store.api.model.StoreExclusivesOfferContext;
import com.revolut.feature.store.impl.ui.brand_detail.screen.redeem.StoreBrandDetailRedeemScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StoreBrandDetailRedeemScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(StoreBrandDetailRedeemScreen storeBrandDetailRedeemScreen, Continuation continuation) {
        super(2, continuation);
        this.v = storeBrandDetailRedeemScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((NewsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        NewsDelegate.Model model = (NewsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarE3 = this.v.d();
        Object obj3 = model.k;
        i0 i0Var = (i0) vVarE3;
        i0Var.getClass();
        Continuation continuation = null;
        m2e.b bVar = obj3 instanceof m2e.b ? (m2e.b) obj3 : null;
        if (bVar != null) {
            i0Var.z.Z2(bVar);
            Object obj4 = bVar.f201957a;
            StoreExclusivesOfferContext storeExclusivesOfferContext = obj4 instanceof StoreExclusivesOfferContext ? (StoreExclusivesOfferContext) obj4 : null;
            if (storeExclusivesOfferContext != null) {
                if (storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.Product) {
                    str = ((StoreExclusivesOfferContext.Product) storeExclusivesOfferContext).f88515a.f88575c;
                } else {
                    if (!(storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.Auction) && !(storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.SoldOutProduct) && !(storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.LockedProduct) && !(storeExclusivesOfferContext instanceof StoreExclusivesOfferContext.ComingSoonProduct)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = null;
                }
                if (str != null) {
                    i0Var.l2(new v06.i(i0Var, str, continuation, 4), new yi5.b(26));
                } else {
                    i0Var.C1(new RevPointsExclusiveStoreProductDestination(u3e.a.b(storeExclusivesOfferContext)));
                }
            }
        }
        return Unit.f186387a;
    }
}
