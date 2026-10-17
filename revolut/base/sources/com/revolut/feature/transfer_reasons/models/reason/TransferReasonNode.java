package com.revolut.feature.transfer_reasons.models.reason;

import android.os.Parcelable;
import java.io.Serializable;
import kotlin.Metadata;
import ttf.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u00012\u00020\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transfer_reasons/models/reason/TransferReasonNode;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "Lcom/revolut/feature/transfer_reasons/models/reason/TransferReason;", "Lcom/revolut/feature/transfer_reasons/models/reason/TransferReasonCategory;", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TransferReasonNode extends Parcelable, Serializable {
    String getId();

    String getLabel();

    c getType();
}
