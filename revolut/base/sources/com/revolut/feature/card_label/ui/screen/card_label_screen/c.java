package com.revolut.feature.card_label.ui.screen.card_label_screen;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.t0;
import vb2.r;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            gwh.b bVar = dVar.f64770q;
            String f64764a = dVar.f64769p.f64760a.getF64764a();
            this.u = 1;
            obj2 = bVar.a(f64764a, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        String str = (String) obj2;
        if (str == null) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        dVar.x2(new r(str, 21));
        return Unit.f186387a;
    }
}
