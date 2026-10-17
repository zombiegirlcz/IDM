package frf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tof.q;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public static CellDetailsDelegate.Model a(q cardOwnerData) {
        Intrinsics.checkNotNullParameter(cardOwnerData, "cardOwnerData");
        return new CellDetailsDelegate.Model("ITEM_ID_SENT", new TextLocalisedClause(R$string.card_transfer_troubleshooting_section_sent_to_title, null, null, 14), new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.o(cardOwnerData.e, " ··", cardOwnerData.d), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }
}
