package com.revolut.sso.impl.ui.auth;

import com.revolut.sso.api.models.GoogleEvidence;
import gkl.l1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l1 f106360w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar, l1 l1Var, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
        this.f106360w = l1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f106360w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            GoogleEvidence googleEvidence = new GoogleEvidence(this.f106360w.f144464b);
            this.u = 1;
            if (n.Q2(this.v, null, googleEvidence, null, this, 5) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
