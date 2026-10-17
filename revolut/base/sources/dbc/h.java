package dbc;

import com.revolut.feature.revolutpay.promoted_merchants.api.navigation.PromotedMerchantsDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import q7c.p;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public k u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f112711w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, Continuation continuation) {
        super(2, continuation);
        this.f112711w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.f112711w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        k kVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            k kVar2 = this.f112711w;
            b6c.c cVar = kVar2.f112717q;
            this.u = kVar2;
            this.v = 1;
            Object objA = ((p) cVar).a(this);
            if (objA == aVar) {
                return aVar;
            }
            kVar = kVar2;
            obj2 = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = this.u;
            o.b(obj2);
        }
        return kVar.C1(new PromotedMerchantsDestination(new PromotedMerchantsDestination.InputData(((Boolean) obj2).booleanValue(), true, true, false)));
    }
}
