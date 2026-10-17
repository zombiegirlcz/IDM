package e4i;

import aw0.o9;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.AssetClauseType;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import e1d.h;
import eul.d;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c {
    public static AssetClause a(Amount amount, h fiatFormat, Function1 commodityFormat, Function1 cryptoFormat, h securityFormat, o9 o9Var, int i) {
        AssetClauseType money;
        AssetClauseType commodity;
        if ((i & 1) != 0) {
            fiatFormat = new h(20);
        }
        if ((i & 2) != 0) {
            commodityFormat = new h(21);
        }
        if ((i & 4) != 0) {
            cryptoFormat = new h(22);
        }
        if ((i & 8) != 0) {
            securityFormat = new h(23);
        }
        agl.b undefinedAssetType = new agl.b(amount, 1);
        if ((i & 32) != 0) {
            o9Var = o9.SENSITIVE;
        }
        o9 sensitivity = o9Var;
        Intrinsics.checkNotNullParameter(amount, "<this>");
        Intrinsics.checkNotNullParameter(fiatFormat, "fiatFormat");
        Intrinsics.checkNotNullParameter(commodityFormat, "commodityFormat");
        Intrinsics.checkNotNullParameter(cryptoFormat, "cryptoFormat");
        Intrinsics.checkNotNullParameter(securityFormat, "securityFormat");
        Intrinsics.checkNotNullParameter(undefinedAssetType, "undefinedAssetType");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        int i2 = b.f122563a[amount.f104718b.f104719a.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                commodity = new AssetClauseType.Commodity((MoneyClause.Format) commodityFormat.invoke(amount));
            } else if (i2 == 3) {
                commodity = new AssetClauseType.Crypto((MoneyClause.Format) cryptoFormat.invoke(amount));
            } else {
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    undefinedAssetType.invoke(amount);
                    throw null;
                }
                commodity = new AssetClauseType.Stock((NumberClause.Format) securityFormat.invoke(amount));
            }
            money = commodity;
        } else {
            money = new AssetClauseType.Money((MoneyClause.Format) fiatFormat.invoke(amount));
        }
        return new AssetClause(amount.f104717a, money, amount.f104718b.f104720b, null, sensitivity, 8);
    }

    public static AssetClause b(Amount amount, d dVar, d dVar2, o9 o9Var, int i) {
        h fiatFormat = new h(24);
        Function1 hVar = dVar;
        if ((i & 2) != 0) {
            hVar = new h(25);
        }
        Function1 commodityFormat = hVar;
        Function1 hVar2 = dVar2;
        if ((i & 4) != 0) {
            hVar2 = new h(26);
        }
        Function1 cryptoFormat = hVar2;
        h securityFormat = new h(27);
        if ((i & 16) != 0) {
            o9Var = o9.SENSITIVE;
        }
        o9 sensitivity = o9Var;
        Intrinsics.checkNotNullParameter(amount, "<this>");
        Intrinsics.checkNotNullParameter(fiatFormat, "fiatFormat");
        Intrinsics.checkNotNullParameter(commodityFormat, "commodityFormat");
        Intrinsics.checkNotNullParameter(cryptoFormat, "cryptoFormat");
        Intrinsics.checkNotNullParameter(securityFormat, "securityFormat");
        Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
        try {
            return a(amount, fiatFormat, commodityFormat, cryptoFormat, securityFormat, sensitivity, 16);
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            return null;
        }
    }
}
