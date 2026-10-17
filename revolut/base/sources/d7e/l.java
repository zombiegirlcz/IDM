package d7e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements xfe.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f111947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f111948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g6e.d f111949c;

    public l(h personalContentProvider, c jointContentProvider, b groupContentProvider, g juniorContentProvider, i proContentProvider, g6e.d subaccountInteractor) {
        Intrinsics.checkNotNullParameter(personalContentProvider, "personalContentProvider");
        Intrinsics.checkNotNullParameter(jointContentProvider, "jointContentProvider");
        Intrinsics.checkNotNullParameter(groupContentProvider, "groupContentProvider");
        Intrinsics.checkNotNullParameter(juniorContentProvider, "juniorContentProvider");
        Intrinsics.checkNotNullParameter(proContentProvider, "proContentProvider");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        this.f111947a = groupContentProvider;
        this.f111948b = juniorContentProvider;
        this.f111949c = subaccountInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // xfe.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.tab.accounts.models.ProductAccountId r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d7e.l.b(com.revolut.feature.tab.accounts.models.ProductAccountId, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.tab.accounts.models.ProductAccountId r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof d7e.k
            if (r0 == 0) goto L13
            r0 = r6
            d7e.k r0 = (d7e.k) r0
            int r1 = r0.f111946x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111946x = r1
            goto L18
        L13:
            d7e.k r0 = new d7e.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111946x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.tab.accounts.models.ProductAccountId r5 = r0.u
            yhm.o.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            java.lang.String r6 = r5.f89729a
            g6e.d r2 = r4.f111949c
            s6e.z r2 = (s6e.z) r2
            vkm.d r6 = r2.u(r6)
            r0.u = r5
            r0.f111946x = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            java.lang.Object r6 = r6.getContent()
            com.revolut.feature.subaccount.api.models.Subaccount r6 = (com.revolut.feature.subaccount.api.models.Subaccount) r6
            if (r6 == 0) goto L54
            return r6
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r5 = r5.f89729a
            java.lang.String r0 = "Subaccount with "
            java.lang.String r1 = " was not found"
            java.lang.String r5 = a10.b.s(r0, r5, r1)
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d7e.l.c(com.revolut.feature.tab.accounts.models.ProductAccountId, gim.c):java.lang.Object");
    }
}
