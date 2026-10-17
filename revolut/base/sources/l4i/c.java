package l4i;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import com.revolut.shared.feature.market_data.models.domain.models.Charges;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import cp5.d;
import d9.e1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {
    public static y3i.c a(OrderQuote quote) {
        Amount amount;
        Intrinsics.checkNotNullParameter(quote, "quote");
        xi0.a aVar = xi0.b.Companion;
        Amount amount2 = quote.f104754c;
        f8l.b bVar = quote.f104753b;
        f8l.b bVar2 = quote.f104752a;
        Charges charges = quote.f104755g;
        String str = amount2.f104718b.f104720b;
        aVar.getClass();
        xi0.b bVarA = xi0.a.a(str);
        Amount amountX = quote.e;
        Asset asset = amountX.f104718b;
        Asset asset2 = amountX.f104718b;
        xi0.b bVarA2 = xi0.a.a(asset.f104720b);
        if ((d.z(bVarA) && d.A(bVarA2)) || ((!d.A(bVarA) || !d.z(bVarA2)) && bVar == f8l.b.FROM)) {
            bVarA = bVarA2;
        }
        String str2 = bVarA.f306286a;
        ChargeBreakdown chargeBreakdown = charges.f104731a;
        ChargeBreakdown chargeBreakdown2 = charges.f104731a;
        Amount amount3 = chargeBreakdown.f104724c;
        if (amount3 == null || !Intrinsics.f(amount3.f104718b.f104720b, str2)) {
            amount3 = null;
        }
        Amount amount4 = amount3 == null ? chargeBreakdown2.f104722a : amount3;
        if (amount3 == null) {
            amount3 = chargeBreakdown2.f104722a;
            if (!Intrinsics.f(amount3.f104718b.f104720b, str2)) {
                amount3 = null;
            }
        }
        Amount amountI = e1.i(quote, bVar2);
        Amount amount5 = quote.f104754c;
        int i = b.f192141a[bVar.ordinal()];
        if (i == 1) {
            if (bVar2 != f8l.b.FROM) {
                if (amount3 != null && Intrinsics.f(asset2.f104720b, amount3.f104718b.f104720b)) {
                    amountX = a.a.x(amountX, amount3);
                }
                amount = amount5;
            } else if (amount3 != null && Intrinsics.f(amount5.f104718b.f104720b, amount3.f104718b.f104720b)) {
                amountX = a.a.u(amount5, amount3);
            }
            amount = amountX;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (bVar2 == f8l.b.TO) {
                if (amount3 != null && Intrinsics.f(asset2.f104720b, amount3.f104718b.f104720b)) {
                    amountX = a.a.x(amountX, amount3);
                }
                amount = amount5;
            } else if (amount3 != null && Intrinsics.f(amount5.f104718b.f104720b, amount3.f104718b.f104720b)) {
                amountX = a.a.u(amount5, amount3);
            }
            amount = amountX;
        }
        ChargeBreakdown chargeBreakdownA = ChargeBreakdown.a(chargeBreakdown2, amount4, null, null, 14);
        f8l.b assetPointer = e1.J(bVar2);
        Intrinsics.checkNotNullParameter(quote, "<this>");
        Intrinsics.checkNotNullParameter(assetPointer, "assetPointer");
        Amount amountJ = e1.j(quote, assetPointer);
        if (amountJ == null) {
            amountJ = e1.i(quote, assetPointer);
        }
        return new y3i.c(amountI, amount, chargeBreakdownA, amountJ, e1.l(quote), e1.u(quote), bVar2 == bVar ? y3i.b.CRYPTO_FIRST : y3i.b.FEE_FIRST, bVar2 == f8l.b.TO ? y3i.a.COST : y3i.a.CREDIT);
    }
}
