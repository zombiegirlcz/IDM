package f8j;

import aw0.p0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.decorator.models.CircleImageDecorator;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.crypto.asset_details.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import x7j.b;
import x8j.g;
import x8j.i;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements b {
    public final CircleImageDecorator a(int i) {
        return new CircleImageDecorator((Image) new ResourceImage(i, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), (Float) null, 8.0f, 0, R$attr.uikit_colorAccentNeutral_10, 26);
    }

    public final p0 b(g gVar) {
        return new p0("LIST_ID_CRYPTO_ASSET_DETAILS_ACTION_RECEIVE", new TextLocalisedClause(R$string.crypto_asset_details_action_receive, null, null, 14), a(R$drawable.uikit_icn_24_arrow_request), gVar, 4);
    }

    public final p0 c(i iVar) {
        return new p0("LIST_ID_CRYPTO_ASSET_DETAILS_ACTION_SEND", new TextLocalisedClause(R.string.common_action_send, null, null, 14), a(R$drawable.uikit_icn_24_arrow_send), iVar, 4);
    }
}
