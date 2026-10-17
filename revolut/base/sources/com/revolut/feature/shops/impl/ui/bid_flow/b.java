package com.revolut.feature.shops.impl.ui.bid_flow;

import com.revolut.feature.shops.impl.ui.bid_flow.ShopsBidFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import oki.h;
import vgk.g;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ c u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = cVar;
        this.v = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = this.u;
        cVar.H2(cVar.f87143r, new g(21));
        h.w2(cVar.f87144s, new ShopsBidFlowContract$Step.PlaceBid(this.v, null), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
