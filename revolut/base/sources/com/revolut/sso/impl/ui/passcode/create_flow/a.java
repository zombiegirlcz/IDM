package com.revolut.sso.impl.ui.passcode.create_flow;

import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.sso.impl.ui.passcode.create_flow.CreatePasscodeFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import oki.h;
import yhm.o;
import znd.u0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ c u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(2, continuation);
        this.u = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = this.u;
        cVar.H2(cVar.f106609r, new u0(1));
        h.t2(cVar, cVar.f106608q, CreatePasscodeFlowContract$Step.Create.f106606a, false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
        return Unit.f186387a;
    }
}
