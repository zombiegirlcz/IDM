package com.revolut.sso.impl.ui.combined_authentication.flow;

import bjl.n;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$Step;
import gim.i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import mll.d0;
import oki.h;
import rd0.d;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
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
        CombinedAuthenticationFlowContract$Step combinedAuthenticationFlowContract$Step;
        CombinedAuthenticationFlowContract$Step combinedAuthenticationFlowContract$StepS2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        CombinedAuthenticationFlowContract$Step combinedAuthenticationFlowContract$Step2 = null;
        c cVar = this.v;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, e2, h0Var);
        }
        if (i == 0) {
            o.b(obj2);
            n nVar = cVar.f106425p.f;
            int i2 = nVar == null ? -1 : d0.f207049a[nVar.ordinal()];
            if (i2 == -1) {
                combinedAuthenticationFlowContract$StepS2 = cVar.S2();
            } else if (i2 == 1) {
                this.u = 1;
                obj2 = c.I2(cVar, this);
                if (obj2 == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                combinedAuthenticationFlowContract$StepS2 = new CombinedAuthenticationFlowContract$Step.OpenSignIn(null);
            }
            combinedAuthenticationFlowContract$Step = combinedAuthenticationFlowContract$StepS2;
            h.t2(cVar, cVar.H, combinedAuthenticationFlowContract$Step, false, TransitionAnimation.NONE.f98393a, false, 8);
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        combinedAuthenticationFlowContract$Step2 = (CombinedAuthenticationFlowContract$Step) obj2;
        if (combinedAuthenticationFlowContract$Step2 != null) {
            combinedAuthenticationFlowContract$Step = combinedAuthenticationFlowContract$Step2;
            h.t2(cVar, cVar.H, combinedAuthenticationFlowContract$Step, false, TransitionAnimation.NONE.f98393a, false, 8);
            return Unit.f186387a;
        }
        combinedAuthenticationFlowContract$StepS2 = cVar.S2();
        combinedAuthenticationFlowContract$Step = combinedAuthenticationFlowContract$StepS2;
        h.t2(cVar, cVar.H, combinedAuthenticationFlowContract$Step, false, TransitionAnimation.NONE.f98393a, false, 8);
        return Unit.f186387a;
    }
}
