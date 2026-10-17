package com.revolut.feature.topup_screen.impl.flows.topup_flows.card;

import com.revolut.feature.topup_screen.impl.flows.topup_flows.card.CardTopupFlowContract$Step;
import cue.d;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f90970w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f90970w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f90970w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.f90970w;
        if (i == 0) {
            o.b(obj2);
            d dVar = this.v;
            if (dVar.c()) {
                h.t2(bVar, bVar.f90976w, new CardTopupFlowContract$Step.ThreeDs(null, dVar), false, null, false, 12);
                return Unit.f186387a;
            }
            c0f.d dVar2 = bVar.f90973r;
            String str = dVar.f108991a;
            String id10 = dVar.f108992b;
            if (id10 != null) {
                Intrinsics.checkNotNullParameter(id10, "id");
            } else {
                id10 = null;
            }
            this.u = 1;
            if (dVar2.a(str, id10, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        bVar.C2(ste.h.f265563a);
        return Unit.f186387a;
    }
}
