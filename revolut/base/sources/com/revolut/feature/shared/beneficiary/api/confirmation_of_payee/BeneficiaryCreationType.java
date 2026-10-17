package com.revolut.feature.shared.beneficiary.api.confirmation_of_payee;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shared/beneficiary/api/confirmation_of_payee/BeneficiaryCreationType;", "Landroid/os/Parcelable;", "Personal", "Business", "Lcom/revolut/feature/shared/beneficiary/api/confirmation_of_payee/BeneficiaryCreationType$Business;", "Lcom/revolut/feature/shared/beneficiary/api/confirmation_of_payee/BeneficiaryCreationType$Personal;", "feature_shared_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BeneficiaryCreationType extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/beneficiary/api/confirmation_of_payee/BeneficiaryCreationType$Business;", "Lcom/revolut/feature/shared/beneficiary/api/confirmation_of_payee/BeneficiaryCreationType;", "", "toString", "()Ljava/lang/String;", "feature_shared_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Business implements BeneficiaryCreationType {

        @NotNull
        public static final Parcelable.Creator<Business> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86041a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Business(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Business[i];
            }
        }

        public Business(String companyName) {
            Intrinsics.checkNotNullParameter(companyName, "companyName");
            this.f86041a = companyName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Business) && Intrinsics.f(this.f86041a, ((Business) obj2).f86041a);
        }

        public final int hashCode() {
            return this.f86041a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86041a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/beneficiary/api/confirmation_of_payee/BeneficiaryCreationType$Personal;", "Lcom/revolut/feature/shared/beneficiary/api/confirmation_of_payee/BeneficiaryCreationType;", "", "toString", "()Ljava/lang/String;", "feature_shared_beneficiary_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Personal implements BeneficiaryCreationType {

        @NotNull
        public static final Parcelable.Creator<Personal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86043b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Personal(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Personal[i];
            }
        }

        public Personal(String firstName, String lastName) {
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            Intrinsics.checkNotNullParameter(lastName, "lastName");
            this.f86042a = firstName;
            this.f86043b = lastName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Personal)) {
                return false;
            }
            Personal personal = (Personal) obj2;
            return Intrinsics.f(this.f86042a, personal.f86042a) && Intrinsics.f(this.f86043b, personal.f86043b);
        }

        public final int hashCode() {
            return this.f86043b.hashCode() + (this.f86042a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86042a);
            dest.writeString(this.f86043b);
        }
    }
}
