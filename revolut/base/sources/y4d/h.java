package y4d;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.settings.preview.displayCurrency.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f310881w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.settings.preview.displayCurrency.a aVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f310881w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.v, this.f310881w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        com.revolut.feature.settings.preview.displayCurrency.a aVar2 = this.v;
        xb4.g gVar = new xb4.g(aVar2, this.f310881w, null, 19);
        this.u = 1;
        Object objB = pu7.a.B(aVar2.k, "changingDisplayCurrency", gVar, this);
        return objB == aVar ? aVar : objB;
    }
}
