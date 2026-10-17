package o7c;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import rfm.f0;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements jf0.d, q06.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f222754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j6c.b f222755b;

    public e(sri.m navigator, j6c.b revolutPayOrderSummaryProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(revolutPayOrderSummaryProvider, "revolutPayOrderSummaryProvider");
        this.f222754a = navigator;
        this.f222755b = revolutPayOrderSummaryProvider;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "revolut-pay") && cVar.e(2).length() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o7c.d
            if (r0 == 0) goto L13
            r0 = r6
            o7c.d r0 = (o7c.d) r0
            int r1 = r0.f222753w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f222753w = r1
            goto L1a
        L13:
            o7c.d r0 = new o7c.d
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f222753w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            j6c.a r6 = j6c.b.Companion
            r6 = 0
            j6c.b r2 = r4.f222755b
            b7c.c r2 = (b7c.c) r2
            efm.d0 r5 = r2.a(r5, r6)
            r0.f222753w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            com.revolut.kompot.common.ParcelableDestination r6 = (com.revolut.kompot.common.ParcelableDestination) r6
            q06.h r5 = new q06.h
            r0 = 0
            r5.<init>(r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o7c.e.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        b7c.c cVar = (b7c.c) this.f222755b;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ufm.i iVar = new ufm.i(cVar.a(deeplink, false), new b79.g(new b73.h(7), 2), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        f0 f0VarF = new pfm.a(iVar, new o5i.a(6, new o3k.a(this, 14)), 4).f(d0.m(Boolean.TRUE));
        Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
        ufm.b bVarM = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return ue0.e.C(f0VarF, bVarM);
    }
}
