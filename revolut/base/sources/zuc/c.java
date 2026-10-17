package zuc;

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
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements n {
    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = false;
        boolean z3 = false;
        boolean z4 = false;
        List listK = v.k(new RowDelegate.Model("LINKED_WALLETS_LEARN_MORE_INFO_CELL_1", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_eye_hide, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z, z, 6), new TextLocalisedClause(R$string.security_hub_home_card_connections_learn_more_dialog_cell_1_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.security_hub_home_card_connections_learn_more_dialog_cell_1_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("LINKED_WALLETS_LEARN_MORE_INFO_CELL_2", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_card_shield, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z3, z3, 6), new TextLocalisedClause(R$string.security_hub_home_card_connections_learn_more_dialog_cell_2_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), new RowDelegate.Model("LINKED_WALLETS_LEARN_MORE_INFO_CELL_3", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_lock_closed, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), z4, z4, 6), new TextLocalisedClause(R$string.security_hub_home_card_connections_learn_more_dialog_cell_3_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.security_hub_home_card_connections_learn_more_dialog_cell_3_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(new e(false, new TextLocalisedClause(R$string.security_hub_home_card_connections_learn_more_dialog_footer, null, null, 14), null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.d, null, null, true, null, null, 988), null, null, 53), listK, new lw0.a(new TextLocalisedClause(R$string.security_hub_home_card_connections_learn_more_dialog_title, null, null, 14), null, null, null, false, 30));
    }
}
