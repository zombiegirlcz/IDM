package b9k;

import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f13807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hrf.c f13808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f13809c;
    public final /* synthetic */ PaymentPocketInfo d;
    public final /* synthetic */ d e;
    public final /* synthetic */ PeerToPeerTransferData f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f13810g;

    public c(FlowCollector flowCollector, hrf.c cVar, long j2, PaymentPocketInfo paymentPocketInfo, d dVar, PeerToPeerTransferData peerToPeerTransferData, boolean z) {
        this.f13807a = flowCollector;
        this.f13808b = cVar;
        this.f13809c = j2;
        this.d = paymentPocketInfo;
        this.e = dVar;
        this.f = peerToPeerTransferData;
        this.f13810g = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r13, kotlin.coroutines.Continuation r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof b9k.b
            if (r0 == 0) goto L13
            r0 = r14
            b9k.b r0 = (b9k.b) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            b9k.b r0 = new b9k.b
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r14)
            goto L59
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L2f:
            yhm.o.b(r14)
            r10 = r13
            hrf.h r10 = (hrf.h) r10
            z8k.u r4 = new z8k.u
            com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData r13 = r12.f
            dj0.d r13 = r13.f102256s
            b9k.d r14 = r12.e
            opf.c0 r14 = r14.d
            java.util.ArrayList r9 = r14.a(r13)
            boolean r11 = r12.f13810g
            hrf.c r5 = r12.f13808b
            long r6 = r12.f13809c
            com.revolut.feature.payments.api.mapper.PaymentPocketInfo r8 = r12.d
            r4.<init>(r5, r6, r8, r9, r10, r11)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r13 = r12.f13807a
            java.lang.Object r13 = r13.emit(r4, r0)
            if (r13 != r1) goto L59
            return r1
        L59:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: b9k.c.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
