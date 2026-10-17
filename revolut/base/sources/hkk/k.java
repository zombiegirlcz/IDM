package hkk;

import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f152948w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f152949x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(p pVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f152948w = pVar;
        this.f152949x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f152948w, this.f152949x, continuation, 0);
            default:
                return new k(this.f152948w, this.f152949x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
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
                d0 d0VarC = ((s06.j) this.f152948w.f152960s).c(this.f152949x, false, lg0.a.OPEN_BROWSER);
                this.v = 1;
                Object objB = nim.a.b(d0VarC, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    p pVar = this.f152948w;
                    ajk.b bVar = pVar.f152961t;
                    String str = this.f152949x;
                    h1k.a aVar3 = new h1k.a(pVar, str, 29);
                    this.v = 1;
                    if (igk.k.b(pVar, bVar, str, aVar3, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
