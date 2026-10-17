package bwf;

import com.revolut.feature.transport.impl.common.TransportHubLocation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.transport.impl.ui.hub.a f19341w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.feature.transport.impl.ui.hub.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f19341w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                m mVar = new m(this.f19341w, continuation, 0);
                mVar.v = obj2;
                return mVar;
            default:
                m mVar2 = new m(this.f19341w, continuation, 1);
                mVar2.v = obj2;
                return mVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((m) create((TransportHubLocation) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((m) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        int i = this.u;
        com.revolut.feature.transport.impl.ui.hub.a aVar = this.f19341w;
        switch (i) {
            case 0:
                TransportHubLocation transportHubLocation = (TransportHubLocation) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j2 j2Var = aVar.f92527r;
                do {
                    value = j2Var.getValue();
                } while (!j2Var.h(value, f.a((f) value, null, transportHubLocation, 3)));
                break;
            default:
                String str = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                eki.g.r2(aVar, str);
                break;
        }
        return Unit.f186387a;
    }
}
