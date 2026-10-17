package mra;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements aqa.a {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static Image c(String str) {
        return (str == null || str.length() == 0) ? LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_card, Integer.valueOf(R$attr.uikit_colorDeepGrey), R$attr.uikit_colorDeepGrey_10, 16.0f, Float.valueOf(24.0f), null, 32) : new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation(Float.valueOf(2.0f), Integer.valueOf(R$attr.uikit_colorWidgetBackground), false, 8), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902);
    }

    public final ContactImage a(CardOwner cardOwner) {
        Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
        return new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, cardOwner.a(), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
    }

    public final Image b(CardOwner cardOwner) {
        Intrinsics.checkNotNullParameter(cardOwner, "cardOwner");
        return c(cardOwner.f81493g.f81489h);
    }
}
