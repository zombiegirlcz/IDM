package npc;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.l;
import rp0.t;
import rp0.y;
import t1h.m;
import t1h.o;
import t1h.p;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends o {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j60.a f218185l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f218186m;

    public b(j60.a bottomExpandableDialogControllerExtension, d mapper) {
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f218185l = bottomExpandableDialogControllerExtension;
        this.f218186m = mapper;
    }

    @Override // t1h.o
    public final void Z2(m parcel) throws Throwable {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (!(parcel instanceof g)) {
            hx7.e.n(new IllegalArgumentException("Unknown parcel: " + parcel + " received in " + b.class.getSimpleName()));
            return;
        }
        g gVar = (g) parcel;
        if (gVar.equals(e.f218187a)) {
            j60.a.v(this.f218185l, false, null, 3);
        } else {
            if (!gVar.equals(f.f218188a)) {
                throw new NoWhenBranchMatchedException();
            }
            A2(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("question.why-cant-i-withdraw-my-available-funds", 2))));
        }
    }

    @Override // t1h.o
    public final void b3(p state) throws Throwable {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!(state instanceof i)) {
            hx7.e.n(new IllegalArgumentException("Unexpected state: " + state + " received in " + b.class.getSimpleName()));
            return;
        }
        i state2 = (i) state;
        this.f218186m.getClass();
        Intrinsics.checkNotNullParameter(state2, "state");
        t tVar = new t(new TextLocalisedClause(R$string.wealth_robo_withdraw_available_to_withdraw_dialog_title, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_withdraw_available_to_withdraw_dialog_description_no_maintenance_minimum, null, null, 14), null, 28);
        List listK = v.k(new CellDetailsDelegate.Model("AVAILABLE_TO_WITHDRAW_PORTFOLIO_VALUE_CELL_LIST_ID", new TextLocalisedClause(R$string.wealth_robo_investment_portfolio_value, null, null, 14), new MoneyClause(state2.f218190a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552), new CellDetailsDelegate.Model("AVAILABLE_TO_WITHDRAW_PENDING_WITHDRAWALS_CELL_LIST_ID", new TextLocalisedClause(R$string.wealth_robo_withdraw_available_to_withdraw_dialog_pending_withdrawals, null, null, 14), new MoneyClause(state2.f218191b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552), new CellDetailsDelegate.Model("AVAILABLE_TO_WITHDRAW_AVAILABLE_TO_WITHDRAW_CELL_LIST_ID", new TextLocalisedClause(R$string.wealth_robo_withdraw_available_to_withdraw_dialog_title, null, null, 14), new MoneyClause(state2.f218192c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("AVAILABLE_TO_WITHDRAW_INFO_BUTTON_LIST_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, e.f218187a, null, 744);
        int i = R$attr.uikit_dp24;
        int i2 = R$attr.uikit_dp16;
        yp0.b.p(model, i, i, i2, i2);
        this.f218185l.x(new y(d0.F0(model, listK), tVar, l.WINDOW, null, null, null, 1016));
    }
}
