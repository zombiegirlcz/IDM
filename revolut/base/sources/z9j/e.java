package z9j;

import cli.k;
import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import wli.x;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends h implements dli.b {
    public final x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f320507p;

    public e(n stateMapper, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = deeplinkHandler;
        this.f320507p = mra.d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(z9j.e r4, java.lang.String r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof z9j.d
            if (r0 == 0) goto L13
            r0 = r6
            z9j.d r0 = (z9j.d) r0
            int r1 = r0.f320506x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f320506x = r1
            goto L18
        L13:
            z9j.d r0 = new z9j.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f320506x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            wli.x r4 = r4.o
            lg0.a r6 = lg0.a.OPEN_BROWSER
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r0.u = r5
            r0.f320506x = r3
            java.lang.Object r6 = r4.L1(r5, r6, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            if (r4 != 0) goto L5f
            zhm.h0 r4 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r6 = rd0.d.f253311a
            rd0.c r6 = rd0.c.ERROR
            java.lang.String r0 = "Unable to handle deeplink "
            java.lang.String r5 = j6.a.q(r0, r5)
            r0 = 0
            java.lang.String r1 = "RetailRevolutXDifferenceScreenModel"
            rd0.d.a(r6, r1, r5, r0, r4)
        L5f:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z9j.e.I2(z9j.e, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f320507p;
    }
}
