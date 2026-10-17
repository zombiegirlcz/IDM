package com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass;

import com.revolut.feature.bank_account_switching.impl.articles.BankAccountSwitchingArticle;
import com.revolut.feature.bank_account_switching.impl.ui.switch_in.flows.cass.CassAccountSwitchingFlowContract$Step;
import efm.d0;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import l71.d;
import l71.f;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
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
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            d0 d0VarA = ((ang.b) bVar.f64007q).a();
            this.u = 1;
            obj2 = nim.a.b(d0VarA, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        d dVar = (d) obj2;
        Intrinsics.h(dVar);
        h.t2(bVar, bVar.f64010t, new CassAccountSwitchingFlowContract$Step.ProductArticle(f.c(dVar) ? BankAccountSwitchingArticle.CASS_BANK : BankAccountSwitchingArticle.CASS_LTD), false, null, false, 12);
        return Unit.f186387a;
    }
}
