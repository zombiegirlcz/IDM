package com.revolut.feature.address.common.api.flow;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/address/common/api/flow/AddressFlowUseCase;", "Landroid/os/Parcelable;", "Default", "BusinessDefault", "RetailExclusiveStoreCheckout", "BusinessOperatingAddress", "BusinessUsOperatingAddress", "BusinessCounterparty", "Lcom/revolut/feature/address/common/api/flow/AddressFlowUseCase$BusinessCounterparty;", "Lcom/revolut/feature/address/common/api/flow/AddressFlowUseCase$BusinessDefault;", "Lcom/revolut/feature/address/common/api/flow/AddressFlowUseCase$BusinessOperatingAddress;", "Lcom/revolut/feature/address/common/api/flow/AddressFlowUseCase$BusinessUsOperatingAddress;", "Lcom/revolut/feature/address/common/api/flow/AddressFlowUseCase$Default;", "Lcom/revolut/feature/address/common/api/flow/AddressFlowUseCase$RetailExclusiveStoreCheckout;", "feature_address_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AddressFlowUseCase extends Parcelable {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/address/common/api/flow/AddressFlowUseCase$BusinessCounterparty;", "Lcom/revolut/feature/address/common/api/flow/AddressFlowUseCase;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_address_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BusinessCounterparty implements AddressFlowUseCase {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BusinessCounterparty f60945a = new BusinessCounterparty();

        @NotNull
        public static final Parcelable.Creator<BusinessCounterparty> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BusinessCounterparty.f60945a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BusinessCounterparty[i];
            }
        }

        private BusinessCounterparty() {
        }

        @Override // com.revolut.feature.address.common.api.flow.AddressFlowUseCase
        public final boolean M5() {
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.address.common.api.flow.AddressFlowUseCase
        public final boolean e6() {
            return false;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof BusinessCounterparty);
        }

        public final int hashCode() {
            return 1847844652;
        }

        @Override // com.revolut.feature.address.common.api.flow.AddressFlowUseCase
        public final boolean s9() {
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/address/common/api/flow/AddressFlowUseCase$BusinessDefault;", "Lcom/revolut/feature/address/common/api/flow/AddressFlowUseCase;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_address_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BusinessDefault implements AddressFlowUseCase {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BusinessDefault f60946a = new BusinessDefault();

        @NotNull
        public static final Parcelable.Creator<BusinessDefault> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BusinessDefault.f60946a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BusinessDefault[i];
            }
        }

        private BusinessDefault() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof BusinessDefault);
        }

        public final int hashCode() {
            return -1798526913;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/address/common/api/flow/AddressFlowUseCase$BusinessOperatingAddress;", "Lcom/revolut/feature/address/common/api/flow/AddressFlowUseCase;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_address_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BusinessOperatingAddress implements AddressFlowUseCase {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BusinessOperatingAddress f60947a = new BusinessOperatingAddress();

        @NotNull
        public static final Parcelable.Creator<BusinessOperatingAddress> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BusinessOperatingAddress.f60947a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BusinessOperatingAddress[i];
            }
        }

        private BusinessOperatingAddress() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof BusinessOperatingAddress);
        }

        public final int hashCode() {
            return 293121845;
        }

        @Override // com.revolut.feature.address.common.api.flow.AddressFlowUseCase
        public final boolean s9() {
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/address/common/api/flow/AddressFlowUseCase$BusinessUsOperatingAddress;", "Lcom/revolut/feature/address/common/api/flow/AddressFlowUseCase;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_address_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BusinessUsOperatingAddress implements AddressFlowUseCase {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final BusinessUsOperatingAddress f60948a = new BusinessUsOperatingAddress();

        @NotNull
        public static final Parcelable.Creator<BusinessUsOperatingAddress> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BusinessUsOperatingAddress.f60948a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BusinessUsOperatingAddress[i];
            }
        }

        private BusinessUsOperatingAddress() {
        }

        @Override // com.revolut.feature.address.common.api.flow.AddressFlowUseCase
        public final boolean M5() {
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.address.common.api.flow.AddressFlowUseCase
        public final boolean e6() {
            return false;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof BusinessUsOperatingAddress);
        }

        public final int hashCode() {
            return -733733517;
        }

        @Override // com.revolut.feature.address.common.api.flow.AddressFlowUseCase
        public final boolean s9() {
            return true;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/address/common/api/flow/AddressFlowUseCase$Default;", "Lcom/revolut/feature/address/common/api/flow/AddressFlowUseCase;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_address_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Default implements AddressFlowUseCase {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Default f60949a = new Default();

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Default.f60949a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        private Default() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof Default);
        }

        public final int hashCode() {
            return 1533199903;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/address/common/api/flow/AddressFlowUseCase$RetailExclusiveStoreCheckout;", "Lcom/revolut/feature/address/common/api/flow/AddressFlowUseCase;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_address_common_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RetailExclusiveStoreCheckout implements AddressFlowUseCase {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RetailExclusiveStoreCheckout f60950a = new RetailExclusiveStoreCheckout();

        @NotNull
        public static final Parcelable.Creator<RetailExclusiveStoreCheckout> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RetailExclusiveStoreCheckout.f60950a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RetailExclusiveStoreCheckout[i];
            }
        }

        private RetailExclusiveStoreCheckout() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof RetailExclusiveStoreCheckout);
        }

        public final int hashCode() {
            return -687748338;
        }

        @Override // com.revolut.feature.address.common.api.flow.AddressFlowUseCase
        public final boolean i1() {
            return false;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    default boolean M5() {
        return false;
    }

    default boolean e6() {
        return true;
    }

    default boolean i1() {
        return true;
    }

    default boolean s9() {
        return false;
    }
}
