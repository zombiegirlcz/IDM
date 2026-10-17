package com.revolut.feature.topup_screen.impl.flows.topup.flow;

import com.revolut.feature.topup_screen.common.CardDetails;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.TopupFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f90938w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f90939x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ CardDetails f90940y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, String str, String str2, CardDetails cardDetails, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
        this.f90938w = str;
        this.f90939x = str2;
        this.f90940y = cardDetails;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, this.f90938w, this.f90939x, this.f90940y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        String str = this.f90938w;
        i iVar = this.v;
        if (i == 0) {
            o.b(obj2);
            jvh.a aVar2 = iVar.Z;
            Map mapK = r0.k(new Pair(ib.b.Flow, "VERIFY_EXTERNAL_CARD"), new Pair("externalCardId", str));
            this.u = 1;
            obj2 = aVar2.b(mapK, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        oki.h.w2(iVar.i0, new TopupFlowContract$Step.CardVerificationWorkflow((String) obj2, str, this.f90939x, this.f90940y), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
        return Unit.f186387a;
    }
}
