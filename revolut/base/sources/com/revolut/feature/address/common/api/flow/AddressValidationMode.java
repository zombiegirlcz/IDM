package com.revolut.feature.address.common.api.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.AddressVerificationUseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/address/common/api/flow/AddressValidationMode;", "Landroid/os/Parcelable;", "<init>", "()V", "Validation", "Verification", "Lcom/revolut/feature/address/common/api/flow/AddressValidationMode$Validation;", "Lcom/revolut/feature/address/common/api/flow/AddressValidationMode$Verification;", "feature_address_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AddressValidationMode implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/address/common/api/flow/AddressValidationMode$Validation;", "Lcom/revolut/feature/address/common/api/flow/AddressValidationMode;", "<init>", "()V", "feature_address_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Validation extends AddressValidationMode {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Validation f60951a = new Validation();

        @NotNull
        public static final Parcelable.Creator<Validation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Validation.f60951a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Validation[i];
            }
        }

        private Validation() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/address/common/api/flow/AddressValidationMode$Verification;", "Lcom/revolut/feature/address/common/api/flow/AddressValidationMode;", "", "toString", "()Ljava/lang/String;", "feature_address_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Verification extends AddressValidationMode {

        @NotNull
        public static final Parcelable.Creator<Verification> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AddressVerificationUseCase f60952a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Verification(AddressVerificationUseCase.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Verification[i];
            }
        }

        public Verification(AddressVerificationUseCase useCase) {
            Intrinsics.checkNotNullParameter(useCase, "useCase");
            this.f60952a = useCase;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Verification) && this.f60952a == ((Verification) obj2).f60952a;
        }

        public final int hashCode() {
            return this.f60952a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60952a.name());
        }
    }

    private AddressValidationMode() {
    }
}
