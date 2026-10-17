package j88;

import kotlin.jvm.internal.Intrinsics;
import yfe.o0;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hj8.a f172162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rul.e f172163b;

    public g(hj8.a juniorProfileInteractor, rul.e juniorAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorAvailabilityInteractor, "juniorAvailabilityInteractor");
        this.f172162a = juniorProfileInteractor;
        this.f172163b = juniorAvailabilityInteractor;
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
            boolean r0 = r5 instanceof j88.e
            if (r0 == 0) goto L13
            r0 = r5
            j88.e r0 = (j88.e) r0
            int r1 = r0.f172158w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172158w = r1
            goto L1a
        L13:
            j88.e r0 = new j88.e
            gim.c r5 = (gim.c) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f172158w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            r0.f172158w = r3
            java.lang.Object r5 = r4.c(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L48
            yfe.h$c$d r5 = yfe.h.c.d.INSTANCE
            return r5
        L48:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j88.g.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // yfe.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey r12, java.util.ArrayList r13, dj0.d r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j88.g.b(com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey, java.util.ArrayList, dj0.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof j88.d
            if (r0 == 0) goto L13
            r0 = r9
            j88.d r0 = (j88.d) r0
            int r1 = r0.f172157w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172157w = r1
            goto L18
        L13:
            j88.d r0 = new j88.d
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f172157w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L7e
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L2f:
            yhm.o.b(r9)
            rul.e r9 = r8.f172163b
            java.lang.Object r2 = r9.f257630b
            jla.h r2 = (jla.h) r2
            ne8.a r4 = ne8.a.f214420c
            java.lang.String r4 = r4.a()
            exe.j r2 = bla.b.b(r2, r4)
            sa6.o r4 = new sa6.o
            r5 = 4
            r4.<init>(r2, r5)
            pc2.d r2 = new pc2.d
            r5 = 21
            r6 = 3
            r7 = 0
            r2.<init>(r6, r5, r7)
            vkm.y r5 = new vkm.y
            r5.<init>(r4, r2)
            td1.f r2 = new td1.f
            r4 = 6
            r2.<init>(r9, r4)
            kotlinx.coroutines.flow.Flow r9 = boh.f.e(r5, r2)
            j7b.m r2 = new j7b.m
            r2.<init>(r4)
            jhi.b r9 = mo3.a.g(r9, r7, r2, r3)
            i23.c r2 = new i23.c
            r4 = 5
            r2.<init>(r6, r4, r7)
            zhm.h0 r4 = zhm.h0.f322473a
            vkm.y r9 = rd0.e.e(r9, r4, r2)
            r0.f172157w = r3
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto L7e
            return r1
        L7e:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r9.getClass()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j88.g.c(gim.c):java.lang.Object");
    }
}
