package f53;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements a53.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h53.a f132263a;

    public b(h53.a repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f132263a = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(java.lang.String r22, java.lang.String r23, java.lang.Integer r24, gim.c r25) {
        /*
            r21 = this;
            r0 = r21
            r1 = r25
            boolean r2 = r1 instanceof f53.a
            if (r2 == 0) goto L17
            r2 = r1
            f53.a r2 = (f53.a) r2
            int r3 = r2.f132262y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f132262y = r3
            goto L1c
        L17:
            f53.a r2 = new f53.a
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f132260w
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f132262y
            r5 = 1
            r10 = 0
            if (r4 == 0) goto L3d
            if (r4 != r5) goto L35
            java.lang.Integer r3 = r2.v
            java.lang.String r2 = r2.u
            yhm.o.b(r1)
            r20 = r3
            r3 = r1
            r1 = r20
            goto L69
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3d:
            yhm.o.b(r1)
            r8 = r23
            r2.u = r8
            r1 = r24
            r2.v = r1
            r2.f132262y = r5
            h53.a r4 = r0.f132263a
            r7 = r4
            h53.c r7 = (h53.c) r7
            r7.getClass()
            skm.p0 r4 = skm.p0.f264001a
            elm.f r4 = elm.f.f127540b
            gsh.w r6 = new gsh.w
            r11 = 16
            r9 = r22
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.Object r2 = skm.e0.J(r4, r6, r2)
            if (r2 != r3) goto L66
            return r3
        L66:
            r3 = r2
            r2 = r23
        L69:
            byte[] r3 = (byte[]) r3
            int r4 = r3.length
            r6 = 0
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r3, r6, r4)
            java.lang.String r4 = "decodeByteArray(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            gz0.b r15 = gz0.b.FitCenter
            if (r1 == 0) goto L8a
            int r1 = r1.intValue()
            com.revolut.core.ui_kit_core.displayers.image.transformation.CustomColors r4 = new com.revolut.core.ui_kit_core.displayers.image.transformation.CustomColors
            com.revolut.core.ui.models.Color$Solid r7 = new com.revolut.core.ui.models.Color$Solid
            r7.<init>(r1)
            r4.<init>(r5, r10, r7)
            r14 = r4
            goto L8b
        L8a:
            r14 = r10
        L8b:
            com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations r11 = new com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations
            r18 = 0
            r19 = 115(0x73, float:1.61E-43)
            r12 = 0
            r13 = 0
            r16 = 0
            r17 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            com.revolut.core.ui_kit_core.displayers.image.models.BitmapImage r1 = new com.revolut.core.ui_kit_core.displayers.image.models.BitmapImage
            r4 = 10
            r1.<init>(r3, r6, r11, r4)
            e93.f0 r3 = new e93.f0
            r3.<init>(r2, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: f53.b.a(java.lang.String, java.lang.String, java.lang.Integer, gim.c):java.io.Serializable");
    }
}
