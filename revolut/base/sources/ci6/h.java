package ci6;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yfe.h;
import yfe.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y91.b f24398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oe6.a f24399b;

    public h(y91.b accountsProductFeatureChecker, oe6.a externalInstitutionsInteractor) {
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        this.f24398a = accountsProductFeatureChecker;
        this.f24399b = externalInstitutionsInteractor;
    }

    @Override // yfe.o0
    public final Object a(Continuation continuation) {
        if (this.f24398a.a("ACCOUNT.linked_account")) {
            return h.c.C1743c.INSTANCE;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // yfe.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey r9, java.util.ArrayList r10, dj0.d r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ci6.h.b(com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey, java.util.ArrayList, dj0.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ci6.f
            if (r0 == 0) goto L13
            r0 = r6
            ci6.f r0 = (ci6.f) r0
            int r1 = r0.f24394w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24394w = r1
            goto L18
        L13:
            ci6.f r0 = new ci6.f
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f24394w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L5d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            oe6.b r6 = oe6.b.f224551a
            oe6.a r2 = r5.f24399b
            xg6.j r2 = (xg6.j) r2
            w4l.h r4 = w4l.h.f294642c
            sfm.b r6 = r2.i(r4, r6)
            vkm.d r6 = rd0.e.b(r6)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.q0 r6 = rd0.e.n(r6, r2)
            ccg.a r2 = new ccg.a
            r4 = 15
            r2.<init>(r4)
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r2, r3)
            r0.f24394w = r3
            java.lang.Object r6 = vkm.q.z(r6, r0)
            if (r6 != r1) goto L5d
            return r1
        L5d:
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L63
            zhm.f0 r6 = zhm.f0.f322471a
        L63:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ci6.h.c(gim.c):java.lang.Object");
    }
}
