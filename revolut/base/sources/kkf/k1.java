package kkf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class k1 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184787l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vlf.b f184788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wa7.p f184789n;

    public k1(klf.h0 commonDataSource, vlf.b commonUiMapper, wa7.p hiddenAccountsTransactionInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(hiddenAccountsTransactionInteractor, "hiddenAccountsTransactionInteractor");
        this.f184787l = commonDataSource;
        this.f184788m = commonUiMapper;
        this.f184789n = hiddenAccountsTransactionInteractor;
    }

    public final cmf.p Z2() {
        klf.h0 h0Var = this.f184787l;
        return new cmf.p(new t38.e(h0Var.d(), 24, (Flow) h0Var.f185499q.getValue(), new ael.l0(3, this, k1.class, "buildBlock", "buildBlock(Lcom/revolut/feature/transactions/models/Transaction;Lcom/revolut/feature/transactions/impl/ui/transactiondetails/account_detector/AccountDetector$Accounts;)Ljava/util/List;", 4, 12)), new i0(5), zhm.u.c(this), "From");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(java.lang.Object r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kkf.j1
            if (r0 == 0) goto L13
            r0 = r7
            kkf.j1 r0 = (kkf.j1) r0
            int r1 = r0.f184767x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184767x = r1
            goto L18
        L13:
            kkf.j1 r0 = new kkf.j1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184767x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            aii.u r6 = r0.u
            yhm.o.b(r7)
            goto L67
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            aii.u r6 = r0.u
            yhm.o.b(r7)
            goto L58
        L3a:
            yhm.o.b(r7)
            boolean r7 = r6 instanceof com.revolut.retail.core.navigation.NaviCommand
            if (r7 == 0) goto L8d
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.b(r6)
            klf.h0 r7 = r5.f184787l
            kotlinx.coroutines.flow.SharedFlow r7 = r7.d()
            r0.u = r6
            r0.f184767x = r4
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L58
            goto L66
        L58:
            tof.a3 r7 = (tof.a3) r7
            r0.u = r6
            r0.f184767x = r3
            wa7.p r2 = r5.f184789n
            java.lang.Object r7 = r2.e(r7, r0)
            if (r7 != r1) goto L67
        L66:
            return r1
        L67:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L89
            qa7.a r7 = qa7.a.f243970a
            com.revolut.kompot.navigable.vc.ViewController r7 = r5.o2(r7)
            k79.b r0 = new k79.b
            r1 = 21
            r0.<init>(r5, r6, r1)
            java.lang.String r6 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)
            r7.H = r0
            r6 = 3
            r0 = 0
            yji.n.P2(r5, r7, r0, r0, r6)
            goto L8e
        L89:
            r5.A2(r6)
            goto L8e
        L8d:
            r4 = 0
        L8e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.k1.b3(java.lang.Object, gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        return Intrinsics.f(str, "ID_EXTRAS_FROM_ITEM") ? b3(obj2, (gim.c) continuation) : Boolean.FALSE;
    }
}
