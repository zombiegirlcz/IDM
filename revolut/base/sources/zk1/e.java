package zk1;

import android.content.Context;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements c {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fkg.a f322889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c90.c f322890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ufm.d f322891c;
    public toh.d d;

    public e(fkg.a qrCodeGenerator, c90.c uiResources) {
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f322889a = qrCodeGenerator;
        this.f322890b = uiResources;
    }

    public final QrCodeImage a(String paymentCode, a presentation) {
        Intrinsics.checkNotNullParameter(paymentCode, "paymentCode");
        Intrinsics.checkNotNullParameter(presentation, "presentation");
        ufm.d dVar = this.f322891c;
        if (dVar != null) {
            if (!Intrinsics.f((String) dVar.f279875a, paymentCode) || !((a) dVar.f279876b).equals(presentation)) {
                dVar = null;
            }
            if (dVar != null) {
                return (QrCodeImage) dVar.f279877c;
            }
        }
        Context context = this.f322890b.f22265a;
        int[][] iArr = mif.a.Z(fkg.a.l(this.f322889a, paymentCode, new h90.a(kli.a.k(context, presentation.f322883a), kli.a.k(context, presentation.f322884b)), null, i80.b.BARCODE_CODE_128, null, 40)).f159408a;
        if (presentation.f322885c) {
            int length = iArr.length;
            int[] iArr2 = (int[]) kotlin.collections.d.P(iArr);
            if (iArr2 != null) {
                int length2 = iArr2.length;
                int[][] iArr3 = new int[length2][];
                for (int i = 0; i < length2; i++) {
                    int[] iArr4 = new int[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr4[i2] = iArr[i2][(length2 - 1) - i];
                    }
                    iArr3[i] = iArr4;
                }
                iArr = iArr3;
            }
        }
        QrCodeImage qrCodeImage = new QrCodeImage(iArr, new QrCodeAppearance(new QrCodeAppearance.Type.Classic(null, BitmapDescriptorFactory.HUE_RED), new QrCodeAppearance.ColorType.ColorAttr(R$attr.uikit_colorForeground), new QrCodeAppearance.ColorType.ColorAbsolute(0), new QrCodeAppearance.Layer.ColorAbsolute(0), BitmapDescriptorFactory.HUE_RED), (QrCodeImageDrawable.Shimmering.Companion) null, (ImageTransformations) null, 28);
        this.f322891c = new ufm.d(paymentCode, presentation, qrCodeImage);
        return qrCodeImage;
    }

    public final QrCodeImage b(String paymentCode) {
        Intrinsics.checkNotNullParameter(paymentCode, "paymentCode");
        toh.d dVar = this.d;
        if (dVar != null) {
            if (!Intrinsics.f((String) dVar.f273214a, paymentCode)) {
                dVar = null;
            }
            if (dVar != null) {
                return (QrCodeImage) dVar.f273215b;
            }
        }
        i80.a aVarZ = mif.a.Z(fkg.a.l(this.f322889a, paymentCode, new h90.a(33, 33), i80.c.H, i80.b.QR_CODE, null, 36));
        int[][] iArr = aVarZ.f159408a;
        int iW = mif.a.w(aVarZ, 30);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_24_alipayplus;
        int i2 = R$attr.uikit_colorBlack;
        QrCodeImage qrCodeImage = new QrCodeImage(iArr, new QrCodeAppearance(new QrCodeAppearance.Type.Rounded(900, iW, new QrCodeAppearance.Layer.Image(LayeredImage.Companion.p(companion, i, Integer.valueOf(i2), R$attr.uikit_colorWhite, 4.0f, 24.0f), false)), new QrCodeAppearance.ColorType.ColorAttr(R$attr.uikit_colorForeground), new QrCodeAppearance.ColorType.ColorAbsolute(0), new QrCodeAppearance.Layer.ColorAbsolute(0), BitmapDescriptorFactory.HUE_RED), (QrCodeImageDrawable.Shimmering.Companion) null, (ImageTransformations) null, 28);
        this.d = new toh.d(paymentCode, qrCodeImage);
        return qrCodeImage;
    }
}
