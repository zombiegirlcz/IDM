package s8f;

import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.feature.cash_topup.impl.ui.barcode.CashTopUpBarcodeScreen;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_transactions.CashbackTransactionsScreen;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.change_amount.PixQrCodeChangeAmountScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings.b;
import com.revolut.feature_retail_user_declarations.email.otp_screen.EmailVerificationOtpScreen;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import qlm.j1;
import qlm.v1;
import sdl.f0;
import sdl.l0;
import sdl.m;
import sdl.o;
import sdl.q;
import sdl.r;
import sdl.s;
import sdl.u;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260990a;

    public /* synthetic */ h(int i) {
        this.f260990a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f260990a) {
            case 0:
                b.a aVar = com.revolut.feature.trading.managed_portfolios.impl.ui.top_holdings.b.Companion;
                return new DotDividerClause((Integer) null);
            case 1:
                return new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP));
            case 2:
                return gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, null, 6)));
            case 3:
                return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, null, 6)));
            case 4:
                int i = jli.h.f175850a;
                return Unit.f186387a;
            case 5:
                KProperty[] kPropertyArr = EmailVerificationOtpScreen.T;
                return new CodeEditorDelegate();
            case 6:
                KProperty[] kPropertyArr2 = EmailVerificationOtpScreen.T;
                return new LabelButtonDelegate();
            case 7:
                KProperty[] kPropertyArr3 = EmailVerificationOtpScreen.T;
                return new PlainTextDelegate();
            case 8:
                KProperty[] kPropertyArr4 = CashTopUpBarcodeScreen.V;
                return new LargeActionButtonDelegate();
            case 9:
                KProperty[] kPropertyArr5 = PixQrCodeChangeAmountScreen.T;
                return new LargeActionButtonDelegate();
            case 10:
                KProperty[] kPropertyArr6 = CashbackTransactionsScreen.f65722e0;
                return new ListSubheaderDelegate();
            case 11:
                KProperty[] kPropertyArr7 = CashbackTransactionsScreen.f65722e0;
                return new RowDelegate(null, null, 7);
            case 12:
                KProperty[] kPropertyArr8 = CashbackTransactionsScreen.f65722e0;
                return new SingleChoiceDelegate();
            case 13:
                return sdl.e.Companion.serializer();
            case 14:
                return j1.a("com.revolut.shared.feature.wealth.domain.impl.data.network.trading_accounts.BeneficiaryTypeDto", sdl.e.values(), new String[]{"DEPENDANT", "SELF"}, new Annotation[][]{null, null});
            case 15:
                r.Companion aVar2 = r.INSTANCE;
                p0 p0Var = o0.f186429a;
                return new mlm.f("com.revolut.shared.feature.wealth.domain.impl.data.network.trading_accounts.TradingAccountDto", p0Var.b(r.class), new KClass[]{p0Var.b(r.b.class), p0Var.b(r.c.class), p0Var.b(r.d.class), p0Var.b(r.e.class), p0Var.b(r.f.class), p0Var.b(r.g.class), p0Var.b(r.h.class)}, new KSerializer[]{r.b.a.f262005a, r.c.a.f262014a, r.d.a.f262023a, r.e.a.f262032a, r.f.a.f262041a, r.g.a.f262050a, r.h.a.f262055a}, new Annotation[]{new s()});
            case 16:
                return j1.a("com.revolut.shared.feature.wealth.domain.impl.data.network.trading_accounts.TradingAccountDto.AllowedCashOperations", o.values(), new String[]{"TOPUP_WITHDRAWAL", "WITHDRAWAL_ONLY", "TOPUP_ONLY", "NONE"}, new Annotation[][]{null, null, null, null});
            case 17:
                return j1.a("com.revolut.shared.feature.wealth.domain.impl.data.network.trading_accounts.TradingAccountDto.AllowedTrades", q.values(), new String[]{"BUY_SELL", "SELL_ONLY", "CLOSE_POSITION_ONLY", "NONE"}, new Annotation[][]{null, null, null, null});
            case 18:
                r.b.Companion c1455b = r.b.INSTANCE;
                return j1.a("com.revolut.shared.feature.wealth.domain.impl.data.network.trading_accounts.TradingAccountDto.AccountState", m.values(), new String[]{"CREATED", "ONBOARDING", "ACTIVE", "SUSPENDED", "OFFBOARDING", "TERMINATED"}, new Annotation[][]{null, null, null, null, null, null});
            case 19:
                r.b.Companion c1455b2 = r.b.INSTANCE;
                return l0.Companion.serializer();
            case 20:
                r.b.Companion c1455b3 = r.b.INSTANCE;
                return new qlm.e(f0.f261966a);
            case 21:
                r.b.Companion c1455b4 = r.b.INSTANCE;
                return new qlm.e(u.f262060a);
            case 22:
                r.b.Companion c1455b5 = r.b.INSTANCE;
                return q.Companion.serializer();
            case 23:
                r.b.Companion c1455b6 = r.b.INSTANCE;
                return o.Companion.serializer();
            case 24:
                r.b.Companion c1455b7 = r.b.INSTANCE;
                return new qlm.e(v1.f247718a);
            case 25:
                r.c.Companion bVar = r.c.INSTANCE;
                return j1.a("com.revolut.shared.feature.wealth.domain.impl.data.network.trading_accounts.TradingAccountDto.AccountState", m.values(), new String[]{"CREATED", "ONBOARDING", "ACTIVE", "SUSPENDED", "OFFBOARDING", "TERMINATED"}, new Annotation[][]{null, null, null, null, null, null});
            case 26:
                r.c.Companion bVar2 = r.c.INSTANCE;
                return l0.Companion.serializer();
            case 27:
                r.c.Companion bVar3 = r.c.INSTANCE;
                return new qlm.e(f0.f261966a);
            case 28:
                r.c.Companion bVar4 = r.c.INSTANCE;
                return new qlm.e(u.f262060a);
            default:
                r.c.Companion bVar5 = r.c.INSTANCE;
                return q.Companion.serializer();
        }
    }
}
