package com.revolut.sso.impl.ui.combined_authentication.flow;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$Step;
import gim.i;
import java.util.Collection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import pjl.z0;
import rqk.k;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            uil.a aVar2 = cVar.f106428s;
            ((k) cVar.f106429t).getClass();
            cjl.b bVar = cjl.b.RETAIL;
            this.u = 1;
            obj2 = ((z0) aVar2).i(bVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (!((Collection) obj2).isEmpty()) {
            h.w2(cVar.H, CombinedAuthenticationFlowContract$Step.ExistingAccountsChooser.f106416a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
