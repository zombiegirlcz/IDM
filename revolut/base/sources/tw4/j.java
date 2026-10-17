package tw4;

import al4.q;
import kotlin.jvm.internal.Intrinsics;
import om4.k0;

/* JADX INFO: loaded from: classes22.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f274915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f274916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f274917c;

    public j(a creditCardInstalmentWidgetAvailabilityProvider, q creditCardProductInteractor, k0 creditCardFeatureInteractor) {
        Intrinsics.checkNotNullParameter(creditCardInstalmentWidgetAvailabilityProvider, "creditCardInstalmentWidgetAvailabilityProvider");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(creditCardFeatureInteractor, "creditCardFeatureInteractor");
        this.f274915a = creditCardInstalmentWidgetAvailabilityProvider;
        this.f274916b = creditCardProductInteractor;
        this.f274917c = creditCardFeatureInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof tw4.h
            if (r0 == 0) goto L13
            r0 = r6
            tw4.h r0 = (tw4.h) r0
            int r1 = r0.f274912w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f274912w = r1
            goto L18
        L13:
            tw4.h r0 = new tw4.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f274912w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L6d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            w4l.j r6 = w4l.j.f294644c
            al4.q r2 = r4.f274916b
            om4.y3 r2 = (om4.y3) r2
            akg.n r5 = r2.f(r5, r6)
            tsk.j r6 = new tsk.j
            r2 = 20
            r6.<init>(r2)
            akg.n r5 = nim.a.v(r5, r6)
            zhm.h0 r6 = zhm.h0.f322473a
            vkm.q0 r5 = rd0.e.n(r5, r6)
            tsk.j r6 = new tsk.j
            r2 = 21
            r6.<init>(r2)
            cxe.u r5 = nim.a.A(r5, r6)
            tq0.j r6 = new tq0.j
            r2 = 27
            r6.<init>(r2)
            r2 = 0
            jhi.b r5 = mo3.a.g(r5, r2, r6, r3)
            r0.f274912w = r3
            java.lang.Object r6 = vkm.q.z(r5, r0)
            if (r6 != r1) goto L6d
            return r1
        L6d:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r6, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tw4.j.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof tw4.i
            if (r0 == 0) goto L13
            r0 = r8
            tw4.i r0 = (tw4.i) r0
            int r1 = r0.f274914x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f274914x = r1
            goto L18
        L13:
            tw4.i r0 = new tw4.i
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f274914x
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r8)
            return r8
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L69
        L3b:
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L52
        L41:
            yhm.o.b(r8)
            r0.u = r7
            r0.f274914x = r5
            tw4.a r8 = r6.f274915a
            r8.getClass()
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            if (r8 != r1) goto L52
            goto L7c
        L52:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7e
            r0.u = r7
            r0.f274914x = r4
            yw4.f r8 = yw4.f.INSTALMENT_PLAN_VIEW
            om4.k0 r2 = r6.f274917c
            java.lang.Object r8 = r2.b(r7, r8, r0)
            if (r8 != r1) goto L69
            goto L7c
        L69:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7e
            r8 = 0
            r0.u = r8
            r0.f274914x = r3
            java.lang.Object r7 = r6.a(r7, r0)
            if (r7 != r1) goto L7d
        L7c:
            return r1
        L7d:
            return r7
        L7e:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tw4.j.b(java.lang.String, gim.c):java.lang.Object");
    }
}
