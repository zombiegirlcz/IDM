package zuh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ o v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(o oVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.v, continuation, 0);
            default:
                return new i(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        o oVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str = (String) j6.a.k(String.class, oVar.f325480a, "CHECK_ID_KEY");
                oVar.f325480a.I0("CHECK_ID_KEY");
                return str;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String str2 = (String) j6.a.k(String.class, oVar.f325480a, "WORKFLOW_ID_KEY");
                oVar.f325480a.I0("WORKFLOW_ID_KEY");
                return str2;
        }
    }
}
