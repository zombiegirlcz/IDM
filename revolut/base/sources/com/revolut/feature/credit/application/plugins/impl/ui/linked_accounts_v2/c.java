package com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2;

import av3.h;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.CreditLinkedAccountsV2FlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import ft3.h1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kp0.w0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            h1 h1VarF = w0.F(dVar.f67840p.f67826a);
            this.u = 1;
            obj2 = dVar.p2(this, new ad4.b(dVar, h1VarF, null, 3));
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h hVar = (h) obj2;
        if (hVar == null) {
            return Unit.f186387a;
        }
        oki.h.w2(dVar.f67845w, new CreditLinkedAccountsV2FlowContract$Step.Modal.Permissions(hVar), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        return Unit.f186387a;
    }
}
