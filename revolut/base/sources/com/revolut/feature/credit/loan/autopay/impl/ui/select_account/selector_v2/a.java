package com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2;

import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.SelectAccountV2ControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import do3.n;
import gim.i;
import j45.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import te0.w;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            j jVar = new j(bVar, null, 0);
            this.u = 1;
            obj2 = bVar.p2(this, jVar);
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
        com.revolut.kompot.navigable.vc.modal.a aVar2 = bVar.u;
        Intrinsics.h(nVar);
        h.v2(aVar2, new SelectAccountV2ControllerContract$ModalStep.AddExternalAccount(w.I(nVar)), ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
