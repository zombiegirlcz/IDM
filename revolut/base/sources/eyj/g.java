package eyj;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.junior_upgrade.impl.R$plurals;
import com.revolut.retail.feature.junior_upgrade.impl.R$string;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import zhm.a0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements p {
    public static RowDelegate.Model b(int i, Clause clause, TextLocalisedClause textLocalisedClause) {
        return new RowDelegate.Model(String.valueOf(i), new RowDelegate.Model.MainImage.Image24(new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), textLocalisedClause, null, 0, clause, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
    }

    @Override // jki.p
    public final m a(i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.d;
        aim.e eVarB = u.b();
        eVarB.add(new ListSubheaderDelegate.Model("ID_HEADER_MESSAGE_TITLE", (Image) null, (Clause) new TextLocalisedClause(R$string.junior_upgrade_no_feature_message_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp32, 0, 0, 0, 61434));
        PlainTextDelegate.Model model = new PlainTextDelegate.Model("ID_UPGRADE_BENEFITS", (Clause) null, (Clause) new TextLocalisedClause(R$string.junior_upgrade_message_section_description, u.c(domainState.e), null, 12), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65262);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        eVarB.add(model);
        eVarB.add(new ListSubheaderDelegate.Model("ID_HEADER_BENEFITS_TITLE", (Image) null, (Clause) new TextLocalisedClause(R$string.junior_upgrade_no_feature_features_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp32, 0, 0, 0, 61434));
        int i = domainState.f130865a;
        int i2 = domainState.f130866b;
        int i3 = domainState.f130867c;
        aim.e eVarB2 = u.b();
        eVarB2.add(b(R$drawable.uikit_icn_24_children, new TextLocalisedQuantityClause(R$plurals.rev_u18_upgrade_feature_accounts_limit_subtitle, Integer.valueOf(i), v.k(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3 - 1)), (Style) null, 24), new TextLocalisedClause(R$string.rev_u18_upgrade_feature_accounts_limit_title, null, null, 14)));
        eVarB2.add(b(R$drawable.uikit_icn_24_card, new TextLocalisedClause(R$string.rev_u18_upgrade_feature_free_card, null, null, 14), new TextLocalisedClause(R$string.rev_u18_upgrade_feature_free_card_title, null, null, 14)));
        eVarB2.add(b(R$drawable.uikit_icn_24_people, new TextLocalisedClause(R$string.rev_u18_upgrade_feature_co_parents, null, null, 14), new TextLocalisedClause(R$string.rev_u18_upgrade_feature_co_parents_title, null, null, 14)));
        aim.e eVarA = u.a(eVarB2);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        a0.x(eVarA, eVarB);
        Unit unit = Unit.f186387a;
        return new e(u.a(eVarB), z);
    }
}
