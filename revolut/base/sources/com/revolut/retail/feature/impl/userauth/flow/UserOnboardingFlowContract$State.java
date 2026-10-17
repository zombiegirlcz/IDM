package com.revolut.retail.feature.impl.userauth.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"com/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "PhoneData", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserOnboardingFlowContract$State implements FlowState, Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserOnboardingFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PhoneData f101654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Address f101655c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/impl/userauth/flow/UserOnboardingFlowContract$State$PhoneData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PhoneData implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<PhoneData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f101656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f101657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final wi0.b f101658c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PhoneData(((fj0.b) parcel.readSerializable()).f135518a, parcel.readString(), (wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PhoneData[i];
            }
        }

        public PhoneData(int i, String phoneNumber, wi0.b phoneCountryCode) {
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            Intrinsics.checkNotNullParameter(phoneCountryCode, "phoneCountryCode");
            this.f101656a = phoneNumber;
            this.f101657b = i;
            this.f101658c = phoneCountryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PhoneData)) {
                return false;
            }
            PhoneData phoneData = (PhoneData) obj2;
            return Intrinsics.f(this.f101656a, phoneData.f101656a) && this.f101657b == phoneData.f101657b && Intrinsics.f(this.f101658c, phoneData.f101658c);
        }

        public final int hashCode() {
            return this.f101658c.f297794a.hashCode() + j6.a.b(this.f101657b, this.f101656a.hashCode() * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f101656a);
            dest.writeSerializable(new fj0.b(this.f101657b));
            dest.writeSerializable(this.f101658c);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserOnboardingFlowContract$State(parcel.readString(), parcel.readInt() == 0 ? null : PhoneData.CREATOR.createFromParcel(parcel), (Address) parcel.readParcelable(UserOnboardingFlowContract$State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserOnboardingFlowContract$State[i];
        }
    }

    public UserOnboardingFlowContract$State(String str, PhoneData phoneData, Address address) {
        Intrinsics.checkNotNullParameter(address, "address");
        this.f101653a = str;
        this.f101654b = phoneData;
        this.f101655c = address;
    }

    public static UserOnboardingFlowContract$State a(UserOnboardingFlowContract$State userOnboardingFlowContract$State, String str, PhoneData phoneData, Address address, int i) {
        if ((i & 1) != 0) {
            str = userOnboardingFlowContract$State.f101653a;
        }
        if ((i & 2) != 0) {
            phoneData = userOnboardingFlowContract$State.f101654b;
        }
        if ((i & 4) != 0) {
            address = userOnboardingFlowContract$State.f101655c;
        }
        userOnboardingFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(address, "address");
        return new UserOnboardingFlowContract$State(str, phoneData, address);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UserOnboardingFlowContract$State)) {
            return false;
        }
        UserOnboardingFlowContract$State userOnboardingFlowContract$State = (UserOnboardingFlowContract$State) obj2;
        return Intrinsics.f(this.f101653a, userOnboardingFlowContract$State.f101653a) && Intrinsics.f(this.f101654b, userOnboardingFlowContract$State.f101654b) && Intrinsics.f(this.f101655c, userOnboardingFlowContract$State.f101655c);
    }

    public final int hashCode() {
        String str = this.f101653a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        PhoneData phoneData = this.f101654b;
        return this.f101655c.hashCode() + ((iHashCode + (phoneData != null ? phoneData.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101653a);
        PhoneData phoneData = this.f101654b;
        if (phoneData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            phoneData.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f101655c, i);
    }
}
