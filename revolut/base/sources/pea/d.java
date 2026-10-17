package pea;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yy0.f f235346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zk0.b f235347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f235348c;

    public d(yy0.f imageDisplayer, zk0.b fileSystemRepository, Context context) {
        Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f235346a = imageDisplayer;
        this.f235347b = fileSystemRepository;
        this.f235348c = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(i80.a r19, gim.c r20) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof pea.c
            if (r2 == 0) goto L18
            r2 = r1
            pea.c r2 = (pea.c) r2
            int r3 = r2.f235345w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f235345w = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            pea.c r2 = new pea.c
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.f235345w
            r9 = 2
            r4 = 1
            if (r3 == 0) goto L3c
            if (r3 == r4) goto L38
            if (r3 != r9) goto L30
            yhm.o.b(r1)
            return r1
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            yhm.o.b(r1)
            goto L82
        L3c:
            yhm.o.b(r1)
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage r10 = new com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage
            r1 = r19
            int[][] r11 = r1.f159408a
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance r12 = new com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$Type$Rounded r13 = new com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$Type$Rounded
            r1 = 900(0x384, float:1.261E-42)
            r3 = 7
            r5 = 0
            r13.<init>(r1, r3, r5)
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$ColorType$ColorAbsolute r14 = new com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$ColorType$ColorAbsolute
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r14.<init>(r1)
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$ColorType$ColorAbsolute r15 = new com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$ColorType$ColorAbsolute
            r1 = -1
            r15.<init>(r1)
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$Layer$ColorAbsolute r3 = new com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$Layer$ColorAbsolute
            r3.<init>(r1)
            r17 = 16
            r16 = r3
            r12.<init>(r13, r14, r15, r16, r17)
            r14 = 0
            r15 = 28
            r13 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            r8.f235345w = r4
            yy0.f r3 = r0.f235346a
            android.content.Context r5 = r0.f235348c
            r6 = 900(0x384, float:1.261E-42)
            r7 = 900(0x384, float:1.261E-42)
            r4 = r10
            java.lang.Object r1 = ofm.q.J(r3, r4, r5, r6, r7, r8)
            if (r1 != r2) goto L82
            goto L9e
        L82:
            r10 = r1
            android.graphics.drawable.Drawable r10 = (android.graphics.drawable.Drawable) r10
            r14 = 7
            r15 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            android.graphics.Bitmap r1 = androidx.core.graphics.drawable.DrawableKt.toBitmap$default(r10, r11, r12, r13, r14, r15)
            byte[] r1 = do3.q.H(r1)
            r8.f235345w = r9
            zk0.b r3 = r0.f235347b
            java.lang.String r4 = "account_qr.jpg"
            java.lang.Object r1 = zk0.b.a(r3, r1, r4, r8)
            if (r1 != r2) goto L9f
        L9e:
            return r2
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pea.d.a(i80.a, gim.c):java.lang.Object");
    }
}
