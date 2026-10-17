package ffh;

import bfh.e;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.feature.wealth.private_companies.impl.ui.private_company_details.PrivateCompanyDetailsFlowContract$Page;
import com.revolut.retail.wealth.resources.R$string;
import f0e.i;
import fci.e0;
import fe9.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f134805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3h.c f134806b;

    public b(c navBarMapper, m3h.c actionsPanelMapper) {
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        Intrinsics.checkNotNullParameter(actionsPanelMapper, "actionsPanelMapper");
        this.f134805a = navBarMapper;
        this.f134806b = actionsPanelMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        int i;
        bfh.c domainState = (bfh.c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        e eVar = (e) iii.c.f(domainState.d, new f(18), new e0(5), new i(this.f134805a, domainState, 8));
        List<PrivateCompanyDetailsFlowContract$Page> list = domainState.f14981a;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (PrivateCompanyDetailsFlowContract$Page privateCompanyDetailsFlowContract$Page : list) {
            int i2 = a.f134804a[privateCompanyDetailsFlowContract$Page.ordinal()];
            if (i2 == 1) {
                i = R$string.wealth_stock_details_tab_overview;
            } else if (i2 == 2) {
                i = R$string.wealth_stock_details_tab_financials;
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.wealth_stock_details_tab_feed;
            }
            arrayList.add(new q(privateCompanyDetailsFlowContract$Page.getF94249a(), new t(new TextLocalisedClause(i, null, null, 14)), 58));
        }
        return new bfh.f(eVar, arrayList, domainState.f14982b, this.f134806b.a(domainState.f.f211545a));
    }
}
