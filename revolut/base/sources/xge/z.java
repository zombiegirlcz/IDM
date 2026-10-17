package xge;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wa7.m f305756a;

    public z(wa7.m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f305756a = hiddenAccountsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList a(xge.z r5, java.util.List r6, java.util.Set r7, qfe.l r8) {
        /*
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r6.iterator()
        Lb:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r0 = r6.next()
            r1 = r0
            com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceAccountItem r1 = (com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceAccountItem) r1
            com.revolut.feature.tab.accounts.api.model.ProductAccount r1 = r1.f89560b
            com.revolut.feature.tab.accounts.models.ProductAccountId r1 = r1.getF89504c()
            java.lang.String r1 = r1.f89729a
            qfe.i r2 = qfe.i.f245294a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r8, r2)
            if (r2 == 0) goto L2d
            boolean r1 = r7.contains(r1)
            goto L57
        L2d:
            qfe.j r2 = qfe.j.f245295a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r8, r2)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L41
            boolean r1 = r7.contains(r1)
            if (r1 != 0) goto L3f
        L3d:
            r1 = r4
            goto L57
        L3f:
            r1 = r3
            goto L57
        L41:
            boolean r2 = r8 instanceof qfe.k
            if (r2 == 0) goto L5d
            boolean r2 = r7.contains(r1)
            if (r2 == 0) goto L3d
            r2 = r8
            qfe.k r2 = (qfe.k) r2
            java.lang.String r2 = r2.f245296a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r2, r1)
            if (r1 == 0) goto L3f
            goto L3d
        L57:
            if (r1 == 0) goto Lb
            r5.add(r0)
            goto Lb
        L5d:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L63:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xge.z.a(xge.z, java.util.List, java.util.Set, qfe.l):java.util.ArrayList");
    }
}
