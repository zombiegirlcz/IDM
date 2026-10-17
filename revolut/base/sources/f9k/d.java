package f9k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import do3.q;
import gim.i;
import hrf.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import o9k.b0;
import o9k.j0;
import q8k.n;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PeerToPeerTransferData f132983w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PeerToPeerRecipient f132984x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f132985y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, PeerToPeerTransferData peerToPeerTransferData, PeerToPeerRecipient peerToPeerRecipient, boolean z, boolean z3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.A = obj2;
        this.f132983w = peerToPeerTransferData;
        this.f132984x = peerToPeerRecipient;
        this.f132985y = z;
        this.z = z3;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d((com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.c) this.A, this.f132983w, this.f132984x, this.f132985y, this.z, continuation, 0);
            default:
                return new d((j0) this.A, this.f132983w, this.f132984x, this.f132985y, this.z, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        d dVar;
        switch (this.u) {
            case 0:
                com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.c cVar = (com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.c) this.A;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    j0 j0Var = cVar.f102350r;
                    f f102291b = cVar.o.getF102291b();
                    boolean zL2 = cVar.L2();
                    this.v = 1;
                    j0Var.getClass();
                    int i2 = b0.f223292a[f102291b.ordinal()];
                    PeerToPeerTransferData peerToPeerTransferData = this.f132983w;
                    PeerToPeerRecipient peerToPeerRecipient = this.f132984x;
                    if (i2 == 1) {
                        dVar = this;
                        obj2 = j0Var.d3(peerToPeerTransferData, peerToPeerRecipient, this.f132985y, zL2, dVar);
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        obj2 = j0Var.c3(peerToPeerTransferData, peerToPeerRecipient, this);
                        dVar = this;
                    }
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    dVar = this;
                }
                cVar.I2((n) obj2, dVar.f132983w, dVar.z);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                j0 j0Var2 = (j0) this.A;
                this.v = 1;
                Object objU = q.u(j0Var2, new e(j0Var2, this.f132984x, this.f132983w, this.f132985y, this.z, null), this);
                return objU == aVar2 ? aVar2 : objU;
        }
    }
}
