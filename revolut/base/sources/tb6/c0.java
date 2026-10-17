package tb6;

import aw0.j0;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.donations.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sa6.a0 f269474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sa6.h f269475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final whf.n f269476c;
    public final sc6.a d;
    public final a31.a e;

    public c0(sa6.a0 pendingDonationsInteractor, sa6.h charityTransactionsInteractor, whf.n transactionsListMapper, sc6.a charityTransactionItemMapper, a31.a donationsAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(pendingDonationsInteractor, "pendingDonationsInteractor");
        Intrinsics.checkNotNullParameter(charityTransactionsInteractor, "charityTransactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionsListMapper, "transactionsListMapper");
        Intrinsics.checkNotNullParameter(charityTransactionItemMapper, "charityTransactionItemMapper");
        Intrinsics.checkNotNullParameter(donationsAvailabilityInteractor, "donationsAvailabilityInteractor");
        this.f269474a = pendingDonationsInteractor;
        this.f269475b = charityTransactionsInteractor;
        this.f269476c = transactionsListMapper;
        this.d = charityTransactionItemMapper;
        this.e = donationsAvailabilityInteractor;
    }

    public static ListSubheaderDelegate.Model a(int i) {
        return new ListSubheaderDelegate.Model("TRANSACTIONS_SUBHEADER_ID", new TextLocalisedClause(R$string.donations_details_transactions_header_title, null, null, 14), i >= 3 ? new TextLocalisedClause(R$string.donations_common_action_see_all, null, null, 14) : null, j0.TRANSPARENT, 0, 33553978);
    }
}
