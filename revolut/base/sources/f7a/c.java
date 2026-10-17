package f7a;

import androidx.appcompat.view.ContextThemeWrapper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yy0.f;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f132584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContextThemeWrapper f132585b;

    public c(f imageDisplayer, ContextThemeWrapper context) {
        Intrinsics.checkNotNullParameter(imageDisplayer, "imageDisplayer");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f132584a = imageDisplayer;
        this.f132585b = context;
    }

    public static QrCodeAppearance a(int i, boolean z) {
        Pair pair = z ? new Pair(Integer.valueOf(R$attr.uikit_colorBackground), Integer.valueOf(R$attr.uikit_colorForeground)) : new Pair(Integer.valueOf(R$attr.uikit_colorWhite), Integer.valueOf(R$attr.uikit_colorBlack));
        QrCodeAppearance.Layer.Image image = new QrCodeAppearance.Layer.Image(LayeredImage.Companion.p(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_paynow, Integer.valueOf(((Number) pair.f186385a).intValue()), ((Number) pair.f186386b).intValue(), 4.0f, 24.0f), false);
        if (z) {
            QrCodeAppearance.Type.Rounded rounded = new QrCodeAppearance.Type.Rounded(900, i, image);
            QrCodeAppearance.ColorType.ColorAttr colorAttr = new QrCodeAppearance.ColorType.ColorAttr(R$attr.uikit_colorForeground);
            int i2 = R$attr.uikit_colorTransparent;
            return new QrCodeAppearance(rounded, colorAttr, new QrCodeAppearance.ColorType.ColorAttr(i2), new QrCodeAppearance.Layer.ColorAttr(i2), BitmapDescriptorFactory.HUE_RED);
        }
        QrCodeAppearance.Type.Rounded rounded2 = new QrCodeAppearance.Type.Rounded(900, i, image);
        QrCodeAppearance.ColorType.ColorAttr colorAttr2 = new QrCodeAppearance.ColorType.ColorAttr(R$attr.uikit_colorBlack);
        int i3 = R$attr.uikit_colorWhite;
        return new QrCodeAppearance(rounded2, (QrCodeAppearance.ColorType) colorAttr2, (QrCodeAppearance.ColorType) new QrCodeAppearance.ColorType.ColorAttr(i3), (QrCodeAppearance.Layer) new QrCodeAppearance.Layer.ColorAttr(i3), 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(i80.a r14, gim.c r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof f7a.b
            if (r0 == 0) goto L14
            r0 = r15
            f7a.b r0 = (f7a.b) r0
            int r1 = r0.f132583w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f132583w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            f7a.b r0 = new f7a.b
            r0.<init>(r13, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f132583w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r15)
            goto L5a
        L29:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L31:
            yhm.o.b(r15)
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage r7 = new com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage
            int[][] r8 = r14.f159408a
            r15 = 20
            int r14 = mif.a.w(r14, r15)
            r15 = 0
            com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance r9 = a(r14, r15)
            r11 = 0
            r12 = 28
            r10 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            r6.f132583w = r2
            yy0.f r1 = r13.f132584a
            androidx.appcompat.view.ContextThemeWrapper r3 = r13.f132585b
            r4 = 0
            r5 = 0
            r2 = r7
            java.lang.Object r15 = ofm.q.J(r1, r2, r3, r4, r5, r6)
            if (r15 != r0) goto L5a
            return r0
        L5a:
            r0 = r15
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r4 = 7
            r5 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            android.graphics.Bitmap r14 = androidx.core.graphics.drawable.DrawableKt.toBitmap$default(r0, r1, r2, r3, r4, r5)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: f7a.c.b(i80.a, gim.c):java.lang.Object");
    }
}
