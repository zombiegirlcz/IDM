package hw3;

import ft3.j1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ylg.b f156060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sv3.a f156061b;

    public e(ylg.b userInteractor, sv3.a countriesProviderCredit) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(countriesProviderCredit, "countriesProviderCredit");
        this.f156060a = userInteractor;
        this.f156061b = countriesProviderCredit;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(hw3.e r4, ju3.a r5, ft3.j1 r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof wt3.a
            if (r0 == 0) goto L13
            r0 = r7
            wt3.a r0 = (wt3.a) r0
            int r1 = r0.f299767x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f299767x = r1
            goto L18
        L13:
            wt3.a r0 = new wt3.a
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f299767x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ju3.a r5 = r0.u
            yhm.o.b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r7)
            ufm.i r4 = r4.a(r6)
            r0.u = r5
            r0.f299767x = r3
            java.lang.Object r7 = nim.a.b(r4, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            ju3.c r7 = (ju3.c) r7
            java.util.Map r4 = r7.f178573b
            java.lang.Object r4 = r4.get(r5)
            boolean r5 = r4 instanceof com.revolut.feature.credit.application.plugins.api.models.config.ScreenConfig
            if (r5 == 0) goto L52
            com.revolut.feature.credit.application.plugins.api.models.config.ScreenConfig r4 = (com.revolut.feature.credit.application.plugins.api.models.config.ScreenConfig) r4
            return r4
        L52:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hw3.e.c(hw3.e, ju3.a, ft3.j1, gim.c):java.lang.Object");
    }

    public final ufm.i a(j1 productType) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        ufm.i iVar = new ufm.i(((ang.f) this.f156060a).f(false), new d(0, new hul.v(this, productType, 3)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final ufm.i b(ju3.a id10, j1 productType) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(productType, "productType");
        ufm.i iVar = new ufm.i(new ufm.i(a(productType), new d(1, new hul.v(id10, this, 4)), 1), new d(2, new hu1.h0(25)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
