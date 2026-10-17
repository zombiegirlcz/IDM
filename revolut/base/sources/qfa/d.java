package qfa;

import com.revolut.feature.post_activation.impl.service.PostActivationService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import ofa.j0;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f245281w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f245281w = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                return new d(this.f245281w, continuation, 0).invokeSuspend(Unit.f186387a);
            default:
                return new d(this.f245281w, continuation, 1).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    PostActivationService postActivationService = this.f245281w.f245282a;
                    this.v = 1;
                    obj2 = postActivationService.getPostActivationFlow(this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return ((ofa.e) obj2).f224767a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    PostActivationService postActivationService2 = this.f245281w.f245282a;
                    this.v = 1;
                    obj2 = postActivationService2.getPostActivationSteps(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return ((j0) obj2).f224774a;
        }
    }
}
