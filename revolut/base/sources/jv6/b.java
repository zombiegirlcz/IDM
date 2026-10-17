package jv6;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import thf.k;
import thf.l;
import whf.p;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f178785a;

    public b(l transactionsItemMapper) {
        Intrinsics.checkNotNullParameter(transactionsItemMapper, "transactionsItemMapper");
        this.f178785a = transactionsItemMapper;
    }

    public final List a(p pVar, int i, TextLocalisedClause textLocalisedClause, String str) {
        List list = pVar.f297646a;
        if (list.isEmpty()) {
            return f0.f322471a;
        }
        boolean z = list.size() > i;
        return yp0.b.g(l.e(this.f178785a, d0.V0(list, i), pVar.f297647b, new k(1022, false, false, false, false, false), null, 24), new ListSubheaderDelegate.Model(str, (Image) null, (Clause) textLocalisedClause, (ResourceImage) null, false, false, (Clause) (z ? new TextLocalisedClause(R$string.freelancer_cashback_details_main_payouts_action_see_all, null, null, 14) : null), z, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261944), null, 0, 0, 126);
    }

    public final List b(p transactions, int i) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        return a(transactions, i, new TextLocalisedClause(R$string.freelancer_cashback_details_main_payouts_header_title, null, null, 14), "LIST_ID_PAYOUT_HEADER_ITEM");
    }
}
