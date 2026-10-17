package xmj;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import dej.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c90.c f307280a;

    public d(c90.c uiResources) {
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f307280a = uiResources;
    }

    public final QrCodeImage a(i80.a qrCode, m mVar, a appearance) {
        int i;
        LayeredImage layeredImageL;
        QrCodeAppearance.Layer.ColorAttr colorAttr;
        float fZ;
        Intrinsics.checkNotNullParameter(qrCode, "qrCode");
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        int[][] iArr = qrCode.f159408a;
        int iW = mif.a.w(qrCode, 26);
        int[] iArr2 = c.f307278a;
        int i2 = iArr2[appearance.ordinal()];
        if (i2 == 1) {
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            int i3 = mVar == null ? -1 : c.f307279b[mVar.ordinal()];
            if (i3 == -1) {
                i = R$drawable.uikit_icn_24_sim_card;
            } else if (i3 == 1) {
                i = R$drawable.uikit_icn_24_call;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$drawable.uikit_icn_24_data;
            }
            layeredImageL = companion.l(i, new Color.Solid(R$attr.uikit_colorForeground), new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorAccentNeutral), 0.1f));
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            layeredImageL = LayeredImage.INSTANCE.l(R$drawable.uikit_icn_24_revolut, new Color.Solid(R$attr.uikit_colorBackground), new Color.Solid(R$attr.uikit_colorForeground));
        }
        QrCodeAppearance.Type.Rounded rounded = new QrCodeAppearance.Type.Rounded(900, iW, new QrCodeAppearance.Layer.Image(layeredImageL, false));
        QrCodeAppearance.ColorType.ColorAttr colorAttr2 = new QrCodeAppearance.ColorType.ColorAttr(R$attr.uikit_colorForeground);
        QrCodeAppearance.ColorType.ColorAbsolute colorAbsolute = new QrCodeAppearance.ColorType.ColorAbsolute(0);
        int i5 = iArr2[appearance.ordinal()];
        if (i5 == 1) {
            colorAttr = new QrCodeAppearance.Layer.ColorAttr(R$attr.uikit_colorTransparent);
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            colorAttr = new QrCodeAppearance.Layer.ColorAttr(R$attr.uikit_colorBackground);
        }
        int i6 = iArr2[appearance.ordinal()];
        if (i6 == 1) {
            fZ = BitmapDescriptorFactory.HUE_RED;
        } else {
            if (i6 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fZ = kli.a.z(112, this.f307280a.f22265a);
        }
        return new QrCodeImage(iArr, new QrCodeAppearance(rounded, colorAttr2, colorAbsolute, colorAttr, fZ), (QrCodeImageDrawable.Shimmering.Companion) null, (ImageTransformations) null, 28);
    }
}
