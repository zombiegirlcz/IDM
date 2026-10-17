package r1e;

import android.util.SparseIntArray;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.stock_widget.impl.R$string;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.math.BigDecimal;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import p01.a0;
import p01.j;
import p01.v;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f250981b;

    public /* synthetic */ c(f fVar, int i) {
        this.f250980a = i;
        this.f250981b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int iA;
        int i;
        int i2 = this.f250980a;
        f fVar = this.f250981b;
        switch (i2) {
            case 0:
                i optionalGiaAccount = (i) obj2;
                Intrinsics.checkNotNullParameter(optionalGiaAccount, "optionalGiaAccount");
                TradingAccount tradingAccount = (TradingAccount) optionalGiaAccount.f224257a;
                if (tradingAccount != null) {
                    int i3 = 1;
                    if (com.revolut.shared.feature.wealth.models.trading_accounts.d.e(tradingAccount)) {
                        return nim.a.v(fVar.a((TradingAccount) optionalGiaAccount.c(), false), new c(fVar, i3));
                    }
                }
                return nim.a.v(fVar.f250985b.b(), new r10.b(fVar, optionalGiaAccount, 16));
            default:
                del.b balance = (del.b) obj2;
                Intrinsics.checkNotNullParameter(balance, "balance");
                if (mif.a.Q(balance.f113710c).f115082a < 0) {
                    SparseIntArray sparseIntArray = vw0.a.f292608a;
                    iA = vw0.a.a(R$drawable.uikit_icn_10_stocks_arrow_down);
                    i = R$attr.uikit_colorPerformanceNegative;
                } else {
                    SparseIntArray sparseIntArray2 = vw0.a.f292608a;
                    iA = vw0.a.a(R$drawable.uikit_icn_10_stocks_arrow_up);
                    i = R$attr.uikit_colorPerformancePositive;
                }
                MoneyClause moneyClause = new MoneyClause(mif.a.Q(balance.f113708a), new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12);
                BigDecimal bigDecimal = balance.d;
                tfl.a aVar = fVar.e;
                if (bigDecimal == null) {
                    bigDecimal = BigDecimal.ZERO;
                }
                BigDecimal bigDecimal2 = bigDecimal;
                Intrinsics.h(bigDecimal2);
                return new j(new a0(new TextLocalisedClause(R$string.stock_widget_product_name, null, null, 14), fVar.f, moneyClause, new v(iA, sfl.a.a(aVar, bigDecimal2, true, null, null, 12), new Color.Solid(i)), true), null, new k01.c(fVar.f250986c.a()));
        }
    }
}
