package ljh;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    @NotNull
    public static final C1107a Companion = new C1107a();

    /* JADX INFO: renamed from: ljh.a$a, reason: collision with other inner class name */
    public static final class C1107a {
        private C1107a() {
        }
    }

    public final LargeActionButtonDelegate.Model a(bih.b expandCollapseItemsCtaState, String widgetKey) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(expandCollapseItemsCtaState, "expandCollapseItemsCtaState");
        Intrinsics.checkNotNullParameter(widgetKey, "widgetKey");
        int i = b.f195668a[expandCollapseItemsCtaState.ordinal()];
        if (i == 1) {
            numValueOf = Integer.valueOf(R.string.common_show_more);
        } else if (i == 2) {
            numValueOf = Integer.valueOf(R.string.common_show_less);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        return new LargeActionButtonDelegate.Model(j6.a.q("LIST_ID_EXPAND_COLLAPSE_ASSETS_", widgetKey), LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(numValueOf.intValue(), null, null, 14), false, null, null, new pjh.c(widgetKey), null, 744);
    }
}
