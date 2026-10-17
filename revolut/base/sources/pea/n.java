package pea;

import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeAppearance;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pockets.impl.R$string;
import ip0.ck0;
import ip0.i70;
import ip0.l70;
import ip0.yj0;
import java.util.List;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import ms0.i4;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements p {

    @NotNull
    public static final m Companion = new m();

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        int i;
        koi.j i70Var;
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        i80.a qrCode = domainState.f235351c;
        if (qrCode == null) {
            i70Var = new i70("ID_QR_CODE", null, 6);
        } else {
            dda.j qrCodeProvider = domainState.f235349a;
            int i2 = R$attr.uikit_colorForeground;
            Intrinsics.checkNotNullParameter(qrCodeProvider, "qrCodeProvider");
            Intrinsics.checkNotNullParameter(qrCode, "qrCode");
            int[][] iArr = qrCode.f159408a;
            int iW = mif.a.w(qrCode, 30);
            int i3 = b.f235344a[qrCodeProvider.ordinal()];
            if (i3 == 1) {
                i = R$drawable.uikit_icn_24_plus;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$drawable.uikit_icn_24_logo_revolut;
            }
            int i5 = i;
            l70 l70Var = new l70("ID_QR_CODE", new QrCodeImage(iArr, new QrCodeAppearance(new QrCodeAppearance.Type.Rounded(900, iW, new QrCodeAppearance.Layer.Image(LayeredImage.Companion.p(LayeredImage.INSTANCE, i5, Integer.valueOf(R$attr.uikit_colorBlack), R$attr.uikit_colorWhite, 4.0f, 24.0f), false)), new QrCodeAppearance.ColorType.ColorAttr(i2), new QrCodeAppearance.ColorType.ColorAbsolute(0), new QrCodeAppearance.Layer.ColorAbsolute(0), BitmapDescriptorFactory.HUE_RED), (QrCodeImageDrawable.Shimmering.Companion) null, (ImageTransformations) null, 28), false, R$attr.uikit_dp72, 112);
            yp0.b.r(l70Var, R$attr.uikit_dp72, 0, 0, 0, 14);
            i70Var = l70Var;
        }
        return new h(v.k(i70Var, new TextDelegate.Model("ID_EXPLAINER", new TextLocalisedClause(R$string.revolut_accounts_account_details_qr_code_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), false, new ck0(yj0.CENTER_HORIZONTAL), null, null, R$attr.uikit_dp8, R$attr.uikit_dp24, 0, 0, 1648), new SmallActionButtonDelegate.Model("ID_SHARE", h4.CONTEXTUAL, null, null, new CompositeClause(v.k(new ImageClause(R$drawable.uikit_icn_24_share_android, (Integer) null, (Float) null, (Float) null, 30), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.revolut_accounts_account_details_qr_code_share_action, null, null, 14)), null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), null, 10), null, new i4(), null, null, 0, 0, 0, 0, 32600)));
    }
}
