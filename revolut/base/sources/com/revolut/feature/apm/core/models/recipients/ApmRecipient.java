package com.revolut.feature.apm.core.models.recipients;

import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/ApmRecipient;", "Landroid/os/Parcelable;", "Lcom/revolut/feature/apm/core/models/recipients/ApmBeneficiary;", "Lcom/revolut/feature/apm/core/models/recipients/ApmContact;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ApmRecipient extends Parcelable {
    boolean E3();

    String G0();

    default ApmRecipientSettings V() {
        return null;
    }

    boolean g8(String str);

    String getDisplayName();

    ApmIdentifier getId();

    String x0();
}
