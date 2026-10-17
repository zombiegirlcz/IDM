package com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_facade;

import ang.b;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.consents_facade.FacadeOpenBankingConsentsFlowContract$Step;
import efm.d0;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l71.d;
import l71.f;
import oki.h;
import ol6.c;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            d0 d0VarA = ((b) cVar.o).a();
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
        h.u2(cVar, cVar.f226341p, f.e(dVar) ? FacadeOpenBankingConsentsFlowContract$Step.LinkedAccountsConsent.f72780a : f.a(dVar) ? FacadeOpenBankingConsentsFlowContract$Step.BrazilConsents.f72778a : FacadeOpenBankingConsentsFlowContract$Step.DefaultConsents.f72779a, null, 6);
        return Unit.f186387a;
    }
}
