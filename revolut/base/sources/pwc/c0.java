package pwc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.p0;
import wtc.a1;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a f240399w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f240399w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c0(this.f240399w, continuation, 0);
            default:
                return new c0(this.f240399w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a aVar = this.f240399w;
        switch (i) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    ptc.a aVar2 = aVar.f85783p;
                    qtc.k kVar = aVar.o.f85775a;
                    this.v = 1;
                    cuc.z zVar = (cuc.z) ((a1) aVar2).f299851a;
                    zVar.getClass();
                    cn0.d dVar = new cn0.d(zVar, kVar, (Continuation) null, 12);
                    p0 p0Var = p0.f264001a;
                    Object objJ = skm.e0.J(elm.f.f127540b, dVar, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    c0 c0Var = new c0(aVar, continuation, 0);
                    this.v = 1;
                    if (ue8.c.f0(aVar, c0Var, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
