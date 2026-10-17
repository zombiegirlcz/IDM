package com.revolut.feature.payments.messaging.data.api.model;

import android.os.Parcelable;
import dv9.n;
import kotlin.Metadata;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/messaging/data/api/model/ChatItem;", "Landroid/os/Parcelable;", "Lcom/revolut/feature/payments/messaging/data/api/model/GroupChatItem;", "Lcom/revolut/feature/payments/messaging/data/api/model/P2PChatItem;", "feature_payments_messaging_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ChatItem extends Parcelable {
    DateTime getDate();

    String getId();

    n k();
}
