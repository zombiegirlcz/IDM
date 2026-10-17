package h4d;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ h v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            default:
                return new g(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Class cls = Boolean.TYPE;
        h hVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar = hVar.f149339b;
                Boolean bool = Boolean.FALSE;
                boolean zBooleanValue = ((Boolean) cVar.v0(bool, "CONVERTER_WAS_PREFILLED_KEY", cls)).booleanValue();
                if (zBooleanValue) {
                    return bool;
                }
                boolean zIsEmpty = hVar.f149338a.b().isEmpty();
                if (!zBooleanValue && !zIsEmpty) {
                    com.revolut.data.database.models.openbanking.d.D(cls, cVar, "CONVERTER_WAS_PREFILLED_KEY", Boolean.TRUE);
                }
                return Boolean.valueOf(!zBooleanValue && zIsEmpty);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.data.database.models.openbanking.d.D(cls, hVar.f149339b, "CONVERTER_WAS_PREFILLED_KEY", Boolean.TRUE);
                return Unit.f186387a;
        }
    }
}
