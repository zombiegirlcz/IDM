package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details;

import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a;
import dfj.k0;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f101206w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.f101206w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.f101206w, continuation);
        bVar.v = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((chj.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        chj.c cVar = (chj.c) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            boolean z = cVar instanceof chj.a;
            c cVar2 = this.f101206w;
            if (z) {
                k0 k0Var = cVar2.f101211t;
                this.v = null;
                this.u = 1;
                if (k0Var.e(this) == aVar) {
                    return aVar;
                }
            } else {
                if (!(cVar instanceof chj.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                cVar2.C2(a.C0617a.f101205a);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
