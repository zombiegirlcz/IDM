package eq8;

import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.xh0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class m0 {
    public static List a(dp8.b bVar) {
        return zhm.v.k(new SwipeToActionDelegate.SwipeAction("SWIPE_ACTION_ID_EDIT_TASK", new ResourceImage(R$drawable.uikit_icn_24_edit, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R.string.common_action_edit, null, null, 14), xh0.PRIMARY, null, bVar, null, 80), new SwipeToActionDelegate.SwipeAction("SWIPE_ACTION_ID_DELETE_TASK", new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R.string.common_action_delete, null, null, 14), xh0.NEGATIVE, null, bVar, null, 80));
    }
}
