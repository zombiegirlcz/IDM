package ia3;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsConfigBackground;
import com.revolut.shared.cards.model.card_config.domain.CardDetailsDesignConfig;
import ip0.dy;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements m93.b {
    public static ResourceImage a() {
        return new ResourceImage(R$drawable.uikit_pic_602_card_placeholder, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, gz0.b.Undefined, null, null, null, LDSFile.EF_SOD_TAG), (Clause) null, 190);
    }

    public static UrlImage b(String str, o5l.g gVar) {
        String lowerCase = gVar.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String strD = a0.D(str, ".png", "@" + lowerCase + ".png", false);
        int i = R$drawable.uikit_pic_602_card_placeholder;
        return new UrlImage(strD, (String) null, (UrlImageDrawable) new UrlImageDrawable.ResDrawable(i, null), 0L, 0L, (UrlImage.CustomHeaders) null, Integer.valueOf(i), (Integer) null, (ez0.h) null, (Image) null, false, false, (ImageTransformations) null, (Integer) null, (Integer) null, false, false, (Clause) null, 524218);
    }

    public static dy c() {
        return new dy(a(), a(), -16777216, -16777216, -7829368, -16777216, null, 1084);
    }

    public final dy d(e93.b brand, CardDetailsDesignConfig cardDetailsDesignConfig, o5l.g screenDensity) {
        String str;
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(screenDensity, "screenDensity");
        if (cardDetailsDesignConfig == null) {
            return c();
        }
        CardDetailsConfigBackground cardDetailsConfigBackground = cardDetailsDesignConfig.f104702c;
        CardDetailsConfigBackground cardDetailsConfigBackground2 = cardDetailsDesignConfig.f104701b;
        int[] iArr = d.f159932a;
        int i = iArr[brand.ordinal()];
        String str2 = null;
        if (i == 1) {
            str = cardDetailsConfigBackground2.f104699c;
        } else if (i == 2) {
            str = cardDetailsConfigBackground2.f104698b;
        } else if (i == 3) {
            str = cardDetailsConfigBackground2.f104697a;
        } else if (i == 4) {
            str = cardDetailsConfigBackground2.d;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str = null;
        }
        if (str == null) {
            return c();
        }
        UrlImage urlImageB = b(str, screenDensity);
        int i2 = iArr[brand.ordinal()];
        if (i2 == 1) {
            str2 = cardDetailsConfigBackground.f104699c;
        } else if (i2 == 2) {
            str2 = cardDetailsConfigBackground.f104698b;
        } else if (i2 == 3) {
            str2 = cardDetailsConfigBackground.f104697a;
        } else if (i2 == 4) {
            str2 = cardDetailsConfigBackground.d;
        } else if (i2 != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return str2 != null ? new dy(urlImageB, b(str2, screenDensity), cardDetailsDesignConfig.d, cardDetailsDesignConfig.e, cardDetailsDesignConfig.f, cardDetailsDesignConfig.f104704h, cardDetailsDesignConfig.f104703g, 60) : c();
    }
}
