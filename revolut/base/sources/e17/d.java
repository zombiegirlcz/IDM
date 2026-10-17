package e17;

import e17.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c17.h f121899w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, c17.h hVar, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f121899w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f121899w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            oz6.a aVar2 = eVar.f121900l;
            String str = this.f121899w.f20389b;
            this.u = 1;
            com.revolut.feature.freelancer.impl.ui.onboarding.flow.b bVar = (com.revolut.feature.freelancer.impl.ui.onboarding.flow.b) aVar2;
            bVar.H2(bVar.C, new nj8.b(str, 21));
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
        eVar.r2().M0(a.b.f121897b);
        return Unit.f186387a;
    }
}
