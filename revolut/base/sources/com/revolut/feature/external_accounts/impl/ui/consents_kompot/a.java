package com.revolut.feature.external_accounts.impl.ui.consents_kompot;

import com.revolut.feature.external_accounts.impl.ui.consents_kompot.OpenBankingConsentsFlowContract$FlowType;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.OpenBankingConsentsFlowContract$Step;
import gim.i;
import gjg.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import pfm.z;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
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
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            ufm.i iVar = new ufm.i(cVar.f72756p.f(false), new e(new gk7.a(19), 21), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            z zVarF = ue0.e.F(iVar, new OpenBankingConsentsFlowContract$Step.ClientsList(OpenBankingConsentsFlowContract$FlowType.Default.f72742a));
            this.u = 1;
            obj2 = nim.a.b(zVarF, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        OpenBankingConsentsFlowContract$Step.ClientsList clientsList = (OpenBankingConsentsFlowContract$Step.ClientsList) obj2;
        yki.i iVar2 = cVar.f72759s;
        Intrinsics.h(clientsList);
        h.t2(cVar, iVar2, clientsList, false, null, false, 12);
        return Unit.f186387a;
    }
}
