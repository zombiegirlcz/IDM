package wb6;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.donations.impl.R$string;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements a {
    public static ListSubheaderDelegate.Model a() {
        return new ListSubheaderDelegate.Model("CHARITY_CARD_CAMPAIGN_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.donations_details_card_campaign_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }
}
