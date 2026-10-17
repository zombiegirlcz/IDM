package com.revolut.feature.wealth.api.domain.model.transactions;

import android.os.Parcelable;
import dfl.i0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/wealth/api/domain/model/transactions/InvestTransaction;", "Landroid/os/Parcelable;", "feature_wealth_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvestTransaction extends Parcelable {
    i0 V1();

    default String getId() {
        return V1().getId();
    }

    InvestTransactionMetadata getMetadata();
}
