package zjj;

import aw0.e;
import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.esim.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements n {
    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.esim_mobile_plan_esim_freezing_title, null, null, 14), new TextLocalisedClause(R$string.esim_mobile_plan_esim_freezing_subtitle, null, null, 14), null, null, false, 28);
        List listK = v.k(new RowDelegate.Model("ID_NO_CALLS", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_no_call, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.esim_mobile_plan_esim_freezing_number_disconnected_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.esim_mobile_plan_esim_freezing_number_disconnected_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("ID_DATA_PLANS_DISABLED", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_decline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.esim_mobile_plan_esim_freezing_data_plans_disabled_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.esim_mobile_plan_esim_freezing_data_plans_disabled_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("ID_ESIM_UNFREEZE_INFO", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_snowflake, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.esim_mobile_plan_esim_freezing_unfreeze_info_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.esim_mobile_plan_esim_freezing_unfreeze_info_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(new e(false, null, null, new n6(new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), listK, aVar);
    }
}
