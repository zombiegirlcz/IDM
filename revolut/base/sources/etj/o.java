package etj;

import ble.w0;
import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterParams;
import et6.r1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.v1;
import vkm.y;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements wzi.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jtj.l f129438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jtj.a f129439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f129440c;
    public final ang.f d;
    public final jla.h e;
    public final rea.m f;

    public o(jtj.l incomeSorterRepository, jtj.a incomeSorterExecutionsRepository, wsg.n walletInteractor, ang.f userInteractor, jla.h productCatalogueInteractor, rea.m pocketDetailsInteractor) {
        Intrinsics.checkNotNullParameter(incomeSorterRepository, "incomeSorterRepository");
        Intrinsics.checkNotNullParameter(incomeSorterExecutionsRepository, "incomeSorterExecutionsRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        this.f129438a = incomeSorterRepository;
        this.f129439b = incomeSorterExecutionsRepository;
        this.f129440c = walletInteractor;
        this.d = userInteractor;
        this.e = productCatalogueInteractor;
        this.f = pocketDetailsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(etj.o r4, com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId.Crypto r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof etj.h
            if (r0 == 0) goto L13
            r0 = r6
            etj.h r0 = (etj.h) r0
            int r1 = r0.f129422w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129422w = r1
            goto L18
        L13:
            etj.h r0 = new etj.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129422w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            rea.m r4 = r4.f
            xi0.b r5 = r5.f99171a
            r6 = 6
            r2 = 0
            ufm.i r4 = eda.f.a(r4, r5, r2, r2, r6)
            r0.f129422w = r3
            java.lang.Object r6 = nim.a.b(r4, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            eda.e r6 = (eda.e) r6
            io3.d r4 = r6.f124961a
            com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId$Pocket r5 = new com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId$Pocket
            java.lang.String r4 = r4.f163145a
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: etj.o.b(etj.o, com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId$Crypto, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(etj.o r5, com.revolut.feature.subaccount.api.models.Subaccount r6, xi0.b r7, boolean r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof etj.j
            if (r0 == 0) goto L13
            r0 = r9
            etj.j r0 = (etj.j) r0
            int r1 = r0.f129425w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129425w = r1
            goto L18
        L13:
            etj.j r0 = new etj.j
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129425w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r9)
            goto L71
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            yhm.o.b(r9)
            boolean r9 = r5.i()
            if (r9 != 0) goto L3b
        L39:
            r3 = r4
            goto L7a
        L3b:
            boolean r9 = r6.b()
            if (r9 == 0) goto L42
            goto L39
        L42:
            xi0.b r9 = r6.getCurrency()
            boolean r7 = r9.equals(r7)
            if (r7 != 0) goto L4f
            if (r8 != 0) goto L4f
            goto L39
        L4f:
            com.revolut.feature.subaccount.api.models.SubaccountType r7 = r6.c()
            com.revolut.feature.subaccount.api.models.SubaccountType$Joint r8 = com.revolut.feature.subaccount.api.models.SubaccountType.Joint.f88961a
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L39
            com.revolut.feature.subaccount.api.models.SubaccountType r7 = r6.c()
            com.revolut.feature.subaccount.api.models.SubaccountType$Junior r8 = com.revolut.feature.subaccount.api.models.SubaccountType.Junior.f88962a
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L68
            goto L39
        L68:
            r0.f129425w = r3
            java.lang.Object r9 = r5.j(r6, r0)
            if (r9 != r1) goto L71
            return r1
        L71:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r5 = r9.booleanValue()
            if (r5 != 0) goto L7a
            goto L39
        L7a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: etj.o.c(etj.o, com.revolut.feature.subaccount.api.models.Subaccount, xi0.b, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r18, java.lang.String r19, hzi.c r20, java.util.ArrayList r21, com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId r22, hzi.a r23, boolean r24, gim.c r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: etj.o.d(java.lang.String, java.lang.String, hzi.c, java.util.ArrayList, com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId, hzi.a, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof etj.d
            if (r0 == 0) goto L13
            r0 = r7
            etj.d r0 = (etj.d) r0
            int r1 = r0.f129417w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129417w = r1
            goto L18
        L13:
            etj.d r0 = new etj.d
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129417w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L45
        L27:
            r5 = move-exception
            goto L4a
        L29:
            r5 = move-exception
            goto L5d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r7)
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            jtj.a r7 = r4.f129439b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.f129417w = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            jtj.k r7 = (jtj.k) r7     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = r7.b(r5, r6, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L45
            return r1
        L45:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            return r5
        L4a:
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r7 = rd0.c.ERROR
            r0 = 0
            java.lang.String r1 = "IncomeSorterInteractorImpl"
            rd0.d.a(r7, r1, r0, r5, r6)
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
            return r5
        L5d:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: etj.o.e(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof etj.e
            if (r0 == 0) goto L13
            r0 = r7
            etj.e r0 = (etj.e) r0
            int r1 = r0.f129418w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129418w = r1
            goto L18
        L13:
            etj.e r0 = new etj.e
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129418w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L45
        L27:
            r5 = move-exception
            goto L4a
        L29:
            r5 = move-exception
            goto L51
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r7)
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            jtj.l r7 = r4.f129438a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.f129418w = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            jtj.n r7 = (jtj.n) r7     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = r7.b(r5, r6, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L45
            return r1
        L45:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            return r5
        L4a:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
            return r5
        L51:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: etj.o.f(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof etj.f
            if (r0 == 0) goto L13
            r0 = r6
            etj.f r0 = (etj.f) r0
            int r1 = r0.f129419w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129419w = r1
            goto L18
        L13:
            etj.f r0 = new etj.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129419w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L45
        L27:
            r5 = move-exception
            goto L4a
        L29:
            r5 = move-exception
            goto L51
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            jtj.a r6 = r4.f129439b     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            r0.f129419w = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            jtj.k r6 = (jtj.k) r6     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = r6.c(r5, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L45
            return r1
        L45:
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            return r5
        L4a:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
            return r5
        L51:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: etj.o.g(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|2|(2:4|(1:6)(1:7))(0)|8|(1:68)|(1:(1:(11:12|64|13|47|(2:50|48)|70|51|57|(1:59)|60|61)(2:19|20))(2:21|22))(3:28|29|(2:31|45))|32|(2:35|33)|71|36|39|(1:41)|42|66|43|(9:46|47|(1:48)|70|51|57|(0)|60|61)|45|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f2, code lost:
    
        r0 = r11;
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3 A[Catch: all -> 0x0035, CancellationException -> 0x0038, LOOP:0: B:48:0x00dd->B:50:0x00e3, LOOP_END, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:47:0x00ce, B:48:0x00dd, B:50:0x00e3, B:51:0x00ef), top: B:64:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable h(gim.c r11) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: etj.o.h(gim.c):java.io.Serializable");
    }

    public final boolean i() {
        return this.e.d("MONEY_HEALTH.income_sorter", null) == bla.c.ENABLED;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(com.revolut.feature.subaccount.api.models.Subaccount r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof etj.i
            if (r0 == 0) goto L13
            r0 = r6
            etj.i r0 = (etj.i) r0
            int r1 = r0.f129424x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129424x = r1
            goto L18
        L13:
            etj.i r0 = new etj.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129424x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.subaccount.api.models.Subaccount r5 = r0.u
            yhm.o.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            ang.f r6 = r4.d
            zmg.d r6 = r6.d
            efm.k r6 = r6.c()
            r0.u = r5
            r0.f129424x = r3
            java.lang.Object r6 = nim.a.h(r6, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            do3.n r6 = (do3.n) r6
            java.lang.String r6 = r6.f116408a
            boolean r0 = r5 instanceof com.revolut.feature.subaccount.api.models.Subaccount.Group
            if (r0 == 0) goto L57
            com.revolut.feature.subaccount.api.models.Subaccount$Group r5 = (com.revolut.feature.subaccount.api.models.Subaccount.Group) r5
            pcd.s r5 = r5.f88953a
            boolean r3 = opg.c.h(r6, r5)
        L57:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: etj.o.j(com.revolut.feature.subaccount.api.models.Subaccount, gim.c):java.lang.Object");
    }

    public final akg.n k(String walletId, IncomeSorterParams params, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        jtj.n nVar = (jtj.n) this.f129438a;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(nVar.d.b(walletId, loadingStrategy), new jtj.c(params, 1));
    }

    public final y l(Function2 function2) {
        Continuation continuation = null;
        return rd0.e.e(nim.a.A(q.Q(new v1(new e38.c(this, continuation, 28)), new w0(function2, (Continuation) null)), new r1(17)), h0.f322473a, new eob.e(3, 7, continuation));
    }

    public final akg.n m(String walletId, hzi.c cVar, hzi.b bVar) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        jtj.n nVar = (jtj.n) this.f129438a;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(nVar.d.b(walletId, loadingStrategy), new eq4.c(cVar, bVar, 23));
    }

    public final akg.n n(String walletId, IncomeSorterParams params, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        jtj.k kVar = (jtj.k) this.f129439b;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(kVar.f.b(walletId, loadingStrategy), new jtj.c(params, 0));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:72)|(5:(1:(1:(1:(4:14|15|53|54)(2:21|22))(6:23|24|45|(2:47|(1:49)(1:50))|53|54))(2:26|27))(3:29|30|(2:32|(2:34|52)(1:35))(8:38|70|39|40|74|41|(5:44|45|(0)|53|54)|52))|74|41|(0)|52)|36|37|70|39|40|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0116, code lost:
    
        if (r0 == r3) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0121, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0122, code lost:
    
        r13 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4 A[Catch: all -> 0x003a, CancellationException -> 0x003d, TryCatch #1 {CancellationException -> 0x003d, blocks: (B:15:0x0035, B:53:0x0119, B:24:0x0052, B:45:0x00ec, B:47:0x00f4, B:50:0x0114, B:27:0x0067, B:36:0x00a3, B:39:0x00c7, B:41:0x00e1, B:30:0x006e, B:32:0x0072), top: B:72:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId r18, gim.c r19, hzi.a r20, java.lang.Boolean r21, java.lang.String r22, java.lang.String r23, java.util.ArrayList r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: etj.o.o(com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId, gim.c, hzi.a, java.lang.Boolean, java.lang.String, java.lang.String, java.util.ArrayList):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId r17, gim.c r18, hzi.a r19, java.lang.Boolean r20, java.lang.String r21, java.lang.String r22, java.util.ArrayList r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: etj.o.p(com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId, gim.c, hzi.a, java.lang.Boolean, java.lang.String, java.lang.String, java.util.ArrayList):java.lang.Object");
    }
}
