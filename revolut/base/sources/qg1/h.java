package qg1;

import cli.y;
import com.revolut.feature.card_add_to_googlepay.api.models.RetailCardWrapper;
import kg1.c;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, Continuation continuation) {
        super(1, continuation);
        this.v = kVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        k kVar = this.v;
        y yVar = kVar.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            f fVar = new f(kVar, ((l) ((j2) yVar.f22677a).getValue()).f245633a, 0);
            g gVar = new g(kVar, null, 0);
            this.u = 1;
            obj2 = n14.k.V(kVar, null, null, fVar, gVar, this, 3);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (((nii.h) obj2) instanceof nii.g) {
            if (((l) ((j2) yVar.f22677a).getValue()).f245634b) {
                kVar.C1(kVar.f245630r.a(((RetailCardWrapper) ((l) ((j2) yVar.f22677a).getValue()).f245633a).f64443a.f104693a));
            } else {
                kVar.C2(c.a.f183899a);
            }
        }
        return Unit.f186387a;
    }
}
