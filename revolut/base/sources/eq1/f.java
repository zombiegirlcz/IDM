package eq1;

import cli.g;
import cli.k;
import cli.y;
import ebg.o;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zjh.j;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends h implements dli.b {
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f128222p;

    public f(j interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.o = interactor;
        this.f128222p = mra.d.b(this, k.f25028a, new a54.b(7), null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(eq1.f r6, gim.c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof eq1.e
            if (r0 == 0) goto L13
            r0 = r7
            eq1.e r0 = (eq1.e) r0
            int r1 = r0.f128221w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128221w = r1
            goto L18
        L13:
            eq1.e r0 = new eq1.e
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f128221w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L59
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            zjh.j r7 = r6.o
            r0.f128221w = r3
            java.lang.Object r7 = r7.f322839a
            wo1.b r7 = (wo1.b) r7
            xo1.d r2 = new xo1.d
            xo1.g r3 = xo1.g.F24
            r4 = 30
            r5 = 0
            r2.<init>(r3, r5, r5, r4)
            vp1.c r7 = (vp1.c) r7
            rp1.j r7 = r7.f291042a
            rp1.d r3 = new rp1.d
            r4 = 0
            r3.<init>(r7, r2, r5, r4)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r7, r3, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            com.revolut.feature.apm.bills.core.api.model.form.BillFormV2 r7 = (com.revolut.feature.apm.bills.core.api.model.form.BillFormV2) r7
            eq1.c r0 = new eq1.c
            r0.<init>(r7)
            r6.C2(r0)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: eq1.f.I2(eq1.f, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new o(this, null, 22), new yi5.b(26));
    }

    @Override // cli.z
    public final g getState() {
        return this.f128222p;
    }
}
