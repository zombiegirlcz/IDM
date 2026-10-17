package a7e;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s6e.z;
import wsg.n;
import yhe.i;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6e.d f1855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f1856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q78.e f1857c;

    public f(g6e.d subaccountInteractor, n walletInteractor, q78.e juniorAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountDestinationResolver, "juniorAccountDestinationResolver");
        this.f1855a = subaccountInteractor;
        this.f1856b = walletInteractor;
        this.f1857c = juniorAccountDestinationResolver;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
    
        if (r15 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        if (r15 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.subaccount.api.models.Subaccount r12, io3.l r13, com.revolut.core.model.account.AccountId r14, gim.c r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof a7e.b
            if (r0 == 0) goto L13
            r0 = r15
            a7e.b r0 = (a7e.b) r0
            int r1 = r0.f1848w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1848w = r1
            goto L18
        L13:
            a7e.b r0 = new a7e.b
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f1848w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r15)
            goto L9b
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            yhm.o.b(r15)
            goto L8f
        L37:
            yhm.o.b(r15)
            wsg.n r5 = r11.f1856b
            efm.d0 r15 = osg.b.p(r5, r14, r4)
            a31.m r2 = new a31.m
            r6 = 2
            r2.<init>(r11, r6, r13, r14)
            a6b.a r6 = new a6b.a
            r7 = 4
            r6.<init>(r2, r7)
            r15.getClass()
            ufm.i r2 = new ufm.i
            r7 = 0
            r2.<init>(r15, r6, r7)
            java.lang.String r15 = "flatMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r15)
            dj0.d r15 = r12.getBalance()
            dj0.d r6 = dj0.d.e
            boolean r15 = r15.f(r6)
            if (r15 == 0) goto L92
            xi0.b r6 = r12.getCurrency()
            r8 = 0
            r10 = 28
            r7 = r13
            r9 = r14
            efm.d0 r12 = osg.b.r(r5, r6, r7, r8, r9, r10)
            r12.getClass()
            mfm.d r13 = new mfm.d
            r13.<init>(r2)
            ufm.i r14 = new ufm.i
            r15 = 2
            r14.<init>(r12, r13, r15)
            java.lang.String r12 = "onErrorResumeNext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r12)
            r0.f1848w = r4
            java.lang.Object r15 = nim.a.b(r14, r0)
            if (r15 != r1) goto L8f
            goto L9a
        L8f:
            io3.d r15 = (io3.d) r15
            goto L9d
        L92:
            r0.f1848w = r3
            java.lang.Object r15 = nim.a.b(r2, r0)
            if (r15 != r1) goto L9b
        L9a:
            return r1
        L9b:
            io3.d r15 = (io3.d) r15
        L9d:
            java.lang.String r12 = r15.f163145a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a7e.f.a(com.revolut.feature.subaccount.api.models.Subaccount, io3.l, com.revolut.core.model.account.AccountId, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a4, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cf, code lost:
    
        if (r9 != r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.subaccount.api.models.Subaccount r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a7e.f.b(com.revolut.feature.subaccount.api.models.Subaccount, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.tab.accounts.models.ProductAccountId r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof a7e.d
            if (r0 == 0) goto L13
            r0 = r6
            a7e.d r0 = (a7e.d) r0
            int r1 = r0.f1851w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1851w = r1
            goto L18
        L13:
            a7e.d r0 = new a7e.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f1851w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L55
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.String r5 = r5.f89729a
            g6e.d r6 = r4.f1855a
            s6e.z r6 = (s6e.z) r6
            vkm.v1 r5 = r6.q(r5)
            zfd.e r5 = zi0.c.w(r5)
            a5g.l r6 = new a5g.l
            r2 = 9
            r6.<init>(r2)
            r2 = 0
            jhi.b r5 = mo3.a.g(r5, r2, r6, r3)
            r0.f1851w = r3
            java.lang.Object r6 = vkm.q.z(r5, r0)
            if (r6 != r1) goto L55
            return r1
        L55:
            h6e.d r6 = (h6e.d) r6
            if (r6 != 0) goto L5c
            xfe.a$a r5 = xfe.a.C1695a.f305241a
            return r5
        L5c:
            h6e.c r5 = r6.f149629a
            if (r5 != 0) goto L68
            h6e.b r5 = r6.f149630b
            if (r5 == 0) goto L65
            goto L68
        L65:
            xfe.a$b r5 = xfe.a.b.f305242a
            return r5
        L68:
            xfe.b r5 = new xfe.b
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a7e.f.c(com.revolut.feature.tab.accounts.models.ProductAccountId, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r8, com.revolut.feature.subaccount.api.models.SubaccountType r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a7e.f.d(java.lang.String, com.revolut.feature.subaccount.api.models.SubaccountType, gim.c):java.lang.Object");
    }

    public final Object e(ProductAccountId productAccountId, i iVar) {
        Object objD = ((z) this.f1855a).d(productAccountId.f89729a, iVar);
        return objD == fim.a.COROUTINE_SUSPENDED ? objD : Unit.f186387a;
    }
}
