package nvf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.Base64Image;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.transport.models.TransportTicketLogo;
import com.revolut.feature.transport.models.TransportTicketQrCode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fkg.a f219591a;

    public o(fkg.a qrCodeGenerator) {
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        this.f219591a = qrCodeGenerator;
    }

    public static Image a(TransportTicketLogo logo) {
        Intrinsics.checkNotNullParameter(logo, "logo");
        int i = n.f219590b[logo.f92596a.ordinal()];
        if (i == 1) {
            return new Base64Image(logo.f92597b, (ImageTransformations) null, 6);
        }
        if (i == 2) {
            return new UrlImage(logo.f92597b, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Image b(TransportTicketQrCode qrCode) {
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        int i = n.f219589a[qrCode.f92600a.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new Base64Image(qrCode.f92601b, new ImageTransformations(null, null, null, gz0.b.FitCenter, null, null, null, LDSFile.EF_SOD_TAG), 4);
            }
            throw new NoWhenBranchMatchedException();
        }
        return new QrCodeImage(fkg.a.l(this.f219591a, qrCode.f92601b, new h90.a(25, 25), i80.c.H, i80.b.QR_CODE, null, 36).f159408a, new QrCodeAppearance(new QrCodeAppearance.Type.Rounded(900, 0, new QrCodeAppearance.Layer.ColorAbsolute(0)), new QrCodeAppearance.ColorType.ColorAttr(R$attr.uikit_colorForeground), new QrCodeAppearance.ColorType.ColorAbsolute(0), new QrCodeAppearance.Layer.ColorAbsolute(0), BitmapDescriptorFactory.HUE_RED), (QrCodeImageDrawable.Shimmering.Companion) null, (ImageTransformations) null, 28);
    }
}
