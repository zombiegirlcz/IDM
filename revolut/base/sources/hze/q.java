package hze;

import com.revolut.domain.models.topup.TopUpContext;
import com.revolut.feature.topup_screen.api.descriptor.CardTopUpType;
import com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData;
import e0f.e1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CardTopUpType.RegularTopUp f157171w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c cVar, CardTopUpType.RegularTopUp regularTopUp, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f157171w = regularTopUp;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new q(this.v, this.f157171w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((q) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c cVar = this.v;
        FacadeCardTopupFlowDescriptor$InputData facadeCardTopupFlowDescriptor$InputData = cVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            p71.a aVar2 = cVar.f90983p;
            String str = facadeCardTopupFlowDescriptor$InputData.f90494b;
            dj0.d dVar = this.f157171w.f90489a;
            long j2 = dVar.f115082a;
            String str2 = dVar.f115083b.f306286a;
            io3.l lVarB = e1f.c.b(facadeCardTopupFlowDescriptor$InputData.f90495c);
            TopUpContext topUpContextD = facadeCardTopupFlowDescriptor$InputData.d;
            if (topUpContextD == null) {
                topUpContextD = e1f.c.d(facadeCardTopupFlowDescriptor$InputData.f90495c);
            }
            efm.r rVarG = m70.a.g(((u21.k) aVar2).f(new t61.k(str, j2, str2, lVarB, topUpContextD)), null, new hy2.b(15), 1);
            this.u = 1;
            obj2 = nim.a.c(rVarG, this);
            if (obj2 != aVar) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        cue.d dVar2 = (cue.d) obj2;
        e1 e1Var = cVar.u;
        Intrinsics.h(dVar2);
        this.u = 2;
        Object objA = e1Var.a(dVar2, this);
        return objA == aVar ? aVar : objA;
    }
}
