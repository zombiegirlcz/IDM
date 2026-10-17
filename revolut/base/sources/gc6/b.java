package gc6;

import aw0.j0;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.donations.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.n f142345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sc6.a f142346b;

    public b(whf.n transactionListMapper, sc6.a charityTransactionItemMapper) {
        Intrinsics.checkNotNullParameter(transactionListMapper, "transactionListMapper");
        Intrinsics.checkNotNullParameter(charityTransactionItemMapper, "charityTransactionItemMapper");
        this.f142345a = transactionListMapper;
        this.f142346b = charityTransactionItemMapper;
    }

    public static ListSubheaderDelegate.Model a(int i) {
        return new ListSubheaderDelegate.Model("TRANSACTIONS_SUBHEADER_ID", new TextLocalisedClause(R$string.donations_recent_transactions_title, null, null, 14), i >= 3 ? new TextLocalisedClause(R$string.donations_common_action_see_all, null, null, 14) : null, j0.TRANSPARENT, R$attr.uikit_dp24, 32505402);
    }
}
