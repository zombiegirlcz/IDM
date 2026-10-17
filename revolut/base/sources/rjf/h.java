package rjf;

import aim.o;
import android.content.Context;
import com.revolut.feature.transactions.api.TransactionApi$Toggles$AmountWithChargesMigration;
import com.revolut.feature.transactions.api.TransactionApi$Toggles$DeletedTransaction;
import com.revolut.feature.transactions.api.TransactionApi$Toggles$DisableOldSherlockSuspiciousTransactionBanner;
import com.revolut.feature.transactions.api.TransactionApi$Toggles$EarlyReversalRedesign;
import com.revolut.feature.transactions.api.TransactionApi$Toggles$TransactionDbTimeoutException;
import com.revolut.feature.transactions.api.navigation.TransactionDetailsAdditionalConfig$HideButtonsLeadingToTransactionsLists;
import com.revolut.feature.transactions.api.navigation.TransactionDetailsDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import zh9.u0;
import zhm.v;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements uri.a, nte.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof TransactionsFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        rhf.d dVar;
        TransactionsFeatureConfig config = (TransactionsFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!(config instanceof TransactionsFeatureConfig.Details)) {
            throw new NoWhenBranchMatchedException();
        }
        TransactionsFeatureConfig.Details details = (TransactionsFeatureConfig.Details) config;
        k71.i iVar = details.f92003a;
        com.revolut.feature.transactions.api.navigation.a aVar = details.f92004b;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        switch (i.f254674a[aVar.ordinal()]) {
            case 1:
                dVar = rhf.d.VAULT_DETAILS;
                break;
            case 2:
                dVar = rhf.d.PAYMENT_GROUP_WIDGET;
                break;
            case 3:
                dVar = rhf.d.PAYMENT_GROUP_DETAILS;
                break;
            case 4:
                dVar = rhf.d.PUSH;
                break;
            case 5:
                dVar = rhf.d.ANALYTICS;
                break;
            case 6:
                dVar = rhf.d.DETAILS_TO_SPARE_CHANGE;
                break;
            case 7:
                dVar = rhf.d.SPARE_CHANGE_TO_DETAILS;
                break;
            case 8:
                dVar = rhf.d.OTHER;
                break;
            case 9:
                dVar = rhf.d.CRYPTO;
                break;
            case 10:
                dVar = rhf.d.PAYMENTS_CHAT;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        o oVar = new o();
        if (details.f92005c) {
            oVar.add(TransactionDetailsAdditionalConfig$HideButtonsLeadingToTransactionsLists.f91987a);
        }
        Unit unit = Unit.f186387a;
        navigator.c(u0.f(new TransactionDetailsDestination(iVar, dVar, y0.a(oVar))));
    }

    @Override // nte.a
    public final List e() {
        return v.k(TransactionApi$Toggles$TransactionDbTimeoutException.f91955c, TransactionApi$Toggles$DisableOldSherlockSuspiciousTransactionBanner.f91953c, TransactionApi$Toggles$DeletedTransaction.f91952c, TransactionApi$Toggles$AmountWithChargesMigration.f91951c, TransactionApi$Toggles$EarlyReversalRedesign.f91954c);
    }
}
