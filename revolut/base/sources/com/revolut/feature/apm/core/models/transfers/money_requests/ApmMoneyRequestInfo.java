package com.revolut.feature.apm.core.models.transfers.money_requests;

import android.os.Parcelable;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/money_requests/ApmMoneyRequestInfo;", "Landroid/os/Parcelable;", "Lcom/revolut/feature/apm/core/models/transfers/money_requests/BizumMoneyRequestInfo;", "Lcom/revolut/feature/apm/core/models/transfers/money_requests/CoralMoneyRequestInfo;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmMoneyRequestInfo extends Parcelable {
    String D2();

    ApmContact U1();
}
