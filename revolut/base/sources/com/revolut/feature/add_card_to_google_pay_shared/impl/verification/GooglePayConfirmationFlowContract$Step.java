package com.revolut.feature.add_card_to_google_pay_shared.impl.verification;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.cards.models.revolutcard.LocationMismatch;
import com.revolut.feature.cards.models.revolutcard.RevolutCardOtp;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jg1.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "LocationMismatchConfirmation", "SingleOtpVerification", "MultipleOtpVerification", "Confirmation", "RevivalConfirmation", "Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$Step$Confirmation;", "Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$Step$LocationMismatchConfirmation;", "Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$Step$MultipleOtpVerification;", "Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$Step$RevivalConfirmation;", "Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$Step$SingleOtpVerification;", "feature_add_card_to_google_pay_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class GooglePayConfirmationFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$Step$Confirmation;", "Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_add_card_to_google_pay_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation extends GooglePayConfirmationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60881a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f60882b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirmation(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        public Confirmation(String cardInfoEncodedBase64, boolean z) {
            Intrinsics.checkNotNullParameter(cardInfoEncodedBase64, "cardInfoEncodedBase64");
            this.f60881a = cardInfoEncodedBase64;
            this.f60882b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Confirmation)) {
                return false;
            }
            Confirmation confirmation = (Confirmation) obj2;
            return Intrinsics.f(this.f60881a, confirmation.f60881a) && this.f60882b == confirmation.f60882b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f60882b) + (this.f60881a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60881a);
            dest.writeInt(this.f60882b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$Step$LocationMismatchConfirmation;", "Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_add_card_to_google_pay_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LocationMismatchConfirmation extends GooglePayConfirmationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LocationMismatchConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevolutCardOtp f60883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocationMismatch f60884b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LocationMismatchConfirmation((RevolutCardOtp) parcel.readParcelable(LocationMismatchConfirmation.class.getClassLoader()), (LocationMismatch) parcel.readParcelable(LocationMismatchConfirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LocationMismatchConfirmation[i];
            }
        }

        public LocationMismatchConfirmation(RevolutCardOtp cardOtp, LocationMismatch locationMismatch) {
            Intrinsics.checkNotNullParameter(cardOtp, "cardOtp");
            Intrinsics.checkNotNullParameter(locationMismatch, "locationMismatch");
            this.f60883a = cardOtp;
            this.f60884b = locationMismatch;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LocationMismatchConfirmation)) {
                return false;
            }
            LocationMismatchConfirmation locationMismatchConfirmation = (LocationMismatchConfirmation) obj2;
            return Intrinsics.f(this.f60883a, locationMismatchConfirmation.f60883a) && Intrinsics.f(this.f60884b, locationMismatchConfirmation.f60884b);
        }

        public final int hashCode() {
            return this.f60884b.hashCode() + (this.f60883a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f60883a, i);
            dest.writeParcelable(this.f60884b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$Step$MultipleOtpVerification;", "Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_add_card_to_google_pay_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MultipleOtpVerification extends GooglePayConfirmationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MultipleOtpVerification> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f60885a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(MultipleOtpVerification.class, parcel, arrayList, iE, 1);
                }
                return new MultipleOtpVerification(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MultipleOtpVerification[i];
            }
        }

        public MultipleOtpVerification(List cardOtpList) {
            Intrinsics.checkNotNullParameter(cardOtpList, "cardOtpList");
            this.f60885a = cardOtpList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MultipleOtpVerification) && Intrinsics.f(this.f60885a, ((MultipleOtpVerification) obj2).f60885a);
        }

        public final int hashCode() {
            return this.f60885a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f60885a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$Step$RevivalConfirmation;", "Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_add_card_to_google_pay_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevivalConfirmation extends GooglePayConfirmationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RevivalConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f60887b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevivalConfirmation(parcel.readString(), g.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevivalConfirmation[i];
            }
        }

        public RevivalConfirmation(String tokenUniqueReference, g walletType) {
            Intrinsics.checkNotNullParameter(tokenUniqueReference, "tokenUniqueReference");
            Intrinsics.checkNotNullParameter(walletType, "walletType");
            this.f60886a = tokenUniqueReference;
            this.f60887b = walletType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RevivalConfirmation)) {
                return false;
            }
            RevivalConfirmation revivalConfirmation = (RevivalConfirmation) obj2;
            return Intrinsics.f(this.f60886a, revivalConfirmation.f60886a) && this.f60887b == revivalConfirmation.f60887b;
        }

        public final int hashCode() {
            return this.f60887b.hashCode() + (this.f60886a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60886a);
            dest.writeString(this.f60887b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$Step$SingleOtpVerification;", "Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_add_card_to_google_pay_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SingleOtpVerification extends GooglePayConfirmationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SingleOtpVerification> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevolutCardOtp f60888a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SingleOtpVerification((RevolutCardOtp) parcel.readParcelable(SingleOtpVerification.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SingleOtpVerification[i];
            }
        }

        public SingleOtpVerification(RevolutCardOtp cardOtp) {
            Intrinsics.checkNotNullParameter(cardOtp, "cardOtp");
            this.f60888a = cardOtp;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SingleOtpVerification) && Intrinsics.f(this.f60888a, ((SingleOtpVerification) obj2).f60888a);
        }

        public final int hashCode() {
            return this.f60888a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f60888a, i);
        }
    }

    private GooglePayConfirmationFlowContract$Step() {
    }
}
