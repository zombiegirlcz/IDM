package tzb;

import aii.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f275908w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f275908w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f275908w, continuation, 0);
            default:
                return new g(this.f275908w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                i iVar = this.f275908w;
                if (i == 0) {
                    o.b(obj2);
                    efm.b bVarA = iVar.f275910p.a(true);
                    this.v = 1;
                    if (nim.a.a(bVarA, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                iVar.C2(q.f5292a);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                i iVar2 = this.f275908w;
                if (i2 == 0) {
                    o.b(obj2);
                    efm.b bVarA2 = iVar2.f275910p.a(false);
                    this.v = 1;
                    if (nim.a.a(bVarA2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                iVar2.C2(q.f5292a);
                return Unit.f186387a;
        }
    }
}
