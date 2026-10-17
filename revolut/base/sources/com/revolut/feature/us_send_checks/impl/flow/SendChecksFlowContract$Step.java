package com.revolut.feature.us_send_checks.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.us_send_checks.api.model.beneficiary.SendChecksBeneficiaryParams;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/us_send_checks/impl/flow/SendChecksFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AddRecipient", "AddressVerificationNeeded", "Lcom/revolut/feature/us_send_checks/impl/flow/SendChecksFlowContract$Step$AddRecipient;", "Lcom/revolut/feature/us_send_checks/impl/flow/SendChecksFlowContract$Step$AddressVerificationNeeded;", "feature_retail_us_send_checks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SendChecksFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/us_send_checks/impl/flow/SendChecksFlowContract$Step$AddRecipient;", "Lcom/revolut/feature/us_send_checks/impl/flow/SendChecksFlowContract$Step;", "<init>", "()V", "feature_retail_us_send_checks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddRecipient extends SendChecksFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddRecipient f94587a = new AddRecipient();

        @NotNull
        public static final Parcelable.Creator<AddRecipient> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddRecipient.f94587a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddRecipient[i];
            }
        }

        private AddRecipient() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/us_send_checks/impl/flow/SendChecksFlowContract$Step$AddressVerificationNeeded;", "Lcom/revolut/feature/us_send_checks/impl/flow/SendChecksFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_us_send_checks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddressVerificationNeeded extends SendChecksFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AddressVerificationNeeded> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SendChecksBeneficiaryParams f94588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final co3.a f94589b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddressVerificationNeeded((SendChecksBeneficiaryParams) parcel.readParcelable(AddressVerificationNeeded.class.getClassLoader()), (co3.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressVerificationNeeded[i];
            }
        }

        public AddressVerificationNeeded(SendChecksBeneficiaryParams beneficiaryParams, co3.a aVar) {
            Intrinsics.checkNotNullParameter(beneficiaryParams, "beneficiaryParams");
            this.f94588a = beneficiaryParams;
            this.f94589b = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddressVerificationNeeded)) {
                return false;
            }
            AddressVerificationNeeded addressVerificationNeeded = (AddressVerificationNeeded) obj2;
            return Intrinsics.f(this.f94588a, addressVerificationNeeded.f94588a) && Intrinsics.f(this.f94589b, addressVerificationNeeded.f94589b);
        }

        public final int hashCode() {
            int iHashCode = this.f94588a.hashCode() * 31;
            co3.a aVar = this.f94589b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f94588a, i);
            dest.writeSerializable(this.f94589b);
        }
    }

    private SendChecksFlowContract$Step() {
    }
}
