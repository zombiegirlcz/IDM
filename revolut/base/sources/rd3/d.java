package rd3;

import aw0.o9;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.cashback.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TextClause f253322b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.g f253323a;

    static {
        m70.a.c(t0.f186434a);
        f253322b = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public d(thf.g transactionItemMapper) {
        Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
        this.f253323a = transactionItemMapper;
    }

    public static ActionsView.Item a(od3.l domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (domainState.d) {
            return new ActionsView.Item("ID_ACTION_SHOW_ALL_SOURCES", null, false, null, null, new TextLocalisedClause(R$string.cashback_product_action_show_all_sources, null, null, 14), null, null, null, null, false, null, null, null, null, 32670);
        }
        return null;
    }

    public static koi.j c(od3.l domainState, Clause clause, int i) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CounterTextDelegate.Model model = new CounterTextDelegate.Model("ID_EARNED_TO_DATE", new TextLocalisedClause(R$string.cashback_details_total_earned_title, null, null, 14), (CounterTextDelegate.c) iii.c.f(domainState.f224277b, new rbj.g(13), new rbh.j(15), new qk2.h(16)), clause, false, null, null, 0, 0, 0, 0, 2032);
        yp0.b.l(model, 0, i, 0, 0, null, false, 61);
        return model;
    }

    public static ListSubheaderDelegate.Model f(boolean z) {
        return new ListSubheaderDelegate.Model("ID_TRANSACTIONS_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.cashback_box_transactions_title, null, null, 14), (ResourceImage) null, false, false, (Clause) (z ? new TextLocalisedClause(R$string.cashback_box_transactions_more, null, null, 14) : null), true, (Object) null, (AnalyticsContext) null, 0, R$attr.uikit_dp8, 0, 0, (String) null, 245562);
    }

    public final List b(od3.l domainState, Data transactionsData) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        return i2b.a.o(i2b.a.p(d(domainState), c(domainState, null, R$attr.uikit_dp16)), e(transactionsData, domainState.f224277b));
    }

    public List d(od3.l domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (List) iii.c.f(domainState.f224278c, new rbj.g(14), new rbh.j(16), new qbg.j(domainState, 25));
    }

    public final List e(Data transactionsData, Data amountData) {
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        Intrinsics.checkNotNullParameter(amountData, "amountData");
        return (List) iii.c.f(t1.t(transactionsData, amountData), new rbj.g(this, 15), new rbh.j(17), new qbg.j(this, 26));
    }

    public abstract List g(od3.l lVar);

    public abstract od3.o h(od3.l lVar);
}
