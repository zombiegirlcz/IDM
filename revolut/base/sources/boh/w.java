package boh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth_discovery.api.declaration.collection.MostTradedAssetsDestination;
import com.revolut.retail.wealth.resources.R$string;
import ip0.i10;
import ip0.k10;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xzg.b0;
import xzg.d0;
import z0h.q1;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class w implements cli.n {

    @NotNull
    private static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jbh.b f17484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f17485b;

    public w(jbh.b assetsMapper, b filtersMapper, q1 disclaimersMapper) {
        Intrinsics.checkNotNullParameter(assetsMapper, "assetsMapper");
        Intrinsics.checkNotNullParameter(filtersMapper, "filtersMapper");
        Intrinsics.checkNotNullParameter(disclaimersMapper, "disclaimersMapper");
        this.f17484a = assetsMapper;
        this.f17485b = disclaimersMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        n domainState = (n) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = zhm.u.b();
        Data data = domainState.f17472b;
        MostTradedAssetsDestination mostTradedAssetsDestination = domainState.f17471a;
        Collection collection = (List) data.getContent();
        if (collection == null) {
            collection = f0.f322471a;
        }
        int i = 0;
        if (!collection.isEmpty()) {
            Collection collection2 = collection;
            ArrayList arrayList = new ArrayList(zhm.w.t(collection2, 10));
            for (Object obj2 : collection2) {
                int i2 = i + 1;
                if (i < 0) {
                    zhm.v.s();
                    throw null;
                }
                xzg.v vVar = (xzg.v) obj2;
                arrayList.add(this.f17484a.a(vVar, i2, new l(vVar)));
                i = i2;
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            eVarB.addAll(arrayList);
        } else if (domainState.f17472b.getLoading()) {
            ArrayList arrayList2 = new ArrayList(10);
            while (i < 10) {
                arrayList2.add(new pb0(a0.d.n("Loading.Row.", i)));
                i++;
            }
            yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
            eVarB.addAll(arrayList2);
        } else {
            k10 k10Var = new k10("Empty.Row", com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D097", null, null, null, 30), new i10(new TextLocalisedClause(R$string.wealth_common_no_data, null, null, 14)));
            yp0.b.l(k10Var, 0, 0, 0, 0, null, false, 63);
            eVarB.add(k10Var);
        }
        Data data2 = domainState.e;
        List listB = data2 != null ? ((aah.m) this.f17485b).b(data2) : null;
        if (listB == null) {
            listB = f0.f322471a;
        }
        eVarB.addAll(listB);
        aim.e eVarA = zhm.u.a(eVarB);
        boolean z = mostTradedAssetsDestination instanceof MostTradedAssetsDestination.Cfd;
        if (z) {
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_margin_most_traded_title, null, null, 14);
        } else {
            if (!(mostTradedAssetsDestination instanceof MostTradedAssetsDestination.Crypto) && !(mostTradedAssetsDestination instanceof MostTradedAssetsDestination.Stocks)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.wealth_most_traded_title, null, null, 14);
        }
        if (z) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_margin_most_traded_description, null, null, 14);
        } else if (mostTradedAssetsDestination instanceof MostTradedAssetsDestination.Crypto) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_most_traded_crypto_description, null, null, 14);
        } else {
            if (!(mostTradedAssetsDestination instanceof MostTradedAssetsDestination.Stocks)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_most_traded_stocks_description_v2, null, null, 14);
        }
        b0 timeSpan = domainState.f17473c;
        d0 section = domainState.d;
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(section, "section");
        mx0.d dVar = mx0.d.SEMIBLACK;
        return new p(eVarA, textLocalisedClause, textLocalisedClause2, zhm.v.k(new ActionsView.Item("FILTER_LIST_ID", dVar, false, null, null, f.r(section), new ResourceImage(R$drawable.uikit_icn_24_filter, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, o.SECTION, null, 24476), new ActionsView.Item("TIMEFRAME_LIST_ID", dVar, false, null, null, f.q(timeSpan), new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, o.TIME_SPAN, null, 24476)));
    }
}
