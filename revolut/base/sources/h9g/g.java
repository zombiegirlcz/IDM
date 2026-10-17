package h9g;

import aw0.o9;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_travel_hotels_models.property.HotelsPropertyCashback;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class g {
    public static final TagViewData a(HotelsPropertyCashback hotelsPropertyCashback) {
        HotelsPropertyCashback hotelsPropertyCashback2;
        if (hotelsPropertyCashback == null) {
            dj0.d.Companion.getClass();
            hotelsPropertyCashback2 = new HotelsPropertyCashback(0.0d, dj0.d.e);
        } else {
            hotelsPropertyCashback2 = hotelsPropertyCashback;
        }
        return new TagViewData(new ResourceImage(R$drawable.uikit_icn_24_cashback, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorTeal), (List) null, (ImageTransformations) null, (Clause) null, 246), new MoneyClause(hotelsPropertyCashback2.f98011a, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorTeal), false, null, false, null, 254), o9.NON_SENSITIVE), R$attr.uikit_colorTransparent, null, R$attr.uikit_colorTeal, hotelsPropertyCashback2, 488);
    }
}
