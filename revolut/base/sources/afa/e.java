package afa;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e() {
        super(2, null);
        this.u = 2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(2, 0, continuation);
                eVar.v = ((Boolean) obj2).booleanValue();
                return eVar;
            case 1:
                e eVar2 = new e(2, 1, continuation);
                eVar2.v = ((Boolean) obj2).booleanValue();
                return eVar2;
            case 2:
                e eVar3 = new e(2, 2, continuation);
                eVar3.v = ((Boolean) obj2).booleanValue();
                return eVar3;
            default:
                e eVar4 = new e(2, 3, continuation);
                eVar4.v = ((Boolean) obj2).booleanValue();
                return eVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.u;
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        Continuation continuation = (Continuation) obj3;
        switch (i) {
        }
        return ((e) create(bool, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                boolean z = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(!z);
            case 1:
                boolean z3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(z3);
            case 2:
                boolean z4 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(z4);
            default:
                boolean z6 = this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return Boolean.valueOf(z6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }
}
