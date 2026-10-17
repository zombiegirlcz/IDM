package z8k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class z0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b f320238w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PeerToPeerTransferData f320239x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ PeerToPeerRecipient f320240y;
    public final /* synthetic */ Function1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar, PeerToPeerTransferData peerToPeerTransferData, PeerToPeerRecipient peerToPeerRecipient, Function1 function1, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f320238w = bVar;
        this.f320239x = peerToPeerTransferData;
        this.f320240y = peerToPeerRecipient;
        this.z = function1;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z0(this.f320238w, this.f320239x, this.f320240y, this.z, continuation, 0);
            default:
                return new z0(this.f320238w, this.f320239x, this.f320240y, this.z, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((z0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        z0 z0Var;
        switch (this.u) {
            case 0:
                com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar = this.f320238w;
                PeerToPeerAmountScreenContract$InputData peerToPeerAmountScreenContract$InputData = bVar.f102333p;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    q8k.f fVar = bVar.M;
                    hrf.f f102322b = peerToPeerAmountScreenContract$InputData.getF102322b();
                    boolean f102325h = peerToPeerAmountScreenContract$InputData.getF102325h();
                    hrf.c cVar = ((t) bVar.t2()).e.f320218a;
                    this.v = 1;
                    z0Var = this;
                    obj2 = q8k.f.b3(fVar, f102322b, this.f320239x, this.f320240y, cVar, f102325h, z0Var, 32);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    z0Var = this;
                }
                q8k.d dVar = (q8k.d) obj2;
                if (dVar instanceof q8k.a) {
                    return Unit.f186387a;
                }
                if (dVar instanceof q8k.b) {
                    z0Var.z.invoke(((q8k.b) dVar).f243143a);
                } else {
                    if (!(dVar instanceof q8k.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar.v2(new z(((q8k.c) dVar).f243144a, peerToPeerAmountScreenContract$InputData.getF102321a()));
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar2 = this.f320238w;
                    z0 z0Var2 = new z0(bVar2, this.f320239x, this.f320240y, this.z, null, 0);
                    this.v = 1;
                    if (zh9.u0.b0(bVar2.X(), "PEER_TO_PEER_AMOUNT_PROCEED_CTA_BUTTON_TAG", z0Var2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
