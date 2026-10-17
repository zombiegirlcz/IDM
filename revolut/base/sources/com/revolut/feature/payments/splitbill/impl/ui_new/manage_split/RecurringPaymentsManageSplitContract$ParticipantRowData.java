package com.revolut.feature.payments.splitbill.impl.ui_new.manage_split;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/splitbill/impl/ui_new/manage_split/RecurringPaymentsManageSplitContract$ParticipantRowData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecurringPaymentsManageSplitContract$ParticipantRowData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RecurringPaymentsManageSplitContract$ParticipantRowData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f79885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79886b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecurringPaymentsManageSplitContract$ParticipantRowData((zm3.a) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecurringPaymentsManageSplitContract$ParticipantRowData[i];
        }
    }

    public RecurringPaymentsManageSplitContract$ParticipantRowData(zm3.a contact, String participantId) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(participantId, "participantId");
        this.f79885a = contact;
        this.f79886b = participantId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RecurringPaymentsManageSplitContract$ParticipantRowData)) {
            return false;
        }
        RecurringPaymentsManageSplitContract$ParticipantRowData recurringPaymentsManageSplitContract$ParticipantRowData = (RecurringPaymentsManageSplitContract$ParticipantRowData) obj2;
        return Intrinsics.f(this.f79885a, recurringPaymentsManageSplitContract$ParticipantRowData.f79885a) && Intrinsics.f(this.f79886b, recurringPaymentsManageSplitContract$ParticipantRowData.f79886b);
    }

    public final int hashCode() {
        return this.f79886b.hashCode() + (this.f79885a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f79885a);
        dest.writeString(this.f79886b);
    }
}
