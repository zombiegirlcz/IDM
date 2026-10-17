package com.revolut.feature.profile.impl.ui.details.address.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/profile/impl/ui/details/address/flow/ProfileAddressFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "AddressStep", "Lcom/revolut/feature/profile/impl/ui/details/address/flow/ProfileAddressFlowContract$Step$AddressStep;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ProfileAddressFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/details/address/flow/ProfileAddressFlowContract$Step$AddressStep;", "Lcom/revolut/feature/profile/impl/ui/details/address/flow/ProfileAddressFlowContract$Step;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddressStep implements ProfileAddressFlowContract$Step, Parcelable {

        @NotNull
        public static final Parcelable.Creator<AddressStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Address f81368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f81369b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddressStep((Address) parcel.readParcelable(AddressStep.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddressStep[i];
            }
        }

        public AddressStep(Address address, boolean z) {
            this.f81368a = address;
            this.f81369b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddressStep)) {
                return false;
            }
            AddressStep addressStep = (AddressStep) obj2;
            return Intrinsics.f(this.f81368a, addressStep.f81368a) && this.f81369b == addressStep.f81369b;
        }

        public final int hashCode() {
            Address address = this.f81368a;
            return Boolean.hashCode(this.f81369b) + ((address == null ? 0 : address.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f81368a, i);
            dest.writeInt(this.f81369b ? 1 : 0);
        }
    }
}
