package i23;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f157826w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e93.e f157827x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ NaviCommand f157828y;
    public final /* synthetic */ CardOrderAccountWrapper z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, String str, e93.e eVar, NaviCommand naviCommand, CardOrderAccountWrapper cardOrderAccountWrapper, Continuation continuation) {
        super(1, continuation);
        this.v = nVar;
        this.f157826w = str;
        this.f157827x = eVar;
        this.f157828y = naviCommand;
        this.z = cardOrderAccountWrapper;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.v, this.f157826w, this.f157827x, this.f157828y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
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
        k93.b bVar = this.v.f157835q;
        String str = ((CardOrderAccountWrapper.Junior) this.z).f64934b;
        this.u = 1;
        Object objB3 = k93.b.b3(bVar, this.f157826w, this.f157827x, this.f157828y, null, AccountId.Personal.f51414a, str, this, 1656);
        return objB3 == aVar ? aVar : objB3;
    }
}
