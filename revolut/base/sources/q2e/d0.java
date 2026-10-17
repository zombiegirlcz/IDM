package q2e;

import com.revolut.data.model.Data;
import com.revolut.feature.store.api.model.StoreCampaignOffer;
import java.time.Instant;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.store.impl.ui.brand_detail.flow.c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d0 d0Var = new d0(this.v, continuation);
        d0Var.u = obj2;
        return d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        StoreCampaignOffer storeCampaignOffer;
        String campaignId;
        Instant instantOfEpochMilli;
        Data campaigns = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.store.impl.ui.brand_detail.flow.c cVar = this.v;
        cli.y yVar = cVar.T;
        cVar.H2(yVar, new pvk.b(campaigns, 15));
        a aVar2 = cVar.B;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(campaigns, "campaigns");
        aVar2.f241559a.setValue(campaigns);
        f fVar = (f) campaigns.getContent();
        Object obj3 = null;
        if (fVar != null) {
            StoreCampaignOffer[] elements = {fVar.f241577a, fVar.f241579c};
            Intrinsics.checkNotNullParameter(elements, "elements");
            StoreCampaignOffer storeCampaignOffer2 = (StoreCampaignOffer) zhm.d0.d0(kotlin.collections.d.L(elements));
            if (storeCampaignOffer2 != null && (campaignId = storeCampaignOffer2.f88447a) != null && (!campaignId.equals(cVar.M) || ((h) ((j2) yVar.f22677a).getValue()).f241591p == null)) {
                g2e.g gVar = cVar.A;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(campaignId, "campaignId");
                ue0.c cVar2 = gVar.f139986a;
                Long l2 = (Long) j6.a.k(Long.TYPE, cVar2, g2e.g.a(campaignId));
                if (l2 != null) {
                    instantOfEpochMilli = Instant.ofEpochMilli(l2.longValue());
                    if (!instantOfEpochMilli.isAfter(Instant.now())) {
                        cVar2.I0(g2e.g.a(campaignId));
                        instantOfEpochMilli = null;
                    }
                    cVar.Q2(campaignId, instantOfEpochMilli);
                } else {
                    instantOfEpochMilli = null;
                    cVar.Q2(campaignId, instantOfEpochMilli);
                }
            }
        }
        f fVar2 = (f) campaigns.getContent();
        if (fVar2 == null) {
            cVar.H2(yVar, new q2a.a(7));
        } else {
            StoreCampaignOffer storeCampaignOffer3 = fVar2.f241578b;
            StoreCampaignOffer storeCampaignOffer4 = fVar2.f241577a;
            if ((storeCampaignOffer4 != null && storeCampaignOffer3 != null) || storeCampaignOffer4 != null) {
                storeCampaignOffer = storeCampaignOffer4;
            } else if (storeCampaignOffer3 == null) {
                storeCampaignOffer = fVar2.f241579c;
                if (storeCampaignOffer == null && (storeCampaignOffer = fVar2.d) == null && (storeCampaignOffer = fVar2.f) == null) {
                    storeCampaignOffer = fVar2.e;
                }
            } else {
                storeCampaignOffer = storeCampaignOffer3;
            }
            if (storeCampaignOffer != null) {
                StoreCampaignOffer[] elements2 = {fVar2.e, storeCampaignOffer4, storeCampaignOffer3, fVar2.f241579c, fVar2.d, fVar2.f};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                Iterator it8 = kotlin.collections.d.L(elements2).iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    Object next = it8.next();
                    if (((StoreCampaignOffer) next).A != null) {
                        obj3 = next;
                        break;
                    }
                }
                cVar.H2(yVar, new pth.m((StoreCampaignOffer) obj3, storeCampaignOffer, 29));
            }
        }
        return Unit.f186387a;
    }
}
