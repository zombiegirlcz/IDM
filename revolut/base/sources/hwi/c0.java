package hwi;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ d0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f156199w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(d0 d0Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = d0Var;
        this.f156199w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c0(this.v, this.f156199w, continuation, 0);
            default:
                return new c0(this.v, this.f156199w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Class cls = Boolean.TYPE;
        String str = this.f156199w;
        d0 d0Var = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.data.database.models.openbanking.d.D(cls, d0Var.f156204b, j6.a.q("shown_document_id_", str), Boolean.TRUE);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Boolean bool = (Boolean) j6.a.k(cls, d0Var.f156204b, j6.a.q("shown_document_id_", str));
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
        }
    }
}
