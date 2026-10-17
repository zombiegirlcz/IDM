package lld;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                a aVar = new a(3, 0, (Continuation) obj4);
                aVar.v = (String) obj3;
                return aVar.invokeSuspend(Unit.f186387a);
            case 1:
                a aVar2 = new a(3, 1, (Continuation) obj4);
                aVar2.v = (String) obj3;
                return aVar2.invokeSuspend(Unit.f186387a);
            default:
                a aVar3 = new a(3, 2, (Continuation) obj4);
                aVar3.v = (String) obj3;
                return aVar3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                String str = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return str;
            case 1:
                String str2 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return str2;
            default:
                String str3 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return str3;
        }
    }
}
