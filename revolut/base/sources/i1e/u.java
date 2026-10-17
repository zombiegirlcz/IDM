package i1e;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.stock_lending.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ieg.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements jki.p {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o9h.a f157631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f157632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f157633c;

    public u(o9h.a footerDelegateMapper, j transactionsGroupMapper, i statisticsMapper) {
        Intrinsics.checkNotNullParameter(footerDelegateMapper, "footerDelegateMapper");
        Intrinsics.checkNotNullParameter(transactionsGroupMapper, "transactionsGroupMapper");
        Intrinsics.checkNotNullParameter(statisticsMapper, "statisticsMapper");
        this.f157631a = footerDelegateMapper;
        this.f157632b = transactionsGroupMapper;
        this.f157633c = statisticsMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        TextLocalisedClause textLocalisedClause;
        g state = (g) iVar;
        Intrinsics.checkNotNullParameter(state, "domainState");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_stock_lending_details_title, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.wealth_stock_lending_details_subtitle, null, null, 14);
        s0 s0Var = new s0(5);
        Data transactions = state.f157616a;
        j1e.b bVar = (j1e.b) this.f157633c;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        qv0.i iVar2 = (qv0.i) iii.c.f(transactions, new iyi.i(bVar, 8), new in1.a(bVar, 27), new igh.o(bVar, 24));
        int i = R$attr.uikit_dp0;
        int i2 = R$attr.uikit_dp16;
        yp0.b.l(iVar2, i, 0, i2, i2, null, false, 50);
        s0Var.a(iVar2);
        Data data = state.f157616a;
        if (((Boolean) iii.c.f(data, new i0k.f(16), new hy2.b(22), new gzb.d(22))).booleanValue()) {
            textLocalisedClause = new TextLocalisedClause(state.f157617b ? R.string.common_show_less : R.string.common_show_more, null, null, 14);
        } else {
            textLocalisedClause = null;
        }
        s0Var.a(new ListSubheaderDelegate.Model("ID_TRANSACTIONS_HEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.wealth_stock_lending_details_transactions_header, null, null, 14), (ResourceImage) null, false, false, (Clause) textLocalisedClause, textLocalisedClause != null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946));
        j1e.c cVar = (j1e.c) this.f157632b;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        s0Var.b(((List) iii.c.f(data, new iyi.i(cVar, 9), new in1.a(cVar, 28), new z(state, cVar, 14))).toArray(new koi.j[0]));
        CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("ID_LEARN_MORE", new TextLocalisedClause(R$string.wealth_stock_lending_details_learn_more, null, null, 14), 0, false, null, null, null, 2044);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        s0Var.a(model);
        CellDetailsChevronDelegate.Model model2 = new CellDetailsChevronDelegate.Model("ID_DISABLE_LENDING", new TextLocalisedClause(R$string.wealth_stock_lending_details_disable_action, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), 0, false, null, null, null, 2036);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        s0Var.a(model2);
        ArrayList arrayList = s0Var.f186433a;
        List listK = v.k(arrayList.toArray(new koi.j[arrayList.size()]));
        n0h.b bVar2 = state.f157618c;
        return new k(textLocalisedClause2, textLocalisedClause3, i2b.a.o(listK, bVar2 != null ? this.f157631a.a(bVar2, new p0h.e(null, 3)) : null));
    }
}
