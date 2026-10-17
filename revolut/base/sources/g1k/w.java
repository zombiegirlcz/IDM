package g1k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsFilter;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.WealthAllNewsContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ry;
import ip0.sy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z0h.q1;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class w implements cli.n {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WealthAllNewsContract$InputData f139711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ykh.a f139712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1k.a f139713c;
    public final q1 d;

    public w(WealthAllNewsContract$InputData inputData, ykh.a navBarFiltersMapper, a1k.a newsItemsMapper, q1 wealthDisclaimerMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(navBarFiltersMapper, "navBarFiltersMapper");
        Intrinsics.checkNotNullParameter(newsItemsMapper, "newsItemsMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimerMapper, "wealthDisclaimerMapper");
        this.f139711a = inputData;
        this.f139712b = navBarFiltersMapper;
        this.f139713c = newsItemsMapper;
        this.d = wealthDisclaimerMapper;
    }

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList(10);
        for (int i = 0; i < 10; i++) {
            arrayList.add(new sy(a0.d.n("ALL_NEWS_LOADING_DELEGATE_ID_", i), ry.DEFAULT, 60));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Collection collectionA;
        List listC;
        List listA;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f139688b;
        if (data == null || (collectionA = (List) iii.c.f(data, new k(this, 1), new g0c.h(10), new fyg.b(this, domainState, 3))) == null) {
            collectionA = a();
        }
        List listB = ((aah.m) this.d).b(domainState.f139689c);
        WealthAllNewsContract$InputData wealthAllNewsContract$InputData = this.f139711a;
        WealthNewsFilter wealthNewsFilter = wealthAllNewsContract$InputData.f101859a;
        Intrinsics.checkNotNullParameter(wealthNewsFilter, "<this>");
        if (wealthNewsFilter instanceof WealthNewsFilter.ByAssetFilter) {
            listC = zhm.u.c(new IconNavBarMenuItem("NAV_BAR_MENU_ACTION_WATCHLIST", new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.feed_section_insights_empty_action_add_to_watchlist, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
        } else {
            if (!(wealthNewsFilter instanceof WealthNewsFilter.ByRef) && !(wealthNewsFilter instanceof WealthNewsFilter.ByMarket)) {
                throw new NoWhenBranchMatchedException();
            }
            listC = f0.f322471a;
        }
        WealthNewsFilter wealthNewsFilter2 = wealthAllNewsContract$InputData.f101859a;
        Intrinsics.checkNotNullParameter(wealthNewsFilter2, "<this>");
        if (wealthNewsFilter2 instanceof WealthNewsFilter.ByAssetFilter) {
            listA = this.f139712b.a(domainState.f139687a);
        } else {
            if (!(wealthNewsFilter2 instanceof WealthNewsFilter.ByRef) && !(wealthNewsFilter2 instanceof WealthNewsFilter.ByMarket)) {
                throw new NoWhenBranchMatchedException();
            }
            listA = f0.f322471a;
        }
        return new f(d0.E0(listB, collectionA), listC, listA);
    }
}
