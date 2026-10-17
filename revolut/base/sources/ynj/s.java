package ynj;

import androidx.appcompat.view.ContextThemeWrapper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class s {

    @NotNull
    private static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yy0.f f315489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContextThemeWrapper f315490b;

    public s(yy0.f imageDisplayer, ContextThemeWrapper context) {
        Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f315489a = imageDisplayer;
        this.f315490b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage r9, gim.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ynj.r
            if (r0 == 0) goto L14
            r0 = r10
            ynj.r r0 = (ynj.r) r0
            int r1 = r0.f315488w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f315488w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ynj.r r0 = new ynj.r
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f315488w
            r2 = 1
            r7 = 0
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L2a
            goto L5d
        L2a:
            r0 = move-exception
            r9 = r0
            goto L6c
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            yhm.o.b(r10)
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance r10 = r9.f59993b
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$Type r10 = r10.f59970a
            boolean r1 = r10 instanceof com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance.Type.Rounded
            if (r1 != 0) goto L41
            r10 = r7
        L41:
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance$Type$Rounded r10 = (com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance.Type.Rounded) r10
            if (r10 == 0) goto L49
            int r10 = r10.f59987a
        L47:
            r4 = r10
            goto L4c
        L49:
            r10 = 900(0x384, float:1.261E-42)
            goto L47
        L4c:
            yhm.m$a r10 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2a
            yy0.f r1 = r8.f315489a     // Catch: java.lang.Throwable -> L2a
            androidx.appcompat.view.ContextThemeWrapper r3 = r8.f315490b     // Catch: java.lang.Throwable -> L2a
            r6.f315488w = r2     // Catch: java.lang.Throwable -> L2a
            r5 = r4
            r2 = r9
            java.lang.Object r10 = ofm.q.J(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2a
            if (r10 != r0) goto L5d
            return r0
        L5d:
            r0 = r10
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0     // Catch: java.lang.Throwable -> L2a
            r4 = 7
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            android.graphics.Bitmap r9 = androidx.core.graphics.drawable.DrawableKt.toBitmap$default(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L2a
            yhm.m$a r10 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2a
            goto L72
        L6c:
            yhm.m$a r10 = yhm.m.INSTANCE
            yhm.n r9 = yhm.o.a(r9)
        L72:
            java.lang.Throwable r10 = yhm.m.a(r9)
            if (r10 != 0) goto L7a
            r7 = r9
            goto L8b
        L7a:
            boolean r9 = r10 instanceof java.util.concurrent.CancellationException
            if (r9 != 0) goto L8c
            zhm.h0 r9 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.String r1 = "Failed to convert eSIM QR code to bitmap"
            java.lang.String r2 = "EsimQrCodeImageRenderer"
            rd0.d.a(r0, r2, r1, r10, r9)
        L8b:
            return r7
        L8c:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ynj.s.a(com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage, gim.c):java.lang.Object");
    }
}
