package pkf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.remittance.api.models.TransactionCryptoRemittanceAction;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l1 {
    private l1() {
    }

    public static CellDetailsActionDelegate.Model a(String listId, int i, String value, TransactionCryptoRemittanceAction parcel) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        return new CellDetailsActionDelegate.Model(listId, new TextLocalisedClause(i, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_24_eye_show, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(value, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, false, null, null, parcel, 0, 0, 0, 0, 4192228);
    }
}
