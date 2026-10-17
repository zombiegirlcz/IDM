package f9k;

import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import o9k.j0;
import xsi.p;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends i implements Function1 {
    public Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f132986w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f132987x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f132988y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.c cVar, String str, PeerToPeerTransferData peerToPeerTransferData, PeerToPeerRecipient peerToPeerRecipient, boolean z, boolean z3, Continuation continuation) {
        super(1, continuation);
        this.A = cVar;
        this.B = str;
        this.f132987x = peerToPeerTransferData;
        this.f132986w = peerToPeerRecipient;
        this.f132988y = z;
        this.z = z3;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e((com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.c) this.A, (String) this.B, (PeerToPeerTransferData) this.f132987x, (PeerToPeerRecipient) this.f132986w, this.f132988y, this.z, continuation);
            case 1:
                return new e((j0) this.B, (PeerToPeerRecipient) this.f132986w, (PeerToPeerTransferData) this.f132987x, this.f132988y, this.z, continuation);
            default:
                return new e((CoroutineScope) this.A, (p) this.B, (xsi.b) this.f132987x, this.f132988y, this.z, (dj0.d) this.f132986w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((e) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f9k.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CoroutineScope coroutineScope, p pVar, xsi.b bVar, boolean z, boolean z3, dj0.d dVar, Continuation continuation) {
        super(1, continuation);
        this.A = coroutineScope;
        this.B = pVar;
        this.f132987x = bVar;
        this.f132988y = z;
        this.z = z3;
        this.f132986w = dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j0 j0Var, PeerToPeerRecipient peerToPeerRecipient, PeerToPeerTransferData peerToPeerTransferData, boolean z, boolean z3, Continuation continuation) {
        super(1, continuation);
        this.B = j0Var;
        this.f132986w = peerToPeerRecipient;
        this.f132987x = peerToPeerTransferData;
        this.f132988y = z;
        this.z = z3;
    }
}
