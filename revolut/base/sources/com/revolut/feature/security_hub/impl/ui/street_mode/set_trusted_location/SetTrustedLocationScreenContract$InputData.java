package com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.security_hub.api.models.StreetModeTrustedLocation;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/security_hub/impl/ui/street_mode/set_trusted_location/SetTrustedLocationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "SetTrustedLocation", "SetTrustedWifiLocation", "EditTrustedLocation", "Lcom/revolut/feature/security_hub/impl/ui/street_mode/set_trusted_location/SetTrustedLocationScreenContract$InputData$EditTrustedLocation;", "Lcom/revolut/feature/security_hub/impl/ui/street_mode/set_trusted_location/SetTrustedLocationScreenContract$InputData$SetTrustedLocation;", "Lcom/revolut/feature/security_hub/impl/ui/street_mode/set_trusted_location/SetTrustedLocationScreenContract$InputData$SetTrustedWifiLocation;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SetTrustedLocationScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/street_mode/set_trusted_location/SetTrustedLocationScreenContract$InputData$EditTrustedLocation;", "Lcom/revolut/feature/security_hub/impl/ui/street_mode/set_trusted_location/SetTrustedLocationScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditTrustedLocation implements SetTrustedLocationScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<EditTrustedLocation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StreetModeTrustedLocation f85681a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditTrustedLocation((StreetModeTrustedLocation) parcel.readParcelable(EditTrustedLocation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditTrustedLocation[i];
            }
        }

        public EditTrustedLocation(StreetModeTrustedLocation trustedLocation) {
            Intrinsics.checkNotNullParameter(trustedLocation, "trustedLocation");
            this.f85681a = trustedLocation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EditTrustedLocation) && Intrinsics.f(this.f85681a, ((EditTrustedLocation) obj2).f85681a);
        }

        public final int hashCode() {
            return this.f85681a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f85681a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/street_mode/set_trusted_location/SetTrustedLocationScreenContract$InputData$SetTrustedLocation;", "Lcom/revolut/feature/security_hub/impl/ui/street_mode/set_trusted_location/SetTrustedLocationScreenContract$InputData;", "<init>", "()V", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SetTrustedLocation implements SetTrustedLocationScreenContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SetTrustedLocation f85682a = new SetTrustedLocation();

        @NotNull
        public static final Parcelable.Creator<SetTrustedLocation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SetTrustedLocation.f85682a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetTrustedLocation[i];
            }
        }

        private SetTrustedLocation() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/street_mode/set_trusted_location/SetTrustedLocationScreenContract$InputData$SetTrustedWifiLocation;", "Lcom/revolut/feature/security_hub/impl/ui/street_mode/set_trusted_location/SetTrustedLocationScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetTrustedWifiLocation implements SetTrustedLocationScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<SetTrustedWifiLocation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85683a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SetTrustedWifiLocation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetTrustedWifiLocation[i];
            }
        }

        public SetTrustedWifiLocation(String ssid) {
            Intrinsics.checkNotNullParameter(ssid, "ssid");
            this.f85683a = ssid;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SetTrustedWifiLocation) && Intrinsics.f(this.f85683a, ((SetTrustedWifiLocation) obj2).f85683a);
        }

        public final int hashCode() {
            return this.f85683a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85683a);
        }
    }
}
