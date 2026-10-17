package com.revolut.feature.card_add_to_googlepay.impl.verification;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "OtpVerification", "Confirmation", "RevivalConfirmation", "Lcom/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$InputData$Confirmation;", "Lcom/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$InputData$OtpVerification;", "Lcom/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$InputData$RevivalConfirmation;", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class GooglePayConfirmationFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$InputData$Confirmation;", "Lcom/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation extends GooglePayConfirmationFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f64474b;

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
            this.f64473a = cardInfoEncodedBase64;
            this.f64474b = z;
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
            return Intrinsics.f(this.f64473a, confirmation.f64473a) && this.f64474b == confirmation.f64474b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f64474b) + (this.f64473a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64473a);
            dest.writeInt(this.f64474b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$InputData$OtpVerification;", "Lcom/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OtpVerification extends GooglePayConfirmationFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<OtpVerification> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f64475a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(OtpVerification.class, parcel, arrayList, iE, 1);
                }
                return new OtpVerification(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OtpVerification[i];
            }
        }

        public OtpVerification(List cardOtpList) {
            Intrinsics.checkNotNullParameter(cardOtpList, "cardOtpList");
            this.f64475a = cardOtpList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OtpVerification) && Intrinsics.f(this.f64475a, ((OtpVerification) obj2).f64475a);
        }

        public final int hashCode() {
            return this.f64475a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f64475a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$InputData$RevivalConfirmation;", "Lcom/revolut/feature/card_add_to_googlepay/impl/verification/GooglePayConfirmationFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevivalConfirmation extends GooglePayConfirmationFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<RevivalConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final cw2.a f64477b;

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
            this.f64476a = tokenUniqueReference;
            this.f64477b = walletType;
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
            return Intrinsics.f(this.f64476a, revivalConfirmation.f64476a) && this.f64477b == revivalConfirmation.f64477b;
        }

        public final int hashCode() {
            return this.f64477b.hashCode() + (this.f64476a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64476a);
            dest.writeString(this.f64477b.name());
        }
    }

    private GooglePayConfirmationFlowContract$InputData() {
    }
}
