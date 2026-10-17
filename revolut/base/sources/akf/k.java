package akf;

import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f5850l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g2e.t f5851m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final klf.m1 f5852n;
    public final sy1.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ny1.a f5853p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mjf.u f5854q;

    public k(klf.h0 commonDataSource, g2e.t apmTransferDataSource, klf.m1 juniorDataSource, sy1.d apmChatInteractor, ny1.a apmNavigationProvider, mjf.u recallableInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(apmTransferDataSource, "apmTransferDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(apmChatInteractor, "apmChatInteractor");
        Intrinsics.checkNotNullParameter(apmNavigationProvider, "apmNavigationProvider");
        Intrinsics.checkNotNullParameter(recallableInteractor, "recallableInteractor");
        this.f5850l = commonDataSource;
        this.f5851m = apmTransferDataSource;
        this.f5852n = juniorDataSource;
        this.o = apmChatInteractor;
        this.f5853p = apmNavigationProvider;
        this.f5854q = recallableInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(akf.k r5, tof.a3 r6, tof.t3 r7, boolean r8, kotlin.coroutines.Continuation r9) {
        /*
            r5.getClass()
            boolean r0 = r9 instanceof akf.d
            if (r0 == 0) goto L16
            r0 = r9
            akf.d r0 = (akf.d) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.z = r1
            goto L1b
        L16:
            akf.d r0 = new akf.d
            r0.<init>(r5, r9)
        L1b:
            java.lang.Object r9 = r0.f5823x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r9)
            return r9
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            boolean r8 = r0.f5822w
            tof.t3 r7 = r0.v
            tof.a3 r6 = r0.u
            yhm.o.b(r9)
            goto L58
        L3f:
            yhm.o.b(r9)
            if (r8 == 0) goto L47
            zhm.f0 r5 = zhm.f0.f322471a
            return r5
        L47:
            g2e.t r9 = r5.f5851m
            r0.u = r6
            r0.v = r7
            r0.f5822w = r8
            r0.z = r4
            java.lang.Object r9 = r9.k(r6, r0)
            if (r9 != r1) goto L58
            goto L6b
        L58:
            com.revolut.feature.apm.core.models.recipients.ApmContact r9 = (com.revolut.feature.apm.core.models.recipients.ApmContact) r9
            if (r9 == 0) goto L6d
            r2 = 0
            r0.u = r2
            r0.v = r2
            r0.f5822w = r8
            r0.z = r3
            java.lang.Object r5 = r5.c3(r6, r7, r9, r0)
            if (r5 != r1) goto L6c
        L6b:
            return r1
        L6c:
            return r5
        L6d:
            zhm.f0 r5 = zhm.f0.f322471a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: akf.k.Z2(akf.k, tof.a3, tof.t3, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final cmf.f b3() {
        klf.h0 h0Var = this.f5850l;
        return new cmf.f(ta6.a.h(h0Var.d(), h0Var.c(), new a35.d(this.f5852n.a(), 7), new h(4, 0, k.class, this, "getActions", "getActions(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/models/TransactionDetails;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;")), zhm.u.c(this), "ApmTransferActions");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        ApmRecipient apmRecipient;
        if (a10.b.B(v1.Companion, t1.SEND_AGAIN_APM, str)) {
            apmRecipient = obj2 instanceof ApmRecipient ? (ApmRecipient) obj2 : null;
            return apmRecipient == null ? Boolean.FALSE : e3(apmRecipient, hrf.f.OUTGOING, (gim.c) continuation);
        }
        if (!Intrinsics.f(str, u1.a(t1.REQUEST_APM))) {
            return Intrinsics.f(str, u1.a(t1.RECALL)) ? d3((gim.c) continuation) : Boolean.FALSE;
        }
        apmRecipient = obj2 instanceof ApmRecipient ? (ApmRecipient) obj2 : null;
        return apmRecipient == null ? Boolean.FALSE : e3(apmRecipient, hrf.f.INCOMING, (gim.c) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(tof.a3 r45, tof.t3 r46, com.revolut.feature.apm.core.models.recipients.ApmContact r47, gim.c r48) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: akf.k.c3(tof.a3, tof.t3, com.revolut.feature.apm.core.models.recipients.ApmContact, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        if (nim.a.a(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof akf.i
            if (r0 == 0) goto L13
            r0 = r6
            akf.i r0 = (akf.i) r0
            int r1 = r0.f5840w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5840w = r1
            goto L18
        L13:
            akf.i r0 = new akf.i
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f5840w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L5b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L48
        L36:
            yhm.o.b(r6)
            klf.h0 r6 = r5.f5850l
            kotlinx.coroutines.flow.SharedFlow r6 = r6.d()
            r0.f5840w = r4
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L48
            goto L5a
        L48:
            tof.a3 r6 = (tof.a3) r6
            mjf.u r2 = r5.f5854q
            java.lang.String r6 = r6.f272581b
            pfm.r r6 = r2.a(r6)
            r0.f5840w = r3
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: akf.k.d3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(com.revolut.feature.apm.core.models.recipients.ApmRecipient r7, hrf.f r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof akf.j
            if (r0 == 0) goto L13
            r0 = r9
            akf.j r0 = (akf.j) r0
            int r1 = r0.f5847y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5847y = r1
            goto L18
        L13:
            akf.j r0 = new akf.j
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f5845w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f5847y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            hrf.f r8 = r0.v
            com.revolut.feature.apm.core.models.recipients.ApmRecipient r7 = r0.u
            yhm.o.b(r9)
            goto L49
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r9)
            klf.h0 r9 = r6.f5850l
            kotlinx.coroutines.flow.SharedFlow r9 = r9.d()
            r0.u = r7
            r0.v = r8
            r0.f5847y = r3
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto L49
            return r1
        L49:
            tof.a3 r9 = (tof.a3) r9
            tof.o3 r0 = r9.J
            if (r0 == 0) goto L53
            dj0.d r0 = r0.f272965a
            if (r0 != 0) goto L55
        L53:
            dj0.d r0 = r9.k
        L55:
            com.revolut.feature.transfer.core.models.TransferMoneyPocket r1 = new com.revolut.feature.transfer.core.models.TransferMoneyPocket
            long r2 = r0.f115082a
            long r2 = java.lang.Math.abs(r2)
            r4 = 2
            r5 = 0
            dj0.d r0 = dj0.d.c(r0, r2, r5, r4)
            com.revolut.feature.transfer.core.models.SourceAccount$Pocket r2 = new com.revolut.feature.transfer.core.models.SourceAccount$Pocket
            tof.w5 r9 = r9.f272624y
            java.lang.String r3 = r9.f273143a
            io3.l r9 = r9.f273144b
            r4 = 4
            r2.<init>(r3, r9, r5, r4)
            r1.<init>(r0, r2)
            ny1.a r9 = r6.f5853p
            oy1.b r9 = (oy1.b) r9
            com.revolut.kompot.bridge.navigation.KompotDestination r7 = r9.g(r7, r8, r1)
            r6.A2(r7)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: akf.k.e3(com.revolut.feature.apm.core.models.recipients.ApmRecipient, hrf.f, gim.c):java.lang.Object");
    }
}
