package com.revolut.feature.payments.recipients.settings.models;

import android.os.Parcel;
import android.os.Parcelable;
import iy9.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/recipients/settings/models/RecipientsPaymentsSettingsRequest$Recipient", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_recipients_settings_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecipientsPaymentsSettingsRequest$Recipient implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RecipientsPaymentsSettingsRequest$Recipient> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f79680b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecipientsPaymentsSettingsRequest$Recipient(d.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecipientsPaymentsSettingsRequest$Recipient[i];
        }
    }

    public RecipientsPaymentsSettingsRequest$Recipient(d type, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f79679a = id10;
        this.f79680b = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RecipientsPaymentsSettingsRequest$Recipient)) {
            return false;
        }
        RecipientsPaymentsSettingsRequest$Recipient recipientsPaymentsSettingsRequest$Recipient = (RecipientsPaymentsSettingsRequest$Recipient) obj2;
        return Intrinsics.f(this.f79679a, recipientsPaymentsSettingsRequest$Recipient.f79679a) && this.f79680b == recipientsPaymentsSettingsRequest$Recipient.f79680b;
    }

    public final int hashCode() {
        return this.f79680b.hashCode() + (this.f79679a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79679a);
        dest.writeString(this.f79680b.name());
    }
}
