package ia7;

import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.v, continuation, 0);
            default:
                return new l(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        n nVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = nVar.f159966b;
                c cVar2 = d.Companion;
                String str = (String) cVar.T2(nVar.b().c(), l21.d.d);
                String strD = nVar.b().d();
                Type type = l21.d.f;
                Intrinsics.checkNotNullExpressionValue(type, "<get-LONG_TYPE>(...)");
                Long l2 = (Long) cVar.T2(strD, type);
                if (str == null || l2 == null) {
                    return null;
                }
                return new j(str, l2.longValue());
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar3 = nVar.f159966b;
                c cVar4 = d.Companion;
                String str2 = (String) cVar3.T2(nVar.b().f(), l21.d.d);
                String strI = nVar.b().i();
                Type type2 = l21.d.f;
                Intrinsics.checkNotNullExpressionValue(type2, "<get-LONG_TYPE>(...)");
                Long l3 = (Long) cVar3.T2(strI, type2);
                if (str2 == null || l3 == null) {
                    return null;
                }
                return new j(str2, l3.longValue());
        }
    }
}
