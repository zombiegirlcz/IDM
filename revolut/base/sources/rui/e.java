package rui;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_core.displayers.image.transformation.RoundedRectTransformation;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPassAdmission;
import ip0.yz;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements Function1 {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fkg.a f257558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c90.c f257559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayeredImage f257560c;

    public e(fkg.a qrCodeGenerator, c90.c uiResources) {
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f257558a = qrCodeGenerator;
        this.f257559b = uiResources;
        this.f257560c = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_turbo_transfer, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorGreyTone10, 12.0f, null, null, 48);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yz invoke(AsftPassAdmission asftPassAdmission) {
        Image qrCodeImage;
        if (asftPassAdmission == null) {
            qrCodeImage = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", new ImageTransformations(null, null, null, null, null, 104, 104, 31), null, null, 28);
        } else {
            int i = d.f257557a[asftPassAdmission.f98727a.ordinal()];
            if (i != 1) {
                qrCodeImage = i != 2 ? null : new UrlImage(asftPassAdmission.f98729c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
            } else {
                i80.a aVarL = fkg.a.l(this.f257558a, asftPassAdmission.f98729c, new h90.a(0, 0), i80.c.H, i80.b.QR_CODE, null, 32);
                qrCodeImage = new QrCodeImage(aVarL.f159408a, new QrCodeAppearance(new QrCodeAppearance.Type.Rounded(kli.a.k(this.f257559b.f22265a, 228.0f), mif.a.w(aVarL, 25), new QrCodeAppearance.Layer.Image(this.f257560c, false)), (QrCodeAppearance.ColorType) null, (QrCodeAppearance.ColorType) null, (QrCodeAppearance.Layer) null, 14), (QrCodeImageDrawable.Shimmering.Companion) null, new ImageTransformations(null, new RoundedRectTransformation(12.0f), null, null, null, null, null, ISO781611.SMT_TAG), 20);
            }
        }
        if (qrCodeImage != null) {
            return new yz(qrCodeImage);
        }
        return null;
    }
}
