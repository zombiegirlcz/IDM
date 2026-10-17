package com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donationbreakdown.DonationBreakdownContract$InputData;
import com.revolut.feature.full_screen_prompt.PromptMarketingScreenContract$InputData;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/donations/impl/ui/kompot/screen/one_time_donation/OneTimeDonationScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "PocketPicker", "AcceptTerms", "Breakdown", "Lcom/revolut/feature/donations/impl/ui/kompot/screen/one_time_donation/OneTimeDonationScreenContract$ModalStep$AcceptTerms;", "Lcom/revolut/feature/donations/impl/ui/kompot/screen/one_time_donation/OneTimeDonationScreenContract$ModalStep$Breakdown;", "Lcom/revolut/feature/donations/impl/ui/kompot/screen/one_time_donation/OneTimeDonationScreenContract$ModalStep$PocketPicker;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface OneTimeDonationScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/screen/one_time_donation/OneTimeDonationScreenContract$ModalStep$AcceptTerms;", "Lcom/revolut/feature/donations/impl/ui/kompot/screen/one_time_donation/OneTimeDonationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AcceptTerms implements OneTimeDonationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AcceptTerms> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PromptMarketingScreenContract$InputData f72084a;

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
            this.f72084a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AcceptTerms) && Intrinsics.f(this.f72084a, ((AcceptTerms) obj2).f72084a);
        }

        public final int hashCode() {
            return this.f72084a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f72084a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/screen/one_time_donation/OneTimeDonationScreenContract$ModalStep$Breakdown;", "Lcom/revolut/feature/donations/impl/ui/kompot/screen/one_time_donation/OneTimeDonationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Breakdown implements OneTimeDonationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Breakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DonationBreakdownContract$InputData f72085a;

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
            this.f72085a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Breakdown) && Intrinsics.f(this.f72085a, ((Breakdown) obj2).f72085a);
        }

        public final int hashCode() {
            return this.f72085a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f72085a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/screen/one_time_donation/OneTimeDonationScreenContract$ModalStep$PocketPicker;", "Lcom/revolut/feature/donations/impl/ui/kompot/screen/one_time_donation/OneTimeDonationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PocketPicker implements OneTimeDonationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PocketPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f72086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PaymentMethod.Pocket f72087b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PocketPicker((b) parcel.readSerializable(), (PaymentMethod.Pocket) parcel.readParcelable(PocketPicker.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PocketPicker[i];
            }
        }

        public PocketPicker(b bVar, PaymentMethod.Pocket pocket) {
            this.f72086a = bVar;
            this.f72087b = pocket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PocketPicker)) {
                return false;
            }
            PocketPicker pocketPicker = (PocketPicker) obj2;
            return Intrinsics.f(this.f72086a, pocketPicker.f72086a) && Intrinsics.f(this.f72087b, pocketPicker.f72087b);
        }

        public final int hashCode() {
            b bVar = this.f72086a;
            int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            PaymentMethod.Pocket pocket = this.f72087b;
            return iHashCode + (pocket != null ? pocket.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f72086a);
            dest.writeParcelable(this.f72087b, i);
        }
    }
}
