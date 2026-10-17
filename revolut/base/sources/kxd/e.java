package kxd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f190568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u51.a f190569b;

    public e(fk3.a configurationInteractor, u51.a topupMethodsInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(topupMethodsInteractor, "topupMethodsInteractor");
        this.f190568a = configurationInteractor;
        this.f190569b = topupMethodsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(xi0.b r11, io3.l r12, gim.c r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof kxd.d
            if (r0 == 0) goto L13
            r0 = r13
            kxd.d r0 = (kxd.d) r0
            int r1 = r0.f190567w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f190567w = r1
            goto L18
        L13:
            kxd.d r0 = new kxd.d
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f190567w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L62
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r13)
            java.lang.String r5 = r11.f306286a
            yte.n r6 = yte.n.CURRENT
            r9 = 0
            u51.a r11 = r10.f190569b
            r4 = r11
            e0f.r1 r4 = (e0f.r1) r4
            w4l.h r7 = w4l.h.f294642c
            r8 = 0
            wkm.l r11 = r4.j(r5, r6, r7, r8, r9)
            kxd.b r13 = new kxd.b
            r2 = 0
            r13.<init>(r12, r2)
            akg.n r11 = nim.a.v(r11, r13)
            ku1.f0 r12 = new ku1.f0
            r13 = 24
            r12.<init>(r13)
            r13 = 0
            jhi.b r11 = mo3.a.g(r11, r13, r12, r3)
            r0.f190567w = r3
            java.lang.Object r13 = vkm.q.z(r11, r0)
            if (r13 != r1) goto L62
            return r1
        L62:
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L69
            zhm.f0 r11 = zhm.f0.f322471a
            return r11
        L69:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kxd.e.a(xi0.b, io3.l, gim.c):java.lang.Object");
    }
}
