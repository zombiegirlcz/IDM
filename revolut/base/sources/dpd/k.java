package dpd;

import com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.spending_analytics.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pe0.q;
import rp0.g1;
import rp0.k1;
import skm.r;
import yji.n;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends n {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j60.a f116870l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ge3.e f116871m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g1 f116872n;
    public final q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f116873p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public r f116874q;

    public k(j60.a bottomDialog, ge3.e transactionCategorisationInteractor, g1 shotDialogDisplayer, q offlineQueueHandler, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(transactionCategorisationInteractor, "transactionCategorisationInteractor");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(offlineQueueHandler, "offlineQueueHandler");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f116870l = bottomDialog;
        this.f116871m = transactionCategorisationInteractor;
        this.f116872n = shotDialogDisplayer;
        this.o = offlineQueueHandler;
        this.f116873p = transactionsInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0175, code lost:
    
        if (r1 == r4) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0 A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:14:0x0034, B:62:0x0178, B:64:0x0187, B:66:0x018b, B:21:0x004e, B:59:0x0135, B:24:0x0061, B:39:0x00dc, B:41:0x00e0, B:42:0x00eb, B:44:0x00f1, B:46:0x0102, B:48:0x0109, B:53:0x0115, B:27:0x0070, B:35:0x00a9, B:30:0x0079), top: B:73:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable Z2(dpd.k r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, gim.c r28) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dpd.k.Z2(dpd.k, java.lang.String, java.lang.String, java.lang.String, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b3(dpd.c r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof dpd.f
            if (r0 == 0) goto L13
            r0 = r7
            dpd.f r0 = (dpd.f) r0
            int r1 = r0.f116859w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f116859w = r1
            goto L18
        L13:
            dpd.f r0 = new dpd.f
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f116859w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L28
            goto L46
        L28:
            r6 = move-exception
            goto L4b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Exception -> L28
            dg4.c r7 = new dg4.c     // Catch: java.lang.Exception -> L28
            r2 = 6
            r7.<init>(r6, r5, r4, r2)     // Catch: java.lang.Exception -> L28
            r0.f116859w = r3     // Catch: java.lang.Exception -> L28
            java.lang.Object r7 = r5.Y2(r0, r7)     // Catch: java.lang.Exception -> L28
            if (r7 != r1) goto L46
            return r1
        L46:
            tof.j3 r7 = (tof.j3) r7     // Catch: java.lang.Exception -> L28
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Exception -> L28
            goto L60
        L4b:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 != 0) goto L76
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.String r1 = "CategoryManagementExtension"
            rd0.d.a(r0, r1, r4, r6, r7)
            yhm.m$a r7 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r6)
        L60:
            boolean r6 = r7 instanceof yhm.n
            if (r6 == 0) goto L75
            cq6.k r6 = new cq6.k
            r0 = 25
            r6.<init>(r5, r4, r0)
            yi5.b r0 = new yi5.b
            r1 = 27
            r0.<init>(r1)
            r5.T2(r6, r0)
        L75:
            return r7
        L76:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dpd.k.b3(dpd.c, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x010c, code lost:
    
        if (r0 == r8) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c3(java.lang.String r28, java.lang.String r29, java.lang.String r30, gim.c r31) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dpd.k.c3(java.lang.String, java.lang.String, java.lang.String, gim.c):java.io.Serializable");
    }

    public final void d3() {
        ((k1) this.f116872n).d(ShotDialogDisplayer$Configuration.Companion.a(ShotDialogDisplayer$Configuration.INSTANCE, "SUCCESS_DIALOG_ID", new TextLocalisedClause(R$string.analytics_categories_toast_deleted, null, null, 14), null, 60));
    }

    public final void e3() {
        ((k1) this.f116872n).d(ShotDialogDisplayer$Configuration.Companion.a(ShotDialogDisplayer$Configuration.INSTANCE, "SUCCESS_DIALOG_ID", new TextLocalisedClause(R$string.analytics_categories_toast_updated, null, null, 14), null, 60));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00fd, code lost:
    
        if (r0 == r8) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(tof.a3 r31, tof.i3 r32, gim.c r33) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dpd.k.f3(tof.a3, tof.i3, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g3(java.lang.String r7, gim.c r8) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r8 instanceof dpd.j
            if (r0 == 0) goto L13
            r0 = r8
            dpd.j r0 = (dpd.j) r0
            int r1 = r0.f116869w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f116869w = r1
            goto L18
        L13:
            dpd.j r0 = new dpd.j
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f116869w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L28
            goto L52
        L28:
            r7 = move-exception
            goto L57
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Exception -> L28
            com.revolut.domain.interactors.transactions.a r8 = r6.f116873p     // Catch: java.lang.Exception -> L28
            tof.hc r2 = new tof.hc     // Catch: java.lang.Exception -> L28
            r2.<init>(r7, r3)     // Catch: java.lang.Exception -> L28
            tof.q6[] r7 = new tof.q6[r4]     // Catch: java.lang.Exception -> L28
            r5 = 0
            r7[r5] = r2     // Catch: java.lang.Exception -> L28
            mjf.b0 r8 = (mjf.b0) r8     // Catch: java.lang.Exception -> L28
            pfm.r r7 = r8.g(r7)     // Catch: java.lang.Exception -> L28
            r0.f116869w = r4     // Catch: java.lang.Exception -> L28
            java.lang.Object r7 = nim.a.a(r7, r0)     // Catch: java.lang.Exception -> L28
            if (r7 != r1) goto L52
            return r1
        L52:
            kotlin.Unit r7 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L28
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Exception -> L28
            goto L6c
        L57:
            boolean r8 = r7 instanceof java.util.concurrent.CancellationException
            if (r8 != 0) goto L74
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.String r1 = "CategoryManagementExtension"
            rd0.d.a(r0, r1, r3, r7, r8)
            yhm.m$a r8 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r7)
        L6c:
            boolean r7 = r7 instanceof yhm.n
            r7 = r7 ^ r4
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        L74:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dpd.k.g3(java.lang.String, gim.c):java.lang.Object");
    }
}
