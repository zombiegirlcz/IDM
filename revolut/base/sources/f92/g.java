package f92;

import com.revolut.feature.apm.multibanco.impl.via_verde.data.ViaVerdeService;
import f5g.l;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViaVerdeService f132817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x4l.c f132818b;

    public g(ViaVerdeService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f132817a = service;
        Continuation continuation = null;
        this.f132818b = new x4l.c(new e6d.f(this, continuation, 5), new f7l.c(2), new l(9), new e31.i(2, 7, continuation), new eci.a(3, 3, continuation));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable a(f92.g r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof f92.e
            if (r0 == 0) goto L13
            r0 = r5
            f92.e r0 = (f92.e) r0
            int r1 = r0.f132815w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f132815w = r1
            goto L18
        L13:
            f92.e r0 = new f92.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f132815w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            com.revolut.feature.apm.multibanco.impl.via_verde.data.ViaVerdeService r4 = r4.f132817a
            r0.f132815w = r3
            java.lang.Object r5 = r4.getEnrollments(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            f92.c r5 = (f92.c) r5
            java.util.List r4 = r5.getData()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            f92.d r5 = new f92.d
            r5.<init>()
            java.util.List r4 = zhm.d0.P0(r4, r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = zhm.w.t(r4, r0)
            r5.<init>(r0)
            java.util.Iterator r4 = r4.iterator()
        L5f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r0 = r4.next()
            f92.a r0 = (f92.a) r0
            com.revolut.feature.apm.multibanco.impl.via_verde.data.ViaVerdeEnrollment r0 = c8g.c.r(r0)
            r5.add(r0)
            goto L5f
        L73:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f92.g.a(f92.g, gim.c):java.io.Serializable");
    }
}
