package km1;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.billers.api.R$string;
import java.util.List;
import kkf.b4;
import kkk.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f185677a;

    public i(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f185677a = dateProvider;
    }

    public static int a(cm1.a aVar) {
        switch (h.f185676b[aVar.ordinal()]) {
            case 1:
                return R$string.bills_biller_selection_item_frequency_daily;
            case 2:
                return R$string.bills_biller_selection_item_frequency_weekly;
            case 3:
                return R$string.bills_biller_selection_item_frequency_biweekly;
            case 4:
                return R$string.bills_biller_selection_item_frequency_monthly;
            case 5:
                return R$string.bills_biller_selection_item_frequency_quarterly;
            case 6:
                return R$string.bills_biller_selection_item_frequency_semiannually;
            case 7:
                return R$string.bills_biller_selection_item_frequency_annually;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f185671c, new u(23), new b4(12), new joa.j(domainState, this, 26));
        xo1.b bVar = domainState.f185669a;
        int i = bVar == null ? -1 : h.f185675a[bVar.ordinal()];
        return new f(new TextLocalisedClause(i != 1 ? i != 2 ? com.revolut.feature.apm.bills.core.impl.R$string.bills_biller_selection_title : com.revolut.feature.apm.bills.core.impl.R$string.bills_biller_selection_phone_topups_title : R$string.apm_billers_service_provider_search_tapi_title, null, null, 14), new TextLocalisedClause(bVar != null ? R$string.apm_billers_service_provider_search_search_bar_generic_placeholder : com.revolut.feature.apm.bills.core.impl.R$string.bills_biller_selection_search_title, null, null, 14), list);
    }
}
