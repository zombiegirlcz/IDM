package c55;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m {
    public final qv0.i a(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model(listId, LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        return model;
    }
}
