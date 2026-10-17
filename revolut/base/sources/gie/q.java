package gie;

import com.revolut.feature.user.checklist.api.UserChecklistSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends gim.i implements Function2 {
    public /* synthetic */ boolean u;
    public final /* synthetic */ s v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, Continuation continuation) {
        super(2, continuation);
        this.v = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.v, continuation);
        qVar.u = ((Boolean) obj2).booleanValue();
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        return ((q) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (z) {
            s sVar = this.v;
            ((eie.b) sVar.f144151n).a();
            sVar.f3(UserChecklistSource.Other.f94600a);
        }
        return Unit.f186387a;
    }
}
