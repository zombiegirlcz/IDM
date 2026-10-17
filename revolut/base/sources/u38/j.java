package u38;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pocket_details.api.R$string;
import com.revolut.feature.tab.accounts.api.model.ProductAccountListAction;
import com.revolut.retail.common.ui.api.Toggles;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f276818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y91.b f276819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProductAccountListAction f276820c;
    public final ProductAccountListAction d;
    public final ProductAccountListAction e;
    public final ProductAccountListAction f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProductAccountListAction f276821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ProductAccountListAction f276822h;
    public final ProductAccountListAction i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ProductAccountListAction f276823j;
    public final ProductAccountListAction k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ProductAccountListAction f276824l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ProductAccountListAction f276825m;

    public j(gte.a featureToggleInteractor, y91.b accountsProductFeatureChecker, r12.h apmHomeActionsMapper) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(apmHomeActionsMapper, "apmHomeActionsMapper");
        this.f276818a = featureToggleInteractor;
        this.f276819b = accountsProductFeatureChecker;
        this.f276820c = new ProductAccountListAction(504, null, new TextLocalisedClause(R.string.common_action_activate, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_switch_on, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "ACTIVATE_ACTION", null, null, false, false);
        new ProductAccountListAction(504, null, new TextLocalisedClause(R.string.common_action_deactivate, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_switch_off, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "SHOW_DEACTIVATE_DIALOG_ACTION", null, null, false, false);
        this.d = new ProductAccountListAction(504, null, new TextLocalisedClause(R$string.joint_home_action_statement, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_statement, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "STATEMENT_ACTION", null, null, false, false);
        this.e = new ProductAccountListAction(504, null, new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_home_action_close_joint, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_broken_heart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "CLOSE_ACCOUNT_FORCE_OFF_BOARDING", null, null, false, false);
        this.f = new ProductAccountListAction(504, null, new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_home_action_withdraw, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "WITHDRAW_ACTION", null, null, false, false);
        this.f276821g = new ProductAccountListAction(504, null, new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_home_action_limits, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_limit, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "LIMITS_ACTION", null, null, false, false);
        this.f276822h = new ProductAccountListAction(504, null, new TextLocalisedClause(R$string.joint_home_action_add_money, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "ADD_MONEY_ACTION", null, null, false, false);
        this.i = new ProductAccountListAction(504, null, new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_home_action_send_reminder, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_bell, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "SEND_REMINDER_ACTION", null, null, false, false);
        this.f276823j = new ProductAccountListAction(504, null, new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_home_action_cancel_invite, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "CANCEL_INVITE_ACTION", null, null, false, false);
        this.k = new ProductAccountListAction(504, null, new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_home_action_get_help, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_question, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, "GET_HELP_ACTION", null, null, false, false);
        this.f276824l = sfe.d.e;
        this.f276825m = sfe.d.d;
    }

    public final ProductAccountListAction a(io3.d dVar) {
        ProductAccountListAction productAccountListAction = sfe.d.f262407b;
        Object obj2 = dVar;
        if (!((jte.d) this.f276818a).c(Toggles.AccountDetailsSurfacing.f98561c)) {
            obj2 = "DETAILS_ACTION_SUMMARY";
        } else if (dVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Base currency pocket must exist at this point");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            Unit unit = Unit.f186387a;
            obj2 = "DETAILS_ACTION_SUMMARY";
        }
        return ProductAccountListAction.a(productAccountListAction, null, false, obj2, 383);
    }
}
