package sfe;

import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tab.accounts.api.R$string;
import com.revolut.feature.tab.accounts.api.model.ProductAccountListAction;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProductAccountListAction f262406a = new ProductAccountListAction(504, null, new TextLocalisedClause(R$string.revolut_accounts_action_move_money, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_shuffle, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "HOME_ACTION_MOVE_MONEY_ID", null, null, false, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ProductAccountListAction f262407b = new ProductAccountListAction(504, null, new TextLocalisedClause(R$string.home_account_action_details, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_bank, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "HOME_ACTION_DETAILS_ID", null, null, false, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ProductAccountListAction f262408c = new ProductAccountListAction(504, null, new TextLocalisedClause(R$string.home_account_action_info, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "HOME_ACTION_INFO_ID", null, null, false, false);
    public static final ProductAccountListAction d;
    public static final ProductAccountListAction e;

    static {
        ProductAccountListAction productAccountListAction = new ProductAccountListAction(DefaultFrameSampler.DESIRED_FRAME_WIDTH, null, new TextLocalisedClause(R$string.home_account_action_remove, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "ACTION_REMOVE_ACCOUNT_ID", f.LAST, g.DESTRUCTIVE, false, false);
        d = productAccountListAction;
        e = ProductAccountListAction.a(productAccountListAction, new TextLocalisedClause(R$string.home_account_action_remove_currency, null, null, 14), false, null, 509);
    }

    private d() {
    }
}
