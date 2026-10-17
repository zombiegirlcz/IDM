package vw4;

import al4.q;
import kotlin.jvm.internal.Intrinsics;
import om4.k0;

/* JADX INFO: loaded from: classes22.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f292644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f292645b;

    public m(k0 creditCardFeatureInteractor, q creditCardProductInteractor) {
        Intrinsics.checkNotNullParameter(creditCardFeatureInteractor, "creditCardFeatureInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        this.f292644a = creditCardFeatureInteractor;
        this.f292645b = creditCardProductInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof vw4.k
            if (r0 == 0) goto L13
            r0 = r6
            vw4.k r0 = (vw4.k) r0
            int r1 = r0.f292641w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f292641w = r1
            goto L18
        L13:
            vw4.k r0 = new vw4.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f292641w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L6b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            w4l.j r6 = w4l.j.f294644c
            al4.q r2 = r4.f292645b
            om4.y3 r2 = (om4.y3) r2
            akg.n r5 = r2.f(r5, r6)
            vrl.i0 r6 = new vrl.i0
            r2 = 29
            r6.<init>(r2)
            akg.n r5 = nim.a.v(r5, r6)
            zhm.h0 r6 = zhm.h0.f322473a
            vkm.q0 r5 = rd0.e.n(r5, r6)
            vw4.j r6 = new vw4.j
            r2 = 0
            r6.<init>(r2)
            cxe.u r5 = nim.a.A(r5, r6)
            vv7.l r6 = new vv7.l
            r2 = 6
            r6.<init>(r2)
            r2 = 0
            jhi.b r5 = mo3.a.g(r5, r2, r6, r3)
            r0.f292641w = r3
            java.lang.Object r6 = vkm.q.z(r5, r0)
            if (r6 != r1) goto L6b
            return r1
        L6b:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r6, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vw4.m.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof vw4.l
            if (r0 == 0) goto L13
            r0 = r7
            vw4.l r0 = (vw4.l) r0
            int r1 = r0.f292643x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f292643x = r1
            goto L18
        L13:
            vw4.l r0 = new vw4.l
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f292643x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L4a
        L38:
            yhm.o.b(r7)
            r0.u = r6
            r0.f292643x = r4
            yw4.f r7 = yw4.f.REV_POINTS_MIGRATED
            om4.k0 r2 = r5.f292644a
            java.lang.Object r7 = r2.b(r6, r7, r0)
            if (r7 != r1) goto L4a
            goto L5d
        L4a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L5f
            r7 = 0
            r0.u = r7
            r0.f292643x = r3
            java.lang.Object r6 = r5.a(r6, r0)
            if (r6 != r1) goto L5e
        L5d:
            return r1
        L5e:
            return r6
        L5f:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vw4.m.b(java.lang.String, gim.c):java.lang.Object");
    }
}
