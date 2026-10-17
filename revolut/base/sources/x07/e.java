package x07;

import au6.k2;
import et6.h1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import w4l.f;
import x07.c;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.profile.trading_name.flow.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.freelancer.impl.ui.profile.trading_name.flow.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.freelancer.impl.ui.profile.trading_name.flow.b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            h1 h1Var = bVar.o;
            this.u = 1;
            f fVar = ((k2) h1Var.f129237b).i;
            Object obj3 = Unit.f186387a;
            Object objA = nim.a.a(fVar.g(obj3, false), this);
            if (objA != aVar) {
                objA = obj3;
            }
            if (objA == aVar) {
                obj3 = objA;
            }
            if (obj3 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        d dVar = com.revolut.feature.freelancer.impl.ui.profile.trading_name.flow.b.Companion;
        bVar.C2(c.a.f301525a);
        return Unit.f186387a;
    }
}
