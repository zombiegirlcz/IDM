package wae;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import qua.p;
import yhm.o;
import yua.q;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f295866w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f295867x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, p pVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f295866w = dVar;
        this.f295867x = pVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f295866w, this.f295867x, continuation, 0);
            default:
                return new b(this.f295866w, this.f295867x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((b) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    xua.a aVar2 = this.f295866w.f295869l;
                    p pVar = this.f295867x;
                    String str = pVar.f249314a.f160150a;
                    String str2 = pVar.L;
                    this.v = 1;
                    if (((q) aVar2).g(str, str2, this) == aVar) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    xua.a aVar4 = this.f295866w.f295869l;
                    p pVar2 = this.f295867x;
                    String str3 = pVar2.f249314a.f160150a;
                    String str4 = pVar2.L;
                    this.v = 1;
                    if (((q) aVar4).l(str3, str4, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
