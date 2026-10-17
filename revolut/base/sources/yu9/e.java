package yu9;

import aw0.o9;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.transfer.core.models.CountryProfile;
import gw0.u;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes5.dex */
public final class e {
    public e(d paymentBubbleTagCountryCodeFactory) {
        Intrinsics.checkNotNullParameter(paymentBubbleTagCountryCodeFactory, "paymentBubbleTagCountryCodeFactory");
    }

    public static u c(e eVar, int i, TextLocalisedClause text, CountryProfile countryProfile, int i2) {
        if ((i2 & 4) != 0) {
            countryProfile = null;
        }
        CountryProfile countryProfile2 = countryProfile;
        boolean z = (i2 & 8) == 0;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        return eVar.d(i, text, countryProfile2, R$attr.uikit_colorForeground, R$attr.uikit_colorForeground_10, z);
    }

    public final u a(int i, int i2, CountryProfile countryProfile) {
        return d(i, new TextLocalisedClause(i2, null, null, 14), countryProfile, R$attr.uikit_colorStatusDanger, R$attr.uikit_colorStatusDanger_10, false);
    }

    public final u b(int i, int i2, CountryProfile countryProfile) {
        return c(this, i, new TextLocalisedClause(i2, null, null, 14), countryProfile, 8);
    }

    public final u d(int i, TextLocalisedClause textLocalisedClause, CountryProfile countryProfile, int i2, int i3, boolean z) {
        String str;
        if (countryProfile != null) {
            String str2 = countryProfile.f92232b.f297794a;
            if (countryProfile.f92233c) {
                str2 = null;
            }
            str = str2;
        } else {
            str = null;
        }
        TextClause textClause = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        ResourceImage resourceImage = new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(i2), (List) null, (ImageTransformations) null, (Clause) null, 246);
        Clause[] elements = {textLocalisedClause, textClause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        m70.a.a(t0.f186434a);
        return new u(new TagViewData(resourceImage, new CompositeClause(listL, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Custom(Integer.valueOf(i2), false, null, false, null, 254), null, 8), i3, null, R$attr.uikit_colorTransparent, null, 1000), z);
    }

    public final u e(int i, int i2, CountryProfile countryProfile) {
        return d(i, new TextLocalisedClause(i2, null, null, 14), countryProfile, R$attr.uikit_colorStatusWarning, R$attr.uikit_colorStatusWarning_10, false);
    }
}
