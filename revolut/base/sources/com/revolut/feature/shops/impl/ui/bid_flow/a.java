package com.revolut.feature.shops.impl.ui.bid_flow;

import com.revolut.feature.shops.impl.ui.bid_flow.ShopsBidFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import oki.h;
import vgk.g;
import vid.e;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((yja.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        c cVar = this.v;
        ShopsBidFlowContract$InputData shopsBidFlowContract$InputData = cVar.o;
        yki.i iVar = cVar.f87144s;
        yja.b bVar = (yja.b) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        int i = e.f289575a[bVar.ordinal()];
        if (i != 1) {
            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
            if (i == 2) {
                cVar.H2(cVar.f87143r, new g(20));
                h.w2(iVar, new ShopsBidFlowContract$Step.PlaceBid(shopsBidFlowContract$InputData.f87132a, null), bottom_dialog);
            } else {
                if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                h.w2(iVar, new ShopsBidFlowContract$Step.PlaceBid(shopsBidFlowContract$InputData.f87132a, null), bottom_dialog);
            }
        } else {
            cVar.B2();
        }
        return Unit.f186387a;
    }
}
