package com.revolut.feature.profile.impl.ui.details.email;

import com.revolut.feature.profile.impl.ui.details.email.VerifyEmailFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import sma.d;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f81384w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f81384w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f81384w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        String str = this.f81384w;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            pfm.a aVarL = cVar.f81385p.l(str);
            this.u = 1;
            if (nim.a.a(aVarL, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        cVar.H2(cVar.u, new d(cVar, 2));
        h.t2(cVar, cVar.f81389t, new VerifyEmailFlowContract$Step.CheckEmail(str), true, null, false, 12);
        return Unit.f186387a;
    }
}
