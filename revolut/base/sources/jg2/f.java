package jg2;

import android.content.Context;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yy0.f f173910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zk0.b f173911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f173912c;
    public final LayeredImage d;

    public f(yy0.f imageDisplayer, zk0.b fileSystemRepository, Context context) {
        Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f173910a = imageDisplayer;
        this.f173911b = fileSystemRepository;
        this.f173912c = context;
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_24_upi_2;
        int i2 = R$attr.uikit_colorBlack;
        this.d = LayeredImage.Companion.p(companion, i, Integer.valueOf(i2), R$attr.uikit_colorWhite, 4.0f, 24.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(i80.a r19, gim.c r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof jg2.e
            if (r2 == 0) goto L18
            r2 = r1
            jg2.e r2 = (jg2.e) r2
            int r3 = r2.f173909w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f173909w = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            jg2.e r2 = new jg2.e
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.f173909w
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
            goto L80
        L3c:
            yhm.o.b(r1)
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage r10 = new com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage
            r1 = r19
            int[][] r11 = r1.f159408a
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance r12 = new com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$Type$Rounded r13 = new com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$Type$Rounded
            r1 = 900(0x384, float:1.261E-42)
            r13.<init>(r1)
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
            r8.f173909w = r4
            yy0.f r3 = r0.f173910a
            android.content.Context r5 = r0.f173912c
            r6 = 900(0x384, float:1.261E-42)
            r7 = 900(0x384, float:1.261E-42)
            r4 = r10
            java.lang.Object r1 = ofm.q.J(r3, r4, r5, r6, r7, r8)
            if (r1 != r2) goto L80
            goto L9c
        L80:
            r10 = r1
            android.graphics.drawable.Drawable r10 = (android.graphics.drawable.Drawable) r10
            r14 = 7
            r15 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            android.graphics.Bitmap r1 = androidx.core.graphics.drawable.DrawableKt.toBitmap$default(r10, r11, r12, r13, r14, r15)
            byte[] r1 = do3.q.H(r1)
            r8.f173909w = r9
            zk0.b r3 = r0.f173911b
            java.lang.String r4 = "upi_qr_code.jpg"
            java.lang.Object r1 = zk0.b.a(r3, r1, r4, r8)
            if (r1 != r2) goto L9d
        L9c:
            return r2
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jg2.f.a(i80.a, gim.c):java.lang.Object");
    }
}
