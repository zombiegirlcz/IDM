package qu1;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDualTextDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowQuantityDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TimePickerDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.blik.impl.ui.settings.BlikSettingsScreen;
import com.revolut.feature.apm.breb.impl.ui.register.BrebRegisterScreen;
import com.revolut.feature.credit.card.impl.ui.statement.hub.CreditCardStatementHubScreen;
import com.revolut.feature.selfserve.sot.impl.ui.description.AddDescriptionFragment;
import com.revolut.feature.transport.impl.ui.transit_checkout.TransitCheckoutScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.xh0;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import okhttp3.OkHttpClient;
import qlm.j1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f249177a;

    public /* synthetic */ d(int i) {
        this.f249177a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f249177a) {
            case 0:
                KProperty[] kPropertyArr = BlikSettingsScreen.S;
                return new CellDetailsChevronDelegate();
            case 1:
                KProperty[] kPropertyArr2 = BlikSettingsScreen.S;
                return new ActionWidgetDelegate();
            case 2:
                KProperty[] kPropertyArr3 = BlikSettingsScreen.S;
                return new RowDelegate(null, null, 7);
            case 3:
                return new qlm.e(quj.f.f249466a);
            case 4:
                return new qlm.e(quj.i.f249470a);
            case 5:
                m70.a.c(t0.f186434a);
                return new bw0.h("", null, false, null, null, bw0.e.None, null, false, 14806);
            case 6:
                KProperty[] kPropertyArr4 = CreditCardStatementHubScreen.T;
                return new RowDelegate(null, null, 7);
            case 7:
                KProperty[] kPropertyArr5 = CreditCardStatementHubScreen.T;
                return new FullScreenStateDelegate();
            case 8:
                KProperty[] kPropertyArr6 = CreditCardStatementHubScreen.T;
                return new FixedTabsDelegate();
            case 9:
                KProperty[] kPropertyArr7 = BrebRegisterScreen.R;
                return new RowDelegate(null, null, 7);
            case 10:
                KProperty[] kPropertyArr8 = TransitCheckoutScreen.f92560k0;
                return new TimePickerDelegate();
            case 11:
                KProperty[] kPropertyArr9 = TransitCheckoutScreen.f92560k0;
                return new DatePickerDelegate();
            case 12:
                KProperty[] kPropertyArr10 = TransitCheckoutScreen.f92560k0;
                return new RowDelegate(null, null, 7);
            case 13:
                KProperty[] kPropertyArr11 = TransitCheckoutScreen.f92560k0;
                return new RowQuantityDelegate();
            case 14:
                KProperty[] kPropertyArr12 = TransitCheckoutScreen.f92560k0;
                return new CellDetailsDelegate();
            case 15:
                KProperty[] kPropertyArr13 = TransitCheckoutScreen.f92560k0;
                return new InputTextDelegate(null);
            case 16:
                KProperty[] kPropertyArr14 = TransitCheckoutScreen.f92560k0;
                return new InputDualTextDelegate(null, 3);
            case 17:
                KProperty[] kPropertyArr15 = TransitCheckoutScreen.f92560k0;
                return new LargeActionButtonDelegate();
            case 18:
                return new SwipeToActionDelegate.SwipeAction("ACTION_SEND", new ResourceImage(R$drawable.uikit_icn_24_arrow_send, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R.string.common_action_send, null, null, 14), xh0.PRIMARY, null, null, null, 112);
            case 19:
                return new SwipeToActionDelegate.SwipeAction("ACTION_REQUEST", new ResourceImage(R$drawable.uikit_icn_24_arrow_request, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R.string.common_action_request, null, null, 14), xh0.PRIMARY, null, null, null, 112);
            case 20:
                return new SwipeToActionDelegate.SwipeAction("ACTION_HIDE", new ResourceImage(R$drawable.uikit_icn_24_eye_hide, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R.string.common_action_hide, null, null, 14), xh0.NEUTRAL, null, null, null, 112);
            case 21:
                return new SwipeToActionDelegate.SwipeAction("ACTION_BENEFICIARY_DETAILS", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R.string.common_action_details, null, null, 14), xh0.PRIMARY, null, null, null, 112);
            case 22:
                return new SwipeToActionDelegate.SwipeAction("ACTION_CARD_OWNER_DETAILS", new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R.string.common_action_details, null, null, 14), xh0.PRIMARY, null, null, null, 112);
            case 23:
                int i = AddDescriptionFragment.g0;
                return new InputTextDelegate(null);
            case 24:
                Lazy lazy = qz0.h.f250326a;
                return new OkHttpClient(new OkHttpClient.a());
            case 25:
                return new w8.a(200, true);
            case 26:
                return qz8.d.Companion.serializer();
            case 27:
                return j1.a("com.revolut.feature.learn.shared.impl.data.network.dto.course.BadgeDto.Type", qz8.d.values(), new String[]{"NEW", "TRENDING"}, new Annotation[][]{null, null});
            case 28:
                return new qlm.e(qz8.a.f250379a);
            default:
                return new qlm.e(uz8.l.f284639a);
        }
    }
}
