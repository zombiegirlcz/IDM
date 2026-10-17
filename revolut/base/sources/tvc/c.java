package tvc;

import com.revolut.feature.security_hub.api.models.SecurityDelayInfo;
import com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.SecurityDelayScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SecurityDelayScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(SecurityDelayScreen securityDelayScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = securityDelayScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String f85417a;
        int i = this.u;
        Continuation continuation = null;
        SecurityDelayScreen securityDelayScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a aVar2 = (com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a) ((e) securityDelayScreen.O.getValue());
                aVar2.getClass();
                aVar2.n2(new g(aVar2, continuation, 1), new whi.b(6));
                break;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a aVar4 = (com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a) ((e) securityDelayScreen.O.getValue());
                SecurityDelayInfo securityDelayInfo = (SecurityDelayInfo) ((d) ((j2) aVar4.f85680t.f22677a).getValue()).f274747c.getContent();
                if (securityDelayInfo != null && (f85417a = securityDelayInfo.getF85417a()) != null) {
                    aVar4.n2(new tqh.j(aVar4, f85417a, continuation, 13), new whi.b(6));
                }
                break;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a aVar6 = (com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a) ((e) securityDelayScreen.O.getValue());
                aVar6.H2(aVar6.f85680t, new tsk.j(15));
                break;
        }
        return Unit.f186387a;
    }
}
