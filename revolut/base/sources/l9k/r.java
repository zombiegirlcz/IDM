package l9k;

import cli.y;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerReviewScreenInputData;
import java.time.LocalDateTime;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.a f193290w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f193290w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f193290w, continuation, 0);
            default:
                return new r(this.f193290w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((r) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB3;
        Object objB32;
        int i = this.u;
        com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review.a aVar = this.f193290w;
        switch (i) {
            case 0:
                y yVar = aVar.z;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    PeerToPeerTransferData peerToPeerTransferData = ((i) ((j2) yVar.f22677a).getValue()).f193277b;
                    bsf.d dVar = new bsf.d(peerToPeerTransferData.f102244a, peerToPeerTransferData.f102245b, peerToPeerTransferData.e, peerToPeerTransferData.f102250l, ((i) ((j2) yVar.f22677a).getValue()).f193276a.f102270a);
                    bsf.i iVar = aVar.f102373y;
                    this.v = 1;
                    objB3 = iVar.b3(dVar, this);
                    if (objB3 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB3 = obj2;
                }
                bsf.h hVar = (bsf.h) objB3;
                if (Intrinsics.f(hVar, bsf.g.f18201a)) {
                    int i3 = jli.h.f175850a;
                } else {
                    if (!(hVar instanceof bsf.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.H2(yVar, new kzc.a(new q((bsf.f) hVar, 0), aVar, 29));
                }
                return Unit.f186387a;
            default:
                y yVar2 = aVar.z;
                PeerToPeerReviewScreenInputData peerToPeerReviewScreenInputData = aVar.o;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    i5k.a aVar4 = aVar.f102371w;
                    t8k.a.f(peerToPeerReviewScreenInputData.f102272a);
                    boolean z = ((i) ((j2) yVar2.f22677a).getValue()).f193277b.o.f92304a;
                    PeerToPeerRecipient peerToPeerRecipient = peerToPeerReviewScreenInputData.f102272a;
                    Intrinsics.checkNotNullParameter(peerToPeerRecipient, "<this>");
                    boolean z3 = peerToPeerRecipient.f102270a instanceof zm3.l;
                    boolean zContains = peerToPeerReviewScreenInputData.e.contains(PeerToPeerReviewScreenInputData.AdditionalConfig.ContinueMode.f102275a);
                    this.v = 1;
                    objB32 = aVar4.b3(z, z3, true, zContains, this);
                    if (objB32 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB32 = obj2;
                }
                if (!((Boolean) objB32).booleanValue()) {
                    return null;
                }
                PeerToPeerTransferData peerToPeerTransferData2 = ((i) ((j2) yVar2.f22677a).getValue()).f193277b;
                LocalDateTime now = ((l80.f) aVar.u).f();
                peerToPeerTransferData2.getClass();
                Intrinsics.checkNotNullParameter(now, "now");
                if (n1l.b.d(peerToPeerTransferData2.f102252n, now)) {
                    aVar.C2(new s8k.b(((i) ((j2) yVar2.f22677a).getValue()).f193277b, peerToPeerReviewScreenInputData.f102272a));
                } else {
                    aVar.C2(new s8k.c(((i) ((j2) yVar2.f22677a).getValue()).f193277b, peerToPeerReviewScreenInputData.f102272a));
                }
                return Unit.f186387a;
        }
    }
}
