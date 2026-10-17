package qma;

import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.address.models.Address;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.profile.impl.ui.details.address.flow.c f247788w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AddressFlowContract$OutputData f247789x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AddressFlowContract$OutputData addressFlowContract$OutputData, com.revolut.feature.profile.impl.ui.details.address.flow.c cVar, Continuation continuation) {
        super(1, continuation);
        this.u = 2;
        this.f247789x = addressFlowContract$OutputData;
        this.f247788w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(continuation, this.f247788w, this.f247789x, 0);
            case 1:
                return new c(continuation, this.f247788w, this.f247789x, 1);
            default:
                return new c(this.f247789x, this.f247788w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.profile.impl.ui.details.address.flow.c cVar = this.f247788w;
                if (i == 0) {
                    o.b(obj2);
                    Address address = this.f247789x.f60940a;
                    this.v = 1;
                    if (com.revolut.feature.profile.impl.ui.details.address.flow.c.I2(cVar, address, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                h.D2(cVar.v);
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.profile.impl.ui.details.address.flow.c cVar2 = this.f247788w;
                if (i2 == 0) {
                    o.b(obj2);
                    Address address2 = this.f247789x.f60940a;
                    this.v = 1;
                    if (com.revolut.feature.profile.impl.ui.details.address.flow.c.I2(cVar2, address2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                h.D2(cVar2.v);
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    AddressFlowContract$OutputData addressFlowContract$OutputData = this.f247789x;
                    String str = addressFlowContract$OutputData.d;
                    Continuation continuation = null;
                    com.revolut.feature.profile.impl.ui.details.address.flow.c cVar3 = this.f247788w;
                    if (str != null) {
                        c cVar4 = new c(continuation, cVar3, addressFlowContract$OutputData, 0);
                        this.v = 1;
                        if (u0.b0(cVar3.X(), str, cVar4, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        c cVar5 = new c(continuation, cVar3, addressFlowContract$OutputData, 1);
                        this.v = 2;
                        if (cVar3.p2(this, cVar5) == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i3 != 1 && i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Continuation continuation, com.revolut.feature.profile.impl.ui.details.address.flow.c cVar, AddressFlowContract$OutputData addressFlowContract$OutputData, int i) {
        super(1, continuation);
        this.u = i;
        this.f247788w = cVar;
        this.f247789x = addressFlowContract$OutputData;
    }
}
