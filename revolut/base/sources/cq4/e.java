package cq4;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import o9k.j0;
import qua.p;
import s56.o;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends i implements Function1 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f107992w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f107993x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f107994y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Object obj3, Object obj4, Object obj5, boolean z, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f107993x = obj2;
        this.f107994y = obj3;
        this.z = obj4;
        this.A = obj5;
        this.f107992w = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f107992w, (com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a) this.f107993x, (hl4.g) this.f107994y, (dj0.d) this.z, (Boolean) this.A, continuation);
            case 1:
                return new e((j0) this.f107993x, (PeerToPeerTransferData) this.f107994y, (PeerToPeerRecipient) this.z, (p) this.A, this.f107992w, continuation, 1);
            default:
                return new e((com.revolut.feature.defi.remittances.impl.ui.send.amount.b) this.f107993x, (l1j.f) this.f107994y, (String) this.z, (o) this.A, this.f107992w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((e) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b A[PHI: r8
      0x011b: PHI (r8v3 cq4.e) = (r8v0 cq4.e), (r8v0 cq4.e), (r8v2 cq4.e), (r8v0 cq4.e) binds: [B:36:0x00c6, B:43:0x00ed, B:45:0x0110, B:33:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cq4.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z, com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a aVar, hl4.g gVar, dj0.d dVar, Boolean bool, Continuation continuation) {
        super(1, continuation);
        this.u = 0;
        this.f107992w = z;
        this.f107993x = aVar;
        this.f107994y = gVar;
        this.z = dVar;
        this.A = bool;
    }
}
