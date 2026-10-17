package q8d;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f243064w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(p pVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f243064w = pVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f243064w, continuation, 0);
            default:
                return new n(this.f243064w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                p pVar = this.f243064w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ie.a aVar2 = pVar.f243069s;
                    this.v = 1;
                    obj2 = aVar2.e(false, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                List list = (List) obj2;
                if (list.size() == 1) {
                    pVar.v2(new e((String) d0.b0(list)));
                } else {
                    pVar.v2(d.f243055a);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                p pVar2 = this.f243064w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    ie.a aVar4 = pVar2.f243069s;
                    this.v = 1;
                    obj2 = aVar4.e(true, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                List list2 = (List) obj2;
                if (list2.size() == 1) {
                    pVar2.v2(new f((String) d0.b0(list2)));
                } else {
                    pVar2.v2(g.f243058a);
                }
                return Unit.f186387a;
        }
    }
}
