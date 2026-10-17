package g4k;

import com.revolut.data.model.Data;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f140560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f140561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f140562c;
    public final /* synthetic */ BankTransferData d;
    public final /* synthetic */ Data e;
    public final /* synthetic */ kq2.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f140563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ PaymentPocketInfo f140564h;
    public final /* synthetic */ f2k.h i;

    public k(FlowCollector flowCollector, r rVar, p pVar, BankTransferData bankTransferData, Data data, kq2.f fVar, long j2, PaymentPocketInfo paymentPocketInfo, f2k.h hVar) {
        this.f140560a = flowCollector;
        this.f140561b = rVar;
        this.f140562c = pVar;
        this.d = bankTransferData;
        this.e = data;
        this.f = fVar;
        this.f140563g = j2;
        this.f140564h = paymentPocketInfo;
        this.i = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r21, kotlin.coroutines.Continuation r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof g4k.j
            if (r2 == 0) goto L17
            r2 = r1
            g4k.j r2 = (g4k.j) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.v = r3
            goto L1c
        L17:
            g4k.j r2 = new g4k.j
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.v
            r5 = 1
            if (r4 == 0) goto L34
            if (r4 != r5) goto L2c
            yhm.o.b(r1)
            goto Lab
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            yhm.o.b(r1)
            r15 = r21
            hrf.h r15 = (hrf.h) r15
            g4k.r r1 = r0.f140561b
            com.revolut.data.model.Data r4 = r1.f140581a
            com.revolut.data.model.Data r1 = r1.f140581a
            java.lang.Object r4 = r4.getContent()
            z1k.e r4 = (z1k.e) r4
            com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData r6 = r0.d
            dj0.d r6 = r6.u
            g4k.p r7 = r0.f140562c
            opf.c0 r7 = r7.f140572c
            java.util.ArrayList r14 = r7.a(r6)
            r6 = 0
            if (r4 == 0) goto L5b
            java.util.List r7 = r4.getOptions()
            goto L5c
        L5b:
            r7 = r6
        L5c:
            if (r7 != 0) goto L60
            zhm.f0 r7 = zhm.f0.f322471a
        L60:
            r11 = r7
            if (r4 == 0) goto L68
            java.util.List r7 = r4.getReferenceOptions()
            goto L69
        L68:
            r7 = r6
        L69:
            if (r7 != 0) goto L6d
            zhm.f0 r7 = zhm.f0.f322471a
        L6d:
            r12 = r7
            java.lang.Throwable r7 = r1.getError()
            if (r7 == 0) goto L81
            java.lang.Throwable r1 = r1.getError()
            boolean r7 = r1 instanceof java.lang.Exception
            if (r7 == 0) goto L81
            java.lang.Exception r1 = (java.lang.Exception) r1
            r16 = r1
            goto L83
        L81:
            r16 = r6
        L83:
            if (r4 == 0) goto L89
            com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceAccountSwitchingInformation r6 = r4.getAccountSwitchingInformation()
        L89:
            r17 = r6
            e4k.z r6 = new e4k.z
            g4k.r r1 = r0.f140561b
            f2k.h r4 = r0.i
            com.revolut.data.model.Data r7 = r0.e
            kq2.f r8 = r0.f
            long r9 = r0.f140563g
            com.revolut.feature.payments.api.mapper.PaymentPocketInfo r13 = r0.f140564h
            r18 = r1
            r19 = r4
            r6.<init>(r7, r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r2.v = r5
            kotlinx.coroutines.flow.FlowCollector r1 = r0.f140560a
            java.lang.Object r1 = r1.emit(r6, r2)
            if (r1 != r3) goto Lab
            return r3
        Lab:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g4k.k.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
