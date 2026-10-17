package a32;

import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f1020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m02.a f1021c;
    public final /* synthetic */ PaymentPocketInfo d;

    public /* synthetic */ e(FlowCollector flowCollector, m02.a aVar, PaymentPocketInfo paymentPocketInfo, int i) {
        this.f1019a = i;
        this.f1020b = flowCollector;
        this.f1021c = aVar;
        this.d = paymentPocketInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            int r0 = r5.f1019a
            switch(r0) {
                case 0: goto L52;
                default: goto L5;
            }
        L5:
            boolean r0 = r7 instanceof cbk.m
            if (r0 == 0) goto L18
            r0 = r7
            cbk.m r0 = (cbk.m) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.v = r1
            goto L1d
        L18:
            cbk.m r0 = new cbk.m
            r0.<init>(r5, r7)
        L1d:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r7)
            goto L4f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            hrf.h r6 = (hrf.h) r6
            sak.b r7 = new sak.b
            m02.a r2 = r5.f1021c
            com.revolut.feature.apm.core.models.transfers.payments.ApmQuote r2 = r2.f201040a
            com.revolut.feature.payments.api.mapper.PaymentPocketInfo r4 = r5.d
            r7.<init>(r2, r4, r6)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r5.f1020b
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r1) goto L4f
            goto L51
        L4f:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L51:
            return r1
        L52:
            boolean r0 = r7 instanceof a32.d
            if (r0 == 0) goto L65
            r0 = r7
            a32.d r0 = (a32.d) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L65
            int r1 = r1 - r2
            r0.v = r1
            goto L6a
        L65:
            a32.d r0 = new a32.d
            r0.<init>(r5, r7)
        L6a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L81
            if (r2 != r3) goto L79
            yhm.o.b(r7)
            goto L9c
        L79:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L81:
            yhm.o.b(r7)
            hrf.h r6 = (hrf.h) r6
            a32.n r7 = new a32.n
            m02.a r2 = r5.f1021c
            com.revolut.feature.apm.core.models.transfers.payments.ApmQuote r2 = r2.f201040a
            com.revolut.feature.payments.api.mapper.PaymentPocketInfo r4 = r5.d
            r7.<init>(r2, r4, r6)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r6 = r5.f1020b
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r1) goto L9c
            goto L9e
        L9c:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a32.e.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
