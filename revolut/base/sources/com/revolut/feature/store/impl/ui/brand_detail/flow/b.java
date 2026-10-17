package com.revolut.feature.store.impl.ui.brand_detail.flow;

import aim.e;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.store.api.model.StoreMegaOffer;
import com.revolut.feature.store.impl.ui.brand_detail.flow.StoreBrandDetailFlowContract$PagerItem;
import gim.i;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import q2e.h;
import vkm.j2;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        aim.b bVar;
        c cVar = this.v;
        y yVar = cVar.T;
        final Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        StoreMegaOffer storeMegaOffer = (StoreMegaOffer) data.getContent();
        final boolean z = (storeMegaOffer != null ? storeMegaOffer.f88550g : null) != null;
        StoreMegaOffer storeMegaOffer2 = (StoreMegaOffer) data.getContent();
        final boolean z3 = (storeMegaOffer2 != null ? storeMegaOffer2.f : null) != null;
        StoreMegaOffer storeMegaOffer3 = (StoreMegaOffer) data.getContent();
        final boolean z4 = (storeMegaOffer3 != null ? storeMegaOffer3.f88551h : null) != null;
        StoreMegaOffer storeMegaOffer4 = (StoreMegaOffer) data.getContent();
        final boolean z6 = (storeMegaOffer4 != null ? storeMegaOffer4.i : null) != null;
        e eVarB = u.b();
        if (z3) {
            eVarB.add(StoreBrandDetailFlowContract$PagerItem.Earn.f88658a);
        }
        if (z) {
            eVarB.add(StoreBrandDetailFlowContract$PagerItem.Redeem.f88660a);
        }
        if (z4) {
            eVarB.add(StoreBrandDetailFlowContract$PagerItem.Msi.f88659a);
        }
        if (z6) {
            eVarB.add(StoreBrandDetailFlowContract$PagerItem.Discount.f88657a);
        }
        final e eVarA = u.a(eVarB);
        String strR2 = ((h) ((j2) yVar.f22677a).getValue()).f241583b;
        if (!eVarA.isEmpty()) {
            if (!Intrinsics.f(strR2, "STORE_BRAND_DETAIL_SELECTED_TAB_PENDING") && !eVarA.isEmpty()) {
                ListIterator listIterator = eVarA.listIterator(0);
                do {
                    bVar = (aim.b) listIterator;
                    if (!bVar.hasNext()) {
                        strR2 = c.R2(cVar.o.f88653c, eVarA, true);
                        break;
                    }
                } while (!((StoreBrandDetailFlowContract$PagerItem) bVar.next()).getF94249a().equals(strR2));
            } else {
                strR2 = c.R2(cVar.o.f88653c, eVarA, true);
                break;
            }
        }
        final String str = strR2;
        cVar.H2(yVar, new Function1() { // from class: q2e.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return h.a((h) obj3, eVarA, str, data, null, null, null, null, z, z3, z4, z6, null, null, null, null, 63608);
            }
        });
        return Unit.f186387a;
    }
}
