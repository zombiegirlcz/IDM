package rpb;

import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static ErrorWidgetDelegate.Model a(int i, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        return new ErrorWidgetDelegate.Model(listId, null, new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), op0.q.SMALL, null, null, Constants.TAG_E2_CONFIGURATION_PAYMENT_SCHEME_CUSTOMIZATION);
    }
}
