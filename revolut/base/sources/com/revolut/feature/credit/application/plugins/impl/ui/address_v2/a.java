package com.revolut.feature.credit.application.plugins.impl.ui.address_v2;

import com.revolut.feature.credit.application.plugins.impl.ui.address_v2.CreditAddressV2FlowContract$Step;
import elm.f;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import q2j.j;
import r24.d;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
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
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            iw3.a aVar2 = bVar.f66978q;
            String str = bVar.f66977p.f66972b.f66892b;
            this.u = 1;
            d dVar = aVar2.f168935a;
            dVar.getClass();
            r24.b bVar2 = new r24.b(dVar, str, null, 0);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(f.f127540b, bVar2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        bVar.H2(bVar.f66979r, new j((List) obj2, 3));
        h.t2(bVar, bVar.f66980s, CreditAddressV2FlowContract$Step.Address.f66974a, false, null, false, 12);
        return Unit.f186387a;
    }
}
