package fgl;

import az0.u;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.shared.feature.wealth.ui_kit.models.image.RoundedRectImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends u {
    @Override // yy0.d
    public final boolean e(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return image instanceof RoundedRectImage;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // az0.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(android.content.Context r11, com.revolut.core.ui_kit_core.displayers.image.Image r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof fgl.i
            if (r0 == 0) goto L13
            r0 = r13
            fgl.i r0 = (fgl.i) r0
            int r1 = r0.f135102y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f135102y = r1
            goto L1a
        L13:
            fgl.i r0 = new fgl.i
            gim.c r13 = (gim.c) r13
            r0.<init>(r10, r13)
        L1a:
            java.lang.Object r13 = r0.f135100w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f135102y
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            com.revolut.shared.feature.wealth.ui_kit.models.image.RoundedRectImage r12 = r0.v
            android.content.Context r11 = r0.u
            yhm.o.b(r13)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            goto L61
        L2d:
            r0 = move-exception
            r13 = r0
            goto L64
        L30:
            r0 = move-exception
            r11 = r0
            goto Lb6
        L34:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3c:
            yhm.o.b(r13)
            boolean r13 = r12 instanceof com.revolut.shared.feature.wealth.ui_kit.models.image.RoundedRectImage
            if (r13 == 0) goto Lb7
            r13 = r12
            com.revolut.shared.feature.wealth.ui_kit.models.image.RoundedRectImage r13 = (com.revolut.shared.feature.wealth.ui_kit.models.image.RoundedRectImage) r13
            float r13 = r13.f105361b
            int r13 = kli.a.k(r11, r13)
            r2 = r12
            com.revolut.shared.feature.wealth.ui_kit.models.image.RoundedRectImage r2 = (com.revolut.shared.feature.wealth.ui_kit.models.image.RoundedRectImage) r2     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            com.revolut.core.ui_kit_core.displayers.image.Image r2 = r2.f105360a     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r0.u = r11     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r4 = r12
            com.revolut.shared.feature.wealth.ui_kit.models.image.RoundedRectImage r4 = (com.revolut.shared.feature.wealth.ui_kit.models.image.RoundedRectImage) r4     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r0.v = r4     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r0.f135102y = r3     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            java.lang.Object r13 = r10.h(r11, r2, r13, r0)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            if (r13 != r1) goto L61
            return r1
        L61:
            android.graphics.drawable.Drawable r13 = (android.graphics.drawable.Drawable) r13     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            goto L6f
        L64:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r13, r0)
            r13 = r2
        L6f:
            com.revolut.shared.feature.wealth.ui_kit.models.image.RoundedRectImage r12 = (com.revolut.shared.feature.wealth.ui_kit.models.image.RoundedRectImage) r12
            float r0 = r12.f105362c
            int r6 = kli.a.k(r11, r0)
            float r0 = r12.f105361b
            r1 = 2
            float r2 = (float) r1
            float r4 = r12.f105362c
            float r2 = r2 * r4
            float r2 = r2 + r0
            int r0 = kli.a.k(r11, r2)
            r2 = 0
            android.graphics.drawable.GradientDrawable r4 = ip0.v7.k(r2)
            float r5 = r12.d
            float r5 = kli.a.l(r11, r5)
            r4.setCornerRadius(r5)
            com.revolut.core.ui.models.Color r12 = r12.e
            int r11 = io0.a.c(r11, r12)
            r4.setColor(r11)
            if (r13 != 0) goto La1
            android.graphics.drawable.Drawable[] r11 = new android.graphics.drawable.Drawable[r3]
            r11[r2] = r4
            goto La7
        La1:
            android.graphics.drawable.Drawable[] r11 = new android.graphics.drawable.Drawable[r1]
            r11[r2] = r4
            r11[r3] = r13
        La7:
            fgl.a r4 = new fgl.a
            r4.<init>(r11, r0)
            if (r13 == 0) goto Lb5
            r5 = 1
            r7 = r6
            r8 = r6
            r9 = r6
            r4.setLayerInset(r5, r6, r7, r8, r9)
        Lb5:
            return r4
        Lb6:
            throw r11
        Lb7:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Failed requirement."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: fgl.k.g(android.content.Context, com.revolut.core.ui_kit_core.displayers.image.Image, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e9 -> B:39:0x00f0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(android.content.Context r18, com.revolut.core.ui_kit_core.displayers.image.Image r19, int r20, gim.c r21) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fgl.k.h(android.content.Context, com.revolut.core.ui_kit_core.displayers.image.Image, int, gim.c):java.lang.Object");
    }
}
