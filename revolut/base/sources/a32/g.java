package a32;

import a4l.a;
import a4l.b;
import a8g.c0;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.MapPlainDelegate;
import com.revolut.core.ui_kit.delegates.MapPlainLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SplitColumnCellDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.authorisation.confirmation.PendingPaymentConfirmationScreen;
import com.revolut.feature.apm.multibanco.impl.ui.home.area.MultibancoHomeAreaScreen;
import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.list.WithdrawalCodeListScreen;
import com.revolut.feature.card_screen.impl.kompot.cards_list.screen.CardListScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.screen.country.BirthCountryScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.card_additional_value.CobrandedCardsAdditionalValueScreen;
import com.revolut.feature.subaccount.impl.ui.currency.SelectCurrencyOptionScreen;
import java.io.File;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.Charsets;
import qlm.v1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1025a;

    public /* synthetic */ g(int i) {
        this.f1025a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f1025a) {
            case 0:
                KProperty[] kPropertyArr = PendingPaymentConfirmationScreen.S;
                return new FullScreenStateDelegate();
            case 1:
                return lim.m.f(new File("/proc/cpuinfo"), Charsets.UTF_8);
            case 2:
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                return locale;
            case 3:
                TimeZone timeZone = TimeZone.getDefault();
                Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault(...)");
                return timeZone;
            case 4:
                b.C0004b c0004b = a4l.b.Companion;
                return new qlm.e(a.C0003a.f1291a);
            case 5:
                KProperty[] kPropertyArr2 = BirthCountryScreen.f67181b0;
                return new InputTextDelegate(null);
            case 6:
                KProperty[] kPropertyArr3 = CobrandedCardsAdditionalValueScreen.T;
                return new ListSubheaderDelegate();
            case 7:
                KProperty[] kPropertyArr4 = CobrandedCardsAdditionalValueScreen.T;
                return new SplitColumnCellDelegate();
            case 8:
                KProperty[] kPropertyArr5 = CobrandedCardsAdditionalValueScreen.T;
                return new FullScreenStateDelegate();
            case 9:
                KProperty[] kPropertyArr6 = MultibancoHomeAreaScreen.U;
                return new ListSubheaderDelegate();
            case 10:
                CardListScreen.Companion aVar = CardListScreen.INSTANCE;
                return new RowDelegate(null, null, 7);
            case 11:
                CardListScreen.Companion aVar2 = CardListScreen.INSTANCE;
                return new FullScreenStateDelegate();
            case 12:
                CardListScreen.Companion aVar3 = CardListScreen.INSTANCE;
                return new PlainTextDelegate();
            case 13:
                CardListScreen.Companion aVar4 = CardListScreen.INSTANCE;
                return new LargeActionButtonDelegate();
            case 14:
                CardListScreen.Companion aVar5 = CardListScreen.INSTANCE;
                return new CellDetailsDelegate();
            case 15:
                CardListScreen.Companion aVar6 = CardListScreen.INSTANCE;
                return new TextDelegate();
            case 16:
                CardListScreen.Companion aVar7 = CardListScreen.INSTANCE;
                return new InputDisclosureDelegate();
            case 17:
                CardListScreen.Companion aVar8 = CardListScreen.INSTANCE;
                return new ActionWidgetDelegate();
            case 18:
                CardListScreen.Companion aVar9 = CardListScreen.INSTANCE;
                return new MapPlainDelegate();
            case 19:
                CardListScreen.Companion aVar10 = CardListScreen.INSTANCE;
                return new MapPlainLoadingDelegate();
            case 20:
                KProperty[] kPropertyArr7 = SelectCurrencyOptionScreen.g0;
                return new RowDelegate(null, null, 7);
            case 21:
                return new qlm.e(t7g.a.f268666a);
            case 22:
                return new qlm.e(a8g.d.f2212a);
            case 23:
                return new qlm.e(v1.f247718a);
            case 24:
                return new qlm.e(v1.f247718a);
            case 25:
                return new qlm.e(t7g.d.f268670a);
            case 26:
                c0.b bVar = a8g.c0.Companion;
                return new qlm.e(v1.f247718a);
            case 27:
                return new qlm.e(a8g.a.f2196a);
            case 28:
                return new qlm.e(a8g.g.f2220a);
            default:
                KProperty[] kPropertyArr8 = WithdrawalCodeListScreen.V;
                return new RowDelegate(null, null, 7);
        }
    }
}
