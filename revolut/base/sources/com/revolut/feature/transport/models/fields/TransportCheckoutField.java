package com.revolut.feature.transport.models.fields;

import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/transport/models/fields/TransportCheckoutField;", "Landroid/os/Parcelable;", "<init>", "()V", "Lcom/revolut/feature/transport/models/fields/TransportCheckoutAddressField;", "Lcom/revolut/feature/transport/models/fields/TransportCheckoutDateOfBirthField;", "Lcom/revolut/feature/transport/models/fields/TransportCheckoutDatePickerField;", "Lcom/revolut/feature/transport/models/fields/TransportCheckoutDateTimePickerField;", "Lcom/revolut/feature/transport/models/fields/TransportCheckoutDropdownField;", "Lcom/revolut/feature/transport/models/fields/TransportCheckoutTextField;", "feature_transport_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TransportCheckoutField implements Parcelable {
    private TransportCheckoutField() {
    }

    public abstract String a();

    public abstract boolean b();

    public abstract boolean c(String str);

    public abstract String getDescription();

    public abstract String getId();

    public abstract String getLabel();
}
