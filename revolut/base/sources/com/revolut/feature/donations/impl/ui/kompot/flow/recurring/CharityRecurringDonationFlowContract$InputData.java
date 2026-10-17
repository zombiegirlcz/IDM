package com.revolut.feature.donations.impl.ui.kompot.flow.recurring;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/donations/impl/ui/kompot/flow/recurring/CharityRecurringDonationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CharityRecurringDonationFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CharityRecurringDonationFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72025a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CharityRecurringDonationFlowContract$InputData(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CharityRecurringDonationFlowContract$InputData[i];
        }
    }

    public CharityRecurringDonationFlowContract$InputData(String charityId) {
        Intrinsics.checkNotNullParameter(charityId, "charityId");
        this.f72025a = charityId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CharityRecurringDonationFlowContract$InputData) && Intrinsics.f(this.f72025a, ((CharityRecurringDonationFlowContract$InputData) obj2).f72025a);
    }

    public final int hashCode() {
        return this.f72025a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72025a);
    }
}
