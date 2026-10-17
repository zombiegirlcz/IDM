package com.revolut.feature.revolutpay.shipping.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/revolutpay/shipping/api/navigation/ShippingContactsScreenDescriptor$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "ModeConfiguration", "feature_revolut_pay_shipping_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShippingContactsScreenDescriptor$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ShippingContactsScreenDescriptor$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModeConfiguration f84743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f84745c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/revolutpay/shipping/api/navigation/ShippingContactsScreenDescriptor$InputData$ModeConfiguration;", "Landroid/os/Parcelable;", "SelectContact", "UpdatedDefaultContact", "Lcom/revolut/feature/revolutpay/shipping/api/navigation/ShippingContactsScreenDescriptor$InputData$ModeConfiguration$SelectContact;", "Lcom/revolut/feature/revolutpay/shipping/api/navigation/ShippingContactsScreenDescriptor$InputData$ModeConfiguration$UpdatedDefaultContact;", "feature_revolut_pay_shipping_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface ModeConfiguration extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/shipping/api/navigation/ShippingContactsScreenDescriptor$InputData$ModeConfiguration$SelectContact;", "Lcom/revolut/feature/revolutpay/shipping/api/navigation/ShippingContactsScreenDescriptor$InputData$ModeConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shipping_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SelectContact implements ModeConfiguration {

            @NotNull
            public static final Parcelable.Creator<SelectContact> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f84746a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SelectContact(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SelectContact[i];
                }
            }

            public SelectContact(String orderToken) {
                Intrinsics.checkNotNullParameter(orderToken, "orderToken");
                this.f84746a = orderToken;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof SelectContact) && Intrinsics.f(this.f84746a, ((SelectContact) obj2).f84746a);
            }

            public final int hashCode() {
                return this.f84746a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f84746a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/shipping/api/navigation/ShippingContactsScreenDescriptor$InputData$ModeConfiguration$UpdatedDefaultContact;", "Lcom/revolut/feature/revolutpay/shipping/api/navigation/ShippingContactsScreenDescriptor$InputData$ModeConfiguration;", "<init>", "()V", "feature_revolut_pay_shipping_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class UpdatedDefaultContact implements ModeConfiguration {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final UpdatedDefaultContact f84747a = new UpdatedDefaultContact();

            @NotNull
            public static final Parcelable.Creator<UpdatedDefaultContact> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return UpdatedDefaultContact.f84747a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new UpdatedDefaultContact[i];
                }
            }

            private UpdatedDefaultContact() {
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
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShippingContactsScreenDescriptor$InputData((ModeConfiguration) parcel.readParcelable(ShippingContactsScreenDescriptor$InputData.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShippingContactsScreenDescriptor$InputData[i];
        }
    }

    public ShippingContactsScreenDescriptor$InputData(ModeConfiguration configuration, String str, boolean z) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f84743a = configuration;
        this.f84744b = str;
        this.f84745c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShippingContactsScreenDescriptor$InputData)) {
            return false;
        }
        ShippingContactsScreenDescriptor$InputData shippingContactsScreenDescriptor$InputData = (ShippingContactsScreenDescriptor$InputData) obj2;
        return Intrinsics.f(this.f84743a, shippingContactsScreenDescriptor$InputData.f84743a) && Intrinsics.f(this.f84744b, shippingContactsScreenDescriptor$InputData.f84744b) && this.f84745c == shippingContactsScreenDescriptor$InputData.f84745c;
    }

    public final int hashCode() {
        int iHashCode = this.f84743a.hashCode() * 31;
        String str = this.f84744b;
        return Boolean.hashCode(this.f84745c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f84743a, i);
        dest.writeString(this.f84744b);
        dest.writeInt(this.f84745c ? 1 : 0);
    }
}
