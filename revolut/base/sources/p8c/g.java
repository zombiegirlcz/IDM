package p8c;

import fim.h;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import s6c.m;
import yhm.m;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends n implements c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b6c.a f234143l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g9c.b f234144m;

    public g(b6c.a paymentsInteractor, g9c.b statusDialogModelBuilder) {
        Intrinsics.checkNotNullParameter(paymentsInteractor, "paymentsInteractor");
        Intrinsics.checkNotNullParameter(statusDialogModelBuilder, "statusDialogModelBuilder");
        this.f234143l = paymentsInteractor;
        this.f234144m = statusDialogModelBuilder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.feature.revolutpay.api.shared.domain.models.AcceptPaymentParams r7, boolean r8, gim.c r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p8c.d
            if (r0 == 0) goto L13
            r0 = r9
            p8c.d r0 = (p8c.d) r0
            int r1 = r0.f234142x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f234142x = r1
            goto L18
        L13:
            p8c.d r0 = new p8c.d
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f234142x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L77
            goto L74
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            boolean r8 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L77
            goto L67
        L38:
            yhm.o.b(r9)
            g9c.b r9 = r6.f234144m
            rdc.d r9 = r9.f141530a
            r9 = 0
            nii.y0 r9 = rdc.d.a(r9)
            r6.L2(r9)
            b6c.a r9 = r6.f234143l     // Catch: java.lang.Exception -> L77
            r0.u = r8     // Catch: java.lang.Exception -> L77
            r0.f234142x = r4     // Catch: java.lang.Exception -> L77
            q7c.j r9 = (q7c.j) r9     // Catch: java.lang.Exception -> L77
            k7c.g0 r9 = r9.f242819b     // Catch: java.lang.Exception -> L77
            r9.getClass()     // Catch: java.lang.Exception -> L77
            k3k.q0 r2 = new k3k.q0     // Catch: java.lang.Exception -> L77
            r4 = 24
            r5 = 0
            r2.<init>(r9, r7, r5, r4)     // Catch: java.lang.Exception -> L77
            skm.p0 r7 = skm.p0.f264001a     // Catch: java.lang.Exception -> L77
            elm.f r7 = elm.f.f127540b     // Catch: java.lang.Exception -> L77
            java.lang.Object r9 = skm.e0.J(r7, r2, r0)     // Catch: java.lang.Exception -> L77
            if (r9 != r1) goto L67
            goto L73
        L67:
            s6c.m r9 = (s6c.m) r9     // Catch: java.lang.Exception -> L77
            r0.u = r8     // Catch: java.lang.Exception -> L77
            r0.f234142x = r3     // Catch: java.lang.Exception -> L77
            java.lang.Object r9 = r6.b3(r9, r8, r0)     // Catch: java.lang.Exception -> L77
            if (r9 != r1) goto L74
        L73:
            return r1
        L74:
            p8c.a r9 = (p8c.a) r9     // Catch: java.lang.Exception -> L77
            return r9
        L77:
            r6.t2()
            p8c.a$b r7 = p8c.a.b.f234139a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p8c.g.Z2(com.revolut.feature.revolutpay.api.shared.domain.models.AcceptPaymentParams, boolean, gim.c):java.lang.Object");
    }

    public final Object b3(m mVar, boolean z, d frame) {
        eim.c cVar = new eim.c(h.b(frame));
        String str = mVar.f260230a;
        s6c.n nVar = mVar.f260231b;
        s6c.n nVar2 = s6c.n.AUTHORISATION_PASSED;
        g9c.b bVar = this.f234144m;
        if (nVar == nVar2) {
            n.j2(this, L2(bVar.c(z)), null, new e(cVar, null), 3);
        } else if (nVar != s6c.n.AUTHORISATION_STARTED || str == null || d0.W(str)) {
            n.j2(this, L2(bVar.b(null, null)), null, new f(cVar, null), 3);
        } else {
            t2();
            m.Companion companion = yhm.m.INSTANCE;
            cVar.resumeWith(new b(str));
            Unit unit = Unit.f186387a;
        }
        Object objB = cVar.b();
        if (objB == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objB;
    }
}
