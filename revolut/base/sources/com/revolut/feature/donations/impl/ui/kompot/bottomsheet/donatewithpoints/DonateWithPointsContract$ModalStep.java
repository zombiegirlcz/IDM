package com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donationbreakdown.DonationBreakdownContract$InputData;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/donations/impl/ui/kompot/bottomsheet/donatewithpoints/DonateWithPointsContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AcceptTerms", "Breakdown", "Lcom/revolut/feature/donations/impl/ui/kompot/bottomsheet/donatewithpoints/DonateWithPointsContract$ModalStep$AcceptTerms;", "Lcom/revolut/feature/donations/impl/ui/kompot/bottomsheet/donatewithpoints/DonateWithPointsContract$ModalStep$Breakdown;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DonateWithPointsContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/bottomsheet/donatewithpoints/DonateWithPointsContract$ModalStep$AcceptTerms;", "Lcom/revolut/feature/donations/impl/ui/kompot/bottomsheet/donatewithpoints/DonateWithPointsContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AcceptTerms implements DonateWithPointsContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AcceptTerms> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PromptMarketingScreenContract$InputData f71997a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AcceptTerms((PromptMarketingScreenContract$InputData) parcel.readParcelable(AcceptTerms.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AcceptTerms[i];
            }
        }

        public AcceptTerms(PromptMarketingScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f71997a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AcceptTerms) && Intrinsics.f(this.f71997a, ((AcceptTerms) obj2).f71997a);
        }

        public final int hashCode() {
            return this.f71997a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f71997a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/bottomsheet/donatewithpoints/DonateWithPointsContract$ModalStep$Breakdown;", "Lcom/revolut/feature/donations/impl/ui/kompot/bottomsheet/donatewithpoints/DonateWithPointsContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Breakdown implements DonateWithPointsContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Breakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DonationBreakdownContract$InputData f71998a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Breakdown(DonationBreakdownContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Breakdown[i];
            }
        }

        public Breakdown(DonationBreakdownContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f71998a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Breakdown) && Intrinsics.f(this.f71998a, ((Breakdown) obj2).f71998a);
        }

        public final int hashCode() {
            return this.f71998a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f71998a.writeToParcel(dest, i);
        }
    }
}
