package lz6;

import gim.i;
import jz6.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import lz6.a;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f200939w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, e eVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f200939w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f200939w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            oz6.a aVar2 = cVar.f200940l;
            String str = this.f200939w.f179589a;
            this.u = 1;
            com.revolut.feature.freelancer.impl.ui.onboarding.flow.b bVar = (com.revolut.feature.freelancer.impl.ui.onboarding.flow.b) aVar2;
            bVar.H2(bVar.C, new nj8.b(str, 20));
            Object objO2 = bVar.O2(this);
            if (objO2 != aVar) {
                objO2 = Unit.f186387a;
            }
            if (objO2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        cVar.r2().M0(a.C1140a.f200938b);
        return Unit.f186387a;
    }
}
