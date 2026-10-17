package z66;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import com.revolut.retail.wealth.resources.R$string;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import ymk.y;
import z0f.a0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements cli.n {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f319705a = R$attr.uikit_colorAccent;

    public static final class a {
        private a() {
        }
    }

    public static ArrayList a(int i) {
        IntRange intRangeO = kotlin.ranges.f.o(0, i);
        ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            arrayList.add(nb0.b(pb0.Companion, a0.d.n("defi_trade_loading_", it8.nextInt()), false, 0, false, 30));
        }
        return arrayList;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList arrayList = new ArrayList();
        aim.e eVarB = u.b();
        SortingType sortingType = domainState.e;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_news_tab_crypto, null, null, 14);
        int i = f319705a;
        TextLocalisedClause textLocalisedClauseD = hn5.c.d(sortingType, i);
        eVarB.add(new ListSubheaderDelegate.Model("defi_trade_subheader", (Image) null, (Clause) textLocalisedClause, (ResourceImage) null, false, false, (Clause) (!domainState.f ? new CompositeClause(v.k(textLocalisedClauseD, hn5.c.a(sortingType, i)), null, null, textLocalisedClauseD, 6) : null), true, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946));
        eVarB.addAll((List) iii.c.g(domainState.f319685b, new z55.w(this), new a0(19), new y(8, domainState, this)));
        zhm.a0.x(u.a(eVarB), arrayList);
        return new d(domainState.f319684a, arrayList);
    }
}
