package a5i;

import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_market_data_api.navigation.Breakdown;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.transaction_price_description.TransactionPriceDescriptionScreenContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements cli.n {

    @NotNull
    private static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionPriceDescriptionScreenContract$InputData f1430a;

    public r(TransactionPriceDescriptionScreenContract$InputData inputData, b assetClauseTypeMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(assetClauseTypeMapper, "assetClauseTypeMapper");
        this.f1430a = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f1419b, new a5g.h(this, 4), new a5g.l(2), new a15.n(this, domainState, 5));
        BigDecimal bigDecimal = domainState.f1418a;
        TransactionPriceDescriptionScreenContract$InputData transactionPriceDescriptionScreenContract$InputData = this.f1430a;
        BigDecimal bigDecimalMultiply = transactionPriceDescriptionScreenContract$InputData.f97177a.f97057b.multiply(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        int i = R$string.wealth_orders_bonds_dialog_price_description_lot_title;
        Breakdown.TransactionPriceDescription transactionPriceDescription = transactionPriceDescriptionScreenContract$InputData.f97177a;
        return new cii.b(null, list, new lw0.a(new TextLocalisedClause(i, u.c(new AssetClause(bigDecimalMultiply, b.a(transactionPriceDescription.f97058c.f104719a), transactionPriceDescription.f97058c.f104720b, null, null, 24)), null, 12), new TextLocalisedClause(R$string.wealth_orders_bonds_dialog_price_description_lot_description, null, null, 14), null, null, false, 28));
    }
}
