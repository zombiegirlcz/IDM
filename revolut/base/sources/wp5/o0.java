package wp5;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c1 f299134w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ xi0.b f299135x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ xi0.b f299136y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(c1 c1Var, xi0.b bVar, xi0.b bVar2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f299134w = c1Var;
        this.f299135x = bVar;
        this.f299136y = bVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o0(this.f299134w, this.f299135x, this.f299136y, continuation, 0);
            default:
                return new o0(this.f299134w, this.f299135x, this.f299136y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        c1 c1Var = this.f299134w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                be5.d dVar = c1Var.C;
                Intrinsics.h(this.f299135x);
                Intrinsics.h(this.f299136y);
                ae5.c cVar = ae5.c.CTA_CLICKED;
                this.v = 1;
                dVar.getClass();
                ae5.b bVar = ae5.b.CONTINUE_FLOW;
                return bVar == aVar ? aVar : bVar;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                be5.d dVar2 = c1Var.C;
                ae5.c cVar2 = ae5.c.CTA_CLICKED;
                this.v = 1;
                dVar2.getClass();
                ae5.b bVar2 = ae5.b.CONTINUE_FLOW;
                return bVar2 == aVar2 ? aVar2 : bVar2;
        }
    }
}
