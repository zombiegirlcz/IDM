package bnf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class l {
    public static Image a(a3 a3Var, tof.a aVar) {
        int i = k.f17147a[aVar.f272572a.ordinal()];
        return (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_wallet, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue) : new CurrencyImage(a3Var.k.f115083b.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
    }
}
