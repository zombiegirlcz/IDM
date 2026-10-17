package i7b;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoBenefitsSection;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoBenefitsSectionAction;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoBenefitsSectionItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c7b.a f159223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f159224b;

    public b(c7b.a iconsMapper, c actionMapper) {
        Intrinsics.checkNotNullParameter(iconsMapper, "iconsMapper");
        Intrinsics.checkNotNullParameter(actionMapper, "actionMapper");
        this.f159223a = iconsMapper;
        this.f159224b = actionMapper;
    }

    public final List a(CobrandedCardsPlanHubInfoBenefitsSection cobrandedCardsPlanHubInfoBenefitsSection, String listIdPrefix) {
        Intrinsics.checkNotNullParameter(listIdPrefix, "listIdPrefix");
        if (cobrandedCardsPlanHubInfoBenefitsSection != null) {
            ArrayList arrayList = cobrandedCardsPlanHubInfoBenefitsSection.f82359b;
            if (!arrayList.isEmpty()) {
                aim.e eVarB = u.b();
                int i = 0;
                for (Object obj2 : arrayList) {
                    int i2 = i + 1;
                    RowDelegate.Model.MainImage.Image24 image24 = null;
                    if (i < 0) {
                        v.s();
                        throw null;
                    }
                    CobrandedCardsPlanHubInfoBenefitsSectionItem cobrandedCardsPlanHubInfoBenefitsSectionItem = (CobrandedCardsPlanHubInfoBenefitsSectionItem) obj2;
                    String strT = v1.c.t(i, "list_id_", listIdPrefix, "_item_");
                    TextClause textClause = new TextClause(cobrandedCardsPlanHubInfoBenefitsSectionItem.f82365b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    String str = cobrandedCardsPlanHubInfoBenefitsSectionItem.f82366c;
                    TextClause textClause2 = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                    String str2 = cobrandedCardsPlanHubInfoBenefitsSectionItem.f82364a;
                    if (str2 != null) {
                        image24 = new RowDelegate.Model.MainImage.Image24(this.f159223a.c(str2), false, false, 6);
                    }
                    eVarB.add(new RowDelegate.Model(strT, image24, textClause, null, 0, textClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
                    i = i2;
                }
                CobrandedCardsPlanHubInfoBenefitsSectionAction cobrandedCardsPlanHubInfoBenefitsSectionAction = cobrandedCardsPlanHubInfoBenefitsSection.f82360c;
                if (cobrandedCardsPlanHubInfoBenefitsSectionAction != null) {
                    eVarB.add(this.f159224b.a(cobrandedCardsPlanHubInfoBenefitsSectionAction, listIdPrefix));
                }
                return yp0.b.g(u.a(eVarB), new ListSubheaderDelegate.Model(p.a.p("list_id_", listIdPrefix, "_header"), (Image) null, (Clause) new TextClause(cobrandedCardsPlanHubInfoBenefitsSection.f82358a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
            }
        }
        return f0.f322471a;
    }
}
