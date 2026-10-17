package suf;

import com.revolut.feature.transport.impl.data.TransportService;
import com.revolut.feature.transport.models.transit.TransitTicketActivationConfig;
import cvf.l;
import cvf.q;
import cvf.v;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f265747w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f265748x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(h hVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f265747w = hVar;
        this.f265748x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f265747w, this.f265748x, continuation, 0);
            case 1:
                return new d(this.f265747w, this.f265748x, continuation, 1);
            case 2:
                return new d(this.f265747w, this.f265748x, continuation, 2);
            default:
                return new d(this.f265747w, this.f265748x, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    TransportService transportService = this.f265747w.f265753a;
                    this.v = 1;
                    obj2 = transportService.getInitPurchaseTransitTicket(this.f265748x, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return yuf.b.a((v) obj2);
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    TransportService transportService2 = this.f265747w.f265753a;
                    this.v = 1;
                    obj2 = transportService2.postInitActivateTransitTicket(this.f265748x, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                l lVar = (l) obj2;
                Intrinsics.checkNotNullParameter(lVar, "<this>");
                return new TransitTicketActivationConfig(lVar.getAttempts(), ruf.b.c(lVar.getAttemptedAt()), ruf.b.c(lVar.getActivationCutoffTime()));
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    TransportService transportService3 = this.f265747w.f265753a;
                    q qVar = new q(this.f265748x);
                    this.v = 1;
                    obj2 = transportService3.postInitPurchaseTransitTicket(qVar, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return yuf.b.a((v) obj2);
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    TransportService transportService4 = this.f265747w.f265753a;
                    dvf.b bVar = new dvf.b(this.f265748x);
                    this.v = 1;
                    if (transportService4.register(bVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
