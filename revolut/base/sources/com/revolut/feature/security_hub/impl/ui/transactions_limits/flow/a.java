package com.revolut.feature.security_hub.impl.ui.transactions_limits.flow;

import buc.g;
import com.revolut.feature.security_hub.api.SecurityHubApi$Toggles;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$LimitFlowType;
import fwc.n;
import gim.i;
import gvi.p;
import jte.d;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ gwc.i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(gwc.i iVar, Continuation continuation) {
        super(2, continuation);
        this.v = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        gwc.i iVar = this.v;
        if (i == 0) {
            o.b(obj2);
            g gVar = iVar.o;
            this.u = 1;
            obj2 = gVar.b(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        TransactionsLimitsScreenContract$LimitFlowType transactionsLimitsScreenContract$LimitFlowType = (TransactionsLimitsScreenContract$LimitFlowType) obj2;
        boolean zC = ((d) iVar.f147313p).c(SecurityHubApi$Toggles.JointAccountLimitsHungary.f85368c);
        boolean z = zC && (transactionsLimitsScreenContract$LimitFlowType instanceof TransactionsLimitsScreenContract$LimitFlowType.SepaExtended);
        iVar.H2(iVar.f147315r, new gae.a(transactionsLimitsScreenContract$LimitFlowType, zC, 3));
        if (z) {
            l.a1(iVar, nim.a.v(iVar.f147314q.a(transactionsLimitsScreenContract$LimitFlowType, n.JOINT), new p(4)), null, null, new b(iVar, null), 3);
        }
        return Unit.f186387a;
    }
}
