package gv5;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto_investments.api.R$string;
import com.revolut.feature.crypto_investments.api.widget.split.SplitAccountsWidgetContract$AssetModelExtension;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t70.b f147067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f147068b;

    public j(t70.b currencyLocalization, wt5.a cryptoInvestmentsCalculations) {
        Intrinsics.checkNotNullParameter(currencyLocalization, "currencyLocalization");
        Intrinsics.checkNotNullParameter(cryptoInvestmentsCalculations, "cryptoInvestmentsCalculations");
        this.f147067a = currencyLocalization;
        this.f147068b = BigDecimal.valueOf(100L);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup.RowItem b(rt5.d r23, com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage r24, com.revolut.core.ui_kit.models.TextLocalisedClause r25, java.math.BigDecimal r26, boolean r27, rt5.g r28, gv5.h r29, boolean r30, com.revolut.feature.crypto_investments.api.widget.split.SplitAccountsWidgetContract$AssetModelExtension.SplitAccountParcel r31) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gv5.j.b(rt5.d, com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage, com.revolut.core.ui_kit.models.TextLocalisedClause, java.math.BigDecimal, boolean, rt5.g, gv5.h, boolean, com.revolut.feature.crypto_investments.api.widget.split.SplitAccountsWidgetContract$AssetModelExtension$SplitAccountParcel):com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup$RowItem");
    }

    public final rt5.i a(rt5.f balances, rt5.b bVar, rt5.g gVar, h earnState, boolean z, SplitAccountsWidgetContract$AssetModelExtension.SplitAccountParcel splitAccountParcel) {
        BigDecimal bigDecimal;
        Intrinsics.checkNotNullParameter(balances, "balances");
        Intrinsics.checkNotNullParameter(earnState, "earnState");
        SplitAccountsItemGroup.RowItem rowItemB = null;
        if (bVar == null || gVar == null) {
            bigDecimal = null;
        } else {
            BigDecimal bigDecimalB = wt5.a.b(new ej0.b(gVar.f257198c, gVar.f257197b), bVar.f257189b);
            BigDecimal BIG_DECIMAL_ONE_HUNDRED = this.f147068b;
            Intrinsics.checkNotNullExpressionValue(BIG_DECIMAL_ONE_HUNDRED, "BIG_DECIMAL_ONE_HUNDRED");
            BigDecimal bigDecimalMultiply = bigDecimalB.multiply(BIG_DECIMAL_ONE_HUNDRED);
            Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
            bigDecimal = bigDecimalMultiply;
        }
        String strA = this.f147067a.a(balances.f257193a.f115083b);
        if (strA == null) {
            m70.a.c(t0.f186434a);
            strA = "";
        }
        String str = strA;
        SplitAccountsItemGroup.RowItem rowItemB2 = b(balances.d, null, new TextLocalisedClause(R$string.currency_name, u.c(str), null, 12), bigDecimal, true, gVar, earnState, z, splitAccountParcel);
        rt5.d dVar = balances.e;
        if (dVar != null) {
            if (dVar.f257191b.k()) {
                dVar = null;
            }
            if (dVar != null) {
                rowItemB = b(dVar, LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_cash_blocked, R$attr.uikit_colorWhite, R$attr.uikit_colorOrange), new TextLocalisedClause(R$string.commodities_blockingPocket_title, u.c(str), null, 12), bigDecimal, false, gVar, earnState, z, splitAccountParcel);
            }
        }
        return new rt5.i(rowItemB2, rowItemB, bigDecimal, str, balances.f257193a, balances.f257194b);
    }
}
