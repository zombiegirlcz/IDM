package he8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a f151597w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f151597w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f151597w, continuation, 0);
            default:
                return new f(this.f151597w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a aVar2 = this.f151597w;
                e eVar = new e(aVar2, null);
                this.v = 1;
                Object objB = pu7.a.B(aVar2.k, "HANDLE_BUTTON_RESULT", eVar, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a aVar4 = this.f151597w;
                h hVar = new h(aVar4, null);
                this.v = 1;
                Object objB2 = pu7.a.B(aVar4.k, "HANDLE_BUTTON_RESULT", hVar, this);
                return objB2 == aVar3 ? aVar3 : objB2;
        }
    }
}
