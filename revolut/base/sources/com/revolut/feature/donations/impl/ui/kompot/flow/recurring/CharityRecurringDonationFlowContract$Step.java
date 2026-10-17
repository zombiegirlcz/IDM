package com.revolut.feature.donations.impl.ui.kompot.flow.recurring;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.DonationSchedule;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/donations/impl/ui/kompot/flow/recurring/CharityRecurringDonationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Schedule", "AmountInput", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/recurring/CharityRecurringDonationFlowContract$Step$AmountInput;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/recurring/CharityRecurringDonationFlowContract$Step$Schedule;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CharityRecurringDonationFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/flow/recurring/CharityRecurringDonationFlowContract$Step$AmountInput;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/recurring/CharityRecurringDonationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AmountInput extends CharityRecurringDonationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AmountInput> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DonationSchedule f72027b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AmountInput(parcel.readString(), DonationSchedule.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AmountInput[i];
            }
        }

        public AmountInput(String charityId, DonationSchedule donationSchedule) {
            Intrinsics.checkNotNullParameter(charityId, "charityId");
            Intrinsics.checkNotNullParameter(donationSchedule, "donationSchedule");
            this.f72026a = charityId;
            this.f72027b = donationSchedule;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AmountInput)) {
                return false;
            }
            AmountInput amountInput = (AmountInput) obj2;
            return Intrinsics.f(this.f72026a, amountInput.f72026a) && Intrinsics.f(this.f72027b, amountInput.f72027b);
        }

        public final int hashCode() {
            return this.f72027b.hashCode() + (this.f72026a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72026a);
            this.f72027b.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/flow/recurring/CharityRecurringDonationFlowContract$Step$Schedule;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/recurring/CharityRecurringDonationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Schedule extends CharityRecurringDonationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Schedule> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72028a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Schedule(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Schedule[i];
            }
        }

        public Schedule(String charityId) {
            Intrinsics.checkNotNullParameter(charityId, "charityId");
            this.f72028a = charityId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Schedule) && Intrinsics.f(this.f72028a, ((Schedule) obj2).f72028a);
        }

        public final int hashCode() {
            return this.f72028a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72028a);
        }
    }

    private CharityRecurringDonationFlowContract$Step() {
    }
}
