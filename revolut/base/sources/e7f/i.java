package e7f;

import android.os.Parcelable;
import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import e54.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements n, l5f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ufl.b f123323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kpj.f f123324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ListSubheaderDelegate.Model f123325c;

    public i(kpj.f wealthAccountHeaderUiMapper, ufl.b wealthHoldingsClauseFactory) {
        Intrinsics.checkNotNullParameter(wealthHoldingsClauseFactory, "wealthHoldingsClauseFactory");
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        this.f123323a = wealthHoldingsClauseFactory;
        this.f123324b = wealthAccountHeaderUiMapper;
        this.f123325c = new ListSubheaderDelegate.Model("ManagedPortfolioPerformanceSummaryExtensionMapper_subheader", (Image) null, (Clause) new TextLocalisedClause(R$string.managed_portfolios_template_details_investment_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public final g a(e eVar, l5f.b bVar) {
        Data data = eVar.f123319a;
        if (data == null) {
            g.Companion.getClass();
            return new g(f0.f322471a);
        }
        List list = (List) data.getContent();
        if (list != null && list.isEmpty()) {
            g.Companion.getClass();
            return new g(f0.f322471a);
        }
        Data data2 = eVar.f123320b;
        if (data2 == null) {
            data2 = new Data(null, null, true, 3, null);
        }
        Data data3 = eVar.f123321c;
        if (data3 == null) {
            data3 = new Data(null, null, true, 3, null);
        }
        Data data4 = eVar.d;
        if (data4 == null) {
            data4 = new Data(null, null, true, 3, null);
        }
        return new g((List) iii.c.f(t1.v(data, data2, data3, data4), new e2j.j(this, 27), new r(this, 6), new dn8.k(this, bVar, 11)));
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return a(domainState, null);
    }
}
