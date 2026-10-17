package ha3;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import v6l.b1;
import v6l.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f150426w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(x xVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f150426w = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.f150426w, continuation, 0);
            case 1:
                return new t(this.f150426w, continuation, 1);
            default:
                return new t(this.f150426w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                z6l.s sVar = this.f150426w.f;
                this.v = 1;
                Object objN = sVar.n(this);
                return objN == aVar ? aVar : objN;
            case 1:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    z6l.s sVar2 = this.f150426w.f;
                    this.v = 1;
                    Object objA = nim.a.a(((b1) sVar2.f319829a).f286432n.g(h0.a.f286452a, false), this);
                    if (objA != obj3) {
                        objA = Unit.f186387a;
                    }
                    if (objA == obj3) {
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
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    z6l.s sVar3 = this.f150426w.f;
                    this.v = 1;
                    Object objA2 = nim.a.a(((b1) sVar3.f319829a).f286432n.g(h0.a.f286452a, false), this);
                    if (objA2 != obj4) {
                        objA2 = Unit.f186387a;
                    }
                    if (objA2 == obj4) {
                        return obj4;
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
