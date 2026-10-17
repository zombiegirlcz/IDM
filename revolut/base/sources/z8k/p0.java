package z8k;

import com.revolut.feature.categorisation.api.model.PeriodPreferenceType;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes11.dex */
public final class p0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f320196w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f320197x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f320198y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(int i, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f320198y = obj2;
        this.f320197x = obj3;
        this.z = obj4;
        this.f320196w = obj5;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p0 p0Var = new p0((com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) this.f320196w, continuation);
                p0Var.z = obj2;
                return p0Var;
            case 1:
                return new p0((com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b) this.f320196w, (PeerToPeerTransferData) this.f320197x, (PeerToPeerRecipient) this.f320198y, (Function1) this.z, continuation);
            case 2:
                return new p0((zbj.q0) this.f320197x, (zm3.l) this.z, (xi0.b) this.f320196w, continuation, 2);
            case 3:
                return new p0(3, (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.details.b) this.f320198y, (String) this.f320197x, (PeriodPreferenceType) this.z, (DateTime) this.f320196w, continuation);
            case 4:
                p0 p0Var2 = new p0((zpl.g) this.f320198y, (String) this.f320197x, (String) this.f320196w, continuation);
                p0Var2.z = obj2;
                return p0Var2;
            case 5:
                return new p0(5, (String) this.f320198y, (zpl.g) this.f320197x, (String) this.z, (String) this.f320196w, continuation);
            case 6:
                return new p0((tb4.t) this.f320197x, (String) this.z, (String) this.f320196w, continuation, 6);
            case 7:
                return new p0(7, (zuh.o) this.f320198y, (String) this.f320197x, (List) this.z, (List) this.f320196w, continuation);
            default:
                return new p0(8, (zuh.o) this.f320198y, (String) this.f320197x, (String) this.z, (ArrayList) this.f320196w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c6, code lost:
    
        if (r0 == r4) goto L72;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z8k.p0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar, PeerToPeerTransferData peerToPeerTransferData, PeerToPeerRecipient peerToPeerRecipient, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f320196w = bVar;
        this.f320197x = peerToPeerTransferData;
        this.f320198y = peerToPeerRecipient;
        this.z = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = 0;
        this.f320196w = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(Object obj2, Serializable serializable, Serializable serializable2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f320197x = obj2;
        this.z = serializable;
        this.f320196w = serializable2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(zpl.g gVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.u = 4;
        this.f320198y = gVar;
        this.f320197x = str;
        this.f320196w = str2;
    }
}
