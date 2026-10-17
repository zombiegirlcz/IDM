package vvf;

import com.revolut.feature.transport.models.transit.PurchasedTransitTicket;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PurchasedTransitTicket.ToBeActivated f292537w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, PurchasedTransitTicket.ToBeActivated toBeActivated, Continuation continuation) {
        super(2, continuation);
        this.v = kVar;
        this.f292537w = toBeActivated;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, this.f292537w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
        PurchasedTransitTicket.ToBeActivated toBeActivated = this.f292537w;
        k kVar = this.v;
        i iVar = new i(kVar, toBeActivated, null);
        this.u = 1;
        Object objB0 = u0.b0(kVar.X(), "EXTEND_BUTTON_LOADING_TAG", iVar, this);
        return objB0 == aVar ? aVar : objB0;
    }
}
