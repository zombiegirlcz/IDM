package dyi;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import fyi.e;
import fyi.f;
import ip0.yz;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements Function1 {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c90.c f121135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayeredImage f121136b;

    public c(c90.c uiResources) {
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f121135a = uiResources;
        this.f121136b = LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_lounges, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorGreyTone10, 12.0f, null, null, 48);
    }

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yz invoke(e loungePassQrCode) {
        Image imageC;
        Intrinsics.checkNotNullParameter(loungePassQrCode, "loungePassQrCode");
        if (loungePassQrCode instanceof f) {
            i80.a aVar = ((f) loungePassQrCode).f139021a;
            imageC = new QrCodeImage(aVar.f159408a, new QrCodeAppearance(new QrCodeAppearance.Type.Rounded(kli.a.k(this.f121135a.f22265a, 228.0f), mif.a.w(aVar, 25), new QrCodeAppearance.Layer.Image(this.f121136b, false)), (QrCodeAppearance.ColorType) new QrCodeAppearance.ColorType.ColorAttr(R$attr.uikit_colorForeground), (QrCodeAppearance.ColorType) new QrCodeAppearance.ColorType.ColorAbsolute(0), (QrCodeAppearance.Layer) new QrCodeAppearance.Layer.ColorAbsolute(0), 16), (QrCodeImageDrawable.Shimmering.Companion) null, (ImageTransformations) null, 28);
        } else {
            if (!(loungePassQrCode instanceof e.a)) {
                throw new NoWhenBranchMatchedException();
            }
            imageC = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", new ImageTransformations(null, null, null, null, null, 104, 104, 31), null, null, 28);
        }
        return new yz(imageC);
    }
}
