package s18;

import com.revolut.feature.profile.api.navigation.KompotProfileFeatureConfig;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((soa.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        soa.b bVar = (soa.b) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        KompotProfileFeatureConfig.NotificationSettingDetailsDestination notificationSettingDetailsDestination = new KompotProfileFeatureConfig.NotificationSettingDetailsDestination(bVar);
        a aVar2 = e.Companion;
        this.v.A2(notificationSettingDetailsDestination);
        return Unit.f186387a;
    }
}
