package ovb;

import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.store.core.api.model.StoreProduct;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import os9.t;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d f230025w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i, com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f230025w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m mVar = new m(0, this.f230025w, continuation);
                mVar.v = obj2;
                return mVar;
            default:
                m mVar2 = new m(1, this.f230025w, continuation);
                mVar2.v = obj2;
                return mVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m) create((Address) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.rev_points.exclusive_store.impl.ui.screen.checkout.d dVar = this.f230025w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                StoreProduct storeProduct = (StoreProduct) data.getContent();
                dVar.H2(dVar.f83612y, new t(data, (storeProduct != null ? storeProduct.k.size() : 0) > 0 ? new Integer(0) : null, 6));
                break;
            default:
                Address address = (Address) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                dVar.H2(dVar.f83612y, new avj.p(address, 16));
                break;
        }
        return Unit.f186387a;
    }
}
