package com.revolut.feature.junior_remote_login.impl.ui.flow.create_phone_number;

import com.revolut.feature.junior_remote_login.impl.ui.flow.create_phone_number.JuniorCreatePhoneNumberFlowContract$Step;
import dl8.d;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ em8.a f77181w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, em8.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f77181w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f77181w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        em8.a aVar2 = this.f77181w;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            zq.a aVar3 = bVar.f77182p;
            String str = bVar.o.f77227a.f77103j;
            d dVar = new d(aVar2.f127635a);
            this.u = 1;
            if (aVar3.h(str, dVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.r2(bVar.f77185s);
        h.t2(bVar, bVar.f77185s, new JuniorCreatePhoneNumberFlowContract$Step.InvitationSuccessPrompt(bVar.o.f77227a.f77099b, z80.b.b(bVar.f77183q, aVar2.f127635a, null, null, 6)), false, null, false, 12);
        return Unit.f186387a;
    }
}
