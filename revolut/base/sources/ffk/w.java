package ffk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfk.g0;

/* JADX INFO: loaded from: classes11.dex */
public final class w {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f134853a;

    public w(g0 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f134853a = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ffk.v
            if (r0 == 0) goto L13
            r0 = r6
            ffk.v r0 = (ffk.v) r0
            int r1 = r0.f134852w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134852w = r1
            goto L18
        L13:
            ffk.v r0 = new ffk.v
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f134852w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L77
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            pfk.g0 r6 = r5.f134853a
            r6.getClass()
            java.lang.String r2 = "loadingStrategy"
            w4l.h r4 = w4l.h.f294642c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            x4l.c r6 = r6.d
            kotlin.Unit r2 = kotlin.Unit.f186387a
            vkm.d r6 = r6.b(r2, r4)
            fe9.f r2 = new fe9.f
            r4 = 26
            r2.<init>(r4)
            akg.n r6 = nim.a.v(r6, r2)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.q0 r6 = rd0.e.n(r6, r2)
            fe9.f r2 = new fe9.f
            r4 = 25
            r2.<init>(r4)
            cxe.u r6 = nim.a.A(r6, r2)
            fci.e0 r2 = new fci.e0
            r4 = 15
            r2.<init>(r4)
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r2, r3)
            r0.f134852w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L77
            return r1
        L77:
            java.util.Optional r6 = (java.util.Optional) r6
            boolean r0 = r6.isPresent()
            if (r0 == 0) goto L84
            java.lang.Object r6 = r6.get()
            return r6
        L84:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ffk.w.a(gim.c):java.lang.Object");
    }
}
