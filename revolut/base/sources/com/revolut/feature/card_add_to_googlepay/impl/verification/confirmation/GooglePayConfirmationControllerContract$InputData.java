package com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/card_add_to_googlepay/impl/verification/confirmation/GooglePayConfirmationControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "Confirmation", "RevivalConfirmation", "Lcom/revolut/feature/card_add_to_googlepay/impl/verification/confirmation/GooglePayConfirmationControllerContract$InputData$Confirmation;", "Lcom/revolut/feature/card_add_to_googlepay/impl/verification/confirmation/GooglePayConfirmationControllerContract$InputData$RevivalConfirmation;", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class GooglePayConfirmationControllerContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_add_to_googlepay/impl/verification/confirmation/GooglePayConfirmationControllerContract$InputData$Confirmation;", "Lcom/revolut/feature/card_add_to_googlepay/impl/verification/confirmation/GooglePayConfirmationControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation extends GooglePayConfirmationControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f64489b;

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
            this.f64488a = cardInfoEncodedBase64;
            this.f64489b = z;
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
            return Intrinsics.f(this.f64488a, confirmation.f64488a) && this.f64489b == confirmation.f64489b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f64489b) + (this.f64488a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64488a);
            dest.writeInt(this.f64489b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_add_to_googlepay/impl/verification/confirmation/GooglePayConfirmationControllerContract$InputData$RevivalConfirmation;", "Lcom/revolut/feature/card_add_to_googlepay/impl/verification/confirmation/GooglePayConfirmationControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_card_add_to_googlepay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevivalConfirmation extends GooglePayConfirmationControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<RevivalConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final cw2.a f64491b;

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
            this.f64490a = tokenUniqueReference;
            this.f64491b = walletType;
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
            return Intrinsics.f(this.f64490a, revivalConfirmation.f64490a) && this.f64491b == revivalConfirmation.f64491b;
        }

        public final int hashCode() {
            return this.f64491b.hashCode() + (this.f64490a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64490a);
            dest.writeString(this.f64491b.name());
        }
    }

    private GooglePayConfirmationControllerContract$InputData() {
    }
}
