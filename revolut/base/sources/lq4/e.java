package lq4;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.pocket_details.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import whf.n;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f199191a;

    public e(b cashbackCounterItemMapper, f cashbackDetailsProgressItemMapper, n transactionItemsMapper) {
        Intrinsics.checkNotNullParameter(cashbackCounterItemMapper, "cashbackCounterItemMapper");
        Intrinsics.checkNotNullParameter(cashbackDetailsProgressItemMapper, "cashbackDetailsProgressItemMapper");
        Intrinsics.checkNotNullParameter(transactionItemsMapper, "transactionItemsMapper");
        this.f199191a = transactionItemsMapper;
    }

    public static ListSubheaderDelegate.Model a(boolean z) {
        return new ListSubheaderDelegate.Model("id_header_transactions", (Image) null, (Clause) new TextLocalisedClause(R$string.revolut_accounts_home_transactions_title, null, null, 14), (Image) null, (Clause) (z ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_see_all, null, null, 14) : null), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, z), false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65450);
    }
}
