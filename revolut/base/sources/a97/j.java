package a97;

import knd.g0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f2375w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f2375w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f2375w, continuation, 0);
            default:
                return new j(this.f2375w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    k kVar = this.f2375w;
                    oji.j jVar = kVar.f2377b;
                    i iVar = new i(2, kVar, k.class, "onNewInputData", "onNewInputData(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0);
                    this.v = 1;
                    if (jVar.a(iVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                k kVar2 = this.f2375w;
                int i3 = 2;
                if (i2 == 0) {
                    o.b(obj2);
                    g0 g0Var = new g0(kVar2.f2376a, new a2c.c(i3, 4, null), 1);
                    this.v = 1;
                    if (q.n(g0Var, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                this.v = 2;
                if (kVar2.d(this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }
}
