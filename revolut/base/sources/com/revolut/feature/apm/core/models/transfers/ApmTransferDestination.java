package com.revolut.feature.apm.core.models.transfers;

import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/ApmTransferDestination;", "Landroid/os/Parcelable;", "r02/c", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmTransferDestination extends Parcelable {
    String getMethod();

    ApmPaymentMethod s2();
}
