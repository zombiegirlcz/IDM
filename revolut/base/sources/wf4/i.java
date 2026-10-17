package wf4;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.dc;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.intro.CreditOfferTypeSelectionScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditOfferTypeSelectionScreenContract$InputData f296972a;

    public i(CreditOfferTypeSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f296972a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = R$string.offer_v2_offer_type_selection_title;
        CreditOfferTypeSelectionScreenContract$InputData creditOfferTypeSelectionScreenContract$InputData = this.f296972a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(creditOfferTypeSelectionScreenContract$InputData.f68155a.f109255a), null, 12);
        int i2 = R$string.offer_v2_offer_type_selection_description;
        cv3.f fVar = creditOfferTypeSelectionScreenContract$InputData.f68155a;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i2, u.c(fVar.f109256b), null, 12);
        ArrayList<cv3.e> arrayList = fVar.f109257c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (cv3.e eVar : arrayList) {
            String strName = eVar.f109254c.name();
            dc dcVar = new dc(com.revolut.core.ui_kit_core.displayers.image.models.b.b(eVar.d));
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.offer_v2_offer_type_selection_item_title, u.c(eVar.f109252a), null, 12);
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.offer_v2_offer_type_selection_item_description, u.c(eVar.f109253b), null, 12);
            cv3.h hVar = eVar.f109254c;
            ProductSelectionDelegate.Model model = new ProductSelectionDelegate.Model(strName, dcVar, textLocalisedClause3, textLocalisedClause4, null, hVar, new AnalyticsContext(zw4.a.a(hVar.name())), false, false, false, 912);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList2.add(model);
        }
        return new g(textLocalisedClause, textLocalisedClause2, arrayList2);
    }
}
