package dfj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class k3 {

    @NotNull
    public static final h3 Companion = new h3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ynj.s f114019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ynj.k f114020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nad.c f114021c;

    public k3(ynj.s imageRenderer, ynj.k imageGallerySaver, nad.c shareMediaInteractor) {
        Intrinsics.checkNotNullParameter(imageRenderer, "imageRenderer");
        Intrinsics.checkNotNullParameter(imageGallerySaver, "imageGallerySaver");
        Intrinsics.checkNotNullParameter(shareMediaInteractor, "shareMediaInteractor");
        this.f114019a = imageRenderer;
        this.f114020b = imageGallerySaver;
        this.f114021c = shareMediaInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof dfj.i3
            if (r0 == 0) goto L13
            r0 = r7
            dfj.i3 r0 = (dfj.i3) r0
            int r1 = r0.f113998w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f113998w = r1
            goto L18
        L13:
            dfj.i3 r0 = new dfj.i3
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f113998w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
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
            yhm.o.b(r7)
            goto L44
        L36:
            yhm.o.b(r7)
            r0.f113998w = r4
            ynj.s r7 = r5.f114019a
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L44
            goto L5d
        L44:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            r6 = 0
            if (r7 != 0) goto L4a
            return r6
        L4a:
            r0.f113998w = r3
            kad.a$a r6 = kad.a.C1040a.f182459a
            nad.c r2 = r5.f114021c
            kad.f r3 = new kad.f
            java.lang.String r4 = "revolut_esim_qr_code"
            r3.<init>(r7, r4)
            java.lang.Object r6 = r2.a(r6, r3, r0)
            if (r6 != r1) goto L5e
        L5d:
            return r1
        L5e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.k3.a(com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof dfj.j3
            if (r0 == 0) goto L13
            r0 = r12
            dfj.j3 r0 = (dfj.j3) r0
            int r1 = r0.f114008w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114008w = r1
            goto L18
        L13:
            dfj.j3 r0 = new dfj.j3
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114008w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r12)
            return r12
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            yhm.o.b(r12)
            goto L44
        L36:
            yhm.o.b(r12)
            r0.f114008w = r4
            ynj.s r12 = r10.f114019a
            java.lang.Object r12 = r12.a(r11, r0)
            if (r12 != r1) goto L44
            goto L6c
        L44:
            r7 = r12
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            r8 = 0
            if (r7 != 0) goto L4b
            return r8
        L4b:
            long r11 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = "revolut_esim_qr_code_"
            java.lang.String r4 = ".png"
            java.lang.String r6 = p.a.n(r11, r2, r4)
            r0.f114008w = r3
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            tx0.z4 r4 = new tx0.z4
            r9 = 15
            ynj.k r5 = r10.f114020b
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r11 = skm.e0.J(r11, r4, r0)
            if (r11 != r1) goto L6d
        L6c:
            return r1
        L6d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.k3.b(com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage, gim.c):java.lang.Object");
    }
}
