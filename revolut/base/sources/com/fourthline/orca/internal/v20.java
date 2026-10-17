package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface v20 {
    c81 a(x20 x20Var, y20 y20Var);

    s20 a(ie1 ie1Var, x20 x20Var);

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    default com.fourthline.orca.internal.s20 a(com.fourthline.orca.internal.ie1 r22, com.fourthline.orca.internal.x20 r23, boolean r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            java.lang.String r2 = "<this>"
            r3 = r22
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            java.lang.String r2 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = 0
            if (r24 != 0) goto L14
            goto L27
        L14:
            com.fourthline.orca.internal.z20 r4 = r0.a(r1)
            boolean r5 = r4 instanceof com.fourthline.orca.internal.z20.a
            if (r5 == 0) goto L27
            com.fourthline.orca.internal.z20$a r4 = (com.fourthline.orca.internal.z20.a) r4
            com.fourthline.orca.internal.y20 r4 = r4.a()
            com.fourthline.orca.internal.c81 r5 = r0.a(r1, r4)
            goto L29
        L27:
            r4 = r2
            r5 = r4
        L29:
            if (r5 != 0) goto L2f
            com.fourthline.orca.internal.l20 r6 = com.fourthline.orca.internal.l20.f30507a
        L2d:
            r11 = r6
            goto L32
        L2f:
            com.fourthline.orca.internal.l20 r6 = com.fourthline.orca.internal.l20.f30509c
            goto L2d
        L32:
            com.fourthline.orca.internal.s20 r7 = r21.a(r22, r23)
            if (r5 != 0) goto L3c
            com.fourthline.orca.internal.c81$b r1 = com.fourthline.orca.internal.c81.b.f27406b
            r15 = r1
            goto L3d
        L3c:
            r15 = r5
        L3d:
            if (r5 == 0) goto L49
            com.fourthline.orca.internal.v10 r1 = r0.s()
            com.fourthline.orca.internal.r10 r2 = com.fourthline.orca.internal.r10.E0
            com.fourthline.orca.internal.z10 r2 = r1.a(r2)
        L49:
            r16 = r2
            r19 = 1655(0x677, float:2.319E-42)
            r20 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r17 = 0
            r18 = 0
            com.fourthline.orca.internal.s20 r1 = com.fourthline.orca.internal.s20.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            com.fourthline.orca.internal.p20 r2 = r0.k()
            r2.b(r1)
            if (r4 == 0) goto L6d
            com.fourthline.orca.internal.p20 r2 = r0.k()
            r2.a(r1, r4)
        L6d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.v20.a(com.fourthline.orca.internal.ie1, com.fourthline.orca.internal.x20, boolean):com.fourthline.orca.internal.s20");
    }

    z20 a(x20 x20Var);

    default s20 b(ie1 ie1Var, x20 type) {
        Intrinsics.checkNotNullParameter(ie1Var, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return s20.a(a(ie1Var, type), null, null, false, l20.f30508b, null, null, null, c81.b.f27406b, null, null, 0, 1655, null);
    }

    p20 k();

    v10 s();
}
