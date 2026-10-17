package csl;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.time.ZonedDateTime;
import k4l.r0;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class n implements k, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f108545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jul.o f108546b;

    public n(jul.o decimalFormat, g tradingOrderDialogHelper) {
        Intrinsics.checkNotNullParameter(decimalFormat, "decimalFormat");
        Intrinsics.checkNotNullParameter(tradingOrderDialogHelper, "tradingOrderDialogHelper");
        this.f108545a = tradingOrderDialogHelper;
        this.f108546b = decimalFormat;
    }

    public static LargeActionButtonDelegate.Model c() {
        l.Companion.getClass();
        return new LargeActionButtonDelegate.Model("EXPANDABLE_DIALOG_LARGE_BUTTON_GOT_IT", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
    }

    public static y d(t tVar) {
        return new y(u.c(esl.a.a(c(), 0, 0, 15)), tVar, null, null, null, null, 1020);
    }

    public static MoneyClause e(dj0.d dVar) {
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, o9.NON_SENSITIVE, 4);
    }

    @Override // csl.e
    public final t a(hel.b tradingContext, TradingAccount tradingAccount) {
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        return this.f108545a.a(tradingContext, tradingAccount);
    }

    @Override // csl.e
    public final t b(ZonedDateTime expirationDate, r0 tradingOrderType) {
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(tradingOrderType, "tradingOrderType");
        return this.f108545a.b(expirationDate, tradingOrderType);
    }
}
