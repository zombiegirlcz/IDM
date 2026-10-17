package ga9;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.v v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(com.revolut.feature.onboarding.impl.onboarding.v vVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = vVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b0(this.v, continuation, 0);
            default:
                return new b0(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.onboarding.impl.onboarding.v vVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wl0.c cVar = vVar.I;
                try {
                    if (cVar.d() != wl0.o.NONE) {
                        cVar.b();
                    }
                    return Unit.f186387a;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var);
                    return null;
                }
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vVar.B2();
                return Unit.f186387a;
        }
    }
}
