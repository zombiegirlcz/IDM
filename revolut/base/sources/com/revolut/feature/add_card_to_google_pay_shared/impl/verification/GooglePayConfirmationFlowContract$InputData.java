package com.revolut.feature.add_card_to_google_pay_shared.impl.verification;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jg1.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "OtpVerification", "Confirmation", "RevivalConfirmation", "Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$InputData$Confirmation;", "Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$InputData$OtpVerification;", "Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$InputData$RevivalConfirmation;", "feature_add_card_to_google_pay_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class GooglePayConfirmationFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$InputData$Confirmation;", "Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_add_card_to_google_pay_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation extends GooglePayConfirmationFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f60876b;

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
            this.f60875a = cardInfoEncodedBase64;
            this.f60876b = z;
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
            return Intrinsics.f(this.f60875a, confirmation.f60875a) && this.f60876b == confirmation.f60876b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f60876b) + (this.f60875a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60875a);
            dest.writeInt(this.f60876b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$InputData$OtpVerification;", "Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_add_card_to_google_pay_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OtpVerification extends GooglePayConfirmationFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<OtpVerification> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f60877a;

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
            this.f60877a = cardOtpList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OtpVerification) && Intrinsics.f(this.f60877a, ((OtpVerification) obj2).f60877a);
        }

        public final int hashCode() {
            return this.f60877a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f60877a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$InputData$RevivalConfirmation;", "Lcom/revolut/feature/add_card_to_google_pay_shared/impl/verification/GooglePayConfirmationFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_add_card_to_google_pay_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevivalConfirmation extends GooglePayConfirmationFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<RevivalConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60878a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f60879b;

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
            this.f60878a = tokenUniqueReference;
            this.f60879b = walletType;
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
            return Intrinsics.f(this.f60878a, revivalConfirmation.f60878a) && this.f60879b == revivalConfirmation.f60879b;
        }

        public final int hashCode() {
            return this.f60879b.hashCode() + (this.f60878a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60878a);
            dest.writeString(this.f60879b.name());
        }
    }

    private GooglePayConfirmationFlowContract$InputData() {
    }
}
