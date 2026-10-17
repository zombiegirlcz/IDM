package nde;

import com.revolut.feature.support.impl.transfer_tracker.data.network.service.TransferTrackerService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferTrackerService f214359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ode.c f214360b;

    public d(TransferTrackerService service, ode.c mapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f214359a = service;
        this.f214360b = mapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(nde.d r9, java.lang.String r10, kq2.l r11, com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nde.d.a(nde.d, java.lang.String, kq2.l, com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum b(com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof nde.b
            if (r0 == 0) goto L13
            r0 = r6
            nde.b r0 = (nde.b) r0
            int r1 = r0.f214357w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f214357w = r1
            goto L18
        L13:
            nde.b r0 = new nde.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f214357w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            pde.e r5 = ode.c.a(r5)
            r0.f214357w = r3
            com.revolut.feature.support.impl.transfer_tracker.data.network.service.TransferTrackerService r6 = r4.f214359a
            java.lang.Object r6 = r6.getInboundTransferType(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            pde.h r6 = (pde.h) r6
            java.lang.String r5 = "response"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            java.lang.String r5 = r6.getType()     // Catch: java.lang.Exception -> L51
            kq2.l r5 = kq2.l.valueOf(r5)     // Catch: java.lang.Exception -> L51
            return r5
        L51:
            r5 = move-exception
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: nde.d.b(com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest, gim.c):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof nde.c
            if (r0 == 0) goto L13
            r0 = r6
            nde.c r0 = (nde.c) r0
            int r1 = r0.f214358w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f214358w = r1
            goto L18
        L13:
            nde.c r0 = new nde.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f214358w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            pde.e r5 = ode.c.a(r5)
            r0.f214358w = r3
            com.revolut.feature.support.impl.transfer_tracker.data.network.service.TransferTrackerService r6 = r4.f214359a
            java.lang.Object r6 = r6.getLocatedTransferTransactionsIds(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = zhm.w.t(r6, r0)
            r5.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L52:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r0 = r6.next()
            pde.g r0 = (pde.g) r0
            java.lang.String r0 = r0.getTransactionId()
            r5.add(r0)
            goto L52
        L66:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nde.d.c(com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest, gim.c):java.io.Serializable");
    }
}
