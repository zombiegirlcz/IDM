package lu6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import com.revolut.feature.freelancer.common.models.sale.FilteringDateRange;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import java.util.Set;
import koe.y;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import nr6.c0;
import org.jetbrains.annotations.NotNull;
import zhm.a1;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements cli.n {

    @NotNull
    public static final r Companion = new r();
    public static final Set e;
    public static final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumEntries f200056g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t17.c f200057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t17.g f200058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t17.h f200059c;
    public final t17.d d;

    static {
        FilteringDateRange[] elements = {FilteringDateRange.Today.f73467a, FilteringDateRange.ThisWeek.f73466a, FilteringDateRange.ThisMonth.f73464a, FilteringDateRange.ThisQuarter.f73465a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        e = kotlin.collections.d.y0(elements);
        Set setI1 = d0.i1(c0.a());
        c0[] elements2 = {c0.PARTIALLY_DISPUTED, c0.DISPUTED};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        f = a1.k(setI1, kotlin.collections.d.y0(elements2));
        f200056g = ju6.b.a();
    }

    public s(t17.c amountFilterProvider, t17.g currencyFilterProvider, t17.h dateRangeFilterProvider, t17.a acquiringFilterChipsMapper, t17.d chipsFilterProvider) {
        Intrinsics.checkNotNullParameter(amountFilterProvider, "amountFilterProvider");
        Intrinsics.checkNotNullParameter(currencyFilterProvider, "currencyFilterProvider");
        Intrinsics.checkNotNullParameter(dateRangeFilterProvider, "dateRangeFilterProvider");
        Intrinsics.checkNotNullParameter(acquiringFilterChipsMapper, "acquiringFilterChipsMapper");
        Intrinsics.checkNotNullParameter(chipsFilterProvider, "chipsFilterProvider");
        this.f200057a = amountFilterProvider;
        this.f200058b = currencyFilterProvider;
        this.f200059c = dateRangeFilterProvider;
        this.d = chipsFilterProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f200047a, new lsl.b(21), new lnk.o(14), new y(this, domainState, 24));
        AcquiringOrderFilter acquiringOrderFilter = domainState.f200048b;
        aim.e eVarB = u.b();
        if (acquiringOrderFilter != null) {
            eVarB.add(new TextNavBarMenuItem("ITEM_ID_MENU_RESET", new TextLocalisedClause(R$string.freelancer_common_action_reset, null, null, 14), null, null, 12));
        }
        return new o(u.a(eVarB), list);
    }
}
