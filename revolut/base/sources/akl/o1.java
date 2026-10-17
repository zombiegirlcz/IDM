package akl;

import android.os.Parcelable;
import com.revolut.domain.models.topup.methods.PreselectedTopUpMethodId;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.sso.api.models.Evidence;
import com.revolut.sso.impl.domain.models.Claim;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class o1 extends gim.i implements Function2 {
    public final /* synthetic */ Object A;
    public Object B;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f6065w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f6066x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f6067y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(a5h.g gVar, Parcelable parcelable, String str, boolean z, boolean z3, String str2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f6065w = gVar;
        this.B = parcelable;
        this.f6066x = str;
        this.f6067y = z;
        this.z = z3;
        this.A = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o1((a5h.g) this.f6065w, (Claim) this.B, (String) this.f6066x, this.f6067y, this.z, (String) this.A, continuation, 0);
            case 1:
                return new o1((a5h.g) this.f6065w, (Evidence) this.B, (String) this.f6066x, this.f6067y, this.z, (String) this.A, continuation, 1);
            case 2:
                return new o1((com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.c) this.f6065w, (String) this.f6066x, (PeerToPeerTransferData) this.B, (PeerToPeerRecipient) this.A, this.f6067y, this.z, continuation);
            case 3:
                o1 o1Var = new o1((hve.o) this.B, (TopUpMethodsContext) this.f6066x, this.f6067y, (PreselectedTopUpMethodId) this.A, this.z, continuation);
                o1Var.f6065w = obj2;
                return o1Var;
            default:
                o1 o1Var2 = new o1((mjf.k0) this.A, this.z, continuation);
                o1Var2.f6066x = obj2;
                return o1Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0129  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: akl.o1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.c cVar, String str, PeerToPeerTransferData peerToPeerTransferData, PeerToPeerRecipient peerToPeerRecipient, boolean z, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.u = 2;
        this.f6065w = cVar;
        this.f6066x = str;
        this.B = peerToPeerTransferData;
        this.A = peerToPeerRecipient;
        this.f6067y = z;
        this.z = z3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(hve.o oVar, TopUpMethodsContext topUpMethodsContext, boolean z, PreselectedTopUpMethodId preselectedTopUpMethodId, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.u = 3;
        this.B = oVar;
        this.f6066x = topUpMethodsContext;
        this.f6067y = z;
        this.A = preselectedTopUpMethodId;
        this.z = z3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(mjf.k0 k0Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.u = 4;
        this.A = k0Var;
        this.z = z;
    }
}
