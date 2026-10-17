package tvc;

import com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.SecurityDelayScreenContract$Step;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import su4.n;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a f274751w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f274751w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f274751w, continuation, 0);
            default:
                return new g(this.f274751w, continuation, 1);
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
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a aVar2 = this.f274751w;
                if (i == 0) {
                    o.b(obj2);
                    ufm.c cVarB = ((z39.b) aVar2.f85676p).b();
                    this.v = 1;
                    obj2 = nim.a.b(cVarB, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                if (!((Boolean) obj2).booleanValue()) {
                    oki.h.v2(aVar2.u, SecurityDelayScreenContract$Step.LocationPermission.f85675a, ModalDestination.Style.POPUP.f98311a);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a aVar4 = this.f274751w;
                n nVar = new n(aVar4, null, 15);
                this.v = 1;
                Object objB = pu7.a.B(aVar4.k, "securityDelayMainButtonClick", nVar, this);
                return objB == aVar3 ? aVar3 : objB;
        }
    }
}
