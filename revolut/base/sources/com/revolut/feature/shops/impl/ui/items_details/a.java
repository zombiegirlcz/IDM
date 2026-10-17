package com.revolut.feature.shops.impl.ui.items_details;

import com.revolut.feature.shops.impl.ui.items_details.ShopsItemsDetailsScreenContract$ModalStep;
import com.revolut.feature.shops.impl.ui.items_details.cancellation.ShopsCancelOrderContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import do3.n;
import efm.d0;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import te0.w;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f87211w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f87211w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f87211w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            d0 d0VarF = bVar.f87214r.f(false);
            this.u = 1;
            obj2 = nim.a.b(d0VarF, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        n nVar = (n) obj2;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = bVar.f87216t;
        Intrinsics.h(nVar);
        String strI = w.I(nVar);
        ShopsItemsDetailsScreenContract$InputData shopsItemsDetailsScreenContract$InputData = bVar.o;
        h.v2(aVar2, new ShopsItemsDetailsScreenContract$ModalStep.Confirmation(new ShopsCancelOrderContract$InputData(this.f87211w, strI, shopsItemsDetailsScreenContract$InputData.f87203a, shopsItemsDetailsScreenContract$InputData.d, shopsItemsDetailsScreenContract$InputData.i, shopsItemsDetailsScreenContract$InputData.f87206g)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
