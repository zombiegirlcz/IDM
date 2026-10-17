package dee;

import a41.j1;
import com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest;
import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_swift_transfer_status.InboundSwiftTransferStatusScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.v1;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f113420w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i, z zVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f113420w = zVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(0, this.f113420w, continuation);
            case 1:
                return new t(1, this.f113420w, continuation);
            case 2:
                return new t(2, this.f113420w, continuation);
            default:
                return new t(3, this.f113420w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                z zVar = this.f113420w;
                s sVar = new s(zVar, null);
                this.v = 1;
                Object objP2 = zVar.p2(this, sVar);
                return objP2 == aVar ? aVar : objP2;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    z zVar2 = this.f113420w;
                    wkm.l lVarQ = vkm.q.Q(new bbk.z(zVar2.f113431r.B(new dak.c(29)), 28), new v(0, zVar2, null));
                    u uVar = new u(zVar2, 0);
                    this.v = 1;
                    if (lVarQ.collect(uVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    z zVar3 = this.f113420w;
                    wkm.l lVarQ2 = vkm.q.Q(new bbk.z(zVar3.f113431r.B(new x(0)), 29), new v(1, zVar3, null));
                    u uVar2 = new u(zVar3, 1);
                    this.v = 1;
                    if (lVarQ2.collect(uVar2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    z zVar4 = this.f113420w;
                    sde.e eVar = zVar4.f113429p;
                    InboundSwiftTransferStatusScreenContract$InputData inboundSwiftTransferStatusScreenContract$InputData = zVar4.o;
                    String uetr = inboundSwiftTransferStatusScreenContract$InputData.f89406a;
                    kq2.l transferType = inboundSwiftTransferStatusScreenContract$InputData.f89408c;
                    TransferArrivalRequest request = inboundSwiftTransferStatusScreenContract$InputData.f89407b;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(uetr, "uetr");
                    Intrinsics.checkNotNullParameter(transferType, "transferType");
                    Intrinsics.checkNotNullParameter(request, "request");
                    nde.d dVar = eVar.f261869a;
                    dVar.getClass();
                    Intrinsics.checkNotNullParameter(uetr, "uetr");
                    Intrinsics.checkNotNullParameter(transferType, "transferType");
                    Intrinsics.checkNotNullParameter(request, "request");
                    vkm.y yVar = new vkm.y(new v1(new j1(dVar, transferType, request, uetr, (Continuation) null, 25)), new im2.b(3, 18, null));
                    u uVar3 = new u(zVar4, 2);
                    this.v = 1;
                    if (yVar.collect(uVar3, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
