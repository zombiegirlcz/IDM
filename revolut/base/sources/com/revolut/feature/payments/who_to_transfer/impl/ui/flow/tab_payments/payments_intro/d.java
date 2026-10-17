package com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro;

import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.a;
import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.payments_intro.b;
import gim.i;
import h5a.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import l0c.s;
import l5a.n;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            j jVar = eVar.f80197r;
            this.u = 1;
            obj2 = jVar.b(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        b bVar = (b) obj2;
        if (bVar instanceof n) {
            eVar.H2(eVar.J, new s((n) bVar, 14));
        } else {
            if (!Intrinsics.f(bVar, b.a.f80194a)) {
                throw new NoWhenBranchMatchedException();
            }
            eVar.C2(a.C0522a.f80192a);
        }
        return Unit.f186387a;
    }
}
