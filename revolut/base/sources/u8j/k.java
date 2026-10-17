package u8j;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.RateClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.retail.wealth.resources.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u09.v;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i9j.a f278245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t8j.d f278246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pt5.f f278247c;
    public final vyj.a d;

    public k(i9j.a navBarMapper, t8j.d newsMapper, pt5.f activityWidgetMapper, vyj.a learnWidget) {
        Intrinsics.checkNotNullParameter(navBarMapper, "navBarMapper");
        Intrinsics.checkNotNullParameter(newsMapper, "newsMapper");
        Intrinsics.checkNotNullParameter(activityWidgetMapper, "activityWidgetMapper");
        Intrinsics.checkNotNullParameter(learnWidget, "learnWidget");
        this.f278245a = navBarMapper;
        this.f278246b = newsMapper;
        this.f278247c = activityWidgetMapper;
        this.d = learnWidget;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        List list;
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data articles = domainState.f278230m;
        xi0.b bVar = domainState.f278224b;
        Integer numValueOf = Integer.valueOf(R$string.wealth_details_section_news);
        t8j.h hVar = (t8j.h) this.f278246b;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(articles, "articles");
        List list2 = (List) iii.c.f(articles, new t8e.c(hVar, numValueOf, 2), new t5e.j(13), new si5.c(hVar, numValueOf, 15));
        Data data = domainState.f278233q;
        pt5.f fVar = this.f278247c;
        List listA = pt5.f.a(fVar, data);
        Data ordersData = domainState.f278234r;
        dv5.f fVar2 = (dv5.f) fVar;
        fVar2.getClass();
        Intrinsics.checkNotNullParameter(ordersData, "ordersData");
        List list3 = (List) iii.c.f(ordersData, new ds4.b(8), new dv5.b(fVar2, 1), new dv5.c(fVar2, 0));
        Data data2 = domainState.v;
        if (data2 != null) {
            v domain = v.CRYPTO;
            Intrinsics.checkNotNullParameter(domain, "domain");
            Intrinsics.checkNotNullParameter(data2, "courses");
            h09.d dVar = this.d.f293349b;
            Intrinsics.checkNotNullParameter(data2, "data");
            list = (List) iii.c.f(data2, new gwe.d(dVar, 11), new gug.c(17), new gna.i(dVar, 15));
        } else {
            list = null;
        }
        if (list == null) {
            list = f0.f322471a;
        }
        List list4 = list2;
        List list5 = listA;
        ArrayList arrayListE0 = d0.E0(domainState.f278229l, d0.E0(list5, d0.E0(domainState.o, d0.E0(list4, d0.E0(domainState.k, d0.E0(domainState.f278231n, d0.E0(list3, d0.E0(list, d0.E0(domainState.i, d0.E0(domainState.f278228j, d0.E0(domainState.f278226g, domainState.f278232p)))))))))));
        List listL = zhm.v.l(domainState.f278225c);
        boolean z = domainState.f278223a;
        this.f278245a.getClass();
        ArrayList arrayListE02 = d0.E0(u.c(new IconNavBarMenuItem("WATCHLIST_MENU_ITEM_ID", new ResourceImage(z ? R$drawable.uikit_icn_24_star_filled : R$drawable.uikit_icn_24_star_empty, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.retail.feature.crypto.asset_details.api.R$string.crypto_asset_details_watchlist_add_remove_accessibility_title, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)), listL);
        CurrencyClause currencyClause = new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, null, 4);
        n9l.a aVar = domainState.e;
        return new d(arrayListE0, arrayListE02, currencyClause, !Intrinsics.f(domainState.u, Boolean.TRUE) ? aVar != null ? new RateClause(new BigDecimal(String.valueOf(aVar.f213663c)), aVar.f213662b, new RateClause.Format.Default(bVar, true), null) : null : null, domainState.f, domainState.f278227h, domainState.f278235s, domainState.f278236t);
    }
}
