package v2e;

import com.revolut.data.model.Data;
import com.revolut.feature.store.api.model.StoreCampaignOffer;
import com.revolut.feature.store.api.model.StoreMegaOffer;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes7.dex */
public final class z extends gim.i implements Function3 {
    public /* synthetic */ Data u;
    public /* synthetic */ Data v;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        z zVar = new z(3, (Continuation) obj4);
        zVar.u = (Data) obj2;
        zVar.v = (Data) obj3;
        return zVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        q qVar;
        StoreMegaOffer.StoreRedeem storeRedeem;
        StoreMegaOffer.StoreRedeem storeRedeem2;
        Data data = this.u;
        Data data2 = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        StoreMegaOffer storeMegaOffer = (StoreMegaOffer) data2.getContent();
        StoreCampaignOffer storeCampaignOffer = null;
        boolean z = false;
        boolean z3 = ((storeMegaOffer == null || (storeRedeem2 = storeMegaOffer.f88550g) == null) ? null : storeRedeem2.f88558a) != null;
        StoreMegaOffer storeMegaOffer2 = (StoreMegaOffer) data2.getContent();
        boolean z4 = ((storeMegaOffer2 == null || (storeRedeem = storeMegaOffer2.f88550g) == null) ? null : storeRedeem.f88559b) != null;
        if (!data2.getLoading() && data2.getContent() != null) {
            z = true;
        }
        if (!z3 && !z4 && z && (qVar = (q) data.getContent()) != null) {
            storeCampaignOffer = qVar.f285724a;
        }
        return new Pair(data, storeCampaignOffer);
    }
}
