package com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch;

import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.c;
import gim.i;
import ha3.x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import l93.f;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
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
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            k7i.i iVar = bVar.o;
            String str = ((ch1.i) ((j2) bVar.f60908q.f22677a).getValue()).f24107b.f65545b;
            this.u = 1;
            Object objD = ((x) ((f) iVar.f182069b)).f.d(str, this);
            if (objD != aVar) {
                objD = Unit.f186387a;
            }
            if (objD != aVar) {
                objD = Unit.f186387a;
            }
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        bVar.C2(c.a.f60910a);
        return Unit.f186387a;
    }
}
