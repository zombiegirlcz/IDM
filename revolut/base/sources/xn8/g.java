package xn8;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_close_account.common.R$string;
import ip0.tm0;
import ip0.um0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements n {
    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.f307337a;
        String str = domainState.f307338b;
        ArrayList arrayList = new ArrayList();
        List listK = v.k(new ListCellDelegate.Model("ID_CLOSING_ITEM_0", new j8(new ResourceImage(R$drawable.uikit_icn_24_arrow_request, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new TextLocalisedClause(R$string.junior_account_close_dialog_details_funds_title, null, null, 14), null, false, null, null, 0, 0, 0, 0, 4072), new ListCellDelegate.Model("ID_CLOSING_ITEM_1", new j8(new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new TextLocalisedClause(R$string.junior_account_close_dialog_details_data_with_challenges_title, null, null, 14), null, false, null, null, 0, 0, 0, 0, 4072), new ListCellDelegate.Model("ID_CLOSING_ITEM_2", new j8(new ResourceImage(R$drawable.uikit_icn_24_card, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new TextLocalisedClause(R$string.rev_u18_account_close_dialog_details_card_title, null, null, 14), null, false, null, null, 0, 0, 0, 0, 4072), new ListCellDelegate.Model("ID_CLOSING_ITEM_3", new j8(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)), new TextLocalisedClause(R$string.rev_u18_account_close_dialog_details_rev_u18_app_title, null, null, 14), null, false, null, null, 0, 0, 0, 0, 4072));
        yp0.b.k(listK, R$attr.uikit_dp16, 0, 0, 0, 30);
        a0.x(listK, arrayList);
        return new f(d0.F0(new um0("ID_JUNIOR_ACCOUNT_CLOSURE_CONFIRMATION", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.junior_account_close_dialog_action_cancel, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, z ? new TextLocalisedClause(R$string.junior_account_close_dialog_action_proceed, null, null, 14) : new TextLocalisedClause(R$string.junior_account_close_dialog_action_close_account, null, null, 14), false, null, null, 56), (Object) str, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008), arrayList), new lw0.a(new TextLocalisedClause(R$string.junior_account_close_dialog_header_title, null, null, 14), new TextLocalisedClause(R$string.rev_u18_account_close_dialog_header_new_subtitle, null, null, 14), null, null, false, 28));
    }
}
