package om4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp4.l f226762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final al4.n f226763b;

    public z(dp4.l repository, al4.n creditCardInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        this.f226762a = repository;
        this.f226763b = creditCardInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r20, hl4.e r21, hl4.g r22, dj0.d r23, java.lang.Boolean r24, gim.c r25) throws java.lang.Throwable {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r25
            boolean r3 = r2 instanceof om4.x
            if (r3 == 0) goto L19
            r3 = r2
            om4.x r3 = (om4.x) r3
            int r4 = r3.B
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.B = r4
            goto L1e
        L19:
            om4.x r3 = new om4.x
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.z
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.B
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L4d
            if (r5 == r7) goto L39
            if (r5 != r6) goto L31
            yhm.o.b(r2)
            return r2
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            java.lang.Boolean r1 = r3.f226740y
            dj0.d r5 = r3.f226739x
            hl4.g r7 = r3.f226738w
            hl4.e r9 = r3.v
            java.lang.String r10 = r3.u
            yhm.o.b(r2)
            r16 = r1
            r15 = r5
            r13 = r7
            r12 = r9
            r11 = r10
            goto L86
        L4d:
            yhm.o.b(r2)
            r3.u = r1
            r2 = r21
            r3.v = r2
            r5 = r22
            r3.f226738w = r5
            r9 = r23
            r3.f226739x = r9
            r10 = r24
            r3.f226740y = r10
            r3.B = r7
            w4l.h r11 = w4l.h.f294642c
            al4.n r12 = r0.f226763b
            om4.x2 r12 = (om4.x2) r12
            kotlinx.coroutines.flow.Flow r11 = r12.y(r1, r11)
            ol6.b r12 = new ol6.b
            r13 = 6
            r12.<init>(r13)
            jhi.b r7 = mo3.a.g(r11, r8, r12, r7)
            java.lang.Object r7 = vkm.q.x(r7, r3)
            if (r7 != r4) goto L7f
            goto Lae
        L7f:
            r11 = r1
            r12 = r2
            r13 = r5
            r2 = r7
            r15 = r9
            r16 = r10
        L86:
            io3.d r2 = (io3.d) r2
            java.lang.String r14 = r2.f163145a
            r3.u = r8
            r3.v = r8
            r3.f226738w = r8
            r3.f226739x = r8
            r3.f226740y = r8
            r3.B = r6
            dp4.l r10 = r0.f226762a
            r10.getClass()
            ac8.h r9 = new ac8.h
            r17 = 0
            r18 = 3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            java.lang.Object r1 = skm.e0.J(r1, r9, r3)
            if (r1 != r4) goto Laf
        Lae:
            return r4
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.z.a(java.lang.String, hl4.e, hl4.g, dj0.d, java.lang.Boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r12, gim.c r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof om4.y
            if (r0 == 0) goto L13
            r0 = r13
            om4.y r0 = (om4.y) r0
            int r1 = r0.f226755x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226755x = r1
            goto L18
        L13:
            om4.y r0 = new om4.y
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226755x
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r13)
            return r13
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            java.lang.String r12 = r0.u
            yhm.o.b(r13)
        L38:
            r7 = r12
            goto L5c
        L3a:
            yhm.o.b(r13)
            r0.u = r12
            r0.f226755x = r4
            w4l.h r13 = w4l.h.f294642c
            al4.n r2 = r11.f226763b
            om4.x2 r2 = (om4.x2) r2
            kotlinx.coroutines.flow.Flow r13 = r2.y(r12, r13)
            ol6.b r2 = new ol6.b
            r5 = 6
            r2.<init>(r5)
            jhi.b r13 = mo3.a.g(r13, r9, r2, r4)
            java.lang.Object r13 = vkm.q.x(r13, r0)
            if (r13 != r1) goto L38
            goto L7a
        L5c:
            io3.d r13 = (io3.d) r13
            java.lang.String r8 = r13.f163145a
            r0.u = r9
            r0.f226755x = r3
            dp4.l r6 = r11.f226762a
            r6.getClass()
            dce.s0 r5 = new dce.s0
            r10 = 13
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r5, r0)
            if (r12 != r1) goto L7b
        L7a:
            return r1
        L7b:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.z.b(java.lang.String, gim.c):java.lang.Object");
    }
}
