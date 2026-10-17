package m3k;

import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import f2k.h;
import java.util.List;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f202593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f202594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e3k.d f202595c;
    public final /* synthetic */ List d;
    public final /* synthetic */ PaymentPocketInfo e;
    public final /* synthetic */ d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RemittanceTransferData f202596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h f202597h;

    public c(FlowCollector flowCollector, long j2, e3k.d dVar, List list, PaymentPocketInfo paymentPocketInfo, d dVar2, RemittanceTransferData remittanceTransferData, h hVar) {
        this.f202593a = flowCollector;
        this.f202594b = j2;
        this.f202595c = dVar;
        this.d = list;
        this.e = paymentPocketInfo;
        this.f = dVar2;
        this.f202596g = remittanceTransferData;
        this.f202597h = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof m3k.b
            if (r0 == 0) goto L13
            r0 = r15
            m3k.b r0 = (m3k.b) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            m3k.b r0 = new m3k.b
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r15)
            goto L5b
        L27:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L2f:
            yhm.o.b(r15)
            r11 = r14
            hrf.h r11 = (hrf.h) r11
            k3k.x r4 = new k3k.x
            com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData r14 = r13.f202596g
            dj0.d r14 = r14.f102057n
            m3k.d r15 = r13.f
            opf.c0 r15 = r15.f202600n
            java.util.ArrayList r10 = r15.a(r14)
            f2k.h r12 = r13.f202597h
            long r5 = r13.f202594b
            e3k.d r7 = r13.f202595c
            java.util.List r8 = r13.d
            com.revolut.feature.payments.api.mapper.PaymentPocketInfo r9 = r13.e
            r4.<init>(r5, r7, r8, r9, r10, r11, r12)
            r0.v = r3
            kotlinx.coroutines.flow.FlowCollector r14 = r13.f202593a
            java.lang.Object r14 = r14.emit(r4, r0)
            if (r14 != r1) goto L5b
            return r1
        L5b:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: m3k.c.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
