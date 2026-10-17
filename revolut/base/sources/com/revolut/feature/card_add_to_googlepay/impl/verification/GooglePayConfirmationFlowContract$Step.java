package com.revolut.feature.card_add_to_googlepay.impl.verification;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.cards.models.revolutcard.LocationMismatch;
import com.revolut.feature.cards.models.revolutcard.RevolutCardOtp;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "LocationMismatchConfirmation", "SingleOtpVerification", "MultipleOtpVerification", "Confirmation", "RevivalConfirmation", "Lcom/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$Step$Confirmation;", "Lcom/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$Step$LocationMismatchConfirmation;", "Lcom/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$Step$MultipleOtpVerification;", "Lcom/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$Step$RevivalConfirmation;", "Lcom/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$Step$SingleOtpVerification;", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class GooglePayConfirmationFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$Step$Confirmation;", "Lcom/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation extends GooglePayConfirmationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f64480b;

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
            this.f64479a = cardInfoEncodedBase64;
            this.f64480b = z;
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
            return Intrinsics.f(this.f64479a, confirmation.f64479a) && this.f64480b == confirmation.f64480b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f64480b) + (this.f64479a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64479a);
            dest.writeInt(this.f64480b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$Step$LocationMismatchConfirmation;", "Lcom/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LocationMismatchConfirmation extends GooglePayConfirmationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LocationMismatchConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevolutCardOtp f64481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocationMismatch f64482b;

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
            this.f64481a = cardOtp;
            this.f64482b = locationMismatch;
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
            return Intrinsics.f(this.f64481a, locationMismatchConfirmation.f64481a) && Intrinsics.f(this.f64482b, locationMismatchConfirmation.f64482b);
        }

        public final int hashCode() {
            return this.f64482b.hashCode() + (this.f64481a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f64481a, i);
            dest.writeParcelable(this.f64482b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$Step$MultipleOtpVerification;", "Lcom/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MultipleOtpVerification extends GooglePayConfirmationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MultipleOtpVerification> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f64483a;

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
            this.f64483a = cardOtpList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MultipleOtpVerification) && Intrinsics.f(this.f64483a, ((MultipleOtpVerification) obj2).f64483a);
        }

        public final int hashCode() {
            return this.f64483a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f64483a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$Step$RevivalConfirmation;", "Lcom/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevivalConfirmation extends GooglePayConfirmationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RevivalConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final cw2.a f64485b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevivalConfirmation(parcel.readString(), cw2.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevivalConfirmation[i];
            }
        }

        public RevivalConfirmation(String tokenUniqueReference, cw2.a walletType) {
            Intrinsics.checkNotNullParameter(tokenUniqueReference, "tokenUniqueReference");
            Intrinsics.checkNotNullParameter(walletType, "walletType");
            this.f64484a = tokenUniqueReference;
            this.f64485b = walletType;
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
            return Intrinsics.f(this.f64484a, revivalConfirmation.f64484a) && this.f64485b == revivalConfirmation.f64485b;
        }

        public final int hashCode() {
            return this.f64485b.hashCode() + (this.f64484a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64484a);
            dest.writeString(this.f64485b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$Step$SingleOtpVerification;", "Lcom/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SingleOtpVerification extends GooglePayConfirmationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SingleOtpVerification> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevolutCardOtp f64486a;

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
            this.f64486a = cardOtp;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SingleOtpVerification) && Intrinsics.f(this.f64486a, ((SingleOtpVerification) obj2).f64486a);
        }

        public final int hashCode() {
            return this.f64486a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f64486a, i);
        }
    }

    private GooglePayConfirmationFlowContract$Step() {
    }
}
