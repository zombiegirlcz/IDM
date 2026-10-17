package i7j;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.MoneyDetails;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class i {
    public static final OrderQuoteParams a(ExchangeOrderDraft exchangeOrderDraft) {
        BigDecimal ZERO;
        f8l.b bVar;
        f8l.b bVar2;
        xi0.b bVar3;
        xi0.b bVar4;
        f8l.e eVar;
        BigDecimal bigDecimalValueOf;
        Intrinsics.checkNotNullParameter(exchangeOrderDraft, "<this>");
        j jVar = exchangeOrderDraft.f;
        double d = exchangeOrderDraft.k;
        wd6.h hVar = exchangeOrderDraft.e;
        MoneyDetails moneyDetails = exchangeOrderDraft.f99885a;
        MoneyDetails moneyDetails2 = exchangeOrderDraft.f99886b;
        int[] iArr = h.f159331a;
        int i = iArr[jVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (moneyDetails2.f99904b != null) {
                ZERO = new BigDecimal(BigInteger.valueOf(moneyDetails2.f99904b.longValue()), moneyDetails2.f99903a.c());
            } else {
                ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            }
        } else if (moneyDetails.f99904b != null) {
            ZERO = new BigDecimal(BigInteger.valueOf(moneyDetails.f99904b.longValue()), moneyDetails.f99903a.c());
        } else {
            ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        }
        BigDecimal bigDecimal = ZERO;
        int i2 = h.f159332b[exchangeOrderDraft.f99887c.ordinal()];
        if (i2 == 1) {
            xi0.b bVar5 = moneyDetails2.f99903a;
            xi0.b bVar6 = moneyDetails.f99903a;
            bVar = f8l.b.TO;
            int i3 = iArr[jVar.ordinal()];
            if (i3 == 1) {
                bVar2 = bVar;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar2 = f8l.b.FROM;
            }
            bVar3 = bVar6;
            bVar4 = bVar5;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            xi0.b bVar7 = moneyDetails.f99903a;
            xi0.b bVar8 = moneyDetails2.f99903a;
            bVar = f8l.b.FROM;
            int i5 = iArr[jVar.ordinal()];
            if (i5 == 1) {
                bVar2 = bVar;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar2 = f8l.b.TO;
            }
            bVar4 = bVar7;
            bVar3 = bVar8;
        }
        f8l.b bVar9 = bVar2;
        f8l.b bVar10 = bVar;
        if (hVar != wd6.h.MARKET && d <= 0.0d) {
            return new OrderQuoteParams(bVar4, bVar3, f8l.e.MARKET, bigDecimal, bVar9, bVar10, null, hVar == wd6.h.RECURRING, null, exchangeOrderDraft.f99899w, null, null, null, null, 15360);
        }
        int[] iArr2 = h.f159333c;
        switch (iArr2[hVar.ordinal()]) {
            case 1:
            case 2:
                eVar = f8l.e.MARKET;
                break;
            case 3:
                eVar = f8l.e.LIMIT;
                break;
            case 4:
                eVar = f8l.e.STOP;
                break;
            case 5:
                throw new IllegalStateException("Take profit cant be selected for commodity exchange");
            case 6:
                throw new IllegalStateException("Stop loss cant be selected for commodity exchange");
            case 7:
                throw new IllegalStateException("Take profit/Stop Loss cant be selected for commodity exchange");
            default:
                throw new NoWhenBranchMatchedException();
        }
        f8l.e eVar2 = eVar;
        switch (iArr2[hVar.ordinal()]) {
            case 1:
            case 2:
                bigDecimalValueOf = null;
                break;
            case 3:
            case 4:
                bigDecimalValueOf = BigDecimal.valueOf(d);
                break;
            case 5:
                throw new IllegalStateException("Take profit  cant be selected for commodity exchange");
            case 6:
                throw new IllegalStateException("Stop loss cant be selected for commodity exchange");
            case 7:
                throw new IllegalStateException("Take profit/Stop Loss cant be selected for commodity exchange");
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new OrderQuoteParams(bVar4, bVar3, eVar2, bigDecimal, bVar9, bVar10, bigDecimalValueOf, hVar == wd6.h.RECURRING, null, exchangeOrderDraft.f99899w, null, null, null, null, 15360);
    }
}
