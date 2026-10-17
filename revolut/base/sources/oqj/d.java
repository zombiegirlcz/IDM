package oqj;

import android.widget.TextView;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalSmallButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.feature.apm.bizum.impl.ui.transfer.review.BizumTransferReviewScreen;
import com.revolut.feature.apm.breb.impl.ui.qr_request.request.BrebQrRequestScreen;
import com.revolut.feature.credit.card.impl.ui.documents_rates.CreditCardDocumentsRatesController;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trade.CryptoSortingPickerScreen;
import com.revolut.feature.payments.groups.impl.ui_chat.members.GroupChatMembersScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.trading.orders.ui.invest.placement.target_price.TargetPriceScreen;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import oti.e0;
import oti.v;
import oti.w0;
import oti.x1;
import oti.z0;
import qlm.t0;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227914a;

    public /* synthetic */ d(int i) {
        this.f227914a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object objA;
        switch (this.f227914a) {
            case 0:
                return new qlm.e(t0.f247706a);
            case 1:
                try {
                    m.Companion companion = m.INSTANCE;
                    Field declaredField = TextView.class.getDeclaredField("mSingleLine");
                    declaredField.setAccessible(true);
                    objA = declaredField;
                    break;
                } catch (Throwable th10) {
                    m.Companion companion2 = m.INSTANCE;
                    objA = o.a(th10);
                }
                return (Field) (objA instanceof n ? null : objA);
            case 2:
                KProperty[] kPropertyArr = CreditCardDocumentsRatesController.T;
                return new RowDelegate(null, null, 7);
            case 3:
                KProperty[] kPropertyArr2 = CreditCardDocumentsRatesController.T;
                return new CellDetailsDelegate();
            case 4:
                KProperty[] kPropertyArr3 = CreditCardDocumentsRatesController.T;
                return new FullScreenStateDelegate();
            case 5:
                return PlusActionNavBarMenuItem.Companion.c(PlusActionNavBarMenuItem.INSTANCE, "GROUP_CHAT_MEMBERS_MENU_ITEM_ADD_ID", new TextLocalisedClause(R.string.common_action_add, null, null, 14), null, 60);
            case 6:
                KProperty[] kPropertyArr4 = GroupChatMembersScreen.f79369e0;
                return new RowDelegate(null, null, 7);
            case 7:
                KProperty[] kPropertyArr5 = GroupChatMembersScreen.f79369e0;
                return new LargeActionButtonDelegate();
            case 8:
                KProperty[] kPropertyArr6 = BizumTransferReviewScreen.c0;
                return new CellDetailsActionDelegate();
            case 9:
                KProperty[] kPropertyArr7 = BizumTransferReviewScreen.c0;
                return new CellDetailsSwitcherDelegate();
            case 10:
                return new qlm.e(x1.f229704a);
            case 11:
                return new qlm.e(oti.a.f229594a);
            case 12:
                return new qlm.e(oti.a.f229594a);
            case 13:
                return new qlm.e(oti.o.f229672a);
            case 14:
                return new qlm.e(v.f229695a);
            case 15:
                return new qlm.e(e0.f229630a);
            case 16:
                return new qlm.e(w0.f229699a);
            case 17:
                return new qlm.e(z0.f229709a);
            case 18:
                return new qlm.e(oti.m.f229662a);
            case 19:
                return new qlm.e(oti.t0.f229687a);
            case 20:
                KProperty[] kPropertyArr8 = TargetPriceScreen.W;
                return new LargeActionButtonDelegate();
            case 21:
                KProperty[] kPropertyArr9 = BrebQrRequestScreen.W;
                return new FullScreenStateDelegate();
            case 22:
                KProperty[] kPropertyArr10 = BrebQrRequestScreen.W;
                return new ActionsDelegate();
            case 23:
                KProperty[] kPropertyArr11 = BrebQrRequestScreen.W;
                return new TextDelegate();
            case 24:
                KProperty[] kPropertyArr12 = BrebQrRequestScreen.W;
                return new SmallActionButtonDelegate();
            case 25:
                KProperty[] kPropertyArr13 = BrebQrRequestScreen.W;
                return new TwinHorizontalSmallButtonDelegate();
            case 26:
                KProperty[] kPropertyArr14 = BrebQrRequestScreen.W;
                return new CircleActionButtonsBarDelegate();
            case 27:
                KProperty[] kPropertyArr15 = CryptoSortingPickerScreen.S;
                return new SingleChoiceDelegate();
            case 28:
                KProperty[] kPropertyArr16 = CryptoSortingPickerScreen.S;
                return new LargeActionButtonDelegate();
            default:
                return new ListSubheaderDelegate();
        }
    }
}
