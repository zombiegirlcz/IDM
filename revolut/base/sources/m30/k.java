package m30;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import v20.d1;
import v20.f0;
import v20.f1;
import v30.u0;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ boolean u;
    public final /* synthetic */ kge.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f202271w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kge.d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f202271w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, this.f202271w, continuation);
        kVar.u = ((Boolean) obj2).booleanValue();
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        return ((k) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (!z) {
            return new go.g(zi0.c.P(d1.a.f285360a, false, null, 3), 2);
        }
        return rd0.e.b(((f0) ((v20.o) ((jpc.e) this.v.f183974b).f177256b)).f285395s.f(new f1(this.f202271w, u0.InboundInAppCall), true));
    }
}
