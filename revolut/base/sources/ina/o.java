package ina;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.profile.api.DocumentsPage;
import com.revolut.feature.profile.impl.ui.documents_redesigned.document_selector.extensions.GeneralInvestmentsSelectorControllerExtension$GeneralInvestmentsItem;
import com.revolut.feature.wealth.ui.api.navigation.InvestDocumentsDetailsDestination;
import com.revolut.feature.wealth.ui.api.navigation.InvestDocumentsType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import xzg.q0;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fna.i f162738l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kpj.f f162739m;

    public o(fna.i itemsFactory, kpj.f wealthAccountHeaderUiMapper) {
        Intrinsics.checkNotNullParameter(itemsFactory, "itemsFactory");
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        this.f162738l = itemsFactory;
        this.f162739m = wealthAccountHeaderUiMapper;
    }

    @Override // ina.k
    public final void Z2(RowDelegate.Model item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Object obj2 = item.u;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.documents_redesigned.document_selector.extensions.GeneralInvestmentsSelectorControllerExtension.GeneralInvestmentsItem");
        GeneralInvestmentsSelectorControllerExtension$GeneralInvestmentsItem generalInvestmentsSelectorControllerExtension$GeneralInvestmentsItem = (GeneralInvestmentsSelectorControllerExtension$GeneralInvestmentsItem) obj2;
        A2(new InvestDocumentsDetailsDestination(new InvestDocumentsType.Stocks(generalInvestmentsSelectorControllerExtension$GeneralInvestmentsItem.f81417a, generalInvestmentsSelectorControllerExtension$GeneralInvestmentsItem.f81418b)));
    }

    @Override // ina.k
    public final Flow c3(DocumentsPage documentsPage) {
        DocumentsPage.GeneralInvestments documentsPage2 = (DocumentsPage.GeneralInvestments) documentsPage;
        Intrinsics.checkNotNullParameter(documentsPage2, "documentsPage");
        hel.b bVar = documentsPage2.f81302c;
        kpj.f fVar = this.f162739m;
        n2l.i iVar = n2l.i.f211591a;
        TextLocalisedClause textLocalisedClauseH = fVar.h(iVar, bVar, null);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int iG = fVar.g(iVar);
        int i = R$attr.uikit_colorAccentNeutral;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(wp5.y.h(new Color.Solid(i), 0.1f, companion, iG, new Color.Solid(i)), null, null, false, null, false, 62);
        RowDelegate.Model modelD = fna.i.d(this.f162738l, "GENERAL_INVESTMENTS_ITEM", textLocalisedClauseH, new GeneralInvestmentsSelectorControllerExtension$GeneralInvestmentsItem(documentsPage2.f81300a, q0.PERSONAL), image40, 4);
        hel.b bVar2 = documentsPage2.f81302c;
        n2l.e eVar = n2l.e.f211587a;
        TextLocalisedClause textLocalisedClauseH2 = fVar.h(eVar, bVar2, null);
        int iG2 = fVar.g(eVar);
        int i2 = R$attr.uikit_colorAccentNeutral;
        RowDelegate.Model.MainImage.Image40 image402 = new RowDelegate.Model.MainImage.Image40(wp5.y.h(new Color.Solid(i2), 0.1f, companion, iG2, new Color.Solid(i2)), null, null, false, null, false, 62);
        List listK = zhm.v.k(modelD, fna.i.d(this.f162738l, "JOINT_GENERAL_INVESTMENTS_ITEM", textLocalisedClauseH2, new GeneralInvestmentsSelectorControllerExtension$GeneralInvestmentsItem(documentsPage2.f81301b, q0.PERSONAL_JOINT), image402, 4));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new go.g(zi0.c.P(listK, false, null, 3), 2);
    }

    @Override // ina.k
    public final Object h3(DocumentsPage documentsPage, ge7.f fVar) {
        return this.f162739m.h(n2l.i.f211591a, ((DocumentsPage.GeneralInvestments) documentsPage).f81302c, null);
    }
}
