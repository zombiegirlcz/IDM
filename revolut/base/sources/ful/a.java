package ful;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.retail.wealth.resources.R$plurals;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import cul.b0;
import cul.c0;
import cul.v;
import d9.e1;
import ft4.w;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jmrtd.lds.LDSFile;
import xul.m;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138278a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f138279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f138280c;

    public /* synthetic */ a(v vVar, c cVar) {
        this.f138280c = vVar;
        this.f138279b = cVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Clause textLocalisedClause;
        switch (this.f138278a) {
            case 0:
                Pair pair = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                c0 c0Var = (c0) pair.f186385a;
                int i = ((Boolean) pair.f186386b).booleanValue() ? R$attr.uikit_colorRed : R$attr.uikit_colorGreyTone50;
                bfl.g gVar = this.f138280c.f109175a;
                Intrinsics.checkNotNullParameter(gVar, "<this>");
                Style custom = (gVar != bfl.g.SELL || c0Var.f109079b == b0.MONEY) ? new Custom(Integer.valueOf(i), false, null, false, null, 254) : new Click(14, Integer.valueOf(i), (Object) null, "CLICK_ID_SECURITY_BALANCE", false);
                Amount amount = c0Var.f109078a;
                int i2 = b.f138283c[c0Var.f109079b.ordinal()];
                if (i2 == 1) {
                    textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_orders_stock_balance_format, u.c(e4i.c.a(amount, null, null, null, null, null, 63)), custom, 8);
                } else if (i2 == 2) {
                    textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_orders_stock_balance_format, u.c(new TextClause(this.f138279b.f138284a.b(amount.f104717a, amount.f104718b), (Style) null, (Integer) null, false, o9.SENSITIVE, (List) null, LDSFile.EF_DG14_TAG)), custom, 8);
                } else if (i2 == 3) {
                    BigDecimal bigDecimal = amount.f104717a;
                    int i3 = R$plurals.wealth_invest_order_edit_balance_security_bond_lots_formatted;
                    Integer numValueOf = Integer.valueOf(e1.E(bigDecimal) ? 1 : 2);
                    String plainString = (bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros()).toPlainString();
                    Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
                    textLocalisedClause = new TextLocalisedQuantityClause(i3, numValueOf, u.c(new TextClause(plainString, (Style) null, (Integer) null, false, o9.SENSITIVE, (List) null, LDSFile.EF_DG14_TAG)), custom, 8);
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i5 = com.revolut.trading.orders.R$plurals.wealth_invest_order_edit_balance_security_structured_note_notes_formatted;
                    BigDecimal bigDecimal2 = amount.f104717a;
                    Integer numValueOf2 = Integer.valueOf((bigDecimal2.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal2.stripTrailingZeros()).setScale(0, RoundingMode.UP).intValue());
                    BigDecimal bigDecimal3 = amount.f104717a;
                    String plainString2 = (bigDecimal3.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal3.stripTrailingZeros()).toPlainString();
                    Intrinsics.checkNotNullExpressionValue(plainString2, "toPlainString(...)");
                    textLocalisedClause = new TextLocalisedQuantityClause(i5, numValueOf2, u.c(new TextClause(plainString2, (Style) null, (Integer) null, false, o9.SENSITIVE, (List) null, LDSFile.EF_DG14_TAG)), custom, 8);
                }
                return textLocalisedClause;
            default:
                Pair pair2 = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                n nVar = (n) pair2.f186385a;
                InstrumentTicker instrumentTicker = (InstrumentTicker) pair2.f186386b;
                int i6 = b.f138282b[instrumentTicker.d.ordinal()];
                c cVar = this.f138279b;
                v vVar = this.f138280c;
                if (i6 != 1) {
                    return m.a(cVar.f138285b, nVar, instrumentTicker, vVar.f109175a, null, null, null, 56);
                }
                bfl.g gVar2 = vVar.f109175a;
                Data data = vVar.K;
                if (data != null) {
                    return (Clause) iii.c.f(data, new w(21), new fq7.j(25), new ccg.b(cVar, nVar, instrumentTicker, gVar2, 1));
                }
                return null;
        }
    }

    public /* synthetic */ a(c cVar, v vVar) {
        this.f138279b = cVar;
        this.f138280c = vVar;
    }
}
