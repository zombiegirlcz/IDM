package wf2;

import be7.s;
import com.revolut.feature.apm.core.models.alias.beneficiary.AliasMerchant;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentSource;
import com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import elm.f;
import iz1.q;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import r02.g;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f296956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bf2.c f296957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xua.a f296958c;
    public final yw1.b d;

    public e(com.revolut.domain.interactors.transactions.a transactionsInteractor, bf2.c upiRepository, xua.a recurringPaymentInteractor, yw1.b apmTransfersRepository, a recipientToApmDestinationMapper) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(upiRepository, "upiRepository");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(apmTransfersRepository, "apmTransfersRepository");
        Intrinsics.checkNotNullParameter(recipientToApmDestinationMapper, "recipientToApmDestinationMapper");
        this.f296956a = transactionsInteractor;
        this.f296957b = upiRepository;
        this.f296958c = recurringPaymentInteractor;
        this.d = apmTransfersRepository;
    }

    public final Object a(dj0.d dVar, String str, UpiTransferFlowContract$Recipient upiTransferFlowContract$Recipient, io3.d dVar2, boolean z, String str2, String str3, TransferScheduleData transferScheduleData, Map map, gim.c cVar) {
        bf2.b bVar = new bf2.b(dVar2, z, upiTransferFlowContract$Recipient, str2, str3, map, dVar, transferScheduleData, str, this.f296957b, (Continuation) null);
        p0 p0Var = p0.f264001a;
        return e0.J(f.f127540b, bVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(qua.p r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof wf2.b
            if (r0 == 0) goto L13
            r0 = r6
            wf2.b r0 = (wf2.b) r0
            int r1 = r0.f296953w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f296953w = r1
            goto L18
        L13:
            wf2.b r0 = new wf2.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f296953w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L44
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r6 = 0
            xua.a r2 = r4.f296958c
            yua.q r2 = (yua.q) r2
            ufm.i r5 = r2.y(r5, r6, r6, r6)
            r0.f296953w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wf2.e.b(qua.p, gim.c):java.lang.Object");
    }

    public final Object c(String str, dj0.d dVar, UpiTransferFlowContract$Recipient recipient, s sVar) {
        g gVar;
        ApmPaymentSource apmPaymentSource = new ApmPaymentSource(str, t02.c.POCKET);
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        if (recipient instanceof UpiTransferFlowContract$Recipient.UpiMerchant) {
            AliasMerchant aliasMerchant = ((UpiTransferFlowContract$Recipient.UpiMerchant) recipient).f62967a;
            gVar = new g(new t02.a(aliasMerchant.f61900a, aliasMerchant.d), null);
        } else if (recipient instanceof UpiTransferFlowContract$Recipient.BankBeneficiary) {
            gVar = new g(null, ((UpiTransferFlowContract$Recipient.BankBeneficiary) recipient).f62966a.f132329a);
        } else {
            if (!(recipient instanceof UpiTransferFlowContract$Recipient.Alias)) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = new g(null, ((UpiTransferFlowContract$Recipient.Alias) recipient).f62963a.f79060a);
        }
        return ((q) this.d).a(new t02.g(apmPaymentSource, ApmPaymentMethod.UPI.f62178a, dVar, new r02.a(gVar)), sVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r18, gim.c r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof wf2.c
            if (r3 == 0) goto L19
            r3 = r2
            wf2.c r3 = (wf2.c) r3
            int r4 = r3.f296954w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f296954w = r4
            goto L1e
        L19:
            wf2.c r3 = new wf2.c
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.u
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f296954w
            r6 = 1
            if (r5 == 0) goto L35
            if (r5 != r6) goto L2d
            yhm.o.b(r2)
            goto L95
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L35:
            yhm.o.b(r2)
            tof.i7$c r2 = tof.i7.Companion
            tof.u7 r5 = new tof.u7
            r5.<init>(r1)
            tof.j7 r7 = new tof.j7
            r7.<init>(r1)
            tof.qa r8 = new tof.qa
            r8.<init>(r1)
            r1 = 3
            tof.i7[] r1 = new tof.i7[r1]
            r9 = 0
            r1[r9] = r5
            r1[r6] = r7
            r5 = 2
            r1[r5] = r8
            r2.getClass()
            tof.oa r1 = tof.i7.c.b(r1)
            tof.i7[] r2 = new tof.i7[r6]
            r2[r9] = r1
            tof.q7 r11 = tof.i7.c.a(r2)
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r6)
            com.revolut.domain.interactors.transactions.TransactionsSort r14 = com.revolut.domain.interactors.transactions.TransactionsSort.NO_SORT
            r15 = 0
            r16 = 18
            com.revolut.domain.interactors.transactions.a r10 = r0.f296956a
            r12 = 0
            ufm.i r1 = com.revolut.domain.interactors.transactions.a.b(r10, r11, r12, r13, r14, r15, r16)
            wd3.a r2 = new wd3.a
            r5 = 28
            r2.<init>(r5)
            wf0.r r5 = new wf0.r
            r7 = 26
            r5.<init>(r7, r2)
            ufm.i r2 = new ufm.i
            r2.<init>(r1, r5, r6)
            java.lang.String r1 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            r3.f296954w = r6
            java.lang.Object r2 = nim.a.b(r2, r3)
            if (r2 != r4) goto L95
            return r4
        L95:
            java.lang.String r1 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wf2.e.d(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(java.lang.String r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof wf2.d
            if (r0 == 0) goto L13
            r0 = r7
            wf2.d r0 = (wf2.d) r0
            int r1 = r0.f296955w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f296955w = r1
            goto L18
        L13:
            wf2.d r0 = new wf2.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f296955w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L48
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            r0.f296955w = r3
            be7.s r7 = new be7.s
            r2 = 0
            r3 = 3
            bf2.c r4 = r5.f296957b
            r7.<init>(r4, r6, r2, r3)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r6, r7, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            java.lang.String r7 = (java.lang.String) r7
            k71.c r6 = new k71.c
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wf2.e.e(java.lang.String, gim.c):java.io.Serializable");
    }
}
