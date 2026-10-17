package m48;

import g48.r0;
import kotlin.jvm.internal.Intrinsics;
import yfe.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f202676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f202677b;

    public f(r0 jointAccountsInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f202676a = jointAccountsInteractor;
        this.f202677b = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // yfe.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof m48.d
            if (r0 == 0) goto L13
            r0 = r5
            m48.d r0 = (m48.d) r0
            int r1 = r0.f202672w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f202672w = r1
            goto L1a
        L13:
            m48.d r0 = new m48.d
            gim.c r5 = (gim.c) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f202672w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            r0.f202672w = r3
            g48.r0 r5 = r4.f202676a
            java.lang.Boolean r5 = r5.n()
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L49
            r5 = 0
            return r5
        L49:
            yfe.h$c$b r5 = yfe.h.c.b.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m48.f.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // yfe.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey r6, java.util.ArrayList r7, dj0.d r8, kotlin.coroutines.Continuation r9) {
        /*
            r5 = this;
            boolean r6 = r9 instanceof m48.e
            if (r6 == 0) goto L13
            r6 = r9
            m48.e r6 = (m48.e) r6
            int r0 = r6.z
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.z = r0
            goto L1a
        L13:
            m48.e r6 = new m48.e
            gim.c r9 = (gim.c) r9
            r6.<init>(r5, r9)
        L1a:
            java.lang.Object r9 = r6.f202674x
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.z
            java.lang.String r2 = ""
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L44
            if (r1 == r4) goto L3c
            if (r1 != r3) goto L34
            int r7 = r6.f202673w
            yfe.l1 r8 = r6.v
            dj0.d r6 = r6.u
            yhm.o.b(r9)
            goto L87
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            int r7 = r6.f202673w
            dj0.d r8 = r6.u
            yhm.o.b(r9)
            goto L60
        L44:
            yhm.o.b(r9)
            int r7 = r7.size()
            ang.f r9 = r5.f202677b
            zmg.d r9 = r9.d
            efm.k r9 = r9.c()
            r6.u = r8
            r6.f202673w = r7
            r6.z = r4
            java.lang.Object r9 = nim.a.i(r9, r6)
            if (r9 != r0) goto L60
            goto L84
        L60:
            do3.n r9 = (do3.n) r9
            if (r9 == 0) goto L6a
            java.lang.String r9 = te0.w.I(r9)
            if (r9 != 0) goto L6b
        L6a:
            r9 = r2
        L6b:
            yfe.l1 r1 = new yfe.l1
            r1.<init>(r9)
            g48.r0 r9 = r5.f202676a
            et6.u1 r9 = r9.r()
            r6.u = r8
            r6.v = r1
            r6.f202673w = r7
            r6.z = r3
            java.lang.Object r9 = vkm.q.x(r9, r6)
            if (r9 != r0) goto L85
        L84:
            return r0
        L85:
            r6 = r8
            r8 = r1
        L87:
            od0.i r9 = (od0.i) r9
            java.lang.Object r9 = r9.g()
            n38.z r9 = (n38.z) r9
            if (r9 == 0) goto L9f
            yfe.i1 r0 = new yfe.i1
            java.lang.String r1 = r9.f
            java.lang.String r2 = r9.e
            if (r2 != 0) goto L9b
            java.lang.String r2 = r9.d
        L9b:
            r0.<init>(r1, r2)
            goto La5
        L9f:
            yfe.i1 r0 = new yfe.i1
            r9 = 0
            r0.<init>(r2, r9)
        La5:
            yfe.n r9 = new yfe.n
            r9.<init>(r6, r7, r8, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m48.f.b(com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey, java.util.ArrayList, dj0.d, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
