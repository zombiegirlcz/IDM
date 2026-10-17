package h64;

import ang.f;
import com.revolut.feature.credit.application.plugins.impl.ui.close.flow.CreditApplicationCloseFlowContract$InputData;
import gvc.m;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;
import yki.j;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends h implements j {
    public final CreditApplicationCloseFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xq3.j f149590p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f149591q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f149592r;

    public c(CreditApplicationCloseFlowContract$InputData inputData, xq3.j creditApplicationInteractor, f userInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditApplicationInteractor, "creditApplicationInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = inputData;
        this.f149590p = creditApplicationInteractor;
        this.f149591q = userInteractor;
        this.f149592r = d8l.d.a(this, new h1c.c(this, 11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r7 == r2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(h64.c r6, gim.c r7) {
        /*
            xq3.j r0 = r6.f149590p
            boolean r1 = r7 instanceof h64.b
            if (r1 == 0) goto L15
            r1 = r7
            h64.b r1 = (h64.b) r1
            int r2 = r1.f149589w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f149589w = r2
            goto L1a
        L15:
            h64.b r1 = new h64.b
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f149589w
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L38
            if (r3 == r5) goto L34
            if (r3 != r4) goto L2c
            yhm.o.b(r7)
            goto L5a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            return r7
        L38:
            yhm.o.b(r7)
            com.revolut.feature.credit.application.plugins.impl.ui.close.flow.CreditApplicationCloseFlowContract$InputData r6 = r6.o
            java.lang.String r7 = r6.f67211a
            if (r7 == 0) goto L4b
            r1.f149589w = r5
            java.lang.Object r6 = r0.f(r7, r1)
            if (r6 != r2) goto L4a
            goto L59
        L4a:
            return r6
        L4b:
            ft3.d1 r6 = r6.f67212b
            java.util.Set r6 = zhm.y0.b(r6)
            r1.f149589w = r4
            java.lang.Object r7 = xq3.j.g(r0, r6, r1)
            if (r7 != r2) goto L5a
        L59:
            return r2
        L5a:
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = zhm.d0.b0(r7)
            it3.d r6 = (it3.d) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h64.c.I2(h64.c, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new m(this, null, 7), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f149592r;
    }
}
