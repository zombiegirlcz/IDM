package rw4;

import com.revolut.core.ui_kit.delegates.widgets.GoalProgressLoadingWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class o {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static GoalProgressLoadingWidgetDelegate.Model a(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        return new GoalProgressLoadingWidgetDelegate.Model(listId, new TextLocalisedClause(R$string.credit_collateral_account_widget_withdrawal_title, null, null, 14), null, 28);
    }
}
