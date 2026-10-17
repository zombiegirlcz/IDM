package n4a;

import aw0.k9;
import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.who_to_transfer.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static SearchButtonDelegate.Model a(k9 searchFieldExtraButtons) {
        Intrinsics.checkNotNullParameter(searchFieldExtraButtons, "searchFieldExtraButtons");
        return new SearchButtonDelegate.Model("ID_SEARCH", new TextLocalisedClause(R$string.payments_global_search_bar, null, null, 14), searchFieldExtraButtons, R$attr.uikit_dp0, R$attr.uikit_dp24, 408);
    }
}
